// Generated from Swift.g4 by ANTLR 4.5

package generated;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SwiftParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, T__47=48, T__48=49, T__49=50, T__50=51, T__51=52, 
		T__52=53, T__53=54, T__54=55, T__55=56, T__56=57, T__57=58, T__58=59, 
		T__59=60, T__60=61, T__61=62, T__62=63, T__63=64, T__64=65, T__65=66, 
		T__66=67, T__67=68, T__68=69, T__69=70, T__70=71, T__71=72, T__72=73, 
		T__73=74, T__74=75, T__75=76, T__76=77, T__77=78, T__78=79, T__79=80, 
		T__80=81, T__81=82, T__82=83, T__83=84, T__84=85, T__85=86, T__86=87, 
		T__87=88, T__88=89, T__89=90, T__90=91, T__91=92, T__92=93, T__93=94, 
		T__94=95, T__95=96, T__96=97, T__97=98, T__98=99, T__99=100, T__100=101, 
		T__101=102, T__102=103, T__103=104, T__104=105, T__105=106, T__106=107, 
		T__107=108, T__108=109, T__109=110, T__110=111, T__111=112, T__112=113, 
		T__113=114, T__114=115, T__115=116, T__116=117, T__117=118, T__118=119, 
		T__119=120, T__120=121, T__121=122, T__122=123, T__123=124, T__124=125, 
		T__125=126, T__126=127, T__127=128, T__128=129, T__129=130, T__130=131, 
		T__131=132, T__132=133, T__133=134, T__134=135, T__135=136, BooleanLiteral=137, 
		NilLiteral=138, OperatorHead=139, OperatorCharacter=140, DotOperatorHead=141, 
		Identifier=142, ImplicitParameterName=143, BinaryLiteral=144, OctalLiteral=145, 
		DecimalLiteral=146, HexadecimalLiteral=147, FloatingPointLiteral=148, 
		VersionLiteral=149, StringLiteral=150, EscapedCharacter=151, WS=152, BlockComment=153, 
		LineComment=154;
	public static final int
		RULE_topLevel = 0, RULE_statement = 1, RULE_statements = 2, RULE_loopStatement = 3, 
		RULE_forInStatement = 4, RULE_whileStatement = 5, RULE_repeatWhileStatement = 6, 
		RULE_branchStatement = 7, RULE_ifStatement = 8, RULE_elseClause = 9, RULE_guardStatement = 10, 
		RULE_switchStatement = 11, RULE_switchCases = 12, RULE_switchCase = 13, 
		RULE_caseLabel = 14, RULE_caseItemList = 15, RULE_caseItem = 16, RULE_defaultLabel = 17, 
		RULE_labeledStatement = 18, RULE_statementLabel = 19, RULE_labelName = 20, 
		RULE_controlTransferStatement = 21, RULE_breakStatement = 22, RULE_continueStatement = 23, 
		RULE_fallthroughStatement = 24, RULE_returnStatement = 25, RULE_throwStatement = 26, 
		RULE_deferStatement = 27, RULE_doStatement = 28, RULE_catchClauses = 29, 
		RULE_catchClause = 30, RULE_conditionClause = 31, RULE_conditionList = 32, 
		RULE_condition = 33, RULE_caseCondition = 34, RULE_optionalBindingCondition = 35, 
		RULE_optionalBindingHead = 36, RULE_optionalBindingContinuationList = 37, 
		RULE_optionalBindingContinuation = 38, RULE_whereClause = 39, RULE_whereExpression = 40, 
		RULE_availabilityCondition = 41, RULE_availabilityArguments = 42, RULE_availabilityArgument = 43, 
		RULE_platformName = 44, RULE_platformVersion = 45, RULE_genericParameterClause = 46, 
		RULE_genericParameterList = 47, RULE_genericParameter = 48, RULE_requirementClause = 49, 
		RULE_requirementList = 50, RULE_requirement = 51, RULE_conformanceRequirement = 52, 
		RULE_sameTypeRequirement = 53, RULE_genericArgumentClause = 54, RULE_genericArgumentList = 55, 
		RULE_genericArgument = 56, RULE_declaration = 57, RULE_declarations = 58, 
		RULE_declarationModifiers = 59, RULE_declarationModifier = 60, RULE_accessLevelModifier = 61, 
		RULE_accessLevelModifiers = 62, RULE_codeBlock = 63, RULE_importDeclaration = 64, 
		RULE_importKind = 65, RULE_importPath = 66, RULE_importPathIdentifier = 67, 
		RULE_constantDeclaration = 68, RULE_patternInitializerList = 69, RULE_patternInitializer = 70, 
		RULE_initializer = 71, RULE_variableDeclaration = 72, RULE_variableDeclarationHead = 73, 
		RULE_variableName = 74, RULE_getterSetterBlock = 75, RULE_getterClause = 76, 
		RULE_setterClause = 77, RULE_setterName = 78, RULE_getterSetterKeywordBlock = 79, 
		RULE_getterKeywordClause = 80, RULE_setterKeywordClause = 81, RULE_willSetDidSetBlock = 82, 
		RULE_willSetClause = 83, RULE_didSetClause = 84, RULE_typealiasDeclaration = 85, 
		RULE_typealiasHead = 86, RULE_typealiasName = 87, RULE_typealiasAssignment = 88, 
		RULE_functionDeclaration = 89, RULE_functionHead = 90, RULE_functionName = 91, 
		RULE_functionSignature = 92, RULE_functionResult = 93, RULE_functionBody = 94, 
		RULE_parameterClause = 95, RULE_parameterList = 96, RULE_parameter = 97, 
		RULE_externalParameterName = 98, RULE_localParameterName = 99, RULE_defaultArgumentClause = 100, 
		RULE_enumDeclaration = 101, RULE_enumDef = 102, RULE_unionStyleEnum = 103, 
		RULE_unionStyleEnumMembers = 104, RULE_unionStyleEnumMember = 105, RULE_unionStyleEnumCaseClause = 106, 
		RULE_unionStyleEnumCaseList = 107, RULE_unionStyleEnumCase = 108, RULE_enumName = 109, 
		RULE_enumCaseName = 110, RULE_rawValueStyleEnum = 111, RULE_rawValueStyleEnumMembers = 112, 
		RULE_rawValueStyleEnumMember = 113, RULE_rawValueStyleEnumCaseClause = 114, 
		RULE_rawValueStyleEnumCaseList = 115, RULE_rawValueStyleEnumCase = 116, 
		RULE_rawValueAssignment = 117, RULE_structDeclaration = 118, RULE_structName = 119, 
		RULE_structBody = 120, RULE_classDeclaration = 121, RULE_classDeclarationModifiers = 122, 
		RULE_className = 123, RULE_classBody = 124, RULE_protocolDeclaration = 125, 
		RULE_protocolName = 126, RULE_protocolBody = 127, RULE_protocolMemberDeclaration = 128, 
		RULE_protocolMemberDeclarations = 129, RULE_protocolPropertyDeclaration = 130, 
		RULE_protocolMethodDeclaration = 131, RULE_protocolInitializerDeclaration = 132, 
		RULE_protocolSubscriptDeclaration = 133, RULE_protocolAssociatedTypeDeclaration = 134, 
		RULE_initializerDeclaration = 135, RULE_initializerHead = 136, RULE_initializerBody = 137, 
		RULE_deinitializerDeclaration = 138, RULE_extensionDeclaration = 139, 
		RULE_extensionBody = 140, RULE_subscriptDeclaration = 141, RULE_subscriptHead = 142, 
		RULE_subscriptResult = 143, RULE_operatorDeclaration = 144, RULE_prefixOperatorDeclaration = 145, 
		RULE_postfixOperatorDeclaration = 146, RULE_infixOperatorDeclaration = 147, 
		RULE_infixOperatorAttributes = 148, RULE_precedenceClause = 149, RULE_precedenceLevel = 150, 
		RULE_associativityClause = 151, RULE_associativity = 152, RULE_pattern = 153, 
		RULE_wildcardPattern = 154, RULE_identifierPattern = 155, RULE_valueBindingPattern = 156, 
		RULE_tuplePattern = 157, RULE_tuplePatternElementList = 158, RULE_tuplePatternElement = 159, 
		RULE_enumCasePattern = 160, RULE_typeCastingPattern = 161, RULE_isPattern = 162, 
		RULE_asPattern = 163, RULE_expressionPattern = 164, RULE_attribute = 165, 
		RULE_attributeName = 166, RULE_attributeArgumentClause = 167, RULE_attributes = 168, 
		RULE_balancedTokens = 169, RULE_balancedToken = 170, RULE_expression = 171, 
		RULE_prefixExpression = 172, RULE_inOutExpression = 173, RULE_tryOperator = 174, 
		RULE_binaryExpression = 175, RULE_assignmentOperator = 176, RULE_conditionalOperator = 177, 
		RULE_typeCastingOperator = 178, RULE_primaryExpression = 179, RULE_literalExpression = 180, 
		RULE_arrayLiteral = 181, RULE_arrayLiteralItems = 182, RULE_arrayLiteralItem = 183, 
		RULE_dictionaryLiteral = 184, RULE_dictionaryLiteralItems = 185, RULE_dictionaryLiteralItem = 186, 
		RULE_selfExpression = 187, RULE_superclassExpression = 188, RULE_superclassMethodExpression = 189, 
		RULE_superclassSubscriptExpression = 190, RULE_superclassInitializerExpression = 191, 
		RULE_closureExpression = 192, RULE_closureSignature = 193, RULE_captureList = 194, 
		RULE_captureListItems = 195, RULE_captureListItem = 196, RULE_captureSpecifier = 197, 
		RULE_implicitMemberExpression = 198, RULE_parenthesizedExpression = 199, 
		RULE_expressionElementList = 200, RULE_expressionElement = 201, RULE_expressionElementIdentifier = 202, 
		RULE_wildcardExpression = 203, RULE_selectorExpression = 204, RULE_postfixExpression = 205, 
		RULE_argumentNames = 206, RULE_argumentName = 207, RULE_operatorHead = 208, 
		RULE_operatorCharacter = 209, RULE_operator = 210, RULE_binaryOperator = 211, 
		RULE_prefixOperator = 212, RULE_postfixOperator = 213, RULE_sType = 214, 
		RULE_arrayType = 215, RULE_dictionaryType = 216, RULE_optionalType = 217, 
		RULE_implicitlyUnwrappedOptionalType = 218, RULE_typeAnnotation = 219, 
		RULE_typeIdentifier = 220, RULE_typeName = 221, RULE_tupleType = 222, 
		RULE_tupleTypeBody = 223, RULE_tupleTypeElementList = 224, RULE_tupleTypeElement = 225, 
		RULE_elementName = 226, RULE_protocolCompositionType = 227, RULE_protocolIdentifierList = 228, 
		RULE_protocolIdentifier = 229, RULE_metatypeType = 230, RULE_typeInheritanceClause = 231, 
		RULE_typeInheritanceList = 232, RULE_classRequirement = 233, RULE_compilerControlStatement = 234, 
		RULE_buildConfigurationStatement = 235, RULE_buildConfigurationElseIfClauses = 236, 
		RULE_buildConfigurationElseIfClause = 237, RULE_buildConfigurationElseClause = 238, 
		RULE_buildConfiguration = 239, RULE_platformTestingFunction = 240, RULE_languageVersionTestingFunction = 241, 
		RULE_operatingSystem = 242, RULE_architecture = 243, RULE_swiftVersion = 244, 
		RULE_lineControlStatement = 245, RULE_lineNumber = 246, RULE_fileName = 247, 
		RULE_identifier = 248, RULE_keyword = 249, RULE_contextSensitiveKeyword = 250, 
		RULE_identifierList = 251, RULE_booleanLiteral = 252, RULE_literal = 253, 
		RULE_numericLiteral = 254, RULE_integerLiteral = 255;
	public static final String[] ruleNames = {
		"topLevel", "statement", "statements", "loopStatement", "forInStatement", 
		"whileStatement", "repeatWhileStatement", "branchStatement", "ifStatement", 
		"elseClause", "guardStatement", "switchStatement", "switchCases", "switchCase", 
		"caseLabel", "caseItemList", "caseItem", "defaultLabel", "labeledStatement", 
		"statementLabel", "labelName", "controlTransferStatement", "breakStatement", 
		"continueStatement", "fallthroughStatement", "returnStatement", "throwStatement", 
		"deferStatement", "doStatement", "catchClauses", "catchClause", "conditionClause", 
		"conditionList", "condition", "caseCondition", "optionalBindingCondition", 
		"optionalBindingHead", "optionalBindingContinuationList", "optionalBindingContinuation", 
		"whereClause", "whereExpression", "availabilityCondition", "availabilityArguments", 
		"availabilityArgument", "platformName", "platformVersion", "genericParameterClause", 
		"genericParameterList", "genericParameter", "requirementClause", "requirementList", 
		"requirement", "conformanceRequirement", "sameTypeRequirement", "genericArgumentClause", 
		"genericArgumentList", "genericArgument", "declaration", "declarations", 
		"declarationModifiers", "declarationModifier", "accessLevelModifier", 
		"accessLevelModifiers", "codeBlock", "importDeclaration", "importKind", 
		"importPath", "importPathIdentifier", "constantDeclaration", "patternInitializerList", 
		"patternInitializer", "initializer", "variableDeclaration", "variableDeclarationHead", 
		"variableName", "getterSetterBlock", "getterClause", "setterClause", "setterName", 
		"getterSetterKeywordBlock", "getterKeywordClause", "setterKeywordClause", 
		"willSetDidSetBlock", "willSetClause", "didSetClause", "typealiasDeclaration", 
		"typealiasHead", "typealiasName", "typealiasAssignment", "functionDeclaration", 
		"functionHead", "functionName", "functionSignature", "functionResult", 
		"functionBody", "parameterClause", "parameterList", "parameter", "externalParameterName", 
		"localParameterName", "defaultArgumentClause", "enumDeclaration", "enumDef", 
		"unionStyleEnum", "unionStyleEnumMembers", "unionStyleEnumMember", "unionStyleEnumCaseClause", 
		"unionStyleEnumCaseList", "unionStyleEnumCase", "enumName", "enumCaseName", 
		"rawValueStyleEnum", "rawValueStyleEnumMembers", "rawValueStyleEnumMember", 
		"rawValueStyleEnumCaseClause", "rawValueStyleEnumCaseList", "rawValueStyleEnumCase", 
		"rawValueAssignment", "structDeclaration", "structName", "structBody", 
		"classDeclaration", "classDeclarationModifiers", "className", "classBody", 
		"protocolDeclaration", "protocolName", "protocolBody", "protocolMemberDeclaration", 
		"protocolMemberDeclarations", "protocolPropertyDeclaration", "protocolMethodDeclaration", 
		"protocolInitializerDeclaration", "protocolSubscriptDeclaration", "protocolAssociatedTypeDeclaration", 
		"initializerDeclaration", "initializerHead", "initializerBody", "deinitializerDeclaration", 
		"extensionDeclaration", "extensionBody", "subscriptDeclaration", "subscriptHead", 
		"subscriptResult", "operatorDeclaration", "prefixOperatorDeclaration", 
		"postfixOperatorDeclaration", "infixOperatorDeclaration", "infixOperatorAttributes", 
		"precedenceClause", "precedenceLevel", "associativityClause", "associativity", 
		"pattern", "wildcardPattern", "identifierPattern", "valueBindingPattern", 
		"tuplePattern", "tuplePatternElementList", "tuplePatternElement", "enumCasePattern", 
		"typeCastingPattern", "isPattern", "asPattern", "expressionPattern", "attribute", 
		"attributeName", "attributeArgumentClause", "attributes", "balancedTokens", 
		"balancedToken", "expression", "prefixExpression", "inOutExpression", 
		"tryOperator", "binaryExpression", "assignmentOperator", "conditionalOperator", 
		"typeCastingOperator", "primaryExpression", "literalExpression", "arrayLiteral", 
		"arrayLiteralItems", "arrayLiteralItem", "dictionaryLiteral", "dictionaryLiteralItems", 
		"dictionaryLiteralItem", "selfExpression", "superclassExpression", "superclassMethodExpression", 
		"superclassSubscriptExpression", "superclassInitializerExpression", "closureExpression", 
		"closureSignature", "captureList", "captureListItems", "captureListItem", 
		"captureSpecifier", "implicitMemberExpression", "parenthesizedExpression", 
		"expressionElementList", "expressionElement", "expressionElementIdentifier", 
		"wildcardExpression", "selectorExpression", "postfixExpression", "argumentNames", 
		"argumentName", "operatorHead", "operatorCharacter", "operator", "binaryOperator", 
		"prefixOperator", "postfixOperator", "sType", "arrayType", "dictionaryType", 
		"optionalType", "implicitlyUnwrappedOptionalType", "typeAnnotation", "typeIdentifier", 
		"typeName", "tupleType", "tupleTypeBody", "tupleTypeElementList", "tupleTypeElement", 
		"elementName", "protocolCompositionType", "protocolIdentifierList", "protocolIdentifier", 
		"metatypeType", "typeInheritanceClause", "typeInheritanceList", "classRequirement", 
		"compilerControlStatement", "buildConfigurationStatement", "buildConfigurationElseIfClauses", 
		"buildConfigurationElseIfClause", "buildConfigurationElseClause", "buildConfiguration", 
		"platformTestingFunction", "languageVersionTestingFunction", "operatingSystem", 
		"architecture", "swiftVersion", "lineControlStatement", "lineNumber", 
		"fileName", "identifier", "keyword", "contextSensitiveKeyword", "identifierList", 
		"booleanLiteral", "literal", "numericLiteral", "integerLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "'for'", "'case'", "'in'", "'while'", "'repeat'", 
		"'if'", "'else'", "'guard'", "'switch'", "'{'", "'}'", "','", "'default'", 
		"'break'", "'continue'", "'fallthrough'", "'return'", "'throw'", "'defer'", 
		"'do'", "'catch'", "'let'", "'var'", "'where'", "'#available'", "'('", 
		"')'", "'*'", "'iOS'", "'iOSApplicationExtension'", "'OSX'", "'OSXApplicationExtension'", 
		"'watchOS'", "'watchOSApplicationExtension'", "'tvOS'", "'tvOSApplicationExtension'", 
		"'<'", "'>'", "'=='", "'class'", "'convenience'", "'dynamic'", "'final'", 
		"'infix'", "'lazy'", "'mutating'", "'nonmutating'", "'optional'", "'override'", 
		"'postfix'", "'prefix'", "'required'", "'static'", "'unowned'", "'safe'", 
		"'unsafe'", "'weak'", "'internal'", "'set'", "'private'", "'public'", 
		"'import'", "'typealias'", "'struct'", "'enum'", "'protocol'", "'func'", 
		"'.'", "'='", "'get'", "'willSet'", "'didSet'", "'throws'", "'rethrows'", 
		"'->'", "'...'", "'inout'", "'#'", "'_'", "'indirect'", "'associatedtype'", 
		"'init'", "'?'", "'!'", "'deinit'", "'extension'", "'subscript'", "'operator'", 
		"'precedence'", "'associativity'", "'left'", "'right'", "'none'", "'is'", 
		"'as'", "'@'", "'['", "']'", "'-'", "'''", "'/'", "'\"'", "'&'", "'try'", 
		"'#file'", "'#line'", "'#column'", "'#function'", "'self'", "'super'", 
		"'unowned(safe)'", "'unowned(unsafe)'", "'#selector'", "'dynamicType'", 
		"'!='", "'??'", "'&&'", "'||'", "'>='", "'Type'", "'Protocol'", "'Self'", 
		"'#if'", "'#endif'", "'#elseif'", "'#else'", "'os'", "'arch'", "'swift'", 
		"'i386'", "'x86_64'", "'arm'", "'arm64'", "'OSXApplicationExtension­'", 
		null, "'nil'", null, null, "'..'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, "BooleanLiteral", "NilLiteral", "OperatorHead", 
		"OperatorCharacter", "DotOperatorHead", "Identifier", "ImplicitParameterName", 
		"BinaryLiteral", "OctalLiteral", "DecimalLiteral", "HexadecimalLiteral", 
		"FloatingPointLiteral", "VersionLiteral", "StringLiteral", "EscapedCharacter", 
		"WS", "BlockComment", "LineComment"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Swift.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SwiftParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TopLevelContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SwiftParser.EOF, 0); }
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public TopLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_topLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTopLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTopLevel(this);
		}
	}

	public final TopLevelContext topLevel() throws RecognitionException {
		TopLevelContext _localctx = new TopLevelContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_topLevel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__77 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__124 - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (T__128 - 129)) | (1L << (T__129 - 129)) | (1L << (T__131 - 129)) | (1L << (T__132 - 129)) | (1L << (T__133 - 129)) | (1L << (T__134 - 129)) | (1L << (T__135 - 129)) | (1L << (BooleanLiteral - 129)) | (1L << (NilLiteral - 129)) | (1L << (OperatorHead - 129)) | (1L << (DotOperatorHead - 129)) | (1L << (Identifier - 129)) | (1L << (BinaryLiteral - 129)) | (1L << (OctalLiteral - 129)) | (1L << (DecimalLiteral - 129)) | (1L << (HexadecimalLiteral - 129)) | (1L << (FloatingPointLiteral - 129)) | (1L << (StringLiteral - 129)))) != 0)) {
				{
				setState(512);
				statements();
				}
			}

			setState(515);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public BranchStatementContext branchStatement() {
			return getRuleContext(BranchStatementContext.class,0);
		}
		public LabeledStatementContext labeledStatement() {
			return getRuleContext(LabeledStatementContext.class,0);
		}
		public ControlTransferStatementContext controlTransferStatement() {
			return getRuleContext(ControlTransferStatementContext.class,0);
		}
		public DeferStatementContext deferStatement() {
			return getRuleContext(DeferStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
		}
		public CompilerControlStatementContext compilerControlStatement() {
			return getRuleContext(CompilerControlStatementContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			setState(550);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(517);
				declaration();
				setState(519);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(518);
					match(T__0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(521);
				loopStatement();
				setState(523);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(522);
					match(T__0);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(525);
				branchStatement();
				setState(527);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(526);
					match(T__0);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(529);
				labeledStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(530);
				controlTransferStatement();
				setState(532);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(531);
					match(T__0);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(534);
				deferStatement();
				setState(536);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(535);
					match(T__0);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(538);
				doStatement();
				setState(540);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(539);
					match(T__1);
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(542);
				compilerControlStatement();
				setState(544);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(543);
					match(T__0);
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(546);
				expression();
				setState(548);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(547);
					match(T__0);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementsContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statements; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStatements(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStatements(this);
		}
	}

	public final StatementsContext statements() throws RecognitionException {
		StatementsContext _localctx = new StatementsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statements);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(553); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(552);
				statement();
				}
				}
				setState(555); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__77 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__124 - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (T__128 - 129)) | (1L << (T__129 - 129)) | (1L << (T__131 - 129)) | (1L << (T__132 - 129)) | (1L << (T__133 - 129)) | (1L << (T__134 - 129)) | (1L << (T__135 - 129)) | (1L << (BooleanLiteral - 129)) | (1L << (NilLiteral - 129)) | (1L << (OperatorHead - 129)) | (1L << (DotOperatorHead - 129)) | (1L << (Identifier - 129)) | (1L << (BinaryLiteral - 129)) | (1L << (OctalLiteral - 129)) | (1L << (DecimalLiteral - 129)) | (1L << (HexadecimalLiteral - 129)) | (1L << (FloatingPointLiteral - 129)) | (1L << (StringLiteral - 129)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LoopStatementContext extends ParserRuleContext {
		public ForInStatementContext forInStatement() {
			return getRuleContext(ForInStatementContext.class,0);
		}
		public WhileStatementContext whileStatement() {
			return getRuleContext(WhileStatementContext.class,0);
		}
		public RepeatWhileStatementContext repeatWhileStatement() {
			return getRuleContext(RepeatWhileStatementContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLoopStatement(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_loopStatement);
		try {
			setState(560);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(557);
				forInStatement();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(558);
				whileStatement();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(559);
				repeatWhileStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForInStatementContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public ForInStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitForInStatement(this);
		}
	}

	public final ForInStatementContext forInStatement() throws RecognitionException {
		ForInStatementContext _localctx = new ForInStatementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_forInStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			match(T__2);
			setState(564);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(563);
				match(T__3);
				}
			}

			setState(566);
			pattern(0);
			setState(567);
			match(T__4);
			setState(568);
			expression();
			setState(570);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(569);
				whereClause();
				}
			}

			setState(572);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhileStatementContext extends ParserRuleContext {
		public ConditionClauseContext conditionClause() {
			return getRuleContext(ConditionClauseContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public WhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWhileStatement(this);
		}
	}

	public final WhileStatementContext whileStatement() throws RecognitionException {
		WhileStatementContext _localctx = new WhileStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_whileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(574);
			match(T__5);
			setState(575);
			conditionClause();
			setState(576);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatWhileStatementContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ConditionClauseContext conditionClause() {
			return getRuleContext(ConditionClauseContext.class,0);
		}
		public RepeatWhileStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatWhileStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRepeatWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRepeatWhileStatement(this);
		}
	}

	public final RepeatWhileStatementContext repeatWhileStatement() throws RecognitionException {
		RepeatWhileStatementContext _localctx = new RepeatWhileStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_repeatWhileStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(578);
			match(T__6);
			setState(579);
			codeBlock();
			setState(580);
			match(T__5);
			setState(581);
			conditionClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BranchStatementContext extends ParserRuleContext {
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public GuardStatementContext guardStatement() {
			return getRuleContext(GuardStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public BranchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBranchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBranchStatement(this);
		}
	}

	public final BranchStatementContext branchStatement() throws RecognitionException {
		BranchStatementContext _localctx = new BranchStatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_branchStatement);
		try {
			setState(586);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(583);
				ifStatement();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(584);
				guardStatement();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(585);
				switchStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfStatementContext extends ParserRuleContext {
		public ConditionClauseContext conditionClause() {
			return getRuleContext(ConditionClauseContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public ElseClauseContext elseClause() {
			return getRuleContext(ElseClauseContext.class,0);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(T__7);
			setState(589);
			conditionClause();
			setState(590);
			codeBlock();
			setState(592);
			_la = _input.LA(1);
			if (_la==T__8) {
				{
				setState(591);
				elseClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseClauseContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public ElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitElseClause(this);
		}
	}

	public final ElseClauseContext elseClause() throws RecognitionException {
		ElseClauseContext _localctx = new ElseClauseContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elseClause);
		try {
			setState(598);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(594);
				match(T__8);
				setState(595);
				codeBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(596);
				match(T__8);
				setState(597);
				ifStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GuardStatementContext extends ParserRuleContext {
		public ConditionClauseContext conditionClause() {
			return getRuleContext(ConditionClauseContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public GuardStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_guardStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGuardStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGuardStatement(this);
		}
	}

	public final GuardStatementContext guardStatement() throws RecognitionException {
		GuardStatementContext _localctx = new GuardStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_guardStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			match(T__9);
			setState(601);
			conditionClause();
			setState(602);
			match(T__8);
			setState(603);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SwitchCasesContext switchCases() {
			return getRuleContext(SwitchCasesContext.class,0);
		}
		public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSwitchStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSwitchStatement(this);
		}
	}

	public final SwitchStatementContext switchStatement() throws RecognitionException {
		SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_switchStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(605);
			match(T__10);
			setState(606);
			expression();
			setState(607);
			match(T__11);
			setState(609);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__14) {
				{
				setState(608);
				switchCases();
				}
			}

			setState(611);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchCasesContext extends ParserRuleContext {
		public List<SwitchCaseContext> switchCase() {
			return getRuleContexts(SwitchCaseContext.class);
		}
		public SwitchCaseContext switchCase(int i) {
			return getRuleContext(SwitchCaseContext.class,i);
		}
		public SwitchCasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSwitchCases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSwitchCases(this);
		}
	}

	public final SwitchCasesContext switchCases() throws RecognitionException {
		SwitchCasesContext _localctx = new SwitchCasesContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_switchCases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(613);
				switchCase();
				}
				}
				setState(616); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 || _la==T__14 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwitchCaseContext extends ParserRuleContext {
		public CaseLabelContext caseLabel() {
			return getRuleContext(CaseLabelContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public DefaultLabelContext defaultLabel() {
			return getRuleContext(DefaultLabelContext.class,0);
		}
		public SwitchCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_switchCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSwitchCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSwitchCase(this);
		}
	}

	public final SwitchCaseContext switchCase() throws RecognitionException {
		SwitchCaseContext _localctx = new SwitchCaseContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_switchCase);
		try {
			setState(630);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(618);
				caseLabel();
				setState(619);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(621);
				defaultLabel();
				setState(622);
				statements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(624);
				caseLabel();
				setState(625);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(627);
				defaultLabel();
				setState(628);
				match(T__0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseLabelContext extends ParserRuleContext {
		public CaseItemListContext caseItemList() {
			return getRuleContext(CaseItemListContext.class,0);
		}
		public CaseLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCaseLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCaseLabel(this);
		}
	}

	public final CaseLabelContext caseLabel() throws RecognitionException {
		CaseLabelContext _localctx = new CaseLabelContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_caseLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			match(T__3);
			setState(633);
			caseItemList();
			setState(634);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseItemListContext extends ParserRuleContext {
		public List<CaseItemContext> caseItem() {
			return getRuleContexts(CaseItemContext.class);
		}
		public CaseItemContext caseItem(int i) {
			return getRuleContext(CaseItemContext.class,i);
		}
		public CaseItemListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseItemList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCaseItemList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCaseItemList(this);
		}
	}

	public final CaseItemListContext caseItemList() throws RecognitionException {
		CaseItemListContext _localctx = new CaseItemListContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_caseItemList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(636);
			caseItem();
			setState(641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(637);
				match(T__13);
				setState(638);
				caseItem();
				}
				}
				setState(643);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseItemContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public CaseItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCaseItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCaseItem(this);
		}
	}

	public final CaseItemContext caseItem() throws RecognitionException {
		CaseItemContext _localctx = new CaseItemContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_caseItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(644);
			pattern(0);
			setState(646);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(645);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultLabelContext extends ParserRuleContext {
		public DefaultLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDefaultLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDefaultLabel(this);
		}
	}

	public final DefaultLabelContext defaultLabel() throws RecognitionException {
		DefaultLabelContext _localctx = new DefaultLabelContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_defaultLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			match(T__14);
			setState(649);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabeledStatementContext extends ParserRuleContext {
		public StatementLabelContext statementLabel() {
			return getRuleContext(StatementLabelContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public LabeledStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labeledStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLabeledStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLabeledStatement(this);
		}
	}

	public final LabeledStatementContext labeledStatement() throws RecognitionException {
		LabeledStatementContext _localctx = new LabeledStatementContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_labeledStatement);
		try {
			setState(657);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(651);
				statementLabel();
				setState(652);
				loopStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				statementLabel();
				setState(655);
				switchStatement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementLabelContext extends ParserRuleContext {
		public LabelNameContext labelName() {
			return getRuleContext(LabelNameContext.class,0);
		}
		public StatementLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStatementLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStatementLabel(this);
		}
	}

	public final StatementLabelContext statementLabel() throws RecognitionException {
		StatementLabelContext _localctx = new StatementLabelContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_statementLabel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			labelName();
			setState(660);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLabelName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLabelName(this);
		}
	}

	public final LabelNameContext labelName() throws RecognitionException {
		LabelNameContext _localctx = new LabelNameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_labelName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(662);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ControlTransferStatementContext extends ParserRuleContext {
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ContinueStatementContext continueStatement() {
			return getRuleContext(ContinueStatementContext.class,0);
		}
		public FallthroughStatementContext fallthroughStatement() {
			return getRuleContext(FallthroughStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public ThrowStatementContext throwStatement() {
			return getRuleContext(ThrowStatementContext.class,0);
		}
		public ControlTransferStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlTransferStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterControlTransferStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitControlTransferStatement(this);
		}
	}

	public final ControlTransferStatementContext controlTransferStatement() throws RecognitionException {
		ControlTransferStatementContext _localctx = new ControlTransferStatementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_controlTransferStatement);
		try {
			setState(669);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				breakStatement();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(665);
				continueStatement();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(666);
				fallthroughStatement();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(667);
				returnStatement();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 5);
				{
				setState(668);
				throwStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BreakStatementContext extends ParserRuleContext {
		public LabelNameContext labelName() {
			return getRuleContext(LabelNameContext.class,0);
		}
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBreakStatement(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(671);
			match(T__15);
			setState(673);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(672);
				labelName();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContinueStatementContext extends ParserRuleContext {
		public LabelNameContext labelName() {
			return getRuleContext(LabelNameContext.class,0);
		}
		public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continueStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterContinueStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitContinueStatement(this);
		}
	}

	public final ContinueStatementContext continueStatement() throws RecognitionException {
		ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_continueStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			match(T__16);
			setState(677);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(676);
				labelName();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FallthroughStatementContext extends ParserRuleContext {
		public FallthroughStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fallthroughStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFallthroughStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFallthroughStatement(this);
		}
	}

	public final FallthroughStatementContext fallthroughStatement() throws RecognitionException {
		FallthroughStatementContext _localctx = new FallthroughStatementContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fallthroughStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(679);
			match(T__17);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitReturnStatement(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(681);
			match(T__18);
			setState(683);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(682);
				expression();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ThrowStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_throwStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterThrowStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitThrowStatement(this);
		}
	}

	public final ThrowStatementContext throwStatement() throws RecognitionException {
		ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_throwStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(685);
			match(T__19);
			setState(686);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeferStatementContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public DeferStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deferStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeferStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeferStatement(this);
		}
	}

	public final DeferStatementContext deferStatement() throws RecognitionException {
		DeferStatementContext _localctx = new DeferStatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_deferStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(688);
			match(T__20);
			setState(689);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DoStatementContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public CatchClausesContext catchClauses() {
			return getRuleContext(CatchClausesContext.class,0);
		}
		public DoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDoStatement(this);
		}
	}

	public final DoStatementContext doStatement() throws RecognitionException {
		DoStatementContext _localctx = new DoStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_doStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(691);
			match(T__21);
			setState(692);
			codeBlock();
			setState(694);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(693);
				catchClauses();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClausesContext extends ParserRuleContext {
		public CatchClauseContext catchClause() {
			return getRuleContext(CatchClauseContext.class,0);
		}
		public CatchClausesContext catchClauses() {
			return getRuleContext(CatchClausesContext.class,0);
		}
		public CatchClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCatchClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCatchClauses(this);
		}
	}

	public final CatchClausesContext catchClauses() throws RecognitionException {
		CatchClausesContext _localctx = new CatchClausesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_catchClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(696);
			catchClause();
			setState(698);
			_la = _input.LA(1);
			if (_la==T__22) {
				{
				setState(697);
				catchClauses();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CatchClauseContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public CatchClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_catchClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCatchClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCatchClause(this);
		}
	}

	public final CatchClauseContext catchClause() throws RecognitionException {
		CatchClauseContext _localctx = new CatchClauseContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_catchClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			match(T__22);
			setState(702);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(701);
				pattern(0);
				}
				break;
			}
			setState(705);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(704);
				whereClause();
				}
			}

			setState(707);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionClauseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionListContext conditionList() {
			return getRuleContext(ConditionListContext.class,0);
		}
		public AvailabilityConditionContext availabilityCondition() {
			return getRuleContext(AvailabilityConditionContext.class,0);
		}
		public ConditionClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterConditionClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitConditionClause(this);
		}
	}

	public final ConditionClauseContext conditionClause() throws RecognitionException {
		ConditionClauseContext _localctx = new ConditionClauseContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_conditionClause);
		try {
			setState(719);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				expression();
				setState(711);
				match(T__13);
				setState(712);
				conditionList();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(714);
				conditionList();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(715);
				availabilityCondition();
				setState(716);
				match(T__13);
				setState(717);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionListContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public ConditionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterConditionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitConditionList(this);
		}
	}

	public final ConditionListContext conditionList() throws RecognitionException {
		ConditionListContext _localctx = new ConditionListContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_conditionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(721);
			condition();
			setState(726);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(722);
				match(T__13);
				setState(723);
				condition();
				}
				}
				setState(728);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public AvailabilityConditionContext availabilityCondition() {
			return getRuleContext(AvailabilityConditionContext.class,0);
		}
		public CaseConditionContext caseCondition() {
			return getRuleContext(CaseConditionContext.class,0);
		}
		public OptionalBindingConditionContext optionalBindingCondition() {
			return getRuleContext(OptionalBindingConditionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_condition);
		try {
			setState(732);
			switch (_input.LA(1)) {
			case T__26:
				enterOuterAlt(_localctx, 1);
				{
				setState(729);
				availabilityCondition();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(730);
				caseCondition();
				}
				break;
			case T__23:
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(731);
				optionalBindingCondition();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaseConditionContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public CaseConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCaseCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCaseCondition(this);
		}
	}

	public final CaseConditionContext caseCondition() throws RecognitionException {
		CaseConditionContext _localctx = new CaseConditionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_caseCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			match(T__3);
			setState(735);
			pattern(0);
			setState(736);
			initializer();
			setState(738);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(737);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalBindingConditionContext extends ParserRuleContext {
		public OptionalBindingHeadContext optionalBindingHead() {
			return getRuleContext(OptionalBindingHeadContext.class,0);
		}
		public OptionalBindingContinuationListContext optionalBindingContinuationList() {
			return getRuleContext(OptionalBindingContinuationListContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public OptionalBindingConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalBindingCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOptionalBindingCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOptionalBindingCondition(this);
		}
	}

	public final OptionalBindingConditionContext optionalBindingCondition() throws RecognitionException {
		OptionalBindingConditionContext _localctx = new OptionalBindingConditionContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_optionalBindingCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(740);
			optionalBindingHead();
			setState(743);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(741);
				match(T__13);
				setState(742);
				optionalBindingContinuationList();
				}
				break;
			}
			setState(746);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(745);
				whereClause();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalBindingHeadContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public OptionalBindingHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalBindingHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOptionalBindingHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOptionalBindingHead(this);
		}
	}

	public final OptionalBindingHeadContext optionalBindingHead() throws RecognitionException {
		OptionalBindingHeadContext _localctx = new OptionalBindingHeadContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_optionalBindingHead);
		try {
			setState(756);
			switch (_input.LA(1)) {
			case T__23:
				enterOuterAlt(_localctx, 1);
				{
				setState(748);
				match(T__23);
				setState(749);
				pattern(0);
				setState(750);
				initializer();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 2);
				{
				setState(752);
				match(T__24);
				setState(753);
				pattern(0);
				setState(754);
				initializer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalBindingContinuationListContext extends ParserRuleContext {
		public List<OptionalBindingContinuationContext> optionalBindingContinuation() {
			return getRuleContexts(OptionalBindingContinuationContext.class);
		}
		public OptionalBindingContinuationContext optionalBindingContinuation(int i) {
			return getRuleContext(OptionalBindingContinuationContext.class,i);
		}
		public OptionalBindingContinuationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalBindingContinuationList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOptionalBindingContinuationList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOptionalBindingContinuationList(this);
		}
	}

	public final OptionalBindingContinuationListContext optionalBindingContinuationList() throws RecognitionException {
		OptionalBindingContinuationListContext _localctx = new OptionalBindingContinuationListContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_optionalBindingContinuationList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(758);
			optionalBindingContinuation();
			setState(763);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(759);
					match(T__13);
					setState(760);
					optionalBindingContinuation();
					}
					} 
				}
				setState(765);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,38,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalBindingContinuationContext extends ParserRuleContext {
		public OptionalBindingHeadContext optionalBindingHead() {
			return getRuleContext(OptionalBindingHeadContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public OptionalBindingContinuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalBindingContinuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOptionalBindingContinuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOptionalBindingContinuation(this);
		}
	}

	public final OptionalBindingContinuationContext optionalBindingContinuation() throws RecognitionException {
		OptionalBindingContinuationContext _localctx = new OptionalBindingContinuationContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_optionalBindingContinuation);
		try {
			setState(770);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(766);
				optionalBindingHead();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(767);
				pattern(0);
				setState(768);
				initializer();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public WhereExpressionContext whereExpression() {
			return getRuleContext(WhereExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWhereClause(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(T__25);
			setState(773);
			whereExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public WhereExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWhereExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWhereExpression(this);
		}
	}

	public final WhereExpressionContext whereExpression() throws RecognitionException {
		WhereExpressionContext _localctx = new WhereExpressionContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_whereExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(775);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AvailabilityConditionContext extends ParserRuleContext {
		public AvailabilityArgumentsContext availabilityArguments() {
			return getRuleContext(AvailabilityArgumentsContext.class,0);
		}
		public AvailabilityConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availabilityCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAvailabilityCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAvailabilityCondition(this);
		}
	}

	public final AvailabilityConditionContext availabilityCondition() throws RecognitionException {
		AvailabilityConditionContext _localctx = new AvailabilityConditionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_availabilityCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(777);
			match(T__26);
			setState(778);
			match(T__27);
			setState(779);
			availabilityArguments();
			setState(780);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AvailabilityArgumentsContext extends ParserRuleContext {
		public AvailabilityArgumentContext availabilityArgument() {
			return getRuleContext(AvailabilityArgumentContext.class,0);
		}
		public List<AvailabilityArgumentsContext> availabilityArguments() {
			return getRuleContexts(AvailabilityArgumentsContext.class);
		}
		public AvailabilityArgumentsContext availabilityArguments(int i) {
			return getRuleContext(AvailabilityArgumentsContext.class,i);
		}
		public AvailabilityArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availabilityArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAvailabilityArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAvailabilityArguments(this);
		}
	}

	public final AvailabilityArgumentsContext availabilityArguments() throws RecognitionException {
		AvailabilityArgumentsContext _localctx = new AvailabilityArgumentsContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_availabilityArguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(782);
			availabilityArgument();
			setState(787);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(783);
					match(T__13);
					setState(784);
					availabilityArguments();
					}
					} 
				}
				setState(789);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AvailabilityArgumentContext extends ParserRuleContext {
		public PlatformNameContext platformName() {
			return getRuleContext(PlatformNameContext.class,0);
		}
		public PlatformVersionContext platformVersion() {
			return getRuleContext(PlatformVersionContext.class,0);
		}
		public AvailabilityArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_availabilityArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAvailabilityArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAvailabilityArgument(this);
		}
	}

	public final AvailabilityArgumentContext availabilityArgument() throws RecognitionException {
		AvailabilityArgumentContext _localctx = new AvailabilityArgumentContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_availabilityArgument);
		try {
			setState(794);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
				enterOuterAlt(_localctx, 1);
				{
				setState(790);
				platformName();
				setState(791);
				platformVersion();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(793);
				match(T__29);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlatformNameContext extends ParserRuleContext {
		public PlatformNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_platformName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPlatformName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPlatformName(this);
		}
	}

	public final PlatformNameContext platformName() throws RecognitionException {
		PlatformNameContext _localctx = new PlatformNameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_platformName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(796);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PlatformVersionContext extends ParserRuleContext {
		public TerminalNode VersionLiteral() { return getToken(SwiftParser.VersionLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(SwiftParser.DecimalLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(SwiftParser.FloatingPointLiteral, 0); }
		public PlatformVersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_platformVersion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPlatformVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPlatformVersion(this);
		}
	}

	public final PlatformVersionContext platformVersion() throws RecognitionException {
		PlatformVersionContext _localctx = new PlatformVersionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_platformVersion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(798);
			_la = _input.LA(1);
			if ( !(((((_la - 146)) & ~0x3f) == 0 && ((1L << (_la - 146)) & ((1L << (DecimalLiteral - 146)) | (1L << (FloatingPointLiteral - 146)) | (1L << (VersionLiteral - 146)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericParameterClauseContext extends ParserRuleContext {
		public GenericParameterListContext genericParameterList() {
			return getRuleContext(GenericParameterListContext.class,0);
		}
		public RequirementClauseContext requirementClause() {
			return getRuleContext(RequirementClauseContext.class,0);
		}
		public GenericParameterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericParameterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGenericParameterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGenericParameterClause(this);
		}
	}

	public final GenericParameterClauseContext genericParameterClause() throws RecognitionException {
		GenericParameterClauseContext _localctx = new GenericParameterClauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_genericParameterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			match(T__38);
			setState(801);
			genericParameterList();
			setState(803);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(802);
				requirementClause();
				}
			}

			setState(805);
			match(T__39);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericParameterListContext extends ParserRuleContext {
		public List<GenericParameterContext> genericParameter() {
			return getRuleContexts(GenericParameterContext.class);
		}
		public GenericParameterContext genericParameter(int i) {
			return getRuleContext(GenericParameterContext.class,i);
		}
		public GenericParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGenericParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGenericParameterList(this);
		}
	}

	public final GenericParameterListContext genericParameterList() throws RecognitionException {
		GenericParameterListContext _localctx = new GenericParameterListContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_genericParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(807);
			genericParameter();
			setState(812);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(808);
				match(T__13);
				setState(809);
				genericParameter();
				}
				}
				setState(814);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericParameterContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ProtocolCompositionTypeContext protocolCompositionType() {
			return getRuleContext(ProtocolCompositionTypeContext.class,0);
		}
		public GenericParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGenericParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGenericParameter(this);
		}
	}

	public final GenericParameterContext genericParameter() throws RecognitionException {
		GenericParameterContext _localctx = new GenericParameterContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_genericParameter);
		try {
			setState(824);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(815);
				typeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(816);
				typeName();
				setState(817);
				match(T__1);
				setState(818);
				typeIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(820);
				typeName();
				setState(821);
				match(T__1);
				setState(822);
				protocolCompositionType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequirementClauseContext extends ParserRuleContext {
		public RequirementListContext requirementList() {
			return getRuleContext(RequirementListContext.class,0);
		}
		public RequirementClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirementClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRequirementClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRequirementClause(this);
		}
	}

	public final RequirementClauseContext requirementClause() throws RecognitionException {
		RequirementClauseContext _localctx = new RequirementClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_requirementClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(826);
			match(T__25);
			setState(827);
			requirementList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequirementListContext extends ParserRuleContext {
		public List<RequirementContext> requirement() {
			return getRuleContexts(RequirementContext.class);
		}
		public RequirementContext requirement(int i) {
			return getRuleContext(RequirementContext.class,i);
		}
		public RequirementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRequirementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRequirementList(this);
		}
	}

	public final RequirementListContext requirementList() throws RecognitionException {
		RequirementListContext _localctx = new RequirementListContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_requirementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(829);
			requirement();
			setState(834);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(830);
				match(T__13);
				setState(831);
				requirement();
				}
				}
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequirementContext extends ParserRuleContext {
		public ConformanceRequirementContext conformanceRequirement() {
			return getRuleContext(ConformanceRequirementContext.class,0);
		}
		public SameTypeRequirementContext sameTypeRequirement() {
			return getRuleContext(SameTypeRequirementContext.class,0);
		}
		public RequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRequirement(this);
		}
	}

	public final RequirementContext requirement() throws RecognitionException {
		RequirementContext _localctx = new RequirementContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_requirement);
		try {
			setState(839);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(837);
				conformanceRequirement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(838);
				sameTypeRequirement();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConformanceRequirementContext extends ParserRuleContext {
		public List<TypeIdentifierContext> typeIdentifier() {
			return getRuleContexts(TypeIdentifierContext.class);
		}
		public TypeIdentifierContext typeIdentifier(int i) {
			return getRuleContext(TypeIdentifierContext.class,i);
		}
		public ProtocolCompositionTypeContext protocolCompositionType() {
			return getRuleContext(ProtocolCompositionTypeContext.class,0);
		}
		public ConformanceRequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conformanceRequirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterConformanceRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitConformanceRequirement(this);
		}
	}

	public final ConformanceRequirementContext conformanceRequirement() throws RecognitionException {
		ConformanceRequirementContext _localctx = new ConformanceRequirementContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_conformanceRequirement);
		try {
			setState(849);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(841);
				typeIdentifier();
				setState(842);
				match(T__1);
				setState(843);
				typeIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(845);
				typeIdentifier();
				setState(846);
				match(T__1);
				setState(847);
				protocolCompositionType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SameTypeRequirementContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public SameTypeRequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sameTypeRequirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSameTypeRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSameTypeRequirement(this);
		}
	}

	public final SameTypeRequirementContext sameTypeRequirement() throws RecognitionException {
		SameTypeRequirementContext _localctx = new SameTypeRequirementContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_sameTypeRequirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(851);
			typeIdentifier();
			setState(852);
			match(T__40);
			setState(853);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericArgumentClauseContext extends ParserRuleContext {
		public GenericArgumentListContext genericArgumentList() {
			return getRuleContext(GenericArgumentListContext.class,0);
		}
		public GenericArgumentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgumentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGenericArgumentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGenericArgumentClause(this);
		}
	}

	public final GenericArgumentClauseContext genericArgumentClause() throws RecognitionException {
		GenericArgumentClauseContext _localctx = new GenericArgumentClauseContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_genericArgumentClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(855);
			match(T__38);
			setState(856);
			genericArgumentList();
			setState(857);
			match(T__39);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericArgumentListContext extends ParserRuleContext {
		public List<GenericArgumentContext> genericArgument() {
			return getRuleContexts(GenericArgumentContext.class);
		}
		public GenericArgumentContext genericArgument(int i) {
			return getRuleContext(GenericArgumentContext.class,i);
		}
		public GenericArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGenericArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGenericArgumentList(this);
		}
	}

	public final GenericArgumentListContext genericArgumentList() throws RecognitionException {
		GenericArgumentListContext _localctx = new GenericArgumentListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_genericArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			genericArgument();
			setState(864);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(860);
				match(T__13);
				setState(861);
				genericArgument();
				}
				}
				setState(866);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GenericArgumentContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public GenericArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGenericArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGenericArgument(this);
		}
	}

	public final GenericArgumentContext genericArgument() throws RecognitionException {
		GenericArgumentContext _localctx = new GenericArgumentContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_genericArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(867);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationContext extends ParserRuleContext {
		public ImportDeclarationContext importDeclaration() {
			return getRuleContext(ImportDeclarationContext.class,0);
		}
		public ConstantDeclarationContext constantDeclaration() {
			return getRuleContext(ConstantDeclarationContext.class,0);
		}
		public VariableDeclarationContext variableDeclaration() {
			return getRuleContext(VariableDeclarationContext.class,0);
		}
		public TypealiasDeclarationContext typealiasDeclaration() {
			return getRuleContext(TypealiasDeclarationContext.class,0);
		}
		public FunctionDeclarationContext functionDeclaration() {
			return getRuleContext(FunctionDeclarationContext.class,0);
		}
		public EnumDeclarationContext enumDeclaration() {
			return getRuleContext(EnumDeclarationContext.class,0);
		}
		public StructDeclarationContext structDeclaration() {
			return getRuleContext(StructDeclarationContext.class,0);
		}
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ProtocolDeclarationContext protocolDeclaration() {
			return getRuleContext(ProtocolDeclarationContext.class,0);
		}
		public InitializerDeclarationContext initializerDeclaration() {
			return getRuleContext(InitializerDeclarationContext.class,0);
		}
		public DeinitializerDeclarationContext deinitializerDeclaration() {
			return getRuleContext(DeinitializerDeclarationContext.class,0);
		}
		public ExtensionDeclarationContext extensionDeclaration() {
			return getRuleContext(ExtensionDeclarationContext.class,0);
		}
		public SubscriptDeclarationContext subscriptDeclaration() {
			return getRuleContext(SubscriptDeclarationContext.class,0);
		}
		public OperatorDeclarationContext operatorDeclaration() {
			return getRuleContext(OperatorDeclarationContext.class,0);
		}
		public CompilerControlStatementContext compilerControlStatement() {
			return getRuleContext(CompilerControlStatementContext.class,0);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_declaration);
		try {
			setState(929);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(869);
				importDeclaration();
				setState(871);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(870);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(873);
				constantDeclaration();
				setState(875);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(874);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(877);
				variableDeclaration();
				setState(879);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(878);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(881);
				typealiasDeclaration();
				setState(883);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(882);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(885);
				functionDeclaration();
				setState(887);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(886);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(889);
				enumDeclaration();
				setState(891);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(890);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(893);
				structDeclaration();
				setState(895);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(894);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(897);
				classDeclaration();
				setState(899);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(898);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(901);
				protocolDeclaration();
				setState(903);
				switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
				case 1:
					{
					setState(902);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(905);
				initializerDeclaration();
				setState(907);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(906);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(909);
				deinitializerDeclaration();
				setState(911);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(910);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(913);
				extensionDeclaration();
				setState(915);
				switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
				case 1:
					{
					setState(914);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(917);
				subscriptDeclaration();
				setState(919);
				switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
				case 1:
					{
					setState(918);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(921);
				operatorDeclaration();
				setState(923);
				switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
				case 1:
					{
					setState(922);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(925);
				compilerControlStatement();
				setState(927);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(926);
					match(T__0);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationsContext extends ParserRuleContext {
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public DeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeclarations(this);
		}
	}

	public final DeclarationsContext declarations() throws RecognitionException {
		DeclarationsContext _localctx = new DeclarationsContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_declarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(932); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(931);
				declaration();
				}
				}
				setState(934); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__97 - 64)) | (1L << (T__107 - 64)) | (1L << (T__124 - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationModifiersContext extends ParserRuleContext {
		public List<DeclarationModifierContext> declarationModifier() {
			return getRuleContexts(DeclarationModifierContext.class);
		}
		public DeclarationModifierContext declarationModifier(int i) {
			return getRuleContext(DeclarationModifierContext.class,i);
		}
		public DeclarationModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeclarationModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeclarationModifiers(this);
		}
	}

	public final DeclarationModifiersContext declarationModifiers() throws RecognitionException {
		DeclarationModifiersContext _localctx = new DeclarationModifiersContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_declarationModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(936);
				declarationModifier();
				}
				}
				setState(939); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclarationModifierContext extends ParserRuleContext {
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public DeclarationModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeclarationModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeclarationModifier(this);
		}
	}

	public final DeclarationModifierContext declarationModifier() throws RecognitionException {
		DeclarationModifierContext _localctx = new DeclarationModifierContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_declarationModifier);
		try {
			setState(966);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(941);
				match(T__41);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(942);
				match(T__42);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(943);
				match(T__43);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(944);
				match(T__44);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(945);
				match(T__45);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(946);
				match(T__46);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(947);
				match(T__47);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(948);
				match(T__48);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(949);
				match(T__49);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(950);
				match(T__50);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(951);
				match(T__51);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(952);
				match(T__52);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(953);
				match(T__53);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(954);
				match(T__54);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(955);
				match(T__55);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(956);
				match(T__55);
				setState(957);
				match(T__27);
				setState(958);
				match(T__56);
				setState(959);
				match(T__28);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(960);
				match(T__55);
				setState(961);
				match(T__27);
				setState(962);
				match(T__57);
				setState(963);
				match(T__28);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(964);
				match(T__58);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(965);
				accessLevelModifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessLevelModifierContext extends ParserRuleContext {
		public AccessLevelModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessLevelModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAccessLevelModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAccessLevelModifier(this);
		}
	}

	public final AccessLevelModifierContext accessLevelModifier() throws RecognitionException {
		AccessLevelModifierContext _localctx = new AccessLevelModifierContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_accessLevelModifier);
		try {
			setState(983);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(968);
				match(T__59);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(969);
				match(T__59);
				setState(970);
				match(T__27);
				setState(971);
				match(T__60);
				setState(972);
				match(T__28);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(973);
				match(T__61);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(974);
				match(T__61);
				setState(975);
				match(T__27);
				setState(976);
				match(T__60);
				setState(977);
				match(T__28);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(978);
				match(T__62);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(979);
				match(T__62);
				setState(980);
				match(T__27);
				setState(981);
				match(T__60);
				setState(982);
				match(T__28);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessLevelModifiersContext extends ParserRuleContext {
		public List<AccessLevelModifierContext> accessLevelModifier() {
			return getRuleContexts(AccessLevelModifierContext.class);
		}
		public AccessLevelModifierContext accessLevelModifier(int i) {
			return getRuleContext(AccessLevelModifierContext.class,i);
		}
		public AccessLevelModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessLevelModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAccessLevelModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAccessLevelModifiers(this);
		}
	}

	public final AccessLevelModifiersContext accessLevelModifiers() throws RecognitionException {
		AccessLevelModifiersContext _localctx = new AccessLevelModifiersContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_accessLevelModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(986); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(985);
				accessLevelModifier();
				}
				}
				setState(988); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CodeBlockContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public CodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_codeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCodeBlock(this);
		}
	}

	public final CodeBlockContext codeBlock() throws RecognitionException {
		CodeBlockContext _localctx = new CodeBlockContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_codeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(990);
			match(T__11);
			setState(992);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__77 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__124 - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (T__128 - 129)) | (1L << (T__129 - 129)) | (1L << (T__131 - 129)) | (1L << (T__132 - 129)) | (1L << (T__133 - 129)) | (1L << (T__134 - 129)) | (1L << (T__135 - 129)) | (1L << (BooleanLiteral - 129)) | (1L << (NilLiteral - 129)) | (1L << (OperatorHead - 129)) | (1L << (DotOperatorHead - 129)) | (1L << (Identifier - 129)) | (1L << (BinaryLiteral - 129)) | (1L << (OctalLiteral - 129)) | (1L << (DecimalLiteral - 129)) | (1L << (HexadecimalLiteral - 129)) | (1L << (FloatingPointLiteral - 129)) | (1L << (StringLiteral - 129)))) != 0)) {
				{
				setState(991);
				statements();
				}
			}

			setState(994);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportDeclarationContext extends ParserRuleContext {
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ImportKindContext importKind() {
			return getRuleContext(ImportKindContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImportDeclaration(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(996);
				attributes();
				}
			}

			setState(999);
			match(T__63);
			setState(1001);
			_la = _input.LA(1);
			if (((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (T__23 - 24)) | (1L << (T__24 - 24)) | (1L << (T__41 - 24)) | (1L << (T__64 - 24)) | (1L << (T__65 - 24)) | (1L << (T__66 - 24)) | (1L << (T__67 - 24)) | (1L << (T__68 - 24)))) != 0)) {
				{
				setState(1000);
				importKind();
				}
			}

			setState(1003);
			importPath();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportKindContext extends ParserRuleContext {
		public ImportKindContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importKind; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImportKind(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImportKind(this);
		}
	}

	public final ImportKindContext importKind() throws RecognitionException {
		ImportKindContext _localctx = new ImportKindContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_importKind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1005);
			_la = _input.LA(1);
			if ( !(((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (T__23 - 24)) | (1L << (T__24 - 24)) | (1L << (T__41 - 24)) | (1L << (T__64 - 24)) | (1L << (T__65 - 24)) | (1L << (T__66 - 24)) | (1L << (T__67 - 24)) | (1L << (T__68 - 24)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportPathContext extends ParserRuleContext {
		public ImportPathIdentifierContext importPathIdentifier() {
			return getRuleContext(ImportPathIdentifierContext.class,0);
		}
		public ImportPathContext importPath() {
			return getRuleContext(ImportPathContext.class,0);
		}
		public ImportPathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPath; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImportPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImportPath(this);
		}
	}

	public final ImportPathContext importPath() throws RecognitionException {
		ImportPathContext _localctx = new ImportPathContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_importPath);
		try {
			setState(1012);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1007);
				importPathIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1008);
				importPathIdentifier();
				setState(1009);
				match(T__69);
				setState(1010);
				importPath();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportPathIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public ImportPathIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importPathIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImportPathIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImportPathIdentifier(this);
		}
	}

	public final ImportPathIdentifierContext importPathIdentifier() throws RecognitionException {
		ImportPathIdentifierContext _localctx = new ImportPathIdentifierContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_importPathIdentifier);
		try {
			setState(1016);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
			case T__34:
			case T__36:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__55:
			case T__56:
			case T__58:
			case T__60:
			case T__71:
			case T__72:
			case T__73:
			case T__81:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__121:
			case T__122:
			case T__128:
			case T__129:
			case T__131:
			case T__132:
			case T__133:
			case T__134:
			case T__135:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1014);
				identifier();
				}
				break;
			case T__29:
			case T__38:
			case T__39:
			case T__40:
			case T__70:
			case T__77:
			case T__84:
			case T__85:
			case T__100:
			case T__102:
			case T__104:
			case T__116:
			case T__117:
			case T__118:
			case T__119:
			case T__120:
			case OperatorHead:
			case DotOperatorHead:
				enterOuterAlt(_localctx, 2);
				{
				setState(1015);
				operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantDeclarationContext extends ParserRuleContext {
		public PatternInitializerListContext patternInitializerList() {
			return getRuleContext(PatternInitializerListContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public ConstantDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterConstantDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitConstantDeclaration(this);
		}
	}

	public final ConstantDeclarationContext constantDeclaration() throws RecognitionException {
		ConstantDeclarationContext _localctx = new ConstantDeclarationContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1019);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1018);
				attributes();
				}
			}

			setState(1022);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1021);
				declarationModifiers();
				}
			}

			setState(1024);
			match(T__23);
			setState(1025);
			patternInitializerList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternInitializerListContext extends ParserRuleContext {
		public List<PatternInitializerContext> patternInitializer() {
			return getRuleContexts(PatternInitializerContext.class);
		}
		public PatternInitializerContext patternInitializer(int i) {
			return getRuleContext(PatternInitializerContext.class,i);
		}
		public PatternInitializerListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternInitializerList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPatternInitializerList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPatternInitializerList(this);
		}
	}

	public final PatternInitializerListContext patternInitializerList() throws RecognitionException {
		PatternInitializerListContext _localctx = new PatternInitializerListContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_patternInitializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1027);
			patternInitializer();
			setState(1032);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(1028);
				match(T__13);
				setState(1029);
				patternInitializer();
				}
				}
				setState(1034);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternInitializerContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public PatternInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_patternInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPatternInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPatternInitializer(this);
		}
	}

	public final PatternInitializerContext patternInitializer() throws RecognitionException {
		PatternInitializerContext _localctx = new PatternInitializerContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_patternInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			pattern(0);
			setState(1037);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(1036);
				initializer();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public InitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializer(this);
		}
	}

	public final InitializerContext initializer() throws RecognitionException {
		InitializerContext _localctx = new InitializerContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			match(T__70);
			setState(1040);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationContext extends ParserRuleContext {
		public VariableDeclarationHeadContext variableDeclarationHead() {
			return getRuleContext(VariableDeclarationHeadContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public GetterSetterBlockContext getterSetterBlock() {
			return getRuleContext(GetterSetterBlockContext.class,0);
		}
		public GetterSetterKeywordBlockContext getterSetterKeywordBlock() {
			return getRuleContext(GetterSetterKeywordBlockContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
		}
		public WillSetDidSetBlockContext willSetDidSetBlock() {
			return getRuleContext(WillSetDidSetBlockContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public PatternInitializerListContext patternInitializerList() {
			return getRuleContext(PatternInitializerListContext.class,0);
		}
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_variableDeclaration);
		int _la;
		try {
			setState(1073);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1042);
				variableDeclarationHead();
				setState(1043);
				variableName();
				setState(1044);
				typeAnnotation();
				setState(1045);
				getterSetterBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1047);
				variableDeclarationHead();
				setState(1048);
				variableName();
				setState(1049);
				typeAnnotation();
				setState(1050);
				getterSetterKeywordBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1052);
				variableDeclarationHead();
				setState(1053);
				variableName();
				setState(1054);
				initializer();
				setState(1055);
				willSetDidSetBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1057);
				variableDeclarationHead();
				setState(1058);
				variableName();
				setState(1059);
				typeAnnotation();
				setState(1061);
				_la = _input.LA(1);
				if (_la==T__70) {
					{
					setState(1060);
					initializer();
					}
				}

				setState(1063);
				willSetDidSetBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1065);
				variableDeclarationHead();
				setState(1066);
				variableName();
				setState(1067);
				typeAnnotation();
				setState(1068);
				codeBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1070);
				variableDeclarationHead();
				setState(1071);
				patternInitializerList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableDeclarationHeadContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public VariableDeclarationHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclarationHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterVariableDeclarationHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitVariableDeclarationHead(this);
		}
	}

	public final VariableDeclarationHeadContext variableDeclarationHead() throws RecognitionException {
		VariableDeclarationHeadContext _localctx = new VariableDeclarationHeadContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_variableDeclarationHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1076);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1075);
				attributes();
				}
			}

			setState(1079);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1078);
				declarationModifiers();
				}
			}

			setState(1081);
			match(T__24);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public VariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitVariableName(this);
		}
	}

	public final VariableNameContext variableName() throws RecognitionException {
		VariableNameContext _localctx = new VariableNameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1083);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterSetterBlockContext extends ParserRuleContext {
		public GetterClauseContext getterClause() {
			return getRuleContext(GetterClauseContext.class,0);
		}
		public SetterClauseContext setterClause() {
			return getRuleContext(SetterClauseContext.class,0);
		}
		public GetterSetterBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getterSetterBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGetterSetterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGetterSetterBlock(this);
		}
	}

	public final GetterSetterBlockContext getterSetterBlock() throws RecognitionException {
		GetterSetterBlockContext _localctx = new GetterSetterBlockContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_getterSetterBlock);
		int _la;
		try {
			setState(1097);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1085);
				match(T__11);
				setState(1086);
				getterClause();
				setState(1088);
				_la = _input.LA(1);
				if (((((_la - 42)) & ~0x3f) == 0 && ((1L << (_la - 42)) & ((1L << (T__41 - 42)) | (1L << (T__42 - 42)) | (1L << (T__43 - 42)) | (1L << (T__44 - 42)) | (1L << (T__45 - 42)) | (1L << (T__46 - 42)) | (1L << (T__47 - 42)) | (1L << (T__48 - 42)) | (1L << (T__49 - 42)) | (1L << (T__50 - 42)) | (1L << (T__51 - 42)) | (1L << (T__52 - 42)) | (1L << (T__53 - 42)) | (1L << (T__54 - 42)) | (1L << (T__55 - 42)) | (1L << (T__58 - 42)) | (1L << (T__59 - 42)) | (1L << (T__60 - 42)) | (1L << (T__61 - 42)) | (1L << (T__62 - 42)) | (1L << (T__97 - 42)))) != 0)) {
					{
					setState(1087);
					setterClause();
					}
				}

				setState(1090);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1092);
				match(T__11);
				setState(1093);
				setterClause();
				setState(1094);
				getterClause();
				setState(1095);
				match(T__12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterClauseContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public GetterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGetterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGetterClause(this);
		}
	}

	public final GetterClauseContext getterClause() throws RecognitionException {
		GetterClauseContext _localctx = new GetterClauseContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_getterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1099);
				attributes();
				}
			}

			setState(1103);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1102);
				declarationModifiers();
				}
			}

			setState(1105);
			match(T__71);
			setState(1106);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetterClauseContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public SetterNameContext setterName() {
			return getRuleContext(SetterNameContext.class,0);
		}
		public SetterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSetterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSetterClause(this);
		}
	}

	public final SetterClauseContext setterClause() throws RecognitionException {
		SetterClauseContext _localctx = new SetterClauseContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_setterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1109);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1108);
				attributes();
				}
			}

			setState(1112);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1111);
				declarationModifiers();
				}
			}

			setState(1114);
			match(T__60);
			setState(1116);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(1115);
				setterName();
				}
			}

			setState(1118);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetterNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SetterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSetterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSetterName(this);
		}
	}

	public final SetterNameContext setterName() throws RecognitionException {
		SetterNameContext _localctx = new SetterNameContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_setterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1120);
			match(T__27);
			setState(1121);
			identifier();
			setState(1122);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterSetterKeywordBlockContext extends ParserRuleContext {
		public GetterKeywordClauseContext getterKeywordClause() {
			return getRuleContext(GetterKeywordClauseContext.class,0);
		}
		public SetterKeywordClauseContext setterKeywordClause() {
			return getRuleContext(SetterKeywordClauseContext.class,0);
		}
		public GetterSetterKeywordBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getterSetterKeywordBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGetterSetterKeywordBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGetterSetterKeywordBlock(this);
		}
	}

	public final GetterSetterKeywordBlockContext getterSetterKeywordBlock() throws RecognitionException {
		GetterSetterKeywordBlockContext _localctx = new GetterSetterKeywordBlockContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_getterSetterKeywordBlock);
		int _la;
		try {
			setState(1136);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1124);
				match(T__11);
				setState(1125);
				getterKeywordClause();
				setState(1127);
				_la = _input.LA(1);
				if (_la==T__60 || _la==T__97) {
					{
					setState(1126);
					setterKeywordClause();
					}
				}

				setState(1129);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1131);
				match(T__11);
				setState(1132);
				setterKeywordClause();
				setState(1133);
				getterKeywordClause();
				setState(1134);
				match(T__12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GetterKeywordClauseContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public GetterKeywordClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_getterKeywordClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGetterKeywordClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGetterKeywordClause(this);
		}
	}

	public final GetterKeywordClauseContext getterKeywordClause() throws RecognitionException {
		GetterKeywordClauseContext _localctx = new GetterKeywordClauseContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_getterKeywordClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1138);
				attributes();
				}
			}

			setState(1141);
			match(T__71);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetterKeywordClauseContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public SetterKeywordClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setterKeywordClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSetterKeywordClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSetterKeywordClause(this);
		}
	}

	public final SetterKeywordClauseContext setterKeywordClause() throws RecognitionException {
		SetterKeywordClauseContext _localctx = new SetterKeywordClauseContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_setterKeywordClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1144);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1143);
				attributes();
				}
			}

			setState(1146);
			match(T__60);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WillSetDidSetBlockContext extends ParserRuleContext {
		public WillSetClauseContext willSetClause() {
			return getRuleContext(WillSetClauseContext.class,0);
		}
		public DidSetClauseContext didSetClause() {
			return getRuleContext(DidSetClauseContext.class,0);
		}
		public WillSetDidSetBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSetDidSetBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWillSetDidSetBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWillSetDidSetBlock(this);
		}
	}

	public final WillSetDidSetBlockContext willSetDidSetBlock() throws RecognitionException {
		WillSetDidSetBlockContext _localctx = new WillSetDidSetBlockContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_willSetDidSetBlock);
		int _la;
		try {
			setState(1162);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1148);
				match(T__11);
				setState(1149);
				willSetClause();
				setState(1151);
				_la = _input.LA(1);
				if (_la==T__73 || _la==T__97) {
					{
					setState(1150);
					didSetClause();
					}
				}

				setState(1153);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1155);
				match(T__11);
				setState(1156);
				didSetClause();
				setState(1158);
				_la = _input.LA(1);
				if (_la==T__72 || _la==T__97) {
					{
					setState(1157);
					willSetClause();
					}
				}

				setState(1160);
				match(T__12);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WillSetClauseContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public SetterNameContext setterName() {
			return getRuleContext(SetterNameContext.class,0);
		}
		public WillSetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_willSetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWillSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWillSetClause(this);
		}
	}

	public final WillSetClauseContext willSetClause() throws RecognitionException {
		WillSetClauseContext _localctx = new WillSetClauseContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_willSetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1165);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1164);
				attributes();
				}
			}

			setState(1167);
			match(T__72);
			setState(1169);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(1168);
				setterName();
				}
			}

			setState(1171);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DidSetClauseContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public SetterNameContext setterName() {
			return getRuleContext(SetterNameContext.class,0);
		}
		public DidSetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_didSetClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDidSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDidSetClause(this);
		}
	}

	public final DidSetClauseContext didSetClause() throws RecognitionException {
		DidSetClauseContext _localctx = new DidSetClauseContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_didSetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1174);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1173);
				attributes();
				}
			}

			setState(1176);
			match(T__73);
			setState(1178);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(1177);
				setterName();
				}
			}

			setState(1180);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypealiasDeclarationContext extends ParserRuleContext {
		public TypealiasHeadContext typealiasHead() {
			return getRuleContext(TypealiasHeadContext.class,0);
		}
		public TypealiasAssignmentContext typealiasAssignment() {
			return getRuleContext(TypealiasAssignmentContext.class,0);
		}
		public TypealiasDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealiasDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypealiasDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypealiasDeclaration(this);
		}
	}

	public final TypealiasDeclarationContext typealiasDeclaration() throws RecognitionException {
		TypealiasDeclarationContext _localctx = new TypealiasDeclarationContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_typealiasDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1182);
			typealiasHead();
			setState(1183);
			typealiasAssignment();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypealiasHeadContext extends ParserRuleContext {
		public TypealiasNameContext typealiasName() {
			return getRuleContext(TypealiasNameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public TypealiasHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealiasHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypealiasHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypealiasHead(this);
		}
	}

	public final TypealiasHeadContext typealiasHead() throws RecognitionException {
		TypealiasHeadContext _localctx = new TypealiasHeadContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_typealiasHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1186);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1185);
				attributes();
				}
			}

			setState(1189);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1188);
				accessLevelModifier();
				}
			}

			setState(1191);
			match(T__64);
			setState(1192);
			typealiasName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypealiasNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypealiasNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealiasName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypealiasName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypealiasName(this);
		}
	}

	public final TypealiasNameContext typealiasName() throws RecognitionException {
		TypealiasNameContext _localctx = new TypealiasNameContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_typealiasName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1194);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypealiasAssignmentContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public TypealiasAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typealiasAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypealiasAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypealiasAssignment(this);
		}
	}

	public final TypealiasAssignmentContext typealiasAssignment() throws RecognitionException {
		TypealiasAssignmentContext _localctx = new TypealiasAssignmentContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_typealiasAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1196);
			match(T__70);
			setState(1197);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclarationContext extends ParserRuleContext {
		public FunctionHeadContext functionHead() {
			return getRuleContext(FunctionHeadContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public FunctionBodyContext functionBody() {
			return getRuleContext(FunctionBodyContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionDeclaration(this);
		}
	}

	public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
		FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_functionDeclaration);
		int _la;
		try {
			setState(1214);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1199);
				functionHead();
				setState(1200);
				functionName();
				setState(1202);
				_la = _input.LA(1);
				if (_la==T__38) {
					{
					setState(1201);
					genericParameterClause();
					}
				}

				setState(1204);
				functionSignature();
				setState(1205);
				functionBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1207);
				functionHead();
				setState(1208);
				functionName();
				setState(1210);
				_la = _input.LA(1);
				if (_la==T__38) {
					{
					setState(1209);
					genericParameterClause();
					}
				}

				setState(1212);
				functionSignature();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionHeadContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public FunctionHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionHead(this);
		}
	}

	public final FunctionHeadContext functionHead() throws RecognitionException {
		FunctionHeadContext _localctx = new FunctionHeadContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_functionHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1217);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1216);
				attributes();
				}
			}

			setState(1220);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1219);
				declarationModifiers();
				}
			}

			setState(1222);
			match(T__68);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_functionName);
		try {
			setState(1226);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
			case T__34:
			case T__36:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__55:
			case T__56:
			case T__58:
			case T__60:
			case T__71:
			case T__72:
			case T__73:
			case T__81:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__121:
			case T__122:
			case T__128:
			case T__129:
			case T__131:
			case T__132:
			case T__133:
			case T__134:
			case T__135:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1224);
				identifier();
				}
				break;
			case T__29:
			case T__38:
			case T__39:
			case T__40:
			case T__70:
			case T__77:
			case T__84:
			case T__85:
			case T__100:
			case T__102:
			case T__104:
			case T__116:
			case T__117:
			case T__118:
			case T__119:
			case T__120:
			case OperatorHead:
			case DotOperatorHead:
				enterOuterAlt(_localctx, 2);
				{
				setState(1225);
				operator();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionSignatureContext extends ParserRuleContext {
		public ParameterClauseContext parameterClause() {
			return getRuleContext(ParameterClauseContext.class,0);
		}
		public FunctionResultContext functionResult() {
			return getRuleContext(FunctionResultContext.class,0);
		}
		public FunctionSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionSignature(this);
		}
	}

	public final FunctionSignatureContext functionSignature() throws RecognitionException {
		FunctionSignatureContext _localctx = new FunctionSignatureContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_functionSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1228);
			parameterClause();
			setState(1230);
			_la = _input.LA(1);
			if (_la==T__74 || _la==T__75) {
				{
				setState(1229);
				_la = _input.LA(1);
				if ( !(_la==T__74 || _la==T__75) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1233);
			_la = _input.LA(1);
			if (_la==T__76) {
				{
				setState(1232);
				functionResult();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionResultContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public FunctionResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionResult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionResult(this);
		}
	}

	public final FunctionResultContext functionResult() throws RecognitionException {
		FunctionResultContext _localctx = new FunctionResultContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_functionResult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1235);
			match(T__76);
			setState(1237);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1236);
				attributes();
				}
			}

			setState(1239);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionBodyContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionBody(this);
		}
	}

	public final FunctionBodyContext functionBody() throws RecognitionException {
		FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterClauseContext extends ParserRuleContext {
		public ParameterListContext parameterList() {
			return getRuleContext(ParameterListContext.class,0);
		}
		public ParameterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParameterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParameterClause(this);
		}
	}

	public final ParameterClauseContext parameterClause() throws RecognitionException {
		ParameterClauseContext _localctx = new ParameterClauseContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_parameterClause);
		int _la;
		try {
			setState(1252);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1243);
				match(T__27);
				setState(1244);
				match(T__28);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1245);
				match(T__27);
				setState(1246);
				parameterList();
				setState(1248);
				_la = _input.LA(1);
				if (_la==T__77) {
					{
					setState(1247);
					match(T__77);
					}
				}

				setState(1250);
				match(T__28);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterListContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParameterList(this);
		}
	}

	public final ParameterListContext parameterList() throws RecognitionException {
		ParameterListContext _localctx = new ParameterListContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1254);
			parameter();
			setState(1259);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(1255);
				match(T__13);
				setState(1256);
				parameter();
				}
				}
				setState(1261);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public LocalParameterNameContext localParameterName() {
			return getRuleContext(LocalParameterNameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ExternalParameterNameContext externalParameterName() {
			return getRuleContext(ExternalParameterNameContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public DefaultArgumentClauseContext defaultArgumentClause() {
			return getRuleContext(DefaultArgumentClauseContext.class,0);
		}
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_parameter);
		int _la;
		try {
			setState(1312);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1263);
				_la = _input.LA(1);
				if (_la==T__97) {
					{
					setState(1262);
					attributes();
					}
				}

				setState(1266);
				_la = _input.LA(1);
				if (_la==T__78) {
					{
					setState(1265);
					match(T__78);
					}
				}

				setState(1269);
				_la = _input.LA(1);
				if (_la==T__23) {
					{
					setState(1268);
					match(T__23);
					}
				}

				setState(1272);
				_la = _input.LA(1);
				if (_la==T__79) {
					{
					setState(1271);
					match(T__79);
					}
				}

				setState(1275);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1274);
					externalParameterName();
					}
					break;
				}
				setState(1277);
				localParameterName();
				setState(1279);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1278);
					typeAnnotation();
					}
				}

				setState(1282);
				_la = _input.LA(1);
				if (_la==T__70) {
					{
					setState(1281);
					defaultArgumentClause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1285);
				_la = _input.LA(1);
				if (_la==T__78) {
					{
					setState(1284);
					match(T__78);
					}
				}

				setState(1287);
				match(T__24);
				setState(1289);
				_la = _input.LA(1);
				if (_la==T__79) {
					{
					setState(1288);
					match(T__79);
					}
				}

				setState(1292);
				switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
				case 1:
					{
					setState(1291);
					externalParameterName();
					}
					break;
				}
				setState(1294);
				localParameterName();
				setState(1296);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(1295);
					typeAnnotation();
					}
				}

				setState(1299);
				_la = _input.LA(1);
				if (_la==T__70) {
					{
					setState(1298);
					defaultArgumentClause();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1302);
				_la = _input.LA(1);
				if (_la==T__97) {
					{
					setState(1301);
					attributes();
					}
				}

				setState(1304);
				sType(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1306);
				switch ( getInterpreter().adaptivePredict(_input,128,_ctx) ) {
				case 1:
					{
					setState(1305);
					externalParameterName();
					}
					break;
				}
				setState(1308);
				localParameterName();
				setState(1309);
				typeAnnotation();
				setState(1310);
				match(T__77);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExternalParameterNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public ExternalParameterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalParameterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExternalParameterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExternalParameterName(this);
		}
	}

	public final ExternalParameterNameContext externalParameterName() throws RecognitionException {
		ExternalParameterNameContext _localctx = new ExternalParameterNameContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_externalParameterName);
		try {
			setState(1317);
			switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1314);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1315);
				keyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1316);
				match(T__80);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocalParameterNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LocalParameterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_localParameterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLocalParameterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLocalParameterName(this);
		}
	}

	public final LocalParameterNameContext localParameterName() throws RecognitionException {
		LocalParameterNameContext _localctx = new LocalParameterNameContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_localParameterName);
		try {
			setState(1321);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
			case T__34:
			case T__36:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__55:
			case T__56:
			case T__58:
			case T__60:
			case T__71:
			case T__72:
			case T__73:
			case T__81:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__121:
			case T__122:
			case T__128:
			case T__129:
			case T__131:
			case T__132:
			case T__133:
			case T__134:
			case T__135:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1319);
				identifier();
				}
				break;
			case T__80:
				enterOuterAlt(_localctx, 2);
				{
				setState(1320);
				match(T__80);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultArgumentClauseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefaultArgumentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultArgumentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDefaultArgumentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDefaultArgumentClause(this);
		}
	}

	public final DefaultArgumentClauseContext defaultArgumentClause() throws RecognitionException {
		DefaultArgumentClauseContext _localctx = new DefaultArgumentClauseContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_defaultArgumentClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1323);
			match(T__70);
			setState(1324);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDeclarationContext extends ParserRuleContext {
		public EnumDefContext enumDef() {
			return getRuleContext(EnumDefContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public EnumDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEnumDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEnumDeclaration(this);
		}
	}

	public final EnumDeclarationContext enumDeclaration() throws RecognitionException {
		EnumDeclarationContext _localctx = new EnumDeclarationContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1327);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1326);
				attributes();
				}
			}

			setState(1330);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1329);
				accessLevelModifier();
				}
			}

			setState(1332);
			enumDef();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumDefContext extends ParserRuleContext {
		public UnionStyleEnumContext unionStyleEnum() {
			return getRuleContext(UnionStyleEnumContext.class,0);
		}
		public RawValueStyleEnumContext rawValueStyleEnum() {
			return getRuleContext(RawValueStyleEnumContext.class,0);
		}
		public EnumDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEnumDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEnumDef(this);
		}
	}

	public final EnumDefContext enumDef() throws RecognitionException {
		EnumDefContext _localctx = new EnumDefContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_enumDef);
		try {
			setState(1336);
			switch ( getInterpreter().adaptivePredict(_input,134,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1334);
				unionStyleEnum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1335);
				rawValueStyleEnum();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionStyleEnumContext extends ParserRuleContext {
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public UnionStyleEnumMembersContext unionStyleEnumMembers() {
			return getRuleContext(UnionStyleEnumMembersContext.class,0);
		}
		public UnionStyleEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionStyleEnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnionStyleEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnionStyleEnum(this);
		}
	}

	public final UnionStyleEnumContext unionStyleEnum() throws RecognitionException {
		UnionStyleEnumContext _localctx = new UnionStyleEnumContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_unionStyleEnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1339);
			_la = _input.LA(1);
			if (_la==T__81) {
				{
				setState(1338);
				match(T__81);
				}
			}

			setState(1341);
			match(T__66);
			setState(1342);
			enumName();
			setState(1344);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(1343);
				genericParameterClause();
				}
			}

			setState(1347);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1346);
				typeInheritanceClause();
				}
			}

			setState(1349);
			match(T__11);
			setState(1351);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__23) | (1L << T__24) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__97 - 64)) | (1L << (T__107 - 64)) | (1L << (T__124 - 64)))) != 0)) {
				{
				setState(1350);
				unionStyleEnumMembers();
				}
			}

			setState(1353);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionStyleEnumMembersContext extends ParserRuleContext {
		public List<UnionStyleEnumMemberContext> unionStyleEnumMember() {
			return getRuleContexts(UnionStyleEnumMemberContext.class);
		}
		public UnionStyleEnumMemberContext unionStyleEnumMember(int i) {
			return getRuleContext(UnionStyleEnumMemberContext.class,i);
		}
		public UnionStyleEnumMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionStyleEnumMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnionStyleEnumMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnionStyleEnumMembers(this);
		}
	}

	public final UnionStyleEnumMembersContext unionStyleEnumMembers() throws RecognitionException {
		UnionStyleEnumMembersContext _localctx = new UnionStyleEnumMembersContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_unionStyleEnumMembers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1356); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1355);
				unionStyleEnumMember();
				}
				}
				setState(1358); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__23) | (1L << T__24) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__97 - 64)) | (1L << (T__107 - 64)) | (1L << (T__124 - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionStyleEnumMemberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public UnionStyleEnumCaseClauseContext unionStyleEnumCaseClause() {
			return getRuleContext(UnionStyleEnumCaseClauseContext.class,0);
		}
		public UnionStyleEnumMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionStyleEnumMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnionStyleEnumMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnionStyleEnumMember(this);
		}
	}

	public final UnionStyleEnumMemberContext unionStyleEnumMember() throws RecognitionException {
		UnionStyleEnumMemberContext _localctx = new UnionStyleEnumMemberContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_unionStyleEnumMember);
		int _la;
		try {
			setState(1365);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1360);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1361);
				unionStyleEnumCaseClause();
				setState(1363);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1362);
					match(T__0);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionStyleEnumCaseClauseContext extends ParserRuleContext {
		public UnionStyleEnumCaseListContext unionStyleEnumCaseList() {
			return getRuleContext(UnionStyleEnumCaseListContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public UnionStyleEnumCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionStyleEnumCaseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnionStyleEnumCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnionStyleEnumCaseClause(this);
		}
	}

	public final UnionStyleEnumCaseClauseContext unionStyleEnumCaseClause() throws RecognitionException {
		UnionStyleEnumCaseClauseContext _localctx = new UnionStyleEnumCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_unionStyleEnumCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1368);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1367);
				attributes();
				}
			}

			setState(1371);
			_la = _input.LA(1);
			if (_la==T__81) {
				{
				setState(1370);
				match(T__81);
				}
			}

			setState(1373);
			match(T__3);
			setState(1374);
			unionStyleEnumCaseList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionStyleEnumCaseListContext extends ParserRuleContext {
		public List<UnionStyleEnumCaseContext> unionStyleEnumCase() {
			return getRuleContexts(UnionStyleEnumCaseContext.class);
		}
		public UnionStyleEnumCaseContext unionStyleEnumCase(int i) {
			return getRuleContext(UnionStyleEnumCaseContext.class,i);
		}
		public UnionStyleEnumCaseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionStyleEnumCaseList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnionStyleEnumCaseList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnionStyleEnumCaseList(this);
		}
	}

	public final UnionStyleEnumCaseListContext unionStyleEnumCaseList() throws RecognitionException {
		UnionStyleEnumCaseListContext _localctx = new UnionStyleEnumCaseListContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_unionStyleEnumCaseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1376);
			unionStyleEnumCase();
			setState(1381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(1377);
				match(T__13);
				setState(1378);
				unionStyleEnumCase();
				}
				}
				setState(1383);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionStyleEnumCaseContext extends ParserRuleContext {
		public EnumCaseNameContext enumCaseName() {
			return getRuleContext(EnumCaseNameContext.class,0);
		}
		public TupleTypeContext tupleType() {
			return getRuleContext(TupleTypeContext.class,0);
		}
		public UnionStyleEnumCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionStyleEnumCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterUnionStyleEnumCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitUnionStyleEnumCase(this);
		}
	}

	public final UnionStyleEnumCaseContext unionStyleEnumCase() throws RecognitionException {
		UnionStyleEnumCaseContext _localctx = new UnionStyleEnumCaseContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_unionStyleEnumCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1384);
			enumCaseName();
			setState(1386);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(1385);
				tupleType();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEnumName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEnumName(this);
		}
	}

	public final EnumNameContext enumName() throws RecognitionException {
		EnumNameContext _localctx = new EnumNameContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumCaseNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public EnumCaseNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumCaseName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEnumCaseName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEnumCaseName(this);
		}
	}

	public final EnumCaseNameContext enumCaseName() throws RecognitionException {
		EnumCaseNameContext _localctx = new EnumCaseNameContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_enumCaseName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawValueStyleEnumContext extends ParserRuleContext {
		public EnumNameContext enumName() {
			return getRuleContext(EnumNameContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public RawValueStyleEnumMembersContext rawValueStyleEnumMembers() {
			return getRuleContext(RawValueStyleEnumMembersContext.class,0);
		}
		public RawValueStyleEnumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueStyleEnum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRawValueStyleEnum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRawValueStyleEnum(this);
		}
	}

	public final RawValueStyleEnumContext rawValueStyleEnum() throws RecognitionException {
		RawValueStyleEnumContext _localctx = new RawValueStyleEnumContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_rawValueStyleEnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1392);
			match(T__66);
			setState(1393);
			enumName();
			setState(1395);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(1394);
				genericParameterClause();
				}
			}

			setState(1398);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1397);
				typeInheritanceClause();
				}
			}

			setState(1400);
			match(T__11);
			setState(1402);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__23) | (1L << T__24) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__97 - 64)) | (1L << (T__107 - 64)) | (1L << (T__124 - 64)))) != 0)) {
				{
				setState(1401);
				rawValueStyleEnumMembers();
				}
			}

			setState(1404);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawValueStyleEnumMembersContext extends ParserRuleContext {
		public List<RawValueStyleEnumMemberContext> rawValueStyleEnumMember() {
			return getRuleContexts(RawValueStyleEnumMemberContext.class);
		}
		public RawValueStyleEnumMemberContext rawValueStyleEnumMember(int i) {
			return getRuleContext(RawValueStyleEnumMemberContext.class,i);
		}
		public RawValueStyleEnumMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueStyleEnumMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRawValueStyleEnumMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRawValueStyleEnumMembers(this);
		}
	}

	public final RawValueStyleEnumMembersContext rawValueStyleEnumMembers() throws RecognitionException {
		RawValueStyleEnumMembersContext _localctx = new RawValueStyleEnumMembersContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_rawValueStyleEnumMembers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1407); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1406);
				rawValueStyleEnumMember();
				}
				}
				setState(1409); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__23) | (1L << T__24) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__97 - 64)) | (1L << (T__107 - 64)) | (1L << (T__124 - 64)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawValueStyleEnumMemberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public RawValueStyleEnumCaseClauseContext rawValueStyleEnumCaseClause() {
			return getRuleContext(RawValueStyleEnumCaseClauseContext.class,0);
		}
		public RawValueStyleEnumMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueStyleEnumMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRawValueStyleEnumMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRawValueStyleEnumMember(this);
		}
	}

	public final RawValueStyleEnumMemberContext rawValueStyleEnumMember() throws RecognitionException {
		RawValueStyleEnumMemberContext _localctx = new RawValueStyleEnumMemberContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_rawValueStyleEnumMember);
		try {
			setState(1413);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1411);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1412);
				rawValueStyleEnumCaseClause();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawValueStyleEnumCaseClauseContext extends ParserRuleContext {
		public RawValueStyleEnumCaseListContext rawValueStyleEnumCaseList() {
			return getRuleContext(RawValueStyleEnumCaseListContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public RawValueStyleEnumCaseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueStyleEnumCaseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRawValueStyleEnumCaseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRawValueStyleEnumCaseClause(this);
		}
	}

	public final RawValueStyleEnumCaseClauseContext rawValueStyleEnumCaseClause() throws RecognitionException {
		RawValueStyleEnumCaseClauseContext _localctx = new RawValueStyleEnumCaseClauseContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_rawValueStyleEnumCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1416);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1415);
				attributes();
				}
			}

			setState(1418);
			match(T__3);
			setState(1419);
			rawValueStyleEnumCaseList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawValueStyleEnumCaseListContext extends ParserRuleContext {
		public List<RawValueStyleEnumCaseContext> rawValueStyleEnumCase() {
			return getRuleContexts(RawValueStyleEnumCaseContext.class);
		}
		public RawValueStyleEnumCaseContext rawValueStyleEnumCase(int i) {
			return getRuleContext(RawValueStyleEnumCaseContext.class,i);
		}
		public RawValueStyleEnumCaseListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueStyleEnumCaseList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRawValueStyleEnumCaseList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRawValueStyleEnumCaseList(this);
		}
	}

	public final RawValueStyleEnumCaseListContext rawValueStyleEnumCaseList() throws RecognitionException {
		RawValueStyleEnumCaseListContext _localctx = new RawValueStyleEnumCaseListContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_rawValueStyleEnumCaseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			rawValueStyleEnumCase();
			setState(1426);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(1422);
				match(T__13);
				setState(1423);
				rawValueStyleEnumCase();
				}
				}
				setState(1428);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawValueStyleEnumCaseContext extends ParserRuleContext {
		public EnumCaseNameContext enumCaseName() {
			return getRuleContext(EnumCaseNameContext.class,0);
		}
		public RawValueAssignmentContext rawValueAssignment() {
			return getRuleContext(RawValueAssignmentContext.class,0);
		}
		public RawValueStyleEnumCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueStyleEnumCase; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRawValueStyleEnumCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRawValueStyleEnumCase(this);
		}
	}

	public final RawValueStyleEnumCaseContext rawValueStyleEnumCase() throws RecognitionException {
		RawValueStyleEnumCaseContext _localctx = new RawValueStyleEnumCaseContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_rawValueStyleEnumCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1429);
			enumCaseName();
			setState(1431);
			_la = _input.LA(1);
			if (_la==T__70) {
				{
				setState(1430);
				rawValueAssignment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RawValueAssignmentContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public RawValueAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rawValueAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterRawValueAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitRawValueAssignment(this);
		}
	}

	public final RawValueAssignmentContext rawValueAssignment() throws RecognitionException {
		RawValueAssignmentContext _localctx = new RawValueAssignmentContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_rawValueAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1433);
			match(T__70);
			setState(1434);
			literal();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructDeclarationContext extends ParserRuleContext {
		public StructNameContext structName() {
			return getRuleContext(StructNameContext.class,0);
		}
		public StructBodyContext structBody() {
			return getRuleContext(StructBodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public StructDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStructDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStructDeclaration(this);
		}
	}

	public final StructDeclarationContext structDeclaration() throws RecognitionException {
		StructDeclarationContext _localctx = new StructDeclarationContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1437);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1436);
				attributes();
				}
			}

			setState(1440);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1439);
				accessLevelModifier();
				}
			}

			setState(1442);
			match(T__65);
			setState(1443);
			structName();
			setState(1445);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(1444);
				genericParameterClause();
				}
			}

			setState(1448);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1447);
				typeInheritanceClause();
				}
			}

			setState(1450);
			structBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StructNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStructName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStructName(this);
		}
	}

	public final StructNameContext structName() throws RecognitionException {
		StructNameContext _localctx = new StructNameContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_structName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StructBodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public StructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStructBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStructBody(this);
		}
	}

	public final StructBodyContext structBody() throws RecognitionException {
		StructBodyContext _localctx = new StructBodyContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_structBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1454);
			match(T__11);
			setState(1456);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__97 - 64)) | (1L << (T__107 - 64)) | (1L << (T__124 - 64)))) != 0)) {
				{
				setState(1455);
				declarations();
				}
			}

			setState(1458);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public ClassBodyContext classBody() {
			return getRuleContext(ClassBodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ClassDeclarationModifiersContext classDeclarationModifiers() {
			return getRuleContext(ClassDeclarationModifiersContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClassDeclaration(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1460);
				attributes();
				}
			}

			setState(1464);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__44) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1463);
				classDeclarationModifiers();
				}
			}

			setState(1466);
			match(T__41);
			setState(1467);
			className();
			setState(1469);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(1468);
				genericParameterClause();
				}
			}

			setState(1472);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1471);
				typeInheritanceClause();
				}
			}

			setState(1474);
			classBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassDeclarationModifiersContext extends ParserRuleContext {
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public ClassDeclarationModifiersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclarationModifiers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClassDeclarationModifiers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClassDeclarationModifiers(this);
		}
	}

	public final ClassDeclarationModifiersContext classDeclarationModifiers() throws RecognitionException {
		ClassDeclarationModifiersContext _localctx = new ClassDeclarationModifiersContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_classDeclarationModifiers);
		int _la;
		try {
			setState(1484);
			switch (_input.LA(1)) {
			case T__59:
			case T__61:
			case T__62:
				enterOuterAlt(_localctx, 1);
				{
				setState(1476);
				accessLevelModifier();
				setState(1478);
				_la = _input.LA(1);
				if (_la==T__44) {
					{
					setState(1477);
					match(T__44);
					}
				}

				}
				break;
			case T__44:
				enterOuterAlt(_localctx, 2);
				{
				setState(1480);
				match(T__44);
				setState(1482);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
					{
					setState(1481);
					accessLevelModifier();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClassName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClassName(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1486);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassBodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public ClassBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClassBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClassBody(this);
		}
	}

	public final ClassBodyContext classBody() throws RecognitionException {
		ClassBodyContext _localctx = new ClassBodyContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1488);
			match(T__11);
			setState(1490);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__97 - 64)) | (1L << (T__107 - 64)) | (1L << (T__124 - 64)))) != 0)) {
				{
				setState(1489);
				declarations();
				}
			}

			setState(1492);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolDeclarationContext extends ParserRuleContext {
		public ProtocolNameContext protocolName() {
			return getRuleContext(ProtocolNameContext.class,0);
		}
		public ProtocolBodyContext protocolBody() {
			return getRuleContext(ProtocolBodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public ProtocolDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolDeclaration(this);
		}
	}

	public final ProtocolDeclarationContext protocolDeclaration() throws RecognitionException {
		ProtocolDeclarationContext _localctx = new ProtocolDeclarationContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_protocolDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1495);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1494);
				attributes();
				}
			}

			setState(1498);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1497);
				accessLevelModifier();
				}
			}

			setState(1500);
			match(T__67);
			setState(1501);
			protocolName();
			setState(1503);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1502);
				typeInheritanceClause();
				}
			}

			setState(1505);
			protocolBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ProtocolNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolName(this);
		}
	}

	public final ProtocolNameContext protocolName() throws RecognitionException {
		ProtocolNameContext _localctx = new ProtocolNameContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_protocolName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolBodyContext extends ParserRuleContext {
		public ProtocolMemberDeclarationsContext protocolMemberDeclarations() {
			return getRuleContext(ProtocolMemberDeclarationsContext.class,0);
		}
		public ProtocolBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolBody(this);
		}
	}

	public final ProtocolBodyContext protocolBody() throws RecognitionException {
		ProtocolBodyContext _localctx = new ProtocolBodyContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_protocolBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			match(T__11);
			setState(1511);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__82 - 69)) | (1L << (T__83 - 69)) | (1L << (T__88 - 69)) | (1L << (T__97 - 69)))) != 0)) {
				{
				setState(1510);
				protocolMemberDeclarations();
				}
			}

			setState(1513);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolMemberDeclarationContext extends ParserRuleContext {
		public ProtocolPropertyDeclarationContext protocolPropertyDeclaration() {
			return getRuleContext(ProtocolPropertyDeclarationContext.class,0);
		}
		public ProtocolMethodDeclarationContext protocolMethodDeclaration() {
			return getRuleContext(ProtocolMethodDeclarationContext.class,0);
		}
		public ProtocolInitializerDeclarationContext protocolInitializerDeclaration() {
			return getRuleContext(ProtocolInitializerDeclarationContext.class,0);
		}
		public ProtocolSubscriptDeclarationContext protocolSubscriptDeclaration() {
			return getRuleContext(ProtocolSubscriptDeclarationContext.class,0);
		}
		public ProtocolAssociatedTypeDeclarationContext protocolAssociatedTypeDeclaration() {
			return getRuleContext(ProtocolAssociatedTypeDeclarationContext.class,0);
		}
		public ProtocolMemberDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolMemberDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolMemberDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolMemberDeclaration(this);
		}
	}

	public final ProtocolMemberDeclarationContext protocolMemberDeclaration() throws RecognitionException {
		ProtocolMemberDeclarationContext _localctx = new ProtocolMemberDeclarationContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_protocolMemberDeclaration);
		int _la;
		try {
			setState(1535);
			switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1515);
				protocolPropertyDeclaration();
				setState(1517);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1516);
					match(T__0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1519);
				protocolMethodDeclaration();
				setState(1521);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1520);
					match(T__0);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1523);
				protocolInitializerDeclaration();
				setState(1525);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1524);
					match(T__0);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1527);
				protocolSubscriptDeclaration();
				setState(1529);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1528);
					match(T__0);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1531);
				protocolAssociatedTypeDeclaration();
				setState(1533);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1532);
					match(T__0);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolMemberDeclarationsContext extends ParserRuleContext {
		public List<ProtocolMemberDeclarationContext> protocolMemberDeclaration() {
			return getRuleContexts(ProtocolMemberDeclarationContext.class);
		}
		public ProtocolMemberDeclarationContext protocolMemberDeclaration(int i) {
			return getRuleContext(ProtocolMemberDeclarationContext.class,i);
		}
		public ProtocolMemberDeclarationsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolMemberDeclarations; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolMemberDeclarations(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolMemberDeclarations(this);
		}
	}

	public final ProtocolMemberDeclarationsContext protocolMemberDeclarations() throws RecognitionException {
		ProtocolMemberDeclarationsContext _localctx = new ProtocolMemberDeclarationsContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_protocolMemberDeclarations);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1538); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1537);
				protocolMemberDeclaration();
				}
				}
				setState(1540); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__24) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (T__68 - 69)) | (1L << (T__82 - 69)) | (1L << (T__83 - 69)) | (1L << (T__88 - 69)) | (1L << (T__97 - 69)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolPropertyDeclarationContext extends ParserRuleContext {
		public VariableDeclarationHeadContext variableDeclarationHead() {
			return getRuleContext(VariableDeclarationHeadContext.class,0);
		}
		public VariableNameContext variableName() {
			return getRuleContext(VariableNameContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public GetterSetterKeywordBlockContext getterSetterKeywordBlock() {
			return getRuleContext(GetterSetterKeywordBlockContext.class,0);
		}
		public ProtocolPropertyDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolPropertyDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolPropertyDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolPropertyDeclaration(this);
		}
	}

	public final ProtocolPropertyDeclarationContext protocolPropertyDeclaration() throws RecognitionException {
		ProtocolPropertyDeclarationContext _localctx = new ProtocolPropertyDeclarationContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_protocolPropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542);
			variableDeclarationHead();
			setState(1543);
			variableName();
			setState(1544);
			typeAnnotation();
			setState(1545);
			getterSetterKeywordBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolMethodDeclarationContext extends ParserRuleContext {
		public FunctionHeadContext functionHead() {
			return getRuleContext(FunctionHeadContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public ProtocolMethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolMethodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolMethodDeclaration(this);
		}
	}

	public final ProtocolMethodDeclarationContext protocolMethodDeclaration() throws RecognitionException {
		ProtocolMethodDeclarationContext _localctx = new ProtocolMethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_protocolMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1547);
			functionHead();
			setState(1548);
			functionName();
			setState(1550);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(1549);
				genericParameterClause();
				}
			}

			setState(1552);
			functionSignature();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolInitializerDeclarationContext extends ParserRuleContext {
		public InitializerHeadContext initializerHead() {
			return getRuleContext(InitializerHeadContext.class,0);
		}
		public ParameterClauseContext parameterClause() {
			return getRuleContext(ParameterClauseContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public ProtocolInitializerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolInitializerDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolInitializerDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolInitializerDeclaration(this);
		}
	}

	public final ProtocolInitializerDeclarationContext protocolInitializerDeclaration() throws RecognitionException {
		ProtocolInitializerDeclarationContext _localctx = new ProtocolInitializerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_protocolInitializerDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1554);
			initializerHead();
			setState(1556);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(1555);
				genericParameterClause();
				}
			}

			setState(1558);
			parameterClause();
			setState(1560);
			_la = _input.LA(1);
			if (_la==T__74 || _la==T__75) {
				{
				setState(1559);
				_la = _input.LA(1);
				if ( !(_la==T__74 || _la==T__75) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolSubscriptDeclarationContext extends ParserRuleContext {
		public SubscriptHeadContext subscriptHead() {
			return getRuleContext(SubscriptHeadContext.class,0);
		}
		public SubscriptResultContext subscriptResult() {
			return getRuleContext(SubscriptResultContext.class,0);
		}
		public GetterSetterKeywordBlockContext getterSetterKeywordBlock() {
			return getRuleContext(GetterSetterKeywordBlockContext.class,0);
		}
		public ProtocolSubscriptDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolSubscriptDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolSubscriptDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolSubscriptDeclaration(this);
		}
	}

	public final ProtocolSubscriptDeclarationContext protocolSubscriptDeclaration() throws RecognitionException {
		ProtocolSubscriptDeclarationContext _localctx = new ProtocolSubscriptDeclarationContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_protocolSubscriptDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1562);
			subscriptHead();
			setState(1563);
			subscriptResult();
			setState(1564);
			getterSetterKeywordBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolAssociatedTypeDeclarationContext extends ParserRuleContext {
		public TypealiasNameContext typealiasName() {
			return getRuleContext(TypealiasNameContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public TypealiasAssignmentContext typealiasAssignment() {
			return getRuleContext(TypealiasAssignmentContext.class,0);
		}
		public ProtocolAssociatedTypeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolAssociatedTypeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolAssociatedTypeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolAssociatedTypeDeclaration(this);
		}
	}

	public final ProtocolAssociatedTypeDeclarationContext protocolAssociatedTypeDeclaration() throws RecognitionException {
		ProtocolAssociatedTypeDeclarationContext _localctx = new ProtocolAssociatedTypeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_protocolAssociatedTypeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1567);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1566);
				attributes();
				}
			}

			setState(1570);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1569);
				accessLevelModifier();
				}
			}

			setState(1572);
			match(T__82);
			setState(1573);
			typealiasName();
			setState(1575);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1574);
				typeInheritanceClause();
				}
			}

			setState(1578);
			_la = _input.LA(1);
			if (_la==T__70) {
				{
				setState(1577);
				typealiasAssignment();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerDeclarationContext extends ParserRuleContext {
		public InitializerHeadContext initializerHead() {
			return getRuleContext(InitializerHeadContext.class,0);
		}
		public ParameterClauseContext parameterClause() {
			return getRuleContext(ParameterClauseContext.class,0);
		}
		public InitializerBodyContext initializerBody() {
			return getRuleContext(InitializerBodyContext.class,0);
		}
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
		}
		public InitializerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializerDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializerDeclaration(this);
		}
	}

	public final InitializerDeclarationContext initializerDeclaration() throws RecognitionException {
		InitializerDeclarationContext _localctx = new InitializerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_initializerDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1580);
			initializerHead();
			setState(1582);
			_la = _input.LA(1);
			if (_la==T__38) {
				{
				setState(1581);
				genericParameterClause();
				}
			}

			setState(1584);
			parameterClause();
			setState(1586);
			_la = _input.LA(1);
			if (_la==T__74 || _la==T__75) {
				{
				setState(1585);
				_la = _input.LA(1);
				if ( !(_la==T__74 || _la==T__75) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1588);
			initializerBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerHeadContext extends ParserRuleContext {
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public InitializerHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializerHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializerHead(this);
		}
	}

	public final InitializerHeadContext initializerHead() throws RecognitionException {
		InitializerHeadContext _localctx = new InitializerHeadContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_initializerHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1591);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1590);
				attributes();
				}
			}

			setState(1594);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1593);
				declarationModifiers();
				}
			}

			setState(1596);
			match(T__83);
			setState(1598);
			_la = _input.LA(1);
			if (_la==T__84 || _la==T__85) {
				{
				setState(1597);
				_la = _input.LA(1);
				if ( !(_la==T__84 || _la==T__85) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitializerBodyContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public InitializerBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initializerBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializerBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializerBody(this);
		}
	}

	public final InitializerBodyContext initializerBody() throws RecognitionException {
		InitializerBodyContext _localctx = new InitializerBodyContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_initializerBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1600);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeinitializerDeclarationContext extends ParserRuleContext {
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeinitializerDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deinitializerDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDeinitializerDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDeinitializerDeclaration(this);
		}
	}

	public final DeinitializerDeclarationContext deinitializerDeclaration() throws RecognitionException {
		DeinitializerDeclarationContext _localctx = new DeinitializerDeclarationContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_deinitializerDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1603);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1602);
				attributes();
				}
			}

			setState(1605);
			match(T__86);
			setState(1606);
			codeBlock();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionDeclarationContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ExtensionBodyContext extensionBody() {
			return getRuleContext(ExtensionBodyContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public AccessLevelModifierContext accessLevelModifier() {
			return getRuleContext(AccessLevelModifierContext.class,0);
		}
		public RequirementClauseContext requirementClause() {
			return getRuleContext(RequirementClauseContext.class,0);
		}
		public TypeInheritanceClauseContext typeInheritanceClause() {
			return getRuleContext(TypeInheritanceClauseContext.class,0);
		}
		public ExtensionDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExtensionDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExtensionDeclaration(this);
		}
	}

	public final ExtensionDeclarationContext extensionDeclaration() throws RecognitionException {
		ExtensionDeclarationContext _localctx = new ExtensionDeclarationContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_extensionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1609);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1608);
				attributes();
				}
			}

			setState(1612);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1611);
				accessLevelModifier();
				}
			}

			setState(1614);
			match(T__87);
			setState(1615);
			typeIdentifier();
			setState(1618);
			switch (_input.LA(1)) {
			case T__25:
				{
				setState(1616);
				requirementClause();
				}
				break;
			case T__1:
				{
				setState(1617);
				typeInheritanceClause();
				}
				break;
			case T__11:
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1620);
			extensionBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExtensionBodyContext extends ParserRuleContext {
		public DeclarationsContext declarations() {
			return getRuleContext(DeclarationsContext.class,0);
		}
		public ExtensionBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExtensionBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExtensionBody(this);
		}
	}

	public final ExtensionBodyContext extensionBody() throws RecognitionException {
		ExtensionBodyContext _localctx = new ExtensionBodyContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_extensionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1622);
			match(T__11);
			setState(1624);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__97 - 64)) | (1L << (T__107 - 64)) | (1L << (T__124 - 64)))) != 0)) {
				{
				setState(1623);
				declarations();
				}
			}

			setState(1626);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptDeclarationContext extends ParserRuleContext {
		public SubscriptHeadContext subscriptHead() {
			return getRuleContext(SubscriptHeadContext.class,0);
		}
		public SubscriptResultContext subscriptResult() {
			return getRuleContext(SubscriptResultContext.class,0);
		}
		public GetterSetterBlockContext getterSetterBlock() {
			return getRuleContext(GetterSetterBlockContext.class,0);
		}
		public GetterSetterKeywordBlockContext getterSetterKeywordBlock() {
			return getRuleContext(GetterSetterKeywordBlockContext.class,0);
		}
		public CodeBlockContext codeBlock() {
			return getRuleContext(CodeBlockContext.class,0);
		}
		public SubscriptDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSubscriptDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSubscriptDeclaration(this);
		}
	}

	public final SubscriptDeclarationContext subscriptDeclaration() throws RecognitionException {
		SubscriptDeclarationContext _localctx = new SubscriptDeclarationContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_subscriptDeclaration);
		try {
			setState(1640);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1628);
				subscriptHead();
				setState(1629);
				subscriptResult();
				setState(1630);
				getterSetterBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1632);
				subscriptHead();
				setState(1633);
				subscriptResult();
				setState(1634);
				getterSetterKeywordBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1636);
				subscriptHead();
				setState(1637);
				subscriptResult();
				setState(1638);
				codeBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptHeadContext extends ParserRuleContext {
		public ParameterClauseContext parameterClause() {
			return getRuleContext(ParameterClauseContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public DeclarationModifiersContext declarationModifiers() {
			return getRuleContext(DeclarationModifiersContext.class,0);
		}
		public SubscriptHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSubscriptHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSubscriptHead(this);
		}
	}

	public final SubscriptHeadContext subscriptHead() throws RecognitionException {
		SubscriptHeadContext _localctx = new SubscriptHeadContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_subscriptHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1643);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1642);
				attributes();
				}
			}

			setState(1646);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__58) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0)) {
				{
				setState(1645);
				declarationModifiers();
				}
			}

			setState(1648);
			match(T__88);
			setState(1649);
			parameterClause();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubscriptResultContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public SubscriptResultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subscriptResult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSubscriptResult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSubscriptResult(this);
		}
	}

	public final SubscriptResultContext subscriptResult() throws RecognitionException {
		SubscriptResultContext _localctx = new SubscriptResultContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_subscriptResult);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1651);
			match(T__76);
			setState(1653);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(1652);
				attributes();
				}
			}

			setState(1655);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorDeclarationContext extends ParserRuleContext {
		public PrefixOperatorDeclarationContext prefixOperatorDeclaration() {
			return getRuleContext(PrefixOperatorDeclarationContext.class,0);
		}
		public PostfixOperatorDeclarationContext postfixOperatorDeclaration() {
			return getRuleContext(PostfixOperatorDeclarationContext.class,0);
		}
		public InfixOperatorDeclarationContext infixOperatorDeclaration() {
			return getRuleContext(InfixOperatorDeclarationContext.class,0);
		}
		public OperatorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOperatorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOperatorDeclaration(this);
		}
	}

	public final OperatorDeclarationContext operatorDeclaration() throws RecognitionException {
		OperatorDeclarationContext _localctx = new OperatorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_operatorDeclaration);
		try {
			setState(1660);
			switch (_input.LA(1)) {
			case T__52:
				enterOuterAlt(_localctx, 1);
				{
				setState(1657);
				prefixOperatorDeclaration();
				}
				break;
			case T__51:
				enterOuterAlt(_localctx, 2);
				{
				setState(1658);
				postfixOperatorDeclaration();
				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 3);
				{
				setState(1659);
				infixOperatorDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixOperatorDeclarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public PrefixOperatorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOperatorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrefixOperatorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrefixOperatorDeclaration(this);
		}
	}

	public final PrefixOperatorDeclarationContext prefixOperatorDeclaration() throws RecognitionException {
		PrefixOperatorDeclarationContext _localctx = new PrefixOperatorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_prefixOperatorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1662);
			match(T__52);
			setState(1663);
			match(T__89);
			setState(1664);
			operator();
			setState(1665);
			match(T__11);
			setState(1666);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixOperatorDeclarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public PostfixOperatorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixOperatorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPostfixOperatorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPostfixOperatorDeclaration(this);
		}
	}

	public final PostfixOperatorDeclarationContext postfixOperatorDeclaration() throws RecognitionException {
		PostfixOperatorDeclarationContext _localctx = new PostfixOperatorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_postfixOperatorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1668);
			match(T__51);
			setState(1669);
			match(T__89);
			setState(1670);
			operator();
			setState(1671);
			match(T__11);
			setState(1672);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixOperatorDeclarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public InfixOperatorAttributesContext infixOperatorAttributes() {
			return getRuleContext(InfixOperatorAttributesContext.class,0);
		}
		public InfixOperatorDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixOperatorDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInfixOperatorDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInfixOperatorDeclaration(this);
		}
	}

	public final InfixOperatorDeclarationContext infixOperatorDeclaration() throws RecognitionException {
		InfixOperatorDeclarationContext _localctx = new InfixOperatorDeclarationContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_infixOperatorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1674);
			match(T__45);
			setState(1675);
			match(T__89);
			setState(1676);
			operator();
			setState(1677);
			match(T__11);
			setState(1679);
			_la = _input.LA(1);
			if (_la==T__90 || _la==T__91) {
				{
				setState(1678);
				infixOperatorAttributes();
				}
			}

			setState(1681);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InfixOperatorAttributesContext extends ParserRuleContext {
		public PrecedenceClauseContext precedenceClause() {
			return getRuleContext(PrecedenceClauseContext.class,0);
		}
		public AssociativityClauseContext associativityClause() {
			return getRuleContext(AssociativityClauseContext.class,0);
		}
		public InfixOperatorAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixOperatorAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInfixOperatorAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInfixOperatorAttributes(this);
		}
	}

	public final InfixOperatorAttributesContext infixOperatorAttributes() throws RecognitionException {
		InfixOperatorAttributesContext _localctx = new InfixOperatorAttributesContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_infixOperatorAttributes);
		int _la;
		try {
			setState(1691);
			switch (_input.LA(1)) {
			case T__90:
				enterOuterAlt(_localctx, 1);
				{
				setState(1683);
				precedenceClause();
				setState(1685);
				_la = _input.LA(1);
				if (_la==T__91) {
					{
					setState(1684);
					associativityClause();
					}
				}

				}
				break;
			case T__91:
				enterOuterAlt(_localctx, 2);
				{
				setState(1687);
				associativityClause();
				setState(1689);
				_la = _input.LA(1);
				if (_la==T__90) {
					{
					setState(1688);
					precedenceClause();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecedenceClauseContext extends ParserRuleContext {
		public PrecedenceLevelContext precedenceLevel() {
			return getRuleContext(PrecedenceLevelContext.class,0);
		}
		public PrecedenceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrecedenceClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrecedenceClause(this);
		}
	}

	public final PrecedenceClauseContext precedenceClause() throws RecognitionException {
		PrecedenceClauseContext _localctx = new PrecedenceClauseContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_precedenceClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1693);
			match(T__90);
			setState(1694);
			precedenceLevel();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrecedenceLevelContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public PrecedenceLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrecedenceLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrecedenceLevel(this);
		}
	}

	public final PrecedenceLevelContext precedenceLevel() throws RecognitionException {
		PrecedenceLevelContext _localctx = new PrecedenceLevelContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_precedenceLevel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1696);
			integerLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociativityClauseContext extends ParserRuleContext {
		public AssociativityContext associativity() {
			return getRuleContext(AssociativityContext.class,0);
		}
		public AssociativityClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativityClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAssociativityClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAssociativityClause(this);
		}
	}

	public final AssociativityClauseContext associativityClause() throws RecognitionException {
		AssociativityClauseContext _localctx = new AssociativityClauseContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_associativityClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			match(T__91);
			setState(1699);
			associativity();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssociativityContext extends ParserRuleContext {
		public AssociativityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_associativity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAssociativity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAssociativity(this);
		}
	}

	public final AssociativityContext associativity() throws RecognitionException {
		AssociativityContext _localctx = new AssociativityContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_associativity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			_la = _input.LA(1);
			if ( !(((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (T__92 - 93)) | (1L << (T__93 - 93)) | (1L << (T__94 - 93)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PatternContext extends ParserRuleContext {
		public WildcardPatternContext wildcardPattern() {
			return getRuleContext(WildcardPatternContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public IdentifierPatternContext identifierPattern() {
			return getRuleContext(IdentifierPatternContext.class,0);
		}
		public ValueBindingPatternContext valueBindingPattern() {
			return getRuleContext(ValueBindingPatternContext.class,0);
		}
		public TuplePatternContext tuplePattern() {
			return getRuleContext(TuplePatternContext.class,0);
		}
		public EnumCasePatternContext enumCasePattern() {
			return getRuleContext(EnumCasePatternContext.class,0);
		}
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public ExpressionPatternContext expressionPattern() {
			return getRuleContext(ExpressionPatternContext.class,0);
		}
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public PatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPattern(this);
		}
	}

	public final PatternContext pattern() throws RecognitionException {
		return pattern(0);
	}

	private PatternContext pattern(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PatternContext _localctx = new PatternContext(_ctx, _parentState);
		PatternContext _prevctx = _localctx;
		int _startState = 306;
		enterRecursionRule(_localctx, 306, RULE_pattern, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1721);
			switch ( getInterpreter().adaptivePredict(_input,207,_ctx) ) {
			case 1:
				{
				setState(1704);
				wildcardPattern();
				setState(1706);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1705);
					typeAnnotation();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1708);
				identifierPattern();
				setState(1710);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1709);
					typeAnnotation();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1712);
				valueBindingPattern();
				}
				break;
			case 4:
				{
				setState(1713);
				tuplePattern();
				setState(1715);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1714);
					typeAnnotation();
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(1717);
				enumCasePattern();
				}
				break;
			case 6:
				{
				setState(1718);
				match(T__95);
				setState(1719);
				sType(0);
				}
				break;
			case 7:
				{
				setState(1720);
				expressionPattern();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1728);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(1723);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1724);
					match(T__96);
					setState(1725);
					sType(0);
					}
					} 
				}
				setState(1730);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,208,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class WildcardPatternContext extends ParserRuleContext {
		public WildcardPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWildcardPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWildcardPattern(this);
		}
	}

	public final WildcardPatternContext wildcardPattern() throws RecognitionException {
		WildcardPatternContext _localctx = new WildcardPatternContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_wildcardPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1731);
			match(T__80);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierPatternContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IdentifierPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIdentifierPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIdentifierPattern(this);
		}
	}

	public final IdentifierPatternContext identifierPattern() throws RecognitionException {
		IdentifierPatternContext _localctx = new IdentifierPatternContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_identifierPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1733);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueBindingPatternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public ValueBindingPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueBindingPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterValueBindingPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitValueBindingPattern(this);
		}
	}

	public final ValueBindingPatternContext valueBindingPattern() throws RecognitionException {
		ValueBindingPatternContext _localctx = new ValueBindingPatternContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_valueBindingPattern);
		try {
			setState(1739);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(1735);
				match(T__24);
				setState(1736);
				pattern(0);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(1737);
				match(T__23);
				setState(1738);
				pattern(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TuplePatternContext extends ParserRuleContext {
		public TuplePatternElementListContext tuplePatternElementList() {
			return getRuleContext(TuplePatternElementListContext.class,0);
		}
		public TuplePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuplePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuplePattern(this);
		}
	}

	public final TuplePatternContext tuplePattern() throws RecognitionException {
		TuplePatternContext _localctx = new TuplePatternContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_tuplePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1741);
			match(T__27);
			setState(1743);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__23) | (1L << T__24) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__77 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__84 - 70)) | (1L << (T__85 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__94 - 70)) | (1L << (T__95 - 70)) | (1L << (T__98 - 70)) | (1L << (T__100 - 70)) | (1L << (T__102 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__110 - 70)) | (1L << (T__111 - 70)) | (1L << (T__114 - 70)) | (1L << (T__116 - 70)) | (1L << (T__117 - 70)) | (1L << (T__118 - 70)) | (1L << (T__119 - 70)) | (1L << (T__120 - 70)) | (1L << (T__121 - 70)) | (1L << (T__122 - 70)) | (1L << (T__123 - 70)) | (1L << (T__128 - 70)) | (1L << (T__129 - 70)) | (1L << (T__131 - 70)) | (1L << (T__132 - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (T__133 - 134)) | (1L << (T__134 - 134)) | (1L << (T__135 - 134)) | (1L << (BooleanLiteral - 134)) | (1L << (NilLiteral - 134)) | (1L << (OperatorHead - 134)) | (1L << (DotOperatorHead - 134)) | (1L << (Identifier - 134)) | (1L << (BinaryLiteral - 134)) | (1L << (OctalLiteral - 134)) | (1L << (DecimalLiteral - 134)) | (1L << (HexadecimalLiteral - 134)) | (1L << (FloatingPointLiteral - 134)) | (1L << (StringLiteral - 134)))) != 0)) {
				{
				setState(1742);
				tuplePatternElementList();
				}
			}

			setState(1745);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TuplePatternElementListContext extends ParserRuleContext {
		public List<TuplePatternElementContext> tuplePatternElement() {
			return getRuleContexts(TuplePatternElementContext.class);
		}
		public TuplePatternElementContext tuplePatternElement(int i) {
			return getRuleContext(TuplePatternElementContext.class,i);
		}
		public TuplePatternElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplePatternElementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuplePatternElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuplePatternElementList(this);
		}
	}

	public final TuplePatternElementListContext tuplePatternElementList() throws RecognitionException {
		TuplePatternElementListContext _localctx = new TuplePatternElementListContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_tuplePatternElementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1747);
			tuplePatternElement();
			setState(1752);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(1748);
				match(T__13);
				setState(1749);
				tuplePatternElement();
				}
				}
				setState(1754);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TuplePatternElementContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TuplePatternElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tuplePatternElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTuplePatternElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTuplePatternElement(this);
		}
	}

	public final TuplePatternElementContext tuplePatternElement() throws RecognitionException {
		TuplePatternElementContext _localctx = new TuplePatternElementContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_tuplePatternElement);
		try {
			setState(1760);
			switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1755);
				pattern(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1756);
				identifier();
				setState(1757);
				match(T__1);
				setState(1758);
				pattern(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EnumCasePatternContext extends ParserRuleContext {
		public EnumCaseNameContext enumCaseName() {
			return getRuleContext(EnumCaseNameContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TuplePatternContext tuplePattern() {
			return getRuleContext(TuplePatternContext.class,0);
		}
		public EnumCasePatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_enumCasePattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterEnumCasePattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitEnumCasePattern(this);
		}
	}

	public final EnumCasePatternContext enumCasePattern() throws RecognitionException {
		EnumCasePatternContext _localctx = new EnumCasePatternContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_enumCasePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1763);
			switch ( getInterpreter().adaptivePredict(_input,213,_ctx) ) {
			case 1:
				{
				setState(1762);
				typeIdentifier();
				}
				break;
			}
			setState(1766);
			_la = _input.LA(1);
			if (_la==T__69) {
				{
				setState(1765);
				match(T__69);
				}
			}

			setState(1768);
			enumCaseName();
			setState(1770);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				{
				setState(1769);
				tuplePattern();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeCastingPatternContext extends ParserRuleContext {
		public IsPatternContext isPattern() {
			return getRuleContext(IsPatternContext.class,0);
		}
		public AsPatternContext asPattern() {
			return getRuleContext(AsPatternContext.class,0);
		}
		public TypeCastingPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCastingPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypeCastingPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypeCastingPattern(this);
		}
	}

	public final TypeCastingPatternContext typeCastingPattern() throws RecognitionException {
		TypeCastingPatternContext _localctx = new TypeCastingPatternContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_typeCastingPattern);
		try {
			setState(1774);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1772);
				isPattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1773);
				asPattern();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IsPatternContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public IsPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIsPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIsPattern(this);
		}
	}

	public final IsPatternContext isPattern() throws RecognitionException {
		IsPatternContext _localctx = new IsPatternContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_isPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1776);
			match(T__95);
			setState(1777);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AsPatternContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public AsPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAsPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAsPattern(this);
		}
	}

	public final AsPatternContext asPattern() throws RecognitionException {
		AsPatternContext _localctx = new AsPatternContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_asPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1779);
			pattern(0);
			setState(1780);
			match(T__96);
			setState(1781);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionPatternContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionPatternContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionPattern; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpressionPattern(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpressionPattern(this);
		}
	}

	public final ExpressionPatternContext expressionPattern() throws RecognitionException {
		ExpressionPatternContext _localctx = new ExpressionPatternContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_expressionPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1783);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public AttributeArgumentClauseContext attributeArgumentClause() {
			return getRuleContext(AttributeArgumentClauseContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAttribute(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1785);
			match(T__97);
			setState(1786);
			attributeName();
			setState(1788);
			switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
			case 1:
				{
				setState(1787);
				attributeArgumentClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAttributeName(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1790);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeArgumentClauseContext extends ParserRuleContext {
		public BalancedTokensContext balancedTokens() {
			return getRuleContext(BalancedTokensContext.class,0);
		}
		public AttributeArgumentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeArgumentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAttributeArgumentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAttributeArgumentClause(this);
		}
	}

	public final AttributeArgumentClauseContext attributeArgumentClause() throws RecognitionException {
		AttributeArgumentClauseContext _localctx = new AttributeArgumentClauseContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_attributeArgumentClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1792);
			match(T__27);
			setState(1794);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__11) | (1L << T__13) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__77 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__84 - 70)) | (1L << (T__85 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__94 - 70)) | (1L << (T__98 - 70)) | (1L << (T__100 - 70)) | (1L << (T__101 - 70)) | (1L << (T__102 - 70)) | (1L << (T__103 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__110 - 70)) | (1L << (T__111 - 70)) | (1L << (T__114 - 70)) | (1L << (T__116 - 70)) | (1L << (T__117 - 70)) | (1L << (T__118 - 70)) | (1L << (T__119 - 70)) | (1L << (T__120 - 70)) | (1L << (T__121 - 70)) | (1L << (T__122 - 70)) | (1L << (T__128 - 70)) | (1L << (T__129 - 70)) | (1L << (T__131 - 70)) | (1L << (T__132 - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (T__133 - 134)) | (1L << (T__134 - 134)) | (1L << (T__135 - 134)) | (1L << (BooleanLiteral - 134)) | (1L << (NilLiteral - 134)) | (1L << (OperatorHead - 134)) | (1L << (DotOperatorHead - 134)) | (1L << (Identifier - 134)) | (1L << (BinaryLiteral - 134)) | (1L << (OctalLiteral - 134)) | (1L << (DecimalLiteral - 134)) | (1L << (HexadecimalLiteral - 134)) | (1L << (FloatingPointLiteral - 134)) | (1L << (VersionLiteral - 134)) | (1L << (StringLiteral - 134)))) != 0)) {
				{
				setState(1793);
				balancedTokens();
				}
			}

			setState(1796);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributesContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public AttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAttributes(this);
		}
	}

	public final AttributesContext attributes() throws RecognitionException {
		AttributesContext _localctx = new AttributesContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_attributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1799); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1798);
				attribute();
				}
				}
				setState(1801); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__97 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BalancedTokensContext extends ParserRuleContext {
		public List<BalancedTokenContext> balancedToken() {
			return getRuleContexts(BalancedTokenContext.class);
		}
		public BalancedTokenContext balancedToken(int i) {
			return getRuleContext(BalancedTokenContext.class,i);
		}
		public BalancedTokensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedTokens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBalancedTokens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBalancedTokens(this);
		}
	}

	public final BalancedTokensContext balancedTokens() throws RecognitionException {
		BalancedTokensContext _localctx = new BalancedTokensContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_balancedTokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1804); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1803);
				balancedToken();
				}
				}
				setState(1806); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__11) | (1L << T__13) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__77 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__84 - 70)) | (1L << (T__85 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__94 - 70)) | (1L << (T__98 - 70)) | (1L << (T__100 - 70)) | (1L << (T__101 - 70)) | (1L << (T__102 - 70)) | (1L << (T__103 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__110 - 70)) | (1L << (T__111 - 70)) | (1L << (T__114 - 70)) | (1L << (T__116 - 70)) | (1L << (T__117 - 70)) | (1L << (T__118 - 70)) | (1L << (T__119 - 70)) | (1L << (T__120 - 70)) | (1L << (T__121 - 70)) | (1L << (T__122 - 70)) | (1L << (T__128 - 70)) | (1L << (T__129 - 70)) | (1L << (T__131 - 70)) | (1L << (T__132 - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (T__133 - 134)) | (1L << (T__134 - 134)) | (1L << (T__135 - 134)) | (1L << (BooleanLiteral - 134)) | (1L << (NilLiteral - 134)) | (1L << (OperatorHead - 134)) | (1L << (DotOperatorHead - 134)) | (1L << (Identifier - 134)) | (1L << (BinaryLiteral - 134)) | (1L << (OctalLiteral - 134)) | (1L << (DecimalLiteral - 134)) | (1L << (HexadecimalLiteral - 134)) | (1L << (FloatingPointLiteral - 134)) | (1L << (VersionLiteral - 134)) | (1L << (StringLiteral - 134)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BalancedTokenContext extends ParserRuleContext {
		public BalancedTokensContext balancedTokens() {
			return getRuleContext(BalancedTokensContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ContextSensitiveKeywordContext contextSensitiveKeyword() {
			return getRuleContext(ContextSensitiveKeywordContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public TerminalNode VersionLiteral() { return getToken(SwiftParser.VersionLiteral, 0); }
		public AvailabilityArgumentContext availabilityArgument() {
			return getRuleContext(AvailabilityArgumentContext.class,0);
		}
		public BalancedTokenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_balancedToken; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBalancedToken(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBalancedToken(this);
		}
	}

	public final BalancedTokenContext balancedToken() throws RecognitionException {
		BalancedTokenContext _localctx = new BalancedTokenContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_balancedToken);
		int _la;
		try {
			setState(1841);
			switch ( getInterpreter().adaptivePredict(_input,224,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1808);
				match(T__27);
				setState(1810);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__11) | (1L << T__13) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__77 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__84 - 70)) | (1L << (T__85 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__94 - 70)) | (1L << (T__98 - 70)) | (1L << (T__100 - 70)) | (1L << (T__101 - 70)) | (1L << (T__102 - 70)) | (1L << (T__103 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__110 - 70)) | (1L << (T__111 - 70)) | (1L << (T__114 - 70)) | (1L << (T__116 - 70)) | (1L << (T__117 - 70)) | (1L << (T__118 - 70)) | (1L << (T__119 - 70)) | (1L << (T__120 - 70)) | (1L << (T__121 - 70)) | (1L << (T__122 - 70)) | (1L << (T__128 - 70)) | (1L << (T__129 - 70)) | (1L << (T__131 - 70)) | (1L << (T__132 - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (T__133 - 134)) | (1L << (T__134 - 134)) | (1L << (T__135 - 134)) | (1L << (BooleanLiteral - 134)) | (1L << (NilLiteral - 134)) | (1L << (OperatorHead - 134)) | (1L << (DotOperatorHead - 134)) | (1L << (Identifier - 134)) | (1L << (BinaryLiteral - 134)) | (1L << (OctalLiteral - 134)) | (1L << (DecimalLiteral - 134)) | (1L << (HexadecimalLiteral - 134)) | (1L << (FloatingPointLiteral - 134)) | (1L << (VersionLiteral - 134)) | (1L << (StringLiteral - 134)))) != 0)) {
					{
					setState(1809);
					balancedTokens();
					}
				}

				setState(1812);
				match(T__28);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1813);
				match(T__98);
				setState(1815);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__11) | (1L << T__13) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__77 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__84 - 70)) | (1L << (T__85 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__94 - 70)) | (1L << (T__98 - 70)) | (1L << (T__100 - 70)) | (1L << (T__101 - 70)) | (1L << (T__102 - 70)) | (1L << (T__103 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__110 - 70)) | (1L << (T__111 - 70)) | (1L << (T__114 - 70)) | (1L << (T__116 - 70)) | (1L << (T__117 - 70)) | (1L << (T__118 - 70)) | (1L << (T__119 - 70)) | (1L << (T__120 - 70)) | (1L << (T__121 - 70)) | (1L << (T__122 - 70)) | (1L << (T__128 - 70)) | (1L << (T__129 - 70)) | (1L << (T__131 - 70)) | (1L << (T__132 - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (T__133 - 134)) | (1L << (T__134 - 134)) | (1L << (T__135 - 134)) | (1L << (BooleanLiteral - 134)) | (1L << (NilLiteral - 134)) | (1L << (OperatorHead - 134)) | (1L << (DotOperatorHead - 134)) | (1L << (Identifier - 134)) | (1L << (BinaryLiteral - 134)) | (1L << (OctalLiteral - 134)) | (1L << (DecimalLiteral - 134)) | (1L << (HexadecimalLiteral - 134)) | (1L << (FloatingPointLiteral - 134)) | (1L << (VersionLiteral - 134)) | (1L << (StringLiteral - 134)))) != 0)) {
					{
					setState(1814);
					balancedTokens();
					}
				}

				setState(1817);
				match(T__99);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1818);
				match(T__11);
				setState(1820);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__11) | (1L << T__13) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__77 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__84 - 70)) | (1L << (T__85 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__94 - 70)) | (1L << (T__98 - 70)) | (1L << (T__100 - 70)) | (1L << (T__101 - 70)) | (1L << (T__102 - 70)) | (1L << (T__103 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__110 - 70)) | (1L << (T__111 - 70)) | (1L << (T__114 - 70)) | (1L << (T__116 - 70)) | (1L << (T__117 - 70)) | (1L << (T__118 - 70)) | (1L << (T__119 - 70)) | (1L << (T__120 - 70)) | (1L << (T__121 - 70)) | (1L << (T__122 - 70)) | (1L << (T__128 - 70)) | (1L << (T__129 - 70)) | (1L << (T__131 - 70)) | (1L << (T__132 - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (T__133 - 134)) | (1L << (T__134 - 134)) | (1L << (T__135 - 134)) | (1L << (BooleanLiteral - 134)) | (1L << (NilLiteral - 134)) | (1L << (OperatorHead - 134)) | (1L << (DotOperatorHead - 134)) | (1L << (Identifier - 134)) | (1L << (BinaryLiteral - 134)) | (1L << (OctalLiteral - 134)) | (1L << (DecimalLiteral - 134)) | (1L << (HexadecimalLiteral - 134)) | (1L << (FloatingPointLiteral - 134)) | (1L << (VersionLiteral - 134)) | (1L << (StringLiteral - 134)))) != 0)) {
					{
					setState(1819);
					balancedTokens();
					}
				}

				setState(1822);
				match(T__12);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1823);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1824);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1825);
				contextSensitiveKeyword();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1826);
				literal();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1827);
				operator();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1828);
				match(VersionLiteral);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1829);
				availabilityArgument();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1830);
				match(T__1);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1831);
				match(T__0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1832);
				match(T__13);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1833);
				match(T__85);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1834);
				match(T__38);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1835);
				match(T__39);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1836);
				match(T__100);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1837);
				match(T__101);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1838);
				match(T__102);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1839);
				match(T__77);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1840);
				match(T__103);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public PrefixExpressionContext prefixExpression() {
			return getRuleContext(PrefixExpressionContext.class,0);
		}
		public TryOperatorContext tryOperator() {
			return getRuleContext(TryOperatorContext.class,0);
		}
		public List<BinaryExpressionContext> binaryExpression() {
			return getRuleContexts(BinaryExpressionContext.class);
		}
		public BinaryExpressionContext binaryExpression(int i) {
			return getRuleContext(BinaryExpressionContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1844);
			_la = _input.LA(1);
			if (_la==T__105) {
				{
				setState(1843);
				tryOperator();
				}
			}

			setState(1846);
			prefixExpression();
			setState(1850);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1847);
					binaryExpression();
					}
					} 
				}
				setState(1852);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,226,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PrefixOperatorContext prefixOperator() {
			return getRuleContext(PrefixOperatorContext.class,0);
		}
		public InOutExpressionContext inOutExpression() {
			return getRuleContext(InOutExpressionContext.class,0);
		}
		public PrefixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrefixExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrefixExpression(this);
		}
	}

	public final PrefixExpressionContext prefixExpression() throws RecognitionException {
		PrefixExpressionContext _localctx = new PrefixExpressionContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_prefixExpression);
		try {
			setState(1861);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1854);
				switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
				case 1:
					{
					setState(1853);
					prefixOperator();
					}
					break;
				}
				setState(1856);
				postfixExpression(0);
				setState(1858);
				switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
				case 1:
					{
					setState(1857);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1860);
				inOutExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InOutExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public InOutExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inOutExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInOutExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInOutExpression(this);
		}
	}

	public final InOutExpressionContext inOutExpression() throws RecognitionException {
		InOutExpressionContext _localctx = new InOutExpressionContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_inOutExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1863);
			match(T__104);
			setState(1864);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TryOperatorContext extends ParserRuleContext {
		public TryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTryOperator(this);
		}
	}

	public final TryOperatorContext tryOperator() throws RecognitionException {
		TryOperatorContext _localctx = new TryOperatorContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_tryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1866);
			match(T__105);
			setState(1868);
			switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
			case 1:
				{
				setState(1867);
				_la = _input.LA(1);
				if ( !(_la==T__84 || _la==T__85) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryExpressionContext extends ParserRuleContext {
		public BinaryOperatorContext binaryOperator() {
			return getRuleContext(BinaryOperatorContext.class,0);
		}
		public PrefixExpressionContext prefixExpression() {
			return getRuleContext(PrefixExpressionContext.class,0);
		}
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public TryOperatorContext tryOperator() {
			return getRuleContext(TryOperatorContext.class,0);
		}
		public ConditionalOperatorContext conditionalOperator() {
			return getRuleContext(ConditionalOperatorContext.class,0);
		}
		public TypeCastingOperatorContext typeCastingOperator() {
			return getRuleContext(TypeCastingOperatorContext.class,0);
		}
		public BinaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBinaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBinaryExpression(this);
		}
	}

	public final BinaryExpressionContext binaryExpression() throws RecognitionException {
		BinaryExpressionContext _localctx = new BinaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_binaryExpression);
		int _la;
		try {
			setState(1886);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1870);
				binaryOperator();
				setState(1871);
				prefixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1873);
				assignmentOperator();
				setState(1875);
				_la = _input.LA(1);
				if (_la==T__105) {
					{
					setState(1874);
					tryOperator();
					}
				}

				setState(1877);
				prefixExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1879);
				conditionalOperator();
				setState(1881);
				_la = _input.LA(1);
				if (_la==T__105) {
					{
					setState(1880);
					tryOperator();
					}
				}

				setState(1883);
				prefixExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1885);
				typeCastingOperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentOperatorContext extends ParserRuleContext {
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitAssignmentOperator(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_assignmentOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1888);
			match(T__70);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionalOperatorContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TryOperatorContext tryOperator() {
			return getRuleContext(TryOperatorContext.class,0);
		}
		public ConditionalOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterConditionalOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitConditionalOperator(this);
		}
	}

	public final ConditionalOperatorContext conditionalOperator() throws RecognitionException {
		ConditionalOperatorContext _localctx = new ConditionalOperatorContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_conditionalOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1890);
			match(T__84);
			setState(1892);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				{
				setState(1891);
				tryOperator();
				}
				break;
			}
			setState(1894);
			expression();
			setState(1895);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeCastingOperatorContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public TypeCastingOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeCastingOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypeCastingOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypeCastingOperator(this);
		}
	}

	public final TypeCastingOperatorContext typeCastingOperator() throws RecognitionException {
		TypeCastingOperatorContext _localctx = new TypeCastingOperatorContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_typeCastingOperator);
		try {
			setState(1907);
			switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1897);
				match(T__95);
				setState(1898);
				sType(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1899);
				match(T__96);
				setState(1900);
				match(T__84);
				setState(1901);
				sType(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1902);
				match(T__96);
				setState(1903);
				sType(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1904);
				match(T__96);
				setState(1905);
				match(T__85);
				setState(1906);
				sType(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public GenericArgumentClauseContext genericArgumentClause() {
			return getRuleContext(GenericArgumentClauseContext.class,0);
		}
		public LiteralExpressionContext literalExpression() {
			return getRuleContext(LiteralExpressionContext.class,0);
		}
		public SelfExpressionContext selfExpression() {
			return getRuleContext(SelfExpressionContext.class,0);
		}
		public SuperclassExpressionContext superclassExpression() {
			return getRuleContext(SuperclassExpressionContext.class,0);
		}
		public ClosureExpressionContext closureExpression() {
			return getRuleContext(ClosureExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public ImplicitMemberExpressionContext implicitMemberExpression() {
			return getRuleContext(ImplicitMemberExpressionContext.class,0);
		}
		public WildcardExpressionContext wildcardExpression() {
			return getRuleContext(WildcardExpressionContext.class,0);
		}
		public SelectorExpressionContext selectorExpression() {
			return getRuleContext(SelectorExpressionContext.class,0);
		}
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrimaryExpression(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 358, RULE_primaryExpression);
		try {
			setState(1924);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1911);
				switch (_input.LA(1)) {
				case T__30:
				case T__31:
				case T__32:
				case T__34:
				case T__36:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__55:
				case T__56:
				case T__58:
				case T__60:
				case T__71:
				case T__72:
				case T__73:
				case T__81:
				case T__89:
				case T__90:
				case T__91:
				case T__92:
				case T__93:
				case T__94:
				case T__121:
				case T__122:
				case T__128:
				case T__129:
				case T__131:
				case T__132:
				case T__133:
				case T__134:
				case T__135:
				case Identifier:
					{
					setState(1909);
					identifier();
					}
					break;
				case T__29:
				case T__38:
				case T__39:
				case T__40:
				case T__70:
				case T__77:
				case T__84:
				case T__85:
				case T__100:
				case T__102:
				case T__104:
				case T__116:
				case T__117:
				case T__118:
				case T__119:
				case T__120:
				case OperatorHead:
				case DotOperatorHead:
					{
					setState(1910);
					operator();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1914);
				switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
				case 1:
					{
					setState(1913);
					genericArgumentClause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1916);
				literalExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1917);
				selfExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1918);
				superclassExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1919);
				closureExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1920);
				parenthesizedExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1921);
				implicitMemberExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1922);
				wildcardExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1923);
				selectorExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralExpressionContext extends ParserRuleContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArrayLiteralContext arrayLiteral() {
			return getRuleContext(ArrayLiteralContext.class,0);
		}
		public DictionaryLiteralContext dictionaryLiteral() {
			return getRuleContext(DictionaryLiteralContext.class,0);
		}
		public LiteralExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLiteralExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLiteralExpression(this);
		}
	}

	public final LiteralExpressionContext literalExpression() throws RecognitionException {
		LiteralExpressionContext _localctx = new LiteralExpressionContext(_ctx, getState());
		enterRule(_localctx, 360, RULE_literalExpression);
		try {
			setState(1933);
			switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1926);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1927);
				arrayLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1928);
				dictionaryLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1929);
				match(T__106);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1930);
				match(T__107);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1931);
				match(T__108);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1932);
				match(T__109);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralContext extends ParserRuleContext {
		public ArrayLiteralItemsContext arrayLiteralItems() {
			return getRuleContext(ArrayLiteralItemsContext.class,0);
		}
		public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArrayLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArrayLiteral(this);
		}
	}

	public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
		ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
		enterRule(_localctx, 362, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1935);
			match(T__98);
			setState(1937);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__60))) != 0) || ((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (T__69 - 70)) | (1L << (T__70 - 70)) | (1L << (T__71 - 70)) | (1L << (T__72 - 70)) | (1L << (T__73 - 70)) | (1L << (T__77 - 70)) | (1L << (T__80 - 70)) | (1L << (T__81 - 70)) | (1L << (T__84 - 70)) | (1L << (T__85 - 70)) | (1L << (T__89 - 70)) | (1L << (T__90 - 70)) | (1L << (T__91 - 70)) | (1L << (T__92 - 70)) | (1L << (T__93 - 70)) | (1L << (T__94 - 70)) | (1L << (T__98 - 70)) | (1L << (T__100 - 70)) | (1L << (T__102 - 70)) | (1L << (T__104 - 70)) | (1L << (T__105 - 70)) | (1L << (T__106 - 70)) | (1L << (T__107 - 70)) | (1L << (T__108 - 70)) | (1L << (T__109 - 70)) | (1L << (T__110 - 70)) | (1L << (T__111 - 70)) | (1L << (T__114 - 70)) | (1L << (T__116 - 70)) | (1L << (T__117 - 70)) | (1L << (T__118 - 70)) | (1L << (T__119 - 70)) | (1L << (T__120 - 70)) | (1L << (T__121 - 70)) | (1L << (T__122 - 70)) | (1L << (T__128 - 70)) | (1L << (T__129 - 70)) | (1L << (T__131 - 70)) | (1L << (T__132 - 70)))) != 0) || ((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & ((1L << (T__133 - 134)) | (1L << (T__134 - 134)) | (1L << (T__135 - 134)) | (1L << (BooleanLiteral - 134)) | (1L << (NilLiteral - 134)) | (1L << (OperatorHead - 134)) | (1L << (DotOperatorHead - 134)) | (1L << (Identifier - 134)) | (1L << (BinaryLiteral - 134)) | (1L << (OctalLiteral - 134)) | (1L << (DecimalLiteral - 134)) | (1L << (HexadecimalLiteral - 134)) | (1L << (FloatingPointLiteral - 134)) | (1L << (StringLiteral - 134)))) != 0)) {
				{
				setState(1936);
				arrayLiteralItems();
				}
			}

			setState(1939);
			match(T__99);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralItemsContext extends ParserRuleContext {
		public List<ArrayLiteralItemContext> arrayLiteralItem() {
			return getRuleContexts(ArrayLiteralItemContext.class);
		}
		public ArrayLiteralItemContext arrayLiteralItem(int i) {
			return getRuleContext(ArrayLiteralItemContext.class,i);
		}
		public ArrayLiteralItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteralItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArrayLiteralItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArrayLiteralItems(this);
		}
	}

	public final ArrayLiteralItemsContext arrayLiteralItems() throws RecognitionException {
		ArrayLiteralItemsContext _localctx = new ArrayLiteralItemsContext(_ctx, getState());
		enterRule(_localctx, 364, RULE_arrayLiteralItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1941);
			arrayLiteralItem();
			setState(1946);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1942);
					match(T__13);
					setState(1943);
					arrayLiteralItem();
					}
					} 
				}
				setState(1948);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,241,_ctx);
			}
			setState(1950);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(1949);
				match(T__13);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayLiteralItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayLiteralItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayLiteralItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArrayLiteralItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArrayLiteralItem(this);
		}
	}

	public final ArrayLiteralItemContext arrayLiteralItem() throws RecognitionException {
		ArrayLiteralItemContext _localctx = new ArrayLiteralItemContext(_ctx, getState());
		enterRule(_localctx, 366, RULE_arrayLiteralItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1952);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryLiteralContext extends ParserRuleContext {
		public DictionaryLiteralItemsContext dictionaryLiteralItems() {
			return getRuleContext(DictionaryLiteralItemsContext.class,0);
		}
		public DictionaryLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDictionaryLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDictionaryLiteral(this);
		}
	}

	public final DictionaryLiteralContext dictionaryLiteral() throws RecognitionException {
		DictionaryLiteralContext _localctx = new DictionaryLiteralContext(_ctx, getState());
		enterRule(_localctx, 368, RULE_dictionaryLiteral);
		try {
			setState(1961);
			switch ( getInterpreter().adaptivePredict(_input,243,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1954);
				match(T__98);
				setState(1955);
				dictionaryLiteralItems();
				setState(1956);
				match(T__99);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1958);
				match(T__98);
				setState(1959);
				match(T__1);
				setState(1960);
				match(T__99);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryLiteralItemsContext extends ParserRuleContext {
		public List<DictionaryLiteralItemContext> dictionaryLiteralItem() {
			return getRuleContexts(DictionaryLiteralItemContext.class);
		}
		public DictionaryLiteralItemContext dictionaryLiteralItem(int i) {
			return getRuleContext(DictionaryLiteralItemContext.class,i);
		}
		public DictionaryLiteralItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryLiteralItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDictionaryLiteralItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDictionaryLiteralItems(this);
		}
	}

	public final DictionaryLiteralItemsContext dictionaryLiteralItems() throws RecognitionException {
		DictionaryLiteralItemsContext _localctx = new DictionaryLiteralItemsContext(_ctx, getState());
		enterRule(_localctx, 370, RULE_dictionaryLiteralItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1963);
			dictionaryLiteralItem();
			setState(1968);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1964);
					match(T__13);
					setState(1965);
					dictionaryLiteralItem();
					}
					} 
				}
				setState(1970);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			}
			setState(1972);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(1971);
				match(T__13);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryLiteralItemContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DictionaryLiteralItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryLiteralItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDictionaryLiteralItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDictionaryLiteralItem(this);
		}
	}

	public final DictionaryLiteralItemContext dictionaryLiteralItem() throws RecognitionException {
		DictionaryLiteralItemContext _localctx = new DictionaryLiteralItemContext(_ctx, getState());
		enterRule(_localctx, 372, RULE_dictionaryLiteralItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1974);
			expression();
			setState(1975);
			match(T__1);
			setState(1976);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelfExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionElementListContext expressionElementList() {
			return getRuleContext(ExpressionElementListContext.class,0);
		}
		public SelfExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSelfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSelfExpression(this);
		}
	}

	public final SelfExpressionContext selfExpression() throws RecognitionException {
		SelfExpressionContext _localctx = new SelfExpressionContext(_ctx, getState());
		enterRule(_localctx, 374, RULE_selfExpression);
		try {
			setState(1990);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1978);
				match(T__110);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1979);
				match(T__110);
				setState(1980);
				match(T__69);
				setState(1981);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1982);
				match(T__110);
				setState(1983);
				match(T__98);
				setState(1984);
				expressionElementList();
				setState(1985);
				match(T__99);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1987);
				match(T__110);
				setState(1988);
				match(T__69);
				setState(1989);
				match(T__83);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassExpressionContext extends ParserRuleContext {
		public SuperclassMethodExpressionContext superclassMethodExpression() {
			return getRuleContext(SuperclassMethodExpressionContext.class,0);
		}
		public SuperclassSubscriptExpressionContext superclassSubscriptExpression() {
			return getRuleContext(SuperclassSubscriptExpressionContext.class,0);
		}
		public SuperclassInitializerExpressionContext superclassInitializerExpression() {
			return getRuleContext(SuperclassInitializerExpressionContext.class,0);
		}
		public SuperclassExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclassExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSuperclassExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSuperclassExpression(this);
		}
	}

	public final SuperclassExpressionContext superclassExpression() throws RecognitionException {
		SuperclassExpressionContext _localctx = new SuperclassExpressionContext(_ctx, getState());
		enterRule(_localctx, 376, RULE_superclassExpression);
		try {
			setState(1995);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1992);
				superclassMethodExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1993);
				superclassSubscriptExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1994);
				superclassInitializerExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassMethodExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SuperclassMethodExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclassMethodExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSuperclassMethodExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSuperclassMethodExpression(this);
		}
	}

	public final SuperclassMethodExpressionContext superclassMethodExpression() throws RecognitionException {
		SuperclassMethodExpressionContext _localctx = new SuperclassMethodExpressionContext(_ctx, getState());
		enterRule(_localctx, 378, RULE_superclassMethodExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1997);
			match(T__111);
			setState(1998);
			match(T__69);
			setState(1999);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassSubscriptExpressionContext extends ParserRuleContext {
		public ExpressionElementListContext expressionElementList() {
			return getRuleContext(ExpressionElementListContext.class,0);
		}
		public SuperclassSubscriptExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclassSubscriptExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSuperclassSubscriptExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSuperclassSubscriptExpression(this);
		}
	}

	public final SuperclassSubscriptExpressionContext superclassSubscriptExpression() throws RecognitionException {
		SuperclassSubscriptExpressionContext _localctx = new SuperclassSubscriptExpressionContext(_ctx, getState());
		enterRule(_localctx, 380, RULE_superclassSubscriptExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2001);
			match(T__111);
			setState(2002);
			match(T__98);
			setState(2003);
			expressionElementList();
			setState(2004);
			match(T__99);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SuperclassInitializerExpressionContext extends ParserRuleContext {
		public SuperclassInitializerExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_superclassInitializerExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSuperclassInitializerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSuperclassInitializerExpression(this);
		}
	}

	public final SuperclassInitializerExpressionContext superclassInitializerExpression() throws RecognitionException {
		SuperclassInitializerExpressionContext _localctx = new SuperclassInitializerExpressionContext(_ctx, getState());
		enterRule(_localctx, 382, RULE_superclassInitializerExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2006);
			match(T__111);
			setState(2007);
			match(T__69);
			setState(2008);
			match(T__83);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosureExpressionContext extends ParserRuleContext {
		public ClosureSignatureContext closureSignature() {
			return getRuleContext(ClosureSignatureContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ClosureExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClosureExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClosureExpression(this);
		}
	}

	public final ClosureExpressionContext closureExpression() throws RecognitionException {
		ClosureExpressionContext _localctx = new ClosureExpressionContext(_ctx, getState());
		enterRule(_localctx, 384, RULE_closureExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2010);
			match(T__11);
			setState(2012);
			switch ( getInterpreter().adaptivePredict(_input,248,_ctx) ) {
			case 1:
				{
				setState(2011);
				closureSignature();
				}
				break;
			}
			setState(2015);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__77 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__124 - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (T__128 - 129)) | (1L << (T__129 - 129)) | (1L << (T__131 - 129)) | (1L << (T__132 - 129)) | (1L << (T__133 - 129)) | (1L << (T__134 - 129)) | (1L << (T__135 - 129)) | (1L << (BooleanLiteral - 129)) | (1L << (NilLiteral - 129)) | (1L << (OperatorHead - 129)) | (1L << (DotOperatorHead - 129)) | (1L << (Identifier - 129)) | (1L << (BinaryLiteral - 129)) | (1L << (OctalLiteral - 129)) | (1L << (DecimalLiteral - 129)) | (1L << (HexadecimalLiteral - 129)) | (1L << (FloatingPointLiteral - 129)) | (1L << (StringLiteral - 129)))) != 0)) {
				{
				setState(2014);
				statements();
				}
			}

			setState(2017);
			match(T__12);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClosureSignatureContext extends ParserRuleContext {
		public ParameterClauseContext parameterClause() {
			return getRuleContext(ParameterClauseContext.class,0);
		}
		public FunctionResultContext functionResult() {
			return getRuleContext(FunctionResultContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public CaptureListContext captureList() {
			return getRuleContext(CaptureListContext.class,0);
		}
		public ClosureSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClosureSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClosureSignature(this);
		}
	}

	public final ClosureSignatureContext closureSignature() throws RecognitionException {
		ClosureSignatureContext _localctx = new ClosureSignatureContext(_ctx, getState());
		enterRule(_localctx, 386, RULE_closureSignature);
		int _la;
		try {
			setState(2048);
			switch ( getInterpreter().adaptivePredict(_input,254,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2019);
				parameterClause();
				setState(2021);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(2020);
					functionResult();
					}
				}

				setState(2023);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2025);
				identifierList();
				setState(2027);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(2026);
					functionResult();
					}
				}

				setState(2029);
				match(T__4);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2031);
				captureList();
				setState(2032);
				parameterClause();
				setState(2034);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(2033);
					functionResult();
					}
				}

				setState(2036);
				match(T__4);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2038);
				captureList();
				setState(2039);
				identifierList();
				setState(2041);
				_la = _input.LA(1);
				if (_la==T__76) {
					{
					setState(2040);
					functionResult();
					}
				}

				setState(2043);
				match(T__4);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2045);
				captureList();
				setState(2046);
				match(T__4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaptureListContext extends ParserRuleContext {
		public CaptureListItemsContext captureListItems() {
			return getRuleContext(CaptureListItemsContext.class,0);
		}
		public CaptureListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCaptureList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCaptureList(this);
		}
	}

	public final CaptureListContext captureList() throws RecognitionException {
		CaptureListContext _localctx = new CaptureListContext(_ctx, getState());
		enterRule(_localctx, 388, RULE_captureList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2050);
			match(T__98);
			setState(2051);
			captureListItems();
			setState(2052);
			match(T__99);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaptureListItemsContext extends ParserRuleContext {
		public List<CaptureListItemContext> captureListItem() {
			return getRuleContexts(CaptureListItemContext.class);
		}
		public CaptureListItemContext captureListItem(int i) {
			return getRuleContext(CaptureListItemContext.class,i);
		}
		public CaptureListItemsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureListItems; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCaptureListItems(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCaptureListItems(this);
		}
	}

	public final CaptureListItemsContext captureListItems() throws RecognitionException {
		CaptureListItemsContext _localctx = new CaptureListItemsContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_captureListItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2054);
			captureListItem();
			setState(2059);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(2055);
				match(T__13);
				setState(2056);
				captureListItem();
				}
				}
				setState(2061);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaptureListItemContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public CaptureSpecifierContext captureSpecifier() {
			return getRuleContext(CaptureSpecifierContext.class,0);
		}
		public CaptureListItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureListItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCaptureListItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCaptureListItem(this);
		}
	}

	public final CaptureListItemContext captureListItem() throws RecognitionException {
		CaptureListItemContext _localctx = new CaptureListItemContext(_ctx, getState());
		enterRule(_localctx, 392, RULE_captureListItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2063);
			switch ( getInterpreter().adaptivePredict(_input,256,_ctx) ) {
			case 1:
				{
				setState(2062);
				captureSpecifier();
				}
				break;
			}
			setState(2065);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaptureSpecifierContext extends ParserRuleContext {
		public CaptureSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_captureSpecifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCaptureSpecifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCaptureSpecifier(this);
		}
	}

	public final CaptureSpecifierContext captureSpecifier() throws RecognitionException {
		CaptureSpecifierContext _localctx = new CaptureSpecifierContext(_ctx, getState());
		enterRule(_localctx, 394, RULE_captureSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2067);
			_la = _input.LA(1);
			if ( !(((((_la - 56)) & ~0x3f) == 0 && ((1L << (_la - 56)) & ((1L << (T__55 - 56)) | (1L << (T__58 - 56)) | (1L << (T__112 - 56)) | (1L << (T__113 - 56)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplicitMemberExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ImplicitMemberExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicitMemberExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImplicitMemberExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImplicitMemberExpression(this);
		}
	}

	public final ImplicitMemberExpressionContext implicitMemberExpression() throws RecognitionException {
		ImplicitMemberExpressionContext _localctx = new ImplicitMemberExpressionContext(_ctx, getState());
		enterRule(_localctx, 396, RULE_implicitMemberExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2069);
			match(T__69);
			setState(2070);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParenthesizedExpressionContext extends ParserRuleContext {
		public ExpressionElementListContext expressionElementList() {
			return getRuleContext(ExpressionElementListContext.class,0);
		}
		public ParenthesizedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesizedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitParenthesizedExpression(this);
		}
	}

	public final ParenthesizedExpressionContext parenthesizedExpression() throws RecognitionException {
		ParenthesizedExpressionContext _localctx = new ParenthesizedExpressionContext(_ctx, getState());
		enterRule(_localctx, 398, RULE_parenthesizedExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2072);
			match(T__27);
			setState(2074);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__77 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__98 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (T__128 - 128)) | (1L << (T__129 - 128)) | (1L << (T__131 - 128)) | (1L << (T__132 - 128)) | (1L << (T__133 - 128)) | (1L << (T__134 - 128)) | (1L << (T__135 - 128)) | (1L << (BooleanLiteral - 128)) | (1L << (NilLiteral - 128)) | (1L << (OperatorHead - 128)) | (1L << (DotOperatorHead - 128)) | (1L << (Identifier - 128)) | (1L << (BinaryLiteral - 128)) | (1L << (OctalLiteral - 128)) | (1L << (DecimalLiteral - 128)) | (1L << (HexadecimalLiteral - 128)) | (1L << (FloatingPointLiteral - 128)) | (1L << (StringLiteral - 128)))) != 0)) {
				{
				setState(2073);
				expressionElementList();
				}
			}

			setState(2076);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionElementListContext extends ParserRuleContext {
		public List<ExpressionElementContext> expressionElement() {
			return getRuleContexts(ExpressionElementContext.class);
		}
		public ExpressionElementContext expressionElement(int i) {
			return getRuleContext(ExpressionElementContext.class,i);
		}
		public ExpressionElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionElementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpressionElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpressionElementList(this);
		}
	}

	public final ExpressionElementListContext expressionElementList() throws RecognitionException {
		ExpressionElementListContext _localctx = new ExpressionElementListContext(_ctx, getState());
		enterRule(_localctx, 400, RULE_expressionElementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2078);
			expressionElement();
			setState(2083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(2079);
				match(T__13);
				setState(2080);
				expressionElement();
				}
				}
				setState(2085);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionElementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionElementIdentifierContext expressionElementIdentifier() {
			return getRuleContext(ExpressionElementIdentifierContext.class,0);
		}
		public ExpressionElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpressionElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpressionElement(this);
		}
	}

	public final ExpressionElementContext expressionElement() throws RecognitionException {
		ExpressionElementContext _localctx = new ExpressionElementContext(_ctx, getState());
		enterRule(_localctx, 402, RULE_expressionElement);
		try {
			setState(2091);
			switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2086);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2087);
				expressionElementIdentifier();
				setState(2088);
				match(T__1);
				setState(2089);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionElementIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public ExpressionElementIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionElementIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExpressionElementIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExpressionElementIdentifier(this);
		}
	}

	public final ExpressionElementIdentifierContext expressionElementIdentifier() throws RecognitionException {
		ExpressionElementIdentifierContext _localctx = new ExpressionElementIdentifierContext(_ctx, getState());
		enterRule(_localctx, 404, RULE_expressionElementIdentifier);
		try {
			setState(2095);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
			case T__34:
			case T__36:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__55:
			case T__56:
			case T__58:
			case T__60:
			case T__71:
			case T__72:
			case T__73:
			case T__81:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__121:
			case T__122:
			case T__128:
			case T__129:
			case T__131:
			case T__132:
			case T__133:
			case T__134:
			case T__135:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2093);
				identifier();
				}
				break;
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__14:
			case T__15:
			case T__16:
			case T__17:
			case T__18:
			case T__19:
			case T__20:
			case T__21:
			case T__22:
			case T__25:
			case T__26:
			case T__41:
			case T__54:
			case T__59:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__66:
			case T__67:
			case T__68:
			case T__74:
			case T__75:
			case T__80:
			case T__82:
			case T__83:
			case T__86:
			case T__87:
			case T__88:
			case T__95:
			case T__96:
			case T__105:
			case T__106:
			case T__107:
			case T__108:
			case T__109:
			case T__110:
			case T__111:
			case T__114:
			case T__115:
			case T__123:
			case T__124:
			case T__125:
			case T__126:
			case T__127:
			case BooleanLiteral:
			case NilLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2094);
				keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WildcardExpressionContext extends ParserRuleContext {
		public WildcardExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wildcardExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterWildcardExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitWildcardExpression(this);
		}
	}

	public final WildcardExpressionContext wildcardExpression() throws RecognitionException {
		WildcardExpressionContext _localctx = new WildcardExpressionContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_wildcardExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2097);
			match(T__80);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectorExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SelectorExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectorExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSelectorExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSelectorExpression(this);
		}
	}

	public final SelectorExpressionContext selectorExpression() throws RecognitionException {
		SelectorExpressionContext _localctx = new SelectorExpressionContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_selectorExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2099);
			match(T__114);
			setState(2100);
			match(T__27);
			setState(2101);
			expression();
			setState(2102);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixExpressionContext extends ParserRuleContext {
		public PostfixExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixExpression; }
	 
		public PostfixExpressionContext() { }
		public void copyFrom(PostfixExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DynamicTypeExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public DynamicTypeExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDynamicTypeExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDynamicTypeExpression(this);
		}
	}
	public static class FunctionCallWithClosureExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ClosureExpressionContext closureExpression() {
			return getRuleContext(ClosureExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public FunctionCallWithClosureExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionCallWithClosureExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionCallWithClosureExpression(this);
		}
	}
	public static class SubscriptExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ExpressionElementListContext expressionElementList() {
			return getRuleContext(ExpressionElementListContext.class,0);
		}
		public SubscriptExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSubscriptExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSubscriptExpression(this);
		}
	}
	public static class PostfixSelfExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostfixSelfExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPostfixSelfExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPostfixSelfExpression(this);
		}
	}
	public static class OptionalChainingExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public OptionalChainingExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOptionalChainingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOptionalChainingExpression(this);
		}
	}
	public static class ExplicitMemberExpression1Context extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public TerminalNode DecimalLiteral() { return getToken(SwiftParser.DecimalLiteral, 0); }
		public ExplicitMemberExpression1Context(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExplicitMemberExpression1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExplicitMemberExpression1(this);
		}
	}
	public static class PostfixOperationContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public PostfixOperatorContext postfixOperator() {
			return getRuleContext(PostfixOperatorContext.class,0);
		}
		public PostfixOperationContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPostfixOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPostfixOperation(this);
		}
	}
	public static class InitializerExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public InitializerExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializerExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializerExpression(this);
		}
	}
	public static class ForcedValueExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ForcedValueExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterForcedValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitForcedValueExpression(this);
		}
	}
	public static class ExplicitMemberExpression3Context extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentNamesContext argumentNames() {
			return getRuleContext(ArgumentNamesContext.class,0);
		}
		public ExplicitMemberExpression3Context(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExplicitMemberExpression3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExplicitMemberExpression3(this);
		}
	}
	public static class ExplicitMemberExpression2Context extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericArgumentClauseContext genericArgumentClause() {
			return getRuleContext(GenericArgumentClauseContext.class,0);
		}
		public ExplicitMemberExpression2Context(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExplicitMemberExpression2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExplicitMemberExpression2(this);
		}
	}
	public static class FunctionCallExpressionContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext parenthesizedExpression() {
			return getRuleContext(ParenthesizedExpressionContext.class,0);
		}
		public FunctionCallExpressionContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionCallExpression(this);
		}
	}
	public static class InitializerExpressionWithArgumentsContext extends PostfixExpressionContext {
		public PostfixExpressionContext postfixExpression() {
			return getRuleContext(PostfixExpressionContext.class,0);
		}
		public ArgumentNamesContext argumentNames() {
			return getRuleContext(ArgumentNamesContext.class,0);
		}
		public InitializerExpressionWithArgumentsContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInitializerExpressionWithArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInitializerExpressionWithArguments(this);
		}
	}
	public static class PrimaryContext extends PostfixExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public PrimaryContext(PostfixExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrimary(this);
		}
	}

	public final PostfixExpressionContext postfixExpression() throws RecognitionException {
		return postfixExpression(0);
	}

	private PostfixExpressionContext postfixExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PostfixExpressionContext _localctx = new PostfixExpressionContext(_ctx, _parentState);
		PostfixExpressionContext _prevctx = _localctx;
		int _startState = 410;
		enterRecursionRule(_localctx, 410, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new PrimaryContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(2105);
			primaryExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(2159);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2157);
					switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
					case 1:
						{
						_localctx = new ForcedValueExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2107);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2108);
						match(T__85);
						}
						break;
					case 2:
						{
						_localctx = new OptionalChainingExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2109);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2110);
						match(T__84);
						}
						break;
					case 3:
						{
						_localctx = new PostfixOperationContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2111);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2112);
						postfixOperator();
						}
						break;
					case 4:
						{
						_localctx = new FunctionCallWithClosureExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2113);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2115);
						_la = _input.LA(1);
						if (_la==T__27) {
							{
							setState(2114);
							parenthesizedExpression();
							}
						}

						setState(2117);
						closureExpression();
						}
						break;
					case 5:
						{
						_localctx = new FunctionCallExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2118);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2119);
						parenthesizedExpression();
						}
						break;
					case 6:
						{
						_localctx = new InitializerExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2120);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2121);
						match(T__69);
						setState(2122);
						match(T__83);
						}
						break;
					case 7:
						{
						_localctx = new InitializerExpressionWithArgumentsContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2123);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2124);
						match(T__69);
						setState(2125);
						match(T__83);
						setState(2126);
						match(T__27);
						setState(2127);
						argumentNames();
						setState(2128);
						match(T__28);
						}
						break;
					case 8:
						{
						_localctx = new ExplicitMemberExpression1Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2130);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2131);
						match(T__69);
						setState(2132);
						match(DecimalLiteral);
						}
						break;
					case 9:
						{
						_localctx = new ExplicitMemberExpression2Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2133);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2134);
						match(T__69);
						setState(2135);
						identifier();
						setState(2137);
						switch ( getInterpreter().adaptivePredict(_input,262,_ctx) ) {
						case 1:
							{
							setState(2136);
							genericArgumentClause();
							}
							break;
						}
						}
						break;
					case 10:
						{
						_localctx = new ExplicitMemberExpression3Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2139);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2140);
						match(T__69);
						setState(2141);
						identifier();
						setState(2142);
						match(T__27);
						setState(2143);
						argumentNames();
						setState(2144);
						match(T__28);
						}
						break;
					case 11:
						{
						_localctx = new PostfixSelfExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2146);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2147);
						match(T__69);
						setState(2148);
						match(T__110);
						}
						break;
					case 12:
						{
						_localctx = new DynamicTypeExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2149);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2150);
						match(T__69);
						setState(2151);
						match(T__115);
						}
						break;
					case 13:
						{
						_localctx = new SubscriptExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2152);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2153);
						match(T__98);
						setState(2154);
						expressionElementList();
						setState(2155);
						match(T__99);
						}
						break;
					}
					} 
				}
				setState(2161);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,264,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArgumentNamesContext extends ParserRuleContext {
		public List<ArgumentNameContext> argumentName() {
			return getRuleContexts(ArgumentNameContext.class);
		}
		public ArgumentNameContext argumentName(int i) {
			return getRuleContext(ArgumentNameContext.class,i);
		}
		public ArgumentNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArgumentNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArgumentNames(this);
		}
	}

	public final ArgumentNamesContext argumentNames() throws RecognitionException {
		ArgumentNamesContext _localctx = new ArgumentNamesContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_argumentNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2163); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2162);
				argumentName();
				}
				}
				setState(2165); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (T__30 - 31)) | (1L << (T__31 - 31)) | (1L << (T__32 - 31)) | (1L << (T__34 - 31)) | (1L << (T__36 - 31)) | (1L << (T__42 - 31)) | (1L << (T__43 - 31)) | (1L << (T__44 - 31)) | (1L << (T__45 - 31)) | (1L << (T__46 - 31)) | (1L << (T__47 - 31)) | (1L << (T__48 - 31)) | (1L << (T__49 - 31)) | (1L << (T__50 - 31)) | (1L << (T__51 - 31)) | (1L << (T__52 - 31)) | (1L << (T__53 - 31)) | (1L << (T__55 - 31)) | (1L << (T__56 - 31)) | (1L << (T__58 - 31)) | (1L << (T__60 - 31)) | (1L << (T__71 - 31)) | (1L << (T__72 - 31)) | (1L << (T__73 - 31)) | (1L << (T__80 - 31)) | (1L << (T__81 - 31)) | (1L << (T__89 - 31)) | (1L << (T__90 - 31)) | (1L << (T__91 - 31)) | (1L << (T__92 - 31)) | (1L << (T__93 - 31)))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (T__121 - 95)) | (1L << (T__122 - 95)) | (1L << (T__128 - 95)) | (1L << (T__129 - 95)) | (1L << (T__131 - 95)) | (1L << (T__132 - 95)) | (1L << (T__133 - 95)) | (1L << (T__134 - 95)) | (1L << (T__135 - 95)) | (1L << (Identifier - 95)))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgumentNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ArgumentNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArgumentName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArgumentName(this);
		}
	}

	public final ArgumentNameContext argumentName() throws RecognitionException {
		ArgumentNameContext _localctx = new ArgumentNameContext(_ctx, getState());
		enterRule(_localctx, 414, RULE_argumentName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2169);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
			case T__34:
			case T__36:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__55:
			case T__56:
			case T__58:
			case T__60:
			case T__71:
			case T__72:
			case T__73:
			case T__81:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__121:
			case T__122:
			case T__128:
			case T__129:
			case T__131:
			case T__132:
			case T__133:
			case T__134:
			case T__135:
			case Identifier:
				{
				setState(2167);
				identifier();
				}
				break;
			case T__80:
				{
				setState(2168);
				match(T__80);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2171);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorHeadContext extends ParserRuleContext {
		public TerminalNode OperatorHead() { return getToken(SwiftParser.OperatorHead, 0); }
		public OperatorHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOperatorHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOperatorHead(this);
		}
	}

	public final OperatorHeadContext operatorHead() throws RecognitionException {
		OperatorHeadContext _localctx = new OperatorHeadContext(_ctx, getState());
		enterRule(_localctx, 416, RULE_operatorHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2173);
			_la = _input.LA(1);
			if ( !(((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (T__29 - 30)) | (1L << (T__38 - 30)) | (1L << (T__39 - 30)) | (1L << (T__40 - 30)) | (1L << (T__70 - 30)) | (1L << (T__84 - 30)) | (1L << (T__85 - 30)))) != 0) || ((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & ((1L << (T__100 - 101)) | (1L << (T__102 - 101)) | (1L << (T__104 - 101)) | (1L << (T__116 - 101)) | (1L << (T__117 - 101)) | (1L << (T__118 - 101)) | (1L << (T__119 - 101)) | (1L << (T__120 - 101)) | (1L << (OperatorHead - 101)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorCharacterContext extends ParserRuleContext {
		public OperatorHeadContext operatorHead() {
			return getRuleContext(OperatorHeadContext.class,0);
		}
		public TerminalNode OperatorCharacter() { return getToken(SwiftParser.OperatorCharacter, 0); }
		public OperatorCharacterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorCharacter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOperatorCharacter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOperatorCharacter(this);
		}
	}

	public final OperatorCharacterContext operatorCharacter() throws RecognitionException {
		OperatorCharacterContext _localctx = new OperatorCharacterContext(_ctx, getState());
		enterRule(_localctx, 418, RULE_operatorCharacter);
		try {
			setState(2177);
			switch (_input.LA(1)) {
			case T__29:
			case T__38:
			case T__39:
			case T__40:
			case T__70:
			case T__84:
			case T__85:
			case T__100:
			case T__102:
			case T__104:
			case T__116:
			case T__117:
			case T__118:
			case T__119:
			case T__120:
			case OperatorHead:
				enterOuterAlt(_localctx, 1);
				{
				setState(2175);
				operatorHead();
				}
				break;
			case OperatorCharacter:
				enterOuterAlt(_localctx, 2);
				{
				setState(2176);
				match(OperatorCharacter);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorContext extends ParserRuleContext {
		public OperatorHeadContext operatorHead() {
			return getRuleContext(OperatorHeadContext.class,0);
		}
		public List<OperatorCharacterContext> operatorCharacter() {
			return getRuleContexts(OperatorCharacterContext.class);
		}
		public OperatorCharacterContext operatorCharacter(int i) {
			return getRuleContext(OperatorCharacterContext.class,i);
		}
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOperator(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 420, RULE_operator);
		try {
			int _alt;
			setState(2194);
			switch (_input.LA(1)) {
			case T__29:
			case T__38:
			case T__39:
			case T__40:
			case T__70:
			case T__84:
			case T__85:
			case T__100:
			case T__102:
			case T__104:
			case T__116:
			case T__117:
			case T__118:
			case T__119:
			case T__120:
			case OperatorHead:
				enterOuterAlt(_localctx, 1);
				{
				setState(2179);
				operatorHead();
				setState(2183);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2180);
						operatorCharacter();
						}
						} 
					}
					setState(2185);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,268,_ctx);
				}
				}
				break;
			case DotOperatorHead:
				enterOuterAlt(_localctx, 2);
				{
				setState(2186);
				match(DotOperatorHead);
				setState(2190);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2187);
						operatorCharacter();
						}
						} 
					}
					setState(2192);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,269,_ctx);
				}
				}
				break;
			case T__77:
				enterOuterAlt(_localctx, 3);
				{
				setState(2193);
				match(T__77);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BinaryOperatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public BinaryOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBinaryOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBinaryOperator(this);
		}
	}

	public final BinaryOperatorContext binaryOperator() throws RecognitionException {
		BinaryOperatorContext _localctx = new BinaryOperatorContext(_ctx, getState());
		enterRule(_localctx, 422, RULE_binaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2196);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrefixOperatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public PrefixOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prefixOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrefixOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrefixOperator(this);
		}
	}

	public final PrefixOperatorContext prefixOperator() throws RecognitionException {
		PrefixOperatorContext _localctx = new PrefixOperatorContext(_ctx, getState());
		enterRule(_localctx, 424, RULE_prefixOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2198);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostfixOperatorContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public PostfixOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postfixOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPostfixOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPostfixOperator(this);
		}
	}

	public final PostfixOperatorContext postfixOperator() throws RecognitionException {
		PostfixOperatorContext _localctx = new PostfixOperatorContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_postfixOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2200);
			operator();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class STypeContext extends ParserRuleContext {
		public ArrayTypeContext arrayType() {
			return getRuleContext(ArrayTypeContext.class,0);
		}
		public DictionaryTypeContext dictionaryType() {
			return getRuleContext(DictionaryTypeContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TupleTypeContext tupleType() {
			return getRuleContext(TupleTypeContext.class,0);
		}
		public ProtocolCompositionTypeContext protocolCompositionType() {
			return getRuleContext(ProtocolCompositionTypeContext.class,0);
		}
		public List<STypeContext> sType() {
			return getRuleContexts(STypeContext.class);
		}
		public STypeContext sType(int i) {
			return getRuleContext(STypeContext.class,i);
		}
		public STypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSType(this);
		}
	}

	public final STypeContext sType() throws RecognitionException {
		return sType(0);
	}

	private STypeContext sType(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		STypeContext _localctx = new STypeContext(_ctx, _parentState);
		STypeContext _prevctx = _localctx;
		int _startState = 428;
		enterRecursionRule(_localctx, 428, RULE_sType, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2208);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				{
				setState(2203);
				arrayType();
				}
				break;
			case 2:
				{
				setState(2204);
				dictionaryType();
				}
				break;
			case 3:
				{
				setState(2205);
				typeIdentifier();
				}
				break;
			case 4:
				{
				setState(2206);
				tupleType();
				}
				break;
			case 5:
				{
				setState(2207);
				protocolCompositionType();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2232);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2230);
					switch ( getInterpreter().adaptivePredict(_input,273,_ctx) ) {
					case 1:
						{
						_localctx = new STypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sType);
						setState(2210);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2212);
						_la = _input.LA(1);
						if (_la==T__74) {
							{
							setState(2211);
							match(T__74);
							}
						}

						setState(2214);
						match(T__76);
						setState(2215);
						sType(10);
						}
						break;
					case 2:
						{
						_localctx = new STypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sType);
						setState(2216);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2217);
						match(T__75);
						setState(2218);
						match(T__76);
						setState(2219);
						sType(9);
						}
						break;
					case 3:
						{
						_localctx = new STypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sType);
						setState(2220);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2221);
						match(T__84);
						}
						break;
					case 4:
						{
						_localctx = new STypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sType);
						setState(2222);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2223);
						match(T__85);
						}
						break;
					case 5:
						{
						_localctx = new STypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sType);
						setState(2224);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2225);
						match(T__69);
						setState(2226);
						match(T__121);
						}
						break;
					case 6:
						{
						_localctx = new STypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sType);
						setState(2227);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2228);
						match(T__69);
						setState(2229);
						match(T__122);
						}
						break;
					}
					} 
				}
				setState(2234);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,274,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ArrayTypeContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public ArrayTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArrayType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArrayType(this);
		}
	}

	public final ArrayTypeContext arrayType() throws RecognitionException {
		ArrayTypeContext _localctx = new ArrayTypeContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2235);
			match(T__98);
			setState(2236);
			sType(0);
			setState(2237);
			match(T__99);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DictionaryTypeContext extends ParserRuleContext {
		public List<STypeContext> sType() {
			return getRuleContexts(STypeContext.class);
		}
		public STypeContext sType(int i) {
			return getRuleContext(STypeContext.class,i);
		}
		public DictionaryTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dictionaryType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterDictionaryType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitDictionaryType(this);
		}
	}

	public final DictionaryTypeContext dictionaryType() throws RecognitionException {
		DictionaryTypeContext _localctx = new DictionaryTypeContext(_ctx, getState());
		enterRule(_localctx, 432, RULE_dictionaryType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2239);
			match(T__98);
			setState(2240);
			sType(0);
			setState(2241);
			match(T__1);
			setState(2242);
			sType(0);
			setState(2243);
			match(T__99);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OptionalTypeContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public OptionalTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOptionalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOptionalType(this);
		}
	}

	public final OptionalTypeContext optionalType() throws RecognitionException {
		OptionalTypeContext _localctx = new OptionalTypeContext(_ctx, getState());
		enterRule(_localctx, 434, RULE_optionalType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2245);
			sType(0);
			setState(2246);
			match(T__84);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImplicitlyUnwrappedOptionalTypeContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public ImplicitlyUnwrappedOptionalTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_implicitlyUnwrappedOptionalType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterImplicitlyUnwrappedOptionalType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitImplicitlyUnwrappedOptionalType(this);
		}
	}

	public final ImplicitlyUnwrappedOptionalTypeContext implicitlyUnwrappedOptionalType() throws RecognitionException {
		ImplicitlyUnwrappedOptionalTypeContext _localctx = new ImplicitlyUnwrappedOptionalTypeContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_implicitlyUnwrappedOptionalType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2248);
			sType(0);
			setState(2249);
			match(T__85);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeAnnotationContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public TypeAnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeAnnotation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypeAnnotation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypeAnnotation(this);
		}
	}

	public final TypeAnnotationContext typeAnnotation() throws RecognitionException {
		TypeAnnotationContext _localctx = new TypeAnnotationContext(_ctx, getState());
		enterRule(_localctx, 438, RULE_typeAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2251);
			match(T__1);
			setState(2253);
			_la = _input.LA(1);
			if (_la==T__97) {
				{
				setState(2252);
				attributes();
				}
			}

			setState(2255);
			sType(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeIdentifierContext extends ParserRuleContext {
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public GenericArgumentClauseContext genericArgumentClause() {
			return getRuleContext(GenericArgumentClauseContext.class,0);
		}
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public TypeIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypeIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypeIdentifier(this);
		}
	}

	public final TypeIdentifierContext typeIdentifier() throws RecognitionException {
		TypeIdentifierContext _localctx = new TypeIdentifierContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_typeIdentifier);
		int _la;
		try {
			setState(2269);
			switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2257);
				typeName();
				setState(2259);
				switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
				case 1:
					{
					setState(2258);
					genericArgumentClause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2261);
				typeName();
				setState(2263);
				_la = _input.LA(1);
				if (_la==T__38) {
					{
					setState(2262);
					genericArgumentClause();
					}
				}

				setState(2265);
				match(T__69);
				setState(2266);
				typeIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2268);
				match(T__123);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2271);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleTypeContext extends ParserRuleContext {
		public TupleTypeBodyContext tupleTypeBody() {
			return getRuleContext(TupleTypeBodyContext.class,0);
		}
		public TupleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTupleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTupleType(this);
		}
	}

	public final TupleTypeContext tupleType() throws RecognitionException {
		TupleTypeContext _localctx = new TupleTypeContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_tupleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2273);
			match(T__27);
			setState(2275);
			_la = _input.LA(1);
			if (((((_la - 28)) & ~0x3f) == 0 && ((1L << (_la - 28)) & ((1L << (T__27 - 28)) | (1L << (T__30 - 28)) | (1L << (T__31 - 28)) | (1L << (T__32 - 28)) | (1L << (T__34 - 28)) | (1L << (T__36 - 28)) | (1L << (T__42 - 28)) | (1L << (T__43 - 28)) | (1L << (T__44 - 28)) | (1L << (T__45 - 28)) | (1L << (T__46 - 28)) | (1L << (T__47 - 28)) | (1L << (T__48 - 28)) | (1L << (T__49 - 28)) | (1L << (T__50 - 28)) | (1L << (T__51 - 28)) | (1L << (T__52 - 28)) | (1L << (T__53 - 28)) | (1L << (T__55 - 28)) | (1L << (T__56 - 28)) | (1L << (T__58 - 28)) | (1L << (T__60 - 28)) | (1L << (T__67 - 28)) | (1L << (T__71 - 28)) | (1L << (T__72 - 28)) | (1L << (T__73 - 28)) | (1L << (T__78 - 28)) | (1L << (T__81 - 28)) | (1L << (T__89 - 28)) | (1L << (T__90 - 28)))) != 0) || ((((_la - 92)) & ~0x3f) == 0 && ((1L << (_la - 92)) & ((1L << (T__91 - 92)) | (1L << (T__92 - 92)) | (1L << (T__93 - 92)) | (1L << (T__94 - 92)) | (1L << (T__97 - 92)) | (1L << (T__98 - 92)) | (1L << (T__121 - 92)) | (1L << (T__122 - 92)) | (1L << (T__123 - 92)) | (1L << (T__128 - 92)) | (1L << (T__129 - 92)) | (1L << (T__131 - 92)) | (1L << (T__132 - 92)) | (1L << (T__133 - 92)) | (1L << (T__134 - 92)) | (1L << (T__135 - 92)) | (1L << (Identifier - 92)))) != 0)) {
				{
				setState(2274);
				tupleTypeBody();
				}
			}

			setState(2277);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleTypeBodyContext extends ParserRuleContext {
		public TupleTypeElementListContext tupleTypeElementList() {
			return getRuleContext(TupleTypeElementListContext.class,0);
		}
		public TupleTypeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleTypeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTupleTypeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTupleTypeBody(this);
		}
	}

	public final TupleTypeBodyContext tupleTypeBody() throws RecognitionException {
		TupleTypeBodyContext _localctx = new TupleTypeBodyContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_tupleTypeBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2279);
			tupleTypeElementList();
			setState(2281);
			_la = _input.LA(1);
			if (_la==T__77) {
				{
				setState(2280);
				match(T__77);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleTypeElementListContext extends ParserRuleContext {
		public List<TupleTypeElementContext> tupleTypeElement() {
			return getRuleContexts(TupleTypeElementContext.class);
		}
		public TupleTypeElementContext tupleTypeElement(int i) {
			return getRuleContext(TupleTypeElementContext.class,i);
		}
		public TupleTypeElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleTypeElementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTupleTypeElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTupleTypeElementList(this);
		}
	}

	public final TupleTypeElementListContext tupleTypeElementList() throws RecognitionException {
		TupleTypeElementListContext _localctx = new TupleTypeElementListContext(_ctx, getState());
		enterRule(_localctx, 448, RULE_tupleTypeElementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2283);
			tupleTypeElement();
			setState(2288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(2284);
				match(T__13);
				setState(2285);
				tupleTypeElement();
				}
				}
				setState(2290);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TupleTypeElementContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ElementNameContext elementName() {
			return getRuleContext(ElementNameContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public TupleTypeElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleTypeElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTupleTypeElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTupleTypeElement(this);
		}
	}

	public final TupleTypeElementContext tupleTypeElement() throws RecognitionException {
		TupleTypeElementContext _localctx = new TupleTypeElementContext(_ctx, getState());
		enterRule(_localctx, 450, RULE_tupleTypeElement);
		int _la;
		try {
			setState(2304);
			switch ( getInterpreter().adaptivePredict(_input,285,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2292);
				_la = _input.LA(1);
				if (_la==T__97) {
					{
					setState(2291);
					attributes();
					}
				}

				setState(2295);
				_la = _input.LA(1);
				if (_la==T__78) {
					{
					setState(2294);
					match(T__78);
					}
				}

				setState(2297);
				sType(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2299);
				_la = _input.LA(1);
				if (_la==T__78) {
					{
					setState(2298);
					match(T__78);
					}
				}

				setState(2301);
				elementName();
				setState(2302);
				typeAnnotation();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ElementNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterElementName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitElementName(this);
		}
	}

	public final ElementNameContext elementName() throws RecognitionException {
		ElementNameContext _localctx = new ElementNameContext(_ctx, getState());
		enterRule(_localctx, 452, RULE_elementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2306);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolCompositionTypeContext extends ParserRuleContext {
		public ProtocolIdentifierListContext protocolIdentifierList() {
			return getRuleContext(ProtocolIdentifierListContext.class,0);
		}
		public ProtocolCompositionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolCompositionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolCompositionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolCompositionType(this);
		}
	}

	public final ProtocolCompositionTypeContext protocolCompositionType() throws RecognitionException {
		ProtocolCompositionTypeContext _localctx = new ProtocolCompositionTypeContext(_ctx, getState());
		enterRule(_localctx, 454, RULE_protocolCompositionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2308);
			match(T__67);
			setState(2309);
			match(T__38);
			setState(2311);
			_la = _input.LA(1);
			if (((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (T__30 - 31)) | (1L << (T__31 - 31)) | (1L << (T__32 - 31)) | (1L << (T__34 - 31)) | (1L << (T__36 - 31)) | (1L << (T__42 - 31)) | (1L << (T__43 - 31)) | (1L << (T__44 - 31)) | (1L << (T__45 - 31)) | (1L << (T__46 - 31)) | (1L << (T__47 - 31)) | (1L << (T__48 - 31)) | (1L << (T__49 - 31)) | (1L << (T__50 - 31)) | (1L << (T__51 - 31)) | (1L << (T__52 - 31)) | (1L << (T__53 - 31)) | (1L << (T__55 - 31)) | (1L << (T__56 - 31)) | (1L << (T__58 - 31)) | (1L << (T__60 - 31)) | (1L << (T__71 - 31)) | (1L << (T__72 - 31)) | (1L << (T__73 - 31)) | (1L << (T__81 - 31)) | (1L << (T__89 - 31)) | (1L << (T__90 - 31)) | (1L << (T__91 - 31)) | (1L << (T__92 - 31)) | (1L << (T__93 - 31)))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (T__121 - 95)) | (1L << (T__122 - 95)) | (1L << (T__123 - 95)) | (1L << (T__128 - 95)) | (1L << (T__129 - 95)) | (1L << (T__131 - 95)) | (1L << (T__132 - 95)) | (1L << (T__133 - 95)) | (1L << (T__134 - 95)) | (1L << (T__135 - 95)) | (1L << (Identifier - 95)))) != 0)) {
				{
				setState(2310);
				protocolIdentifierList();
				}
			}

			setState(2313);
			match(T__39);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolIdentifierListContext extends ParserRuleContext {
		public List<ProtocolIdentifierContext> protocolIdentifier() {
			return getRuleContexts(ProtocolIdentifierContext.class);
		}
		public ProtocolIdentifierContext protocolIdentifier(int i) {
			return getRuleContext(ProtocolIdentifierContext.class,i);
		}
		public ProtocolIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolIdentifierList(this);
		}
	}

	public final ProtocolIdentifierListContext protocolIdentifierList() throws RecognitionException {
		ProtocolIdentifierListContext _localctx = new ProtocolIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 456, RULE_protocolIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2315);
			protocolIdentifier();
			setState(2320);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(2316);
				match(T__13);
				setState(2317);
				protocolIdentifier();
				}
				}
				setState(2322);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProtocolIdentifierContext extends ParserRuleContext {
		public TypeIdentifierContext typeIdentifier() {
			return getRuleContext(TypeIdentifierContext.class,0);
		}
		public ProtocolIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolIdentifier(this);
		}
	}

	public final ProtocolIdentifierContext protocolIdentifier() throws RecognitionException {
		ProtocolIdentifierContext _localctx = new ProtocolIdentifierContext(_ctx, getState());
		enterRule(_localctx, 458, RULE_protocolIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2323);
			typeIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetatypeTypeContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public MetatypeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metatypeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterMetatypeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitMetatypeType(this);
		}
	}

	public final MetatypeTypeContext metatypeType() throws RecognitionException {
		MetatypeTypeContext _localctx = new MetatypeTypeContext(_ctx, getState());
		enterRule(_localctx, 460, RULE_metatypeType);
		try {
			setState(2333);
			switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2325);
				sType(0);
				setState(2326);
				match(T__69);
				setState(2327);
				match(T__121);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2329);
				sType(0);
				setState(2330);
				match(T__69);
				setState(2331);
				match(T__122);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeInheritanceClauseContext extends ParserRuleContext {
		public ClassRequirementContext classRequirement() {
			return getRuleContext(ClassRequirementContext.class,0);
		}
		public TypeInheritanceListContext typeInheritanceList() {
			return getRuleContext(TypeInheritanceListContext.class,0);
		}
		public TypeInheritanceClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeInheritanceClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypeInheritanceClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypeInheritanceClause(this);
		}
	}

	public final TypeInheritanceClauseContext typeInheritanceClause() throws RecognitionException {
		TypeInheritanceClauseContext _localctx = new TypeInheritanceClauseContext(_ctx, getState());
		enterRule(_localctx, 462, RULE_typeInheritanceClause);
		try {
			setState(2344);
			switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2335);
				match(T__1);
				setState(2336);
				classRequirement();
				setState(2337);
				match(T__13);
				setState(2338);
				typeInheritanceList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2340);
				match(T__1);
				setState(2341);
				classRequirement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2342);
				match(T__1);
				setState(2343);
				typeInheritanceList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeInheritanceListContext extends ParserRuleContext {
		public List<TypeIdentifierContext> typeIdentifier() {
			return getRuleContexts(TypeIdentifierContext.class);
		}
		public TypeIdentifierContext typeIdentifier(int i) {
			return getRuleContext(TypeIdentifierContext.class,i);
		}
		public TypeInheritanceListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeInheritanceList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTypeInheritanceList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTypeInheritanceList(this);
		}
	}

	public final TypeInheritanceListContext typeInheritanceList() throws RecognitionException {
		TypeInheritanceListContext _localctx = new TypeInheritanceListContext(_ctx, getState());
		enterRule(_localctx, 464, RULE_typeInheritanceList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2346);
			typeIdentifier();
			setState(2351);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(2347);
				match(T__13);
				setState(2348);
				typeIdentifier();
				}
				}
				setState(2353);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ClassRequirementContext extends ParserRuleContext {
		public ClassRequirementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classRequirement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClassRequirement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClassRequirement(this);
		}
	}

	public final ClassRequirementContext classRequirement() throws RecognitionException {
		ClassRequirementContext _localctx = new ClassRequirementContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_classRequirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2354);
			match(T__41);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompilerControlStatementContext extends ParserRuleContext {
		public BuildConfigurationStatementContext buildConfigurationStatement() {
			return getRuleContext(BuildConfigurationStatementContext.class,0);
		}
		public LineControlStatementContext lineControlStatement() {
			return getRuleContext(LineControlStatementContext.class,0);
		}
		public CompilerControlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilerControlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCompilerControlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCompilerControlStatement(this);
		}
	}

	public final CompilerControlStatementContext compilerControlStatement() throws RecognitionException {
		CompilerControlStatementContext _localctx = new CompilerControlStatementContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_compilerControlStatement);
		try {
			setState(2358);
			switch (_input.LA(1)) {
			case T__124:
				enterOuterAlt(_localctx, 1);
				{
				setState(2356);
				buildConfigurationStatement();
				}
				break;
			case T__107:
				enterOuterAlt(_localctx, 2);
				{
				setState(2357);
				lineControlStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuildConfigurationStatementContext extends ParserRuleContext {
		public BuildConfigurationContext buildConfiguration() {
			return getRuleContext(BuildConfigurationContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BuildConfigurationElseIfClausesContext buildConfigurationElseIfClauses() {
			return getRuleContext(BuildConfigurationElseIfClausesContext.class,0);
		}
		public BuildConfigurationElseClauseContext buildConfigurationElseClause() {
			return getRuleContext(BuildConfigurationElseClauseContext.class,0);
		}
		public BuildConfigurationStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildConfigurationStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBuildConfigurationStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBuildConfigurationStatement(this);
		}
	}

	public final BuildConfigurationStatementContext buildConfigurationStatement() throws RecognitionException {
		BuildConfigurationStatementContext _localctx = new BuildConfigurationStatementContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_buildConfigurationStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2360);
			match(T__124);
			setState(2361);
			buildConfiguration(0);
			setState(2363);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__77 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__124 - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (T__128 - 129)) | (1L << (T__129 - 129)) | (1L << (T__131 - 129)) | (1L << (T__132 - 129)) | (1L << (T__133 - 129)) | (1L << (T__134 - 129)) | (1L << (T__135 - 129)) | (1L << (BooleanLiteral - 129)) | (1L << (NilLiteral - 129)) | (1L << (OperatorHead - 129)) | (1L << (DotOperatorHead - 129)) | (1L << (Identifier - 129)) | (1L << (BinaryLiteral - 129)) | (1L << (OctalLiteral - 129)) | (1L << (DecimalLiteral - 129)) | (1L << (HexadecimalLiteral - 129)) | (1L << (FloatingPointLiteral - 129)) | (1L << (StringLiteral - 129)))) != 0)) {
				{
				setState(2362);
				statements();
				}
			}

			setState(2366);
			_la = _input.LA(1);
			if (_la==T__126) {
				{
				setState(2365);
				buildConfigurationElseIfClauses();
				}
			}

			setState(2369);
			_la = _input.LA(1);
			if (_la==T__127) {
				{
				setState(2368);
				buildConfigurationElseClause();
				}
			}

			setState(2371);
			match(T__125);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuildConfigurationElseIfClausesContext extends ParserRuleContext {
		public List<BuildConfigurationElseIfClauseContext> buildConfigurationElseIfClause() {
			return getRuleContexts(BuildConfigurationElseIfClauseContext.class);
		}
		public BuildConfigurationElseIfClauseContext buildConfigurationElseIfClause(int i) {
			return getRuleContext(BuildConfigurationElseIfClauseContext.class,i);
		}
		public BuildConfigurationElseIfClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildConfigurationElseIfClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBuildConfigurationElseIfClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBuildConfigurationElseIfClauses(this);
		}
	}

	public final BuildConfigurationElseIfClausesContext buildConfigurationElseIfClauses() throws RecognitionException {
		BuildConfigurationElseIfClausesContext _localctx = new BuildConfigurationElseIfClausesContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_buildConfigurationElseIfClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2374); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2373);
				buildConfigurationElseIfClause();
				}
				}
				setState(2376); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__126 );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuildConfigurationElseIfClauseContext extends ParserRuleContext {
		public BuildConfigurationContext buildConfiguration() {
			return getRuleContext(BuildConfigurationContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BuildConfigurationElseIfClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildConfigurationElseIfClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBuildConfigurationElseIfClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBuildConfigurationElseIfClause(this);
		}
	}

	public final BuildConfigurationElseIfClauseContext buildConfigurationElseIfClause() throws RecognitionException {
		BuildConfigurationElseIfClauseContext _localctx = new BuildConfigurationElseIfClauseContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_buildConfigurationElseIfClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2378);
			match(T__126);
			setState(2379);
			buildConfiguration(0);
			setState(2381);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__77 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__124 - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (T__128 - 129)) | (1L << (T__129 - 129)) | (1L << (T__131 - 129)) | (1L << (T__132 - 129)) | (1L << (T__133 - 129)) | (1L << (T__134 - 129)) | (1L << (T__135 - 129)) | (1L << (BooleanLiteral - 129)) | (1L << (NilLiteral - 129)) | (1L << (OperatorHead - 129)) | (1L << (DotOperatorHead - 129)) | (1L << (Identifier - 129)) | (1L << (BinaryLiteral - 129)) | (1L << (OctalLiteral - 129)) | (1L << (DecimalLiteral - 129)) | (1L << (HexadecimalLiteral - 129)) | (1L << (FloatingPointLiteral - 129)) | (1L << (StringLiteral - 129)))) != 0)) {
				{
				setState(2380);
				statements();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuildConfigurationElseClauseContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public BuildConfigurationElseClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildConfigurationElseClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBuildConfigurationElseClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBuildConfigurationElseClause(this);
		}
	}

	public final BuildConfigurationElseClauseContext buildConfigurationElseClause() throws RecognitionException {
		BuildConfigurationElseClauseContext _localctx = new BuildConfigurationElseClauseContext(_ctx, getState());
		enterRule(_localctx, 476, RULE_buildConfigurationElseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2383);
			match(T__127);
			setState(2385);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__23) | (1L << T__24) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__56) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__77 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__92 - 64)) | (1L << (T__93 - 64)) | (1L << (T__94 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__114 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__124 - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (T__128 - 129)) | (1L << (T__129 - 129)) | (1L << (T__131 - 129)) | (1L << (T__132 - 129)) | (1L << (T__133 - 129)) | (1L << (T__134 - 129)) | (1L << (T__135 - 129)) | (1L << (BooleanLiteral - 129)) | (1L << (NilLiteral - 129)) | (1L << (OperatorHead - 129)) | (1L << (DotOperatorHead - 129)) | (1L << (Identifier - 129)) | (1L << (BinaryLiteral - 129)) | (1L << (OctalLiteral - 129)) | (1L << (DecimalLiteral - 129)) | (1L << (HexadecimalLiteral - 129)) | (1L << (FloatingPointLiteral - 129)) | (1L << (StringLiteral - 129)))) != 0)) {
				{
				setState(2384);
				statements();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BuildConfigurationContext extends ParserRuleContext {
		public List<BuildConfigurationContext> buildConfiguration() {
			return getRuleContexts(BuildConfigurationContext.class);
		}
		public BuildConfigurationContext buildConfiguration(int i) {
			return getRuleContext(BuildConfigurationContext.class,i);
		}
		public PlatformTestingFunctionContext platformTestingFunction() {
			return getRuleContext(PlatformTestingFunctionContext.class,0);
		}
		public LanguageVersionTestingFunctionContext languageVersionTestingFunction() {
			return getRuleContext(LanguageVersionTestingFunctionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public BuildConfigurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_buildConfiguration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBuildConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBuildConfiguration(this);
		}
	}

	public final BuildConfigurationContext buildConfiguration() throws RecognitionException {
		return buildConfiguration(0);
	}

	private BuildConfigurationContext buildConfiguration(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BuildConfigurationContext _localctx = new BuildConfigurationContext(_ctx, _parentState);
		BuildConfigurationContext _prevctx = _localctx;
		int _startState = 478;
		enterRecursionRule(_localctx, 478, RULE_buildConfiguration, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2398);
			switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
			case 1:
				{
				setState(2388);
				match(T__85);
				setState(2389);
				buildConfiguration(2);
				}
				break;
			case 2:
				{
				setState(2390);
				platformTestingFunction();
				}
				break;
			case 3:
				{
				setState(2391);
				languageVersionTestingFunction();
				}
				break;
			case 4:
				{
				setState(2392);
				identifier();
				}
				break;
			case 5:
				{
				setState(2393);
				booleanLiteral();
				}
				break;
			case 6:
				{
				setState(2394);
				match(T__27);
				setState(2395);
				buildConfiguration(0);
				setState(2396);
				match(T__28);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2405);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new BuildConfigurationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_buildConfiguration);
					setState(2400);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2401);
					_la = _input.LA(1);
					if ( !(_la==T__118 || _la==T__119) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(2402);
					buildConfiguration(2);
					}
					} 
				}
				setState(2407);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,299,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PlatformTestingFunctionContext extends ParserRuleContext {
		public OperatingSystemContext operatingSystem() {
			return getRuleContext(OperatingSystemContext.class,0);
		}
		public ArchitectureContext architecture() {
			return getRuleContext(ArchitectureContext.class,0);
		}
		public PlatformTestingFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_platformTestingFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPlatformTestingFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPlatformTestingFunction(this);
		}
	}

	public final PlatformTestingFunctionContext platformTestingFunction() throws RecognitionException {
		PlatformTestingFunctionContext _localctx = new PlatformTestingFunctionContext(_ctx, getState());
		enterRule(_localctx, 480, RULE_platformTestingFunction);
		try {
			setState(2418);
			switch (_input.LA(1)) {
			case T__128:
				enterOuterAlt(_localctx, 1);
				{
				setState(2408);
				match(T__128);
				setState(2409);
				match(T__27);
				setState(2410);
				operatingSystem();
				setState(2411);
				match(T__28);
				}
				break;
			case T__129:
				enterOuterAlt(_localctx, 2);
				{
				setState(2413);
				match(T__129);
				setState(2414);
				match(T__27);
				setState(2415);
				architecture();
				setState(2416);
				match(T__28);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LanguageVersionTestingFunctionContext extends ParserRuleContext {
		public SwiftVersionContext swiftVersion() {
			return getRuleContext(SwiftVersionContext.class,0);
		}
		public LanguageVersionTestingFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_languageVersionTestingFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLanguageVersionTestingFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLanguageVersionTestingFunction(this);
		}
	}

	public final LanguageVersionTestingFunctionContext languageVersionTestingFunction() throws RecognitionException {
		LanguageVersionTestingFunctionContext _localctx = new LanguageVersionTestingFunctionContext(_ctx, getState());
		enterRule(_localctx, 482, RULE_languageVersionTestingFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2420);
			match(T__130);
			setState(2421);
			match(T__27);
			setState(2422);
			match(T__120);
			setState(2423);
			swiftVersion();
			setState(2424);
			match(T__28);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatingSystemContext extends ParserRuleContext {
		public OperatingSystemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatingSystem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterOperatingSystem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitOperatingSystem(this);
		}
	}

	public final OperatingSystemContext operatingSystem() throws RecognitionException {
		OperatingSystemContext _localctx = new OperatingSystemContext(_ctx, getState());
		enterRule(_localctx, 484, RULE_operatingSystem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2426);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArchitectureContext extends ParserRuleContext {
		public ArchitectureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_architecture; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArchitecture(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArchitecture(this);
		}
	}

	public final ArchitectureContext architecture() throws RecognitionException {
		ArchitectureContext _localctx = new ArchitectureContext(_ctx, getState());
		enterRule(_localctx, 486, RULE_architecture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2428);
			_la = _input.LA(1);
			if ( !(((((_la - 132)) & ~0x3f) == 0 && ((1L << (_la - 132)) & ((1L << (T__131 - 132)) | (1L << (T__132 - 132)) | (1L << (T__133 - 132)) | (1L << (T__134 - 132)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SwiftVersionContext extends ParserRuleContext {
		public TerminalNode FloatingPointLiteral() { return getToken(SwiftParser.FloatingPointLiteral, 0); }
		public SwiftVersionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_swiftVersion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterSwiftVersion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitSwiftVersion(this);
		}
	}

	public final SwiftVersionContext swiftVersion() throws RecognitionException {
		SwiftVersionContext _localctx = new SwiftVersionContext(_ctx, getState());
		enterRule(_localctx, 488, RULE_swiftVersion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2430);
			match(FloatingPointLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineControlStatementContext extends ParserRuleContext {
		public LineNumberContext lineNumber() {
			return getRuleContext(LineNumberContext.class,0);
		}
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public LineControlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineControlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLineControlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLineControlStatement(this);
		}
	}

	public final LineControlStatementContext lineControlStatement() throws RecognitionException {
		LineControlStatementContext _localctx = new LineControlStatementContext(_ctx, getState());
		enterRule(_localctx, 490, RULE_lineControlStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2432);
			match(T__107);
			setState(2436);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				{
				setState(2433);
				lineNumber();
				setState(2434);
				fileName();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineNumberContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public LineNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lineNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLineNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLineNumber(this);
		}
	}

	public final LineNumberContext lineNumber() throws RecognitionException {
		LineNumberContext _localctx = new LineNumberContext(_ctx, getState());
		enterRule(_localctx, 492, RULE_lineNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2438);
			integerLiteral();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileNameContext extends ParserRuleContext {
		public TerminalNode StringLiteral() { return getToken(SwiftParser.StringLiteral, 0); }
		public FileNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFileName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFileName(this);
		}
	}

	public final FileNameContext fileName() throws RecognitionException {
		FileNameContext _localctx = new FileNameContext(_ctx, getState());
		enterRule(_localctx, 494, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2440);
			match(StringLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(SwiftParser.Identifier, 0); }
		public ContextSensitiveKeywordContext contextSensitiveKeyword() {
			return getRuleContext(ContextSensitiveKeywordContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIdentifier(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 496, RULE_identifier);
		try {
			setState(2444);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2442);
				match(Identifier);
				}
				break;
			case T__30:
			case T__31:
			case T__32:
			case T__34:
			case T__36:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__55:
			case T__56:
			case T__58:
			case T__60:
			case T__71:
			case T__72:
			case T__73:
			case T__81:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__121:
			case T__122:
			case T__128:
			case T__129:
			case T__131:
			case T__132:
			case T__133:
			case T__134:
			case T__135:
				enterOuterAlt(_localctx, 2);
				{
				setState(2443);
				contextSensitiveKeyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(SwiftParser.BooleanLiteral, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitKeyword(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 498, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2446);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__25) | (1L << T__26) | (1L << T__41) | (1L << T__54) | (1L << T__59) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__80 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__123 - 64)) | (1L << (T__124 - 64)) | (1L << (T__125 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (T__127 - 128)) | (1L << (BooleanLiteral - 128)) | (1L << (NilLiteral - 128)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContextSensitiveKeywordContext extends ParserRuleContext {
		public ContextSensitiveKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contextSensitiveKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterContextSensitiveKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitContextSensitiveKeyword(this);
		}
	}

	public final ContextSensitiveKeywordContext contextSensitiveKeyword() throws RecognitionException {
		ContextSensitiveKeywordContext _localctx = new ContextSensitiveKeywordContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_contextSensitiveKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2448);
			_la = _input.LA(1);
			if ( !(((((_la - 31)) & ~0x3f) == 0 && ((1L << (_la - 31)) & ((1L << (T__30 - 31)) | (1L << (T__31 - 31)) | (1L << (T__32 - 31)) | (1L << (T__34 - 31)) | (1L << (T__36 - 31)) | (1L << (T__42 - 31)) | (1L << (T__43 - 31)) | (1L << (T__44 - 31)) | (1L << (T__45 - 31)) | (1L << (T__46 - 31)) | (1L << (T__47 - 31)) | (1L << (T__48 - 31)) | (1L << (T__49 - 31)) | (1L << (T__50 - 31)) | (1L << (T__51 - 31)) | (1L << (T__52 - 31)) | (1L << (T__53 - 31)) | (1L << (T__55 - 31)) | (1L << (T__56 - 31)) | (1L << (T__58 - 31)) | (1L << (T__60 - 31)) | (1L << (T__71 - 31)) | (1L << (T__72 - 31)) | (1L << (T__73 - 31)) | (1L << (T__81 - 31)) | (1L << (T__89 - 31)) | (1L << (T__90 - 31)) | (1L << (T__91 - 31)) | (1L << (T__92 - 31)) | (1L << (T__93 - 31)))) != 0) || ((((_la - 95)) & ~0x3f) == 0 && ((1L << (_la - 95)) & ((1L << (T__94 - 95)) | (1L << (T__121 - 95)) | (1L << (T__122 - 95)) | (1L << (T__128 - 95)) | (1L << (T__129 - 95)) | (1L << (T__131 - 95)) | (1L << (T__132 - 95)) | (1L << (T__133 - 95)) | (1L << (T__134 - 95)) | (1L << (T__135 - 95)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIdentifierList(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 502, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2452);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
			case T__34:
			case T__36:
			case T__42:
			case T__43:
			case T__44:
			case T__45:
			case T__46:
			case T__47:
			case T__48:
			case T__49:
			case T__50:
			case T__51:
			case T__52:
			case T__53:
			case T__55:
			case T__56:
			case T__58:
			case T__60:
			case T__71:
			case T__72:
			case T__73:
			case T__81:
			case T__89:
			case T__90:
			case T__91:
			case T__92:
			case T__93:
			case T__94:
			case T__121:
			case T__122:
			case T__128:
			case T__129:
			case T__131:
			case T__132:
			case T__133:
			case T__134:
			case T__135:
			case Identifier:
				{
				setState(2450);
				identifier();
				}
				break;
			case T__80:
				{
				setState(2451);
				match(T__80);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(2454);
				match(T__13);
				setState(2457);
				switch (_input.LA(1)) {
				case T__30:
				case T__31:
				case T__32:
				case T__34:
				case T__36:
				case T__42:
				case T__43:
				case T__44:
				case T__45:
				case T__46:
				case T__47:
				case T__48:
				case T__49:
				case T__50:
				case T__51:
				case T__52:
				case T__53:
				case T__55:
				case T__56:
				case T__58:
				case T__60:
				case T__71:
				case T__72:
				case T__73:
				case T__81:
				case T__89:
				case T__90:
				case T__91:
				case T__92:
				case T__93:
				case T__94:
				case T__121:
				case T__122:
				case T__128:
				case T__129:
				case T__131:
				case T__132:
				case T__133:
				case T__134:
				case T__135:
				case Identifier:
					{
					setState(2455);
					identifier();
					}
					break;
				case T__80:
					{
					setState(2456);
					match(T__80);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(2463);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public TerminalNode BooleanLiteral() { return getToken(SwiftParser.BooleanLiteral, 0); }
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitBooleanLiteral(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 504, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2464);
			match(BooleanLiteral);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public NumericLiteralContext numericLiteral() {
			return getRuleContext(NumericLiteralContext.class,0);
		}
		public TerminalNode StringLiteral() { return getToken(SwiftParser.StringLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(SwiftParser.BooleanLiteral, 0); }
		public TerminalNode NilLiteral() { return getToken(SwiftParser.NilLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitLiteral(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 506, RULE_literal);
		try {
			setState(2470);
			switch (_input.LA(1)) {
			case T__100:
			case BinaryLiteral:
			case OctalLiteral:
			case DecimalLiteral:
			case HexadecimalLiteral:
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2466);
				numericLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2467);
				match(StringLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2468);
				match(BooleanLiteral);
				}
				break;
			case NilLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2469);
				match(NilLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumericLiteralContext extends ParserRuleContext {
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public TerminalNode FloatingPointLiteral() { return getToken(SwiftParser.FloatingPointLiteral, 0); }
		public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numericLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitNumericLiteral(this);
		}
	}

	public final NumericLiteralContext numericLiteral() throws RecognitionException {
		NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
		enterRule(_localctx, 508, RULE_numericLiteral);
		int _la;
		try {
			setState(2480);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2473);
				_la = _input.LA(1);
				if (_la==T__100) {
					{
					setState(2472);
					match(T__100);
					}
				}

				setState(2475);
				integerLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2477);
				_la = _input.LA(1);
				if (_la==T__100) {
					{
					setState(2476);
					match(T__100);
					}
				}

				setState(2479);
				match(FloatingPointLiteral);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode BinaryLiteral() { return getToken(SwiftParser.BinaryLiteral, 0); }
		public TerminalNode OctalLiteral() { return getToken(SwiftParser.OctalLiteral, 0); }
		public TerminalNode DecimalLiteral() { return getToken(SwiftParser.DecimalLiteral, 0); }
		public TerminalNode HexadecimalLiteral() { return getToken(SwiftParser.HexadecimalLiteral, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIntegerLiteral(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 510, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2482);
			_la = _input.LA(1);
			if ( !(((((_la - 144)) & ~0x3f) == 0 && ((1L << (_la - 144)) & ((1L << (BinaryLiteral - 144)) | (1L << (OctalLiteral - 144)) | (1L << (DecimalLiteral - 144)) | (1L << (HexadecimalLiteral - 144)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 153:
			return pattern_sempred((PatternContext)_localctx, predIndex);
		case 205:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 214:
			return sType_sempred((STypeContext)_localctx, predIndex);
		case 239:
			return buildConfiguration_sempred((BuildConfigurationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean pattern_sempred(PatternContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean postfixExpression_sempred(PostfixExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sType_sempred(STypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 9);
		case 15:
			return precpred(_ctx, 8);
		case 16:
			return precpred(_ctx, 5);
		case 17:
			return precpred(_ctx, 4);
		case 18:
			return precpred(_ctx, 2);
		case 19:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean buildConfiguration_sempred(BuildConfigurationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 20:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u009c\u09b7\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\4\u0099\t\u0099\4\u009a\t\u009a\4\u009b\t\u009b"+
		"\4\u009c\t\u009c\4\u009d\t\u009d\4\u009e\t\u009e\4\u009f\t\u009f\4\u00a0"+
		"\t\u00a0\4\u00a1\t\u00a1\4\u00a2\t\u00a2\4\u00a3\t\u00a3\4\u00a4\t\u00a4"+
		"\4\u00a5\t\u00a5\4\u00a6\t\u00a6\4\u00a7\t\u00a7\4\u00a8\t\u00a8\4\u00a9"+
		"\t\u00a9\4\u00aa\t\u00aa\4\u00ab\t\u00ab\4\u00ac\t\u00ac\4\u00ad\t\u00ad"+
		"\4\u00ae\t\u00ae\4\u00af\t\u00af\4\u00b0\t\u00b0\4\u00b1\t\u00b1\4\u00b2"+
		"\t\u00b2\4\u00b3\t\u00b3\4\u00b4\t\u00b4\4\u00b5\t\u00b5\4\u00b6\t\u00b6"+
		"\4\u00b7\t\u00b7\4\u00b8\t\u00b8\4\u00b9\t\u00b9\4\u00ba\t\u00ba\4\u00bb"+
		"\t\u00bb\4\u00bc\t\u00bc\4\u00bd\t\u00bd\4\u00be\t\u00be\4\u00bf\t\u00bf"+
		"\4\u00c0\t\u00c0\4\u00c1\t\u00c1\4\u00c2\t\u00c2\4\u00c3\t\u00c3\4\u00c4"+
		"\t\u00c4\4\u00c5\t\u00c5\4\u00c6\t\u00c6\4\u00c7\t\u00c7\4\u00c8\t\u00c8"+
		"\4\u00c9\t\u00c9\4\u00ca\t\u00ca\4\u00cb\t\u00cb\4\u00cc\t\u00cc\4\u00cd"+
		"\t\u00cd\4\u00ce\t\u00ce\4\u00cf\t\u00cf\4\u00d0\t\u00d0\4\u00d1\t\u00d1"+
		"\4\u00d2\t\u00d2\4\u00d3\t\u00d3\4\u00d4\t\u00d4\4\u00d5\t\u00d5\4\u00d6"+
		"\t\u00d6\4\u00d7\t\u00d7\4\u00d8\t\u00d8\4\u00d9\t\u00d9\4\u00da\t\u00da"+
		"\4\u00db\t\u00db\4\u00dc\t\u00dc\4\u00dd\t\u00dd\4\u00de\t\u00de\4\u00df"+
		"\t\u00df\4\u00e0\t\u00e0\4\u00e1\t\u00e1\4\u00e2\t\u00e2\4\u00e3\t\u00e3"+
		"\4\u00e4\t\u00e4\4\u00e5\t\u00e5\4\u00e6\t\u00e6\4\u00e7\t\u00e7\4\u00e8"+
		"\t\u00e8\4\u00e9\t\u00e9\4\u00ea\t\u00ea\4\u00eb\t\u00eb\4\u00ec\t\u00ec"+
		"\4\u00ed\t\u00ed\4\u00ee\t\u00ee\4\u00ef\t\u00ef\4\u00f0\t\u00f0\4\u00f1"+
		"\t\u00f1\4\u00f2\t\u00f2\4\u00f3\t\u00f3\4\u00f4\t\u00f4\4\u00f5\t\u00f5"+
		"\4\u00f6\t\u00f6\4\u00f7\t\u00f7\4\u00f8\t\u00f8\4\u00f9\t\u00f9\4\u00fa"+
		"\t\u00fa\4\u00fb\t\u00fb\4\u00fc\t\u00fc\4\u00fd\t\u00fd\4\u00fe\t\u00fe"+
		"\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\3\2\5\2\u0204\n\2\3\2"+
		"\3\2\3\3\3\3\5\3\u020a\n\3\3\3\3\3\5\3\u020e\n\3\3\3\3\3\5\3\u0212\n\3"+
		"\3\3\3\3\3\3\5\3\u0217\n\3\3\3\3\3\5\3\u021b\n\3\3\3\3\3\5\3\u021f\n\3"+
		"\3\3\3\3\5\3\u0223\n\3\3\3\3\3\5\3\u0227\n\3\5\3\u0229\n\3\3\4\6\4\u022c"+
		"\n\4\r\4\16\4\u022d\3\5\3\5\3\5\5\5\u0233\n\5\3\6\3\6\5\6\u0237\n\6\3"+
		"\6\3\6\3\6\3\6\5\6\u023d\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\5\t\u024d\n\t\3\n\3\n\3\n\3\n\5\n\u0253\n\n\3\13\3\13\3"+
		"\13\3\13\5\13\u0259\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0264"+
		"\n\r\3\r\3\r\3\16\6\16\u0269\n\16\r\16\16\16\u026a\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0279\n\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\7\21\u0282\n\21\f\21\16\21\u0285\13\21\3\22\3\22"+
		"\5\22\u0289\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u0294"+
		"\n\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u02a0\n\27"+
		"\3\30\3\30\5\30\u02a4\n\30\3\31\3\31\5\31\u02a8\n\31\3\32\3\32\3\33\3"+
		"\33\5\33\u02ae\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\5\36"+
		"\u02b9\n\36\3\37\3\37\5\37\u02bd\n\37\3 \3 \5 \u02c1\n \3 \5 \u02c4\n"+
		" \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\5!\u02d2\n!\3\"\3\"\3\"\7\"\u02d7"+
		"\n\"\f\"\16\"\u02da\13\"\3#\3#\3#\5#\u02df\n#\3$\3$\3$\3$\5$\u02e5\n$"+
		"\3%\3%\3%\5%\u02ea\n%\3%\5%\u02ed\n%\3&\3&\3&\3&\3&\3&\3&\3&\5&\u02f7"+
		"\n&\3\'\3\'\3\'\7\'\u02fc\n\'\f\'\16\'\u02ff\13\'\3(\3(\3(\3(\5(\u0305"+
		"\n(\3)\3)\3)\3*\3*\3+\3+\3+\3+\3+\3,\3,\3,\7,\u0314\n,\f,\16,\u0317\13"+
		",\3-\3-\3-\3-\5-\u031d\n-\3.\3.\3/\3/\3\60\3\60\3\60\5\60\u0326\n\60\3"+
		"\60\3\60\3\61\3\61\3\61\7\61\u032d\n\61\f\61\16\61\u0330\13\61\3\62\3"+
		"\62\3\62\3\62\3\62\3\62\3\62\3\62\3\62\5\62\u033b\n\62\3\63\3\63\3\63"+
		"\3\64\3\64\3\64\7\64\u0343\n\64\f\64\16\64\u0346\13\64\3\65\3\65\5\65"+
		"\u034a\n\65\3\66\3\66\3\66\3\66\3\66\3\66\3\66\3\66\5\66\u0354\n\66\3"+
		"\67\3\67\3\67\3\67\38\38\38\38\39\39\39\79\u0361\n9\f9\169\u0364\139\3"+
		":\3:\3;\3;\5;\u036a\n;\3;\3;\5;\u036e\n;\3;\3;\5;\u0372\n;\3;\3;\5;\u0376"+
		"\n;\3;\3;\5;\u037a\n;\3;\3;\5;\u037e\n;\3;\3;\5;\u0382\n;\3;\3;\5;\u0386"+
		"\n;\3;\3;\5;\u038a\n;\3;\3;\5;\u038e\n;\3;\3;\5;\u0392\n;\3;\3;\5;\u0396"+
		"\n;\3;\3;\5;\u039a\n;\3;\3;\5;\u039e\n;\3;\3;\5;\u03a2\n;\5;\u03a4\n;"+
		"\3<\6<\u03a7\n<\r<\16<\u03a8\3=\6=\u03ac\n=\r=\16=\u03ad\3>\3>\3>\3>\3"+
		">\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\3>\5>\u03c9"+
		"\n>\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\3?\5?\u03da\n?\3@\6@\u03dd"+
		"\n@\r@\16@\u03de\3A\3A\5A\u03e3\nA\3A\3A\3B\5B\u03e8\nB\3B\3B\5B\u03ec"+
		"\nB\3B\3B\3C\3C\3D\3D\3D\3D\3D\5D\u03f7\nD\3E\3E\5E\u03fb\nE\3F\5F\u03fe"+
		"\nF\3F\5F\u0401\nF\3F\3F\3F\3G\3G\3G\7G\u0409\nG\fG\16G\u040c\13G\3H\3"+
		"H\5H\u0410\nH\3I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\3"+
		"J\3J\3J\3J\5J\u0428\nJ\3J\3J\3J\3J\3J\3J\3J\3J\3J\3J\5J\u0434\nJ\3K\5"+
		"K\u0437\nK\3K\5K\u043a\nK\3K\3K\3L\3L\3M\3M\3M\5M\u0443\nM\3M\3M\3M\3"+
		"M\3M\3M\3M\5M\u044c\nM\3N\5N\u044f\nN\3N\5N\u0452\nN\3N\3N\3N\3O\5O\u0458"+
		"\nO\3O\5O\u045b\nO\3O\3O\5O\u045f\nO\3O\3O\3P\3P\3P\3P\3Q\3Q\3Q\5Q\u046a"+
		"\nQ\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u0473\nQ\3R\5R\u0476\nR\3R\3R\3S\5S\u047b"+
		"\nS\3S\3S\3T\3T\3T\5T\u0482\nT\3T\3T\3T\3T\3T\5T\u0489\nT\3T\3T\5T\u048d"+
		"\nT\3U\5U\u0490\nU\3U\3U\5U\u0494\nU\3U\3U\3V\5V\u0499\nV\3V\3V\5V\u049d"+
		"\nV\3V\3V\3W\3W\3W\3X\5X\u04a5\nX\3X\5X\u04a8\nX\3X\3X\3X\3Y\3Y\3Z\3Z"+
		"\3Z\3[\3[\3[\5[\u04b5\n[\3[\3[\3[\3[\3[\3[\5[\u04bd\n[\3[\3[\5[\u04c1"+
		"\n[\3\\\5\\\u04c4\n\\\3\\\5\\\u04c7\n\\\3\\\3\\\3]\3]\5]\u04cd\n]\3^\3"+
		"^\5^\u04d1\n^\3^\5^\u04d4\n^\3_\3_\5_\u04d8\n_\3_\3_\3`\3`\3a\3a\3a\3"+
		"a\3a\5a\u04e3\na\3a\3a\5a\u04e7\na\3b\3b\3b\7b\u04ec\nb\fb\16b\u04ef\13"+
		"b\3c\5c\u04f2\nc\3c\5c\u04f5\nc\3c\5c\u04f8\nc\3c\5c\u04fb\nc\3c\5c\u04fe"+
		"\nc\3c\3c\5c\u0502\nc\3c\5c\u0505\nc\3c\5c\u0508\nc\3c\3c\5c\u050c\nc"+
		"\3c\5c\u050f\nc\3c\3c\5c\u0513\nc\3c\5c\u0516\nc\3c\5c\u0519\nc\3c\3c"+
		"\5c\u051d\nc\3c\3c\3c\3c\5c\u0523\nc\3d\3d\3d\5d\u0528\nd\3e\3e\5e\u052c"+
		"\ne\3f\3f\3f\3g\5g\u0532\ng\3g\5g\u0535\ng\3g\3g\3h\3h\5h\u053b\nh\3i"+
		"\5i\u053e\ni\3i\3i\3i\5i\u0543\ni\3i\5i\u0546\ni\3i\3i\5i\u054a\ni\3i"+
		"\3i\3j\6j\u054f\nj\rj\16j\u0550\3k\3k\3k\5k\u0556\nk\5k\u0558\nk\3l\5"+
		"l\u055b\nl\3l\5l\u055e\nl\3l\3l\3l\3m\3m\3m\7m\u0566\nm\fm\16m\u0569\13"+
		"m\3n\3n\5n\u056d\nn\3o\3o\3p\3p\3q\3q\3q\5q\u0576\nq\3q\5q\u0579\nq\3"+
		"q\3q\5q\u057d\nq\3q\3q\3r\6r\u0582\nr\rr\16r\u0583\3s\3s\5s\u0588\ns\3"+
		"t\5t\u058b\nt\3t\3t\3t\3u\3u\3u\7u\u0593\nu\fu\16u\u0596\13u\3v\3v\5v"+
		"\u059a\nv\3w\3w\3w\3x\5x\u05a0\nx\3x\5x\u05a3\nx\3x\3x\3x\5x\u05a8\nx"+
		"\3x\5x\u05ab\nx\3x\3x\3y\3y\3z\3z\5z\u05b3\nz\3z\3z\3{\5{\u05b8\n{\3{"+
		"\5{\u05bb\n{\3{\3{\3{\5{\u05c0\n{\3{\5{\u05c3\n{\3{\3{\3|\3|\5|\u05c9"+
		"\n|\3|\3|\5|\u05cd\n|\5|\u05cf\n|\3}\3}\3~\3~\5~\u05d5\n~\3~\3~\3\177"+
		"\5\177\u05da\n\177\3\177\5\177\u05dd\n\177\3\177\3\177\3\177\5\177\u05e2"+
		"\n\177\3\177\3\177\3\u0080\3\u0080\3\u0081\3\u0081\5\u0081\u05ea\n\u0081"+
		"\3\u0081\3\u0081\3\u0082\3\u0082\5\u0082\u05f0\n\u0082\3\u0082\3\u0082"+
		"\5\u0082\u05f4\n\u0082\3\u0082\3\u0082\5\u0082\u05f8\n\u0082\3\u0082\3"+
		"\u0082\5\u0082\u05fc\n\u0082\3\u0082\3\u0082\5\u0082\u0600\n\u0082\5\u0082"+
		"\u0602\n\u0082\3\u0083\6\u0083\u0605\n\u0083\r\u0083\16\u0083\u0606\3"+
		"\u0084\3\u0084\3\u0084\3\u0084\3\u0084\3\u0085\3\u0085\3\u0085\5\u0085"+
		"\u0611\n\u0085\3\u0085\3\u0085\3\u0086\3\u0086\5\u0086\u0617\n\u0086\3"+
		"\u0086\3\u0086\5\u0086\u061b\n\u0086\3\u0087\3\u0087\3\u0087\3\u0087\3"+
		"\u0088\5\u0088\u0622\n\u0088\3\u0088\5\u0088\u0625\n\u0088\3\u0088\3\u0088"+
		"\3\u0088\5\u0088\u062a\n\u0088\3\u0088\5\u0088\u062d\n\u0088\3\u0089\3"+
		"\u0089\5\u0089\u0631\n\u0089\3\u0089\3\u0089\5\u0089\u0635\n\u0089\3\u0089"+
		"\3\u0089\3\u008a\5\u008a\u063a\n\u008a\3\u008a\5\u008a\u063d\n\u008a\3"+
		"\u008a\3\u008a\5\u008a\u0641\n\u008a\3\u008b\3\u008b\3\u008c\5\u008c\u0646"+
		"\n\u008c\3\u008c\3\u008c\3\u008c\3\u008d\5\u008d\u064c\n\u008d\3\u008d"+
		"\5\u008d\u064f\n\u008d\3\u008d\3\u008d\3\u008d\3\u008d\5\u008d\u0655\n"+
		"\u008d\3\u008d\3\u008d\3\u008e\3\u008e\5\u008e\u065b\n\u008e\3\u008e\3"+
		"\u008e\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f\3\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u066b\n\u008f\3\u0090\5\u0090"+
		"\u066e\n\u0090\3\u0090\5\u0090\u0671\n\u0090\3\u0090\3\u0090\3\u0090\3"+
		"\u0091\3\u0091\5\u0091\u0678\n\u0091\3\u0091\3\u0091\3\u0092\3\u0092\3"+
		"\u0092\5\u0092\u067f\n\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3"+
		"\u0093\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0094\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\3\u0095\5\u0095\u0692\n\u0095\3\u0095\3\u0095\3\u0096"+
		"\3\u0096\5\u0096\u0698\n\u0096\3\u0096\3\u0096\5\u0096\u069c\n\u0096\5"+
		"\u0096\u069e\n\u0096\3\u0097\3\u0097\3\u0097\3\u0098\3\u0098\3\u0099\3"+
		"\u0099\3\u0099\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b\5\u009b\u06ad\n"+
		"\u009b\3\u009b\3\u009b\5\u009b\u06b1\n\u009b\3\u009b\3\u009b\3\u009b\5"+
		"\u009b\u06b6\n\u009b\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b\u06bc\n\u009b"+
		"\3\u009b\3\u009b\3\u009b\7\u009b\u06c1\n\u009b\f\u009b\16\u009b\u06c4"+
		"\13\u009b\3\u009c\3\u009c\3\u009d\3\u009d\3\u009e\3\u009e\3\u009e\3\u009e"+
		"\5\u009e\u06ce\n\u009e\3\u009f\3\u009f\5\u009f\u06d2\n\u009f\3\u009f\3"+
		"\u009f\3\u00a0\3\u00a0\3\u00a0\7\u00a0\u06d9\n\u00a0\f\u00a0\16\u00a0"+
		"\u06dc\13\u00a0\3\u00a1\3\u00a1\3\u00a1\3\u00a1\3\u00a1\5\u00a1\u06e3"+
		"\n\u00a1\3\u00a2\5\u00a2\u06e6\n\u00a2\3\u00a2\5\u00a2\u06e9\n\u00a2\3"+
		"\u00a2\3\u00a2\5\u00a2\u06ed\n\u00a2\3\u00a3\3\u00a3\5\u00a3\u06f1\n\u00a3"+
		"\3\u00a4\3\u00a4\3\u00a4\3\u00a5\3\u00a5\3\u00a5\3\u00a5\3\u00a6\3\u00a6"+
		"\3\u00a7\3\u00a7\3\u00a7\5\u00a7\u06ff\n\u00a7\3\u00a8\3\u00a8\3\u00a9"+
		"\3\u00a9\5\u00a9\u0705\n\u00a9\3\u00a9\3\u00a9\3\u00aa\6\u00aa\u070a\n"+
		"\u00aa\r\u00aa\16\u00aa\u070b\3\u00ab\6\u00ab\u070f\n\u00ab\r\u00ab\16"+
		"\u00ab\u0710\3\u00ac\3\u00ac\5\u00ac\u0715\n\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\5\u00ac\u071a\n\u00ac\3\u00ac\3\u00ac\3\u00ac\5\u00ac\u071f\n\u00ac\3"+
		"\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac\3\u00ac"+
		"\3\u00ac\5\u00ac\u0734\n\u00ac\3\u00ad\5\u00ad\u0737\n\u00ad\3\u00ad\3"+
		"\u00ad\7\u00ad\u073b\n\u00ad\f\u00ad\16\u00ad\u073e\13\u00ad\3\u00ae\5"+
		"\u00ae\u0741\n\u00ae\3\u00ae\3\u00ae\5\u00ae\u0745\n\u00ae\3\u00ae\5\u00ae"+
		"\u0748\n\u00ae\3\u00af\3\u00af\3\u00af\3\u00b0\3\u00b0\5\u00b0\u074f\n"+
		"\u00b0\3\u00b1\3\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u0756\n\u00b1\3"+
		"\u00b1\3\u00b1\3\u00b1\3\u00b1\5\u00b1\u075c\n\u00b1\3\u00b1\3\u00b1\3"+
		"\u00b1\5\u00b1\u0761\n\u00b1\3\u00b2\3\u00b2\3\u00b3\3\u00b3\5\u00b3\u0767"+
		"\n\u00b3\3\u00b3\3\u00b3\3\u00b3\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0776\n\u00b4\3\u00b5"+
		"\3\u00b5\5\u00b5\u077a\n\u00b5\3\u00b5\5\u00b5\u077d\n\u00b5\3\u00b5\3"+
		"\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\3\u00b5\5\u00b5\u0787\n"+
		"\u00b5\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\3\u00b6\5\u00b6"+
		"\u0790\n\u00b6\3\u00b7\3\u00b7\5\u00b7\u0794\n\u00b7\3\u00b7\3\u00b7\3"+
		"\u00b8\3\u00b8\3\u00b8\7\u00b8\u079b\n\u00b8\f\u00b8\16\u00b8\u079e\13"+
		"\u00b8\3\u00b8\5\u00b8\u07a1\n\u00b8\3\u00b9\3\u00b9\3\u00ba\3\u00ba\3"+
		"\u00ba\3\u00ba\3\u00ba\3\u00ba\3\u00ba\5\u00ba\u07ac\n\u00ba\3\u00bb\3"+
		"\u00bb\3\u00bb\7\u00bb\u07b1\n\u00bb\f\u00bb\16\u00bb\u07b4\13\u00bb\3"+
		"\u00bb\5\u00bb\u07b7\n\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bd\3"+
		"\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\3\u00bd\3\u00bd\5\u00bd\u07c9\n\u00bd\3\u00be\3\u00be\3\u00be\5\u00be"+
		"\u07ce\n\u00be\3\u00bf\3\u00bf\3\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c0"+
		"\3\u00c0\3\u00c0\3\u00c1\3\u00c1\3\u00c1\3\u00c1\3\u00c2\3\u00c2\5\u00c2"+
		"\u07df\n\u00c2\3\u00c2\5\u00c2\u07e2\n\u00c2\3\u00c2\3\u00c2\3\u00c3\3"+
		"\u00c3\5\u00c3\u07e8\n\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u07ee"+
		"\n\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u07f5\n\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u07fc\n\u00c3\3\u00c3"+
		"\3\u00c3\3\u00c3\3\u00c3\3\u00c3\5\u00c3\u0803\n\u00c3\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c4\3\u00c5\3\u00c5\3\u00c5\7\u00c5\u080c\n\u00c5\f\u00c5"+
		"\16\u00c5\u080f\13\u00c5\3\u00c6\5\u00c6\u0812\n\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c7\3\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c9\3\u00c9\5\u00c9\u081d"+
		"\n\u00c9\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca\7\u00ca\u0824\n\u00ca"+
		"\f\u00ca\16\u00ca\u0827\13\u00ca\3\u00cb\3\u00cb\3\u00cb\3\u00cb\3\u00cb"+
		"\5\u00cb\u082e\n\u00cb\3\u00cc\3\u00cc\5\u00cc\u0832\n\u00cc\3\u00cd\3"+
		"\u00cd\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00ce\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf"+
		"\u0846\n\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u085c\n\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf"+
		"\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\7\u00cf\u0870"+
		"\n\u00cf\f\u00cf\16\u00cf\u0873\13\u00cf\3\u00d0\6\u00d0\u0876\n\u00d0"+
		"\r\u00d0\16\u00d0\u0877\3\u00d1\3\u00d1\5\u00d1\u087c\n\u00d1\3\u00d1"+
		"\3\u00d1\3\u00d2\3\u00d2\3\u00d3\3\u00d3\5\u00d3\u0884\n\u00d3\3\u00d4"+
		"\3\u00d4\7\u00d4\u0888\n\u00d4\f\u00d4\16\u00d4\u088b\13\u00d4\3\u00d4"+
		"\3\u00d4\7\u00d4\u088f\n\u00d4\f\u00d4\16\u00d4\u0892\13\u00d4\3\u00d4"+
		"\5\u00d4\u0895\n\u00d4\3\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d7\3\u00d7"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\5\u00d8\u08a3\n\u00d8"+
		"\3\u00d8\3\u00d8\5\u00d8\u08a7\n\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8\3\u00d8"+
		"\3\u00d8\3\u00d8\3\u00d8\7\u00d8\u08b9\n\u00d8\f\u00d8\16\u00d8\u08bc"+
		"\13\u00d8\3\u00d9\3\u00d9\3\u00d9\3\u00d9\3\u00da\3\u00da\3\u00da\3\u00da"+
		"\3\u00da\3\u00da\3\u00db\3\u00db\3\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dd"+
		"\3\u00dd\5\u00dd\u08d0\n\u00dd\3\u00dd\3\u00dd\3\u00de\3\u00de\5\u00de"+
		"\u08d6\n\u00de\3\u00de\3\u00de\5\u00de\u08da\n\u00de\3\u00de\3\u00de\3"+
		"\u00de\3\u00de\5\u00de\u08e0\n\u00de\3\u00df\3\u00df\3\u00e0\3\u00e0\5"+
		"\u00e0\u08e6\n\u00e0\3\u00e0\3\u00e0\3\u00e1\3\u00e1\5\u00e1\u08ec\n\u00e1"+
		"\3\u00e2\3\u00e2\3\u00e2\7\u00e2\u08f1\n\u00e2\f\u00e2\16\u00e2\u08f4"+
		"\13\u00e2\3\u00e3\5\u00e3\u08f7\n\u00e3\3\u00e3\5\u00e3\u08fa\n\u00e3"+
		"\3\u00e3\3\u00e3\5\u00e3\u08fe\n\u00e3\3\u00e3\3\u00e3\3\u00e3\5\u00e3"+
		"\u0903\n\u00e3\3\u00e4\3\u00e4\3\u00e5\3\u00e5\3\u00e5\5\u00e5\u090a\n"+
		"\u00e5\3\u00e5\3\u00e5\3\u00e6\3\u00e6\3\u00e6\7\u00e6\u0911\n\u00e6\f"+
		"\u00e6\16\u00e6\u0914\13\u00e6\3\u00e7\3\u00e7\3\u00e8\3\u00e8\3\u00e8"+
		"\3\u00e8\3\u00e8\3\u00e8\3\u00e8\3\u00e8\5\u00e8\u0920\n\u00e8\3\u00e9"+
		"\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\3\u00e9\5\u00e9"+
		"\u092b\n\u00e9\3\u00ea\3\u00ea\3\u00ea\7\u00ea\u0930\n\u00ea\f\u00ea\16"+
		"\u00ea\u0933\13\u00ea\3\u00eb\3\u00eb\3\u00ec\3\u00ec\5\u00ec\u0939\n"+
		"\u00ec\3\u00ed\3\u00ed\3\u00ed\5\u00ed\u093e\n\u00ed\3\u00ed\5\u00ed\u0941"+
		"\n\u00ed\3\u00ed\5\u00ed\u0944\n\u00ed\3\u00ed\3\u00ed\3\u00ee\6\u00ee"+
		"\u0949\n\u00ee\r\u00ee\16\u00ee\u094a\3\u00ef\3\u00ef\3\u00ef\5\u00ef"+
		"\u0950\n\u00ef\3\u00f0\3\u00f0\5\u00f0\u0954\n\u00f0\3\u00f1\3\u00f1\3"+
		"\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1"+
		"\5\u00f1\u0961\n\u00f1\3\u00f1\3\u00f1\3\u00f1\7\u00f1\u0966\n\u00f1\f"+
		"\u00f1\16\u00f1\u0969\13\u00f1\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2"+
		"\3\u00f2\3\u00f2\3\u00f2\3\u00f2\3\u00f2\5\u00f2\u0975\n\u00f2\3\u00f3"+
		"\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f3\3\u00f4\3\u00f4\3\u00f5\3\u00f5"+
		"\3\u00f6\3\u00f6\3\u00f7\3\u00f7\3\u00f7\3\u00f7\5\u00f7\u0987\n\u00f7"+
		"\3\u00f8\3\u00f8\3\u00f9\3\u00f9\3\u00fa\3\u00fa\5\u00fa\u098f\n\u00fa"+
		"\3\u00fb\3\u00fb\3\u00fc\3\u00fc\3\u00fd\3\u00fd\5\u00fd\u0997\n\u00fd"+
		"\3\u00fd\3\u00fd\3\u00fd\5\u00fd\u099c\n\u00fd\7\u00fd\u099e\n\u00fd\f"+
		"\u00fd\16\u00fd\u09a1\13\u00fd\3\u00fe\3\u00fe\3\u00ff\3\u00ff\3\u00ff"+
		"\3\u00ff\5\u00ff\u09a9\n\u00ff\3\u0100\5\u0100\u09ac\n\u0100\3\u0100\3"+
		"\u0100\5\u0100\u09b0\n\u0100\3\u0100\5\u0100\u09b3\n\u0100\3\u0101\3\u0101"+
		"\3\u0101\2\6\u0134\u019c\u01ae\u01e0\u0102\2\4\6\b\n\f\16\20\22\24\26"+
		"\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|"+
		"~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096"+
		"\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae"+
		"\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6"+
		"\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de"+
		"\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6"+
		"\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e"+
		"\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126"+
		"\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e"+
		"\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156"+
		"\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c\u016e"+
		"\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184\u0186"+
		"\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c\u019e"+
		"\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4\u01b6"+
		"\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc\u01ce"+
		"\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4\u01e6"+
		"\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8\u01fa\u01fc\u01fe"+
		"\u0200\2\20\3\2!(\4\2\u0094\u0094\u0096\u0097\5\2\32\33,,CG\3\2MN\3\2"+
		"WX\3\2_a\5\2::==st\13\2  )+IIWXggiikkw{\u008d\u008d\3\2yz\6\2!!##%%\'"+
		"\'\3\2\u0086\u0089\22\2\5\r\21\31\34\35,,99>>@GMNSSUVY[bclruv~\u0082\u008b"+
		"\u008c\17\2!#%%\'\'-8:;==??JLTT\\a|}\u0083\u0084\u0086\u008a\3\2\u0092"+
		"\u0095\u0a76\2\u0203\3\2\2\2\4\u0228\3\2\2\2\6\u022b\3\2\2\2\b\u0232\3"+
		"\2\2\2\n\u0234\3\2\2\2\f\u0240\3\2\2\2\16\u0244\3\2\2\2\20\u024c\3\2\2"+
		"\2\22\u024e\3\2\2\2\24\u0258\3\2\2\2\26\u025a\3\2\2\2\30\u025f\3\2\2\2"+
		"\32\u0268\3\2\2\2\34\u0278\3\2\2\2\36\u027a\3\2\2\2 \u027e\3\2\2\2\"\u0286"+
		"\3\2\2\2$\u028a\3\2\2\2&\u0293\3\2\2\2(\u0295\3\2\2\2*\u0298\3\2\2\2,"+
		"\u029f\3\2\2\2.\u02a1\3\2\2\2\60\u02a5\3\2\2\2\62\u02a9\3\2\2\2\64\u02ab"+
		"\3\2\2\2\66\u02af\3\2\2\28\u02b2\3\2\2\2:\u02b5\3\2\2\2<\u02ba\3\2\2\2"+
		">\u02be\3\2\2\2@\u02d1\3\2\2\2B\u02d3\3\2\2\2D\u02de\3\2\2\2F\u02e0\3"+
		"\2\2\2H\u02e6\3\2\2\2J\u02f6\3\2\2\2L\u02f8\3\2\2\2N\u0304\3\2\2\2P\u0306"+
		"\3\2\2\2R\u0309\3\2\2\2T\u030b\3\2\2\2V\u0310\3\2\2\2X\u031c\3\2\2\2Z"+
		"\u031e\3\2\2\2\\\u0320\3\2\2\2^\u0322\3\2\2\2`\u0329\3\2\2\2b\u033a\3"+
		"\2\2\2d\u033c\3\2\2\2f\u033f\3\2\2\2h\u0349\3\2\2\2j\u0353\3\2\2\2l\u0355"+
		"\3\2\2\2n\u0359\3\2\2\2p\u035d\3\2\2\2r\u0365\3\2\2\2t\u03a3\3\2\2\2v"+
		"\u03a6\3\2\2\2x\u03ab\3\2\2\2z\u03c8\3\2\2\2|\u03d9\3\2\2\2~\u03dc\3\2"+
		"\2\2\u0080\u03e0\3\2\2\2\u0082\u03e7\3\2\2\2\u0084\u03ef\3\2\2\2\u0086"+
		"\u03f6\3\2\2\2\u0088\u03fa\3\2\2\2\u008a\u03fd\3\2\2\2\u008c\u0405\3\2"+
		"\2\2\u008e\u040d\3\2\2\2\u0090\u0411\3\2\2\2\u0092\u0433\3\2\2\2\u0094"+
		"\u0436\3\2\2\2\u0096\u043d\3\2\2\2\u0098\u044b\3\2\2\2\u009a\u044e\3\2"+
		"\2\2\u009c\u0457\3\2\2\2\u009e\u0462\3\2\2\2\u00a0\u0472\3\2\2\2\u00a2"+
		"\u0475\3\2\2\2\u00a4\u047a\3\2\2\2\u00a6\u048c\3\2\2\2\u00a8\u048f\3\2"+
		"\2\2\u00aa\u0498\3\2\2\2\u00ac\u04a0\3\2\2\2\u00ae\u04a4\3\2\2\2\u00b0"+
		"\u04ac\3\2\2\2\u00b2\u04ae\3\2\2\2\u00b4\u04c0\3\2\2\2\u00b6\u04c3\3\2"+
		"\2\2\u00b8\u04cc\3\2\2\2\u00ba\u04ce\3\2\2\2\u00bc\u04d5\3\2\2\2\u00be"+
		"\u04db\3\2\2\2\u00c0\u04e6\3\2\2\2\u00c2\u04e8\3\2\2\2\u00c4\u0522\3\2"+
		"\2\2\u00c6\u0527\3\2\2\2\u00c8\u052b\3\2\2\2\u00ca\u052d\3\2\2\2\u00cc"+
		"\u0531\3\2\2\2\u00ce\u053a\3\2\2\2\u00d0\u053d\3\2\2\2\u00d2\u054e\3\2"+
		"\2\2\u00d4\u0557\3\2\2\2\u00d6\u055a\3\2\2\2\u00d8\u0562\3\2\2\2\u00da"+
		"\u056a\3\2\2\2\u00dc\u056e\3\2\2\2\u00de\u0570\3\2\2\2\u00e0\u0572\3\2"+
		"\2\2\u00e2\u0581\3\2\2\2\u00e4\u0587\3\2\2\2\u00e6\u058a\3\2\2\2\u00e8"+
		"\u058f\3\2\2\2\u00ea\u0597\3\2\2\2\u00ec\u059b\3\2\2\2\u00ee\u059f\3\2"+
		"\2\2\u00f0\u05ae\3\2\2\2\u00f2\u05b0\3\2\2\2\u00f4\u05b7\3\2\2\2\u00f6"+
		"\u05ce\3\2\2\2\u00f8\u05d0\3\2\2\2\u00fa\u05d2\3\2\2\2\u00fc\u05d9\3\2"+
		"\2\2\u00fe\u05e5\3\2\2\2\u0100\u05e7\3\2\2\2\u0102\u0601\3\2\2\2\u0104"+
		"\u0604\3\2\2\2\u0106\u0608\3\2\2\2\u0108\u060d\3\2\2\2\u010a\u0614\3\2"+
		"\2\2\u010c\u061c\3\2\2\2\u010e\u0621\3\2\2\2\u0110\u062e\3\2\2\2\u0112"+
		"\u0639\3\2\2\2\u0114\u0642\3\2\2\2\u0116\u0645\3\2\2\2\u0118\u064b\3\2"+
		"\2\2\u011a\u0658\3\2\2\2\u011c\u066a\3\2\2\2\u011e\u066d\3\2\2\2\u0120"+
		"\u0675\3\2\2\2\u0122\u067e\3\2\2\2\u0124\u0680\3\2\2\2\u0126\u0686\3\2"+
		"\2\2\u0128\u068c\3\2\2\2\u012a\u069d\3\2\2\2\u012c\u069f\3\2\2\2\u012e"+
		"\u06a2\3\2\2\2\u0130\u06a4\3\2\2\2\u0132\u06a7\3\2\2\2\u0134\u06bb\3\2"+
		"\2\2\u0136\u06c5\3\2\2\2\u0138\u06c7\3\2\2\2\u013a\u06cd\3\2\2\2\u013c"+
		"\u06cf\3\2\2\2\u013e\u06d5\3\2\2\2\u0140\u06e2\3\2\2\2\u0142\u06e5\3\2"+
		"\2\2\u0144\u06f0\3\2\2\2\u0146\u06f2\3\2\2\2\u0148\u06f5\3\2\2\2\u014a"+
		"\u06f9\3\2\2\2\u014c\u06fb\3\2\2\2\u014e\u0700\3\2\2\2\u0150\u0702\3\2"+
		"\2\2\u0152\u0709\3\2\2\2\u0154\u070e\3\2\2\2\u0156\u0733\3\2\2\2\u0158"+
		"\u0736\3\2\2\2\u015a\u0747\3\2\2\2\u015c\u0749\3\2\2\2\u015e\u074c\3\2"+
		"\2\2\u0160\u0760\3\2\2\2\u0162\u0762\3\2\2\2\u0164\u0764\3\2\2\2\u0166"+
		"\u0775\3\2\2\2\u0168\u0786\3\2\2\2\u016a\u078f\3\2\2\2\u016c\u0791\3\2"+
		"\2\2\u016e\u0797\3\2\2\2\u0170\u07a2\3\2\2\2\u0172\u07ab\3\2\2\2\u0174"+
		"\u07ad\3\2\2\2\u0176\u07b8\3\2\2\2\u0178\u07c8\3\2\2\2\u017a\u07cd\3\2"+
		"\2\2\u017c\u07cf\3\2\2\2\u017e\u07d3\3\2\2\2\u0180\u07d8\3\2\2\2\u0182"+
		"\u07dc\3\2\2\2\u0184\u0802\3\2\2\2\u0186\u0804\3\2\2\2\u0188\u0808\3\2"+
		"\2\2\u018a\u0811\3\2\2\2\u018c\u0815\3\2\2\2\u018e\u0817\3\2\2\2\u0190"+
		"\u081a\3\2\2\2\u0192\u0820\3\2\2\2\u0194\u082d\3\2\2\2\u0196\u0831\3\2"+
		"\2\2\u0198\u0833\3\2\2\2\u019a\u0835\3\2\2\2\u019c\u083a\3\2\2\2\u019e"+
		"\u0875\3\2\2\2\u01a0\u087b\3\2\2\2\u01a2\u087f\3\2\2\2\u01a4\u0883\3\2"+
		"\2\2\u01a6\u0894\3\2\2\2\u01a8\u0896\3\2\2\2\u01aa\u0898\3\2\2\2\u01ac"+
		"\u089a\3\2\2\2\u01ae\u08a2\3\2\2\2\u01b0\u08bd\3\2\2\2\u01b2\u08c1\3\2"+
		"\2\2\u01b4\u08c7\3\2\2\2\u01b6\u08ca\3\2\2\2\u01b8\u08cd\3\2\2\2\u01ba"+
		"\u08df\3\2\2\2\u01bc\u08e1\3\2\2\2\u01be\u08e3\3\2\2\2\u01c0\u08e9\3\2"+
		"\2\2\u01c2\u08ed\3\2\2\2\u01c4\u0902\3\2\2\2\u01c6\u0904\3\2\2\2\u01c8"+
		"\u0906\3\2\2\2\u01ca\u090d\3\2\2\2\u01cc\u0915\3\2\2\2\u01ce\u091f\3\2"+
		"\2\2\u01d0\u092a\3\2\2\2\u01d2\u092c\3\2\2\2\u01d4\u0934\3\2\2\2\u01d6"+
		"\u0938\3\2\2\2\u01d8\u093a\3\2\2\2\u01da\u0948\3\2\2\2\u01dc\u094c\3\2"+
		"\2\2\u01de\u0951\3\2\2\2\u01e0\u0960\3\2\2\2\u01e2\u0974\3\2\2\2\u01e4"+
		"\u0976\3\2\2\2\u01e6\u097c\3\2\2\2\u01e8\u097e\3\2\2\2\u01ea\u0980\3\2"+
		"\2\2\u01ec\u0982\3\2\2\2\u01ee\u0988\3\2\2\2\u01f0\u098a\3\2\2\2\u01f2"+
		"\u098e\3\2\2\2\u01f4\u0990\3\2\2\2\u01f6\u0992\3\2\2\2\u01f8\u0996\3\2"+
		"\2\2\u01fa\u09a2\3\2\2\2\u01fc\u09a8\3\2\2\2\u01fe\u09b2\3\2\2\2\u0200"+
		"\u09b4\3\2\2\2\u0202\u0204\5\6\4\2\u0203\u0202\3\2\2\2\u0203\u0204\3\2"+
		"\2\2\u0204\u0205\3\2\2\2\u0205\u0206\7\2\2\3\u0206\3\3\2\2\2\u0207\u0209"+
		"\5t;\2\u0208\u020a\7\3\2\2\u0209\u0208\3\2\2\2\u0209\u020a\3\2\2\2\u020a"+
		"\u0229\3\2\2\2\u020b\u020d\5\b\5\2\u020c\u020e\7\3\2\2\u020d\u020c\3\2"+
		"\2\2\u020d\u020e\3\2\2\2\u020e\u0229\3\2\2\2\u020f\u0211\5\20\t\2\u0210"+
		"\u0212\7\3\2\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0229\3\2"+
		"\2\2\u0213\u0229\5&\24\2\u0214\u0216\5,\27\2\u0215\u0217\7\3\2\2\u0216"+
		"\u0215\3\2\2\2\u0216\u0217\3\2\2\2\u0217\u0229\3\2\2\2\u0218\u021a\58"+
		"\35\2\u0219\u021b\7\3\2\2\u021a\u0219\3\2\2\2\u021a\u021b\3\2\2\2\u021b"+
		"\u0229\3\2\2\2\u021c\u021e\5:\36\2\u021d\u021f\7\4\2\2\u021e\u021d\3\2"+
		"\2\2\u021e\u021f\3\2\2\2\u021f\u0229\3\2\2\2\u0220\u0222\5\u01d6\u00ec"+
		"\2\u0221\u0223\7\3\2\2\u0222\u0221\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0229"+
		"\3\2\2\2\u0224\u0226\5\u0158\u00ad\2\u0225\u0227\7\3\2\2\u0226\u0225\3"+
		"\2\2\2\u0226\u0227\3\2\2\2\u0227\u0229\3\2\2\2\u0228\u0207\3\2\2\2\u0228"+
		"\u020b\3\2\2\2\u0228\u020f\3\2\2\2\u0228\u0213\3\2\2\2\u0228\u0214\3\2"+
		"\2\2\u0228\u0218\3\2\2\2\u0228\u021c\3\2\2\2\u0228\u0220\3\2\2\2\u0228"+
		"\u0224\3\2\2\2\u0229\5\3\2\2\2\u022a\u022c\5\4\3\2\u022b\u022a\3\2\2\2"+
		"\u022c\u022d\3\2\2\2\u022d\u022b\3\2\2\2\u022d\u022e\3\2\2\2\u022e\7\3"+
		"\2\2\2\u022f\u0233\5\n\6\2\u0230\u0233\5\f\7\2\u0231\u0233\5\16\b\2\u0232"+
		"\u022f\3\2\2\2\u0232\u0230\3\2\2\2\u0232\u0231\3\2\2\2\u0233\t\3\2\2\2"+
		"\u0234\u0236\7\5\2\2\u0235\u0237\7\6\2\2\u0236\u0235\3\2\2\2\u0236\u0237"+
		"\3\2\2\2\u0237\u0238\3\2\2\2\u0238\u0239\5\u0134\u009b\2\u0239\u023a\7"+
		"\7\2\2\u023a\u023c\5\u0158\u00ad\2\u023b\u023d\5P)\2\u023c\u023b\3\2\2"+
		"\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u023f\5\u0080A\2\u023f"+
		"\13\3\2\2\2\u0240\u0241\7\b\2\2\u0241\u0242\5@!\2\u0242\u0243\5\u0080"+
		"A\2\u0243\r\3\2\2\2\u0244\u0245\7\t\2\2\u0245\u0246\5\u0080A\2\u0246\u0247"+
		"\7\b\2\2\u0247\u0248\5@!\2\u0248\17\3\2\2\2\u0249\u024d\5\22\n\2\u024a"+
		"\u024d\5\26\f\2\u024b\u024d\5\30\r\2\u024c\u0249\3\2\2\2\u024c\u024a\3"+
		"\2\2\2\u024c\u024b\3\2\2\2\u024d\21\3\2\2\2\u024e\u024f\7\n\2\2\u024f"+
		"\u0250\5@!\2\u0250\u0252\5\u0080A\2\u0251\u0253\5\24\13\2\u0252\u0251"+
		"\3\2\2\2\u0252\u0253\3\2\2\2\u0253\23\3\2\2\2\u0254\u0255\7\13\2\2\u0255"+
		"\u0259\5\u0080A\2\u0256\u0257\7\13\2\2\u0257\u0259\5\22\n\2\u0258\u0254"+
		"\3\2\2\2\u0258\u0256\3\2\2\2\u0259\25\3\2\2\2\u025a\u025b\7\f\2\2\u025b"+
		"\u025c\5@!\2\u025c\u025d\7\13\2\2\u025d\u025e\5\u0080A\2\u025e\27\3\2"+
		"\2\2\u025f\u0260\7\r\2\2\u0260\u0261\5\u0158\u00ad\2\u0261\u0263\7\16"+
		"\2\2\u0262\u0264\5\32\16\2\u0263\u0262\3\2\2\2\u0263\u0264\3\2\2\2\u0264"+
		"\u0265\3\2\2\2\u0265\u0266\7\17\2\2\u0266\31\3\2\2\2\u0267\u0269\5\34"+
		"\17\2\u0268\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u0268\3\2\2\2\u026a"+
		"\u026b\3\2\2\2\u026b\33\3\2\2\2\u026c\u026d\5\36\20\2\u026d\u026e\5\6"+
		"\4\2\u026e\u0279\3\2\2\2\u026f\u0270\5$\23\2\u0270\u0271\5\6\4\2\u0271"+
		"\u0279\3\2\2\2\u0272\u0273\5\36\20\2\u0273\u0274\7\3\2\2\u0274\u0279\3"+
		"\2\2\2\u0275\u0276\5$\23\2\u0276\u0277\7\3\2\2\u0277\u0279\3\2\2\2\u0278"+
		"\u026c\3\2\2\2\u0278\u026f\3\2\2\2\u0278\u0272\3\2\2\2\u0278\u0275\3\2"+
		"\2\2\u0279\35\3\2\2\2\u027a\u027b\7\6\2\2\u027b\u027c\5 \21\2\u027c\u027d"+
		"\7\4\2\2\u027d\37\3\2\2\2\u027e\u0283\5\"\22\2\u027f\u0280\7\20\2\2\u0280"+
		"\u0282\5\"\22\2\u0281\u027f\3\2\2\2\u0282\u0285\3\2\2\2\u0283\u0281\3"+
		"\2\2\2\u0283\u0284\3\2\2\2\u0284!\3\2\2\2\u0285\u0283\3\2\2\2\u0286\u0288"+
		"\5\u0134\u009b\2\u0287\u0289\5P)\2\u0288\u0287\3\2\2\2\u0288\u0289\3\2"+
		"\2\2\u0289#\3\2\2\2\u028a\u028b\7\21\2\2\u028b\u028c\7\4\2\2\u028c%\3"+
		"\2\2\2\u028d\u028e\5(\25\2\u028e\u028f\5\b\5\2\u028f\u0294\3\2\2\2\u0290"+
		"\u0291\5(\25\2\u0291\u0292\5\30\r\2\u0292\u0294\3\2\2\2\u0293\u028d\3"+
		"\2\2\2\u0293\u0290\3\2\2\2\u0294\'\3\2\2\2\u0295\u0296\5*\26\2\u0296\u0297"+
		"\7\4\2\2\u0297)\3\2\2\2\u0298\u0299\5\u01f2\u00fa\2\u0299+\3\2\2\2\u029a"+
		"\u02a0\5.\30\2\u029b\u02a0\5\60\31\2\u029c\u02a0\5\62\32\2\u029d\u02a0"+
		"\5\64\33\2\u029e\u02a0\5\66\34\2\u029f\u029a\3\2\2\2\u029f\u029b\3\2\2"+
		"\2\u029f\u029c\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u029e\3\2\2\2\u02a0-"+
		"\3\2\2\2\u02a1\u02a3\7\22\2\2\u02a2\u02a4\5*\26\2\u02a3\u02a2\3\2\2\2"+
		"\u02a3\u02a4\3\2\2\2\u02a4/\3\2\2\2\u02a5\u02a7\7\23\2\2\u02a6\u02a8\5"+
		"*\26\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\61\3\2\2\2\u02a9"+
		"\u02aa\7\24\2\2\u02aa\63\3\2\2\2\u02ab\u02ad\7\25\2\2\u02ac\u02ae\5\u0158"+
		"\u00ad\2\u02ad\u02ac\3\2\2\2\u02ad\u02ae\3\2\2\2\u02ae\65\3\2\2\2\u02af"+
		"\u02b0\7\26\2\2\u02b0\u02b1\5\u0158\u00ad\2\u02b1\67\3\2\2\2\u02b2\u02b3"+
		"\7\27\2\2\u02b3\u02b4\5\u0080A\2\u02b49\3\2\2\2\u02b5\u02b6\7\30\2\2\u02b6"+
		"\u02b8\5\u0080A\2\u02b7\u02b9\5<\37\2\u02b8\u02b7\3\2\2\2\u02b8\u02b9"+
		"\3\2\2\2\u02b9;\3\2\2\2\u02ba\u02bc\5> \2\u02bb\u02bd\5<\37\2\u02bc\u02bb"+
		"\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd=\3\2\2\2\u02be\u02c0\7\31\2\2\u02bf"+
		"\u02c1\5\u0134\u009b\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1\u02c3"+
		"\3\2\2\2\u02c2\u02c4\5P)\2\u02c3\u02c2\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4"+
		"\u02c5\3\2\2\2\u02c5\u02c6\5\u0080A\2\u02c6?\3\2\2\2\u02c7\u02d2\5\u0158"+
		"\u00ad\2\u02c8\u02c9\5\u0158\u00ad\2\u02c9\u02ca\7\20\2\2\u02ca\u02cb"+
		"\5B\"\2\u02cb\u02d2\3\2\2\2\u02cc\u02d2\5B\"\2\u02cd\u02ce\5T+\2\u02ce"+
		"\u02cf\7\20\2\2\u02cf\u02d0\5\u0158\u00ad\2\u02d0\u02d2\3\2\2\2\u02d1"+
		"\u02c7\3\2\2\2\u02d1\u02c8\3\2\2\2\u02d1\u02cc\3\2\2\2\u02d1\u02cd\3\2"+
		"\2\2\u02d2A\3\2\2\2\u02d3\u02d8\5D#\2\u02d4\u02d5\7\20\2\2\u02d5\u02d7"+
		"\5D#\2\u02d6\u02d4\3\2\2\2\u02d7\u02da\3\2\2\2\u02d8\u02d6\3\2\2\2\u02d8"+
		"\u02d9\3\2\2\2\u02d9C\3\2\2\2\u02da\u02d8\3\2\2\2\u02db\u02df\5T+\2\u02dc"+
		"\u02df\5F$\2\u02dd\u02df\5H%\2\u02de\u02db\3\2\2\2\u02de\u02dc\3\2\2\2"+
		"\u02de\u02dd\3\2\2\2\u02dfE\3\2\2\2\u02e0\u02e1\7\6\2\2\u02e1\u02e2\5"+
		"\u0134\u009b\2\u02e2\u02e4\5\u0090I\2\u02e3\u02e5\5P)\2\u02e4\u02e3\3"+
		"\2\2\2\u02e4\u02e5\3\2\2\2\u02e5G\3\2\2\2\u02e6\u02e9\5J&\2\u02e7\u02e8"+
		"\7\20\2\2\u02e8\u02ea\5L\'\2\u02e9\u02e7\3\2\2\2\u02e9\u02ea\3\2\2\2\u02ea"+
		"\u02ec\3\2\2\2\u02eb\u02ed\5P)\2\u02ec\u02eb\3\2\2\2\u02ec\u02ed\3\2\2"+
		"\2\u02edI\3\2\2\2\u02ee\u02ef\7\32\2\2\u02ef\u02f0\5\u0134\u009b\2\u02f0"+
		"\u02f1\5\u0090I\2\u02f1\u02f7\3\2\2\2\u02f2\u02f3\7\33\2\2\u02f3\u02f4"+
		"\5\u0134\u009b\2\u02f4\u02f5\5\u0090I\2\u02f5\u02f7\3\2\2\2\u02f6\u02ee"+
		"\3\2\2\2\u02f6\u02f2\3\2\2\2\u02f7K\3\2\2\2\u02f8\u02fd\5N(\2\u02f9\u02fa"+
		"\7\20\2\2\u02fa\u02fc\5N(\2\u02fb\u02f9\3\2\2\2\u02fc\u02ff\3\2\2\2\u02fd"+
		"\u02fb\3\2\2\2\u02fd\u02fe\3\2\2\2\u02feM\3\2\2\2\u02ff\u02fd\3\2\2\2"+
		"\u0300\u0305\5J&\2\u0301\u0302\5\u0134\u009b\2\u0302\u0303\5\u0090I\2"+
		"\u0303\u0305\3\2\2\2\u0304\u0300\3\2\2\2\u0304\u0301\3\2\2\2\u0305O\3"+
		"\2\2\2\u0306\u0307\7\34\2\2\u0307\u0308\5R*\2\u0308Q\3\2\2\2\u0309\u030a"+
		"\5\u0158\u00ad\2\u030aS\3\2\2\2\u030b\u030c\7\35\2\2\u030c\u030d\7\36"+
		"\2\2\u030d\u030e\5V,\2\u030e\u030f\7\37\2\2\u030fU\3\2\2\2\u0310\u0315"+
		"\5X-\2\u0311\u0312\7\20\2\2\u0312\u0314\5V,\2\u0313\u0311\3\2\2\2\u0314"+
		"\u0317\3\2\2\2\u0315\u0313\3\2\2\2\u0315\u0316\3\2\2\2\u0316W\3\2\2\2"+
		"\u0317\u0315\3\2\2\2\u0318\u0319\5Z.\2\u0319\u031a\5\\/\2\u031a\u031d"+
		"\3\2\2\2\u031b\u031d\7 \2\2\u031c\u0318\3\2\2\2\u031c\u031b\3\2\2\2\u031d"+
		"Y\3\2\2\2\u031e\u031f\t\2\2\2\u031f[\3\2\2\2\u0320\u0321\t\3\2\2\u0321"+
		"]\3\2\2\2\u0322\u0323\7)\2\2\u0323\u0325\5`\61\2\u0324\u0326\5d\63\2\u0325"+
		"\u0324\3\2\2\2\u0325\u0326\3\2\2\2\u0326\u0327\3\2\2\2\u0327\u0328\7*"+
		"\2\2\u0328_\3\2\2\2\u0329\u032e\5b\62\2\u032a\u032b\7\20\2\2\u032b\u032d"+
		"\5b\62\2\u032c\u032a\3\2\2\2\u032d\u0330\3\2\2\2\u032e\u032c\3\2\2\2\u032e"+
		"\u032f\3\2\2\2\u032fa\3\2\2\2\u0330\u032e\3\2\2\2\u0331\u033b\5\u01bc"+
		"\u00df\2\u0332\u0333\5\u01bc\u00df\2\u0333\u0334\7\4\2\2\u0334\u0335\5"+
		"\u01ba\u00de\2\u0335\u033b\3\2\2\2\u0336\u0337\5\u01bc\u00df\2\u0337\u0338"+
		"\7\4\2\2\u0338\u0339\5\u01c8\u00e5\2\u0339\u033b\3\2\2\2\u033a\u0331\3"+
		"\2\2\2\u033a\u0332\3\2\2\2\u033a\u0336\3\2\2\2\u033bc\3\2\2\2\u033c\u033d"+
		"\7\34\2\2\u033d\u033e\5f\64\2\u033ee\3\2\2\2\u033f\u0344\5h\65\2\u0340"+
		"\u0341\7\20\2\2\u0341\u0343\5h\65\2\u0342\u0340\3\2\2\2\u0343\u0346\3"+
		"\2\2\2\u0344\u0342\3\2\2\2\u0344\u0345\3\2\2\2\u0345g\3\2\2\2\u0346\u0344"+
		"\3\2\2\2\u0347\u034a\5j\66\2\u0348\u034a\5l\67\2\u0349\u0347\3\2\2\2\u0349"+
		"\u0348\3\2\2\2\u034ai\3\2\2\2\u034b\u034c\5\u01ba\u00de\2\u034c\u034d"+
		"\7\4\2\2\u034d\u034e\5\u01ba\u00de\2\u034e\u0354\3\2\2\2\u034f\u0350\5"+
		"\u01ba\u00de\2\u0350\u0351\7\4\2\2\u0351\u0352\5\u01c8\u00e5\2\u0352\u0354"+
		"\3\2\2\2\u0353\u034b\3\2\2\2\u0353\u034f\3\2\2\2\u0354k\3\2\2\2\u0355"+
		"\u0356\5\u01ba\u00de\2\u0356\u0357\7+\2\2\u0357\u0358\5\u01ae\u00d8\2"+
		"\u0358m\3\2\2\2\u0359\u035a\7)\2\2\u035a\u035b\5p9\2\u035b\u035c\7*\2"+
		"\2\u035co\3\2\2\2\u035d\u0362\5r:\2\u035e\u035f\7\20\2\2\u035f\u0361\5"+
		"r:\2\u0360\u035e\3\2\2\2\u0361\u0364\3\2\2\2\u0362\u0360\3\2\2\2\u0362"+
		"\u0363\3\2\2\2\u0363q\3\2\2\2\u0364\u0362\3\2\2\2\u0365\u0366\5\u01ae"+
		"\u00d8\2\u0366s\3\2\2\2\u0367\u0369\5\u0082B\2\u0368\u036a\7\3\2\2\u0369"+
		"\u0368\3\2\2\2\u0369\u036a\3\2\2\2\u036a\u03a4\3\2\2\2\u036b\u036d\5\u008a"+
		"F\2\u036c\u036e\7\3\2\2\u036d\u036c\3\2\2\2\u036d\u036e\3\2\2\2\u036e"+
		"\u03a4\3\2\2\2\u036f\u0371\5\u0092J\2\u0370\u0372\7\3\2\2\u0371\u0370"+
		"\3\2\2\2\u0371\u0372\3\2\2\2\u0372\u03a4\3\2\2\2\u0373\u0375\5\u00acW"+
		"\2\u0374\u0376\7\3\2\2\u0375\u0374\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u03a4"+
		"\3\2\2\2\u0377\u0379\5\u00b4[\2\u0378\u037a\7\3\2\2\u0379\u0378\3\2\2"+
		"\2\u0379\u037a\3\2\2\2\u037a\u03a4\3\2\2\2\u037b\u037d\5\u00ccg\2\u037c"+
		"\u037e\7\3\2\2\u037d\u037c\3\2\2\2\u037d\u037e\3\2\2\2\u037e\u03a4\3\2"+
		"\2\2\u037f\u0381\5\u00eex\2\u0380\u0382\7\3\2\2\u0381\u0380\3\2\2\2\u0381"+
		"\u0382\3\2\2\2\u0382\u03a4\3\2\2\2\u0383\u0385\5\u00f4{\2\u0384\u0386"+
		"\7\3\2\2\u0385\u0384\3\2\2\2\u0385\u0386\3\2\2\2\u0386\u03a4\3\2\2\2\u0387"+
		"\u0389\5\u00fc\177\2\u0388\u038a\7\3\2\2\u0389\u0388\3\2\2\2\u0389\u038a"+
		"\3\2\2\2\u038a\u03a4\3\2\2\2\u038b\u038d\5\u0110\u0089\2\u038c\u038e\7"+
		"\3\2\2\u038d\u038c\3\2\2\2\u038d\u038e\3\2\2\2\u038e\u03a4\3\2\2\2\u038f"+
		"\u0391\5\u0116\u008c\2\u0390\u0392\7\3\2\2\u0391\u0390\3\2\2\2\u0391\u0392"+
		"\3\2\2\2\u0392\u03a4\3\2\2\2\u0393\u0395\5\u0118\u008d\2\u0394\u0396\7"+
		"\3\2\2\u0395\u0394\3\2\2\2\u0395\u0396\3\2\2\2\u0396\u03a4\3\2\2\2\u0397"+
		"\u0399\5\u011c\u008f\2\u0398\u039a\7\3\2\2\u0399\u0398\3\2\2\2\u0399\u039a"+
		"\3\2\2\2\u039a\u03a4\3\2\2\2\u039b\u039d\5\u0122\u0092\2\u039c\u039e\7"+
		"\3\2\2\u039d\u039c\3\2\2\2\u039d\u039e\3\2\2\2\u039e\u03a4\3\2\2\2\u039f"+
		"\u03a1\5\u01d6\u00ec\2\u03a0\u03a2\7\3\2\2\u03a1\u03a0\3\2\2\2\u03a1\u03a2"+
		"\3\2\2\2\u03a2\u03a4\3\2\2\2\u03a3\u0367\3\2\2\2\u03a3\u036b\3\2\2\2\u03a3"+
		"\u036f\3\2\2\2\u03a3\u0373\3\2\2\2\u03a3\u0377\3\2\2\2\u03a3\u037b\3\2"+
		"\2\2\u03a3\u037f\3\2\2\2\u03a3\u0383\3\2\2\2\u03a3\u0387\3\2\2\2\u03a3"+
		"\u038b\3\2\2\2\u03a3\u038f\3\2\2\2\u03a3\u0393\3\2\2\2\u03a3\u0397\3\2"+
		"\2\2\u03a3\u039b\3\2\2\2\u03a3\u039f\3\2\2\2\u03a4u\3\2\2\2\u03a5\u03a7"+
		"\5t;\2\u03a6\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a8"+
		"\u03a9\3\2\2\2\u03a9w\3\2\2\2\u03aa\u03ac\5z>\2\u03ab\u03aa\3\2\2\2\u03ac"+
		"\u03ad\3\2\2\2\u03ad\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03aey\3\2\2\2"+
		"\u03af\u03c9\7,\2\2\u03b0\u03c9\7-\2\2\u03b1\u03c9\7.\2\2\u03b2\u03c9"+
		"\7/\2\2\u03b3\u03c9\7\60\2\2\u03b4\u03c9\7\61\2\2\u03b5\u03c9\7\62\2\2"+
		"\u03b6\u03c9\7\63\2\2\u03b7\u03c9\7\64\2\2\u03b8\u03c9\7\65\2\2\u03b9"+
		"\u03c9\7\66\2\2\u03ba\u03c9\7\67\2\2\u03bb\u03c9\78\2\2\u03bc\u03c9\7"+
		"9\2\2\u03bd\u03c9\7:\2\2\u03be\u03bf\7:\2\2\u03bf\u03c0\7\36\2\2\u03c0"+
		"\u03c1\7;\2\2\u03c1\u03c9\7\37\2\2\u03c2\u03c3\7:\2\2\u03c3\u03c4\7\36"+
		"\2\2\u03c4\u03c5\7<\2\2\u03c5\u03c9\7\37\2\2\u03c6\u03c9\7=\2\2\u03c7"+
		"\u03c9\5|?\2\u03c8\u03af\3\2\2\2\u03c8\u03b0\3\2\2\2\u03c8\u03b1\3\2\2"+
		"\2\u03c8\u03b2\3\2\2\2\u03c8\u03b3\3\2\2\2\u03c8\u03b4\3\2\2\2\u03c8\u03b5"+
		"\3\2\2\2\u03c8\u03b6\3\2\2\2\u03c8\u03b7\3\2\2\2\u03c8\u03b8\3\2\2\2\u03c8"+
		"\u03b9\3\2\2\2\u03c8\u03ba\3\2\2\2\u03c8\u03bb\3\2\2\2\u03c8\u03bc\3\2"+
		"\2\2\u03c8\u03bd\3\2\2\2\u03c8\u03be\3\2\2\2\u03c8\u03c2\3\2\2\2\u03c8"+
		"\u03c6\3\2\2\2\u03c8\u03c7\3\2\2\2\u03c9{\3\2\2\2\u03ca\u03da\7>\2\2\u03cb"+
		"\u03cc\7>\2\2\u03cc\u03cd\7\36\2\2\u03cd\u03ce\7?\2\2\u03ce\u03da\7\37"+
		"\2\2\u03cf\u03da\7@\2\2\u03d0\u03d1\7@\2\2\u03d1\u03d2\7\36\2\2\u03d2"+
		"\u03d3\7?\2\2\u03d3\u03da\7\37\2\2\u03d4\u03da\7A\2\2\u03d5\u03d6\7A\2"+
		"\2\u03d6\u03d7\7\36\2\2\u03d7\u03d8\7?\2\2\u03d8\u03da\7\37\2\2\u03d9"+
		"\u03ca\3\2\2\2\u03d9\u03cb\3\2\2\2\u03d9\u03cf\3\2\2\2\u03d9\u03d0\3\2"+
		"\2\2\u03d9\u03d4\3\2\2\2\u03d9\u03d5\3\2\2\2\u03da}\3\2\2\2\u03db\u03dd"+
		"\5|?\2\u03dc\u03db\3\2\2\2\u03dd\u03de\3\2\2\2\u03de\u03dc\3\2\2\2\u03de"+
		"\u03df\3\2\2\2\u03df\177\3\2\2\2\u03e0\u03e2\7\16\2\2\u03e1\u03e3\5\6"+
		"\4\2\u03e2\u03e1\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3\u03e4\3\2\2\2\u03e4"+
		"\u03e5\7\17\2\2\u03e5\u0081\3\2\2\2\u03e6\u03e8\5\u0152\u00aa\2\u03e7"+
		"\u03e6\3\2\2\2\u03e7\u03e8\3\2\2\2\u03e8\u03e9\3\2\2\2\u03e9\u03eb\7B"+
		"\2\2\u03ea\u03ec\5\u0084C\2\u03eb\u03ea\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec"+
		"\u03ed\3\2\2\2\u03ed\u03ee\5\u0086D\2\u03ee\u0083\3\2\2\2\u03ef\u03f0"+
		"\t\4\2\2\u03f0\u0085\3\2\2\2\u03f1\u03f7\5\u0088E\2\u03f2\u03f3\5\u0088"+
		"E\2\u03f3\u03f4\7H\2\2\u03f4\u03f5\5\u0086D\2\u03f5\u03f7\3\2\2\2\u03f6"+
		"\u03f1\3\2\2\2\u03f6\u03f2\3\2\2\2\u03f7\u0087\3\2\2\2\u03f8\u03fb\5\u01f2"+
		"\u00fa\2\u03f9\u03fb\5\u01a6\u00d4\2\u03fa\u03f8\3\2\2\2\u03fa\u03f9\3"+
		"\2\2\2\u03fb\u0089\3\2\2\2\u03fc\u03fe\5\u0152\u00aa\2\u03fd\u03fc\3\2"+
		"\2\2\u03fd\u03fe\3\2\2\2\u03fe\u0400\3\2\2\2\u03ff\u0401\5x=\2\u0400\u03ff"+
		"\3\2\2\2\u0400\u0401\3\2\2\2\u0401\u0402\3\2\2\2\u0402\u0403\7\32\2\2"+
		"\u0403\u0404\5\u008cG\2\u0404\u008b\3\2\2\2\u0405\u040a\5\u008eH\2\u0406"+
		"\u0407\7\20\2\2\u0407\u0409\5\u008eH\2\u0408\u0406\3\2\2\2\u0409\u040c"+
		"\3\2\2\2\u040a\u0408\3\2\2\2\u040a\u040b\3\2\2\2\u040b\u008d\3\2\2\2\u040c"+
		"\u040a\3\2\2\2\u040d\u040f\5\u0134\u009b\2\u040e\u0410\5\u0090I\2\u040f"+
		"\u040e\3\2\2\2\u040f\u0410\3\2\2\2\u0410\u008f\3\2\2\2\u0411\u0412\7I"+
		"\2\2\u0412\u0413\5\u0158\u00ad\2\u0413\u0091\3\2\2\2\u0414\u0415\5\u0094"+
		"K\2\u0415\u0416\5\u0096L\2\u0416\u0417\5\u01b8\u00dd\2\u0417\u0418\5\u0098"+
		"M\2\u0418\u0434\3\2\2\2\u0419\u041a\5\u0094K\2\u041a\u041b\5\u0096L\2"+
		"\u041b\u041c\5\u01b8\u00dd\2\u041c\u041d\5\u00a0Q\2\u041d\u0434\3\2\2"+
		"\2\u041e\u041f\5\u0094K\2\u041f\u0420\5\u0096L\2\u0420\u0421\5\u0090I"+
		"\2\u0421\u0422\5\u00a6T\2\u0422\u0434\3\2\2\2\u0423\u0424\5\u0094K\2\u0424"+
		"\u0425\5\u0096L\2\u0425\u0427\5\u01b8\u00dd\2\u0426\u0428\5\u0090I\2\u0427"+
		"\u0426\3\2\2\2\u0427\u0428\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u042a\5\u00a6"+
		"T\2\u042a\u0434\3\2\2\2\u042b\u042c\5\u0094K\2\u042c\u042d\5\u0096L\2"+
		"\u042d\u042e\5\u01b8\u00dd\2\u042e\u042f\5\u0080A\2\u042f\u0434\3\2\2"+
		"\2\u0430\u0431\5\u0094K\2\u0431\u0432\5\u008cG\2\u0432\u0434\3\2\2\2\u0433"+
		"\u0414\3\2\2\2\u0433\u0419\3\2\2\2\u0433\u041e\3\2\2\2\u0433\u0423\3\2"+
		"\2\2\u0433\u042b\3\2\2\2\u0433\u0430\3\2\2\2\u0434\u0093\3\2\2\2\u0435"+
		"\u0437\5\u0152\u00aa\2\u0436\u0435\3\2\2\2\u0436\u0437\3\2\2\2\u0437\u0439"+
		"\3\2\2\2\u0438\u043a\5x=\2\u0439\u0438\3\2\2\2\u0439\u043a\3\2\2\2\u043a"+
		"\u043b\3\2\2\2\u043b\u043c\7\33\2\2\u043c\u0095\3\2\2\2\u043d\u043e\5"+
		"\u01f2\u00fa\2\u043e\u0097\3\2\2\2\u043f\u0440\7\16\2\2\u0440\u0442\5"+
		"\u009aN\2\u0441\u0443\5\u009cO\2\u0442\u0441\3\2\2\2\u0442\u0443\3\2\2"+
		"\2\u0443\u0444\3\2\2\2\u0444\u0445\7\17\2\2\u0445\u044c\3\2\2\2\u0446"+
		"\u0447\7\16\2\2\u0447\u0448\5\u009cO\2\u0448\u0449\5\u009aN\2\u0449\u044a"+
		"\7\17\2\2\u044a\u044c\3\2\2\2\u044b\u043f\3\2\2\2\u044b\u0446\3\2\2\2"+
		"\u044c\u0099\3\2\2\2\u044d\u044f\5\u0152\u00aa\2\u044e\u044d\3\2\2\2\u044e"+
		"\u044f\3\2\2\2\u044f\u0451\3\2\2\2\u0450\u0452\5x=\2\u0451\u0450\3\2\2"+
		"\2\u0451\u0452\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0454\7J\2\2\u0454\u0455"+
		"\5\u0080A\2\u0455\u009b\3\2\2\2\u0456\u0458\5\u0152\u00aa\2\u0457\u0456"+
		"\3\2\2\2\u0457\u0458\3\2\2\2\u0458\u045a\3\2\2\2\u0459\u045b\5x=\2\u045a"+
		"\u0459\3\2\2\2\u045a\u045b\3\2\2\2\u045b\u045c\3\2\2\2\u045c\u045e\7?"+
		"\2\2\u045d\u045f\5\u009eP\2\u045e\u045d\3\2\2\2\u045e\u045f\3\2\2\2\u045f"+
		"\u0460\3\2\2\2\u0460\u0461\5\u0080A\2\u0461\u009d\3\2\2\2\u0462\u0463"+
		"\7\36\2\2\u0463\u0464\5\u01f2\u00fa\2\u0464\u0465\7\37\2\2\u0465\u009f"+
		"\3\2\2\2\u0466\u0467\7\16\2\2\u0467\u0469\5\u00a2R\2\u0468\u046a\5\u00a4"+
		"S\2\u0469\u0468\3\2\2\2\u0469\u046a\3\2\2\2\u046a\u046b\3\2\2\2\u046b"+
		"\u046c\7\17\2\2\u046c\u0473\3\2\2\2\u046d\u046e\7\16\2\2\u046e\u046f\5"+
		"\u00a4S\2\u046f\u0470\5\u00a2R\2\u0470\u0471\7\17\2\2\u0471\u0473\3\2"+
		"\2\2\u0472\u0466\3\2\2\2\u0472\u046d\3\2\2\2\u0473\u00a1\3\2\2\2\u0474"+
		"\u0476\5\u0152\u00aa\2\u0475\u0474\3\2\2\2\u0475\u0476\3\2\2\2\u0476\u0477"+
		"\3\2\2\2\u0477\u0478\7J\2\2\u0478\u00a3\3\2\2\2\u0479\u047b\5\u0152\u00aa"+
		"\2\u047a\u0479\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u047d"+
		"\7?\2\2\u047d\u00a5\3\2\2\2\u047e\u047f\7\16\2\2\u047f\u0481\5\u00a8U"+
		"\2\u0480\u0482\5\u00aaV\2\u0481\u0480\3\2\2\2\u0481\u0482\3\2\2\2\u0482"+
		"\u0483\3\2\2\2\u0483\u0484\7\17\2\2\u0484\u048d\3\2\2\2\u0485\u0486\7"+
		"\16\2\2\u0486\u0488\5\u00aaV\2\u0487\u0489\5\u00a8U\2\u0488\u0487\3\2"+
		"\2\2\u0488\u0489\3\2\2\2\u0489\u048a\3\2\2\2\u048a\u048b\7\17\2\2\u048b"+
		"\u048d\3\2\2\2\u048c\u047e\3\2\2\2\u048c\u0485\3\2\2\2\u048d\u00a7\3\2"+
		"\2\2\u048e\u0490\5\u0152\u00aa\2\u048f\u048e\3\2\2\2\u048f\u0490\3\2\2"+
		"\2\u0490\u0491\3\2\2\2\u0491\u0493\7K\2\2\u0492\u0494\5\u009eP\2\u0493"+
		"\u0492\3\2\2\2\u0493\u0494\3\2\2\2\u0494\u0495\3\2\2\2\u0495\u0496\5\u0080"+
		"A\2\u0496\u00a9\3\2\2\2\u0497\u0499\5\u0152\u00aa\2\u0498\u0497\3\2\2"+
		"\2\u0498\u0499\3\2\2\2\u0499\u049a\3\2\2\2\u049a\u049c\7L\2\2\u049b\u049d"+
		"\5\u009eP\2\u049c\u049b\3\2\2\2\u049c\u049d\3\2\2\2\u049d\u049e\3\2\2"+
		"\2\u049e\u049f\5\u0080A\2\u049f\u00ab\3\2\2\2\u04a0\u04a1\5\u00aeX\2\u04a1"+
		"\u04a2\5\u00b2Z\2\u04a2\u00ad\3\2\2\2\u04a3\u04a5\5\u0152\u00aa\2\u04a4"+
		"\u04a3\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5\u04a7\3\2\2\2\u04a6\u04a8\5|"+
		"?\2\u04a7\u04a6\3\2\2\2\u04a7\u04a8\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9"+
		"\u04aa\7C\2\2\u04aa\u04ab\5\u00b0Y\2\u04ab\u00af\3\2\2\2\u04ac\u04ad\5"+
		"\u01f2\u00fa\2\u04ad\u00b1\3\2\2\2\u04ae\u04af\7I\2\2\u04af\u04b0\5\u01ae"+
		"\u00d8\2\u04b0\u00b3\3\2\2\2\u04b1\u04b2\5\u00b6\\\2\u04b2\u04b4\5\u00b8"+
		"]\2\u04b3\u04b5\5^\60\2\u04b4\u04b3\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5"+
		"\u04b6\3\2\2\2\u04b6\u04b7\5\u00ba^\2\u04b7\u04b8\5\u00be`\2\u04b8\u04c1"+
		"\3\2\2\2\u04b9\u04ba\5\u00b6\\\2\u04ba\u04bc\5\u00b8]\2\u04bb\u04bd\5"+
		"^\60\2\u04bc\u04bb\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u04be\3\2\2\2\u04be"+
		"\u04bf\5\u00ba^\2\u04bf\u04c1\3\2\2\2\u04c0\u04b1\3\2\2\2\u04c0\u04b9"+
		"\3\2\2\2\u04c1\u00b5\3\2\2\2\u04c2\u04c4\5\u0152\u00aa\2\u04c3\u04c2\3"+
		"\2\2\2\u04c3\u04c4\3\2\2\2\u04c4\u04c6\3\2\2\2\u04c5\u04c7\5x=\2\u04c6"+
		"\u04c5\3\2\2\2\u04c6\u04c7\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04c9\7G"+
		"\2\2\u04c9\u00b7\3\2\2\2\u04ca\u04cd\5\u01f2\u00fa\2\u04cb\u04cd\5\u01a6"+
		"\u00d4\2\u04cc\u04ca\3\2\2\2\u04cc\u04cb\3\2\2\2\u04cd\u00b9\3\2\2\2\u04ce"+
		"\u04d0\5\u00c0a\2\u04cf\u04d1\t\5\2\2\u04d0\u04cf\3\2\2\2\u04d0\u04d1"+
		"\3\2\2\2\u04d1\u04d3\3\2\2\2\u04d2\u04d4\5\u00bc_\2\u04d3\u04d2\3\2\2"+
		"\2\u04d3\u04d4\3\2\2\2\u04d4\u00bb\3\2\2\2\u04d5\u04d7\7O\2\2\u04d6\u04d8"+
		"\5\u0152\u00aa\2\u04d7\u04d6\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04d9\3"+
		"\2\2\2\u04d9\u04da\5\u01ae\u00d8\2\u04da\u00bd\3\2\2\2\u04db\u04dc\5\u0080"+
		"A\2\u04dc\u00bf\3\2\2\2\u04dd\u04de\7\36\2\2\u04de\u04e7\7\37\2\2\u04df"+
		"\u04e0\7\36\2\2\u04e0\u04e2\5\u00c2b\2\u04e1\u04e3\7P\2\2\u04e2\u04e1"+
		"\3\2\2\2\u04e2\u04e3\3\2\2\2\u04e3\u04e4\3\2\2\2\u04e4\u04e5\7\37\2\2"+
		"\u04e5\u04e7\3\2\2\2\u04e6\u04dd\3\2\2\2\u04e6\u04df\3\2\2\2\u04e7\u00c1"+
		"\3\2\2\2\u04e8\u04ed\5\u00c4c\2\u04e9\u04ea\7\20\2\2\u04ea\u04ec\5\u00c4"+
		"c\2\u04eb\u04e9\3\2\2\2\u04ec\u04ef\3\2\2\2\u04ed\u04eb\3\2\2\2\u04ed"+
		"\u04ee\3\2\2\2\u04ee\u00c3\3\2\2\2\u04ef\u04ed\3\2\2\2\u04f0\u04f2\5\u0152"+
		"\u00aa\2\u04f1\u04f0\3\2\2\2\u04f1\u04f2\3\2\2\2\u04f2\u04f4\3\2\2\2\u04f3"+
		"\u04f5\7Q\2\2\u04f4\u04f3\3\2\2\2\u04f4\u04f5\3\2\2\2\u04f5\u04f7\3\2"+
		"\2\2\u04f6\u04f8\7\32\2\2\u04f7\u04f6\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8"+
		"\u04fa\3\2\2\2\u04f9\u04fb\7R\2\2\u04fa\u04f9\3\2\2\2\u04fa\u04fb\3\2"+
		"\2\2\u04fb\u04fd\3\2\2\2\u04fc\u04fe\5\u00c6d\2\u04fd\u04fc\3\2\2\2\u04fd"+
		"\u04fe\3\2\2\2\u04fe\u04ff\3\2\2\2\u04ff\u0501\5\u00c8e\2\u0500\u0502"+
		"\5\u01b8\u00dd\2\u0501\u0500\3\2\2\2\u0501\u0502\3\2\2\2\u0502\u0504\3"+
		"\2\2\2\u0503\u0505\5\u00caf\2\u0504\u0503\3\2\2\2\u0504\u0505\3\2\2\2"+
		"\u0505\u0523\3\2\2\2\u0506\u0508\7Q\2\2\u0507\u0506\3\2\2\2\u0507\u0508"+
		"\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050b\7\33\2\2\u050a\u050c\7R\2\2\u050b"+
		"\u050a\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u050e\3\2\2\2\u050d\u050f\5\u00c6"+
		"d\2\u050e\u050d\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u0510\3\2\2\2\u0510"+
		"\u0512\5\u00c8e\2\u0511\u0513\5\u01b8\u00dd\2\u0512\u0511\3\2\2\2\u0512"+
		"\u0513\3\2\2\2\u0513\u0515\3\2\2\2\u0514\u0516\5\u00caf\2\u0515\u0514"+
		"\3\2\2\2\u0515\u0516\3\2\2\2\u0516\u0523\3\2\2\2\u0517\u0519\5\u0152\u00aa"+
		"\2\u0518\u0517\3\2\2\2\u0518\u0519\3\2\2\2\u0519\u051a\3\2\2\2\u051a\u0523"+
		"\5\u01ae\u00d8\2\u051b\u051d\5\u00c6d\2\u051c\u051b\3\2\2\2\u051c\u051d"+
		"\3\2\2\2\u051d\u051e\3\2\2\2\u051e\u051f\5\u00c8e\2\u051f\u0520\5\u01b8"+
		"\u00dd\2\u0520\u0521\7P\2\2\u0521\u0523\3\2\2\2\u0522\u04f1\3\2\2\2\u0522"+
		"\u0507\3\2\2\2\u0522\u0518\3\2\2\2\u0522\u051c\3\2\2\2\u0523\u00c5\3\2"+
		"\2\2\u0524\u0528\5\u01f2\u00fa\2\u0525\u0528\5\u01f4\u00fb\2\u0526\u0528"+
		"\7S\2\2\u0527\u0524\3\2\2\2\u0527\u0525\3\2\2\2\u0527\u0526\3\2\2\2\u0528"+
		"\u00c7\3\2\2\2\u0529\u052c\5\u01f2\u00fa\2\u052a\u052c\7S\2\2\u052b\u0529"+
		"\3\2\2\2\u052b\u052a\3\2\2\2\u052c\u00c9\3\2\2\2\u052d\u052e\7I\2\2\u052e"+
		"\u052f\5\u0158\u00ad\2\u052f\u00cb\3\2\2\2\u0530\u0532\5\u0152\u00aa\2"+
		"\u0531\u0530\3\2\2\2\u0531\u0532\3\2\2\2\u0532\u0534\3\2\2\2\u0533\u0535"+
		"\5|?\2\u0534\u0533\3\2\2\2\u0534\u0535\3\2\2\2\u0535\u0536\3\2\2\2\u0536"+
		"\u0537\5\u00ceh\2\u0537\u00cd\3\2\2\2\u0538\u053b\5\u00d0i\2\u0539\u053b"+
		"\5\u00e0q\2\u053a\u0538\3\2\2\2\u053a\u0539\3\2\2\2\u053b\u00cf\3\2\2"+
		"\2\u053c\u053e\7T\2\2\u053d\u053c\3\2\2\2\u053d\u053e\3\2\2\2\u053e\u053f"+
		"\3\2\2\2\u053f\u0540\7E\2\2\u0540\u0542\5\u00dco\2\u0541\u0543\5^\60\2"+
		"\u0542\u0541\3\2\2\2\u0542\u0543\3\2\2\2\u0543\u0545\3\2\2\2\u0544\u0546"+
		"\5\u01d0\u00e9\2\u0545\u0544\3\2\2\2\u0545\u0546\3\2\2\2\u0546\u0547\3"+
		"\2\2\2\u0547\u0549\7\16\2\2\u0548\u054a\5\u00d2j\2\u0549\u0548\3\2\2\2"+
		"\u0549\u054a\3\2\2\2\u054a\u054b\3\2\2\2\u054b\u054c\7\17\2\2\u054c\u00d1"+
		"\3\2\2\2\u054d\u054f\5\u00d4k\2\u054e\u054d\3\2\2\2\u054f\u0550\3\2\2"+
		"\2\u0550\u054e\3\2\2\2\u0550\u0551\3\2\2\2\u0551\u00d3\3\2\2\2\u0552\u0558"+
		"\5t;\2\u0553\u0555\5\u00d6l\2\u0554\u0556\7\3\2\2\u0555\u0554\3\2\2\2"+
		"\u0555\u0556\3\2\2\2\u0556\u0558\3\2\2\2\u0557\u0552\3\2\2\2\u0557\u0553"+
		"\3\2\2\2\u0558\u00d5\3\2\2\2\u0559\u055b\5\u0152\u00aa\2\u055a\u0559\3"+
		"\2\2\2\u055a\u055b\3\2\2\2\u055b\u055d\3\2\2\2\u055c\u055e\7T\2\2\u055d"+
		"\u055c\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u055f\3\2\2\2\u055f\u0560\7\6"+
		"\2\2\u0560\u0561\5\u00d8m\2\u0561\u00d7\3\2\2\2\u0562\u0567\5\u00dan\2"+
		"\u0563\u0564\7\20\2\2\u0564\u0566\5\u00dan\2\u0565\u0563\3\2\2\2\u0566"+
		"\u0569\3\2\2\2\u0567\u0565\3\2\2\2\u0567\u0568\3\2\2\2\u0568\u00d9\3\2"+
		"\2\2\u0569\u0567\3\2\2\2\u056a\u056c\5\u00dep\2\u056b\u056d\5\u01be\u00e0"+
		"\2\u056c\u056b\3\2\2\2\u056c\u056d\3\2\2\2\u056d\u00db\3\2\2\2\u056e\u056f"+
		"\5\u01f2\u00fa\2\u056f\u00dd\3\2\2\2\u0570\u0571\5\u01f2\u00fa\2\u0571"+
		"\u00df\3\2\2\2\u0572\u0573\7E\2\2\u0573\u0575\5\u00dco\2\u0574\u0576\5"+
		"^\60\2\u0575\u0574\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0578\3\2\2\2\u0577"+
		"\u0579\5\u01d0\u00e9\2\u0578\u0577\3\2\2\2\u0578\u0579\3\2\2\2\u0579\u057a"+
		"\3\2\2\2\u057a\u057c\7\16\2\2\u057b\u057d\5\u00e2r\2\u057c\u057b\3\2\2"+
		"\2\u057c\u057d\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u057f\7\17\2\2\u057f"+
		"\u00e1\3\2\2\2\u0580\u0582\5\u00e4s\2\u0581\u0580\3\2\2\2\u0582\u0583"+
		"\3\2\2\2\u0583\u0581\3\2\2\2\u0583\u0584\3\2\2\2\u0584\u00e3\3\2\2\2\u0585"+
		"\u0588\5t;\2\u0586\u0588\5\u00e6t\2\u0587\u0585\3\2\2\2\u0587\u0586\3"+
		"\2\2\2\u0588\u00e5\3\2\2\2\u0589\u058b\5\u0152\u00aa\2\u058a\u0589\3\2"+
		"\2\2\u058a\u058b\3\2\2\2\u058b\u058c\3\2\2\2\u058c\u058d\7\6\2\2\u058d"+
		"\u058e\5\u00e8u\2\u058e\u00e7\3\2\2\2\u058f\u0594\5\u00eav\2\u0590\u0591"+
		"\7\20\2\2\u0591\u0593\5\u00eav\2\u0592\u0590\3\2\2\2\u0593\u0596\3\2\2"+
		"\2\u0594\u0592\3\2\2\2\u0594\u0595\3\2\2\2\u0595\u00e9\3\2\2\2\u0596\u0594"+
		"\3\2\2\2\u0597\u0599\5\u00dep\2\u0598\u059a\5\u00ecw\2\u0599\u0598\3\2"+
		"\2\2\u0599\u059a\3\2\2\2\u059a\u00eb\3\2\2\2\u059b\u059c\7I\2\2\u059c"+
		"\u059d\5\u01fc\u00ff\2\u059d\u00ed\3\2\2\2\u059e\u05a0\5\u0152\u00aa\2"+
		"\u059f\u059e\3\2\2\2\u059f\u05a0\3\2\2\2\u05a0\u05a2\3\2\2\2\u05a1\u05a3"+
		"\5|?\2\u05a2\u05a1\3\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a4\3\2\2\2\u05a4"+
		"\u05a5\7D\2\2\u05a5\u05a7\5\u00f0y\2\u05a6\u05a8\5^\60\2\u05a7\u05a6\3"+
		"\2\2\2\u05a7\u05a8\3\2\2\2\u05a8\u05aa\3\2\2\2\u05a9\u05ab\5\u01d0\u00e9"+
		"\2\u05aa\u05a9\3\2\2\2\u05aa\u05ab\3\2\2\2\u05ab\u05ac\3\2\2\2\u05ac\u05ad"+
		"\5\u00f2z\2\u05ad\u00ef\3\2\2\2\u05ae\u05af\5\u01f2\u00fa\2\u05af\u00f1"+
		"\3\2\2\2\u05b0\u05b2\7\16\2\2\u05b1\u05b3\5v<\2\u05b2\u05b1\3\2\2\2\u05b2"+
		"\u05b3\3\2\2\2\u05b3\u05b4\3\2\2\2\u05b4\u05b5\7\17\2\2\u05b5\u00f3\3"+
		"\2\2\2\u05b6\u05b8\5\u0152\u00aa\2\u05b7\u05b6\3\2\2\2\u05b7\u05b8\3\2"+
		"\2\2\u05b8\u05ba\3\2\2\2\u05b9\u05bb\5\u00f6|\2\u05ba\u05b9\3\2\2\2\u05ba"+
		"\u05bb\3\2\2\2\u05bb\u05bc\3\2\2\2\u05bc\u05bd\7,\2\2\u05bd\u05bf\5\u00f8"+
		"}\2\u05be\u05c0\5^\60\2\u05bf\u05be\3\2\2\2\u05bf\u05c0\3\2\2\2\u05c0"+
		"\u05c2\3\2\2\2\u05c1\u05c3\5\u01d0\u00e9\2\u05c2\u05c1\3\2\2\2\u05c2\u05c3"+
		"\3\2\2\2\u05c3\u05c4\3\2\2\2\u05c4\u05c5\5\u00fa~\2\u05c5\u00f5\3\2\2"+
		"\2\u05c6\u05c8\5|?\2\u05c7\u05c9\7/\2\2\u05c8\u05c7\3\2\2\2\u05c8\u05c9"+
		"\3\2\2\2\u05c9\u05cf\3\2\2\2\u05ca\u05cc\7/\2\2\u05cb\u05cd\5|?\2\u05cc"+
		"\u05cb\3\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05cf\3\2\2\2\u05ce\u05c6\3\2"+
		"\2\2\u05ce\u05ca\3\2\2\2\u05cf\u00f7\3\2\2\2\u05d0\u05d1\5\u01f2\u00fa"+
		"\2\u05d1\u00f9\3\2\2\2\u05d2\u05d4\7\16\2\2\u05d3\u05d5\5v<\2\u05d4\u05d3"+
		"\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d6\3\2\2\2\u05d6\u05d7\7\17\2\2"+
		"\u05d7\u00fb\3\2\2\2\u05d8\u05da\5\u0152\u00aa\2\u05d9\u05d8\3\2\2\2\u05d9"+
		"\u05da\3\2\2\2\u05da\u05dc\3\2\2\2\u05db\u05dd\5|?\2\u05dc\u05db\3\2\2"+
		"\2\u05dc\u05dd\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05df\7F\2\2\u05df\u05e1"+
		"\5\u00fe\u0080\2\u05e0\u05e2\5\u01d0\u00e9\2\u05e1\u05e0\3\2\2\2\u05e1"+
		"\u05e2\3\2\2\2\u05e2\u05e3\3\2\2\2\u05e3\u05e4\5\u0100\u0081\2\u05e4\u00fd"+
		"\3\2\2\2\u05e5\u05e6\5\u01f2\u00fa\2\u05e6\u00ff\3\2\2\2\u05e7\u05e9\7"+
		"\16\2\2\u05e8\u05ea\5\u0104\u0083\2\u05e9\u05e8\3\2\2\2\u05e9\u05ea\3"+
		"\2\2\2\u05ea\u05eb\3\2\2\2\u05eb\u05ec\7\17\2\2\u05ec\u0101\3\2\2\2\u05ed"+
		"\u05ef\5\u0106\u0084\2\u05ee\u05f0\7\3\2\2\u05ef\u05ee\3\2\2\2\u05ef\u05f0"+
		"\3\2\2\2\u05f0\u0602\3\2\2\2\u05f1\u05f3\5\u0108\u0085\2\u05f2\u05f4\7"+
		"\3\2\2\u05f3\u05f2\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u0602\3\2\2\2\u05f5"+
		"\u05f7\5\u010a\u0086\2\u05f6\u05f8\7\3\2\2\u05f7\u05f6\3\2\2\2\u05f7\u05f8"+
		"\3\2\2\2\u05f8\u0602\3\2\2\2\u05f9\u05fb\5\u010c\u0087\2\u05fa\u05fc\7"+
		"\3\2\2\u05fb\u05fa\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u0602\3\2\2\2\u05fd"+
		"\u05ff\5\u010e\u0088\2\u05fe\u0600\7\3\2\2\u05ff\u05fe\3\2\2\2\u05ff\u0600"+
		"\3\2\2\2\u0600\u0602\3\2\2\2\u0601\u05ed\3\2\2\2\u0601\u05f1\3\2\2\2\u0601"+
		"\u05f5\3\2\2\2\u0601\u05f9\3\2\2\2\u0601\u05fd\3\2\2\2\u0602\u0103\3\2"+
		"\2\2\u0603\u0605\5\u0102\u0082\2\u0604\u0603\3\2\2\2\u0605\u0606\3\2\2"+
		"\2\u0606\u0604\3\2\2\2\u0606\u0607\3\2\2\2\u0607\u0105\3\2\2\2\u0608\u0609"+
		"\5\u0094K\2\u0609\u060a\5\u0096L\2\u060a\u060b\5\u01b8\u00dd\2\u060b\u060c"+
		"\5\u00a0Q\2\u060c\u0107\3\2\2\2\u060d\u060e\5\u00b6\\\2\u060e\u0610\5"+
		"\u00b8]\2\u060f\u0611\5^\60\2\u0610\u060f\3\2\2\2\u0610\u0611\3\2\2\2"+
		"\u0611\u0612\3\2\2\2\u0612\u0613\5\u00ba^\2\u0613\u0109\3\2\2\2\u0614"+
		"\u0616\5\u0112\u008a\2\u0615\u0617\5^\60\2\u0616\u0615\3\2\2\2\u0616\u0617"+
		"\3\2\2\2\u0617\u0618\3\2\2\2\u0618\u061a\5\u00c0a\2\u0619\u061b\t\5\2"+
		"\2\u061a\u0619\3\2\2\2\u061a\u061b\3\2\2\2\u061b\u010b\3\2\2\2\u061c\u061d"+
		"\5\u011e\u0090\2\u061d\u061e\5\u0120\u0091\2\u061e\u061f\5\u00a0Q\2\u061f"+
		"\u010d\3\2\2\2\u0620\u0622\5\u0152\u00aa\2\u0621\u0620\3\2\2\2\u0621\u0622"+
		"\3\2\2\2\u0622\u0624\3\2\2\2\u0623\u0625\5|?\2\u0624\u0623\3\2\2\2\u0624"+
		"\u0625\3\2\2\2\u0625\u0626\3\2\2\2\u0626\u0627\7U\2\2\u0627\u0629\5\u00b0"+
		"Y\2\u0628\u062a\5\u01d0\u00e9\2\u0629\u0628\3\2\2\2\u0629\u062a\3\2\2"+
		"\2\u062a\u062c\3\2\2\2\u062b\u062d\5\u00b2Z\2\u062c\u062b\3\2\2\2\u062c"+
		"\u062d\3\2\2\2\u062d\u010f\3\2\2\2\u062e\u0630\5\u0112\u008a\2\u062f\u0631"+
		"\5^\60\2\u0630\u062f\3\2\2\2\u0630\u0631\3\2\2\2\u0631\u0632\3\2\2\2\u0632"+
		"\u0634\5\u00c0a\2\u0633\u0635\t\5\2\2\u0634\u0633\3\2\2\2\u0634\u0635"+
		"\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0637\5\u0114\u008b\2\u0637\u0111\3"+
		"\2\2\2\u0638\u063a\5\u0152\u00aa\2\u0639\u0638\3\2\2\2\u0639\u063a\3\2"+
		"\2\2\u063a\u063c\3\2\2\2\u063b\u063d\5x=\2\u063c\u063b\3\2\2\2\u063c\u063d"+
		"\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u0640\7V\2\2\u063f\u0641\t\6\2\2\u0640"+
		"\u063f\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u0113\3\2\2\2\u0642\u0643\5\u0080"+
		"A\2\u0643\u0115\3\2\2\2\u0644\u0646\5\u0152\u00aa\2\u0645\u0644\3\2\2"+
		"\2\u0645\u0646\3\2\2\2\u0646\u0647\3\2\2\2\u0647\u0648\7Y\2\2\u0648\u0649"+
		"\5\u0080A\2\u0649\u0117\3\2\2\2\u064a\u064c\5\u0152\u00aa\2\u064b\u064a"+
		"\3\2\2\2\u064b\u064c\3\2\2\2\u064c\u064e\3\2\2\2\u064d\u064f\5|?\2\u064e"+
		"\u064d\3\2\2\2\u064e\u064f\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0651\7Z"+
		"\2\2\u0651\u0654\5\u01ba\u00de\2\u0652\u0655\5d\63\2\u0653\u0655\5\u01d0"+
		"\u00e9\2\u0654\u0652\3\2\2\2\u0654\u0653\3\2\2\2\u0654\u0655\3\2\2\2\u0655"+
		"\u0656\3\2\2\2\u0656\u0657\5\u011a\u008e\2\u0657\u0119\3\2\2\2\u0658\u065a"+
		"\7\16\2\2\u0659\u065b\5v<\2\u065a\u0659\3\2\2\2\u065a\u065b\3\2\2\2\u065b"+
		"\u065c\3\2\2\2\u065c\u065d\7\17\2\2\u065d\u011b\3\2\2\2\u065e\u065f\5"+
		"\u011e\u0090\2\u065f\u0660\5\u0120\u0091\2\u0660\u0661\5\u0098M\2\u0661"+
		"\u066b\3\2\2\2\u0662\u0663\5\u011e\u0090\2\u0663\u0664\5\u0120\u0091\2"+
		"\u0664\u0665\5\u00a0Q\2\u0665\u066b\3\2\2\2\u0666\u0667\5\u011e\u0090"+
		"\2\u0667\u0668\5\u0120\u0091\2\u0668\u0669\5\u0080A\2\u0669\u066b\3\2"+
		"\2\2\u066a\u065e\3\2\2\2\u066a\u0662\3\2\2\2\u066a\u0666\3\2\2\2\u066b"+
		"\u011d\3\2\2\2\u066c\u066e\5\u0152\u00aa\2\u066d\u066c\3\2\2\2\u066d\u066e"+
		"\3\2\2\2\u066e\u0670\3\2\2\2\u066f\u0671\5x=\2\u0670\u066f\3\2\2\2\u0670"+
		"\u0671\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u0673\7[\2\2\u0673\u0674\5\u00c0"+
		"a\2\u0674\u011f\3\2\2\2\u0675\u0677\7O\2\2\u0676\u0678\5\u0152\u00aa\2"+
		"\u0677\u0676\3\2\2\2\u0677\u0678\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067a"+
		"\5\u01ae\u00d8\2\u067a\u0121\3\2\2\2\u067b\u067f\5\u0124\u0093\2\u067c"+
		"\u067f\5\u0126\u0094\2\u067d\u067f\5\u0128\u0095\2\u067e\u067b\3\2\2\2"+
		"\u067e\u067c\3\2\2\2\u067e\u067d\3\2\2\2\u067f\u0123\3\2\2\2\u0680\u0681"+
		"\7\67\2\2\u0681\u0682\7\\\2\2\u0682\u0683\5\u01a6\u00d4\2\u0683\u0684"+
		"\7\16\2\2\u0684\u0685\7\17\2\2\u0685\u0125\3\2\2\2\u0686\u0687\7\66\2"+
		"\2\u0687\u0688\7\\\2\2\u0688\u0689\5\u01a6\u00d4\2\u0689\u068a\7\16\2"+
		"\2\u068a\u068b\7\17\2\2\u068b\u0127\3\2\2\2\u068c\u068d\7\60\2\2\u068d"+
		"\u068e\7\\\2\2\u068e\u068f\5\u01a6\u00d4\2\u068f\u0691\7\16\2\2\u0690"+
		"\u0692\5\u012a\u0096\2\u0691\u0690\3\2\2\2\u0691\u0692\3\2\2\2\u0692\u0693"+
		"\3\2\2\2\u0693\u0694\7\17\2\2\u0694\u0129\3\2\2\2\u0695\u0697\5\u012c"+
		"\u0097\2\u0696\u0698\5\u0130\u0099\2\u0697\u0696\3\2\2\2\u0697\u0698\3"+
		"\2\2\2\u0698\u069e\3\2\2\2\u0699\u069b\5\u0130\u0099\2\u069a\u069c\5\u012c"+
		"\u0097\2\u069b\u069a\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069e\3\2\2\2\u069d"+
		"\u0695\3\2\2\2\u069d\u0699\3\2\2\2\u069e\u012b\3\2\2\2\u069f\u06a0\7]"+
		"\2\2\u06a0\u06a1\5\u012e\u0098\2\u06a1\u012d\3\2\2\2\u06a2\u06a3\5\u0200"+
		"\u0101\2\u06a3\u012f\3\2\2\2\u06a4\u06a5\7^\2\2\u06a5\u06a6\5\u0132\u009a"+
		"\2\u06a6\u0131\3\2\2\2\u06a7\u06a8\t\7\2\2\u06a8\u0133\3\2\2\2\u06a9\u06aa"+
		"\b\u009b\1\2\u06aa\u06ac\5\u0136\u009c\2\u06ab\u06ad\5\u01b8\u00dd\2\u06ac"+
		"\u06ab\3\2\2\2\u06ac\u06ad\3\2\2\2\u06ad\u06bc\3\2\2\2\u06ae\u06b0\5\u0138"+
		"\u009d\2\u06af\u06b1\5\u01b8\u00dd\2\u06b0\u06af\3\2\2\2\u06b0\u06b1\3"+
		"\2\2\2\u06b1\u06bc\3\2\2\2\u06b2\u06bc\5\u013a\u009e\2\u06b3\u06b5\5\u013c"+
		"\u009f\2\u06b4\u06b6\5\u01b8\u00dd\2\u06b5\u06b4\3\2\2\2\u06b5\u06b6\3"+
		"\2\2\2\u06b6\u06bc\3\2\2\2\u06b7\u06bc\5\u0142\u00a2\2\u06b8\u06b9\7b"+
		"\2\2\u06b9\u06bc\5\u01ae\u00d8\2\u06ba\u06bc\5\u014a\u00a6\2\u06bb\u06a9"+
		"\3\2\2\2\u06bb\u06ae\3\2\2\2\u06bb\u06b2\3\2\2\2\u06bb\u06b3\3\2\2\2\u06bb"+
		"\u06b7\3\2\2\2\u06bb\u06b8\3\2\2\2\u06bb\u06ba\3\2\2\2\u06bc\u06c2\3\2"+
		"\2\2\u06bd\u06be\f\4\2\2\u06be\u06bf\7c\2\2\u06bf\u06c1\5\u01ae\u00d8"+
		"\2\u06c0\u06bd\3\2\2\2\u06c1\u06c4\3\2\2\2\u06c2\u06c0\3\2\2\2\u06c2\u06c3"+
		"\3\2\2\2\u06c3\u0135\3\2\2\2\u06c4\u06c2\3\2\2\2\u06c5\u06c6\7S\2\2\u06c6"+
		"\u0137\3\2\2\2\u06c7\u06c8\5\u01f2\u00fa\2\u06c8\u0139\3\2\2\2\u06c9\u06ca"+
		"\7\33\2\2\u06ca\u06ce\5\u0134\u009b\2\u06cb\u06cc\7\32\2\2\u06cc\u06ce"+
		"\5\u0134\u009b\2\u06cd\u06c9\3\2\2\2\u06cd\u06cb\3\2\2\2\u06ce\u013b\3"+
		"\2\2\2\u06cf\u06d1\7\36\2\2\u06d0\u06d2\5\u013e\u00a0\2\u06d1\u06d0\3"+
		"\2\2\2\u06d1\u06d2\3\2\2\2\u06d2\u06d3\3\2\2\2\u06d3\u06d4\7\37\2\2\u06d4"+
		"\u013d\3\2\2\2\u06d5\u06da\5\u0140\u00a1\2\u06d6\u06d7\7\20\2\2\u06d7"+
		"\u06d9\5\u0140\u00a1\2\u06d8\u06d6\3\2\2\2\u06d9\u06dc\3\2\2\2\u06da\u06d8"+
		"\3\2\2\2\u06da\u06db\3\2\2\2\u06db\u013f\3\2\2\2\u06dc\u06da\3\2\2\2\u06dd"+
		"\u06e3\5\u0134\u009b\2\u06de\u06df\5\u01f2\u00fa\2\u06df\u06e0\7\4\2\2"+
		"\u06e0\u06e1\5\u0134\u009b\2\u06e1\u06e3\3\2\2\2\u06e2\u06dd\3\2\2\2\u06e2"+
		"\u06de\3\2\2\2\u06e3\u0141\3\2\2\2\u06e4\u06e6\5\u01ba\u00de\2\u06e5\u06e4"+
		"\3\2\2\2\u06e5\u06e6\3\2\2\2\u06e6\u06e8\3\2\2\2\u06e7\u06e9\7H\2\2\u06e8"+
		"\u06e7\3\2\2\2\u06e8\u06e9\3\2\2\2\u06e9\u06ea\3\2\2\2\u06ea\u06ec\5\u00de"+
		"p\2\u06eb\u06ed\5\u013c\u009f\2\u06ec\u06eb\3\2\2\2\u06ec\u06ed\3\2\2"+
		"\2\u06ed\u0143\3\2\2\2\u06ee\u06f1\5\u0146\u00a4\2\u06ef\u06f1\5\u0148"+
		"\u00a5\2\u06f0\u06ee\3\2\2\2\u06f0\u06ef\3\2\2\2\u06f1\u0145\3\2\2\2\u06f2"+
		"\u06f3\7b\2\2\u06f3\u06f4\5\u01ae\u00d8\2\u06f4\u0147\3\2\2\2\u06f5\u06f6"+
		"\5\u0134\u009b\2\u06f6\u06f7\7c\2\2\u06f7\u06f8\5\u01ae\u00d8\2\u06f8"+
		"\u0149\3\2\2\2\u06f9\u06fa\5\u0158\u00ad\2\u06fa\u014b\3\2\2\2\u06fb\u06fc"+
		"\7d\2\2\u06fc\u06fe\5\u014e\u00a8\2\u06fd\u06ff\5\u0150\u00a9\2\u06fe"+
		"\u06fd\3\2\2\2\u06fe\u06ff\3\2\2\2\u06ff\u014d\3\2\2\2\u0700\u0701\5\u01f2"+
		"\u00fa\2\u0701\u014f\3\2\2\2\u0702\u0704\7\36\2\2\u0703\u0705\5\u0154"+
		"\u00ab\2\u0704\u0703\3\2\2\2\u0704\u0705\3\2\2\2\u0705\u0706\3\2\2\2\u0706"+
		"\u0707\7\37\2\2\u0707\u0151\3\2\2\2\u0708\u070a\5\u014c\u00a7\2\u0709"+
		"\u0708\3\2\2\2\u070a\u070b\3\2\2\2\u070b\u0709\3\2\2\2\u070b\u070c\3\2"+
		"\2\2\u070c\u0153\3\2\2\2\u070d\u070f\5\u0156\u00ac\2\u070e\u070d\3\2\2"+
		"\2\u070f\u0710\3\2\2\2\u0710\u070e\3\2\2\2\u0710\u0711\3\2\2\2\u0711\u0155"+
		"\3\2\2\2\u0712\u0714\7\36\2\2\u0713\u0715\5\u0154\u00ab\2\u0714\u0713"+
		"\3\2\2\2\u0714\u0715\3\2\2\2\u0715\u0716\3\2\2\2\u0716\u0734\7\37\2\2"+
		"\u0717\u0719\7e\2\2\u0718\u071a\5\u0154\u00ab\2\u0719\u0718\3\2\2\2\u0719"+
		"\u071a\3\2\2\2\u071a\u071b\3\2\2\2\u071b\u0734\7f\2\2\u071c\u071e\7\16"+
		"\2\2\u071d\u071f\5\u0154\u00ab\2\u071e\u071d\3\2\2\2\u071e\u071f\3\2\2"+
		"\2\u071f\u0720\3\2\2\2\u0720\u0734\7\17\2\2\u0721\u0734\5\u01f2\u00fa"+
		"\2\u0722\u0734\5\u0158\u00ad\2\u0723\u0734\5\u01f6\u00fc\2\u0724\u0734"+
		"\5\u01fc\u00ff\2\u0725\u0734\5\u01a6\u00d4\2\u0726\u0734\7\u0097\2\2\u0727"+
		"\u0734\5X-\2\u0728\u0734\7\4\2\2\u0729\u0734\7\3\2\2\u072a\u0734\7\20"+
		"\2\2\u072b\u0734\7X\2\2\u072c\u0734\7)\2\2\u072d\u0734\7*\2\2\u072e\u0734"+
		"\7g\2\2\u072f\u0734\7h\2\2\u0730\u0734\7i\2\2\u0731\u0734\7P\2\2\u0732"+
		"\u0734\7j\2\2\u0733\u0712\3\2\2\2\u0733\u0717\3\2\2\2\u0733\u071c\3\2"+
		"\2\2\u0733\u0721\3\2\2\2\u0733\u0722\3\2\2\2\u0733\u0723\3\2\2\2\u0733"+
		"\u0724\3\2\2\2\u0733\u0725\3\2\2\2\u0733\u0726\3\2\2\2\u0733\u0727\3\2"+
		"\2\2\u0733\u0728\3\2\2\2\u0733\u0729\3\2\2\2\u0733\u072a\3\2\2\2\u0733"+
		"\u072b\3\2\2\2\u0733\u072c\3\2\2\2\u0733\u072d\3\2\2\2\u0733\u072e\3\2"+
		"\2\2\u0733\u072f\3\2\2\2\u0733\u0730\3\2\2\2\u0733\u0731\3\2\2\2\u0733"+
		"\u0732\3\2\2\2\u0734\u0157\3\2\2\2\u0735\u0737\5\u015e\u00b0\2\u0736\u0735"+
		"\3\2\2\2\u0736\u0737\3\2\2\2\u0737\u0738\3\2\2\2\u0738\u073c\5\u015a\u00ae"+
		"\2\u0739\u073b\5\u0160\u00b1\2\u073a\u0739\3\2\2\2\u073b\u073e\3\2\2\2"+
		"\u073c\u073a\3\2\2\2\u073c\u073d\3\2\2\2\u073d\u0159\3\2\2\2\u073e\u073c"+
		"\3\2\2\2\u073f\u0741\5\u01aa\u00d6\2\u0740\u073f\3\2\2\2\u0740\u0741\3"+
		"\2\2\2\u0741\u0742\3\2\2\2\u0742\u0744\5\u019c\u00cf\2\u0743\u0745\7\3"+
		"\2\2\u0744\u0743\3\2\2\2\u0744\u0745\3\2\2\2\u0745\u0748\3\2\2\2\u0746"+
		"\u0748\5\u015c\u00af\2\u0747\u0740\3\2\2\2\u0747\u0746\3\2\2\2\u0748\u015b"+
		"\3\2\2\2\u0749\u074a\7k\2\2\u074a\u074b\5\u01f2\u00fa\2\u074b\u015d\3"+
		"\2\2\2\u074c\u074e\7l\2\2\u074d\u074f\t\6\2\2\u074e\u074d\3\2\2\2\u074e"+
		"\u074f\3\2\2\2\u074f\u015f\3\2\2\2\u0750\u0751\5\u01a8\u00d5\2\u0751\u0752"+
		"\5\u015a\u00ae\2\u0752\u0761\3\2\2\2\u0753\u0755\5\u0162\u00b2\2\u0754"+
		"\u0756\5\u015e\u00b0\2\u0755\u0754\3\2\2\2\u0755\u0756\3\2\2\2\u0756\u0757"+
		"\3\2\2\2\u0757\u0758\5\u015a\u00ae\2\u0758\u0761\3\2\2\2\u0759\u075b\5"+
		"\u0164\u00b3\2\u075a\u075c\5\u015e\u00b0\2\u075b\u075a\3\2\2\2\u075b\u075c"+
		"\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u075e\5\u015a\u00ae\2\u075e\u0761\3"+
		"\2\2\2\u075f\u0761\5\u0166\u00b4\2\u0760\u0750\3\2\2\2\u0760\u0753\3\2"+
		"\2\2\u0760\u0759\3\2\2\2\u0760\u075f\3\2\2\2\u0761\u0161\3\2\2\2\u0762"+
		"\u0763\7I\2\2\u0763\u0163\3\2\2\2\u0764\u0766\7W\2\2\u0765\u0767\5\u015e"+
		"\u00b0\2\u0766\u0765\3\2\2\2\u0766\u0767\3\2\2\2\u0767\u0768\3\2\2\2\u0768"+
		"\u0769\5\u0158\u00ad\2\u0769\u076a\7\4\2\2\u076a\u0165\3\2\2\2\u076b\u076c"+
		"\7b\2\2\u076c\u0776\5\u01ae\u00d8\2\u076d\u076e\7c\2\2\u076e\u076f\7W"+
		"\2\2\u076f\u0776\5\u01ae\u00d8\2\u0770\u0771\7c\2\2\u0771\u0776\5\u01ae"+
		"\u00d8\2\u0772\u0773\7c\2\2\u0773\u0774\7X\2\2\u0774\u0776\5\u01ae\u00d8"+
		"\2\u0775\u076b\3\2\2\2\u0775\u076d\3\2\2\2\u0775\u0770\3\2\2\2\u0775\u0772"+
		"\3\2\2\2\u0776\u0167\3\2\2\2\u0777\u077a\5\u01f2\u00fa\2\u0778\u077a\5"+
		"\u01a6\u00d4\2\u0779\u0777\3\2\2\2\u0779\u0778\3\2\2\2\u077a\u077c\3\2"+
		"\2\2\u077b\u077d\5n8\2\u077c\u077b\3\2\2\2\u077c\u077d\3\2\2\2\u077d\u0787"+
		"\3\2\2\2\u077e\u0787\5\u016a\u00b6\2\u077f\u0787\5\u0178\u00bd\2\u0780"+
		"\u0787\5\u017a\u00be\2\u0781\u0787\5\u0182\u00c2\2\u0782\u0787\5\u0190"+
		"\u00c9\2\u0783\u0787\5\u018e\u00c8\2\u0784\u0787\5\u0198\u00cd\2\u0785"+
		"\u0787\5\u019a\u00ce\2\u0786\u0779\3\2\2\2\u0786\u077e\3\2\2\2\u0786\u077f"+
		"\3\2\2\2\u0786\u0780\3\2\2\2\u0786\u0781\3\2\2\2\u0786\u0782\3\2\2\2\u0786"+
		"\u0783\3\2\2\2\u0786\u0784\3\2\2\2\u0786\u0785\3\2\2\2\u0787\u0169\3\2"+
		"\2\2\u0788\u0790\5\u01fc\u00ff\2\u0789\u0790\5\u016c\u00b7\2\u078a\u0790"+
		"\5\u0172\u00ba\2\u078b\u0790\7m\2\2\u078c\u0790\7n\2\2\u078d\u0790\7o"+
		"\2\2\u078e\u0790\7p\2\2\u078f\u0788\3\2\2\2\u078f\u0789\3\2\2\2\u078f"+
		"\u078a\3\2\2\2\u078f\u078b\3\2\2\2\u078f\u078c\3\2\2\2\u078f\u078d\3\2"+
		"\2\2\u078f\u078e\3\2\2\2\u0790\u016b\3\2\2\2\u0791\u0793\7e\2\2\u0792"+
		"\u0794\5\u016e\u00b8\2\u0793\u0792\3\2\2\2\u0793\u0794\3\2\2\2\u0794\u0795"+
		"\3\2\2\2\u0795\u0796\7f\2\2\u0796\u016d\3\2\2\2\u0797\u079c\5\u0170\u00b9"+
		"\2\u0798\u0799\7\20\2\2\u0799\u079b\5\u0170\u00b9\2\u079a\u0798\3\2\2"+
		"\2\u079b\u079e\3\2\2\2\u079c\u079a\3\2\2\2\u079c\u079d\3\2\2\2\u079d\u07a0"+
		"\3\2\2\2\u079e\u079c\3\2\2\2\u079f\u07a1\7\20\2\2\u07a0\u079f\3\2\2\2"+
		"\u07a0\u07a1\3\2\2\2\u07a1\u016f\3\2\2\2\u07a2\u07a3\5\u0158\u00ad\2\u07a3"+
		"\u0171\3\2\2\2\u07a4\u07a5\7e\2\2\u07a5\u07a6\5\u0174\u00bb\2\u07a6\u07a7"+
		"\7f\2\2\u07a7\u07ac\3\2\2\2\u07a8\u07a9\7e\2\2\u07a9\u07aa\7\4\2\2\u07aa"+
		"\u07ac\7f\2\2\u07ab\u07a4\3\2\2\2\u07ab\u07a8\3\2\2\2\u07ac\u0173\3\2"+
		"\2\2\u07ad\u07b2\5\u0176\u00bc\2\u07ae\u07af\7\20\2\2\u07af\u07b1\5\u0176"+
		"\u00bc\2\u07b0\u07ae\3\2\2\2\u07b1\u07b4\3\2\2\2\u07b2\u07b0\3\2\2\2\u07b2"+
		"\u07b3\3\2\2\2\u07b3\u07b6\3\2\2\2\u07b4\u07b2\3\2\2\2\u07b5\u07b7\7\20"+
		"\2\2\u07b6\u07b5\3\2\2\2\u07b6\u07b7\3\2\2\2\u07b7\u0175\3\2\2\2\u07b8"+
		"\u07b9\5\u0158\u00ad\2\u07b9\u07ba\7\4\2\2\u07ba\u07bb\5\u0158\u00ad\2"+
		"\u07bb\u0177\3\2\2\2\u07bc\u07c9\7q\2\2\u07bd\u07be\7q\2\2\u07be\u07bf"+
		"\7H\2\2\u07bf\u07c9\5\u01f2\u00fa\2\u07c0\u07c1\7q\2\2\u07c1\u07c2\7e"+
		"\2\2\u07c2\u07c3\5\u0192\u00ca\2\u07c3\u07c4\7f\2\2\u07c4\u07c9\3\2\2"+
		"\2\u07c5\u07c6\7q\2\2\u07c6\u07c7\7H\2\2\u07c7\u07c9\7V\2\2\u07c8\u07bc"+
		"\3\2\2\2\u07c8\u07bd\3\2\2\2\u07c8\u07c0\3\2\2\2\u07c8\u07c5\3\2\2\2\u07c9"+
		"\u0179\3\2\2\2\u07ca\u07ce\5\u017c\u00bf\2\u07cb\u07ce\5\u017e\u00c0\2"+
		"\u07cc\u07ce\5\u0180\u00c1\2\u07cd\u07ca\3\2\2\2\u07cd\u07cb\3\2\2\2\u07cd"+
		"\u07cc\3\2\2\2\u07ce\u017b\3\2\2\2\u07cf\u07d0\7r\2\2\u07d0\u07d1\7H\2"+
		"\2\u07d1\u07d2\5\u01f2\u00fa\2\u07d2\u017d\3\2\2\2\u07d3\u07d4\7r\2\2"+
		"\u07d4\u07d5\7e\2\2\u07d5\u07d6\5\u0192\u00ca\2\u07d6\u07d7\7f\2\2\u07d7"+
		"\u017f\3\2\2\2\u07d8\u07d9\7r\2\2\u07d9\u07da\7H\2\2\u07da\u07db\7V\2"+
		"\2\u07db\u0181\3\2\2\2\u07dc\u07de\7\16\2\2\u07dd\u07df\5\u0184\u00c3"+
		"\2\u07de\u07dd\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u07e1\3\2\2\2\u07e0\u07e2"+
		"\5\6\4\2\u07e1\u07e0\3\2\2\2\u07e1\u07e2\3\2\2\2\u07e2\u07e3\3\2\2\2\u07e3"+
		"\u07e4\7\17\2\2\u07e4\u0183\3\2\2\2\u07e5\u07e7\5\u00c0a\2\u07e6\u07e8"+
		"\5\u00bc_\2\u07e7\u07e6\3\2\2\2\u07e7\u07e8\3\2\2\2\u07e8\u07e9\3\2\2"+
		"\2\u07e9\u07ea\7\7\2\2\u07ea\u0803\3\2\2\2\u07eb\u07ed\5\u01f8\u00fd\2"+
		"\u07ec\u07ee\5\u00bc_\2\u07ed\u07ec\3\2\2\2\u07ed\u07ee\3\2\2\2\u07ee"+
		"\u07ef\3\2\2\2\u07ef\u07f0\7\7\2\2\u07f0\u0803\3\2\2\2\u07f1\u07f2\5\u0186"+
		"\u00c4\2\u07f2\u07f4\5\u00c0a\2\u07f3\u07f5\5\u00bc_\2\u07f4\u07f3\3\2"+
		"\2\2\u07f4\u07f5\3\2\2\2\u07f5\u07f6\3\2\2\2\u07f6\u07f7\7\7\2\2\u07f7"+
		"\u0803\3\2\2\2\u07f8\u07f9\5\u0186\u00c4\2\u07f9\u07fb\5\u01f8\u00fd\2"+
		"\u07fa\u07fc\5\u00bc_\2\u07fb\u07fa\3\2\2\2\u07fb\u07fc\3\2\2\2\u07fc"+
		"\u07fd\3\2\2\2\u07fd\u07fe\7\7\2\2\u07fe\u0803\3\2\2\2\u07ff\u0800\5\u0186"+
		"\u00c4\2\u0800\u0801\7\7\2\2\u0801\u0803\3\2\2\2\u0802\u07e5\3\2\2\2\u0802"+
		"\u07eb\3\2\2\2\u0802\u07f1\3\2\2\2\u0802\u07f8\3\2\2\2\u0802\u07ff\3\2"+
		"\2\2\u0803\u0185\3\2\2\2\u0804\u0805\7e\2\2\u0805\u0806\5\u0188\u00c5"+
		"\2\u0806\u0807\7f\2\2\u0807\u0187\3\2\2\2\u0808\u080d\5\u018a\u00c6\2"+
		"\u0809\u080a\7\20\2\2\u080a\u080c\5\u018a\u00c6\2\u080b\u0809\3\2\2\2"+
		"\u080c\u080f\3\2\2\2\u080d\u080b\3\2\2\2\u080d\u080e\3\2\2\2\u080e\u0189"+
		"\3\2\2\2\u080f\u080d\3\2\2\2\u0810\u0812\5\u018c\u00c7\2\u0811\u0810\3"+
		"\2\2\2\u0811\u0812\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u0814\5\u0158\u00ad"+
		"\2\u0814\u018b\3\2\2\2\u0815\u0816\t\b\2\2\u0816\u018d\3\2\2\2\u0817\u0818"+
		"\7H\2\2\u0818\u0819\5\u01f2\u00fa\2\u0819\u018f\3\2\2\2\u081a\u081c\7"+
		"\36\2\2\u081b\u081d\5\u0192\u00ca\2\u081c\u081b\3\2\2\2\u081c\u081d\3"+
		"\2\2\2\u081d\u081e\3\2\2\2\u081e\u081f\7\37\2\2\u081f\u0191\3\2\2\2\u0820"+
		"\u0825\5\u0194\u00cb\2\u0821\u0822\7\20\2\2\u0822\u0824\5\u0194\u00cb"+
		"\2\u0823\u0821\3\2\2\2\u0824\u0827\3\2\2\2\u0825\u0823\3\2\2\2\u0825\u0826"+
		"\3\2\2\2\u0826\u0193\3\2\2\2\u0827\u0825\3\2\2\2\u0828\u082e\5\u0158\u00ad"+
		"\2\u0829\u082a\5\u0196\u00cc\2\u082a\u082b\7\4\2\2\u082b\u082c\5\u0158"+
		"\u00ad\2\u082c\u082e\3\2\2\2\u082d\u0828\3\2\2\2\u082d\u0829\3\2\2\2\u082e"+
		"\u0195\3\2\2\2\u082f\u0832\5\u01f2\u00fa\2\u0830\u0832\5\u01f4\u00fb\2"+
		"\u0831\u082f\3\2\2\2\u0831\u0830\3\2\2\2\u0832\u0197\3\2\2\2\u0833\u0834"+
		"\7S\2\2\u0834\u0199\3\2\2\2\u0835\u0836\7u\2\2\u0836\u0837\7\36\2\2\u0837"+
		"\u0838\5\u0158\u00ad\2\u0838\u0839\7\37\2\2\u0839\u019b\3\2\2\2\u083a"+
		"\u083b\b\u00cf\1\2\u083b\u083c\5\u0168\u00b5\2\u083c\u0871\3\2\2\2\u083d"+
		"\u083e\f\17\2\2\u083e\u0870\7X\2\2\u083f\u0840\f\16\2\2\u0840\u0870\7"+
		"W\2\2\u0841\u0842\f\r\2\2\u0842\u0870\5\u01ac\u00d7\2\u0843\u0845\f\f"+
		"\2\2\u0844\u0846\5\u0190\u00c9\2\u0845\u0844\3\2\2\2\u0845\u0846\3\2\2"+
		"\2\u0846\u0847\3\2\2\2\u0847\u0870\5\u0182\u00c2\2\u0848\u0849\f\13\2"+
		"\2\u0849\u0870\5\u0190\u00c9\2\u084a\u084b\f\n\2\2\u084b\u084c\7H\2\2"+
		"\u084c\u0870\7V\2\2\u084d\u084e\f\t\2\2\u084e\u084f\7H\2\2\u084f\u0850"+
		"\7V\2\2\u0850\u0851\7\36\2\2\u0851\u0852\5\u019e\u00d0\2\u0852\u0853\7"+
		"\37\2\2\u0853\u0870\3\2\2\2\u0854\u0855\f\b\2\2\u0855\u0856\7H\2\2\u0856"+
		"\u0870\7\u0094\2\2\u0857\u0858\f\7\2\2\u0858\u0859\7H\2\2\u0859\u085b"+
		"\5\u01f2\u00fa\2\u085a\u085c\5n8\2\u085b\u085a\3\2\2\2\u085b\u085c\3\2"+
		"\2\2\u085c\u0870\3\2\2\2\u085d\u085e\f\6\2\2\u085e\u085f\7H\2\2\u085f"+
		"\u0860\5\u01f2\u00fa\2\u0860\u0861\7\36\2\2\u0861\u0862\5\u019e\u00d0"+
		"\2\u0862\u0863\7\37\2\2\u0863\u0870\3\2\2\2\u0864\u0865\f\5\2\2\u0865"+
		"\u0866\7H\2\2\u0866\u0870\7q\2\2\u0867\u0868\f\4\2\2\u0868\u0869\7H\2"+
		"\2\u0869\u0870\7v\2\2\u086a\u086b\f\3\2\2\u086b\u086c\7e\2\2\u086c\u086d"+
		"\5\u0192\u00ca\2\u086d\u086e\7f\2\2\u086e\u0870\3\2\2\2\u086f\u083d\3"+
		"\2\2\2\u086f\u083f\3\2\2\2\u086f\u0841\3\2\2\2\u086f\u0843\3\2\2\2\u086f"+
		"\u0848\3\2\2\2\u086f\u084a\3\2\2\2\u086f\u084d\3\2\2\2\u086f\u0854\3\2"+
		"\2\2\u086f\u0857\3\2\2\2\u086f\u085d\3\2\2\2\u086f\u0864\3\2\2\2\u086f"+
		"\u0867\3\2\2\2\u086f\u086a\3\2\2\2\u0870\u0873\3\2\2\2\u0871\u086f\3\2"+
		"\2\2\u0871\u0872\3\2\2\2\u0872\u019d\3\2\2\2\u0873\u0871\3\2\2\2\u0874"+
		"\u0876\5\u01a0\u00d1\2\u0875\u0874\3\2\2\2\u0876\u0877\3\2\2\2\u0877\u0875"+
		"\3\2\2\2\u0877\u0878\3\2\2\2\u0878\u019f\3\2\2\2\u0879\u087c\5\u01f2\u00fa"+
		"\2\u087a\u087c\7S\2\2\u087b\u0879\3\2\2\2\u087b\u087a\3\2\2\2\u087c\u087d"+
		"\3\2\2\2\u087d\u087e\7\4\2\2\u087e\u01a1\3\2\2\2\u087f\u0880\t\t\2\2\u0880"+
		"\u01a3\3\2\2\2\u0881\u0884\5\u01a2\u00d2\2\u0882\u0884\7\u008e\2\2\u0883"+
		"\u0881\3\2\2\2\u0883\u0882\3\2\2\2\u0884\u01a5\3\2\2\2\u0885\u0889\5\u01a2"+
		"\u00d2\2\u0886\u0888\5\u01a4\u00d3\2\u0887\u0886\3\2\2\2\u0888\u088b\3"+
		"\2\2\2\u0889\u0887\3\2\2\2\u0889\u088a\3\2\2\2\u088a\u0895\3\2\2\2\u088b"+
		"\u0889\3\2\2\2\u088c\u0890\7\u008f\2\2\u088d\u088f\5\u01a4\u00d3\2\u088e"+
		"\u088d\3\2\2\2\u088f\u0892\3\2\2\2\u0890\u088e\3\2\2\2\u0890\u0891\3\2"+
		"\2\2\u0891\u0895\3\2\2\2\u0892\u0890\3\2\2\2\u0893\u0895\7P\2\2\u0894"+
		"\u0885\3\2\2\2\u0894\u088c\3\2\2\2\u0894\u0893\3\2\2\2\u0895\u01a7\3\2"+
		"\2\2\u0896\u0897\5\u01a6\u00d4\2\u0897\u01a9\3\2\2\2\u0898\u0899\5\u01a6"+
		"\u00d4\2\u0899\u01ab\3\2\2\2\u089a\u089b\5\u01a6\u00d4\2\u089b\u01ad\3"+
		"\2\2\2\u089c\u089d\b\u00d8\1\2\u089d\u08a3\5\u01b0\u00d9\2\u089e\u08a3"+
		"\5\u01b2\u00da\2\u089f\u08a3\5\u01ba\u00de\2\u08a0\u08a3\5\u01be\u00e0"+
		"\2\u08a1\u08a3\5\u01c8\u00e5\2\u08a2\u089c\3\2\2\2\u08a2\u089e\3\2\2\2"+
		"\u08a2\u089f\3\2\2\2\u08a2\u08a0\3\2\2\2\u08a2\u08a1\3\2\2\2\u08a3\u08ba"+
		"\3\2\2\2\u08a4\u08a6\f\13\2\2\u08a5\u08a7\7M\2\2\u08a6\u08a5\3\2\2\2\u08a6"+
		"\u08a7\3\2\2\2\u08a7\u08a8\3\2\2\2\u08a8\u08a9\7O\2\2\u08a9\u08b9\5\u01ae"+
		"\u00d8\f\u08aa\u08ab\f\n\2\2\u08ab\u08ac\7N\2\2\u08ac\u08ad\7O\2\2\u08ad"+
		"\u08b9\5\u01ae\u00d8\13\u08ae\u08af\f\7\2\2\u08af\u08b9\7W\2\2\u08b0\u08b1"+
		"\f\6\2\2\u08b1\u08b9\7X\2\2\u08b2\u08b3\f\4\2\2\u08b3\u08b4\7H\2\2\u08b4"+
		"\u08b9\7|\2\2\u08b5\u08b6\f\3\2\2\u08b6\u08b7\7H\2\2\u08b7\u08b9\7}\2"+
		"\2\u08b8\u08a4\3\2\2\2\u08b8\u08aa\3\2\2\2\u08b8\u08ae\3\2\2\2\u08b8\u08b0"+
		"\3\2\2\2\u08b8\u08b2\3\2\2\2\u08b8\u08b5\3\2\2\2\u08b9\u08bc\3\2\2\2\u08ba"+
		"\u08b8\3\2\2\2\u08ba\u08bb\3\2\2\2\u08bb\u01af\3\2\2\2\u08bc\u08ba\3\2"+
		"\2\2\u08bd\u08be\7e\2\2\u08be\u08bf\5\u01ae\u00d8\2\u08bf\u08c0\7f\2\2"+
		"\u08c0\u01b1\3\2\2\2\u08c1\u08c2\7e\2\2\u08c2\u08c3\5\u01ae\u00d8\2\u08c3"+
		"\u08c4\7\4\2\2\u08c4\u08c5\5\u01ae\u00d8\2\u08c5\u08c6\7f\2\2\u08c6\u01b3"+
		"\3\2\2\2\u08c7\u08c8\5\u01ae\u00d8\2\u08c8\u08c9\7W\2\2\u08c9\u01b5\3"+
		"\2\2\2\u08ca\u08cb\5\u01ae\u00d8\2\u08cb\u08cc\7X\2\2\u08cc\u01b7\3\2"+
		"\2\2\u08cd\u08cf\7\4\2\2\u08ce\u08d0\5\u0152\u00aa\2\u08cf\u08ce\3\2\2"+
		"\2\u08cf\u08d0\3\2\2\2\u08d0\u08d1\3\2\2\2\u08d1\u08d2\5\u01ae\u00d8\2"+
		"\u08d2\u01b9\3\2\2\2\u08d3\u08d5\5\u01bc\u00df\2\u08d4\u08d6\5n8\2\u08d5"+
		"\u08d4\3\2\2\2\u08d5\u08d6\3\2\2\2\u08d6\u08e0\3\2\2\2\u08d7\u08d9\5\u01bc"+
		"\u00df\2\u08d8\u08da\5n8\2\u08d9\u08d8\3\2\2\2\u08d9\u08da\3\2\2\2\u08da"+
		"\u08db\3\2\2\2\u08db\u08dc\7H\2\2\u08dc\u08dd\5\u01ba\u00de\2\u08dd\u08e0"+
		"\3\2\2\2\u08de\u08e0\7~\2\2\u08df\u08d3\3\2\2\2\u08df\u08d7\3\2\2\2\u08df"+
		"\u08de\3\2\2\2\u08e0\u01bb\3\2\2\2\u08e1\u08e2\5\u01f2\u00fa\2\u08e2\u01bd"+
		"\3\2\2\2\u08e3\u08e5\7\36\2\2\u08e4\u08e6\5\u01c0\u00e1\2\u08e5\u08e4"+
		"\3\2\2\2\u08e5\u08e6\3\2\2\2\u08e6\u08e7\3\2\2\2\u08e7\u08e8\7\37\2\2"+
		"\u08e8\u01bf\3\2\2\2\u08e9\u08eb\5\u01c2\u00e2\2\u08ea\u08ec\7P\2\2\u08eb"+
		"\u08ea\3\2\2\2\u08eb\u08ec\3\2\2\2\u08ec\u01c1\3\2\2\2\u08ed\u08f2\5\u01c4"+
		"\u00e3\2\u08ee\u08ef\7\20\2\2\u08ef\u08f1\5\u01c4\u00e3\2\u08f0\u08ee"+
		"\3\2\2\2\u08f1\u08f4\3\2\2\2\u08f2\u08f0\3\2\2\2\u08f2\u08f3\3\2\2\2\u08f3"+
		"\u01c3\3\2\2\2\u08f4\u08f2\3\2\2\2\u08f5\u08f7\5\u0152\u00aa\2\u08f6\u08f5"+
		"\3\2\2\2\u08f6\u08f7\3\2\2\2\u08f7\u08f9\3\2\2\2\u08f8\u08fa\7Q\2\2\u08f9"+
		"\u08f8\3\2\2\2\u08f9\u08fa\3\2\2\2\u08fa\u08fb\3\2\2\2\u08fb\u0903\5\u01ae"+
		"\u00d8\2\u08fc\u08fe\7Q\2\2\u08fd\u08fc\3\2\2\2\u08fd\u08fe\3\2\2\2\u08fe"+
		"\u08ff\3\2\2\2\u08ff\u0900\5\u01c6\u00e4\2\u0900\u0901\5\u01b8\u00dd\2"+
		"\u0901\u0903\3\2\2\2\u0902\u08f6\3\2\2\2\u0902\u08fd\3\2\2\2\u0903\u01c5"+
		"\3\2\2\2\u0904\u0905\5\u01f2\u00fa\2\u0905\u01c7\3\2\2\2\u0906\u0907\7"+
		"F\2\2\u0907\u0909\7)\2\2\u0908\u090a\5\u01ca\u00e6\2\u0909\u0908\3\2\2"+
		"\2\u0909\u090a\3\2\2\2\u090a\u090b\3\2\2\2\u090b\u090c\7*\2\2\u090c\u01c9"+
		"\3\2\2\2\u090d\u0912\5\u01cc\u00e7\2\u090e\u090f\7\20\2\2\u090f\u0911"+
		"\5\u01cc\u00e7\2\u0910\u090e\3\2\2\2\u0911\u0914\3\2\2\2\u0912\u0910\3"+
		"\2\2\2\u0912\u0913\3\2\2\2\u0913\u01cb\3\2\2\2\u0914\u0912\3\2\2\2\u0915"+
		"\u0916\5\u01ba\u00de\2\u0916\u01cd\3\2\2\2\u0917\u0918\5\u01ae\u00d8\2"+
		"\u0918\u0919\7H\2\2\u0919\u091a\7|\2\2\u091a\u0920\3\2\2\2\u091b\u091c"+
		"\5\u01ae\u00d8\2\u091c\u091d\7H\2\2\u091d\u091e\7}\2\2\u091e\u0920\3\2"+
		"\2\2\u091f\u0917\3\2\2\2\u091f\u091b\3\2\2\2\u0920\u01cf\3\2\2\2\u0921"+
		"\u0922\7\4\2\2\u0922\u0923\5\u01d4\u00eb\2\u0923\u0924\7\20\2\2\u0924"+
		"\u0925\5\u01d2\u00ea\2\u0925\u092b\3\2\2\2\u0926\u0927\7\4\2\2\u0927\u092b"+
		"\5\u01d4\u00eb\2\u0928\u0929\7\4\2\2\u0929\u092b\5\u01d2\u00ea\2\u092a"+
		"\u0921\3\2\2\2\u092a\u0926\3\2\2\2\u092a\u0928\3\2\2\2\u092b\u01d1\3\2"+
		"\2\2\u092c\u0931\5\u01ba\u00de\2\u092d\u092e\7\20\2\2\u092e\u0930\5\u01ba"+
		"\u00de\2\u092f\u092d\3\2\2\2\u0930\u0933\3\2\2\2\u0931\u092f\3\2\2\2\u0931"+
		"\u0932\3\2\2\2\u0932\u01d3\3\2\2\2\u0933\u0931\3\2\2\2\u0934\u0935\7,"+
		"\2\2\u0935\u01d5\3\2\2\2\u0936\u0939\5\u01d8\u00ed\2\u0937\u0939\5\u01ec"+
		"\u00f7\2\u0938\u0936\3\2\2\2\u0938\u0937\3\2\2\2\u0939\u01d7\3\2\2\2\u093a"+
		"\u093b\7\177\2\2\u093b\u093d\5\u01e0\u00f1\2\u093c\u093e\5\6\4\2\u093d"+
		"\u093c\3\2\2\2\u093d\u093e\3\2\2\2\u093e\u0940\3\2\2\2\u093f\u0941\5\u01da"+
		"\u00ee\2\u0940\u093f\3\2\2\2\u0940\u0941\3\2\2\2\u0941\u0943\3\2\2\2\u0942"+
		"\u0944\5\u01de\u00f0\2\u0943\u0942\3\2\2\2\u0943\u0944\3\2\2\2\u0944\u0945"+
		"\3\2\2\2\u0945\u0946\7\u0080\2\2\u0946\u01d9\3\2\2\2\u0947\u0949\5\u01dc"+
		"\u00ef\2\u0948\u0947\3\2\2\2\u0949\u094a\3\2\2\2\u094a\u0948\3\2\2\2\u094a"+
		"\u094b\3\2\2\2\u094b\u01db\3\2\2\2\u094c\u094d\7\u0081\2\2\u094d\u094f"+
		"\5\u01e0\u00f1\2\u094e\u0950\5\6\4\2\u094f\u094e\3\2\2\2\u094f\u0950\3"+
		"\2\2\2\u0950\u01dd\3\2\2\2\u0951\u0953\7\u0082\2\2\u0952\u0954\5\6\4\2"+
		"\u0953\u0952\3\2\2\2\u0953\u0954\3\2\2\2\u0954\u01df\3\2\2\2\u0955\u0956"+
		"\b\u00f1\1\2\u0956\u0957\7X\2\2\u0957\u0961\5\u01e0\u00f1\4\u0958\u0961"+
		"\5\u01e2\u00f2\2\u0959\u0961\5\u01e4\u00f3\2\u095a\u0961\5\u01f2\u00fa"+
		"\2\u095b\u0961\5\u01fa\u00fe\2\u095c\u095d\7\36\2\2\u095d\u095e\5\u01e0"+
		"\u00f1\2\u095e\u095f\7\37\2\2\u095f\u0961\3\2\2\2\u0960\u0955\3\2\2\2"+
		"\u0960\u0958\3\2\2\2\u0960\u0959\3\2\2\2\u0960\u095a\3\2\2\2\u0960\u095b"+
		"\3\2\2\2\u0960\u095c\3\2\2\2\u0961\u0967\3\2\2\2\u0962\u0963\f\3\2\2\u0963"+
		"\u0964\t\n\2\2\u0964\u0966\5\u01e0\u00f1\4\u0965\u0962\3\2\2\2\u0966\u0969"+
		"\3\2\2\2\u0967\u0965\3\2\2\2\u0967\u0968\3\2\2\2\u0968\u01e1\3\2\2\2\u0969"+
		"\u0967\3\2\2\2\u096a\u096b\7\u0083\2\2\u096b\u096c\7\36\2\2\u096c\u096d"+
		"\5\u01e6\u00f4\2\u096d\u096e\7\37\2\2\u096e\u0975\3\2\2\2\u096f\u0970"+
		"\7\u0084\2\2\u0970\u0971\7\36\2\2\u0971\u0972\5\u01e8\u00f5\2\u0972\u0973"+
		"\7\37\2\2\u0973\u0975\3\2\2\2\u0974\u096a\3\2\2\2\u0974\u096f\3\2\2\2"+
		"\u0975\u01e3\3\2\2\2\u0976\u0977\7\u0085\2\2\u0977\u0978\7\36\2\2\u0978"+
		"\u0979\7{\2\2\u0979\u097a\5\u01ea\u00f6\2\u097a\u097b\7\37\2\2\u097b\u01e5"+
		"\3\2\2\2\u097c\u097d\t\13\2\2\u097d\u01e7\3\2\2\2\u097e\u097f\t\f\2\2"+
		"\u097f\u01e9\3\2\2\2\u0980\u0981\7\u0096\2\2\u0981\u01eb\3\2\2\2\u0982"+
		"\u0986\7n\2\2\u0983\u0984\5\u01ee\u00f8\2\u0984\u0985\5\u01f0\u00f9\2"+
		"\u0985\u0987\3\2\2\2\u0986\u0983\3\2\2\2\u0986\u0987\3\2\2\2\u0987\u01ed"+
		"\3\2\2\2\u0988\u0989\5\u0200\u0101\2\u0989\u01ef\3\2\2\2\u098a\u098b\7"+
		"\u0098\2\2\u098b\u01f1\3\2\2\2\u098c\u098f\7\u0090\2\2\u098d\u098f\5\u01f6"+
		"\u00fc\2\u098e\u098c\3\2\2\2\u098e\u098d\3\2\2\2\u098f\u01f3\3\2\2\2\u0990"+
		"\u0991\t\r\2\2\u0991\u01f5\3\2\2\2\u0992\u0993\t\16\2\2\u0993\u01f7\3"+
		"\2\2\2\u0994\u0997\5\u01f2\u00fa\2\u0995\u0997\7S\2\2\u0996\u0994\3\2"+
		"\2\2\u0996\u0995\3\2\2\2\u0997\u099f\3\2\2\2\u0998\u099b\7\20\2\2\u0999"+
		"\u099c\5\u01f2\u00fa\2\u099a\u099c\7S\2\2\u099b\u0999\3\2\2\2\u099b\u099a"+
		"\3\2\2\2\u099c\u099e\3\2\2\2\u099d\u0998\3\2\2\2\u099e\u09a1\3\2\2\2\u099f"+
		"\u099d\3\2\2\2\u099f\u09a0\3\2\2\2\u09a0\u01f9\3\2\2\2\u09a1\u099f\3\2"+
		"\2\2\u09a2\u09a3\7\u008b\2\2\u09a3\u01fb\3\2\2\2\u09a4\u09a9\5\u01fe\u0100"+
		"\2\u09a5\u09a9\7\u0098\2\2\u09a6\u09a9\7\u008b\2\2\u09a7\u09a9\7\u008c"+
		"\2\2\u09a8\u09a4\3\2\2\2\u09a8\u09a5\3\2\2\2\u09a8\u09a6\3\2\2\2\u09a8"+
		"\u09a7\3\2\2\2\u09a9\u01fd\3\2\2\2\u09aa\u09ac\7g\2\2\u09ab\u09aa\3\2"+
		"\2\2\u09ab\u09ac\3\2\2\2\u09ac\u09ad\3\2\2\2\u09ad\u09b3\5\u0200\u0101"+
		"\2\u09ae\u09b0\7g\2\2\u09af\u09ae\3\2\2\2\u09af\u09b0\3\2\2\2\u09b0\u09b1"+
		"\3\2\2\2\u09b1\u09b3\7\u0096\2\2\u09b2\u09ab\3\2\2\2\u09b2\u09af\3\2\2"+
		"\2\u09b3\u01ff\3\2\2\2\u09b4\u09b5\t\17\2\2\u09b5\u0201\3\2\2\2\u0138"+
		"\u0203\u0209\u020d\u0211\u0216\u021a\u021e\u0222\u0226\u0228\u022d\u0232"+
		"\u0236\u023c\u024c\u0252\u0258\u0263\u026a\u0278\u0283\u0288\u0293\u029f"+
		"\u02a3\u02a7\u02ad\u02b8\u02bc\u02c0\u02c3\u02d1\u02d8\u02de\u02e4\u02e9"+
		"\u02ec\u02f6\u02fd\u0304\u0315\u031c\u0325\u032e\u033a\u0344\u0349\u0353"+
		"\u0362\u0369\u036d";
	private static final String _serializedATNSegment1 =
		"\u0371\u0375\u0379\u037d\u0381\u0385\u0389\u038d\u0391\u0395\u0399\u039d"+
		"\u03a1\u03a3\u03a8\u03ad\u03c8\u03d9\u03de\u03e2\u03e7\u03eb\u03f6\u03fa"+
		"\u03fd\u0400\u040a\u040f\u0427\u0433\u0436\u0439\u0442\u044b\u044e\u0451"+
		"\u0457\u045a\u045e\u0469\u0472\u0475\u047a\u0481\u0488\u048c\u048f\u0493"+
		"\u0498\u049c\u04a4\u04a7\u04b4\u04bc\u04c0\u04c3\u04c6\u04cc\u04d0\u04d3"+
		"\u04d7\u04e2\u04e6\u04ed\u04f1\u04f4\u04f7\u04fa\u04fd\u0501\u0504\u0507"+
		"\u050b\u050e\u0512\u0515\u0518\u051c\u0522\u0527\u052b\u0531\u0534\u053a"+
		"\u053d\u0542\u0545\u0549\u0550\u0555\u0557\u055a\u055d\u0567\u056c\u0575"+
		"\u0578\u057c\u0583\u0587\u058a\u0594\u0599\u059f\u05a2\u05a7\u05aa\u05b2"+
		"\u05b7\u05ba\u05bf\u05c2\u05c8\u05cc\u05ce\u05d4\u05d9\u05dc\u05e1\u05e9"+
		"\u05ef\u05f3\u05f7\u05fb\u05ff\u0601\u0606\u0610\u0616\u061a\u0621\u0624"+
		"\u0629\u062c\u0630\u0634\u0639\u063c\u0640\u0645\u064b\u064e\u0654\u065a"+
		"\u066a\u066d\u0670\u0677\u067e\u0691\u0697\u069b\u069d\u06ac\u06b0\u06b5"+
		"\u06bb\u06c2\u06cd\u06d1\u06da\u06e2\u06e5\u06e8\u06ec\u06f0\u06fe\u0704"+
		"\u070b\u0710\u0714\u0719\u071e\u0733\u0736\u073c\u0740\u0744\u0747\u074e"+
		"\u0755\u075b\u0760\u0766\u0775\u0779\u077c\u0786\u078f\u0793\u079c\u07a0"+
		"\u07ab\u07b2\u07b6\u07c8\u07cd\u07de\u07e1\u07e7\u07ed\u07f4\u07fb\u0802"+
		"\u080d\u0811\u081c\u0825\u082d\u0831\u0845\u085b\u086f\u0871\u0877\u087b"+
		"\u0883\u0889\u0890\u0894\u08a2\u08a6\u08b8\u08ba\u08cf\u08d5\u08d9\u08df"+
		"\u08e5\u08eb\u08f2\u08f6\u08f9\u08fd\u0902\u0909\u0912\u091f\u092a\u0931"+
		"\u0938\u093d\u0940\u0943\u094a\u094f\u0953\u0960\u0967\u0974\u0986\u098e"+
		"\u0996\u099b\u099f\u09a8\u09ab\u09af\u09b2";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}