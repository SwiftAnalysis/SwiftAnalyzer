package swiftanalysis.listeners;

import swiftanalysis.analyzers.util.ListenerUtil;
import swiftanalysis.generated.SwiftBaseListener;
import swiftanalysis.generated.SwiftParser;
import swiftanalysis.generated.SwiftParser.*;
import swiftanalysis.output.MetricType;
import swiftanalysis.output.Printer;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * Collects basic metrics.
 */
public class MscrMetricsListener extends SwiftBaseListener {

	private Printer printer;
	
	private static int ifCounter = 0;
	private static int ifWithNilCheckCounter = 0;
	private static int ifLetCounter = 0;
	private static int guardCounter = 0;
	private static int guardWithNilCheckCounter = 0;
	private static int guardLetCounter = 0;
	private static int nilCoalescingCounter = 0;
	private static int equalsNilCounter = 0;
	private static int optionalChainingCounter = 0;
	private static int forcedUnwrappingsCounter = 0;

	private static int forcedTypeCastingCounter = 0;
	private static int optionalTypeCastingCounter = 0;

	private static int doBlockCounter = 0;
	private static int tryCounter = 0;
	private static int optionalTryCounter = 0;
	private static int forcedTryCounter = 0;
	private static int throwCounter = 0;
	private static int throwsCounter = 0;
	private static int rethrowsCounter = 0;
	
	private static int catchCounter = 0;
	private static int catchEmptyBlockCounter = 0;
	private static int catchChecksTypeCounter = 0;
	private static int catchChecksValueCounter = 0;
	private static int genericCatchCounter = 0;
	private static int genericCatchEmptyBlockCounter = 0;
	private static int whereClauseInCatchCounter = 0;
	private static int printCatch = 0;
	
	private static int implicitVariableDeclarationsCounter = 0;
	private static int explicitVariableDeclarationsCounter = 0;
	private static int implicitConstantDeclarationsCounter = 0;
	private static int explicitConstantDeclarationsCounter = 0;

	private static Map<String, Integer> typeMap = new HashMap<String, Integer>();
	private static Map<String, Integer> optionalTypeMap = new HashMap<String, Integer>();
	private static Map<String, Integer> forcedTypeMap = new HashMap<String, Integer>();

	// This map holds the depth of the objects receiving an optional chaining call.
	// e.g.: window? -> 0, window.view? -> 1, window.view.layer? -> 2
	private static Map<String, Integer> optionalChainingObjectCallDepthMap = new HashMap<String, Integer>();

	// This map holds the amount of optional chaining calls before the actual call.
	// e.g.: window? -> 0, window.view? -> 0, window.view?.layer? -> 1
	private static Map<String, Integer> optionalChainingCallDepthMap = new HashMap<String, Integer>();

	// This map holds the amount catches present at a do block.
	private static Map<String, Integer> doCatchBlocksMap = new HashMap<String, Integer>();
	private static Map<String, Integer> genericCatchBlockLengthMap = new HashMap<String, Integer>();
	private static Map<String, Integer> catchBlockLengthMap = new HashMap<String, Integer>();
	private static Map<String, Integer> catchErrorTypeMap = new HashMap<String, Integer>();

	private static Set<String> printFunctionNames = new HashSet<>(Arrays.asList("print", "println", "NSLog"));

	public MscrMetricsListener(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void enterTryOperator(SwiftParser.TryOperatorContext ctx) {

		String tryText = ctx.getText();

		if (tryText.equals("try")) {
			tryCounter++;
			printer.addToPrinting(MetricType.TRY, ListenerUtil.getContextStartLocation(ctx), "");
		} else if (tryText.equals("try!")) {
			forcedTryCounter++;
			printer.addToPrinting(MetricType.FORCED_TRY, ListenerUtil.getContextStartLocation(ctx), "");
		} else if (tryText.equals("try?")) {
			optionalTryCounter++;
			printer.addToPrinting(MetricType.OPTIONAL_TRY, ListenerUtil.getContextStartLocation(ctx), "");
		}
	}

	@Override
	public void enterConditionClause(ConditionClauseContext ctx) {

		if (containsNilCheck(ctx)) {
			equalsNilCounter++;
			printer.addToPrinting(MetricType.EQUALS_NIL, ListenerUtil.getContextStartLocation(ctx), "");
		}
	}

	@Override public void enterIfStatement(SwiftParser.IfStatementContext ctx) { 

		ifCounter++;
		printer.addToPrinting(MetricType.IF, ListenerUtil.getContextStartLocation(ctx), "");
		
		ConditionClauseContext conditionClause = ctx.conditionClause();

		if (conditionClause.getText().startsWith("let")) {
			ifLetCounter++;
			printer.addToPrinting(MetricType.IF_LET, ListenerUtil.getContextStartLocation(ctx), "");
		}

		if (containsNilCheck(conditionClause)){
			ifWithNilCheckCounter++;
			printer.addToPrinting(MetricType.IF_WITH_NIL_CHECK, ListenerUtil.getContextStartLocation(ctx), "");
		}
	}

	@Override public void enterGuardStatement(SwiftParser.GuardStatementContext ctx) { 

		guardCounter++;
		printer.addToPrinting(MetricType.GUARD, ListenerUtil.getContextStartLocation(ctx), "");
		
		ConditionClauseContext conditionClause = ctx.conditionClause();

		if (conditionClause.getText().startsWith("let")) {
			guardLetCounter++;
			printer.addToPrinting(MetricType.GUARD_LET, ListenerUtil.getContextStartLocation(ctx), "");
		}

		if (containsNilCheck(conditionClause)){
			guardWithNilCheckCounter++;
			printer.addToPrinting(MetricType.GUARD_WITH_NIL_CHECK, ListenerUtil.getContextStartLocation(ctx), "");
		}
	}

	@Override public void enterOptionalChainingExpression(SwiftParser.OptionalChainingExpressionContext ctx) {

		optionalChainingCounter++;
		printer.addToPrinting(MetricType.OPTIONAL_CHAINING, ListenerUtil.getContextStartLocation(ctx), "");
		
		String optionalChainingText = ctx.getText();

		int callDepth = countOccurrences(optionalChainingText,".");
		int chainingCallDepth = countOccurrences(optionalChainingText,"?") - 1;

		checkAndAdd(optionalChainingObjectCallDepthMap, Integer.toString(callDepth));
		checkAndAdd(optionalChainingCallDepthMap, Integer.toString(chainingCallDepth));
	}

	@Override public void enterForcedValueExpression(SwiftParser.ForcedValueExpressionContext ctx) {
		forcedUnwrappingsCounter++;
		printer.addToPrinting(MetricType.FORCED_UNWRAPPING, ListenerUtil.getContextStartLocation(ctx), "");
	}

	@Override 
	public void enterSType(SwiftParser.STypeContext ctx) { 

		String type = ctx.getText();
		
		if (ctx.children != null && ctx.children.size() >= 2) {
			ParseTree secondChild = ctx.getChild(1);
			if (secondChild.getText().equals("!")) {
				checkAndAdd(forcedTypeMap, type);
			} else if (secondChild.getText().equals("?")) {
				checkAndAdd(optionalTypeMap, type);
			} 
		} else {
			checkAndAdd(typeMap, type);
		}
	}

	@Override
	public void enterTypeCastingOperator(SwiftParser.TypeCastingOperatorContext ctx) {

		ParseTree secondChild = ctx.getChild(1);

		if (secondChild.getText().equals("!")) {
			forcedTypeCastingCounter++;
			printer.addToPrinting(MetricType.FORCED_TYPE_CASTING, ListenerUtil.getContextStartLocation(ctx), "");
		} else if (secondChild.getText().equals("?")) {
			optionalTypeCastingCounter++;
			printer.addToPrinting(MetricType.OPTIONAL_TYPE_CASTING, ListenerUtil.getContextStartLocation(ctx), "");
		}
	}

	@Override 
	public void enterOperator(SwiftParser.OperatorContext ctx) {
		if (ctx.getText().equals("??")) {
			nilCoalescingCounter++;
			printer.addToPrinting(MetricType.NIL_COALESCING, ListenerUtil.getContextStartLocation(ctx), "");
		}
	}

	@Override 
	public void enterDoStatement(SwiftParser.DoStatementContext ctx) {
		
		//Grammar: doStatement: 'do' codeBlock catchClauses? ;
		
		int numberOfCatches = 0;
		if (ctx.catchClauses() != null) {
			String catchesStr = ctx.catchClauses().getText();
			numberOfCatches = countOccurrences(catchesStr, "catch");	
		}
		
		checkAndAdd(doCatchBlocksMap, Integer.toString(numberOfCatches));
		doBlockCounter++;
		printer.addToPrinting(MetricType.DO_BLOCK, ListenerUtil.getContextStartLocation(ctx), "Catches: "+numberOfCatches);
	}

	@Override 
	public void enterCatchClause(SwiftParser.CatchClauseContext ctx) {
		//grammar catchClause: 'catch' pattern? whereClause? codeBlock ;
		
		boolean isGeneric = false;
		CodeBlockContext catchBlock = ctx.codeBlock();
		int blockLength = ListenerUtil.getContextStopLocation(catchBlock).line - ListenerUtil.getContextStartLocation(catchBlock).line;
		boolean containsCast = ctx.pattern() == null ? false : containsTypeCast(ctx.pattern());
		
		if (ctx.pattern() == null || 
				ctx.pattern().getText().equals("_") ||
				ctx.pattern().getText().equals("ErrorType") ||
				(ctx.pattern().getChild(0) instanceof SwiftParser.ValueBindingPatternContext && !containsCast ))
		{
	
			isGeneric = true;
		} 
		
		if (isGeneric) {
			genericCatchCounter++;
			checkAndAdd(genericCatchBlockLengthMap, Integer.toString(blockLength));
			
			String decl = ctx.getText().replace(ctx.codeBlock().getText(), "");
			
			printer.addToPrinting(MetricType.GENERIC_CATCH, ListenerUtil.getContextStartLocation(ctx), "{Declaration: "+ decl +"}");
		
			if (catchBlock.getText().equals("{}")){
				genericCatchEmptyBlockCounter++;
			}
		
		} else {
			
			catchCounter++;
			checkAndAdd(catchBlockLengthMap, Integer.toString(blockLength));
			
			if (catchBlock.getText().equals("{}")){
				catchEmptyBlockCounter++;
			}
			
			String catchValueType = "";
			if (containsCast || ctx.pattern().getText().startsWith("is")) {
				catchChecksTypeCounter++;
				catchValueType = "type";
				checkAndAdd(catchErrorTypeMap, getFirstTypeIdentifier(ctx.pattern()));

			} else {
				catchChecksValueCounter++;
				catchValueType = "value";
			}
			
			String decl = ctx.getText().replace(ctx.codeBlock().getText(), "");
			printer.addToPrinting(MetricType.CATCH, ListenerUtil.getContextStartLocation(ctx), 
					"{Length: "+blockLength +", Checks: "+catchValueType+ ", Declaration: "+ decl +"}");
			
			//System.out.println(catchValueType + ": "+ctx.getText().replace(ctx.codeBlock().getText(), ""));
		}
		
		if (ctx.whereClause() != null) {
			whereClauseInCatchCounter++;
			printer.addToPrinting(MetricType.WHERE_CLAUSE, ListenerUtil.getContextStartLocation(ctx), "Length: "+blockLength);
		} 

		if (containsOnlyFunctionCalls(catchBlock, printFunctionNames)) {
			printCatch++;
			printer.addToPrinting(MetricType.PRINT_CATCH, ListenerUtil.getContextStartLocation(ctx), catchBlock.getText());
		}
	}

	private boolean containsOnlyFunctionCalls(CodeBlockContext catchBlock, Set<String> functionNames) {
		return catchBlock.statements() != null
				&& catchBlock.statements().statement().stream().allMatch(statement -> isFunctionCall(statement, functionNames));
	}

	private boolean isFunctionCall(StatementContext statement, Set<String> functionNames) {
		ExpressionContext expression = statement.expression();
		if (expression != null) {
			PrefixExpressionContext prefix = expression.prefixExpression();
			if (prefix.getChildCount() == 1) {
				if (prefix.getChild(0) instanceof FunctionCallExpressionContext) {
					FunctionCallExpressionContext functionCall = (FunctionCallExpressionContext) prefix.getChild(0);
					String functionName = functionCall.getChild(0).getText();
					if (functionNames.contains(functionName)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	private boolean containsTypeCast(ParseTree tree) {
		
		if (tree.toString().equals("as")) {
			return true;
		} 
		
		int childCount = tree.getChildCount();
		boolean result = false;
		
		for (int i = 0; result == false && i< childCount; i++){
			result = containsTypeCast(tree.getChild(i));
		}
	
		return result;
	}

	private String getFirstTypeIdentifier(ParseTree tree) {
		
		if (tree instanceof SwiftParser.STypeContext) {
			return tree.getText();
		} 
		
		int childCount = tree.getChildCount();
		String result = "";
		
		for (int i = 0; result.equals("") && i< childCount; i++){
			result = getFirstTypeIdentifier(tree.getChild(i));
		}
	
		return result;
	}
	
	@Override 
	public void enterThrowStatement(SwiftParser.ThrowStatementContext ctx) {
		throwCounter++;
		printer.addToPrinting(MetricType.THROW, ListenerUtil.getContextStartLocation(ctx), "");
	}

	@Override 
	public void enterVariableDeclaration(SwiftParser.VariableDeclarationContext ctx) {

		if (ctx.patternInitializerList() != null && ctx.patternInitializerList().patternInitializer() != null){
			for (PatternInitializerContext child : ctx.patternInitializerList().patternInitializer()) {
				if (child.pattern().typeAnnotation() != null) {
					if (child.pattern().typeAnnotation().getText().startsWith(":")) {
						explicitVariableDeclarationsCounter++;
					} else {
						implicitVariableDeclarationsCounter++;
					}
				} else {
					implicitVariableDeclarationsCounter++;
				}
			}
		} else if (ctx.typeAnnotation() != null){
			if (ctx.typeAnnotation().getText().startsWith(":")) {
				explicitVariableDeclarationsCounter++;
			} else {
				implicitVariableDeclarationsCounter++;
			}
		} else {
			implicitVariableDeclarationsCounter++;
		}
	}

	@Override public void enterProtocolInitializerDeclaration(SwiftParser.ProtocolInitializerDeclarationContext ctx) {
		checkForThrowsAndRethrows(ctx);
	}
	
	@Override public void enterInitializerDeclaration(SwiftParser.InitializerDeclarationContext ctx) {
		checkForThrowsAndRethrows(ctx);
	}
	
	@Override public void enterFunctionSignature(SwiftParser.FunctionSignatureContext ctx) {
		checkForThrowsAndRethrows(ctx);
	}
	
	private void checkForThrowsAndRethrows(ParserRuleContext ctx) {
		
		String signature = ctx.getText();
		
		if (ctx instanceof SwiftParser.InitializerDeclarationContext){
			String body = ((SwiftParser.InitializerDeclarationContext) ctx).initializerBody().getText();
			signature = signature.replace(body, "");
		}
		
		if (signature.contains("rethrows")) {
			rethrowsCounter++;
			printer.addToPrinting(MetricType.RETHROWS, ListenerUtil.getContextStartLocation(ctx), signature);
		}
		
		String auxSignature = signature.replaceAll("rethrows", "");
		
		if (auxSignature.contains("throws")) {
			
			Pattern pattern = Pattern.compile("throws");
			Matcher matcher = pattern.matcher(auxSignature);
	
		    int pos = 0;
		    while (matcher.find(pos))
		    {
		    	pos = matcher.start() + 1;
		    	
		    	throwsCounter++;
				printer.addToPrinting(MetricType.THROWS, ListenerUtil.getContextStartLocation(ctx), signature);
		    }
		}
	}
	
	@Override 
	public void enterConstantDeclaration(SwiftParser.ConstantDeclarationContext ctx) {

		if (ctx.patternInitializerList() != null && ctx.patternInitializerList().patternInitializer() != null){
			for (PatternInitializerContext child : ctx.patternInitializerList().patternInitializer()) {
				if (child.pattern().typeAnnotation() != null) {
					if (child.pattern().typeAnnotation().getText().startsWith(":")) {
						explicitConstantDeclarationsCounter++;
					} else {
						implicitConstantDeclarationsCounter++;
					}
				} else {
					implicitConstantDeclarationsCounter++;
				}
			}
		} 
	}

	private static void checkAndAdd(Map<String, Integer> map, String key){

		Integer value = map.get(key);
		if (value == null) {
			map.put(key, 1);
		} else {
			map.put(key, value+1);
		}
	}

	/**
	 * Checks if a ConditionClause contains a nil check (==nil or != nil).
	 * @param ctx The ConditionClauseContext to be checked.
	 * @return True if the ConditionClause contains the nil check, False otherwise.
	 */
	private static boolean containsNilCheck (ConditionClauseContext ctx) {

		String conditionClauseText = ctx.getText();

		if (conditionClauseText.contains("==nil") || 
				conditionClauseText.contains("!=nil") ||
				conditionClauseText.contains("nil==") ||
				conditionClauseText.contains("nil!=")) {
			return true;
		}

		return false;
	}
	/**
	 * This method is used because, when adding a an Optional Type
	 * or a ForcedType, a duplicate of the type is also added to 
	 * the TypeMap array. 
	 * 
	 * @param map1
	 * @param map2
	 * @return
	 */
	private static Map<String, Integer> removeDuplicatedValues(Map<String, Integer> map1, Map<String, Integer> map2) {

		Map<String, Integer> output = new HashMap<String, Integer>(map1);

		for (String key : map2.keySet()) {

			String typeName = key.substring(0, key.length()-1);

			if (output.containsKey(typeName)) {
				if (map2.get(key) >= output.get(typeName)) {
					output.remove(typeName);
				} else {
					int newValue = output.get(typeName) - map2.get(key);
					output.put(typeName, newValue);
				}
			}
		}

		return output;
	}

	private static int countOccurrences (String str, String substring){
		return (str.length() - str.replace(substring, "").length()) / substring.length();
	}

	public static void printSummary() {

		System.out.println("If: "+ ifCounter); //OK
		System.out.println("If Let: "+ ifLetCounter); //OK
		System.out.println("If with null check: "+ ifWithNilCheckCounter); //OK

		System.out.println("Guard: "+ guardCounter); //OK
		System.out.println("Guard Let: "+ guardLetCounter); //OK
		System.out.println("Guard with null check: "+ guardWithNilCheckCounter); //OK

		System.out.println("Optional Chaining: "+ optionalChainingCounter); //OK
		System.out.println("Optional Chaining Object Depth: "+ optionalChainingObjectCallDepthMap.toString()); //OK
		System.out.println("Optional Chaining Call Depth: "+ optionalChainingCallDepthMap.toString()); //OK

		System.out.println("Forced Unwrapping: "+ forcedUnwrappingsCounter); //OK
		System.out.println("== nil, != nil: "+ equalsNilCounter); //OK
		System.out.println("??: "+ nilCoalescingCounter); //OK

		System.out.println("as?: "+ optionalTypeCastingCounter); //OK
		System.out.println("as!: "+ forcedTypeCastingCounter); //OK

		System.out.println("Implicit Variable Declarations: "+ implicitVariableDeclarationsCounter); //OK
		System.out.println("Explicit Variable Declarations: "+ explicitVariableDeclarationsCounter); //OK
		System.out.println("Implicit Constant Declarations: "+ implicitConstantDeclarationsCounter); //OK
		System.out.println("Explicit Constant Declarations: "+ explicitConstantDeclarationsCounter); //OK

		System.out.println("Do Blocks: "+ doBlockCounter +" Distribution: "+doCatchBlocksMap.toString()); //OK
		System.out.println("Try: "+ tryCounter); //OK
		System.out.println("Try?: "+ optionalTryCounter); //OK
		System.out.println("Try!: "+ forcedTryCounter); //OK
		System.out.println("Throw: "+ throwCounter); //OK
		System.out.println("Throws: "+ throwsCounter); //OK
		System.out.println("Rethrows: "+ rethrowsCounter); //OK
		
		System.out.println("Generic Catch: "+ genericCatchCounter +" Empty block: "+ genericCatchEmptyBlockCounter + " " +genericCatchBlockLengthMap); //O
		System.out.println("Catch with declaration: "+ catchCounter +" Empty block: "+ catchEmptyBlockCounter + " " +catchBlockLengthMap); //OK
		System.out.println("Catch verifies Type:" + catchChecksTypeCounter +" Error types: "+catchErrorTypeMap); //OK
		System.out.println("Catch verifies Value:" + catchChecksValueCounter); //OK

		System.out.println("Where Clause In Catch: "+ whereClauseInCatchCounter); //OK
		System.out.println("Only Print In Catch: "+ printCatch);

		Map<String, Integer> fixedMap = removeDuplicatedValues(removeDuplicatedValues(typeMap, optionalTypeMap), forcedTypeMap);

		System.out.println("Normal types : "+ fixedMap.size());
		System.out.println("Optional Types: "+ optionalTypeMap.size()); //OK
		System.out.println("Implicit Unwrapped Types: "+ forcedTypeMap.size()); //OK

	}


}
