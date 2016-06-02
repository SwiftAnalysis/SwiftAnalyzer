import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.Map;


/**
 * Parse tree listener for lower camel case checks.
 */
public class MscrMetricsListener extends SwiftBaseListener {

	private static int ifCounter = 0;
	private static int ifLetCounter = 0;
	private static int guardCounter = 0;
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

	private static Map<String, Integer> typeMap = new HashMap<String, Integer>();
	private static Map<String, Integer> optionalTypeMap = new HashMap<String, Integer>();
	private static Map<String, Integer> forcedTypeMap = new HashMap<String, Integer>();

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
	public void enterConditionClause(SwiftParser.ConditionClauseContext ctx) {

		if (ctx.getText().contains("==nil")) {
			equalsNilCounter++;
		} else if (ctx.getText().contains("!=nil")) {
			equalsNilCounter++;
		} else if (ctx.getText().contains("nil==")) {
			equalsNilCounter++;
		} else if (ctx.getText().contains("nil!=")) {
			equalsNilCounter++;
		}
	}

	@Override public void enterIfStatement(SwiftParser.IfStatementContext ctx) { 
		ifCounter++;

		if (ctx.conditionClause().getText().startsWith("let")) {
			ifLetCounter++;
		}
	}

	@Override public void enterGuardStatement(SwiftParser.GuardStatementContext ctx) { 
		guardCounter++;

		if (ctx.conditionClause().getText().startsWith("let")) {
			guardLetCounter++;
		}
	}
	
	@Override public void enterOptionalChainingExpression(SwiftParser.OptionalChainingExpressionContext ctx) {
		optionalChainingCounter++;
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
			// Location exclamationLocation = ListenerUtil.getParseTreeStartLocation(secondChild);
			forcedTypeCastingCounter++;
		} else if (secondChild.getText().equals("?")) {
			// Location exclamationLocation = ListenerUtil.getParseTreeStartLocation(secondChild);
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
	
	private static void checkAndAdd(Map<String, Integer> map, String key){
		
		Integer value = map.get(key);
		if (value == null) {
			map.put(key, 1);
		} else {
			map.put(key, value+1);
		}
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
	
	public static void printSummary() {

		System.out.println("If: "+ ifCounter); //OK
		System.out.println("If Let: "+ ifLetCounter); //OK

		System.out.println("Guard: "+ guardCounter); //OK
		System.out.println("Guard Let: "+ guardLetCounter); //OK

		System.out.println("Optional Chaining: "+ optionalChainingCounter); //OK
		System.out.println("Forced Unwrapping: "+ forcedUnwrappingsCounter); //OK
		System.out.println("== nil, != nil: "+ equalsNilCounter); //OK
		System.out.println("??: "+ nilCoalescingCounter); //OK

		System.out.println("as?: "+ optionalTypeCastingCounter); //OK
		System.out.println("as!: "+ forcedTypeCastingCounter); //OK

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
