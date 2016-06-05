package swiftanalysis.listeners;

import swiftanalysis.generated.SwiftBaseListener;
import swiftanalysis.generated.SwiftParser;
import swiftanalysis.generated.SwiftParser.ConditionClauseContext;
import swiftanalysis.generated.SwiftParser.PatternInitializerContext;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.HashMap;
import java.util.Map;


/**
 * Collects basic metrics.
 */
public class MscrMetricsListener extends SwiftBaseListener {

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

	// This map hold the amount of optional chaining calls before the actual call.
	// e.g.: window? -> 0, window.view? -> 0, window.view?.layer? -> 1
	private static Map<String, Integer> optionalChainingCallDepthMap = new HashMap<String, Integer>();



	public MscrMetricsListener() {
		//empty constructor
	}

	@Override
	public void enterTryOperator(SwiftParser.TryOperatorContext ctx) {

		String tryText = ctx.getText();

		if (tryText.equals("try")) {
			tryCounter++;
		} else if (tryText.equals("try!")) {
			forcedTryCounter++;
		} else if (tryText.equals("try?")) {
			optionalTryCounter++;
		}
	}

	@Override
	public void enterConditionClause(ConditionClauseContext ctx) {

		if (containsNilCheck(ctx)) {
			equalsNilCounter++;
		}
	}

	@Override public void enterIfStatement(SwiftParser.IfStatementContext ctx) { 

		ifCounter++;

		ConditionClauseContext conditionClause = ctx.conditionClause();

		if (conditionClause.getText().startsWith("let")) {
			ifLetCounter++;
		}

		if (containsNilCheck(conditionClause)){
			ifWithNilCheckCounter++;
		}
	}

	@Override public void enterGuardStatement(SwiftParser.GuardStatementContext ctx) { 

		guardCounter++;

		ConditionClauseContext conditionClause = ctx.conditionClause();

		if (conditionClause.getText().startsWith("let")) {
			guardLetCounter++;
		}

		if (containsNilCheck(conditionClause)){
			guardWithNilCheckCounter++;
		}
	}

	@Override public void enterOptionalChainingExpression(SwiftParser.OptionalChainingExpressionContext ctx) {

		optionalChainingCounter++;

		String optionalChainingText = ctx.getText();

		int callDepth = countOccurrences(optionalChainingText,'.');
		int chainingCallDepth = countOccurrences(optionalChainingText,'?') - 1;

		checkAndAdd(optionalChainingObjectCallDepthMap, Integer.toString(callDepth));
		checkAndAdd(optionalChainingCallDepthMap, Integer.toString(chainingCallDepth));
	}

	@Override public void enterForcedValueExpression(SwiftParser.ForcedValueExpressionContext ctx) {
		forcedUnwrappingsCounter++;
	}

	@Override 
	public void enterSType(SwiftParser.STypeContext ctx) { 

		String type = ctx.getText();

		if (ctx.children.size() == 2) {
			ParseTree secondChild = ctx.getChild(1);
			if (secondChild.getText().equals("!")) {
				checkAndAdd(forcedTypeMap, type);
			} else if (secondChild.getText().equals("?")) {
				checkAndAdd(optionalTypeMap, type);
			} else if (secondChild.getText().equals("throws")) {
				throwsCounter++;
			} else if (secondChild.getText().equals("rethrows")) {
				rethrowsCounter++;
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
		} else if (secondChild.getText().equals("?")) {
			optionalTypeCastingCounter++;
		}
	}

	@Override 
	public void enterOperator(SwiftParser.OperatorContext ctx) {
		if (ctx.getText().equals("??")) {
			nilCoalescingCounter++;
		}
	}

	@Override 
	public void enterDoStatement(SwiftParser.DoStatementContext ctx) {
		doBlockCounter++;
	}

	@Override 
	public void enterCatchClause(SwiftParser.CatchClauseContext ctx) {
		catchCounter++;
	}

	@Override 
	public void enterThrowStatement(SwiftParser.ThrowStatementContext ctx) {
		throwCounter++;
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

	private static int countOccurrences(String input, char c)
	{
		int count = 0;
		for (int i=0; i < input.length(); i++)
		{
			if (input.charAt(i) == c) { count++; }
		}
		return count;
	}

	/**
	 * Returns the last token of the construct represented by node.
	 *
	 * @param node A node
	 * @return Stop token
	 */
	public static Token getStopTokenForNode(ParseTree node) {
		if (node instanceof TerminalNodeImpl) {
			return ((TerminalNodeImpl) node).getSymbol();
		} else {
			return ((ParserRuleContext) node).getStop();
		}
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

		System.out.println("Do Blocks: "+ doBlockCounter); //OK
		System.out.println("Try: "+ tryCounter); //OK
		System.out.println("Try?: "+ optionalTryCounter); //OK
		System.out.println("Try!: "+ forcedTryCounter); //OK
		System.out.println("Throw: "+ throwCounter); //OK
		System.out.println("Throws: "+ throwsCounter); //OK
		System.out.println("Rethrows: "+ rethrowsCounter); //OK
		System.out.println("Catch: "+ catchCounter); //OK

		Map<String, Integer> fixedMap = removeDuplicatedValues(removeDuplicatedValues(typeMap, optionalTypeMap), forcedTypeMap);

		System.out.println("Normal types : "+ fixedMap.size());
		System.out.println("Optional Types: "+ optionalTypeMap.size()); //OK
		System.out.println("Implicit Unwrapped Types: "+ forcedTypeMap.size()); //OK

	}


}
