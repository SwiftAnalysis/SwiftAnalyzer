package swiftanalysis.output;

public enum MetricType {
	IF,
	IF_LET, 
	IF_WITH_NIL_CHECK,
	GUARD,
	GUARD_WITH_NIL_CHECK,
	GUARD_LET,
	NIL_COALESCING,
	EQUALS_NIL,
	OPTIONAL_CHAINING,
	FORCED_UNWRAPPING,
	FORCED_TYPE_CASTING,
	OPTIONAL_TYPE_CASTING,
	DO_BLOCK,
	TRY,
	OPTIONAL_TRY,
	FORCED_TRY,
	THROW,
	THROWS,
	RETHROWS,
	CATCH 
	;
	
    private String name;
    
    public String getName() {
        return name;
    }

    static {
    	IF.name = "if";
    	IF_WITH_NIL_CHECK.name = "if_equals_nil";
    	IF_LET.name = "if_let";
    	GUARD.name = "guard";
    	GUARD_WITH_NIL_CHECK.name = "guard_equals_nil";
    	GUARD_LET.name = "guard_let";
    	NIL_COALESCING.name = "??";
    	EQUALS_NIL.name = "equals nil";
    	OPTIONAL_CHAINING.name = "optional_chaining";
    	FORCED_UNWRAPPING.name = "forced_unwrapping";
    	FORCED_TYPE_CASTING.name = "as!";
    	OPTIONAL_TYPE_CASTING.name = "as?";
    	DO_BLOCK.name = "do";
    	TRY.name = "try";
    	OPTIONAL_TRY.name = "try?";
    	FORCED_TRY.name = "try!";
    	THROW.name = "throw";
    	THROWS.name = "throws";
    	RETHROWS.name = "rethrows";
    	CATCH.name = "catch";
    }
}
