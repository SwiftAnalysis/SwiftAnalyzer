// Generated from Swift.g4 by ANTLR 4.7

package swiftanalysis.generated;

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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

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
		T__131=132, T__132=133, T__133=134, T__134=135, T__135=136, T__136=137, 
		T__137=138, T__138=139, T__139=140, T__140=141, T__141=142, T__142=143, 
		T__143=144, T__144=145, T__145=146, T__146=147, T__147=148, T__148=149, 
		T__149=150, T__150=151, T__151=152, T__152=153, T__153=154, T__154=155, 
		T__155=156, T__156=157, T__157=158, T__158=159, BooleanLiteral=160, NilLiteral=161, 
		OperatorHead=162, OperatorCharacter=163, DotOperatorHead=164, Identifier=165, 
		ImplicitParameterName=166, BinaryLiteral=167, OctalLiteral=168, DecimalLiteral=169, 
		HexadecimalLiteral=170, FloatingPointLiteral=171, VersionLiteral=172, 
		StringLiteral=173, EscapedCharacter=174, WS=175, BlockComment=176, LineComment=177;
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
		RULE_catchClause = 30, RULE_conditionList = 31, RULE_condition = 32, RULE_caseCondition = 33, 
		RULE_optionalBindingCondition = 34, RULE_whereClause = 35, RULE_whereExpression = 36, 
		RULE_availabilityCondition = 37, RULE_availabilityArguments = 38, RULE_availabilityArgument = 39, 
		RULE_platformName = 40, RULE_platformVersion = 41, RULE_genericParameterClause = 42, 
		RULE_genericParameterList = 43, RULE_genericParameter = 44, RULE_genericWhereClause = 45, 
		RULE_requirementList = 46, RULE_requirement = 47, RULE_conformanceRequirement = 48, 
		RULE_sameTypeRequirement = 49, RULE_genericArgumentClause = 50, RULE_genericArgumentList = 51, 
		RULE_genericArgument = 52, RULE_declaration = 53, RULE_declarations = 54, 
		RULE_declarationModifiers = 55, RULE_declarationModifier = 56, RULE_accessLevelModifier = 57, 
		RULE_accessLevelModifiers = 58, RULE_mutationModifier = 59, RULE_codeBlock = 60, 
		RULE_importDeclaration = 61, RULE_importKind = 62, RULE_importPath = 63, 
		RULE_importPathIdentifier = 64, RULE_constantDeclaration = 65, RULE_patternInitializerList = 66, 
		RULE_patternInitializer = 67, RULE_initializer = 68, RULE_variableDeclaration = 69, 
		RULE_variableDeclarationHead = 70, RULE_variableName = 71, RULE_getterSetterBlock = 72, 
		RULE_getterClause = 73, RULE_setterClause = 74, RULE_setterName = 75, 
		RULE_getterSetterKeywordBlock = 76, RULE_getterKeywordClause = 77, RULE_setterKeywordClause = 78, 
		RULE_willSetDidSetBlock = 79, RULE_willSetClause = 80, RULE_didSetClause = 81, 
		RULE_typealiasDeclaration = 82, RULE_typealiasHead = 83, RULE_typealiasName = 84, 
		RULE_typealiasAssignment = 85, RULE_functionDeclaration = 86, RULE_functionHead = 87, 
		RULE_functionName = 88, RULE_functionSignature = 89, RULE_functionResult = 90, 
		RULE_functionBody = 91, RULE_parameterClause = 92, RULE_parameterList = 93, 
		RULE_parameter = 94, RULE_externalParameterName = 95, RULE_localParameterName = 96, 
		RULE_defaultArgumentClause = 97, RULE_enumDeclaration = 98, RULE_enumDef = 99, 
		RULE_unionStyleEnum = 100, RULE_unionStyleEnumMembers = 101, RULE_unionStyleEnumMember = 102, 
		RULE_unionStyleEnumCaseClause = 103, RULE_unionStyleEnumCaseList = 104, 
		RULE_unionStyleEnumCase = 105, RULE_enumName = 106, RULE_enumCaseName = 107, 
		RULE_rawValueStyleEnum = 108, RULE_rawValueStyleEnumMembers = 109, RULE_rawValueStyleEnumMember = 110, 
		RULE_rawValueStyleEnumCaseClause = 111, RULE_rawValueStyleEnumCaseList = 112, 
		RULE_rawValueStyleEnumCase = 113, RULE_rawValueAssignment = 114, RULE_structDeclaration = 115, 
		RULE_structName = 116, RULE_structBody = 117, RULE_structMembers = 118, 
		RULE_structMember = 119, RULE_classDeclaration = 120, RULE_classDeclarationModifiers = 121, 
		RULE_className = 122, RULE_classBody = 123, RULE_classMembers = 124, RULE_classMember = 125, 
		RULE_protocolDeclaration = 126, RULE_protocolName = 127, RULE_protocolBody = 128, 
		RULE_protocolMembers = 129, RULE_protocolMember = 130, RULE_protocolMemberDeclaration = 131, 
		RULE_protocolPropertyDeclaration = 132, RULE_protocolMethodDeclaration = 133, 
		RULE_protocolInitializerDeclaration = 134, RULE_protocolSubscriptDeclaration = 135, 
		RULE_protocolAssociatedTypeDeclaration = 136, RULE_initializerDeclaration = 137, 
		RULE_initializerHead = 138, RULE_initializerBody = 139, RULE_deinitializerDeclaration = 140, 
		RULE_extensionDeclaration = 141, RULE_extensionBody = 142, RULE_extensionMembers = 143, 
		RULE_extensionMember = 144, RULE_subscriptDeclaration = 145, RULE_subscriptHead = 146, 
		RULE_subscriptResult = 147, RULE_operatorDeclaration = 148, RULE_prefixOperatorDeclaration = 149, 
		RULE_postfixOperatorDeclaration = 150, RULE_infixOperatorDeclaration = 151, 
		RULE_infixOperatorGroup = 152, RULE_precedenceGroupDeclaration = 153, 
		RULE_precedenceGroupAttributes = 154, RULE_precedenceGroupAttribute = 155, 
		RULE_precedenceGroupRelation = 156, RULE_precedenceGroupAssignment = 157, 
		RULE_precedenceGroupAssociativity = 158, RULE_precedenceGroupNames = 159, 
		RULE_precedenceGroupName = 160, RULE_pattern = 161, RULE_wildcardPattern = 162, 
		RULE_identifierPattern = 163, RULE_valueBindingPattern = 164, RULE_tuplePattern = 165, 
		RULE_tuplePatternElementList = 166, RULE_tuplePatternElement = 167, RULE_enumCasePattern = 168, 
		RULE_typeCastingPattern = 169, RULE_isPattern = 170, RULE_asPattern = 171, 
		RULE_expressionPattern = 172, RULE_attribute = 173, RULE_attributeName = 174, 
		RULE_attributeArgumentClause = 175, RULE_attributes = 176, RULE_balancedTokens = 177, 
		RULE_balancedToken = 178, RULE_expression = 179, RULE_prefixExpression = 180, 
		RULE_inOutExpression = 181, RULE_tryOperator = 182, RULE_binaryExpression = 183, 
		RULE_assignmentOperator = 184, RULE_conditionalOperator = 185, RULE_typeCastingOperator = 186, 
		RULE_primaryExpression = 187, RULE_literalExpression = 188, RULE_arrayLiteral = 189, 
		RULE_arrayLiteralItems = 190, RULE_arrayLiteralItem = 191, RULE_dictionaryLiteral = 192, 
		RULE_dictionaryLiteralItems = 193, RULE_dictionaryLiteralItem = 194, RULE_playgroundLiteral = 195, 
		RULE_selfExpression = 196, RULE_superclassExpression = 197, RULE_superclassMethodExpression = 198, 
		RULE_superclassSubscriptExpression = 199, RULE_superclassInitializerExpression = 200, 
		RULE_closureExpression = 201, RULE_closureSignature = 202, RULE_closureParameterClause = 203, 
		RULE_closureParameterList = 204, RULE_closureParameter = 205, RULE_closureParameterName = 206, 
		RULE_captureList = 207, RULE_captureListItems = 208, RULE_captureListItem = 209, 
		RULE_captureSpecifier = 210, RULE_implicitMemberExpression = 211, RULE_parenthesizedExpression = 212, 
		RULE_tupleExpression = 213, RULE_tupleElementList = 214, RULE_tupleElement = 215, 
		RULE_wildcardExpression = 216, RULE_selectorExpression = 217, RULE_keyPathExpression = 218, 
		RULE_postfixExpression = 219, RULE_functionCallArgumentClause = 220, RULE_functionCallArgumentList = 221, 
		RULE_functionCallArgument = 222, RULE_functionCallIdentifier = 223, RULE_argumentNames = 224, 
		RULE_argumentName = 225, RULE_operatorHead = 226, RULE_operatorCharacter = 227, 
		RULE_operator = 228, RULE_binaryOperator = 229, RULE_prefixOperator = 230, 
		RULE_postfixOperator = 231, RULE_sType = 232, RULE_functionType = 233, 
		RULE_functionTypeArgumentClause = 234, RULE_functionTypeArgumentList = 235, 
		RULE_functionTypeArgument = 236, RULE_argumentLabel = 237, RULE_arrayType = 238, 
		RULE_dictionaryType = 239, RULE_optionalType = 240, RULE_implicitlyUnwrappedOptionalType = 241, 
		RULE_typeAnnotation = 242, RULE_typeIdentifier = 243, RULE_typeName = 244, 
		RULE_tupleType = 245, RULE_tupleTypeElementList = 246, RULE_tupleTypeElement = 247, 
		RULE_elementName = 248, RULE_protocolCompositionType = 249, RULE_protocolCompositionContinuation = 250, 
		RULE_protocolIdentifier = 251, RULE_metatypeType = 252, RULE_typeInheritanceClause = 253, 
		RULE_typeInheritanceList = 254, RULE_classRequirement = 255, RULE_compilerControlStatement = 256, 
		RULE_conditionalCompilationBlock = 257, RULE_ifDirectiveClause = 258, 
		RULE_elseifDirectiveClauses = 259, RULE_elseifDirectiveClause = 260, RULE_elseDirectiveClause = 261, 
		RULE_compilationCondition = 262, RULE_platformCondition = 263, RULE_operatingSystem = 264, 
		RULE_architecture = 265, RULE_swiftVersion = 266, RULE_lineControlStatement = 267, 
		RULE_lineNumber = 268, RULE_fileName = 269, RULE_identifier = 270, RULE_keyword = 271, 
		RULE_contextSensitiveKeyword = 272, RULE_grammarString = 273, RULE_identifierList = 274, 
		RULE_booleanLiteral = 275, RULE_literal = 276, RULE_numericLiteral = 277, 
		RULE_integerLiteral = 278;
	public static final String[] ruleNames = {
		"topLevel", "statement", "statements", "loopStatement", "forInStatement", 
		"whileStatement", "repeatWhileStatement", "branchStatement", "ifStatement", 
		"elseClause", "guardStatement", "switchStatement", "switchCases", "switchCase", 
		"caseLabel", "caseItemList", "caseItem", "defaultLabel", "labeledStatement", 
		"statementLabel", "labelName", "controlTransferStatement", "breakStatement", 
		"continueStatement", "fallthroughStatement", "returnStatement", "throwStatement", 
		"deferStatement", "doStatement", "catchClauses", "catchClause", "conditionList", 
		"condition", "caseCondition", "optionalBindingCondition", "whereClause", 
		"whereExpression", "availabilityCondition", "availabilityArguments", "availabilityArgument", 
		"platformName", "platformVersion", "genericParameterClause", "genericParameterList", 
		"genericParameter", "genericWhereClause", "requirementList", "requirement", 
		"conformanceRequirement", "sameTypeRequirement", "genericArgumentClause", 
		"genericArgumentList", "genericArgument", "declaration", "declarations", 
		"declarationModifiers", "declarationModifier", "accessLevelModifier", 
		"accessLevelModifiers", "mutationModifier", "codeBlock", "importDeclaration", 
		"importKind", "importPath", "importPathIdentifier", "constantDeclaration", 
		"patternInitializerList", "patternInitializer", "initializer", "variableDeclaration", 
		"variableDeclarationHead", "variableName", "getterSetterBlock", "getterClause", 
		"setterClause", "setterName", "getterSetterKeywordBlock", "getterKeywordClause", 
		"setterKeywordClause", "willSetDidSetBlock", "willSetClause", "didSetClause", 
		"typealiasDeclaration", "typealiasHead", "typealiasName", "typealiasAssignment", 
		"functionDeclaration", "functionHead", "functionName", "functionSignature", 
		"functionResult", "functionBody", "parameterClause", "parameterList", 
		"parameter", "externalParameterName", "localParameterName", "defaultArgumentClause", 
		"enumDeclaration", "enumDef", "unionStyleEnum", "unionStyleEnumMembers", 
		"unionStyleEnumMember", "unionStyleEnumCaseClause", "unionStyleEnumCaseList", 
		"unionStyleEnumCase", "enumName", "enumCaseName", "rawValueStyleEnum", 
		"rawValueStyleEnumMembers", "rawValueStyleEnumMember", "rawValueStyleEnumCaseClause", 
		"rawValueStyleEnumCaseList", "rawValueStyleEnumCase", "rawValueAssignment", 
		"structDeclaration", "structName", "structBody", "structMembers", "structMember", 
		"classDeclaration", "classDeclarationModifiers", "className", "classBody", 
		"classMembers", "classMember", "protocolDeclaration", "protocolName", 
		"protocolBody", "protocolMembers", "protocolMember", "protocolMemberDeclaration", 
		"protocolPropertyDeclaration", "protocolMethodDeclaration", "protocolInitializerDeclaration", 
		"protocolSubscriptDeclaration", "protocolAssociatedTypeDeclaration", "initializerDeclaration", 
		"initializerHead", "initializerBody", "deinitializerDeclaration", "extensionDeclaration", 
		"extensionBody", "extensionMembers", "extensionMember", "subscriptDeclaration", 
		"subscriptHead", "subscriptResult", "operatorDeclaration", "prefixOperatorDeclaration", 
		"postfixOperatorDeclaration", "infixOperatorDeclaration", "infixOperatorGroup", 
		"precedenceGroupDeclaration", "precedenceGroupAttributes", "precedenceGroupAttribute", 
		"precedenceGroupRelation", "precedenceGroupAssignment", "precedenceGroupAssociativity", 
		"precedenceGroupNames", "precedenceGroupName", "pattern", "wildcardPattern", 
		"identifierPattern", "valueBindingPattern", "tuplePattern", "tuplePatternElementList", 
		"tuplePatternElement", "enumCasePattern", "typeCastingPattern", "isPattern", 
		"asPattern", "expressionPattern", "attribute", "attributeName", "attributeArgumentClause", 
		"attributes", "balancedTokens", "balancedToken", "expression", "prefixExpression", 
		"inOutExpression", "tryOperator", "binaryExpression", "assignmentOperator", 
		"conditionalOperator", "typeCastingOperator", "primaryExpression", "literalExpression", 
		"arrayLiteral", "arrayLiteralItems", "arrayLiteralItem", "dictionaryLiteral", 
		"dictionaryLiteralItems", "dictionaryLiteralItem", "playgroundLiteral", 
		"selfExpression", "superclassExpression", "superclassMethodExpression", 
		"superclassSubscriptExpression", "superclassInitializerExpression", "closureExpression", 
		"closureSignature", "closureParameterClause", "closureParameterList", 
		"closureParameter", "closureParameterName", "captureList", "captureListItems", 
		"captureListItem", "captureSpecifier", "implicitMemberExpression", "parenthesizedExpression", 
		"tupleExpression", "tupleElementList", "tupleElement", "wildcardExpression", 
		"selectorExpression", "keyPathExpression", "postfixExpression", "functionCallArgumentClause", 
		"functionCallArgumentList", "functionCallArgument", "functionCallIdentifier", 
		"argumentNames", "argumentName", "operatorHead", "operatorCharacter", 
		"operator", "binaryOperator", "prefixOperator", "postfixOperator", "sType", 
		"functionType", "functionTypeArgumentClause", "functionTypeArgumentList", 
		"functionTypeArgument", "argumentLabel", "arrayType", "dictionaryType", 
		"optionalType", "implicitlyUnwrappedOptionalType", "typeAnnotation", "typeIdentifier", 
		"typeName", "tupleType", "tupleTypeElementList", "tupleTypeElement", "elementName", 
		"protocolCompositionType", "protocolCompositionContinuation", "protocolIdentifier", 
		"metatypeType", "typeInheritanceClause", "typeInheritanceList", "classRequirement", 
		"compilerControlStatement", "conditionalCompilationBlock", "ifDirectiveClause", 
		"elseifDirectiveClauses", "elseifDirectiveClause", "elseDirectiveClause", 
		"compilationCondition", "platformCondition", "operatingSystem", "architecture", 
		"swiftVersion", "lineControlStatement", "lineNumber", "fileName", "identifier", 
		"keyword", "contextSensitiveKeyword", "grammarString", "identifierList", 
		"booleanLiteral", "literal", "numericLiteral", "integerLiteral"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "':'", "'for'", "'case'", "'in'", "'while'", "'repeat'", 
		"'if'", "'else'", "'guard'", "'switch'", "'{'", "'}'", "','", "'default'", 
		"'break'", "'continue'", "'fallthrough'", "'return'", "'throw'", "'defer'", 
		"'do'", "'catch'", "'let'", "'var'", "'where'", "'#available'", "'('", 
		"')'", "'*'", "'iOS'", "'iOSApplicationExtension'", "'OSX'", "'OSXApplicationExtension'", 
		"'watchOS'", "'watchOSApplicationExtension'", "'tvOS'", "'tvOSApplicationExtension'", 
		"'macOS'", "'<'", "'>'", "'=='", "'class'", "'convenience'", "'dynamic'", 
		"'final'", "'infix'", "'lazy'", "'optional'", "'override'", "'postfix'", 
		"'prefix'", "'required'", "'static'", "'unowned'", "'safe'", "'unsafe'", 
		"'weak'", "'private'", "'set'", "'fileprivate'", "'internal'", "'public'", 
		"'open'", "'mutating'", "'nonmutating'", "'import'", "'typealias'", "'struct'", 
		"'enum'", "'protocol'", "'func'", "'.'", "'='", "'get'", "'willSet'", 
		"'didSet'", "'throws'", "'rethrows'", "'->'", "'...'", "'_'", "'indirect'", 
		"'associatedtype'", "'init'", "'?'", "'!'", "'deinit'", "'extension'", 
		"'subscript'", "'operator'", "'precedencegroup'", "'higherThan'", "'lowerThan'", 
		"'assignment'", "'associativity'", "'left'", "'right'", "'none'", "'is'", 
		"'as'", "'@'", "'['", "']'", "'-'", "'''", "'/'", "'\"'", "'&'", "'try'", 
		"'#file'", "'#line'", "'#column'", "'#function'", "'#colorLiteral'", "'red'", 
		"'green'", "'blue'", "'alpha'", "'#fileLiteral'", "'resourceName'", "'#imageLiteral'", 
		"'self'", "'super'", "'unowned(safe)'", "'unowned(unsafe)'", "'#selector'", 
		"'getter:'", "'setter:'", "'#keyPath'", "'type'", "'of'", "'&&'", "'||'", 
		"'>='", "'Type'", "'Protocol'", "'Any'", "'Self'", "'inout'", "'#endif'", 
		"'#if'", "'#elseif'", "'#else'", "'os'", "'arch'", "'swift'", "'i386'", 
		"'x86_64'", "'arm'", "'arm64'", "'#sourceLocation'", "'file'", "'line'", 
		"'dynamicType'", "'fileLiteral'", "'imageLiteral'", "'precedence'", "'OSXApplicationExtension\u00AD'", 
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
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "BooleanLiteral", "NilLiteral", "OperatorHead", 
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
			setState(559);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (T__129 - 130)) | (1L << (T__130 - 130)) | (1L << (T__131 - 130)) | (1L << (T__132 - 130)) | (1L << (T__133 - 130)) | (1L << (T__134 - 130)) | (1L << (T__135 - 130)) | (1L << (T__136 - 130)) | (1L << (T__137 - 130)) | (1L << (T__138 - 130)) | (1L << (T__139 - 130)) | (1L << (T__140 - 130)) | (1L << (T__141 - 130)) | (1L << (T__142 - 130)) | (1L << (T__143 - 130)) | (1L << (T__144 - 130)) | (1L << (T__145 - 130)) | (1L << (T__147 - 130)) | (1L << (T__148 - 130)) | (1L << (T__149 - 130)) | (1L << (T__150 - 130)) | (1L << (T__151 - 130)) | (1L << (T__152 - 130)) | (1L << (T__153 - 130)) | (1L << (T__154 - 130)) | (1L << (T__155 - 130)) | (1L << (T__156 - 130)) | (1L << (T__157 - 130)) | (1L << (T__158 - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NilLiteral - 130)) | (1L << (OperatorHead - 130)) | (1L << (DotOperatorHead - 130)) | (1L << (Identifier - 130)) | (1L << (BinaryLiteral - 130)) | (1L << (OctalLiteral - 130)) | (1L << (DecimalLiteral - 130)) | (1L << (HexadecimalLiteral - 130)) | (1L << (FloatingPointLiteral - 130)) | (1L << (StringLiteral - 130)))) != 0)) {
				{
				setState(558);
				statements();
				}
			}

			setState(561);
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
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(563);
				declaration();
				setState(565);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(564);
					match(T__0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(567);
				loopStatement();
				setState(569);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(568);
					match(T__0);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(571);
				branchStatement();
				setState(573);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(572);
					match(T__0);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(575);
				labeledStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(576);
				controlTransferStatement();
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(577);
					match(T__0);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(580);
				deferStatement();
				setState(582);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(581);
					match(T__0);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(584);
				doStatement();
				setState(586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(585);
					match(T__1);
					}
				}

				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(588);
				compilerControlStatement();
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(589);
					match(T__0);
					}
				}

				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(592);
				expression();
				setState(594);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(593);
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
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(599); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(598);
					statement();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(601); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			setState(606);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				forInStatement();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(604);
				whileStatement();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 3);
				{
				setState(605);
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
			setState(608);
			match(T__2);
			setState(610);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(609);
				match(T__3);
				}
				break;
			}
			setState(612);
			pattern(0);
			setState(613);
			match(T__4);
			setState(614);
			expression();
			setState(616);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(615);
				whereClause();
				}
			}

			setState(618);
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
		public ConditionListContext conditionList() {
			return getRuleContext(ConditionListContext.class,0);
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
			setState(620);
			match(T__5);
			setState(621);
			conditionList();
			setState(622);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
			setState(624);
			match(T__6);
			setState(625);
			codeBlock();
			setState(626);
			match(T__5);
			setState(627);
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
			setState(632);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
				enterOuterAlt(_localctx, 1);
				{
				setState(629);
				ifStatement();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 2);
				{
				setState(630);
				guardStatement();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 3);
				{
				setState(631);
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
		public ConditionListContext conditionList() {
			return getRuleContext(ConditionListContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(634);
			match(T__7);
			setState(635);
			conditionList();
			setState(636);
			codeBlock();
			setState(638);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(637);
				elseClause();
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
			setState(644);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(640);
				match(T__8);
				setState(641);
				codeBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				match(T__8);
				setState(643);
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
		public ConditionListContext conditionList() {
			return getRuleContext(ConditionListContext.class,0);
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
			setState(646);
			match(T__9);
			setState(647);
			conditionList();
			setState(648);
			match(T__8);
			setState(649);
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
			setState(651);
			match(T__10);
			setState(652);
			expression();
			setState(653);
			match(T__11);
			setState(655);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3 || _la==T__14) {
				{
				setState(654);
				switchCases();
				}
			}

			setState(657);
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
			setState(660); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(659);
				switchCase();
				}
				}
				setState(662); 
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
			setState(676);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(664);
				caseLabel();
				setState(665);
				statements();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(667);
				defaultLabel();
				setState(668);
				statements();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(670);
				caseLabel();
				setState(671);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(673);
				defaultLabel();
				setState(674);
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
			setState(678);
			match(T__3);
			setState(679);
			caseItemList();
			setState(680);
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
			setState(682);
			caseItem();
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(683);
				match(T__13);
				setState(684);
				caseItem();
				}
				}
				setState(689);
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
			setState(690);
			pattern(0);
			setState(692);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(691);
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
			setState(694);
			match(T__14);
			setState(695);
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
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public SwitchStatementContext switchStatement() {
			return getRuleContext(SwitchStatementContext.class,0);
		}
		public DoStatementContext doStatement() {
			return getRuleContext(DoStatementContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(697);
			statementLabel();
			setState(702);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__5:
			case T__6:
				{
				setState(698);
				loopStatement();
				}
				break;
			case T__7:
				{
				setState(699);
				ifStatement();
				}
				break;
			case T__10:
				{
				setState(700);
				switchStatement();
				}
				break;
			case T__21:
				{
				setState(701);
				doStatement();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(704);
			labelName();
			setState(705);
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
			setState(707);
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
			setState(714);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__15:
				enterOuterAlt(_localctx, 1);
				{
				setState(709);
				breakStatement();
				}
				break;
			case T__16:
				enterOuterAlt(_localctx, 2);
				{
				setState(710);
				continueStatement();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 3);
				{
				setState(711);
				fallthroughStatement();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 4);
				{
				setState(712);
				returnStatement();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 5);
				{
				setState(713);
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
			setState(716);
			match(T__15);
			setState(718);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				{
				setState(717);
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
			setState(720);
			match(T__16);
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				{
				setState(721);
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
			setState(724);
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
			setState(726);
			match(T__18);
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(727);
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
			setState(730);
			match(T__19);
			setState(731);
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
			setState(733);
			match(T__20);
			setState(734);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(736);
			match(T__21);
			setState(737);
			codeBlock();
			setState(739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(738);
				catchClauses();
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(741);
			catchClause();
			setState(743);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(742);
				catchClauses();
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
			setState(745);
			match(T__22);
			setState(747);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(746);
				pattern(0);
				}
				break;
			}
			setState(750);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(749);
				whereClause();
				}
			}

			setState(752);
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
		enterRule(_localctx, 62, RULE_conditionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			condition();
			setState(759);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(755);
				match(T__13);
				setState(756);
				condition();
				}
				}
				setState(761);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 64, RULE_condition);
		try {
			setState(766);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(762);
				availabilityCondition();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(763);
				caseCondition();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(764);
				optionalBindingCondition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(765);
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

	public static class CaseConditionContext extends ParserRuleContext {
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
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
		enterRule(_localctx, 66, RULE_caseCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(768);
			match(T__3);
			setState(769);
			pattern(0);
			setState(770);
			initializer();
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
		public PatternContext pattern() {
			return getRuleContext(PatternContext.class,0);
		}
		public InitializerContext initializer() {
			return getRuleContext(InitializerContext.class,0);
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
		enterRule(_localctx, 68, RULE_optionalBindingCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			_la = _input.LA(1);
			if ( !(_la==T__23 || _la==T__24) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(773);
			pattern(0);
			setState(774);
			initializer();
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
		enterRule(_localctx, 70, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(776);
			match(T__25);
			setState(777);
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
		enterRule(_localctx, 72, RULE_whereExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
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
		enterRule(_localctx, 74, RULE_availabilityCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(781);
			match(T__26);
			setState(782);
			match(T__27);
			setState(783);
			availabilityArguments();
			setState(784);
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
		enterRule(_localctx, 76, RULE_availabilityArguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(786);
			availabilityArgument();
			setState(791);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(787);
					match(T__13);
					setState(788);
					availabilityArguments();
					}
					} 
				}
				setState(793);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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
		enterRule(_localctx, 78, RULE_availabilityArgument);
		try {
			setState(798);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__30:
			case T__31:
			case T__32:
			case T__33:
			case T__34:
			case T__35:
			case T__36:
			case T__37:
			case T__38:
				enterOuterAlt(_localctx, 1);
				{
				setState(794);
				platformName();
				setState(795);
				platformVersion();
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 2);
				{
				setState(797);
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
		enterRule(_localctx, 80, RULE_platformName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(800);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
		enterRule(_localctx, 82, RULE_platformVersion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(802);
			_la = _input.LA(1);
			if ( !(((((_la - 169)) & ~0x3f) == 0 && ((1L << (_la - 169)) & ((1L << (DecimalLiteral - 169)) | (1L << (FloatingPointLiteral - 169)) | (1L << (VersionLiteral - 169)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
		enterRule(_localctx, 84, RULE_genericParameterClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(804);
			match(T__39);
			setState(805);
			genericParameterList();
			setState(806);
			match(T__40);
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
		enterRule(_localctx, 86, RULE_genericParameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			genericParameter();
			setState(813);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(809);
				match(T__13);
				setState(810);
				genericParameter();
				}
				}
				setState(815);
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
		enterRule(_localctx, 88, RULE_genericParameter);
		try {
			setState(825);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(816);
				typeName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(817);
				typeName();
				setState(818);
				match(T__1);
				setState(819);
				typeIdentifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(821);
				typeName();
				setState(822);
				match(T__1);
				setState(823);
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

	public static class GenericWhereClauseContext extends ParserRuleContext {
		public RequirementListContext requirementList() {
			return getRuleContext(RequirementListContext.class,0);
		}
		public GenericWhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericWhereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGenericWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGenericWhereClause(this);
		}
	}

	public final GenericWhereClauseContext genericWhereClause() throws RecognitionException {
		GenericWhereClauseContext _localctx = new GenericWhereClauseContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_genericWhereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(827);
			match(T__25);
			setState(828);
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
		enterRule(_localctx, 92, RULE_requirementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(830);
			requirement();
			setState(835);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(831);
				match(T__13);
				setState(832);
				requirement();
				}
				}
				setState(837);
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
		enterRule(_localctx, 94, RULE_requirement);
		try {
			setState(840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(838);
				conformanceRequirement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(839);
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
		enterRule(_localctx, 96, RULE_conformanceRequirement);
		try {
			setState(850);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(842);
				typeIdentifier();
				setState(843);
				match(T__1);
				setState(844);
				typeIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(846);
				typeIdentifier();
				setState(847);
				match(T__1);
				setState(848);
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
		enterRule(_localctx, 98, RULE_sameTypeRequirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(852);
			typeIdentifier();
			setState(853);
			match(T__41);
			setState(854);
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
		enterRule(_localctx, 100, RULE_genericArgumentClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(856);
			match(T__39);
			setState(857);
			genericArgumentList();
			setState(858);
			match(T__40);
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
		enterRule(_localctx, 102, RULE_genericArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(860);
			genericArgument();
			setState(865);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(861);
				match(T__13);
				setState(862);
				genericArgument();
				}
				}
				setState(867);
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
		enterRule(_localctx, 104, RULE_genericArgument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
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
		public PrecedenceGroupDeclarationContext precedenceGroupDeclaration() {
			return getRuleContext(PrecedenceGroupDeclarationContext.class,0);
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
		enterRule(_localctx, 106, RULE_declaration);
		try {
			setState(934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(870);
				importDeclaration();
				setState(872);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
				case 1:
					{
					setState(871);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(874);
				constantDeclaration();
				setState(876);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(875);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(878);
				variableDeclaration();
				setState(880);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
				case 1:
					{
					setState(879);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(882);
				typealiasDeclaration();
				setState(884);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(883);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(886);
				functionDeclaration();
				setState(888);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
				case 1:
					{
					setState(887);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(890);
				enumDeclaration();
				setState(892);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
				case 1:
					{
					setState(891);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(894);
				structDeclaration();
				setState(896);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
				case 1:
					{
					setState(895);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(898);
				classDeclaration();
				setState(900);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(899);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(902);
				protocolDeclaration();
				setState(904);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
				case 1:
					{
					setState(903);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(906);
				initializerDeclaration();
				setState(908);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
				case 1:
					{
					setState(907);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(910);
				deinitializerDeclaration();
				setState(912);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
				case 1:
					{
					setState(911);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(914);
				extensionDeclaration();
				setState(916);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,52,_ctx) ) {
				case 1:
					{
					setState(915);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(918);
				subscriptDeclaration();
				setState(920);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(919);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(922);
				operatorDeclaration();
				setState(924);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
				case 1:
					{
					setState(923);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(926);
				compilerControlStatement();
				setState(928);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
				case 1:
					{
					setState(927);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(930);
				precedenceGroupDeclaration();
				setState(932);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
				case 1:
					{
					setState(931);
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
		enterRule(_localctx, 108, RULE_declarations);
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
				declaration();
				}
				}
				setState(939); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__82 - 64)) | (1L << (T__84 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__101 - 64)))) != 0) || _la==T__141 || _la==T__151 );
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
		enterRule(_localctx, 110, RULE_declarationModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(942); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(941);
				declarationModifier();
				}
				}
				setState(944); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (T__42 - 43)) | (1L << (T__43 - 43)) | (1L << (T__44 - 43)) | (1L << (T__45 - 43)) | (1L << (T__46 - 43)) | (1L << (T__47 - 43)) | (1L << (T__48 - 43)) | (1L << (T__49 - 43)) | (1L << (T__50 - 43)) | (1L << (T__51 - 43)) | (1L << (T__52 - 43)) | (1L << (T__53 - 43)) | (1L << (T__54 - 43)) | (1L << (T__57 - 43)) | (1L << (T__58 - 43)) | (1L << (T__60 - 43)) | (1L << (T__61 - 43)) | (1L << (T__62 - 43)) | (1L << (T__63 - 43)) | (1L << (T__64 - 43)) | (1L << (T__65 - 43)))) != 0) );
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
		public MutationModifierContext mutationModifier() {
			return getRuleContext(MutationModifierContext.class,0);
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
		enterRule(_localctx, 112, RULE_declarationModifier);
		try {
			setState(970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(946);
				match(T__42);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(947);
				match(T__43);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(948);
				match(T__44);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(949);
				match(T__45);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(950);
				match(T__46);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(951);
				match(T__47);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(952);
				match(T__48);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(953);
				match(T__49);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(954);
				match(T__50);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(955);
				match(T__51);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(956);
				match(T__52);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(957);
				match(T__53);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(958);
				match(T__54);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(959);
				match(T__54);
				setState(960);
				match(T__27);
				setState(961);
				match(T__55);
				setState(962);
				match(T__28);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(963);
				match(T__54);
				setState(964);
				match(T__27);
				setState(965);
				match(T__56);
				setState(966);
				match(T__28);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(967);
				match(T__57);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(968);
				accessLevelModifier();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(969);
				mutationModifier();
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
		enterRule(_localctx, 114, RULE_accessLevelModifier);
		try {
			setState(997);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(972);
				match(T__58);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(973);
				match(T__58);
				setState(974);
				match(T__27);
				setState(975);
				match(T__59);
				setState(976);
				match(T__28);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(977);
				match(T__60);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(978);
				match(T__60);
				setState(979);
				match(T__27);
				setState(980);
				match(T__59);
				setState(981);
				match(T__28);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(982);
				match(T__61);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(983);
				match(T__61);
				setState(984);
				match(T__27);
				setState(985);
				match(T__59);
				setState(986);
				match(T__28);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(987);
				match(T__62);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(988);
				match(T__62);
				setState(989);
				match(T__27);
				setState(990);
				match(T__59);
				setState(991);
				match(T__28);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(992);
				match(T__63);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(993);
				match(T__63);
				setState(994);
				match(T__27);
				setState(995);
				match(T__59);
				setState(996);
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
		enterRule(_localctx, 116, RULE_accessLevelModifiers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1000); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(999);
				accessLevelModifier();
				}
				}
				setState(1002); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (T__58 - 59)) | (1L << (T__60 - 59)) | (1L << (T__61 - 59)) | (1L << (T__62 - 59)) | (1L << (T__63 - 59)))) != 0) );
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

	public static class MutationModifierContext extends ParserRuleContext {
		public MutationModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mutationModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterMutationModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitMutationModifier(this);
		}
	}

	public final MutationModifierContext mutationModifier() throws RecognitionException {
		MutationModifierContext _localctx = new MutationModifierContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_mutationModifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			_la = _input.LA(1);
			if ( !(_la==T__64 || _la==T__65) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
		enterRule(_localctx, 120, RULE_codeBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1006);
			match(T__11);
			setState(1008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (T__129 - 130)) | (1L << (T__130 - 130)) | (1L << (T__131 - 130)) | (1L << (T__132 - 130)) | (1L << (T__133 - 130)) | (1L << (T__134 - 130)) | (1L << (T__135 - 130)) | (1L << (T__136 - 130)) | (1L << (T__137 - 130)) | (1L << (T__138 - 130)) | (1L << (T__139 - 130)) | (1L << (T__140 - 130)) | (1L << (T__141 - 130)) | (1L << (T__142 - 130)) | (1L << (T__143 - 130)) | (1L << (T__144 - 130)) | (1L << (T__145 - 130)) | (1L << (T__147 - 130)) | (1L << (T__148 - 130)) | (1L << (T__149 - 130)) | (1L << (T__150 - 130)) | (1L << (T__151 - 130)) | (1L << (T__152 - 130)) | (1L << (T__153 - 130)) | (1L << (T__154 - 130)) | (1L << (T__155 - 130)) | (1L << (T__156 - 130)) | (1L << (T__157 - 130)) | (1L << (T__158 - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NilLiteral - 130)) | (1L << (OperatorHead - 130)) | (1L << (DotOperatorHead - 130)) | (1L << (Identifier - 130)) | (1L << (BinaryLiteral - 130)) | (1L << (OctalLiteral - 130)) | (1L << (DecimalLiteral - 130)) | (1L << (HexadecimalLiteral - 130)) | (1L << (FloatingPointLiteral - 130)) | (1L << (StringLiteral - 130)))) != 0)) {
				{
				setState(1007);
				statements();
				}
			}

			setState(1010);
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
		enterRule(_localctx, 122, RULE_importDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1013);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1012);
				attributes();
				}
			}

			setState(1015);
			match(T__66);
			setState(1017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(1016);
				importKind();
				}
				break;
			}
			setState(1019);
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
		enterRule(_localctx, 124, RULE_importKind);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			_la = _input.LA(1);
			if ( !(((((_la - 24)) & ~0x3f) == 0 && ((1L << (_la - 24)) & ((1L << (T__23 - 24)) | (1L << (T__24 - 24)) | (1L << (T__42 - 24)) | (1L << (T__67 - 24)) | (1L << (T__68 - 24)) | (1L << (T__69 - 24)) | (1L << (T__70 - 24)) | (1L << (T__71 - 24)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
		enterRule(_localctx, 126, RULE_importPath);
		try {
			setState(1028);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,66,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1023);
				importPathIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1024);
				importPathIdentifier();
				setState(1025);
				match(T__72);
				setState(1026);
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
		enterRule(_localctx, 128, RULE_importPathIdentifier);
		try {
			setState(1032);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__24:
			case T__30:
			case T__31:
			case T__32:
			case T__34:
			case T__36:
			case T__38:
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
			case T__54:
			case T__55:
			case T__57:
			case T__59:
			case T__64:
			case T__65:
			case T__74:
			case T__75:
			case T__76:
			case T__82:
			case T__90:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__115:
			case T__116:
			case T__117:
			case T__118:
			case T__120:
			case T__130:
			case T__131:
			case T__135:
			case T__136:
			case T__138:
			case T__144:
			case T__145:
			case T__147:
			case T__148:
			case T__149:
			case T__150:
			case T__152:
			case T__153:
			case T__157:
			case T__158:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1030);
				identifier();
				}
				break;
			case T__29:
			case T__39:
			case T__40:
			case T__41:
			case T__73:
			case T__79:
			case T__80:
			case T__85:
			case T__86:
			case T__104:
			case T__106:
			case T__108:
			case T__132:
			case T__133:
			case T__134:
			case OperatorHead:
			case DotOperatorHead:
				enterOuterAlt(_localctx, 2);
				{
				setState(1031);
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
		enterRule(_localctx, 130, RULE_constantDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1034);
				attributes();
				}
			}

			setState(1038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (T__42 - 43)) | (1L << (T__43 - 43)) | (1L << (T__44 - 43)) | (1L << (T__45 - 43)) | (1L << (T__46 - 43)) | (1L << (T__47 - 43)) | (1L << (T__48 - 43)) | (1L << (T__49 - 43)) | (1L << (T__50 - 43)) | (1L << (T__51 - 43)) | (1L << (T__52 - 43)) | (1L << (T__53 - 43)) | (1L << (T__54 - 43)) | (1L << (T__57 - 43)) | (1L << (T__58 - 43)) | (1L << (T__60 - 43)) | (1L << (T__61 - 43)) | (1L << (T__62 - 43)) | (1L << (T__63 - 43)) | (1L << (T__64 - 43)) | (1L << (T__65 - 43)))) != 0)) {
				{
				setState(1037);
				declarationModifiers();
				}
			}

			setState(1040);
			match(T__23);
			setState(1041);
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
		enterRule(_localctx, 132, RULE_patternInitializerList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			patternInitializer();
			setState(1048);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(1044);
				match(T__13);
				setState(1045);
				patternInitializer();
				}
				}
				setState(1050);
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
		enterRule(_localctx, 134, RULE_patternInitializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1051);
			pattern(0);
			setState(1053);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(1052);
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
		enterRule(_localctx, 136, RULE_initializer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1055);
			match(T__73);
			setState(1056);
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
		enterRule(_localctx, 138, RULE_variableDeclaration);
		int _la;
		try {
			setState(1089);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1058);
				variableDeclarationHead();
				setState(1059);
				variableName();
				setState(1060);
				typeAnnotation();
				setState(1061);
				getterSetterBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1063);
				variableDeclarationHead();
				setState(1064);
				variableName();
				setState(1065);
				typeAnnotation();
				setState(1066);
				getterSetterKeywordBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1068);
				variableDeclarationHead();
				setState(1069);
				variableName();
				setState(1070);
				initializer();
				setState(1071);
				willSetDidSetBlock();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1073);
				variableDeclarationHead();
				setState(1074);
				variableName();
				setState(1075);
				typeAnnotation();
				setState(1077);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__73) {
					{
					setState(1076);
					initializer();
					}
				}

				setState(1079);
				willSetDidSetBlock();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1081);
				variableDeclarationHead();
				setState(1082);
				variableName();
				setState(1083);
				typeAnnotation();
				setState(1084);
				codeBlock();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1086);
				variableDeclarationHead();
				setState(1087);
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
		enterRule(_localctx, 140, RULE_variableDeclarationHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1092);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1091);
				attributes();
				}
			}

			setState(1095);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (T__42 - 43)) | (1L << (T__43 - 43)) | (1L << (T__44 - 43)) | (1L << (T__45 - 43)) | (1L << (T__46 - 43)) | (1L << (T__47 - 43)) | (1L << (T__48 - 43)) | (1L << (T__49 - 43)) | (1L << (T__50 - 43)) | (1L << (T__51 - 43)) | (1L << (T__52 - 43)) | (1L << (T__53 - 43)) | (1L << (T__54 - 43)) | (1L << (T__57 - 43)) | (1L << (T__58 - 43)) | (1L << (T__60 - 43)) | (1L << (T__61 - 43)) | (1L << (T__62 - 43)) | (1L << (T__63 - 43)) | (1L << (T__64 - 43)) | (1L << (T__65 - 43)))) != 0)) {
				{
				setState(1094);
				declarationModifiers();
				}
			}

			setState(1097);
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
		enterRule(_localctx, 142, RULE_variableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1099);
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
		enterRule(_localctx, 144, RULE_getterSetterBlock);
		int _la;
		try {
			setState(1113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1101);
				match(T__11);
				setState(1102);
				getterClause();
				setState(1104);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (T__42 - 43)) | (1L << (T__43 - 43)) | (1L << (T__44 - 43)) | (1L << (T__45 - 43)) | (1L << (T__46 - 43)) | (1L << (T__47 - 43)) | (1L << (T__48 - 43)) | (1L << (T__49 - 43)) | (1L << (T__50 - 43)) | (1L << (T__51 - 43)) | (1L << (T__52 - 43)) | (1L << (T__53 - 43)) | (1L << (T__54 - 43)) | (1L << (T__57 - 43)) | (1L << (T__58 - 43)) | (1L << (T__59 - 43)) | (1L << (T__60 - 43)) | (1L << (T__61 - 43)) | (1L << (T__62 - 43)) | (1L << (T__63 - 43)) | (1L << (T__64 - 43)) | (1L << (T__65 - 43)) | (1L << (T__101 - 43)))) != 0)) {
					{
					setState(1103);
					setterClause();
					}
				}

				setState(1106);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1108);
				match(T__11);
				setState(1109);
				setterClause();
				setState(1110);
				getterClause();
				setState(1111);
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
		enterRule(_localctx, 146, RULE_getterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1115);
				attributes();
				}
			}

			setState(1119);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (T__42 - 43)) | (1L << (T__43 - 43)) | (1L << (T__44 - 43)) | (1L << (T__45 - 43)) | (1L << (T__46 - 43)) | (1L << (T__47 - 43)) | (1L << (T__48 - 43)) | (1L << (T__49 - 43)) | (1L << (T__50 - 43)) | (1L << (T__51 - 43)) | (1L << (T__52 - 43)) | (1L << (T__53 - 43)) | (1L << (T__54 - 43)) | (1L << (T__57 - 43)) | (1L << (T__58 - 43)) | (1L << (T__60 - 43)) | (1L << (T__61 - 43)) | (1L << (T__62 - 43)) | (1L << (T__63 - 43)) | (1L << (T__64 - 43)) | (1L << (T__65 - 43)))) != 0)) {
				{
				setState(1118);
				declarationModifiers();
				}
			}

			setState(1121);
			match(T__74);
			setState(1122);
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
		enterRule(_localctx, 148, RULE_setterClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1124);
				attributes();
				}
			}

			setState(1128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (T__42 - 43)) | (1L << (T__43 - 43)) | (1L << (T__44 - 43)) | (1L << (T__45 - 43)) | (1L << (T__46 - 43)) | (1L << (T__47 - 43)) | (1L << (T__48 - 43)) | (1L << (T__49 - 43)) | (1L << (T__50 - 43)) | (1L << (T__51 - 43)) | (1L << (T__52 - 43)) | (1L << (T__53 - 43)) | (1L << (T__54 - 43)) | (1L << (T__57 - 43)) | (1L << (T__58 - 43)) | (1L << (T__60 - 43)) | (1L << (T__61 - 43)) | (1L << (T__62 - 43)) | (1L << (T__63 - 43)) | (1L << (T__64 - 43)) | (1L << (T__65 - 43)))) != 0)) {
				{
				setState(1127);
				declarationModifiers();
				}
			}

			setState(1130);
			match(T__59);
			setState(1132);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(1131);
				setterName();
				}
			}

			setState(1134);
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
		enterRule(_localctx, 150, RULE_setterName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1136);
			match(T__27);
			setState(1137);
			identifier();
			setState(1138);
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
		enterRule(_localctx, 152, RULE_getterSetterKeywordBlock);
		int _la;
		try {
			setState(1152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1140);
				match(T__11);
				setState(1141);
				getterKeywordClause();
				setState(1143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__59 || _la==T__101) {
					{
					setState(1142);
					setterKeywordClause();
					}
				}

				setState(1145);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1147);
				match(T__11);
				setState(1148);
				setterKeywordClause();
				setState(1149);
				getterKeywordClause();
				setState(1150);
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
		enterRule(_localctx, 154, RULE_getterKeywordClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1154);
				attributes();
				}
			}

			setState(1157);
			match(T__74);
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
		enterRule(_localctx, 156, RULE_setterKeywordClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1160);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1159);
				attributes();
				}
			}

			setState(1162);
			match(T__59);
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
		enterRule(_localctx, 158, RULE_willSetDidSetBlock);
		int _la;
		try {
			setState(1178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1164);
				match(T__11);
				setState(1165);
				willSetClause();
				setState(1167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__76 || _la==T__101) {
					{
					setState(1166);
					didSetClause();
					}
				}

				setState(1169);
				match(T__12);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1171);
				match(T__11);
				setState(1172);
				didSetClause();
				setState(1174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__75 || _la==T__101) {
					{
					setState(1173);
					willSetClause();
					}
				}

				setState(1176);
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
		enterRule(_localctx, 160, RULE_willSetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1181);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1180);
				attributes();
				}
			}

			setState(1183);
			match(T__75);
			setState(1185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(1184);
				setterName();
				}
			}

			setState(1187);
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
		enterRule(_localctx, 162, RULE_didSetClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1189);
				attributes();
				}
			}

			setState(1192);
			match(T__76);
			setState(1194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(1193);
				setterName();
				}
			}

			setState(1196);
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
		enterRule(_localctx, 164, RULE_typealiasDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1198);
			typealiasHead();
			setState(1199);
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
		public GenericParameterClauseContext genericParameterClause() {
			return getRuleContext(GenericParameterClauseContext.class,0);
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
		enterRule(_localctx, 166, RULE_typealiasHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1201);
				attributes();
				}
			}

			setState(1205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (T__58 - 59)) | (1L << (T__60 - 59)) | (1L << (T__61 - 59)) | (1L << (T__62 - 59)) | (1L << (T__63 - 59)))) != 0)) {
				{
				setState(1204);
				accessLevelModifier();
				}
			}

			setState(1207);
			match(T__67);
			setState(1208);
			typealiasName();
			setState(1210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(1209);
				genericParameterClause();
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
		enterRule(_localctx, 168, RULE_typealiasName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1212);
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
		enterRule(_localctx, 170, RULE_typealiasAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1214);
			match(T__73);
			setState(1215);
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
		public GenericWhereClauseContext genericWhereClause() {
			return getRuleContext(GenericWhereClauseContext.class,0);
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
		enterRule(_localctx, 172, RULE_functionDeclaration);
		int _la;
		try {
			setState(1237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1217);
				functionHead();
				setState(1218);
				functionName();
				setState(1220);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(1219);
					genericParameterClause();
					}
				}

				setState(1222);
				functionSignature();
				setState(1224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__25) {
					{
					setState(1223);
					genericWhereClause();
					}
				}

				setState(1226);
				functionBody();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1228);
				functionHead();
				setState(1229);
				functionName();
				setState(1231);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(1230);
					genericParameterClause();
					}
				}

				setState(1233);
				functionSignature();
				setState(1235);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
				case 1:
					{
					setState(1234);
					genericWhereClause();
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
		enterRule(_localctx, 174, RULE_functionHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1240);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1239);
				attributes();
				}
			}

			setState(1243);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (T__42 - 43)) | (1L << (T__43 - 43)) | (1L << (T__44 - 43)) | (1L << (T__45 - 43)) | (1L << (T__46 - 43)) | (1L << (T__47 - 43)) | (1L << (T__48 - 43)) | (1L << (T__49 - 43)) | (1L << (T__50 - 43)) | (1L << (T__51 - 43)) | (1L << (T__52 - 43)) | (1L << (T__53 - 43)) | (1L << (T__54 - 43)) | (1L << (T__57 - 43)) | (1L << (T__58 - 43)) | (1L << (T__60 - 43)) | (1L << (T__61 - 43)) | (1L << (T__62 - 43)) | (1L << (T__63 - 43)) | (1L << (T__64 - 43)) | (1L << (T__65 - 43)))) != 0)) {
				{
				setState(1242);
				declarationModifiers();
				}
			}

			setState(1245);
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
		enterRule(_localctx, 176, RULE_functionName);
		try {
			setState(1249);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__24:
			case T__30:
			case T__31:
			case T__32:
			case T__34:
			case T__36:
			case T__38:
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
			case T__54:
			case T__55:
			case T__57:
			case T__59:
			case T__64:
			case T__65:
			case T__74:
			case T__75:
			case T__76:
			case T__82:
			case T__90:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__115:
			case T__116:
			case T__117:
			case T__118:
			case T__120:
			case T__130:
			case T__131:
			case T__135:
			case T__136:
			case T__138:
			case T__144:
			case T__145:
			case T__147:
			case T__148:
			case T__149:
			case T__150:
			case T__152:
			case T__153:
			case T__157:
			case T__158:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1247);
				identifier();
				}
				break;
			case T__29:
			case T__39:
			case T__40:
			case T__41:
			case T__73:
			case T__79:
			case T__80:
			case T__85:
			case T__86:
			case T__104:
			case T__106:
			case T__108:
			case T__132:
			case T__133:
			case T__134:
			case OperatorHead:
			case DotOperatorHead:
				enterOuterAlt(_localctx, 2);
				{
				setState(1248);
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
		enterRule(_localctx, 178, RULE_functionSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1251);
			parameterClause();
			setState(1253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1252);
				_la = _input.LA(1);
				if ( !(_la==T__77 || _la==T__78) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				{
				setState(1255);
				functionResult();
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
		enterRule(_localctx, 180, RULE_functionResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1258);
			match(T__79);
			setState(1260);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				{
				setState(1259);
				attributes();
				}
				break;
			}
			setState(1262);
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
		enterRule(_localctx, 182, RULE_functionBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1264);
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
		enterRule(_localctx, 184, RULE_parameterClause);
		int _la;
		try {
			setState(1275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1266);
				match(T__27);
				setState(1267);
				match(T__28);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1268);
				match(T__27);
				setState(1269);
				parameterList();
				setState(1271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__80) {
					{
					setState(1270);
					match(T__80);
					}
				}

				setState(1273);
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
		enterRule(_localctx, 186, RULE_parameterList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1277);
			parameter();
			setState(1282);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(1278);
				match(T__13);
				setState(1279);
				parameter();
				}
				}
				setState(1284);
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
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ExternalParameterNameContext externalParameterName() {
			return getRuleContext(ExternalParameterNameContext.class,0);
		}
		public DefaultArgumentClauseContext defaultArgumentClause() {
			return getRuleContext(DefaultArgumentClauseContext.class,0);
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
		enterRule(_localctx, 188, RULE_parameter);
		int _la;
		try {
			setState(1306);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__101) {
					{
					setState(1285);
					attributes();
					}
				}

				setState(1289);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1288);
					externalParameterName();
					}
					break;
				}
				setState(1291);
				localParameterName();
				setState(1292);
				typeAnnotation();
				setState(1294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__73) {
					{
					setState(1293);
					defaultArgumentClause();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__101) {
					{
					setState(1296);
					attributes();
					}
				}

				setState(1300);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1299);
					externalParameterName();
					}
					break;
				}
				setState(1302);
				localParameterName();
				setState(1303);
				typeAnnotation();
				setState(1304);
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
		enterRule(_localctx, 190, RULE_externalParameterName);
		try {
			setState(1311);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1308);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1309);
				keyword();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1310);
				match(T__81);
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
		enterRule(_localctx, 192, RULE_localParameterName);
		try {
			setState(1315);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__24:
			case T__30:
			case T__31:
			case T__32:
			case T__34:
			case T__36:
			case T__38:
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
			case T__54:
			case T__55:
			case T__57:
			case T__59:
			case T__64:
			case T__65:
			case T__74:
			case T__75:
			case T__76:
			case T__82:
			case T__90:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__115:
			case T__116:
			case T__117:
			case T__118:
			case T__120:
			case T__130:
			case T__131:
			case T__135:
			case T__136:
			case T__138:
			case T__144:
			case T__145:
			case T__147:
			case T__148:
			case T__149:
			case T__150:
			case T__152:
			case T__153:
			case T__157:
			case T__158:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(1313);
				identifier();
				}
				break;
			case T__81:
				enterOuterAlt(_localctx, 2);
				{
				setState(1314);
				match(T__81);
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
		enterRule(_localctx, 194, RULE_defaultArgumentClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1317);
			match(T__73);
			setState(1318);
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
		enterRule(_localctx, 196, RULE_enumDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1320);
				attributes();
				}
			}

			setState(1324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (T__58 - 59)) | (1L << (T__60 - 59)) | (1L << (T__61 - 59)) | (1L << (T__62 - 59)) | (1L << (T__63 - 59)))) != 0)) {
				{
				setState(1323);
				accessLevelModifier();
				}
			}

			setState(1326);
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
		enterRule(_localctx, 198, RULE_enumDef);
		try {
			setState(1330);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1328);
				unionStyleEnum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1329);
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
		public GenericWhereClauseContext genericWhereClause() {
			return getRuleContext(GenericWhereClauseContext.class,0);
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
		enterRule(_localctx, 200, RULE_unionStyleEnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__82) {
				{
				setState(1332);
				match(T__82);
				}
			}

			setState(1335);
			match(T__69);
			setState(1336);
			enumName();
			setState(1338);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(1337);
				genericParameterClause();
				}
			}

			setState(1341);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1340);
				typeInheritanceClause();
				}
			}

			setState(1344);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(1343);
				genericWhereClause();
				}
			}

			setState(1346);
			match(T__11);
			setState(1348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__23) | (1L << T__24) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__82 - 64)) | (1L << (T__84 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__101 - 64)))) != 0) || _la==T__141 || _la==T__151) {
				{
				setState(1347);
				unionStyleEnumMembers();
				}
			}

			setState(1350);
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
		enterRule(_localctx, 202, RULE_unionStyleEnumMembers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1352);
				unionStyleEnumMember();
				}
				}
				setState(1355); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__23) | (1L << T__24) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__82 - 64)) | (1L << (T__84 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__101 - 64)))) != 0) || _la==T__141 || _la==T__151 );
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
		public CompilerControlStatementContext compilerControlStatement() {
			return getRuleContext(CompilerControlStatementContext.class,0);
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
		enterRule(_localctx, 204, RULE_unionStyleEnumMember);
		int _la;
		try {
			setState(1363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1357);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1358);
				unionStyleEnumCaseClause();
				setState(1360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1359);
					match(T__0);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1362);
				compilerControlStatement();
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
		enterRule(_localctx, 206, RULE_unionStyleEnumCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1366);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1365);
				attributes();
				}
			}

			setState(1369);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__82) {
				{
				setState(1368);
				match(T__82);
				}
			}

			setState(1371);
			match(T__3);
			setState(1372);
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
		enterRule(_localctx, 208, RULE_unionStyleEnumCaseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			unionStyleEnumCase();
			setState(1379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(1375);
				match(T__13);
				setState(1376);
				unionStyleEnumCase();
				}
				}
				setState(1381);
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
		enterRule(_localctx, 210, RULE_unionStyleEnumCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1382);
			enumCaseName();
			setState(1384);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__27) {
				{
				setState(1383);
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
		enterRule(_localctx, 212, RULE_enumName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1386);
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
		enterRule(_localctx, 214, RULE_enumCaseName);
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
		public GenericWhereClauseContext genericWhereClause() {
			return getRuleContext(GenericWhereClauseContext.class,0);
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
		enterRule(_localctx, 216, RULE_rawValueStyleEnum);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1390);
			match(T__69);
			setState(1391);
			enumName();
			setState(1393);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(1392);
				genericParameterClause();
				}
			}

			setState(1396);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1395);
				typeInheritanceClause();
				}
			}

			setState(1399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(1398);
				genericWhereClause();
				}
			}

			setState(1401);
			match(T__11);
			setState(1403);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__23) | (1L << T__24) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__82 - 64)) | (1L << (T__84 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__101 - 64)))) != 0) || _la==T__141 || _la==T__151) {
				{
				setState(1402);
				rawValueStyleEnumMembers();
				}
			}

			setState(1405);
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
		enterRule(_localctx, 218, RULE_rawValueStyleEnumMembers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1408); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1407);
				rawValueStyleEnumMember();
				}
				}
				setState(1410); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__23) | (1L << T__24) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__82 - 64)) | (1L << (T__84 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__101 - 64)))) != 0) || _la==T__141 || _la==T__151 );
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
		public CompilerControlStatementContext compilerControlStatement() {
			return getRuleContext(CompilerControlStatementContext.class,0);
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
		enterRule(_localctx, 220, RULE_rawValueStyleEnumMember);
		try {
			setState(1415);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1412);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1413);
				rawValueStyleEnumCaseClause();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1414);
				compilerControlStatement();
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
		enterRule(_localctx, 222, RULE_rawValueStyleEnumCaseClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1417);
				attributes();
				}
			}

			setState(1420);
			match(T__3);
			setState(1421);
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
		enterRule(_localctx, 224, RULE_rawValueStyleEnumCaseList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1423);
			rawValueStyleEnumCase();
			setState(1428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(1424);
				match(T__13);
				setState(1425);
				rawValueStyleEnumCase();
				}
				}
				setState(1430);
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
		enterRule(_localctx, 226, RULE_rawValueStyleEnumCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1431);
			enumCaseName();
			setState(1433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__73) {
				{
				setState(1432);
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
		enterRule(_localctx, 228, RULE_rawValueAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1435);
			match(T__73);
			setState(1436);
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
		public GenericWhereClauseContext genericWhereClause() {
			return getRuleContext(GenericWhereClauseContext.class,0);
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
		enterRule(_localctx, 230, RULE_structDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1438);
				attributes();
				}
			}

			setState(1442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (T__58 - 59)) | (1L << (T__60 - 59)) | (1L << (T__61 - 59)) | (1L << (T__62 - 59)) | (1L << (T__63 - 59)))) != 0)) {
				{
				setState(1441);
				accessLevelModifier();
				}
			}

			setState(1444);
			match(T__68);
			setState(1445);
			structName();
			setState(1447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(1446);
				genericParameterClause();
				}
			}

			setState(1450);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1449);
				typeInheritanceClause();
				}
			}

			setState(1453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(1452);
				genericWhereClause();
				}
			}

			setState(1455);
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
		enterRule(_localctx, 232, RULE_structName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
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
		public StructMembersContext structMembers() {
			return getRuleContext(StructMembersContext.class,0);
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
		enterRule(_localctx, 234, RULE_structBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			match(T__11);
			setState(1461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__82 - 64)) | (1L << (T__84 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__101 - 64)))) != 0) || _la==T__141 || _la==T__151) {
				{
				setState(1460);
				structMembers();
				}
			}

			setState(1463);
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

	public static class StructMembersContext extends ParserRuleContext {
		public List<StructMemberContext> structMember() {
			return getRuleContexts(StructMemberContext.class);
		}
		public StructMemberContext structMember(int i) {
			return getRuleContext(StructMemberContext.class,i);
		}
		public StructMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStructMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStructMembers(this);
		}
	}

	public final StructMembersContext structMembers() throws RecognitionException {
		StructMembersContext _localctx = new StructMembersContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_structMembers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1466); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1465);
				structMember();
				}
				}
				setState(1468); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__82 - 64)) | (1L << (T__84 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__101 - 64)))) != 0) || _la==T__141 || _la==T__151 );
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

	public static class StructMemberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public CompilerControlStatementContext compilerControlStatement() {
			return getRuleContext(CompilerControlStatementContext.class,0);
		}
		public StructMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterStructMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitStructMember(this);
		}
	}

	public final StructMemberContext structMember() throws RecognitionException {
		StructMemberContext _localctx = new StructMemberContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_structMember);
		try {
			setState(1472);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1470);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1471);
				compilerControlStatement();
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
		public GenericWhereClauseContext genericWhereClause() {
			return getRuleContext(GenericWhereClauseContext.class,0);
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
		enterRule(_localctx, 240, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1475);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1474);
				attributes();
				}
			}

			setState(1478);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & ((1L << (T__45 - 46)) | (1L << (T__58 - 46)) | (1L << (T__60 - 46)) | (1L << (T__61 - 46)) | (1L << (T__62 - 46)) | (1L << (T__63 - 46)))) != 0)) {
				{
				setState(1477);
				classDeclarationModifiers();
				}
			}

			setState(1480);
			match(T__42);
			setState(1481);
			className();
			setState(1483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(1482);
				genericParameterClause();
				}
			}

			setState(1486);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1485);
				typeInheritanceClause();
				}
			}

			setState(1489);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(1488);
				genericWhereClause();
				}
			}

			setState(1491);
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
		enterRule(_localctx, 242, RULE_classDeclarationModifiers);
		int _la;
		try {
			setState(1501);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__58:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
				enterOuterAlt(_localctx, 1);
				{
				setState(1493);
				accessLevelModifier();
				setState(1495);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__45) {
					{
					setState(1494);
					match(T__45);
					}
				}

				}
				break;
			case T__45:
				enterOuterAlt(_localctx, 2);
				{
				setState(1497);
				match(T__45);
				setState(1499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (T__58 - 59)) | (1L << (T__60 - 59)) | (1L << (T__61 - 59)) | (1L << (T__62 - 59)) | (1L << (T__63 - 59)))) != 0)) {
					{
					setState(1498);
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
		enterRule(_localctx, 244, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1503);
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
		public ClassMembersContext classMembers() {
			return getRuleContext(ClassMembersContext.class,0);
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
		enterRule(_localctx, 246, RULE_classBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1505);
			match(T__11);
			setState(1507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__82 - 64)) | (1L << (T__84 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__101 - 64)))) != 0) || _la==T__141 || _la==T__151) {
				{
				setState(1506);
				classMembers();
				}
			}

			setState(1509);
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

	public static class ClassMembersContext extends ParserRuleContext {
		public List<ClassMemberContext> classMember() {
			return getRuleContexts(ClassMemberContext.class);
		}
		public ClassMemberContext classMember(int i) {
			return getRuleContext(ClassMemberContext.class,i);
		}
		public ClassMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClassMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClassMembers(this);
		}
	}

	public final ClassMembersContext classMembers() throws RecognitionException {
		ClassMembersContext _localctx = new ClassMembersContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_classMembers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1512); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1511);
				classMember();
				}
				}
				setState(1514); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__82 - 64)) | (1L << (T__84 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__101 - 64)))) != 0) || _la==T__141 || _la==T__151 );
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

	public static class ClassMemberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public CompilerControlStatementContext compilerControlStatement() {
			return getRuleContext(CompilerControlStatementContext.class,0);
		}
		public ClassMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClassMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClassMember(this);
		}
	}

	public final ClassMemberContext classMember() throws RecognitionException {
		ClassMemberContext _localctx = new ClassMemberContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_classMember);
		try {
			setState(1518);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1516);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1517);
				compilerControlStatement();
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
		enterRule(_localctx, 252, RULE_protocolDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1520);
				attributes();
				}
			}

			setState(1524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (T__58 - 59)) | (1L << (T__60 - 59)) | (1L << (T__61 - 59)) | (1L << (T__62 - 59)) | (1L << (T__63 - 59)))) != 0)) {
				{
				setState(1523);
				accessLevelModifier();
				}
			}

			setState(1526);
			match(T__70);
			setState(1527);
			protocolName();
			setState(1529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1528);
				typeInheritanceClause();
				}
			}

			setState(1531);
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
		enterRule(_localctx, 254, RULE_protocolName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1533);
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
		public ProtocolMembersContext protocolMembers() {
			return getRuleContext(ProtocolMembersContext.class,0);
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
		enterRule(_localctx, 256, RULE_protocolBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1535);
			match(T__11);
			setState(1537);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (T__24 - 25)) | (1L << (T__42 - 25)) | (1L << (T__43 - 25)) | (1L << (T__44 - 25)) | (1L << (T__45 - 25)) | (1L << (T__46 - 25)) | (1L << (T__47 - 25)) | (1L << (T__48 - 25)) | (1L << (T__49 - 25)) | (1L << (T__50 - 25)) | (1L << (T__51 - 25)) | (1L << (T__52 - 25)) | (1L << (T__53 - 25)) | (1L << (T__54 - 25)) | (1L << (T__57 - 25)) | (1L << (T__58 - 25)) | (1L << (T__60 - 25)) | (1L << (T__61 - 25)) | (1L << (T__62 - 25)) | (1L << (T__63 - 25)) | (1L << (T__64 - 25)) | (1L << (T__65 - 25)) | (1L << (T__71 - 25)) | (1L << (T__83 - 25)) | (1L << (T__84 - 25)))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (T__89 - 90)) | (1L << (T__101 - 90)) | (1L << (T__141 - 90)) | (1L << (T__151 - 90)))) != 0)) {
				{
				setState(1536);
				protocolMembers();
				}
			}

			setState(1539);
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

	public static class ProtocolMembersContext extends ParserRuleContext {
		public List<ProtocolMemberContext> protocolMember() {
			return getRuleContexts(ProtocolMemberContext.class);
		}
		public ProtocolMemberContext protocolMember(int i) {
			return getRuleContext(ProtocolMemberContext.class,i);
		}
		public ProtocolMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolMembers(this);
		}
	}

	public final ProtocolMembersContext protocolMembers() throws RecognitionException {
		ProtocolMembersContext _localctx = new ProtocolMembersContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_protocolMembers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1542); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1541);
				protocolMember();
				}
				}
				setState(1544); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 25)) & ~0x3f) == 0 && ((1L << (_la - 25)) & ((1L << (T__24 - 25)) | (1L << (T__42 - 25)) | (1L << (T__43 - 25)) | (1L << (T__44 - 25)) | (1L << (T__45 - 25)) | (1L << (T__46 - 25)) | (1L << (T__47 - 25)) | (1L << (T__48 - 25)) | (1L << (T__49 - 25)) | (1L << (T__50 - 25)) | (1L << (T__51 - 25)) | (1L << (T__52 - 25)) | (1L << (T__53 - 25)) | (1L << (T__54 - 25)) | (1L << (T__57 - 25)) | (1L << (T__58 - 25)) | (1L << (T__60 - 25)) | (1L << (T__61 - 25)) | (1L << (T__62 - 25)) | (1L << (T__63 - 25)) | (1L << (T__64 - 25)) | (1L << (T__65 - 25)) | (1L << (T__71 - 25)) | (1L << (T__83 - 25)) | (1L << (T__84 - 25)))) != 0) || ((((_la - 90)) & ~0x3f) == 0 && ((1L << (_la - 90)) & ((1L << (T__89 - 90)) | (1L << (T__101 - 90)) | (1L << (T__141 - 90)) | (1L << (T__151 - 90)))) != 0) );
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

	public static class ProtocolMemberContext extends ParserRuleContext {
		public ProtocolMemberDeclarationContext protocolMemberDeclaration() {
			return getRuleContext(ProtocolMemberDeclarationContext.class,0);
		}
		public CompilerControlStatementContext compilerControlStatement() {
			return getRuleContext(CompilerControlStatementContext.class,0);
		}
		public ProtocolMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolMember(this);
		}
	}

	public final ProtocolMemberContext protocolMember() throws RecognitionException {
		ProtocolMemberContext _localctx = new ProtocolMemberContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_protocolMember);
		try {
			setState(1548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
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
			case T__54:
			case T__57:
			case T__58:
			case T__60:
			case T__61:
			case T__62:
			case T__63:
			case T__64:
			case T__65:
			case T__71:
			case T__83:
			case T__84:
			case T__89:
			case T__101:
				enterOuterAlt(_localctx, 1);
				{
				setState(1546);
				protocolMemberDeclaration();
				}
				break;
			case T__141:
			case T__151:
				enterOuterAlt(_localctx, 2);
				{
				setState(1547);
				compilerControlStatement();
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
		enterRule(_localctx, 262, RULE_protocolMemberDeclaration);
		int _la;
		try {
			setState(1570);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1550);
				protocolPropertyDeclaration();
				setState(1552);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1551);
					match(T__0);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1554);
				protocolMethodDeclaration();
				setState(1556);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1555);
					match(T__0);
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1558);
				protocolInitializerDeclaration();
				setState(1560);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1559);
					match(T__0);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1562);
				protocolSubscriptDeclaration();
				setState(1564);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1563);
					match(T__0);
					}
				}

				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1566);
				protocolAssociatedTypeDeclaration();
				setState(1568);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(1567);
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
		enterRule(_localctx, 264, RULE_protocolPropertyDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1572);
			variableDeclarationHead();
			setState(1573);
			variableName();
			setState(1574);
			typeAnnotation();
			setState(1575);
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
		public GenericWhereClauseContext genericWhereClause() {
			return getRuleContext(GenericWhereClauseContext.class,0);
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
		enterRule(_localctx, 266, RULE_protocolMethodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1577);
			functionHead();
			setState(1578);
			functionName();
			setState(1580);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(1579);
				genericParameterClause();
				}
			}

			setState(1582);
			functionSignature();
			setState(1584);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(1583);
				genericWhereClause();
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
		public GenericWhereClauseContext genericWhereClause() {
			return getRuleContext(GenericWhereClauseContext.class,0);
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
		enterRule(_localctx, 268, RULE_protocolInitializerDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1586);
			initializerHead();
			setState(1588);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(1587);
				genericParameterClause();
				}
			}

			setState(1590);
			parameterClause();
			setState(1592);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__77 || _la==T__78) {
				{
				setState(1591);
				_la = _input.LA(1);
				if ( !(_la==T__77 || _la==T__78) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1595);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(1594);
				genericWhereClause();
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
		enterRule(_localctx, 270, RULE_protocolSubscriptDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1597);
			subscriptHead();
			setState(1598);
			subscriptResult();
			setState(1599);
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
		enterRule(_localctx, 272, RULE_protocolAssociatedTypeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1601);
				attributes();
				}
			}

			setState(1605);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (T__58 - 59)) | (1L << (T__60 - 59)) | (1L << (T__61 - 59)) | (1L << (T__62 - 59)) | (1L << (T__63 - 59)))) != 0)) {
				{
				setState(1604);
				accessLevelModifier();
				}
			}

			setState(1607);
			match(T__83);
			setState(1608);
			typealiasName();
			setState(1610);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1609);
				typeInheritanceClause();
				}
			}

			setState(1613);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__73) {
				{
				setState(1612);
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
		public GenericWhereClauseContext genericWhereClause() {
			return getRuleContext(GenericWhereClauseContext.class,0);
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
		enterRule(_localctx, 274, RULE_initializerDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1615);
			initializerHead();
			setState(1617);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__39) {
				{
				setState(1616);
				genericParameterClause();
				}
			}

			setState(1619);
			parameterClause();
			setState(1621);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__77 || _la==T__78) {
				{
				setState(1620);
				_la = _input.LA(1);
				if ( !(_la==T__77 || _la==T__78) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1624);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__25) {
				{
				setState(1623);
				genericWhereClause();
				}
			}

			setState(1626);
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
		enterRule(_localctx, 276, RULE_initializerHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1629);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1628);
				attributes();
				}
			}

			setState(1632);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (T__42 - 43)) | (1L << (T__43 - 43)) | (1L << (T__44 - 43)) | (1L << (T__45 - 43)) | (1L << (T__46 - 43)) | (1L << (T__47 - 43)) | (1L << (T__48 - 43)) | (1L << (T__49 - 43)) | (1L << (T__50 - 43)) | (1L << (T__51 - 43)) | (1L << (T__52 - 43)) | (1L << (T__53 - 43)) | (1L << (T__54 - 43)) | (1L << (T__57 - 43)) | (1L << (T__58 - 43)) | (1L << (T__60 - 43)) | (1L << (T__61 - 43)) | (1L << (T__62 - 43)) | (1L << (T__63 - 43)) | (1L << (T__64 - 43)) | (1L << (T__65 - 43)))) != 0)) {
				{
				setState(1631);
				declarationModifiers();
				}
			}

			setState(1634);
			match(T__84);
			setState(1636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__85 || _la==T__86) {
				{
				setState(1635);
				_la = _input.LA(1);
				if ( !(_la==T__85 || _la==T__86) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
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
		enterRule(_localctx, 278, RULE_initializerBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1638);
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
		enterRule(_localctx, 280, RULE_deinitializerDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1641);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1640);
				attributes();
				}
			}

			setState(1643);
			match(T__87);
			setState(1644);
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
		public GenericWhereClauseContext genericWhereClause() {
			return getRuleContext(GenericWhereClauseContext.class,0);
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
		enterRule(_localctx, 282, RULE_extensionDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1647);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1646);
				attributes();
				}
			}

			setState(1650);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & ((1L << (T__58 - 59)) | (1L << (T__60 - 59)) | (1L << (T__61 - 59)) | (1L << (T__62 - 59)) | (1L << (T__63 - 59)))) != 0)) {
				{
				setState(1649);
				accessLevelModifier();
				}
			}

			setState(1652);
			match(T__88);
			setState(1653);
			typeIdentifier();
			setState(1656);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__25:
				{
				setState(1654);
				genericWhereClause();
				}
				break;
			case T__1:
				{
				setState(1655);
				typeInheritanceClause();
				}
				break;
			case T__11:
				break;
			default:
				break;
			}
			setState(1658);
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
		public ExtensionMembersContext extensionMembers() {
			return getRuleContext(ExtensionMembersContext.class,0);
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
		enterRule(_localctx, 284, RULE_extensionBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1660);
			match(T__11);
			setState(1662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__82 - 64)) | (1L << (T__84 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__101 - 64)))) != 0) || _la==T__141 || _la==T__151) {
				{
				setState(1661);
				extensionMembers();
				}
			}

			setState(1664);
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

	public static class ExtensionMembersContext extends ParserRuleContext {
		public List<ExtensionMemberContext> extensionMember() {
			return getRuleContexts(ExtensionMemberContext.class);
		}
		public ExtensionMemberContext extensionMember(int i) {
			return getRuleContext(ExtensionMemberContext.class,i);
		}
		public ExtensionMembersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionMembers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExtensionMembers(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExtensionMembers(this);
		}
	}

	public final ExtensionMembersContext extensionMembers() throws RecognitionException {
		ExtensionMembersContext _localctx = new ExtensionMembersContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_extensionMembers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1667); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1666);
				extensionMember();
				}
				}
				setState(1669); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__57) | (1L << T__58) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__82 - 64)) | (1L << (T__84 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__91 - 64)) | (1L << (T__101 - 64)))) != 0) || _la==T__141 || _la==T__151 );
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

	public static class ExtensionMemberContext extends ParserRuleContext {
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public CompilerControlStatementContext compilerControlStatement() {
			return getRuleContext(CompilerControlStatementContext.class,0);
		}
		public ExtensionMemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extensionMember; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterExtensionMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitExtensionMember(this);
		}
	}

	public final ExtensionMemberContext extensionMember() throws RecognitionException {
		ExtensionMemberContext _localctx = new ExtensionMemberContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_extensionMember);
		try {
			setState(1673);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1671);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1672);
				compilerControlStatement();
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
		enterRule(_localctx, 290, RULE_subscriptDeclaration);
		try {
			setState(1687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1675);
				subscriptHead();
				setState(1676);
				subscriptResult();
				setState(1677);
				getterSetterBlock();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1679);
				subscriptHead();
				setState(1680);
				subscriptResult();
				setState(1681);
				getterSetterKeywordBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1683);
				subscriptHead();
				setState(1684);
				subscriptResult();
				setState(1685);
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
		enterRule(_localctx, 292, RULE_subscriptHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1690);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(1689);
				attributes();
				}
			}

			setState(1693);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 43)) & ~0x3f) == 0 && ((1L << (_la - 43)) & ((1L << (T__42 - 43)) | (1L << (T__43 - 43)) | (1L << (T__44 - 43)) | (1L << (T__45 - 43)) | (1L << (T__46 - 43)) | (1L << (T__47 - 43)) | (1L << (T__48 - 43)) | (1L << (T__49 - 43)) | (1L << (T__50 - 43)) | (1L << (T__51 - 43)) | (1L << (T__52 - 43)) | (1L << (T__53 - 43)) | (1L << (T__54 - 43)) | (1L << (T__57 - 43)) | (1L << (T__58 - 43)) | (1L << (T__60 - 43)) | (1L << (T__61 - 43)) | (1L << (T__62 - 43)) | (1L << (T__63 - 43)) | (1L << (T__64 - 43)) | (1L << (T__65 - 43)))) != 0)) {
				{
				setState(1692);
				declarationModifiers();
				}
			}

			setState(1695);
			match(T__89);
			setState(1696);
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
		enterRule(_localctx, 294, RULE_subscriptResult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1698);
			match(T__79);
			setState(1700);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
			case 1:
				{
				setState(1699);
				attributes();
				}
				break;
			}
			setState(1702);
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
		enterRule(_localctx, 296, RULE_operatorDeclaration);
		try {
			setState(1707);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__51:
				enterOuterAlt(_localctx, 1);
				{
				setState(1704);
				prefixOperatorDeclaration();
				}
				break;
			case T__50:
				enterOuterAlt(_localctx, 2);
				{
				setState(1705);
				postfixOperatorDeclaration();
				}
				break;
			case T__46:
				enterOuterAlt(_localctx, 3);
				{
				setState(1706);
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
		enterRule(_localctx, 298, RULE_prefixOperatorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1709);
			match(T__51);
			setState(1710);
			match(T__90);
			setState(1711);
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
		enterRule(_localctx, 300, RULE_postfixOperatorDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1713);
			match(T__50);
			setState(1714);
			match(T__90);
			setState(1715);
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

	public static class InfixOperatorDeclarationContext extends ParserRuleContext {
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public InfixOperatorGroupContext infixOperatorGroup() {
			return getRuleContext(InfixOperatorGroupContext.class,0);
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
		enterRule(_localctx, 302, RULE_infixOperatorDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1717);
			match(T__46);
			setState(1718);
			match(T__90);
			setState(1719);
			operator();
			setState(1721);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(1720);
				infixOperatorGroup();
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

	public static class InfixOperatorGroupContext extends ParserRuleContext {
		public PrecedenceGroupNameContext precedenceGroupName() {
			return getRuleContext(PrecedenceGroupNameContext.class,0);
		}
		public InfixOperatorGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_infixOperatorGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterInfixOperatorGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitInfixOperatorGroup(this);
		}
	}

	public final InfixOperatorGroupContext infixOperatorGroup() throws RecognitionException {
		InfixOperatorGroupContext _localctx = new InfixOperatorGroupContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_infixOperatorGroup);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1723);
			match(T__1);
			setState(1724);
			precedenceGroupName();
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

	public static class PrecedenceGroupDeclarationContext extends ParserRuleContext {
		public PrecedenceGroupNameContext precedenceGroupName() {
			return getRuleContext(PrecedenceGroupNameContext.class,0);
		}
		public PrecedenceGroupAttributesContext precedenceGroupAttributes() {
			return getRuleContext(PrecedenceGroupAttributesContext.class,0);
		}
		public PrecedenceGroupDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceGroupDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrecedenceGroupDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrecedenceGroupDeclaration(this);
		}
	}

	public final PrecedenceGroupDeclarationContext precedenceGroupDeclaration() throws RecognitionException {
		PrecedenceGroupDeclarationContext _localctx = new PrecedenceGroupDeclarationContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_precedenceGroupDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1726);
			match(T__91);
			setState(1727);
			precedenceGroupName();
			setState(1728);
			match(T__11);
			setState(1730);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (T__92 - 93)) | (1L << (T__93 - 93)) | (1L << (T__94 - 93)) | (1L << (T__95 - 93)))) != 0)) {
				{
				setState(1729);
				precedenceGroupAttributes();
				}
			}

			setState(1732);
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

	public static class PrecedenceGroupAttributesContext extends ParserRuleContext {
		public List<PrecedenceGroupAttributeContext> precedenceGroupAttribute() {
			return getRuleContexts(PrecedenceGroupAttributeContext.class);
		}
		public PrecedenceGroupAttributeContext precedenceGroupAttribute(int i) {
			return getRuleContext(PrecedenceGroupAttributeContext.class,i);
		}
		public PrecedenceGroupAttributesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceGroupAttributes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrecedenceGroupAttributes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrecedenceGroupAttributes(this);
		}
	}

	public final PrecedenceGroupAttributesContext precedenceGroupAttributes() throws RecognitionException {
		PrecedenceGroupAttributesContext _localctx = new PrecedenceGroupAttributesContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_precedenceGroupAttributes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1735); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1734);
				precedenceGroupAttribute();
				}
				}
				setState(1737); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((((_la - 93)) & ~0x3f) == 0 && ((1L << (_la - 93)) & ((1L << (T__92 - 93)) | (1L << (T__93 - 93)) | (1L << (T__94 - 93)) | (1L << (T__95 - 93)))) != 0) );
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

	public static class PrecedenceGroupAttributeContext extends ParserRuleContext {
		public PrecedenceGroupRelationContext precedenceGroupRelation() {
			return getRuleContext(PrecedenceGroupRelationContext.class,0);
		}
		public PrecedenceGroupAssignmentContext precedenceGroupAssignment() {
			return getRuleContext(PrecedenceGroupAssignmentContext.class,0);
		}
		public PrecedenceGroupAssociativityContext precedenceGroupAssociativity() {
			return getRuleContext(PrecedenceGroupAssociativityContext.class,0);
		}
		public PrecedenceGroupAttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceGroupAttribute; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrecedenceGroupAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrecedenceGroupAttribute(this);
		}
	}

	public final PrecedenceGroupAttributeContext precedenceGroupAttribute() throws RecognitionException {
		PrecedenceGroupAttributeContext _localctx = new PrecedenceGroupAttributeContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_precedenceGroupAttribute);
		try {
			setState(1742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__92:
			case T__93:
				enterOuterAlt(_localctx, 1);
				{
				setState(1739);
				precedenceGroupRelation();
				}
				break;
			case T__94:
				enterOuterAlt(_localctx, 2);
				{
				setState(1740);
				precedenceGroupAssignment();
				}
				break;
			case T__95:
				enterOuterAlt(_localctx, 3);
				{
				setState(1741);
				precedenceGroupAssociativity();
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

	public static class PrecedenceGroupRelationContext extends ParserRuleContext {
		public PrecedenceGroupNamesContext precedenceGroupNames() {
			return getRuleContext(PrecedenceGroupNamesContext.class,0);
		}
		public PrecedenceGroupRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceGroupRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrecedenceGroupRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrecedenceGroupRelation(this);
		}
	}

	public final PrecedenceGroupRelationContext precedenceGroupRelation() throws RecognitionException {
		PrecedenceGroupRelationContext _localctx = new PrecedenceGroupRelationContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_precedenceGroupRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			_la = _input.LA(1);
			if ( !(_la==T__92 || _la==T__93) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1745);
			match(T__1);
			setState(1746);
			precedenceGroupNames();
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

	public static class PrecedenceGroupAssignmentContext extends ParserRuleContext {
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public PrecedenceGroupAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceGroupAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrecedenceGroupAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrecedenceGroupAssignment(this);
		}
	}

	public final PrecedenceGroupAssignmentContext precedenceGroupAssignment() throws RecognitionException {
		PrecedenceGroupAssignmentContext _localctx = new PrecedenceGroupAssignmentContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_precedenceGroupAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1748);
			match(T__94);
			setState(1749);
			match(T__1);
			setState(1750);
			booleanLiteral();
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

	public static class PrecedenceGroupAssociativityContext extends ParserRuleContext {
		public PrecedenceGroupAssociativityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceGroupAssociativity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrecedenceGroupAssociativity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrecedenceGroupAssociativity(this);
		}
	}

	public final PrecedenceGroupAssociativityContext precedenceGroupAssociativity() throws RecognitionException {
		PrecedenceGroupAssociativityContext _localctx = new PrecedenceGroupAssociativityContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_precedenceGroupAssociativity);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			match(T__95);
			setState(1753);
			match(T__1);
			setState(1754);
			_la = _input.LA(1);
			if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (T__96 - 97)) | (1L << (T__97 - 97)) | (1L << (T__98 - 97)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class PrecedenceGroupNamesContext extends ParserRuleContext {
		public List<PrecedenceGroupNameContext> precedenceGroupName() {
			return getRuleContexts(PrecedenceGroupNameContext.class);
		}
		public PrecedenceGroupNameContext precedenceGroupName(int i) {
			return getRuleContext(PrecedenceGroupNameContext.class,i);
		}
		public PrecedenceGroupNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceGroupNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrecedenceGroupNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrecedenceGroupNames(this);
		}
	}

	public final PrecedenceGroupNamesContext precedenceGroupNames() throws RecognitionException {
		PrecedenceGroupNamesContext _localctx = new PrecedenceGroupNamesContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_precedenceGroupNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1756);
			precedenceGroupName();
			setState(1761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(1757);
				match(T__13);
				setState(1758);
				precedenceGroupName();
				}
				}
				setState(1763);
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

	public static class PrecedenceGroupNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PrecedenceGroupNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precedenceGroupName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPrecedenceGroupName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPrecedenceGroupName(this);
		}
	}

	public final PrecedenceGroupNameContext precedenceGroupName() throws RecognitionException {
		PrecedenceGroupNameContext _localctx = new PrecedenceGroupNameContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_precedenceGroupName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1764);
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
		int _startState = 322;
		enterRecursionRule(_localctx, 322, RULE_pattern, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1787);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
			case 1:
				{
				setState(1767);
				wildcardPattern();
				setState(1769);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1768);
					typeAnnotation();
					}
					break;
				}
				}
				break;
			case 2:
				{
				setState(1772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__81) {
					{
					setState(1771);
					wildcardPattern();
					}
				}

				setState(1774);
				identifierPattern();
				setState(1776);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1775);
					typeAnnotation();
					}
					break;
				}
				}
				break;
			case 3:
				{
				setState(1778);
				valueBindingPattern();
				}
				break;
			case 4:
				{
				setState(1779);
				tuplePattern();
				setState(1781);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1780);
					typeAnnotation();
					}
					break;
				}
				}
				break;
			case 5:
				{
				setState(1783);
				enumCasePattern();
				}
				break;
			case 6:
				{
				setState(1784);
				match(T__99);
				setState(1785);
				sType(0);
				}
				break;
			case 7:
				{
				setState(1786);
				expressionPattern();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1794);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new PatternContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pattern);
					setState(1789);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1790);
					match(T__100);
					setState(1791);
					sType(0);
					}
					} 
				}
				setState(1796);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,211,_ctx);
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
		enterRule(_localctx, 324, RULE_wildcardPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1797);
			match(T__81);
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
		enterRule(_localctx, 326, RULE_identifierPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1799);
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
		enterRule(_localctx, 328, RULE_valueBindingPattern);
		try {
			setState(1805);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__24:
				enterOuterAlt(_localctx, 1);
				{
				setState(1801);
				match(T__24);
				setState(1802);
				pattern(0);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(1803);
				match(T__23);
				setState(1804);
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
		enterRule(_localctx, 330, RULE_tuplePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1807);
			match(T__27);
			setState(1809);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (T__129 - 130)) | (1L << (T__130 - 130)) | (1L << (T__131 - 130)) | (1L << (T__132 - 130)) | (1L << (T__133 - 130)) | (1L << (T__134 - 130)) | (1L << (T__135 - 130)) | (1L << (T__136 - 130)) | (1L << (T__137 - 130)) | (1L << (T__138 - 130)) | (1L << (T__139 - 130)) | (1L << (T__140 - 130)) | (1L << (T__141 - 130)) | (1L << (T__142 - 130)) | (1L << (T__143 - 130)) | (1L << (T__144 - 130)) | (1L << (T__145 - 130)) | (1L << (T__147 - 130)) | (1L << (T__148 - 130)) | (1L << (T__149 - 130)) | (1L << (T__150 - 130)) | (1L << (T__152 - 130)) | (1L << (T__153 - 130)) | (1L << (T__154 - 130)) | (1L << (T__155 - 130)) | (1L << (T__156 - 130)) | (1L << (T__157 - 130)) | (1L << (T__158 - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NilLiteral - 130)) | (1L << (OperatorHead - 130)) | (1L << (DotOperatorHead - 130)) | (1L << (Identifier - 130)) | (1L << (BinaryLiteral - 130)) | (1L << (OctalLiteral - 130)) | (1L << (DecimalLiteral - 130)) | (1L << (HexadecimalLiteral - 130)) | (1L << (FloatingPointLiteral - 130)) | (1L << (StringLiteral - 130)))) != 0)) {
				{
				setState(1808);
				tuplePatternElementList();
				}
			}

			setState(1811);
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
		enterRule(_localctx, 332, RULE_tuplePatternElementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1813);
			tuplePatternElement();
			setState(1818);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(1814);
				match(T__13);
				setState(1815);
				tuplePatternElement();
				}
				}
				setState(1820);
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
		enterRule(_localctx, 334, RULE_tuplePatternElement);
		try {
			setState(1826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1821);
				pattern(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1822);
				identifier();
				setState(1823);
				match(T__1);
				setState(1824);
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
		enterRule(_localctx, 336, RULE_enumCasePattern);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
			case 1:
				{
				setState(1828);
				typeIdentifier();
				}
				break;
			}
			setState(1832);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__72) {
				{
				setState(1831);
				match(T__72);
				}
			}

			setState(1834);
			enumCaseName();
			setState(1836);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				{
				setState(1835);
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
		enterRule(_localctx, 338, RULE_typeCastingPattern);
		try {
			setState(1840);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1838);
				isPattern();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1839);
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
		enterRule(_localctx, 340, RULE_isPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1842);
			match(T__99);
			setState(1843);
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
		enterRule(_localctx, 342, RULE_asPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1845);
			pattern(0);
			setState(1846);
			match(T__100);
			setState(1847);
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
		enterRule(_localctx, 344, RULE_expressionPattern);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1849);
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
		enterRule(_localctx, 346, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1851);
			match(T__101);
			setState(1852);
			attributeName();
			setState(1854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
			case 1:
				{
				setState(1853);
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
		enterRule(_localctx, 348, RULE_attributeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1856);
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
		enterRule(_localctx, 350, RULE_attributeArgumentClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1858);
			match(T__27);
			setState(1860);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (T__129 - 130)) | (1L << (T__130 - 130)) | (1L << (T__131 - 130)) | (1L << (T__132 - 130)) | (1L << (T__133 - 130)) | (1L << (T__134 - 130)) | (1L << (T__135 - 130)) | (1L << (T__136 - 130)) | (1L << (T__137 - 130)) | (1L << (T__138 - 130)) | (1L << (T__139 - 130)) | (1L << (T__140 - 130)) | (1L << (T__141 - 130)) | (1L << (T__142 - 130)) | (1L << (T__143 - 130)) | (1L << (T__144 - 130)) | (1L << (T__145 - 130)) | (1L << (T__147 - 130)) | (1L << (T__148 - 130)) | (1L << (T__149 - 130)) | (1L << (T__150 - 130)) | (1L << (T__152 - 130)) | (1L << (T__153 - 130)) | (1L << (T__154 - 130)) | (1L << (T__155 - 130)) | (1L << (T__156 - 130)) | (1L << (T__157 - 130)) | (1L << (T__158 - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NilLiteral - 130)) | (1L << (OperatorHead - 130)) | (1L << (DotOperatorHead - 130)) | (1L << (Identifier - 130)) | (1L << (BinaryLiteral - 130)) | (1L << (OctalLiteral - 130)) | (1L << (DecimalLiteral - 130)) | (1L << (HexadecimalLiteral - 130)) | (1L << (FloatingPointLiteral - 130)) | (1L << (VersionLiteral - 130)) | (1L << (StringLiteral - 130)))) != 0)) {
				{
				setState(1859);
				balancedTokens();
				}
			}

			setState(1862);
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
		enterRule(_localctx, 352, RULE_attributes);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1865); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1864);
					attribute();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1867); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,222,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		enterRule(_localctx, 354, RULE_balancedTokens);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1870); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1869);
				balancedToken();
				}
				}
				setState(1872); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (T__129 - 130)) | (1L << (T__130 - 130)) | (1L << (T__131 - 130)) | (1L << (T__132 - 130)) | (1L << (T__133 - 130)) | (1L << (T__134 - 130)) | (1L << (T__135 - 130)) | (1L << (T__136 - 130)) | (1L << (T__137 - 130)) | (1L << (T__138 - 130)) | (1L << (T__139 - 130)) | (1L << (T__140 - 130)) | (1L << (T__141 - 130)) | (1L << (T__142 - 130)) | (1L << (T__143 - 130)) | (1L << (T__144 - 130)) | (1L << (T__145 - 130)) | (1L << (T__147 - 130)) | (1L << (T__148 - 130)) | (1L << (T__149 - 130)) | (1L << (T__150 - 130)) | (1L << (T__152 - 130)) | (1L << (T__153 - 130)) | (1L << (T__154 - 130)) | (1L << (T__155 - 130)) | (1L << (T__156 - 130)) | (1L << (T__157 - 130)) | (1L << (T__158 - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NilLiteral - 130)) | (1L << (OperatorHead - 130)) | (1L << (DotOperatorHead - 130)) | (1L << (Identifier - 130)) | (1L << (BinaryLiteral - 130)) | (1L << (OctalLiteral - 130)) | (1L << (DecimalLiteral - 130)) | (1L << (HexadecimalLiteral - 130)) | (1L << (FloatingPointLiteral - 130)) | (1L << (VersionLiteral - 130)) | (1L << (StringLiteral - 130)))) != 0) );
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
		enterRule(_localctx, 356, RULE_balancedToken);
		int _la;
		try {
			setState(1907);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1874);
				match(T__27);
				setState(1876);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (T__129 - 130)) | (1L << (T__130 - 130)) | (1L << (T__131 - 130)) | (1L << (T__132 - 130)) | (1L << (T__133 - 130)) | (1L << (T__134 - 130)) | (1L << (T__135 - 130)) | (1L << (T__136 - 130)) | (1L << (T__137 - 130)) | (1L << (T__138 - 130)) | (1L << (T__139 - 130)) | (1L << (T__140 - 130)) | (1L << (T__141 - 130)) | (1L << (T__142 - 130)) | (1L << (T__143 - 130)) | (1L << (T__144 - 130)) | (1L << (T__145 - 130)) | (1L << (T__147 - 130)) | (1L << (T__148 - 130)) | (1L << (T__149 - 130)) | (1L << (T__150 - 130)) | (1L << (T__152 - 130)) | (1L << (T__153 - 130)) | (1L << (T__154 - 130)) | (1L << (T__155 - 130)) | (1L << (T__156 - 130)) | (1L << (T__157 - 130)) | (1L << (T__158 - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NilLiteral - 130)) | (1L << (OperatorHead - 130)) | (1L << (DotOperatorHead - 130)) | (1L << (Identifier - 130)) | (1L << (BinaryLiteral - 130)) | (1L << (OctalLiteral - 130)) | (1L << (DecimalLiteral - 130)) | (1L << (HexadecimalLiteral - 130)) | (1L << (FloatingPointLiteral - 130)) | (1L << (VersionLiteral - 130)) | (1L << (StringLiteral - 130)))) != 0)) {
					{
					setState(1875);
					balancedTokens();
					}
				}

				setState(1878);
				match(T__28);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1879);
				match(T__102);
				setState(1881);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (T__129 - 130)) | (1L << (T__130 - 130)) | (1L << (T__131 - 130)) | (1L << (T__132 - 130)) | (1L << (T__133 - 130)) | (1L << (T__134 - 130)) | (1L << (T__135 - 130)) | (1L << (T__136 - 130)) | (1L << (T__137 - 130)) | (1L << (T__138 - 130)) | (1L << (T__139 - 130)) | (1L << (T__140 - 130)) | (1L << (T__141 - 130)) | (1L << (T__142 - 130)) | (1L << (T__143 - 130)) | (1L << (T__144 - 130)) | (1L << (T__145 - 130)) | (1L << (T__147 - 130)) | (1L << (T__148 - 130)) | (1L << (T__149 - 130)) | (1L << (T__150 - 130)) | (1L << (T__152 - 130)) | (1L << (T__153 - 130)) | (1L << (T__154 - 130)) | (1L << (T__155 - 130)) | (1L << (T__156 - 130)) | (1L << (T__157 - 130)) | (1L << (T__158 - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NilLiteral - 130)) | (1L << (OperatorHead - 130)) | (1L << (DotOperatorHead - 130)) | (1L << (Identifier - 130)) | (1L << (BinaryLiteral - 130)) | (1L << (OctalLiteral - 130)) | (1L << (DecimalLiteral - 130)) | (1L << (HexadecimalLiteral - 130)) | (1L << (FloatingPointLiteral - 130)) | (1L << (VersionLiteral - 130)) | (1L << (StringLiteral - 130)))) != 0)) {
					{
					setState(1880);
					balancedTokens();
					}
				}

				setState(1883);
				match(T__103);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1884);
				match(T__11);
				setState(1886);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__13) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__33) | (1L << T__34) | (1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__105 - 64)) | (1L << (T__106 - 64)) | (1L << (T__107 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (T__129 - 130)) | (1L << (T__130 - 130)) | (1L << (T__131 - 130)) | (1L << (T__132 - 130)) | (1L << (T__133 - 130)) | (1L << (T__134 - 130)) | (1L << (T__135 - 130)) | (1L << (T__136 - 130)) | (1L << (T__137 - 130)) | (1L << (T__138 - 130)) | (1L << (T__139 - 130)) | (1L << (T__140 - 130)) | (1L << (T__141 - 130)) | (1L << (T__142 - 130)) | (1L << (T__143 - 130)) | (1L << (T__144 - 130)) | (1L << (T__145 - 130)) | (1L << (T__147 - 130)) | (1L << (T__148 - 130)) | (1L << (T__149 - 130)) | (1L << (T__150 - 130)) | (1L << (T__152 - 130)) | (1L << (T__153 - 130)) | (1L << (T__154 - 130)) | (1L << (T__155 - 130)) | (1L << (T__156 - 130)) | (1L << (T__157 - 130)) | (1L << (T__158 - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NilLiteral - 130)) | (1L << (OperatorHead - 130)) | (1L << (DotOperatorHead - 130)) | (1L << (Identifier - 130)) | (1L << (BinaryLiteral - 130)) | (1L << (OctalLiteral - 130)) | (1L << (DecimalLiteral - 130)) | (1L << (HexadecimalLiteral - 130)) | (1L << (FloatingPointLiteral - 130)) | (1L << (VersionLiteral - 130)) | (1L << (StringLiteral - 130)))) != 0)) {
					{
					setState(1885);
					balancedTokens();
					}
				}

				setState(1888);
				match(T__12);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1889);
				identifier();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1890);
				expression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1891);
				contextSensitiveKeyword();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1892);
				literal();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1893);
				operator();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1894);
				match(VersionLiteral);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1895);
				availabilityArgument();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1896);
				match(T__1);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1897);
				match(T__0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1898);
				match(T__13);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1899);
				match(T__86);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1900);
				match(T__39);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1901);
				match(T__40);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1902);
				match(T__104);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1903);
				match(T__105);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1904);
				match(T__106);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1905);
				match(T__80);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1906);
				match(T__107);
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
		enterRule(_localctx, 358, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1910);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1909);
				tryOperator();
				}
				break;
			}
			setState(1912);
			prefixExpression();
			setState(1916);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1913);
					binaryExpression();
					}
					} 
				}
				setState(1918);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,229,_ctx);
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
		enterRule(_localctx, 360, RULE_prefixExpression);
		try {
			setState(1927);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,232,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1920);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,230,_ctx) ) {
				case 1:
					{
					setState(1919);
					prefixOperator();
					}
					break;
				}
				setState(1922);
				postfixExpression(0);
				setState(1924);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
				case 1:
					{
					setState(1923);
					match(T__0);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1926);
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
		enterRule(_localctx, 362, RULE_inOutExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1929);
			match(T__108);
			setState(1930);
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
		enterRule(_localctx, 364, RULE_tryOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1932);
			match(T__109);
			setState(1934);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,233,_ctx) ) {
			case 1:
				{
				setState(1933);
				_la = _input.LA(1);
				if ( !(_la==T__85 || _la==T__86) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
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
		enterRule(_localctx, 366, RULE_binaryExpression);
		try {
			setState(1952);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1936);
				binaryOperator();
				setState(1937);
				prefixExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1939);
				assignmentOperator();
				setState(1941);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
				case 1:
					{
					setState(1940);
					tryOperator();
					}
					break;
				}
				setState(1943);
				prefixExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1945);
				conditionalOperator();
				setState(1947);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,235,_ctx) ) {
				case 1:
					{
					setState(1946);
					tryOperator();
					}
					break;
				}
				setState(1949);
				prefixExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1951);
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
		enterRule(_localctx, 368, RULE_assignmentOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1954);
			match(T__73);
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
		enterRule(_localctx, 370, RULE_conditionalOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1956);
			match(T__85);
			setState(1958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,237,_ctx) ) {
			case 1:
				{
				setState(1957);
				tryOperator();
				}
				break;
			}
			setState(1960);
			expression();
			setState(1961);
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
		enterRule(_localctx, 372, RULE_typeCastingOperator);
		try {
			setState(1973);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1963);
				match(T__99);
				setState(1964);
				sType(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1965);
				match(T__100);
				setState(1966);
				match(T__85);
				setState(1967);
				sType(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1968);
				match(T__100);
				setState(1969);
				sType(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1970);
				match(T__100);
				setState(1971);
				match(T__86);
				setState(1972);
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
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public ContextSensitiveKeywordContext contextSensitiveKeyword() {
			return getRuleContext(ContextSensitiveKeywordContext.class,0);
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
		public TupleExpressionContext tupleExpression() {
			return getRuleContext(TupleExpressionContext.class,0);
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
		public KeyPathExpressionContext keyPathExpression() {
			return getRuleContext(KeyPathExpressionContext.class,0);
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
		enterRule(_localctx, 374, RULE_primaryExpression);
		try {
			setState(1994);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1979);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,239,_ctx) ) {
				case 1:
					{
					setState(1975);
					identifier();
					}
					break;
				case 2:
					{
					setState(1976);
					operator();
					}
					break;
				case 3:
					{
					setState(1977);
					keyword();
					}
					break;
				case 4:
					{
					setState(1978);
					contextSensitiveKeyword();
					}
					break;
				}
				setState(1982);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,240,_ctx) ) {
				case 1:
					{
					setState(1981);
					genericArgumentClause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1984);
				literalExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1985);
				selfExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1986);
				superclassExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1987);
				closureExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1988);
				parenthesizedExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1989);
				tupleExpression();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1990);
				implicitMemberExpression();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1991);
				wildcardExpression();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1992);
				selectorExpression();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1993);
				keyPathExpression();
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
		public PlaygroundLiteralContext playgroundLiteral() {
			return getRuleContext(PlaygroundLiteralContext.class,0);
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
		enterRule(_localctx, 376, RULE_literalExpression);
		try {
			setState(2004);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,242,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1996);
				literal();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1997);
				arrayLiteral();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1998);
				dictionaryLiteral();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1999);
				playgroundLiteral();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2000);
				match(T__110);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2001);
				match(T__111);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2002);
				match(T__112);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2003);
				match(T__113);
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
		enterRule(_localctx, 378, RULE_arrayLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2006);
			match(T__102);
			setState(2008);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (T__129 - 130)) | (1L << (T__130 - 130)) | (1L << (T__131 - 130)) | (1L << (T__132 - 130)) | (1L << (T__133 - 130)) | (1L << (T__134 - 130)) | (1L << (T__135 - 130)) | (1L << (T__136 - 130)) | (1L << (T__137 - 130)) | (1L << (T__138 - 130)) | (1L << (T__139 - 130)) | (1L << (T__140 - 130)) | (1L << (T__141 - 130)) | (1L << (T__142 - 130)) | (1L << (T__143 - 130)) | (1L << (T__144 - 130)) | (1L << (T__145 - 130)) | (1L << (T__147 - 130)) | (1L << (T__148 - 130)) | (1L << (T__149 - 130)) | (1L << (T__150 - 130)) | (1L << (T__152 - 130)) | (1L << (T__153 - 130)) | (1L << (T__154 - 130)) | (1L << (T__155 - 130)) | (1L << (T__156 - 130)) | (1L << (T__157 - 130)) | (1L << (T__158 - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NilLiteral - 130)) | (1L << (OperatorHead - 130)) | (1L << (DotOperatorHead - 130)) | (1L << (Identifier - 130)) | (1L << (BinaryLiteral - 130)) | (1L << (OctalLiteral - 130)) | (1L << (DecimalLiteral - 130)) | (1L << (HexadecimalLiteral - 130)) | (1L << (FloatingPointLiteral - 130)) | (1L << (StringLiteral - 130)))) != 0)) {
				{
				setState(2007);
				arrayLiteralItems();
				}
			}

			setState(2010);
			match(T__103);
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
		enterRule(_localctx, 380, RULE_arrayLiteralItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2012);
			arrayLiteralItem();
			setState(2017);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2013);
					match(T__13);
					setState(2014);
					arrayLiteralItem();
					}
					} 
				}
				setState(2019);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,244,_ctx);
			}
			setState(2021);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(2020);
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
		enterRule(_localctx, 382, RULE_arrayLiteralItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2023);
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
		enterRule(_localctx, 384, RULE_dictionaryLiteral);
		try {
			setState(2032);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,246,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2025);
				match(T__102);
				setState(2026);
				dictionaryLiteralItems();
				setState(2027);
				match(T__103);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2029);
				match(T__102);
				setState(2030);
				match(T__1);
				setState(2031);
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
		enterRule(_localctx, 386, RULE_dictionaryLiteralItems);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2034);
			dictionaryLiteralItem();
			setState(2039);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2035);
					match(T__13);
					setState(2036);
					dictionaryLiteralItem();
					}
					} 
				}
				setState(2041);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,247,_ctx);
			}
			setState(2043);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__13) {
				{
				setState(2042);
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
		enterRule(_localctx, 388, RULE_dictionaryLiteralItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2045);
			expression();
			setState(2046);
			match(T__1);
			setState(2047);
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

	public static class PlaygroundLiteralContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PlaygroundLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_playgroundLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPlaygroundLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPlaygroundLiteral(this);
		}
	}

	public final PlaygroundLiteralContext playgroundLiteral() throws RecognitionException {
		PlaygroundLiteralContext _localctx = new PlaygroundLiteralContext(_ctx, getState());
		enterRule(_localctx, 390, RULE_playgroundLiteral);
		try {
			setState(2082);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__114:
				enterOuterAlt(_localctx, 1);
				{
				setState(2049);
				match(T__114);
				setState(2050);
				match(T__27);
				setState(2051);
				match(T__115);
				setState(2052);
				match(T__1);
				setState(2053);
				expression();
				setState(2054);
				match(T__13);
				setState(2055);
				match(T__116);
				setState(2056);
				match(T__1);
				setState(2057);
				expression();
				setState(2058);
				match(T__13);
				setState(2059);
				match(T__117);
				setState(2060);
				match(T__1);
				setState(2061);
				expression();
				setState(2062);
				match(T__13);
				setState(2063);
				match(T__118);
				setState(2064);
				match(T__1);
				setState(2065);
				expression();
				setState(2066);
				match(T__28);
				}
				break;
			case T__119:
				enterOuterAlt(_localctx, 2);
				{
				setState(2068);
				match(T__119);
				setState(2069);
				match(T__27);
				setState(2070);
				match(T__120);
				setState(2071);
				match(T__1);
				setState(2072);
				expression();
				setState(2073);
				match(T__28);
				}
				break;
			case T__121:
				enterOuterAlt(_localctx, 3);
				{
				setState(2075);
				match(T__121);
				setState(2076);
				match(T__27);
				setState(2077);
				match(T__120);
				setState(2078);
				match(T__1);
				setState(2079);
				expression();
				setState(2080);
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

	public static class SelfExpressionContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TupleElementListContext tupleElementList() {
			return getRuleContext(TupleElementListContext.class,0);
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
		enterRule(_localctx, 392, RULE_selfExpression);
		try {
			setState(2096);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,250,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2084);
				match(T__122);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2085);
				match(T__122);
				setState(2086);
				match(T__72);
				setState(2087);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2088);
				match(T__122);
				setState(2089);
				match(T__102);
				setState(2090);
				tupleElementList();
				setState(2091);
				match(T__103);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2093);
				match(T__122);
				setState(2094);
				match(T__72);
				setState(2095);
				match(T__84);
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
		enterRule(_localctx, 394, RULE_superclassExpression);
		try {
			setState(2101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2098);
				superclassMethodExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2099);
				superclassSubscriptExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2100);
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
		enterRule(_localctx, 396, RULE_superclassMethodExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2103);
			match(T__123);
			setState(2104);
			match(T__72);
			setState(2105);
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
		public TupleElementListContext tupleElementList() {
			return getRuleContext(TupleElementListContext.class,0);
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
		enterRule(_localctx, 398, RULE_superclassSubscriptExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2107);
			match(T__123);
			setState(2108);
			match(T__102);
			setState(2109);
			tupleElementList();
			setState(2110);
			match(T__103);
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
		enterRule(_localctx, 400, RULE_superclassInitializerExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2112);
			match(T__123);
			setState(2113);
			match(T__72);
			setState(2114);
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
		enterRule(_localctx, 402, RULE_closureExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2116);
			match(T__11);
			setState(2118);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				{
				setState(2117);
				closureSignature();
				}
				break;
			}
			setState(2121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__91 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__101 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (T__129 - 130)) | (1L << (T__130 - 130)) | (1L << (T__131 - 130)) | (1L << (T__132 - 130)) | (1L << (T__133 - 130)) | (1L << (T__134 - 130)) | (1L << (T__135 - 130)) | (1L << (T__136 - 130)) | (1L << (T__137 - 130)) | (1L << (T__138 - 130)) | (1L << (T__139 - 130)) | (1L << (T__140 - 130)) | (1L << (T__141 - 130)) | (1L << (T__142 - 130)) | (1L << (T__143 - 130)) | (1L << (T__144 - 130)) | (1L << (T__145 - 130)) | (1L << (T__147 - 130)) | (1L << (T__148 - 130)) | (1L << (T__149 - 130)) | (1L << (T__150 - 130)) | (1L << (T__151 - 130)) | (1L << (T__152 - 130)) | (1L << (T__153 - 130)) | (1L << (T__154 - 130)) | (1L << (T__155 - 130)) | (1L << (T__156 - 130)) | (1L << (T__157 - 130)) | (1L << (T__158 - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NilLiteral - 130)) | (1L << (OperatorHead - 130)) | (1L << (DotOperatorHead - 130)) | (1L << (Identifier - 130)) | (1L << (BinaryLiteral - 130)) | (1L << (OctalLiteral - 130)) | (1L << (DecimalLiteral - 130)) | (1L << (HexadecimalLiteral - 130)) | (1L << (FloatingPointLiteral - 130)) | (1L << (StringLiteral - 130)))) != 0)) {
				{
				setState(2120);
				statements();
				}
			}

			setState(2123);
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
		public ClosureParameterClauseContext closureParameterClause() {
			return getRuleContext(ClosureParameterClauseContext.class,0);
		}
		public CaptureListContext captureList() {
			return getRuleContext(CaptureListContext.class,0);
		}
		public FunctionResultContext functionResult() {
			return getRuleContext(FunctionResultContext.class,0);
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
		enterRule(_localctx, 404, RULE_closureSignature);
		int _la;
		try {
			setState(2140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__102) {
					{
					setState(2125);
					captureList();
					}
				}

				setState(2128);
				closureParameterClause();
				setState(2130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__77) {
					{
					setState(2129);
					match(T__77);
					}
				}

				setState(2133);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__79) {
					{
					setState(2132);
					functionResult();
					}
				}

				setState(2135);
				match(T__4);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2137);
				captureList();
				setState(2138);
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

	public static class ClosureParameterClauseContext extends ParserRuleContext {
		public ClosureParameterListContext closureParameterList() {
			return getRuleContext(ClosureParameterListContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public ClosureParameterClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureParameterClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClosureParameterClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClosureParameterClause(this);
		}
	}

	public final ClosureParameterClauseContext closureParameterClause() throws RecognitionException {
		ClosureParameterClauseContext _localctx = new ClosureParameterClauseContext(_ctx, getState());
		enterRule(_localctx, 406, RULE_closureParameterClause);
		try {
			setState(2149);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,258,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2142);
				match(T__27);
				setState(2143);
				match(T__28);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2144);
				match(T__27);
				setState(2145);
				closureParameterList();
				setState(2146);
				match(T__28);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2148);
				identifierList();
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

	public static class ClosureParameterListContext extends ParserRuleContext {
		public ClosureParameterContext closureParameter() {
			return getRuleContext(ClosureParameterContext.class,0);
		}
		public List<ClosureParameterListContext> closureParameterList() {
			return getRuleContexts(ClosureParameterListContext.class);
		}
		public ClosureParameterListContext closureParameterList(int i) {
			return getRuleContext(ClosureParameterListContext.class,i);
		}
		public ClosureParameterListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureParameterList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClosureParameterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClosureParameterList(this);
		}
	}

	public final ClosureParameterListContext closureParameterList() throws RecognitionException {
		ClosureParameterListContext _localctx = new ClosureParameterListContext(_ctx, getState());
		enterRule(_localctx, 408, RULE_closureParameterList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2151);
			closureParameter();
			setState(2156);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2152);
					match(T__13);
					setState(2153);
					closureParameterList();
					}
					} 
				}
				setState(2158);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,259,_ctx);
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

	public static class ClosureParameterContext extends ParserRuleContext {
		public ClosureParameterNameContext closureParameterName() {
			return getRuleContext(ClosureParameterNameContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public ClosureParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClosureParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClosureParameter(this);
		}
	}

	public final ClosureParameterContext closureParameter() throws RecognitionException {
		ClosureParameterContext _localctx = new ClosureParameterContext(_ctx, getState());
		enterRule(_localctx, 410, RULE_closureParameter);
		int _la;
		try {
			setState(2167);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,261,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2159);
				closureParameterName();
				setState(2161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(2160);
					typeAnnotation();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2163);
				closureParameterName();
				setState(2164);
				typeAnnotation();
				setState(2165);
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

	public static class ClosureParameterNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ClosureParameterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_closureParameterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterClosureParameterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitClosureParameterName(this);
		}
	}

	public final ClosureParameterNameContext closureParameterName() throws RecognitionException {
		ClosureParameterNameContext _localctx = new ClosureParameterNameContext(_ctx, getState());
		enterRule(_localctx, 412, RULE_closureParameterName);
		try {
			setState(2171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__24:
			case T__30:
			case T__31:
			case T__32:
			case T__34:
			case T__36:
			case T__38:
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
			case T__54:
			case T__55:
			case T__57:
			case T__59:
			case T__64:
			case T__65:
			case T__74:
			case T__75:
			case T__76:
			case T__82:
			case T__90:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__115:
			case T__116:
			case T__117:
			case T__118:
			case T__120:
			case T__130:
			case T__131:
			case T__135:
			case T__136:
			case T__138:
			case T__144:
			case T__145:
			case T__147:
			case T__148:
			case T__149:
			case T__150:
			case T__152:
			case T__153:
			case T__157:
			case T__158:
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2169);
				identifier();
				}
				break;
			case T__81:
				enterOuterAlt(_localctx, 2);
				{
				setState(2170);
				match(T__81);
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
		enterRule(_localctx, 414, RULE_captureList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2173);
			match(T__102);
			setState(2174);
			captureListItems();
			setState(2175);
			match(T__103);
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
		enterRule(_localctx, 416, RULE_captureListItems);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2177);
			captureListItem();
			setState(2182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(2178);
				match(T__13);
				setState(2179);
				captureListItem();
				}
				}
				setState(2184);
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
		enterRule(_localctx, 418, RULE_captureListItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
			case 1:
				{
				setState(2185);
				captureSpecifier();
				}
				break;
			}
			setState(2188);
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
		enterRule(_localctx, 420, RULE_captureSpecifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2190);
			_la = _input.LA(1);
			if ( !(_la==T__54 || _la==T__57 || _la==T__124 || _la==T__125) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
		enterRule(_localctx, 422, RULE_implicitMemberExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2192);
			match(T__72);
			setState(2193);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		enterRule(_localctx, 424, RULE_parenthesizedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2195);
			match(T__27);
			setState(2196);
			expression();
			setState(2197);
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

	public static class TupleExpressionContext extends ParserRuleContext {
		public TupleElementListContext tupleElementList() {
			return getRuleContext(TupleElementListContext.class,0);
		}
		public TupleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTupleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTupleExpression(this);
		}
	}

	public final TupleExpressionContext tupleExpression() throws RecognitionException {
		TupleExpressionContext _localctx = new TupleExpressionContext(_ctx, getState());
		enterRule(_localctx, 426, RULE_tupleExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2199);
			match(T__27);
			setState(2201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (T__129 - 130)) | (1L << (T__130 - 130)) | (1L << (T__131 - 130)) | (1L << (T__132 - 130)) | (1L << (T__133 - 130)) | (1L << (T__134 - 130)) | (1L << (T__135 - 130)) | (1L << (T__136 - 130)) | (1L << (T__137 - 130)) | (1L << (T__138 - 130)) | (1L << (T__139 - 130)) | (1L << (T__140 - 130)) | (1L << (T__141 - 130)) | (1L << (T__142 - 130)) | (1L << (T__143 - 130)) | (1L << (T__144 - 130)) | (1L << (T__145 - 130)) | (1L << (T__147 - 130)) | (1L << (T__148 - 130)) | (1L << (T__149 - 130)) | (1L << (T__150 - 130)) | (1L << (T__152 - 130)) | (1L << (T__153 - 130)) | (1L << (T__154 - 130)) | (1L << (T__155 - 130)) | (1L << (T__156 - 130)) | (1L << (T__157 - 130)) | (1L << (T__158 - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NilLiteral - 130)) | (1L << (OperatorHead - 130)) | (1L << (DotOperatorHead - 130)) | (1L << (Identifier - 130)) | (1L << (BinaryLiteral - 130)) | (1L << (OctalLiteral - 130)) | (1L << (DecimalLiteral - 130)) | (1L << (HexadecimalLiteral - 130)) | (1L << (FloatingPointLiteral - 130)) | (1L << (StringLiteral - 130)))) != 0)) {
				{
				setState(2200);
				tupleElementList();
				}
			}

			setState(2203);
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

	public static class TupleElementListContext extends ParserRuleContext {
		public List<TupleElementContext> tupleElement() {
			return getRuleContexts(TupleElementContext.class);
		}
		public TupleElementContext tupleElement(int i) {
			return getRuleContext(TupleElementContext.class,i);
		}
		public TupleElementListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleElementList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTupleElementList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTupleElementList(this);
		}
	}

	public final TupleElementListContext tupleElementList() throws RecognitionException {
		TupleElementListContext _localctx = new TupleElementListContext(_ctx, getState());
		enterRule(_localctx, 428, RULE_tupleElementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2205);
			tupleElement();
			setState(2210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(2206);
				match(T__13);
				setState(2207);
				tupleElement();
				}
				}
				setState(2212);
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

	public static class TupleElementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TupleElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupleElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterTupleElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitTupleElement(this);
		}
	}

	public final TupleElementContext tupleElement() throws RecognitionException {
		TupleElementContext _localctx = new TupleElementContext(_ctx, getState());
		enterRule(_localctx, 430, RULE_tupleElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2216);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,267,_ctx) ) {
			case 1:
				{
				setState(2213);
				identifier();
				setState(2214);
				match(T__1);
				}
				break;
			}
			setState(2218);
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
		enterRule(_localctx, 432, RULE_wildcardExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2220);
			match(T__81);
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
		enterRule(_localctx, 434, RULE_selectorExpression);
		int _la;
		try {
			setState(2233);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2222);
				match(T__126);
				setState(2223);
				match(T__27);
				setState(2224);
				expression();
				setState(2225);
				match(T__28);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2227);
				match(T__126);
				setState(2228);
				match(T__27);
				setState(2229);
				_la = _input.LA(1);
				if ( !(_la==T__127 || _la==T__128) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2230);
				expression();
				setState(2231);
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

	public static class KeyPathExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public KeyPathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyPathExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterKeyPathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitKeyPathExpression(this);
		}
	}

	public final KeyPathExpressionContext keyPathExpression() throws RecognitionException {
		KeyPathExpressionContext _localctx = new KeyPathExpressionContext(_ctx, getState());
		enterRule(_localctx, 436, RULE_keyPathExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2235);
			match(T__129);
			setState(2236);
			match(T__27);
			setState(2237);
			expression();
			setState(2238);
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
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
		public FunctionCallArgumentClauseContext functionCallArgumentClause() {
			return getRuleContext(FunctionCallArgumentClauseContext.class,0);
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
		public TupleElementListContext tupleElementList() {
			return getRuleContext(TupleElementListContext.class,0);
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
		public FunctionCallArgumentClauseContext functionCallArgumentClause() {
			return getRuleContext(FunctionCallArgumentClauseContext.class,0);
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
		int _startState = 438;
		enterRecursionRule(_localctx, 438, RULE_postfixExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2249);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
			case 1:
				{
				_localctx = new PrimaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2241);
				primaryExpression();
				}
				break;
			case 2:
				{
				_localctx = new DynamicTypeExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2242);
				match(T__130);
				setState(2243);
				match(T__27);
				setState(2244);
				match(T__131);
				setState(2245);
				match(T__1);
				setState(2246);
				expression();
				setState(2247);
				match(T__28);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2300);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2298);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
					case 1:
						{
						_localctx = new PostfixOperationContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2251);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(2252);
						postfixOperator();
						}
						break;
					case 2:
						{
						_localctx = new FunctionCallWithClosureExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2253);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(2255);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__27) {
							{
							setState(2254);
							functionCallArgumentClause();
							}
						}

						setState(2257);
						closureExpression();
						}
						break;
					case 3:
						{
						_localctx = new FunctionCallExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2258);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(2259);
						functionCallArgumentClause();
						}
						break;
					case 4:
						{
						_localctx = new InitializerExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2260);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(2261);
						match(T__72);
						setState(2262);
						match(T__84);
						}
						break;
					case 5:
						{
						_localctx = new InitializerExpressionWithArgumentsContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2263);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2264);
						match(T__72);
						setState(2265);
						match(T__84);
						setState(2266);
						match(T__27);
						setState(2267);
						argumentNames();
						setState(2268);
						match(T__28);
						}
						break;
					case 6:
						{
						_localctx = new ExplicitMemberExpression1Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2270);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(2271);
						match(T__72);
						setState(2272);
						match(DecimalLiteral);
						}
						break;
					case 7:
						{
						_localctx = new ExplicitMemberExpression2Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2273);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2274);
						match(T__72);
						setState(2275);
						identifier();
						setState(2277);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
						case 1:
							{
							setState(2276);
							genericArgumentClause();
							}
							break;
						}
						}
						break;
					case 8:
						{
						_localctx = new ExplicitMemberExpression3Context(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2279);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2280);
						match(T__72);
						setState(2281);
						identifier();
						setState(2282);
						match(T__27);
						setState(2283);
						argumentNames();
						setState(2284);
						match(T__28);
						}
						break;
					case 9:
						{
						_localctx = new PostfixSelfExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2286);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2287);
						match(T__72);
						setState(2288);
						match(T__122);
						}
						break;
					case 10:
						{
						_localctx = new SubscriptExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2289);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2290);
						match(T__102);
						setState(2291);
						tupleElementList();
						setState(2292);
						match(T__103);
						}
						break;
					case 11:
						{
						_localctx = new ForcedValueExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2294);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2295);
						match(T__86);
						}
						break;
					case 12:
						{
						_localctx = new OptionalChainingExpressionContext(new PostfixExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_postfixExpression);
						setState(2296);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2297);
						match(T__85);
						}
						break;
					}
					} 
				}
				setState(2302);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
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

	public static class FunctionCallArgumentClauseContext extends ParserRuleContext {
		public FunctionCallArgumentListContext functionCallArgumentList() {
			return getRuleContext(FunctionCallArgumentListContext.class,0);
		}
		public FunctionCallArgumentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArgumentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionCallArgumentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionCallArgumentClause(this);
		}
	}

	public final FunctionCallArgumentClauseContext functionCallArgumentClause() throws RecognitionException {
		FunctionCallArgumentClauseContext _localctx = new FunctionCallArgumentClauseContext(_ctx, getState());
		enterRule(_localctx, 440, RULE_functionCallArgumentClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2303);
			match(T__27);
			setState(2305);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27) | (1L << T__29) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__39) | (1L << T__40) | (1L << T__41) | (1L << T__42) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__53) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__58) | (1L << T__59) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__64 - 64)) | (1L << (T__65 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__72 - 64)) | (1L << (T__73 - 64)) | (1L << (T__74 - 64)) | (1L << (T__75 - 64)) | (1L << (T__76 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__79 - 64)) | (1L << (T__80 - 64)) | (1L << (T__81 - 64)) | (1L << (T__82 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__85 - 64)) | (1L << (T__86 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__95 - 64)) | (1L << (T__96 - 64)) | (1L << (T__97 - 64)) | (1L << (T__98 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__102 - 64)) | (1L << (T__104 - 64)) | (1L << (T__106 - 64)) | (1L << (T__108 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__115 - 64)) | (1L << (T__116 - 64)) | (1L << (T__117 - 64)) | (1L << (T__118 - 64)) | (1L << (T__119 - 64)) | (1L << (T__120 - 64)) | (1L << (T__121 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 130)) & ~0x3f) == 0 && ((1L << (_la - 130)) & ((1L << (T__129 - 130)) | (1L << (T__130 - 130)) | (1L << (T__131 - 130)) | (1L << (T__132 - 130)) | (1L << (T__133 - 130)) | (1L << (T__134 - 130)) | (1L << (T__135 - 130)) | (1L << (T__136 - 130)) | (1L << (T__137 - 130)) | (1L << (T__138 - 130)) | (1L << (T__139 - 130)) | (1L << (T__140 - 130)) | (1L << (T__141 - 130)) | (1L << (T__142 - 130)) | (1L << (T__143 - 130)) | (1L << (T__144 - 130)) | (1L << (T__145 - 130)) | (1L << (T__147 - 130)) | (1L << (T__148 - 130)) | (1L << (T__149 - 130)) | (1L << (T__150 - 130)) | (1L << (T__152 - 130)) | (1L << (T__153 - 130)) | (1L << (T__154 - 130)) | (1L << (T__155 - 130)) | (1L << (T__156 - 130)) | (1L << (T__157 - 130)) | (1L << (T__158 - 130)) | (1L << (BooleanLiteral - 130)) | (1L << (NilLiteral - 130)) | (1L << (OperatorHead - 130)) | (1L << (DotOperatorHead - 130)) | (1L << (Identifier - 130)) | (1L << (BinaryLiteral - 130)) | (1L << (OctalLiteral - 130)) | (1L << (DecimalLiteral - 130)) | (1L << (HexadecimalLiteral - 130)) | (1L << (FloatingPointLiteral - 130)) | (1L << (StringLiteral - 130)))) != 0)) {
				{
				setState(2304);
				functionCallArgumentList();
				}
			}

			setState(2307);
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

	public static class FunctionCallArgumentListContext extends ParserRuleContext {
		public List<FunctionCallArgumentContext> functionCallArgument() {
			return getRuleContexts(FunctionCallArgumentContext.class);
		}
		public FunctionCallArgumentContext functionCallArgument(int i) {
			return getRuleContext(FunctionCallArgumentContext.class,i);
		}
		public FunctionCallArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionCallArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionCallArgumentList(this);
		}
	}

	public final FunctionCallArgumentListContext functionCallArgumentList() throws RecognitionException {
		FunctionCallArgumentListContext _localctx = new FunctionCallArgumentListContext(_ctx, getState());
		enterRule(_localctx, 442, RULE_functionCallArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2309);
			functionCallArgument();
			setState(2314);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(2310);
				match(T__13);
				setState(2311);
				functionCallArgument();
				}
				}
				setState(2316);
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

	public static class FunctionCallArgumentContext extends ParserRuleContext {
		public FunctionCallIdentifierContext functionCallIdentifier() {
			return getRuleContext(FunctionCallIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public FunctionCallArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionCallArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionCallArgument(this);
		}
	}

	public final FunctionCallArgumentContext functionCallArgument() throws RecognitionException {
		FunctionCallArgumentContext _localctx = new FunctionCallArgumentContext(_ctx, getState());
		enterRule(_localctx, 444, RULE_functionCallArgument);
		try {
			setState(2333);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,279,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2317);
				functionCallIdentifier();
				setState(2318);
				match(T__1);
				}
				setState(2322);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
				case 1:
					{
					setState(2320);
					expression();
					}
					break;
				case 2:
					{
					setState(2321);
					operator();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2327);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,277,_ctx) ) {
				case 1:
					{
					setState(2324);
					functionCallIdentifier();
					setState(2325);
					match(T__1);
					}
					break;
				}
				setState(2331);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,278,_ctx) ) {
				case 1:
					{
					setState(2329);
					expression();
					}
					break;
				case 2:
					{
					setState(2330);
					operator();
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

	public static class FunctionCallIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public FunctionCallIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCallIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionCallIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionCallIdentifier(this);
		}
	}

	public final FunctionCallIdentifierContext functionCallIdentifier() throws RecognitionException {
		FunctionCallIdentifierContext _localctx = new FunctionCallIdentifierContext(_ctx, getState());
		enterRule(_localctx, 446, RULE_functionCallIdentifier);
		try {
			setState(2337);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,280,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2335);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2336);
				keyword();
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
		enterRule(_localctx, 448, RULE_argumentNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2340); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2339);
				argumentName();
				}
				}
				setState(2342); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__24) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__59))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__74 - 65)) | (1L << (T__75 - 65)) | (1L << (T__76 - 65)) | (1L << (T__81 - 65)) | (1L << (T__82 - 65)) | (1L << (T__90 - 65)) | (1L << (T__95 - 65)) | (1L << (T__96 - 65)) | (1L << (T__97 - 65)) | (1L << (T__98 - 65)) | (1L << (T__115 - 65)) | (1L << (T__116 - 65)) | (1L << (T__117 - 65)) | (1L << (T__118 - 65)) | (1L << (T__120 - 65)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (T__130 - 131)) | (1L << (T__131 - 131)) | (1L << (T__135 - 131)) | (1L << (T__136 - 131)) | (1L << (T__138 - 131)) | (1L << (T__144 - 131)) | (1L << (T__145 - 131)) | (1L << (T__147 - 131)) | (1L << (T__148 - 131)) | (1L << (T__149 - 131)) | (1L << (T__150 - 131)) | (1L << (T__152 - 131)) | (1L << (T__153 - 131)) | (1L << (T__157 - 131)) | (1L << (T__158 - 131)) | (1L << (Identifier - 131)))) != 0) );
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
		enterRule(_localctx, 450, RULE_argumentName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2346);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__24:
			case T__30:
			case T__31:
			case T__32:
			case T__34:
			case T__36:
			case T__38:
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
			case T__54:
			case T__55:
			case T__57:
			case T__59:
			case T__64:
			case T__65:
			case T__74:
			case T__75:
			case T__76:
			case T__82:
			case T__90:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__115:
			case T__116:
			case T__117:
			case T__118:
			case T__120:
			case T__130:
			case T__131:
			case T__135:
			case T__136:
			case T__138:
			case T__144:
			case T__145:
			case T__147:
			case T__148:
			case T__149:
			case T__150:
			case T__152:
			case T__153:
			case T__157:
			case T__158:
			case Identifier:
				{
				setState(2344);
				identifier();
				}
				break;
			case T__81:
				{
				setState(2345);
				match(T__81);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2348);
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
		enterRule(_localctx, 452, RULE_operatorHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2350);
			_la = _input.LA(1);
			if ( !(((((_la - 30)) & ~0x3f) == 0 && ((1L << (_la - 30)) & ((1L << (T__29 - 30)) | (1L << (T__39 - 30)) | (1L << (T__40 - 30)) | (1L << (T__41 - 30)) | (1L << (T__73 - 30)) | (1L << (T__79 - 30)) | (1L << (T__85 - 30)) | (1L << (T__86 - 30)))) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & ((1L << (T__104 - 105)) | (1L << (T__106 - 105)) | (1L << (T__108 - 105)) | (1L << (T__132 - 105)) | (1L << (T__133 - 105)) | (1L << (T__134 - 105)) | (1L << (OperatorHead - 105)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
		enterRule(_localctx, 454, RULE_operatorCharacter);
		try {
			setState(2354);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__39:
			case T__40:
			case T__41:
			case T__73:
			case T__79:
			case T__85:
			case T__86:
			case T__104:
			case T__106:
			case T__108:
			case T__132:
			case T__133:
			case T__134:
			case OperatorHead:
				enterOuterAlt(_localctx, 1);
				{
				setState(2352);
				operatorHead();
				}
				break;
			case OperatorCharacter:
				enterOuterAlt(_localctx, 2);
				{
				setState(2353);
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
		enterRule(_localctx, 456, RULE_operator);
		try {
			int _alt;
			setState(2371);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__29:
			case T__39:
			case T__40:
			case T__41:
			case T__73:
			case T__79:
			case T__85:
			case T__86:
			case T__104:
			case T__106:
			case T__108:
			case T__132:
			case T__133:
			case T__134:
			case OperatorHead:
				enterOuterAlt(_localctx, 1);
				{
				setState(2356);
				operatorHead();
				setState(2360);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2357);
						operatorCharacter();
						}
						} 
					}
					setState(2362);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,284,_ctx);
				}
				}
				break;
			case DotOperatorHead:
				enterOuterAlt(_localctx, 2);
				{
				setState(2363);
				match(DotOperatorHead);
				setState(2367);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2364);
						operatorCharacter();
						}
						} 
					}
					setState(2369);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,285,_ctx);
				}
				}
				break;
			case T__80:
				enterOuterAlt(_localctx, 3);
				{
				setState(2370);
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
		enterRule(_localctx, 458, RULE_binaryOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2373);
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
		enterRule(_localctx, 460, RULE_prefixOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2375);
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
		enterRule(_localctx, 462, RULE_postfixOperator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2377);
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
		public FunctionTypeContext functionType() {
			return getRuleContext(FunctionTypeContext.class,0);
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
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
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
		int _startState = 464;
		enterRecursionRule(_localctx, 464, RULE_sType, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				{
				setState(2380);
				arrayType();
				}
				break;
			case 2:
				{
				setState(2381);
				dictionaryType();
				}
				break;
			case 3:
				{
				setState(2382);
				functionType();
				}
				break;
			case 4:
				{
				setState(2383);
				typeIdentifier();
				}
				break;
			case 5:
				{
				setState(2384);
				tupleType();
				}
				break;
			case 6:
				{
				setState(2385);
				protocolCompositionType();
				}
				break;
			case 7:
				{
				setState(2386);
				match(T__137);
				}
				break;
			case 8:
				{
				setState(2387);
				match(T__138);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2402);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2400);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,288,_ctx) ) {
					case 1:
						{
						_localctx = new STypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sType);
						setState(2390);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2391);
						match(T__85);
						}
						break;
					case 2:
						{
						_localctx = new STypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sType);
						setState(2392);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2393);
						match(T__86);
						}
						break;
					case 3:
						{
						_localctx = new STypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sType);
						setState(2394);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2395);
						match(T__72);
						setState(2396);
						match(T__135);
						}
						break;
					case 4:
						{
						_localctx = new STypeContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_sType);
						setState(2397);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2398);
						match(T__72);
						setState(2399);
						match(T__136);
						}
						break;
					}
					} 
				}
				setState(2404);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,289,_ctx);
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

	public static class FunctionTypeContext extends ParserRuleContext {
		public FunctionTypeArgumentClauseContext functionTypeArgumentClause() {
			return getRuleContext(FunctionTypeArgumentClauseContext.class,0);
		}
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public FunctionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionType(this);
		}
	}

	public final FunctionTypeContext functionType() throws RecognitionException {
		FunctionTypeContext _localctx = new FunctionTypeContext(_ctx, getState());
		enterRule(_localctx, 466, RULE_functionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2406);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__101) {
				{
				setState(2405);
				attributes();
				}
			}

			setState(2408);
			functionTypeArgumentClause();
			setState(2410);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__77 || _la==T__78) {
				{
				setState(2409);
				_la = _input.LA(1);
				if ( !(_la==T__77 || _la==T__78) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2412);
			match(T__79);
			setState(2413);
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

	public static class FunctionTypeArgumentClauseContext extends ParserRuleContext {
		public FunctionTypeArgumentListContext functionTypeArgumentList() {
			return getRuleContext(FunctionTypeArgumentListContext.class,0);
		}
		public FunctionTypeArgumentClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeArgumentClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionTypeArgumentClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionTypeArgumentClause(this);
		}
	}

	public final FunctionTypeArgumentClauseContext functionTypeArgumentClause() throws RecognitionException {
		FunctionTypeArgumentClauseContext _localctx = new FunctionTypeArgumentClauseContext(_ctx, getState());
		enterRule(_localctx, 468, RULE_functionTypeArgumentClause);
		int _la;
		try {
			setState(2424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,293,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2415);
				match(T__27);
				setState(2416);
				match(T__28);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2417);
				match(T__27);
				setState(2418);
				functionTypeArgumentList();
				setState(2420);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__80) {
					{
					setState(2419);
					match(T__80);
					}
				}

				setState(2422);
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

	public static class FunctionTypeArgumentListContext extends ParserRuleContext {
		public List<FunctionTypeArgumentContext> functionTypeArgument() {
			return getRuleContexts(FunctionTypeArgumentContext.class);
		}
		public FunctionTypeArgumentContext functionTypeArgument(int i) {
			return getRuleContext(FunctionTypeArgumentContext.class,i);
		}
		public FunctionTypeArgumentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeArgumentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionTypeArgumentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionTypeArgumentList(this);
		}
	}

	public final FunctionTypeArgumentListContext functionTypeArgumentList() throws RecognitionException {
		FunctionTypeArgumentListContext _localctx = new FunctionTypeArgumentListContext(_ctx, getState());
		enterRule(_localctx, 470, RULE_functionTypeArgumentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2426);
			functionTypeArgument();
			setState(2431);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(2427);
				match(T__13);
				setState(2428);
				functionTypeArgument();
				}
				}
				setState(2433);
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

	public static class FunctionTypeArgumentContext extends ParserRuleContext {
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
		}
		public AttributesContext attributes() {
			return getRuleContext(AttributesContext.class,0);
		}
		public ArgumentLabelContext argumentLabel() {
			return getRuleContext(ArgumentLabelContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public FunctionTypeArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTypeArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterFunctionTypeArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitFunctionTypeArgument(this);
		}
	}

	public final FunctionTypeArgumentContext functionTypeArgument() throws RecognitionException {
		FunctionTypeArgumentContext _localctx = new FunctionTypeArgumentContext(_ctx, getState());
		enterRule(_localctx, 472, RULE_functionTypeArgument);
		int _la;
		try {
			setState(2444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2435);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,295,_ctx) ) {
				case 1:
					{
					setState(2434);
					attributes();
					}
					break;
				}
				setState(2438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__139) {
					{
					setState(2437);
					match(T__139);
					}
				}

				setState(2440);
				sType(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2441);
				argumentLabel();
				setState(2442);
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

	public static class ArgumentLabelContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WildcardPatternContext wildcardPattern() {
			return getRuleContext(WildcardPatternContext.class,0);
		}
		public ArgumentLabelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentLabel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterArgumentLabel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitArgumentLabel(this);
		}
	}

	public final ArgumentLabelContext argumentLabel() throws RecognitionException {
		ArgumentLabelContext _localctx = new ArgumentLabelContext(_ctx, getState());
		enterRule(_localctx, 474, RULE_argumentLabel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2447);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__81) {
				{
				setState(2446);
				wildcardPattern();
				}
			}

			setState(2449);
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
		enterRule(_localctx, 476, RULE_arrayType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2451);
			match(T__102);
			setState(2452);
			sType(0);
			setState(2453);
			match(T__103);
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
		enterRule(_localctx, 478, RULE_dictionaryType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2455);
			match(T__102);
			setState(2456);
			sType(0);
			setState(2457);
			match(T__1);
			setState(2458);
			sType(0);
			setState(2459);
			match(T__103);
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
		enterRule(_localctx, 480, RULE_optionalType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2461);
			sType(0);
			setState(2462);
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
		enterRule(_localctx, 482, RULE_implicitlyUnwrappedOptionalType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2464);
			sType(0);
			setState(2465);
			match(T__86);
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
		enterRule(_localctx, 484, RULE_typeAnnotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2467);
			match(T__1);
			setState(2469);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
			case 1:
				{
				setState(2468);
				attributes();
				}
				break;
			}
			setState(2472);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__139) {
				{
				setState(2471);
				match(T__139);
				}
			}

			setState(2474);
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
		enterRule(_localctx, 486, RULE_typeIdentifier);
		int _la;
		try {
			setState(2487);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,303,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2476);
				typeName();
				setState(2478);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
				case 1:
					{
					setState(2477);
					genericArgumentClause();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2480);
				typeName();
				setState(2482);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__39) {
					{
					setState(2481);
					genericArgumentClause();
					}
				}

				setState(2484);
				match(T__72);
				setState(2485);
				typeIdentifier();
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
		public WildcardPatternContext wildcardPattern() {
			return getRuleContext(WildcardPatternContext.class,0);
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
		enterRule(_localctx, 488, RULE_typeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__81) {
				{
				setState(2489);
				wildcardPattern();
				}
			}

			setState(2492);
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
		public TupleTypeElementListContext tupleTypeElementList() {
			return getRuleContext(TupleTypeElementListContext.class,0);
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
		enterRule(_localctx, 490, RULE_tupleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2494);
			match(T__27);
			setState(2496);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__24) | (1L << T__27) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__59))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__74 - 65)) | (1L << (T__75 - 65)) | (1L << (T__76 - 65)) | (1L << (T__81 - 65)) | (1L << (T__82 - 65)) | (1L << (T__90 - 65)) | (1L << (T__95 - 65)) | (1L << (T__96 - 65)) | (1L << (T__97 - 65)) | (1L << (T__98 - 65)) | (1L << (T__101 - 65)) | (1L << (T__102 - 65)) | (1L << (T__115 - 65)) | (1L << (T__116 - 65)) | (1L << (T__117 - 65)) | (1L << (T__118 - 65)) | (1L << (T__120 - 65)))) != 0) || ((((_la - 131)) & ~0x3f) == 0 && ((1L << (_la - 131)) & ((1L << (T__130 - 131)) | (1L << (T__131 - 131)) | (1L << (T__135 - 131)) | (1L << (T__136 - 131)) | (1L << (T__137 - 131)) | (1L << (T__138 - 131)) | (1L << (T__144 - 131)) | (1L << (T__145 - 131)) | (1L << (T__147 - 131)) | (1L << (T__148 - 131)) | (1L << (T__149 - 131)) | (1L << (T__150 - 131)) | (1L << (T__152 - 131)) | (1L << (T__153 - 131)) | (1L << (T__157 - 131)) | (1L << (T__158 - 131)) | (1L << (Identifier - 131)))) != 0)) {
				{
				setState(2495);
				tupleTypeElementList();
				}
			}

			setState(2498);
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
		enterRule(_localctx, 492, RULE_tupleTypeElementList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2500);
			tupleTypeElement();
			setState(2505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(2501);
				match(T__13);
				setState(2502);
				tupleTypeElement();
				}
				}
				setState(2507);
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
		public ElementNameContext elementName() {
			return getRuleContext(ElementNameContext.class,0);
		}
		public TypeAnnotationContext typeAnnotation() {
			return getRuleContext(TypeAnnotationContext.class,0);
		}
		public STypeContext sType() {
			return getRuleContext(STypeContext.class,0);
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
		enterRule(_localctx, 494, RULE_tupleTypeElement);
		try {
			setState(2512);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2508);
				elementName();
				setState(2509);
				typeAnnotation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2511);
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
		enterRule(_localctx, 496, RULE_elementName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2514);
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
		public ProtocolIdentifierContext protocolIdentifier() {
			return getRuleContext(ProtocolIdentifierContext.class,0);
		}
		public ProtocolCompositionContinuationContext protocolCompositionContinuation() {
			return getRuleContext(ProtocolCompositionContinuationContext.class,0);
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
		enterRule(_localctx, 498, RULE_protocolCompositionType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2516);
			protocolIdentifier();
			setState(2517);
			match(T__108);
			setState(2518);
			protocolCompositionContinuation();
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

	public static class ProtocolCompositionContinuationContext extends ParserRuleContext {
		public ProtocolIdentifierContext protocolIdentifier() {
			return getRuleContext(ProtocolIdentifierContext.class,0);
		}
		public ProtocolCompositionTypeContext protocolCompositionType() {
			return getRuleContext(ProtocolCompositionTypeContext.class,0);
		}
		public ProtocolCompositionContinuationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_protocolCompositionContinuation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterProtocolCompositionContinuation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitProtocolCompositionContinuation(this);
		}
	}

	public final ProtocolCompositionContinuationContext protocolCompositionContinuation() throws RecognitionException {
		ProtocolCompositionContinuationContext _localctx = new ProtocolCompositionContinuationContext(_ctx, getState());
		enterRule(_localctx, 500, RULE_protocolCompositionContinuation);
		try {
			setState(2522);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2520);
				protocolIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2521);
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
		enterRule(_localctx, 502, RULE_protocolIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2524);
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
		enterRule(_localctx, 504, RULE_metatypeType);
		try {
			setState(2534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2526);
				sType(0);
				setState(2527);
				match(T__72);
				setState(2528);
				match(T__135);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2530);
				sType(0);
				setState(2531);
				match(T__72);
				setState(2532);
				match(T__136);
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
		enterRule(_localctx, 506, RULE_typeInheritanceClause);
		try {
			setState(2545);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2536);
				match(T__1);
				setState(2537);
				classRequirement();
				setState(2538);
				match(T__13);
				setState(2539);
				typeInheritanceList();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2541);
				match(T__1);
				setState(2542);
				classRequirement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2543);
				match(T__1);
				setState(2544);
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
		enterRule(_localctx, 508, RULE_typeInheritanceList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2547);
			typeIdentifier();
			setState(2552);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(2548);
				match(T__13);
				setState(2549);
				typeIdentifier();
				}
				}
				setState(2554);
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
		enterRule(_localctx, 510, RULE_classRequirement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2555);
			match(T__42);
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
		public ConditionalCompilationBlockContext conditionalCompilationBlock() {
			return getRuleContext(ConditionalCompilationBlockContext.class,0);
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
		enterRule(_localctx, 512, RULE_compilerControlStatement);
		try {
			setState(2559);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__141:
				enterOuterAlt(_localctx, 1);
				{
				setState(2557);
				conditionalCompilationBlock();
				}
				break;
			case T__151:
				enterOuterAlt(_localctx, 2);
				{
				setState(2558);
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

	public static class ConditionalCompilationBlockContext extends ParserRuleContext {
		public IfDirectiveClauseContext ifDirectiveClause() {
			return getRuleContext(IfDirectiveClauseContext.class,0);
		}
		public ElseifDirectiveClausesContext elseifDirectiveClauses() {
			return getRuleContext(ElseifDirectiveClausesContext.class,0);
		}
		public ElseDirectiveClauseContext elseDirectiveClause() {
			return getRuleContext(ElseDirectiveClauseContext.class,0);
		}
		public ConditionalCompilationBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalCompilationBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterConditionalCompilationBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitConditionalCompilationBlock(this);
		}
	}

	public final ConditionalCompilationBlockContext conditionalCompilationBlock() throws RecognitionException {
		ConditionalCompilationBlockContext _localctx = new ConditionalCompilationBlockContext(_ctx, getState());
		enterRule(_localctx, 514, RULE_conditionalCompilationBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2561);
			ifDirectiveClause();
			setState(2563);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__142) {
				{
				setState(2562);
				elseifDirectiveClauses();
				}
			}

			setState(2566);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__143) {
				{
				setState(2565);
				elseDirectiveClause();
				}
			}

			setState(2568);
			match(T__140);
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

	public static class IfDirectiveClauseContext extends ParserRuleContext {
		public CompilationConditionContext compilationCondition() {
			return getRuleContext(CompilationConditionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public IfDirectiveClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifDirectiveClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterIfDirectiveClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitIfDirectiveClause(this);
		}
	}

	public final IfDirectiveClauseContext ifDirectiveClause() throws RecognitionException {
		IfDirectiveClauseContext _localctx = new IfDirectiveClauseContext(_ctx, getState());
		enterRule(_localctx, 516, RULE_ifDirectiveClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2570);
			match(T__141);
			setState(2571);
			compilationCondition(0);
			setState(2573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				{
				setState(2572);
				statements();
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

	public static class ElseifDirectiveClausesContext extends ParserRuleContext {
		public List<ElseifDirectiveClauseContext> elseifDirectiveClause() {
			return getRuleContexts(ElseifDirectiveClauseContext.class);
		}
		public ElseifDirectiveClauseContext elseifDirectiveClause(int i) {
			return getRuleContext(ElseifDirectiveClauseContext.class,i);
		}
		public ElseifDirectiveClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifDirectiveClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterElseifDirectiveClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitElseifDirectiveClauses(this);
		}
	}

	public final ElseifDirectiveClausesContext elseifDirectiveClauses() throws RecognitionException {
		ElseifDirectiveClausesContext _localctx = new ElseifDirectiveClausesContext(_ctx, getState());
		enterRule(_localctx, 518, RULE_elseifDirectiveClauses);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2576); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(2575);
				elseifDirectiveClause();
				}
				}
				setState(2578); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__142 );
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

	public static class ElseifDirectiveClauseContext extends ParserRuleContext {
		public CompilationConditionContext compilationCondition() {
			return getRuleContext(CompilationConditionContext.class,0);
		}
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ElseifDirectiveClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseifDirectiveClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterElseifDirectiveClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitElseifDirectiveClause(this);
		}
	}

	public final ElseifDirectiveClauseContext elseifDirectiveClause() throws RecognitionException {
		ElseifDirectiveClauseContext _localctx = new ElseifDirectiveClauseContext(_ctx, getState());
		enterRule(_localctx, 520, RULE_elseifDirectiveClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2580);
			match(T__142);
			setState(2581);
			compilationCondition(0);
			setState(2583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,317,_ctx) ) {
			case 1:
				{
				setState(2582);
				statements();
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

	public static class ElseDirectiveClauseContext extends ParserRuleContext {
		public StatementsContext statements() {
			return getRuleContext(StatementsContext.class,0);
		}
		public ElseDirectiveClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseDirectiveClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterElseDirectiveClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitElseDirectiveClause(this);
		}
	}

	public final ElseDirectiveClauseContext elseDirectiveClause() throws RecognitionException {
		ElseDirectiveClauseContext _localctx = new ElseDirectiveClauseContext(_ctx, getState());
		enterRule(_localctx, 522, RULE_elseDirectiveClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2585);
			match(T__143);
			setState(2587);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,318,_ctx) ) {
			case 1:
				{
				setState(2586);
				statements();
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

	public static class CompilationConditionContext extends ParserRuleContext {
		public PlatformConditionContext platformCondition() {
			return getRuleContext(PlatformConditionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public List<CompilationConditionContext> compilationCondition() {
			return getRuleContexts(CompilationConditionContext.class);
		}
		public CompilationConditionContext compilationCondition(int i) {
			return getRuleContext(CompilationConditionContext.class,i);
		}
		public CompilationConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterCompilationCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitCompilationCondition(this);
		}
	}

	public final CompilationConditionContext compilationCondition() throws RecognitionException {
		return compilationCondition(0);
	}

	private CompilationConditionContext compilationCondition(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		CompilationConditionContext _localctx = new CompilationConditionContext(_ctx, _parentState);
		CompilationConditionContext _prevctx = _localctx;
		int _startState = 524;
		enterRecursionRule(_localctx, 524, RULE_compilationCondition, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2599);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,319,_ctx) ) {
			case 1:
				{
				setState(2590);
				platformCondition();
				}
				break;
			case 2:
				{
				setState(2591);
				identifier();
				}
				break;
			case 3:
				{
				setState(2592);
				booleanLiteral();
				}
				break;
			case 4:
				{
				setState(2593);
				match(T__27);
				setState(2594);
				compilationCondition(0);
				setState(2595);
				match(T__28);
				}
				break;
			case 5:
				{
				setState(2597);
				match(T__86);
				setState(2598);
				compilationCondition(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2606);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new CompilationConditionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_compilationCondition);
					setState(2601);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(2602);
					_la = _input.LA(1);
					if ( !(_la==T__132 || _la==T__133) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2603);
					compilationCondition(2);
					}
					} 
				}
				setState(2608);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,320,_ctx);
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

	public static class PlatformConditionContext extends ParserRuleContext {
		public OperatingSystemContext operatingSystem() {
			return getRuleContext(OperatingSystemContext.class,0);
		}
		public ArchitectureContext architecture() {
			return getRuleContext(ArchitectureContext.class,0);
		}
		public SwiftVersionContext swiftVersion() {
			return getRuleContext(SwiftVersionContext.class,0);
		}
		public PlatformConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_platformCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterPlatformCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitPlatformCondition(this);
		}
	}

	public final PlatformConditionContext platformCondition() throws RecognitionException {
		PlatformConditionContext _localctx = new PlatformConditionContext(_ctx, getState());
		enterRule(_localctx, 526, RULE_platformCondition);
		try {
			setState(2625);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__144:
				enterOuterAlt(_localctx, 1);
				{
				setState(2609);
				match(T__144);
				setState(2610);
				match(T__27);
				setState(2611);
				operatingSystem();
				setState(2612);
				match(T__28);
				}
				break;
			case T__145:
				enterOuterAlt(_localctx, 2);
				{
				setState(2614);
				match(T__145);
				setState(2615);
				match(T__27);
				setState(2616);
				architecture();
				setState(2617);
				match(T__28);
				}
				break;
			case T__146:
				enterOuterAlt(_localctx, 3);
				{
				setState(2619);
				match(T__146);
				setState(2620);
				match(T__27);
				setState(2621);
				match(T__134);
				setState(2622);
				swiftVersion();
				setState(2623);
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
		enterRule(_localctx, 528, RULE_operatingSystem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2627);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__30) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
		enterRule(_localctx, 530, RULE_architecture);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2629);
			_la = _input.LA(1);
			if ( !(((((_la - 148)) & ~0x3f) == 0 && ((1L << (_la - 148)) & ((1L << (T__147 - 148)) | (1L << (T__148 - 148)) | (1L << (T__149 - 148)) | (1L << (T__150 - 148)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
		enterRule(_localctx, 532, RULE_swiftVersion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2631);
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
		public FileNameContext fileName() {
			return getRuleContext(FileNameContext.class,0);
		}
		public LineNumberContext lineNumber() {
			return getRuleContext(LineNumberContext.class,0);
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
		enterRule(_localctx, 534, RULE_lineControlStatement);
		try {
			setState(2647);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2633);
				match(T__151);
				setState(2634);
				match(T__27);
				setState(2635);
				match(T__152);
				setState(2636);
				match(T__1);
				setState(2637);
				fileName();
				setState(2638);
				match(T__13);
				setState(2639);
				match(T__153);
				setState(2640);
				match(T__1);
				setState(2641);
				lineNumber();
				setState(2642);
				match(T__28);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2644);
				match(T__151);
				setState(2645);
				match(T__27);
				setState(2646);
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
		enterRule(_localctx, 536, RULE_lineNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2649);
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
		enterRule(_localctx, 538, RULE_fileName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2651);
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
		public GrammarStringContext grammarString() {
			return getRuleContext(GrammarStringContext.class,0);
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
		enterRule(_localctx, 540, RULE_identifier);
		try {
			setState(2656);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(2653);
				match(Identifier);
				}
				break;
			case T__14:
			case T__24:
			case T__30:
			case T__31:
			case T__32:
			case T__34:
			case T__36:
			case T__38:
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
			case T__54:
			case T__55:
			case T__57:
			case T__59:
			case T__64:
			case T__65:
			case T__74:
			case T__75:
			case T__76:
			case T__82:
			case T__90:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__135:
			case T__136:
			case T__138:
			case T__144:
			case T__145:
			case T__147:
			case T__148:
			case T__149:
			case T__150:
			case T__152:
			case T__153:
			case T__157:
			case T__158:
				enterOuterAlt(_localctx, 2);
				{
				setState(2654);
				contextSensitiveKeyword();
				}
				break;
			case T__115:
			case T__116:
			case T__117:
			case T__118:
			case T__120:
			case T__130:
			case T__131:
				enterOuterAlt(_localctx, 3);
				{
				setState(2655);
				grammarString();
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
		enterRule(_localctx, 542, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2658);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__42) | (1L << T__53) | (1L << T__58) | (1L << T__60) | (1L << T__61) | (1L << T__62))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (T__63 - 64)) | (1L << (T__66 - 64)) | (1L << (T__67 - 64)) | (1L << (T__68 - 64)) | (1L << (T__69 - 64)) | (1L << (T__70 - 64)) | (1L << (T__71 - 64)) | (1L << (T__77 - 64)) | (1L << (T__78 - 64)) | (1L << (T__81 - 64)) | (1L << (T__83 - 64)) | (1L << (T__84 - 64)) | (1L << (T__87 - 64)) | (1L << (T__88 - 64)) | (1L << (T__89 - 64)) | (1L << (T__90 - 64)) | (1L << (T__99 - 64)) | (1L << (T__100 - 64)) | (1L << (T__109 - 64)) | (1L << (T__110 - 64)) | (1L << (T__111 - 64)) | (1L << (T__112 - 64)) | (1L << (T__113 - 64)) | (1L << (T__114 - 64)) | (1L << (T__122 - 64)) | (1L << (T__123 - 64)) | (1L << (T__126 - 64)))) != 0) || ((((_la - 138)) & ~0x3f) == 0 && ((1L << (_la - 138)) & ((1L << (T__137 - 138)) | (1L << (T__138 - 138)) | (1L << (T__139 - 138)) | (1L << (T__140 - 138)) | (1L << (T__141 - 138)) | (1L << (T__142 - 138)) | (1L << (T__143 - 138)) | (1L << (T__154 - 138)) | (1L << (T__155 - 138)) | (1L << (T__156 - 138)) | (1L << (BooleanLiteral - 138)) | (1L << (NilLiteral - 138)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
		enterRule(_localctx, 544, RULE_contextSensitiveKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2660);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__24) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << T__34) | (1L << T__36) | (1L << T__38) | (1L << T__43) | (1L << T__44) | (1L << T__45) | (1L << T__46) | (1L << T__47) | (1L << T__48) | (1L << T__49) | (1L << T__50) | (1L << T__51) | (1L << T__52) | (1L << T__54) | (1L << T__55) | (1L << T__57) | (1L << T__59))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (T__64 - 65)) | (1L << (T__65 - 65)) | (1L << (T__74 - 65)) | (1L << (T__75 - 65)) | (1L << (T__76 - 65)) | (1L << (T__82 - 65)) | (1L << (T__90 - 65)) | (1L << (T__95 - 65)) | (1L << (T__96 - 65)) | (1L << (T__97 - 65)) | (1L << (T__98 - 65)))) != 0) || ((((_la - 136)) & ~0x3f) == 0 && ((1L << (_la - 136)) & ((1L << (T__135 - 136)) | (1L << (T__136 - 136)) | (1L << (T__138 - 136)) | (1L << (T__144 - 136)) | (1L << (T__145 - 136)) | (1L << (T__147 - 136)) | (1L << (T__148 - 136)) | (1L << (T__149 - 136)) | (1L << (T__150 - 136)) | (1L << (T__152 - 136)) | (1L << (T__153 - 136)) | (1L << (T__157 - 136)) | (1L << (T__158 - 136)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	public static class GrammarStringContext extends ParserRuleContext {
		public GrammarStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grammarString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).enterGrammarString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SwiftListener ) ((SwiftListener)listener).exitGrammarString(this);
		}
	}

	public final GrammarStringContext grammarString() throws RecognitionException {
		GrammarStringContext _localctx = new GrammarStringContext(_ctx, getState());
		enterRule(_localctx, 546, RULE_grammarString);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2662);
			_la = _input.LA(1);
			if ( !(((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (T__115 - 116)) | (1L << (T__116 - 116)) | (1L << (T__117 - 116)) | (1L << (T__118 - 116)) | (1L << (T__120 - 116)) | (1L << (T__130 - 116)) | (1L << (T__131 - 116)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
		enterRule(_localctx, 548, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2666);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
			case T__24:
			case T__30:
			case T__31:
			case T__32:
			case T__34:
			case T__36:
			case T__38:
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
			case T__54:
			case T__55:
			case T__57:
			case T__59:
			case T__64:
			case T__65:
			case T__74:
			case T__75:
			case T__76:
			case T__82:
			case T__90:
			case T__95:
			case T__96:
			case T__97:
			case T__98:
			case T__115:
			case T__116:
			case T__117:
			case T__118:
			case T__120:
			case T__130:
			case T__131:
			case T__135:
			case T__136:
			case T__138:
			case T__144:
			case T__145:
			case T__147:
			case T__148:
			case T__149:
			case T__150:
			case T__152:
			case T__153:
			case T__157:
			case T__158:
			case Identifier:
				{
				setState(2664);
				identifier();
				}
				break;
			case T__81:
				{
				setState(2665);
				match(T__81);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(2675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__13) {
				{
				{
				setState(2668);
				match(T__13);
				setState(2671);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__14:
				case T__24:
				case T__30:
				case T__31:
				case T__32:
				case T__34:
				case T__36:
				case T__38:
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
				case T__54:
				case T__55:
				case T__57:
				case T__59:
				case T__64:
				case T__65:
				case T__74:
				case T__75:
				case T__76:
				case T__82:
				case T__90:
				case T__95:
				case T__96:
				case T__97:
				case T__98:
				case T__115:
				case T__116:
				case T__117:
				case T__118:
				case T__120:
				case T__130:
				case T__131:
				case T__135:
				case T__136:
				case T__138:
				case T__144:
				case T__145:
				case T__147:
				case T__148:
				case T__149:
				case T__150:
				case T__152:
				case T__153:
				case T__157:
				case T__158:
				case Identifier:
					{
					setState(2669);
					identifier();
					}
					break;
				case T__81:
					{
					setState(2670);
					match(T__81);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(2677);
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
		enterRule(_localctx, 550, RULE_booleanLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2678);
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
		enterRule(_localctx, 552, RULE_literal);
		try {
			setState(2684);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__104:
			case BinaryLiteral:
			case OctalLiteral:
			case DecimalLiteral:
			case HexadecimalLiteral:
			case FloatingPointLiteral:
				enterOuterAlt(_localctx, 1);
				{
				setState(2680);
				numericLiteral();
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(2681);
				match(StringLiteral);
				}
				break;
			case BooleanLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(2682);
				match(BooleanLiteral);
				}
				break;
			case NilLiteral:
				enterOuterAlt(_localctx, 4);
				{
				setState(2683);
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
		enterRule(_localctx, 554, RULE_numericLiteral);
		int _la;
		try {
			setState(2694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2687);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__104) {
					{
					setState(2686);
					match(T__104);
					}
				}

				setState(2689);
				integerLiteral();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2691);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__104) {
					{
					setState(2690);
					match(T__104);
					}
				}

				setState(2693);
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
		enterRule(_localctx, 556, RULE_integerLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2696);
			_la = _input.LA(1);
			if ( !(((((_la - 167)) & ~0x3f) == 0 && ((1L << (_la - 167)) & ((1L << (BinaryLiteral - 167)) | (1L << (OctalLiteral - 167)) | (1L << (DecimalLiteral - 167)) | (1L << (HexadecimalLiteral - 167)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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
		case 161:
			return pattern_sempred((PatternContext)_localctx, predIndex);
		case 219:
			return postfixExpression_sempred((PostfixExpressionContext)_localctx, predIndex);
		case 232:
			return sType_sempred((STypeContext)_localctx, predIndex);
		case 262:
			return compilationCondition_sempred((CompilationConditionContext)_localctx, predIndex);
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
			return precpred(_ctx, 3);
		case 11:
			return precpred(_ctx, 2);
		case 12:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sType_sempred(STypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 13:
			return precpred(_ctx, 7);
		case 14:
			return precpred(_ctx, 6);
		case 15:
			return precpred(_ctx, 4);
		case 16:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean compilationCondition_sempred(CompilationConditionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return precpred(_ctx, 1);
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u00b3\u0a8d\4\2\t"+
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
		"\4\u00ff\t\u00ff\4\u0100\t\u0100\4\u0101\t\u0101\4\u0102\t\u0102\4\u0103"+
		"\t\u0103\4\u0104\t\u0104\4\u0105\t\u0105\4\u0106\t\u0106\4\u0107\t\u0107"+
		"\4\u0108\t\u0108\4\u0109\t\u0109\4\u010a\t\u010a\4\u010b\t\u010b\4\u010c"+
		"\t\u010c\4\u010d\t\u010d\4\u010e\t\u010e\4\u010f\t\u010f\4\u0110\t\u0110"+
		"\4\u0111\t\u0111\4\u0112\t\u0112\4\u0113\t\u0113\4\u0114\t\u0114\4\u0115"+
		"\t\u0115\4\u0116\t\u0116\4\u0117\t\u0117\4\u0118\t\u0118\3\2\5\2\u0232"+
		"\n\2\3\2\3\2\3\3\3\3\5\3\u0238\n\3\3\3\3\3\5\3\u023c\n\3\3\3\3\3\5\3\u0240"+
		"\n\3\3\3\3\3\3\3\5\3\u0245\n\3\3\3\3\3\5\3\u0249\n\3\3\3\3\3\5\3\u024d"+
		"\n\3\3\3\3\3\5\3\u0251\n\3\3\3\3\3\5\3\u0255\n\3\5\3\u0257\n\3\3\4\6\4"+
		"\u025a\n\4\r\4\16\4\u025b\3\5\3\5\3\5\5\5\u0261\n\5\3\6\3\6\5\6\u0265"+
		"\n\6\3\6\3\6\3\6\3\6\5\6\u026b\n\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\5\t\u027b\n\t\3\n\3\n\3\n\3\n\5\n\u0281\n\n\3\13"+
		"\3\13\3\13\3\13\5\13\u0287\n\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5"+
		"\r\u0292\n\r\3\r\3\r\3\16\6\16\u0297\n\16\r\16\16\16\u0298\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u02a7\n\17\3\20"+
		"\3\20\3\20\3\20\3\21\3\21\3\21\7\21\u02b0\n\21\f\21\16\21\u02b3\13\21"+
		"\3\22\3\22\5\22\u02b7\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\5\24"+
		"\u02c1\n\24\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u02cd"+
		"\n\27\3\30\3\30\5\30\u02d1\n\30\3\31\3\31\5\31\u02d5\n\31\3\32\3\32\3"+
		"\33\3\33\5\33\u02db\n\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36"+
		"\5\36\u02e6\n\36\3\37\3\37\5\37\u02ea\n\37\3 \3 \5 \u02ee\n \3 \5 \u02f1"+
		"\n \3 \3 \3!\3!\3!\7!\u02f8\n!\f!\16!\u02fb\13!\3\"\3\"\3\"\3\"\5\"\u0301"+
		"\n\"\3#\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3("+
		"\3(\7(\u0318\n(\f(\16(\u031b\13(\3)\3)\3)\3)\5)\u0321\n)\3*\3*\3+\3+\3"+
		",\3,\3,\3,\3-\3-\3-\7-\u032e\n-\f-\16-\u0331\13-\3.\3.\3.\3.\3.\3.\3."+
		"\3.\3.\5.\u033c\n.\3/\3/\3/\3\60\3\60\3\60\7\60\u0344\n\60\f\60\16\60"+
		"\u0347\13\60\3\61\3\61\5\61\u034b\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3"+
		"\62\3\62\5\62\u0355\n\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\65"+
		"\3\65\3\65\7\65\u0362\n\65\f\65\16\65\u0365\13\65\3\66\3\66\3\67\3\67"+
		"\5\67\u036b\n\67\3\67\3\67\5\67\u036f\n\67\3\67\3\67\5\67\u0373\n\67\3"+
		"\67\3\67\5\67\u0377\n\67\3\67\3\67\5\67\u037b\n\67\3\67\3\67\5\67\u037f"+
		"\n\67\3\67\3\67\5\67\u0383\n\67\3\67\3\67\5\67\u0387\n\67\3\67\3\67\5"+
		"\67\u038b\n\67\3\67\3\67\5\67\u038f\n\67\3\67\3\67\5\67\u0393\n\67\3\67"+
		"\3\67\5\67\u0397\n\67\3\67\3\67\5\67\u039b\n\67\3\67\3\67\5\67\u039f\n"+
		"\67\3\67\3\67\5\67\u03a3\n\67\3\67\3\67\5\67\u03a7\n\67\5\67\u03a9\n\67"+
		"\38\68\u03ac\n8\r8\168\u03ad\39\69\u03b1\n9\r9\169\u03b2\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\3:\5:\u03cd\n"+
		":\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3;\3"+
		";\3;\3;\5;\u03e8\n;\3<\6<\u03eb\n<\r<\16<\u03ec\3=\3=\3>\3>\5>\u03f3\n"+
		">\3>\3>\3?\5?\u03f8\n?\3?\3?\5?\u03fc\n?\3?\3?\3@\3@\3A\3A\3A\3A\3A\5"+
		"A\u0407\nA\3B\3B\5B\u040b\nB\3C\5C\u040e\nC\3C\5C\u0411\nC\3C\3C\3C\3"+
		"D\3D\3D\7D\u0419\nD\fD\16D\u041c\13D\3E\3E\5E\u0420\nE\3F\3F\3F\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\3G\5G\u0438\nG\3G\3G"+
		"\3G\3G\3G\3G\3G\3G\3G\3G\5G\u0444\nG\3H\5H\u0447\nH\3H\5H\u044a\nH\3H"+
		"\3H\3I\3I\3J\3J\3J\5J\u0453\nJ\3J\3J\3J\3J\3J\3J\3J\5J\u045c\nJ\3K\5K"+
		"\u045f\nK\3K\5K\u0462\nK\3K\3K\3K\3L\5L\u0468\nL\3L\5L\u046b\nL\3L\3L"+
		"\5L\u046f\nL\3L\3L\3M\3M\3M\3M\3N\3N\3N\5N\u047a\nN\3N\3N\3N\3N\3N\3N"+
		"\3N\5N\u0483\nN\3O\5O\u0486\nO\3O\3O\3P\5P\u048b\nP\3P\3P\3Q\3Q\3Q\5Q"+
		"\u0492\nQ\3Q\3Q\3Q\3Q\3Q\5Q\u0499\nQ\3Q\3Q\5Q\u049d\nQ\3R\5R\u04a0\nR"+
		"\3R\3R\5R\u04a4\nR\3R\3R\3S\5S\u04a9\nS\3S\3S\5S\u04ad\nS\3S\3S\3T\3T"+
		"\3T\3U\5U\u04b5\nU\3U\5U\u04b8\nU\3U\3U\3U\5U\u04bd\nU\3V\3V\3W\3W\3W"+
		"\3X\3X\3X\5X\u04c7\nX\3X\3X\5X\u04cb\nX\3X\3X\3X\3X\3X\5X\u04d2\nX\3X"+
		"\3X\5X\u04d6\nX\5X\u04d8\nX\3Y\5Y\u04db\nY\3Y\5Y\u04de\nY\3Y\3Y\3Z\3Z"+
		"\5Z\u04e4\nZ\3[\3[\5[\u04e8\n[\3[\5[\u04eb\n[\3\\\3\\\5\\\u04ef\n\\\3"+
		"\\\3\\\3]\3]\3^\3^\3^\3^\3^\5^\u04fa\n^\3^\3^\5^\u04fe\n^\3_\3_\3_\7_"+
		"\u0503\n_\f_\16_\u0506\13_\3`\5`\u0509\n`\3`\5`\u050c\n`\3`\3`\3`\5`\u0511"+
		"\n`\3`\5`\u0514\n`\3`\5`\u0517\n`\3`\3`\3`\3`\5`\u051d\n`\3a\3a\3a\5a"+
		"\u0522\na\3b\3b\5b\u0526\nb\3c\3c\3c\3d\5d\u052c\nd\3d\5d\u052f\nd\3d"+
		"\3d\3e\3e\5e\u0535\ne\3f\5f\u0538\nf\3f\3f\3f\5f\u053d\nf\3f\5f\u0540"+
		"\nf\3f\5f\u0543\nf\3f\3f\5f\u0547\nf\3f\3f\3g\6g\u054c\ng\rg\16g\u054d"+
		"\3h\3h\3h\5h\u0553\nh\3h\5h\u0556\nh\3i\5i\u0559\ni\3i\5i\u055c\ni\3i"+
		"\3i\3i\3j\3j\3j\7j\u0564\nj\fj\16j\u0567\13j\3k\3k\5k\u056b\nk\3l\3l\3"+
		"m\3m\3n\3n\3n\5n\u0574\nn\3n\5n\u0577\nn\3n\5n\u057a\nn\3n\3n\5n\u057e"+
		"\nn\3n\3n\3o\6o\u0583\no\ro\16o\u0584\3p\3p\3p\5p\u058a\np\3q\5q\u058d"+
		"\nq\3q\3q\3q\3r\3r\3r\7r\u0595\nr\fr\16r\u0598\13r\3s\3s\5s\u059c\ns\3"+
		"t\3t\3t\3u\5u\u05a2\nu\3u\5u\u05a5\nu\3u\3u\3u\5u\u05aa\nu\3u\5u\u05ad"+
		"\nu\3u\5u\u05b0\nu\3u\3u\3v\3v\3w\3w\5w\u05b8\nw\3w\3w\3x\6x\u05bd\nx"+
		"\rx\16x\u05be\3y\3y\5y\u05c3\ny\3z\5z\u05c6\nz\3z\5z\u05c9\nz\3z\3z\3"+
		"z\5z\u05ce\nz\3z\5z\u05d1\nz\3z\5z\u05d4\nz\3z\3z\3{\3{\5{\u05da\n{\3"+
		"{\3{\5{\u05de\n{\5{\u05e0\n{\3|\3|\3}\3}\5}\u05e6\n}\3}\3}\3~\6~\u05eb"+
		"\n~\r~\16~\u05ec\3\177\3\177\5\177\u05f1\n\177\3\u0080\5\u0080\u05f4\n"+
		"\u0080\3\u0080\5\u0080\u05f7\n\u0080\3\u0080\3\u0080\3\u0080\5\u0080\u05fc"+
		"\n\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0082\3\u0082\5\u0082\u0604"+
		"\n\u0082\3\u0082\3\u0082\3\u0083\6\u0083\u0609\n\u0083\r\u0083\16\u0083"+
		"\u060a\3\u0084\3\u0084\5\u0084\u060f\n\u0084\3\u0085\3\u0085\5\u0085\u0613"+
		"\n\u0085\3\u0085\3\u0085\5\u0085\u0617\n\u0085\3\u0085\3\u0085\5\u0085"+
		"\u061b\n\u0085\3\u0085\3\u0085\5\u0085\u061f\n\u0085\3\u0085\3\u0085\5"+
		"\u0085\u0623\n\u0085\5\u0085\u0625\n\u0085\3\u0086\3\u0086\3\u0086\3\u0086"+
		"\3\u0086\3\u0087\3\u0087\3\u0087\5\u0087\u062f\n\u0087\3\u0087\3\u0087"+
		"\5\u0087\u0633\n\u0087\3\u0088\3\u0088\5\u0088\u0637\n\u0088\3\u0088\3"+
		"\u0088\5\u0088\u063b\n\u0088\3\u0088\5\u0088\u063e\n\u0088\3\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u008a\5\u008a\u0645\n\u008a\3\u008a\5\u008a\u0648\n"+
		"\u008a\3\u008a\3\u008a\3\u008a\5\u008a\u064d\n\u008a\3\u008a\5\u008a\u0650"+
		"\n\u008a\3\u008b\3\u008b\5\u008b\u0654\n\u008b\3\u008b\3\u008b\5\u008b"+
		"\u0658\n\u008b\3\u008b\5\u008b\u065b\n\u008b\3\u008b\3\u008b\3\u008c\5"+
		"\u008c\u0660\n\u008c\3\u008c\5\u008c\u0663\n\u008c\3\u008c\3\u008c\5\u008c"+
		"\u0667\n\u008c\3\u008d\3\u008d\3\u008e\5\u008e\u066c\n\u008e\3\u008e\3"+
		"\u008e\3\u008e\3\u008f\5\u008f\u0672\n\u008f\3\u008f\5\u008f\u0675\n\u008f"+
		"\3\u008f\3\u008f\3\u008f\3\u008f\5\u008f\u067b\n\u008f\3\u008f\3\u008f"+
		"\3\u0090\3\u0090\5\u0090\u0681\n\u0090\3\u0090\3\u0090\3\u0091\6\u0091"+
		"\u0686\n\u0091\r\u0091\16\u0091\u0687\3\u0092\3\u0092\5\u0092\u068c\n"+
		"\u0092\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093\3\u0093"+
		"\3\u0093\3\u0093\3\u0093\3\u0093\5\u0093\u069a\n\u0093\3\u0094\5\u0094"+
		"\u069d\n\u0094\3\u0094\5\u0094\u06a0\n\u0094\3\u0094\3\u0094\3\u0094\3"+
		"\u0095\3\u0095\5\u0095\u06a7\n\u0095\3\u0095\3\u0095\3\u0096\3\u0096\3"+
		"\u0096\5\u0096\u06ae\n\u0096\3\u0097\3\u0097\3\u0097\3\u0097\3\u0098\3"+
		"\u0098\3\u0098\3\u0098\3\u0099\3\u0099\3\u0099\3\u0099\5\u0099\u06bc\n"+
		"\u0099\3\u009a\3\u009a\3\u009a\3\u009b\3\u009b\3\u009b\3\u009b\5\u009b"+
		"\u06c5\n\u009b\3\u009b\3\u009b\3\u009c\6\u009c\u06ca\n\u009c\r\u009c\16"+
		"\u009c\u06cb\3\u009d\3\u009d\3\u009d\5\u009d\u06d1\n\u009d\3\u009e\3\u009e"+
		"\3\u009e\3\u009e\3\u009f\3\u009f\3\u009f\3\u009f\3\u00a0\3\u00a0\3\u00a0"+
		"\3\u00a0\3\u00a1\3\u00a1\3\u00a1\7\u00a1\u06e2\n\u00a1\f\u00a1\16\u00a1"+
		"\u06e5\13\u00a1\3\u00a2\3\u00a2\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u06ec"+
		"\n\u00a3\3\u00a3\5\u00a3\u06ef\n\u00a3\3\u00a3\3\u00a3\5\u00a3\u06f3\n"+
		"\u00a3\3\u00a3\3\u00a3\3\u00a3\5\u00a3\u06f8\n\u00a3\3\u00a3\3\u00a3\3"+
		"\u00a3\3\u00a3\5\u00a3\u06fe\n\u00a3\3\u00a3\3\u00a3\3\u00a3\7\u00a3\u0703"+
		"\n\u00a3\f\u00a3\16\u00a3\u0706\13\u00a3\3\u00a4\3\u00a4\3\u00a5\3\u00a5"+
		"\3\u00a6\3\u00a6\3\u00a6\3\u00a6\5\u00a6\u0710\n\u00a6\3\u00a7\3\u00a7"+
		"\5\u00a7\u0714\n\u00a7\3\u00a7\3\u00a7\3\u00a8\3\u00a8\3\u00a8\7\u00a8"+
		"\u071b\n\u00a8\f\u00a8\16\u00a8\u071e\13\u00a8\3\u00a9\3\u00a9\3\u00a9"+
		"\3\u00a9\3\u00a9\5\u00a9\u0725\n\u00a9\3\u00aa\5\u00aa\u0728\n\u00aa\3"+
		"\u00aa\5\u00aa\u072b\n\u00aa\3\u00aa\3\u00aa\5\u00aa\u072f\n\u00aa\3\u00ab"+
		"\3\u00ab\5\u00ab\u0733\n\u00ab\3\u00ac\3\u00ac\3\u00ac\3\u00ad\3\u00ad"+
		"\3\u00ad\3\u00ad\3\u00ae\3\u00ae\3\u00af\3\u00af\3\u00af\5\u00af\u0741"+
		"\n\u00af\3\u00b0\3\u00b0\3\u00b1\3\u00b1\5\u00b1\u0747\n\u00b1\3\u00b1"+
		"\3\u00b1\3\u00b2\6\u00b2\u074c\n\u00b2\r\u00b2\16\u00b2\u074d\3\u00b3"+
		"\6\u00b3\u0751\n\u00b3\r\u00b3\16\u00b3\u0752\3\u00b4\3\u00b4\5\u00b4"+
		"\u0757\n\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u075c\n\u00b4\3\u00b4\3"+
		"\u00b4\3\u00b4\5\u00b4\u0761\n\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3"+
		"\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4"+
		"\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\3\u00b4\5\u00b4\u0776\n\u00b4"+
		"\3\u00b5\5\u00b5\u0779\n\u00b5\3\u00b5\3\u00b5\7\u00b5\u077d\n\u00b5\f"+
		"\u00b5\16\u00b5\u0780\13\u00b5\3\u00b6\5\u00b6\u0783\n\u00b6\3\u00b6\3"+
		"\u00b6\5\u00b6\u0787\n\u00b6\3\u00b6\5\u00b6\u078a\n\u00b6\3\u00b7\3\u00b7"+
		"\3\u00b7\3\u00b8\3\u00b8\5\u00b8\u0791\n\u00b8\3\u00b9\3\u00b9\3\u00b9"+
		"\3\u00b9\3\u00b9\5\u00b9\u0798\n\u00b9\3\u00b9\3\u00b9\3\u00b9\3\u00b9"+
		"\5\u00b9\u079e\n\u00b9\3\u00b9\3\u00b9\3\u00b9\5\u00b9\u07a3\n\u00b9\3"+
		"\u00ba\3\u00ba\3\u00bb\3\u00bb\5\u00bb\u07a9\n\u00bb\3\u00bb\3\u00bb\3"+
		"\u00bb\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc\3\u00bc"+
		"\3\u00bc\3\u00bc\5\u00bc\u07b8\n\u00bc\3\u00bd\3\u00bd\3\u00bd\3\u00bd"+
		"\5\u00bd\u07be\n\u00bd\3\u00bd\5\u00bd\u07c1\n\u00bd\3\u00bd\3\u00bd\3"+
		"\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\3\u00bd\5\u00bd"+
		"\u07cd\n\u00bd\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be\3\u00be"+
		"\3\u00be\5\u00be\u07d7\n\u00be\3\u00bf\3\u00bf\5\u00bf\u07db\n\u00bf\3"+
		"\u00bf\3\u00bf\3\u00c0\3\u00c0\3\u00c0\7\u00c0\u07e2\n\u00c0\f\u00c0\16"+
		"\u00c0\u07e5\13\u00c0\3\u00c0\5\u00c0\u07e8\n\u00c0\3\u00c1\3\u00c1\3"+
		"\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\3\u00c2\5\u00c2\u07f3\n"+
		"\u00c2\3\u00c3\3\u00c3\3\u00c3\7\u00c3\u07f8\n\u00c3\f\u00c3\16\u00c3"+
		"\u07fb\13\u00c3\3\u00c3\5\u00c3\u07fe\n\u00c3\3\u00c4\3\u00c4\3\u00c4"+
		"\3\u00c4\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5"+
		"\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\3\u00c5\5\u00c5\u0825"+
		"\n\u00c5\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6\3\u00c6"+
		"\3\u00c6\3\u00c6\3\u00c6\3\u00c6\5\u00c6\u0833\n\u00c6\3\u00c7\3\u00c7"+
		"\3\u00c7\5\u00c7\u0838\n\u00c7\3\u00c8\3\u00c8\3\u00c8\3\u00c8\3\u00c9"+
		"\3\u00c9\3\u00c9\3\u00c9\3\u00c9\3\u00ca\3\u00ca\3\u00ca\3\u00ca\3\u00cb"+
		"\3\u00cb\5\u00cb\u0849\n\u00cb\3\u00cb\5\u00cb\u084c\n\u00cb\3\u00cb\3"+
		"\u00cb\3\u00cc\5\u00cc\u0851\n\u00cc\3\u00cc\3\u00cc\5\u00cc\u0855\n\u00cc"+
		"\3\u00cc\5\u00cc\u0858\n\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc\3\u00cc"+
		"\5\u00cc\u085f\n\u00cc\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd\3\u00cd"+
		"\3\u00cd\5\u00cd\u0868\n\u00cd\3\u00ce\3\u00ce\3\u00ce\7\u00ce\u086d\n"+
		"\u00ce\f\u00ce\16\u00ce\u0870\13\u00ce\3\u00cf\3\u00cf\5\u00cf\u0874\n"+
		"\u00cf\3\u00cf\3\u00cf\3\u00cf\3\u00cf\5\u00cf\u087a\n\u00cf\3\u00d0\3"+
		"\u00d0\5\u00d0\u087e\n\u00d0\3\u00d1\3\u00d1\3\u00d1\3\u00d1\3\u00d2\3"+
		"\u00d2\3\u00d2\7\u00d2\u0887\n\u00d2\f\u00d2\16\u00d2\u088a\13\u00d2\3"+
		"\u00d3\5\u00d3\u088d\n\u00d3\3\u00d3\3\u00d3\3\u00d4\3\u00d4\3\u00d5\3"+
		"\u00d5\3\u00d5\3\u00d6\3\u00d6\3\u00d6\3\u00d6\3\u00d7\3\u00d7\5\u00d7"+
		"\u089c\n\u00d7\3\u00d7\3\u00d7\3\u00d8\3\u00d8\3\u00d8\7\u00d8\u08a3\n"+
		"\u00d8\f\u00d8\16\u00d8\u08a6\13\u00d8\3\u00d9\3\u00d9\3\u00d9\5\u00d9"+
		"\u08ab\n\u00d9\3\u00d9\3\u00d9\3\u00da\3\u00da\3\u00db\3\u00db\3\u00db"+
		"\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\3\u00db\5\u00db"+
		"\u08bc\n\u00db\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dc\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u08cc"+
		"\n\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\5\u00dd\u08d2\n\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\5\u00dd\u08e8\n\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd"+
		"\3\u00dd\3\u00dd\3\u00dd\3\u00dd\3\u00dd\7\u00dd\u08fd\n\u00dd\f\u00dd"+
		"\16\u00dd\u0900\13\u00dd\3\u00de\3\u00de\5\u00de\u0904\n\u00de\3\u00de"+
		"\3\u00de\3\u00df\3\u00df\3\u00df\7\u00df\u090b\n\u00df\f\u00df\16\u00df"+
		"\u090e\13\u00df\3\u00e0\3\u00e0\3\u00e0\3\u00e0\3\u00e0\5\u00e0\u0915"+
		"\n\u00e0\3\u00e0\3\u00e0\3\u00e0\5\u00e0\u091a\n\u00e0\3\u00e0\3\u00e0"+
		"\5\u00e0\u091e\n\u00e0\5\u00e0\u0920\n\u00e0\3\u00e1\3\u00e1\5\u00e1\u0924"+
		"\n\u00e1\3\u00e2\6\u00e2\u0927\n\u00e2\r\u00e2\16\u00e2\u0928\3\u00e3"+
		"\3\u00e3\5\u00e3\u092d\n\u00e3\3\u00e3\3\u00e3\3\u00e4\3\u00e4\3\u00e5"+
		"\3\u00e5\5\u00e5\u0935\n\u00e5\3\u00e6\3\u00e6\7\u00e6\u0939\n\u00e6\f"+
		"\u00e6\16\u00e6\u093c\13\u00e6\3\u00e6\3\u00e6\7\u00e6\u0940\n\u00e6\f"+
		"\u00e6\16\u00e6\u0943\13\u00e6\3\u00e6\5\u00e6\u0946\n\u00e6\3\u00e7\3"+
		"\u00e7\3\u00e8\3\u00e8\3\u00e9\3\u00e9\3\u00ea\3\u00ea\3\u00ea\3\u00ea"+
		"\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\5\u00ea\u0957\n\u00ea\3\u00ea"+
		"\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea\3\u00ea"+
		"\7\u00ea\u0963\n\u00ea\f\u00ea\16\u00ea\u0966\13\u00ea\3\u00eb\5\u00eb"+
		"\u0969\n\u00eb\3\u00eb\3\u00eb\5\u00eb\u096d\n\u00eb\3\u00eb\3\u00eb\3"+
		"\u00eb\3\u00ec\3\u00ec\3\u00ec\3\u00ec\3\u00ec\5\u00ec\u0977\n\u00ec\3"+
		"\u00ec\3\u00ec\5\u00ec\u097b\n\u00ec\3\u00ed\3\u00ed\3\u00ed\7\u00ed\u0980"+
		"\n\u00ed\f\u00ed\16\u00ed\u0983\13\u00ed\3\u00ee\5\u00ee\u0986\n\u00ee"+
		"\3\u00ee\5\u00ee\u0989\n\u00ee\3\u00ee\3\u00ee\3\u00ee\3\u00ee\5\u00ee"+
		"\u098f\n\u00ee\3\u00ef\5\u00ef\u0992\n\u00ef\3\u00ef\3\u00ef\3\u00f0\3"+
		"\u00f0\3\u00f0\3\u00f0\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1\3\u00f1"+
		"\3\u00f2\3\u00f2\3\u00f2\3\u00f3\3\u00f3\3\u00f3\3\u00f4\3\u00f4\5\u00f4"+
		"\u09a8\n\u00f4\3\u00f4\5\u00f4\u09ab\n\u00f4\3\u00f4\3\u00f4\3\u00f5\3"+
		"\u00f5\5\u00f5\u09b1\n\u00f5\3\u00f5\3\u00f5\5\u00f5\u09b5\n\u00f5\3\u00f5"+
		"\3\u00f5\3\u00f5\5\u00f5\u09ba\n\u00f5\3\u00f6\5\u00f6\u09bd\n\u00f6\3"+
		"\u00f6\3\u00f6\3\u00f7\3\u00f7\5\u00f7\u09c3\n\u00f7\3\u00f7\3\u00f7\3"+
		"\u00f8\3\u00f8\3\u00f8\7\u00f8\u09ca\n\u00f8\f\u00f8\16\u00f8\u09cd\13"+
		"\u00f8\3\u00f9\3\u00f9\3\u00f9\3\u00f9\5\u00f9\u09d3\n\u00f9\3\u00fa\3"+
		"\u00fa\3\u00fb\3\u00fb\3\u00fb\3\u00fb\3\u00fc\3\u00fc\5\u00fc\u09dd\n"+
		"\u00fc\3\u00fd\3\u00fd\3\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00fe\3\u00fe"+
		"\3\u00fe\3\u00fe\5\u00fe\u09e9\n\u00fe\3\u00ff\3\u00ff\3\u00ff\3\u00ff"+
		"\3\u00ff\3\u00ff\3\u00ff\3\u00ff\3\u00ff\5\u00ff\u09f4\n\u00ff\3\u0100"+
		"\3\u0100\3\u0100\7\u0100\u09f9\n\u0100\f\u0100\16\u0100\u09fc\13\u0100"+
		"\3\u0101\3\u0101\3\u0102\3\u0102\5\u0102\u0a02\n\u0102\3\u0103\3\u0103"+
		"\5\u0103\u0a06\n\u0103\3\u0103\5\u0103\u0a09\n\u0103\3\u0103\3\u0103\3"+
		"\u0104\3\u0104\3\u0104\5\u0104\u0a10\n\u0104\3\u0105\6\u0105\u0a13\n\u0105"+
		"\r\u0105\16\u0105\u0a14\3\u0106\3\u0106\3\u0106\5\u0106\u0a1a\n\u0106"+
		"\3\u0107\3\u0107\5\u0107\u0a1e\n\u0107\3\u0108\3\u0108\3\u0108\3\u0108"+
		"\3\u0108\3\u0108\3\u0108\3\u0108\3\u0108\3\u0108\5\u0108\u0a2a\n\u0108"+
		"\3\u0108\3\u0108\3\u0108\7\u0108\u0a2f\n\u0108\f\u0108\16\u0108\u0a32"+
		"\13\u0108\3\u0109\3\u0109\3\u0109\3\u0109\3\u0109\3\u0109\3\u0109\3\u0109"+
		"\3\u0109\3\u0109\3\u0109\3\u0109\3\u0109\3\u0109\3\u0109\3\u0109\5\u0109"+
		"\u0a44\n\u0109\3\u010a\3\u010a\3\u010b\3\u010b\3\u010c\3\u010c\3\u010d"+
		"\3\u010d\3\u010d\3\u010d\3\u010d\3\u010d\3\u010d\3\u010d\3\u010d\3\u010d"+
		"\3\u010d\3\u010d\3\u010d\3\u010d\5\u010d\u0a5a\n\u010d\3\u010e\3\u010e"+
		"\3\u010f\3\u010f\3\u0110\3\u0110\3\u0110\5\u0110\u0a63\n\u0110\3\u0111"+
		"\3\u0111\3\u0112\3\u0112\3\u0113\3\u0113\3\u0114\3\u0114\5\u0114\u0a6d"+
		"\n\u0114\3\u0114\3\u0114\3\u0114\5\u0114\u0a72\n\u0114\7\u0114\u0a74\n"+
		"\u0114\f\u0114\16\u0114\u0a77\13\u0114\3\u0115\3\u0115\3\u0116\3\u0116"+
		"\3\u0116\3\u0116\5\u0116\u0a7f\n\u0116\3\u0117\5\u0117\u0a82\n\u0117\3"+
		"\u0117\3\u0117\5\u0117\u0a86\n\u0117\3\u0117\5\u0117\u0a89\n\u0117\3\u0118"+
		"\3\u0118\3\u0118\2\6\u0144\u01b8\u01d2\u020e\u0119\2\4\6\b\n\f\16\20\22"+
		"\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp"+
		"rtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094"+
		"\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac"+
		"\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4"+
		"\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc"+
		"\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4"+
		"\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c"+
		"\u010e\u0110\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124"+
		"\u0126\u0128\u012a\u012c\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c"+
		"\u013e\u0140\u0142\u0144\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154"+
		"\u0156\u0158\u015a\u015c\u015e\u0160\u0162\u0164\u0166\u0168\u016a\u016c"+
		"\u016e\u0170\u0172\u0174\u0176\u0178\u017a\u017c\u017e\u0180\u0182\u0184"+
		"\u0186\u0188\u018a\u018c\u018e\u0190\u0192\u0194\u0196\u0198\u019a\u019c"+
		"\u019e\u01a0\u01a2\u01a4\u01a6\u01a8\u01aa\u01ac\u01ae\u01b0\u01b2\u01b4"+
		"\u01b6\u01b8\u01ba\u01bc\u01be\u01c0\u01c2\u01c4\u01c6\u01c8\u01ca\u01cc"+
		"\u01ce\u01d0\u01d2\u01d4\u01d6\u01d8\u01da\u01dc\u01de\u01e0\u01e2\u01e4"+
		"\u01e6\u01e8\u01ea\u01ec\u01ee\u01f0\u01f2\u01f4\u01f6\u01f8\u01fa\u01fc"+
		"\u01fe\u0200\u0202\u0204\u0206\u0208\u020a\u020c\u020e\u0210\u0212\u0214"+
		"\u0216\u0218\u021a\u021c\u021e\u0220\u0222\u0224\u0226\u0228\u022a\u022c"+
		"\u022e\2\25\3\2\32\33\3\2!)\4\2\u00ab\u00ab\u00ad\u00ae\3\2CD\5\2\32\33"+
		"--FJ\3\2PQ\3\2XY\3\2_`\3\2ce\5\299<<\177\u0080\3\2\u0082\u0083\f\2  *"+
		",LLRRXYkkmmoo\u0087\u0089\u00a4\u00a4\3\2\u0087\u0088\7\2!!##%%\'\'))"+
		"\3\2\u0096\u0099\24\2\5\r\21\35--88==?BEJPQTTVWZ]fgpu}~\u0081\u0081\u008c"+
		"\u0092\u009d\u009f\u00a2\u00a3\27\2\21\21\33\33!#%%\'\')).\679:<<>>CD"+
		"MOUU]]be\u008a\u008b\u008d\u008d\u0093\u0094\u0096\u0099\u009b\u009c\u00a0"+
		"\u00a1\5\2vy{{\u0085\u0086\3\2\u00a9\u00ac\2\u0b55\2\u0231\3\2\2\2\4\u0256"+
		"\3\2\2\2\6\u0259\3\2\2\2\b\u0260\3\2\2\2\n\u0262\3\2\2\2\f\u026e\3\2\2"+
		"\2\16\u0272\3\2\2\2\20\u027a\3\2\2\2\22\u027c\3\2\2\2\24\u0286\3\2\2\2"+
		"\26\u0288\3\2\2\2\30\u028d\3\2\2\2\32\u0296\3\2\2\2\34\u02a6\3\2\2\2\36"+
		"\u02a8\3\2\2\2 \u02ac\3\2\2\2\"\u02b4\3\2\2\2$\u02b8\3\2\2\2&\u02bb\3"+
		"\2\2\2(\u02c2\3\2\2\2*\u02c5\3\2\2\2,\u02cc\3\2\2\2.\u02ce\3\2\2\2\60"+
		"\u02d2\3\2\2\2\62\u02d6\3\2\2\2\64\u02d8\3\2\2\2\66\u02dc\3\2\2\28\u02df"+
		"\3\2\2\2:\u02e2\3\2\2\2<\u02e7\3\2\2\2>\u02eb\3\2\2\2@\u02f4\3\2\2\2B"+
		"\u0300\3\2\2\2D\u0302\3\2\2\2F\u0306\3\2\2\2H\u030a\3\2\2\2J\u030d\3\2"+
		"\2\2L\u030f\3\2\2\2N\u0314\3\2\2\2P\u0320\3\2\2\2R\u0322\3\2\2\2T\u0324"+
		"\3\2\2\2V\u0326\3\2\2\2X\u032a\3\2\2\2Z\u033b\3\2\2\2\\\u033d\3\2\2\2"+
		"^\u0340\3\2\2\2`\u034a\3\2\2\2b\u0354\3\2\2\2d\u0356\3\2\2\2f\u035a\3"+
		"\2\2\2h\u035e\3\2\2\2j\u0366\3\2\2\2l\u03a8\3\2\2\2n\u03ab\3\2\2\2p\u03b0"+
		"\3\2\2\2r\u03cc\3\2\2\2t\u03e7\3\2\2\2v\u03ea\3\2\2\2x\u03ee\3\2\2\2z"+
		"\u03f0\3\2\2\2|\u03f7\3\2\2\2~\u03ff\3\2\2\2\u0080\u0406\3\2\2\2\u0082"+
		"\u040a\3\2\2\2\u0084\u040d\3\2\2\2\u0086\u0415\3\2\2\2\u0088\u041d\3\2"+
		"\2\2\u008a\u0421\3\2\2\2\u008c\u0443\3\2\2\2\u008e\u0446\3\2\2\2\u0090"+
		"\u044d\3\2\2\2\u0092\u045b\3\2\2\2\u0094\u045e\3\2\2\2\u0096\u0467\3\2"+
		"\2\2\u0098\u0472\3\2\2\2\u009a\u0482\3\2\2\2\u009c\u0485\3\2\2\2\u009e"+
		"\u048a\3\2\2\2\u00a0\u049c\3\2\2\2\u00a2\u049f\3\2\2\2\u00a4\u04a8\3\2"+
		"\2\2\u00a6\u04b0\3\2\2\2\u00a8\u04b4\3\2\2\2\u00aa\u04be\3\2\2\2\u00ac"+
		"\u04c0\3\2\2\2\u00ae\u04d7\3\2\2\2\u00b0\u04da\3\2\2\2\u00b2\u04e3\3\2"+
		"\2\2\u00b4\u04e5\3\2\2\2\u00b6\u04ec\3\2\2\2\u00b8\u04f2\3\2\2\2\u00ba"+
		"\u04fd\3\2\2\2\u00bc\u04ff\3\2\2\2\u00be\u051c\3\2\2\2\u00c0\u0521\3\2"+
		"\2\2\u00c2\u0525\3\2\2\2\u00c4\u0527\3\2\2\2\u00c6\u052b\3\2\2\2\u00c8"+
		"\u0534\3\2\2\2\u00ca\u0537\3\2\2\2\u00cc\u054b\3\2\2\2\u00ce\u0555\3\2"+
		"\2\2\u00d0\u0558\3\2\2\2\u00d2\u0560\3\2\2\2\u00d4\u0568\3\2\2\2\u00d6"+
		"\u056c\3\2\2\2\u00d8\u056e\3\2\2\2\u00da\u0570\3\2\2\2\u00dc\u0582\3\2"+
		"\2\2\u00de\u0589\3\2\2\2\u00e0\u058c\3\2\2\2\u00e2\u0591\3\2\2\2\u00e4"+
		"\u0599\3\2\2\2\u00e6\u059d\3\2\2\2\u00e8\u05a1\3\2\2\2\u00ea\u05b3\3\2"+
		"\2\2\u00ec\u05b5\3\2\2\2\u00ee\u05bc\3\2\2\2\u00f0\u05c2\3\2\2\2\u00f2"+
		"\u05c5\3\2\2\2\u00f4\u05df\3\2\2\2\u00f6\u05e1\3\2\2\2\u00f8\u05e3\3\2"+
		"\2\2\u00fa\u05ea\3\2\2\2\u00fc\u05f0\3\2\2\2\u00fe\u05f3\3\2\2\2\u0100"+
		"\u05ff\3\2\2\2\u0102\u0601\3\2\2\2\u0104\u0608\3\2\2\2\u0106\u060e\3\2"+
		"\2\2\u0108\u0624\3\2\2\2\u010a\u0626\3\2\2\2\u010c\u062b\3\2\2\2\u010e"+
		"\u0634\3\2\2\2\u0110\u063f\3\2\2\2\u0112\u0644\3\2\2\2\u0114\u0651\3\2"+
		"\2\2\u0116\u065f\3\2\2\2\u0118\u0668\3\2\2\2\u011a\u066b\3\2\2\2\u011c"+
		"\u0671\3\2\2\2\u011e\u067e\3\2\2\2\u0120\u0685\3\2\2\2\u0122\u068b\3\2"+
		"\2\2\u0124\u0699\3\2\2\2\u0126\u069c\3\2\2\2\u0128\u06a4\3\2\2\2\u012a"+
		"\u06ad\3\2\2\2\u012c\u06af\3\2\2\2\u012e\u06b3\3\2\2\2\u0130\u06b7\3\2"+
		"\2\2\u0132\u06bd\3\2\2\2\u0134\u06c0\3\2\2\2\u0136\u06c9\3\2\2\2\u0138"+
		"\u06d0\3\2\2\2\u013a\u06d2\3\2\2\2\u013c\u06d6\3\2\2\2\u013e\u06da\3\2"+
		"\2\2\u0140\u06de\3\2\2\2\u0142\u06e6\3\2\2\2\u0144\u06fd\3\2\2\2\u0146"+
		"\u0707\3\2\2\2\u0148\u0709\3\2\2\2\u014a\u070f\3\2\2\2\u014c\u0711\3\2"+
		"\2\2\u014e\u0717\3\2\2\2\u0150\u0724\3\2\2\2\u0152\u0727\3\2\2\2\u0154"+
		"\u0732\3\2\2\2\u0156\u0734\3\2\2\2\u0158\u0737\3\2\2\2\u015a\u073b\3\2"+
		"\2\2\u015c\u073d\3\2\2\2\u015e\u0742\3\2\2\2\u0160\u0744\3\2\2\2\u0162"+
		"\u074b\3\2\2\2\u0164\u0750\3\2\2\2\u0166\u0775\3\2\2\2\u0168\u0778\3\2"+
		"\2\2\u016a\u0789\3\2\2\2\u016c\u078b\3\2\2\2\u016e\u078e\3\2\2\2\u0170"+
		"\u07a2\3\2\2\2\u0172\u07a4\3\2\2\2\u0174\u07a6\3\2\2\2\u0176\u07b7\3\2"+
		"\2\2\u0178\u07cc\3\2\2\2\u017a\u07d6\3\2\2\2\u017c\u07d8\3\2\2\2\u017e"+
		"\u07de\3\2\2\2\u0180\u07e9\3\2\2\2\u0182\u07f2\3\2\2\2\u0184\u07f4\3\2"+
		"\2\2\u0186\u07ff\3\2\2\2\u0188\u0824\3\2\2\2\u018a\u0832\3\2\2\2\u018c"+
		"\u0837\3\2\2\2\u018e\u0839\3\2\2\2\u0190\u083d\3\2\2\2\u0192\u0842\3\2"+
		"\2\2\u0194\u0846\3\2\2\2\u0196\u085e\3\2\2\2\u0198\u0867\3\2\2\2\u019a"+
		"\u0869\3\2\2\2\u019c\u0879\3\2\2\2\u019e\u087d\3\2\2\2\u01a0\u087f\3\2"+
		"\2\2\u01a2\u0883\3\2\2\2\u01a4\u088c\3\2\2\2\u01a6\u0890\3\2\2\2\u01a8"+
		"\u0892\3\2\2\2\u01aa\u0895\3\2\2\2\u01ac\u0899\3\2\2\2\u01ae\u089f\3\2"+
		"\2\2\u01b0\u08aa\3\2\2\2\u01b2\u08ae\3\2\2\2\u01b4\u08bb\3\2\2\2\u01b6"+
		"\u08bd\3\2\2\2\u01b8\u08cb\3\2\2\2\u01ba\u0901\3\2\2\2\u01bc\u0907\3\2"+
		"\2\2\u01be\u091f\3\2\2\2\u01c0\u0923\3\2\2\2\u01c2\u0926\3\2\2\2\u01c4"+
		"\u092c\3\2\2\2\u01c6\u0930\3\2\2\2\u01c8\u0934\3\2\2\2\u01ca\u0945\3\2"+
		"\2\2\u01cc\u0947\3\2\2\2\u01ce\u0949\3\2\2\2\u01d0\u094b\3\2\2\2\u01d2"+
		"\u0956\3\2\2\2\u01d4\u0968\3\2\2\2\u01d6\u097a\3\2\2\2\u01d8\u097c\3\2"+
		"\2\2\u01da\u098e\3\2\2\2\u01dc\u0991\3\2\2\2\u01de\u0995\3\2\2\2\u01e0"+
		"\u0999\3\2\2\2\u01e2\u099f\3\2\2\2\u01e4\u09a2\3\2\2\2\u01e6\u09a5\3\2"+
		"\2\2\u01e8\u09b9\3\2\2\2\u01ea\u09bc\3\2\2\2\u01ec\u09c0\3\2\2\2\u01ee"+
		"\u09c6\3\2\2\2\u01f0\u09d2\3\2\2\2\u01f2\u09d4\3\2\2\2\u01f4\u09d6\3\2"+
		"\2\2\u01f6\u09dc\3\2\2\2\u01f8\u09de\3\2\2\2\u01fa\u09e8\3\2\2\2\u01fc"+
		"\u09f3\3\2\2\2\u01fe\u09f5\3\2\2\2\u0200\u09fd\3\2\2\2\u0202\u0a01\3\2"+
		"\2\2\u0204\u0a03\3\2\2\2\u0206\u0a0c\3\2\2\2\u0208\u0a12\3\2\2\2\u020a"+
		"\u0a16\3\2\2\2\u020c\u0a1b\3\2\2\2\u020e\u0a29\3\2\2\2\u0210\u0a43\3\2"+
		"\2\2\u0212\u0a45\3\2\2\2\u0214\u0a47\3\2\2\2\u0216\u0a49\3\2\2\2\u0218"+
		"\u0a59\3\2\2\2\u021a\u0a5b\3\2\2\2\u021c\u0a5d\3\2\2\2\u021e\u0a62\3\2"+
		"\2\2\u0220\u0a64\3\2\2\2\u0222\u0a66\3\2\2\2\u0224\u0a68\3\2\2\2\u0226"+
		"\u0a6c\3\2\2\2\u0228\u0a78\3\2\2\2\u022a\u0a7e\3\2\2\2\u022c\u0a88\3\2"+
		"\2\2\u022e\u0a8a\3\2\2\2\u0230\u0232\5\6\4\2\u0231\u0230\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0234\7\2\2\3\u0234\3\3\2\2\2"+
		"\u0235\u0237\5l\67\2\u0236\u0238\7\3\2\2\u0237\u0236\3\2\2\2\u0237\u0238"+
		"\3\2\2\2\u0238\u0257\3\2\2\2\u0239\u023b\5\b\5\2\u023a\u023c\7\3\2\2\u023b"+
		"\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u0257\3\2\2\2\u023d\u023f\5\20"+
		"\t\2\u023e\u0240\7\3\2\2\u023f\u023e\3\2\2\2\u023f\u0240\3\2\2\2\u0240"+
		"\u0257\3\2\2\2\u0241\u0257\5&\24\2\u0242\u0244\5,\27\2\u0243\u0245\7\3"+
		"\2\2\u0244\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0257\3\2\2\2\u0246"+
		"\u0248\58\35\2\u0247\u0249\7\3\2\2\u0248\u0247\3\2\2\2\u0248\u0249\3\2"+
		"\2\2\u0249\u0257\3\2\2\2\u024a\u024c\5:\36\2\u024b\u024d\7\4\2\2\u024c"+
		"\u024b\3\2\2\2\u024c\u024d\3\2\2\2\u024d\u0257\3\2\2\2\u024e\u0250\5\u0202"+
		"\u0102\2\u024f\u0251\7\3\2\2\u0250\u024f\3\2\2\2\u0250\u0251\3\2\2\2\u0251"+
		"\u0257\3\2\2\2\u0252\u0254\5\u0168\u00b5\2\u0253\u0255\7\3\2\2\u0254\u0253"+
		"\3\2\2\2\u0254\u0255\3\2\2\2\u0255\u0257\3\2\2\2\u0256\u0235\3\2\2\2\u0256"+
		"\u0239\3\2\2\2\u0256\u023d\3\2\2\2\u0256\u0241\3\2\2\2\u0256\u0242\3\2"+
		"\2\2\u0256\u0246\3\2\2\2\u0256\u024a\3\2\2\2\u0256\u024e\3\2\2\2\u0256"+
		"\u0252\3\2\2\2\u0257\5\3\2\2\2\u0258\u025a\5\4\3\2\u0259\u0258\3\2\2\2"+
		"\u025a\u025b\3\2\2\2\u025b\u0259\3\2\2\2\u025b\u025c\3\2\2\2\u025c\7\3"+
		"\2\2\2\u025d\u0261\5\n\6\2\u025e\u0261\5\f\7\2\u025f\u0261\5\16\b\2\u0260"+
		"\u025d\3\2\2\2\u0260\u025e\3\2\2\2\u0260\u025f\3\2\2\2\u0261\t\3\2\2\2"+
		"\u0262\u0264\7\5\2\2\u0263\u0265\7\6\2\2\u0264\u0263\3\2\2\2\u0264\u0265"+
		"\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\5\u0144\u00a3\2\u0267\u0268\7"+
		"\7\2\2\u0268\u026a\5\u0168\u00b5\2\u0269\u026b\5H%\2\u026a\u0269\3\2\2"+
		"\2\u026a\u026b\3\2\2\2\u026b\u026c\3\2\2\2\u026c\u026d\5z>\2\u026d\13"+
		"\3\2\2\2\u026e\u026f\7\b\2\2\u026f\u0270\5@!\2\u0270\u0271\5z>\2\u0271"+
		"\r\3\2\2\2\u0272\u0273\7\t\2\2\u0273\u0274\5z>\2\u0274\u0275\7\b\2\2\u0275"+
		"\u0276\5\u0168\u00b5\2\u0276\17\3\2\2\2\u0277\u027b\5\22\n\2\u0278\u027b"+
		"\5\26\f\2\u0279\u027b\5\30\r\2\u027a\u0277\3\2\2\2\u027a\u0278\3\2\2\2"+
		"\u027a\u0279\3\2\2\2\u027b\21\3\2\2\2\u027c\u027d\7\n\2\2\u027d\u027e"+
		"\5@!\2\u027e\u0280\5z>\2\u027f\u0281\5\24\13\2\u0280\u027f\3\2\2\2\u0280"+
		"\u0281\3\2\2\2\u0281\23\3\2\2\2\u0282\u0283\7\13\2\2\u0283\u0287\5z>\2"+
		"\u0284\u0285\7\13\2\2\u0285\u0287\5\22\n\2\u0286\u0282\3\2\2\2\u0286\u0284"+
		"\3\2\2\2\u0287\25\3\2\2\2\u0288\u0289\7\f\2\2\u0289\u028a\5@!\2\u028a"+
		"\u028b\7\13\2\2\u028b\u028c\5z>\2\u028c\27\3\2\2\2\u028d\u028e\7\r\2\2"+
		"\u028e\u028f\5\u0168\u00b5\2\u028f\u0291\7\16\2\2\u0290\u0292\5\32\16"+
		"\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293\u0294"+
		"\7\17\2\2\u0294\31\3\2\2\2\u0295\u0297\5\34\17\2\u0296\u0295\3\2\2\2\u0297"+
		"\u0298\3\2\2\2\u0298\u0296\3\2\2\2\u0298\u0299\3\2\2\2\u0299\33\3\2\2"+
		"\2\u029a\u029b\5\36\20\2\u029b\u029c\5\6\4\2\u029c\u02a7\3\2\2\2\u029d"+
		"\u029e\5$\23\2\u029e\u029f\5\6\4\2\u029f\u02a7\3\2\2\2\u02a0\u02a1\5\36"+
		"\20\2\u02a1\u02a2\7\3\2\2\u02a2\u02a7\3\2\2\2\u02a3\u02a4\5$\23\2\u02a4"+
		"\u02a5\7\3\2\2\u02a5\u02a7\3\2\2\2\u02a6\u029a\3\2\2\2\u02a6\u029d\3\2"+
		"\2\2\u02a6\u02a0\3\2\2\2\u02a6\u02a3\3\2\2\2\u02a7\35\3\2\2\2\u02a8\u02a9"+
		"\7\6\2\2\u02a9\u02aa\5 \21\2\u02aa\u02ab\7\4\2\2\u02ab\37\3\2\2\2\u02ac"+
		"\u02b1\5\"\22\2\u02ad\u02ae\7\20\2\2\u02ae\u02b0\5\"\22\2\u02af\u02ad"+
		"\3\2\2\2\u02b0\u02b3\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2"+
		"!\3\2\2\2\u02b3\u02b1\3\2\2\2\u02b4\u02b6\5\u0144\u00a3\2\u02b5\u02b7"+
		"\5H%\2\u02b6\u02b5\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7#\3\2\2\2\u02b8\u02b9"+
		"\7\21\2\2\u02b9\u02ba\7\4\2\2\u02ba%\3\2\2\2\u02bb\u02c0\5(\25\2\u02bc"+
		"\u02c1\5\b\5\2\u02bd\u02c1\5\22\n\2\u02be\u02c1\5\30\r\2\u02bf\u02c1\5"+
		":\36\2\u02c0\u02bc\3\2\2\2\u02c0\u02bd\3\2\2\2\u02c0\u02be\3\2\2\2\u02c0"+
		"\u02bf\3\2\2\2\u02c1\'\3\2\2\2\u02c2\u02c3\5*\26\2\u02c3\u02c4\7\4\2\2"+
		"\u02c4)\3\2\2\2\u02c5\u02c6\5\u021e\u0110\2\u02c6+\3\2\2\2\u02c7\u02cd"+
		"\5.\30\2\u02c8\u02cd\5\60\31\2\u02c9\u02cd\5\62\32\2\u02ca\u02cd\5\64"+
		"\33\2\u02cb\u02cd\5\66\34\2\u02cc\u02c7\3\2\2\2\u02cc\u02c8\3\2\2\2\u02cc"+
		"\u02c9\3\2\2\2\u02cc\u02ca\3\2\2\2\u02cc\u02cb\3\2\2\2\u02cd-\3\2\2\2"+
		"\u02ce\u02d0\7\22\2\2\u02cf\u02d1\5*\26\2\u02d0\u02cf\3\2\2\2\u02d0\u02d1"+
		"\3\2\2\2\u02d1/\3\2\2\2\u02d2\u02d4\7\23\2\2\u02d3\u02d5\5*\26\2\u02d4"+
		"\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\61\3\2\2\2\u02d6\u02d7\7\24\2"+
		"\2\u02d7\63\3\2\2\2\u02d8\u02da\7\25\2\2\u02d9\u02db\5\u0168\u00b5\2\u02da"+
		"\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db\65\3\2\2\2\u02dc\u02dd\7\26\2"+
		"\2\u02dd\u02de\5\u0168\u00b5\2\u02de\67\3\2\2\2\u02df\u02e0\7\27\2\2\u02e0"+
		"\u02e1\5z>\2\u02e19\3\2\2\2\u02e2\u02e3\7\30\2\2\u02e3\u02e5\5z>\2\u02e4"+
		"\u02e6\5<\37\2\u02e5\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6;\3\2\2\2"+
		"\u02e7\u02e9\5> \2\u02e8\u02ea\5<\37\2\u02e9\u02e8\3\2\2\2\u02e9\u02ea"+
		"\3\2\2\2\u02ea=\3\2\2\2\u02eb\u02ed\7\31\2\2\u02ec\u02ee\5\u0144\u00a3"+
		"\2\u02ed\u02ec\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02f0\3\2\2\2\u02ef\u02f1"+
		"\5H%\2\u02f0\u02ef\3\2\2\2\u02f0\u02f1\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2"+
		"\u02f3\5z>\2\u02f3?\3\2\2\2\u02f4\u02f9\5B\"\2\u02f5\u02f6\7\20\2\2\u02f6"+
		"\u02f8\5B\"\2\u02f7\u02f5\3\2\2\2\u02f8\u02fb\3\2\2\2\u02f9\u02f7\3\2"+
		"\2\2\u02f9\u02fa\3\2\2\2\u02faA\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fc\u0301"+
		"\5L\'\2\u02fd\u0301\5D#\2\u02fe\u0301\5F$\2\u02ff\u0301\5\u0168\u00b5"+
		"\2\u0300\u02fc\3\2\2\2\u0300\u02fd\3\2\2\2\u0300\u02fe\3\2\2\2\u0300\u02ff"+
		"\3\2\2\2\u0301C\3\2\2\2\u0302\u0303\7\6\2\2\u0303\u0304\5\u0144\u00a3"+
		"\2\u0304\u0305\5\u008aF\2\u0305E\3\2\2\2\u0306\u0307\t\2\2\2\u0307\u0308"+
		"\5\u0144\u00a3\2\u0308\u0309\5\u008aF\2\u0309G\3\2\2\2\u030a\u030b\7\34"+
		"\2\2\u030b\u030c\5J&\2\u030cI\3\2\2\2\u030d\u030e\5\u0168\u00b5\2\u030e"+
		"K\3\2\2\2\u030f\u0310\7\35\2\2\u0310\u0311\7\36\2\2\u0311\u0312\5N(\2"+
		"\u0312\u0313\7\37\2\2\u0313M\3\2\2\2\u0314\u0319\5P)\2\u0315\u0316\7\20"+
		"\2\2\u0316\u0318\5N(\2\u0317\u0315\3\2\2\2\u0318\u031b\3\2\2\2\u0319\u0317"+
		"\3\2\2\2\u0319\u031a\3\2\2\2\u031aO\3\2\2\2\u031b\u0319\3\2\2\2\u031c"+
		"\u031d\5R*\2\u031d\u031e\5T+\2\u031e\u0321\3\2\2\2\u031f\u0321\7 \2\2"+
		"\u0320\u031c\3\2\2\2\u0320\u031f\3\2\2\2\u0321Q\3\2\2\2\u0322\u0323\t"+
		"\3\2\2\u0323S\3\2\2\2\u0324\u0325\t\4\2\2\u0325U\3\2\2\2\u0326\u0327\7"+
		"*\2\2\u0327\u0328\5X-\2\u0328\u0329\7+\2\2\u0329W\3\2\2\2\u032a\u032f"+
		"\5Z.\2\u032b\u032c\7\20\2\2\u032c\u032e\5Z.\2\u032d\u032b\3\2\2\2\u032e"+
		"\u0331\3\2\2\2\u032f\u032d\3\2\2\2\u032f\u0330\3\2\2\2\u0330Y\3\2\2\2"+
		"\u0331\u032f\3\2\2\2\u0332\u033c\5\u01ea\u00f6\2\u0333\u0334\5\u01ea\u00f6"+
		"\2\u0334\u0335\7\4\2\2\u0335\u0336\5\u01e8\u00f5\2\u0336\u033c\3\2\2\2"+
		"\u0337\u0338\5\u01ea\u00f6\2\u0338\u0339\7\4\2\2\u0339\u033a\5\u01f4\u00fb"+
		"\2\u033a\u033c\3\2\2\2\u033b\u0332\3\2\2\2\u033b\u0333\3\2\2\2\u033b\u0337"+
		"\3\2\2\2\u033c[\3\2\2\2\u033d\u033e\7\34\2\2\u033e\u033f\5^\60\2\u033f"+
		"]\3\2\2\2\u0340\u0345\5`\61\2\u0341\u0342\7\20\2\2\u0342\u0344\5`\61\2"+
		"\u0343\u0341\3\2\2\2\u0344\u0347\3\2\2\2\u0345\u0343\3\2\2\2\u0345\u0346"+
		"\3\2\2\2\u0346_\3\2\2\2\u0347\u0345\3\2\2\2\u0348\u034b\5b\62\2\u0349"+
		"\u034b\5d\63\2\u034a\u0348\3\2\2\2\u034a\u0349\3\2\2\2\u034ba\3\2\2\2"+
		"\u034c\u034d\5\u01e8\u00f5\2\u034d\u034e\7\4\2\2\u034e\u034f\5\u01e8\u00f5"+
		"\2\u034f\u0355\3\2\2\2\u0350\u0351\5\u01e8\u00f5\2\u0351\u0352\7\4\2\2"+
		"\u0352\u0353\5\u01f4\u00fb\2\u0353\u0355\3\2\2\2\u0354\u034c\3\2\2\2\u0354"+
		"\u0350\3\2\2\2\u0355c\3\2\2\2\u0356\u0357\5\u01e8\u00f5\2\u0357\u0358"+
		"\7,\2\2\u0358\u0359\5\u01d2\u00ea\2\u0359e\3\2\2\2\u035a\u035b\7*\2\2"+
		"\u035b\u035c\5h\65\2\u035c\u035d\7+\2\2\u035dg\3\2\2\2\u035e\u0363\5j"+
		"\66\2\u035f\u0360\7\20\2\2\u0360\u0362\5j\66\2\u0361\u035f\3\2\2\2\u0362"+
		"\u0365\3\2\2\2\u0363\u0361\3\2\2\2\u0363\u0364\3\2\2\2\u0364i\3\2\2\2"+
		"\u0365\u0363\3\2\2\2\u0366\u0367\5\u01d2\u00ea\2\u0367k\3\2\2\2\u0368"+
		"\u036a\5|?\2\u0369\u036b\7\3\2\2\u036a\u0369\3\2\2\2\u036a\u036b\3\2\2"+
		"\2\u036b\u03a9\3\2\2\2\u036c\u036e\5\u0084C\2\u036d\u036f\7\3\2\2\u036e"+
		"\u036d\3\2\2\2\u036e\u036f\3\2\2\2\u036f\u03a9\3\2\2\2\u0370\u0372\5\u008c"+
		"G\2\u0371\u0373\7\3\2\2\u0372\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373"+
		"\u03a9\3\2\2\2\u0374\u0376\5\u00a6T\2\u0375\u0377\7\3\2\2\u0376\u0375"+
		"\3\2\2\2\u0376\u0377\3\2\2\2\u0377\u03a9\3\2\2\2\u0378\u037a\5\u00aeX"+
		"\2\u0379\u037b\7\3\2\2\u037a\u0379\3\2\2\2\u037a\u037b\3\2\2\2\u037b\u03a9"+
		"\3\2\2\2\u037c\u037e\5\u00c6d\2\u037d\u037f\7\3\2\2\u037e\u037d\3\2\2"+
		"\2\u037e\u037f\3\2\2\2\u037f\u03a9\3\2\2\2\u0380\u0382\5\u00e8u\2\u0381"+
		"\u0383\7\3\2\2\u0382\u0381\3\2\2\2\u0382\u0383\3\2\2\2\u0383\u03a9\3\2"+
		"\2\2\u0384\u0386\5\u00f2z\2\u0385\u0387\7\3\2\2\u0386\u0385\3\2\2\2\u0386"+
		"\u0387\3\2\2\2\u0387\u03a9\3\2\2\2\u0388\u038a\5\u00fe\u0080\2\u0389\u038b"+
		"\7\3\2\2\u038a\u0389\3\2\2\2\u038a\u038b\3\2\2\2\u038b\u03a9\3\2\2\2\u038c"+
		"\u038e\5\u0114\u008b\2\u038d\u038f\7\3\2\2\u038e\u038d\3\2\2\2\u038e\u038f"+
		"\3\2\2\2\u038f\u03a9\3\2\2\2\u0390\u0392\5\u011a\u008e\2\u0391\u0393\7"+
		"\3\2\2\u0392\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u03a9\3\2\2\2\u0394"+
		"\u0396\5\u011c\u008f\2\u0395\u0397\7\3\2\2\u0396\u0395\3\2\2\2\u0396\u0397"+
		"\3\2\2\2\u0397\u03a9\3\2\2\2\u0398\u039a\5\u0124\u0093\2\u0399\u039b\7"+
		"\3\2\2\u039a\u0399\3\2\2\2\u039a\u039b\3\2\2\2\u039b\u03a9\3\2\2\2\u039c"+
		"\u039e\5\u012a\u0096\2\u039d\u039f\7\3\2\2\u039e\u039d\3\2\2\2\u039e\u039f"+
		"\3\2\2\2\u039f\u03a9\3\2\2\2\u03a0\u03a2\5\u0202\u0102\2\u03a1\u03a3\7"+
		"\3\2\2\u03a2\u03a1\3\2\2\2\u03a2\u03a3\3\2\2\2\u03a3\u03a9\3\2\2\2\u03a4"+
		"\u03a6\5\u0134\u009b\2\u03a5\u03a7\7\3\2\2\u03a6\u03a5\3\2\2\2\u03a6\u03a7"+
		"\3\2\2\2\u03a7\u03a9\3\2\2\2\u03a8\u0368\3\2\2\2\u03a8\u036c\3\2\2\2\u03a8"+
		"\u0370\3\2\2\2\u03a8\u0374\3\2\2\2\u03a8\u0378\3\2\2\2\u03a8\u037c\3\2"+
		"\2\2\u03a8\u0380\3\2\2\2\u03a8\u0384\3\2\2\2\u03a8\u0388\3\2\2\2\u03a8"+
		"\u038c\3\2\2\2\u03a8\u0390\3\2\2\2\u03a8\u0394\3\2\2\2\u03a8\u0398\3\2"+
		"\2\2\u03a8\u039c\3\2\2\2\u03a8\u03a0\3\2\2\2\u03a8\u03a4\3\2\2\2\u03a9"+
		"m\3\2\2\2\u03aa\u03ac\5l\67\2\u03ab\u03aa\3\2\2\2\u03ac\u03ad\3\2\2\2"+
		"\u03ad\u03ab\3\2\2\2\u03ad\u03ae\3\2\2\2\u03aeo\3\2\2\2\u03af\u03b1\5"+
		"r:\2\u03b0\u03af\3\2\2\2\u03b1\u03b2\3\2\2\2\u03b2\u03b0\3\2\2\2\u03b2"+
		"\u03b3\3\2\2\2\u03b3q\3\2\2\2\u03b4\u03cd\7-\2\2\u03b5\u03cd\7.\2\2\u03b6"+
		"\u03cd\7/\2\2\u03b7\u03cd\7\60\2\2\u03b8\u03cd\7\61\2\2\u03b9\u03cd\7"+
		"\62\2\2\u03ba\u03cd\7\63\2\2\u03bb\u03cd\7\64\2\2\u03bc\u03cd\7\65\2\2"+
		"\u03bd\u03cd\7\66\2\2\u03be\u03cd\7\67\2\2\u03bf\u03cd\78\2\2\u03c0\u03cd"+
		"\79\2\2\u03c1\u03c2\79\2\2\u03c2\u03c3\7\36\2\2\u03c3\u03c4\7:\2\2\u03c4"+
		"\u03cd\7\37\2\2\u03c5\u03c6\79\2\2\u03c6\u03c7\7\36\2\2\u03c7\u03c8\7"+
		";\2\2\u03c8\u03cd\7\37\2\2\u03c9\u03cd\7<\2\2\u03ca\u03cd\5t;\2\u03cb"+
		"\u03cd\5x=\2\u03cc\u03b4\3\2\2\2\u03cc\u03b5\3\2\2\2\u03cc\u03b6\3\2\2"+
		"\2\u03cc\u03b7\3\2\2\2\u03cc\u03b8\3\2\2\2\u03cc\u03b9\3\2\2\2\u03cc\u03ba"+
		"\3\2\2\2\u03cc\u03bb\3\2\2\2\u03cc\u03bc\3\2\2\2\u03cc\u03bd\3\2\2\2\u03cc"+
		"\u03be\3\2\2\2\u03cc\u03bf\3\2\2\2\u03cc\u03c0\3\2\2\2\u03cc\u03c1\3\2"+
		"\2\2\u03cc\u03c5\3\2\2\2\u03cc\u03c9\3\2\2\2\u03cc\u03ca\3\2\2\2\u03cc"+
		"\u03cb\3\2\2\2\u03cds\3\2\2\2\u03ce\u03e8\7=\2\2\u03cf\u03d0\7=\2\2\u03d0"+
		"\u03d1\7\36\2\2\u03d1\u03d2\7>\2\2\u03d2\u03e8\7\37\2\2\u03d3\u03e8\7"+
		"?\2\2\u03d4\u03d5\7?\2\2\u03d5\u03d6\7\36\2\2\u03d6\u03d7\7>\2\2\u03d7"+
		"\u03e8\7\37\2\2\u03d8\u03e8\7@\2\2\u03d9\u03da\7@\2\2\u03da\u03db\7\36"+
		"\2\2\u03db\u03dc\7>\2\2\u03dc\u03e8\7\37\2\2\u03dd\u03e8\7A\2\2\u03de"+
		"\u03df\7A\2\2\u03df\u03e0\7\36\2\2\u03e0\u03e1\7>\2\2\u03e1\u03e8\7\37"+
		"\2\2\u03e2\u03e8\7B\2\2\u03e3\u03e4\7B\2\2\u03e4\u03e5\7\36\2\2\u03e5"+
		"\u03e6\7>\2\2\u03e6\u03e8\7\37\2\2\u03e7\u03ce\3\2\2\2\u03e7\u03cf\3\2"+
		"\2\2\u03e7\u03d3\3\2\2\2\u03e7\u03d4\3\2\2\2\u03e7\u03d8\3\2\2\2\u03e7"+
		"\u03d9\3\2\2\2\u03e7\u03dd\3\2\2\2\u03e7\u03de\3\2\2\2\u03e7\u03e2\3\2"+
		"\2\2\u03e7\u03e3\3\2\2\2\u03e8u\3\2\2\2\u03e9\u03eb\5t;\2\u03ea\u03e9"+
		"\3\2\2\2\u03eb\u03ec\3\2\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed"+
		"w\3\2\2\2\u03ee\u03ef\t\5\2\2\u03efy\3\2\2\2\u03f0\u03f2\7\16\2\2\u03f1"+
		"\u03f3\5\6\4\2\u03f2\u03f1\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f4\3\2"+
		"\2\2\u03f4\u03f5\7\17\2\2\u03f5{\3\2\2\2\u03f6\u03f8\5\u0162\u00b2\2\u03f7"+
		"\u03f6\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\3\2\2\2\u03f9\u03fb\7E"+
		"\2\2\u03fa\u03fc\5~@\2\u03fb\u03fa\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fc\u03fd"+
		"\3\2\2\2\u03fd\u03fe\5\u0080A\2\u03fe}\3\2\2\2\u03ff\u0400\t\6\2\2\u0400"+
		"\177\3\2\2\2\u0401\u0407\5\u0082B\2\u0402\u0403\5\u0082B\2\u0403\u0404"+
		"\7K\2\2\u0404\u0405\5\u0080A\2\u0405\u0407\3\2\2\2\u0406\u0401\3\2\2\2"+
		"\u0406\u0402\3\2\2\2\u0407\u0081\3\2\2\2\u0408\u040b\5\u021e\u0110\2\u0409"+
		"\u040b\5\u01ca\u00e6\2\u040a\u0408\3\2\2\2\u040a\u0409\3\2\2\2\u040b\u0083"+
		"\3\2\2\2\u040c\u040e\5\u0162\u00b2\2\u040d\u040c\3\2\2\2\u040d\u040e\3"+
		"\2\2\2\u040e\u0410\3\2\2\2\u040f\u0411\5p9\2\u0410\u040f\3\2\2\2\u0410"+
		"\u0411\3\2\2\2\u0411\u0412\3\2\2\2\u0412\u0413\7\32\2\2\u0413\u0414\5"+
		"\u0086D\2\u0414\u0085\3\2\2\2\u0415\u041a\5\u0088E\2\u0416\u0417\7\20"+
		"\2\2\u0417\u0419\5\u0088E\2\u0418\u0416\3\2\2\2\u0419\u041c\3\2\2\2\u041a"+
		"\u0418\3\2\2\2\u041a\u041b\3\2\2\2\u041b\u0087\3\2\2\2\u041c\u041a\3\2"+
		"\2\2\u041d\u041f\5\u0144\u00a3\2\u041e\u0420\5\u008aF\2\u041f\u041e\3"+
		"\2\2\2\u041f\u0420\3\2\2\2\u0420\u0089\3\2\2\2\u0421\u0422\7L\2\2\u0422"+
		"\u0423\5\u0168\u00b5\2\u0423\u008b\3\2\2\2\u0424\u0425\5\u008eH\2\u0425"+
		"\u0426\5\u0090I\2\u0426\u0427\5\u01e6\u00f4\2\u0427\u0428\5\u0092J\2\u0428"+
		"\u0444\3\2\2\2\u0429\u042a\5\u008eH\2\u042a\u042b\5\u0090I\2\u042b\u042c"+
		"\5\u01e6\u00f4\2\u042c\u042d\5\u009aN\2\u042d\u0444\3\2\2\2\u042e\u042f"+
		"\5\u008eH\2\u042f\u0430\5\u0090I\2\u0430\u0431\5\u008aF\2\u0431\u0432"+
		"\5\u00a0Q\2\u0432\u0444\3\2\2\2\u0433\u0434\5\u008eH\2\u0434\u0435\5\u0090"+
		"I\2\u0435\u0437\5\u01e6\u00f4\2\u0436\u0438\5\u008aF\2\u0437\u0436\3\2"+
		"\2\2\u0437\u0438\3\2\2\2\u0438\u0439\3\2\2\2\u0439\u043a\5\u00a0Q\2\u043a"+
		"\u0444\3\2\2\2\u043b\u043c\5\u008eH\2\u043c\u043d\5\u0090I\2\u043d\u043e"+
		"\5\u01e6\u00f4\2\u043e\u043f\5z>\2\u043f\u0444\3\2\2\2\u0440\u0441\5\u008e"+
		"H\2\u0441\u0442\5\u0086D\2\u0442\u0444\3\2\2\2\u0443\u0424\3\2\2\2\u0443"+
		"\u0429\3\2\2\2\u0443\u042e\3\2\2\2\u0443\u0433\3\2\2\2\u0443\u043b\3\2"+
		"\2\2\u0443\u0440\3\2\2\2\u0444\u008d\3\2\2\2\u0445\u0447\5\u0162\u00b2"+
		"\2\u0446\u0445\3\2\2\2\u0446\u0447\3\2\2\2\u0447\u0449\3\2\2\2\u0448\u044a"+
		"\5p9\2\u0449\u0448\3\2\2\2\u0449\u044a\3\2\2\2\u044a\u044b\3\2\2\2\u044b"+
		"\u044c\7\33\2\2\u044c\u008f\3\2\2\2\u044d\u044e\5\u021e\u0110\2\u044e"+
		"\u0091\3\2\2\2\u044f\u0450\7\16\2\2\u0450\u0452\5\u0094K\2\u0451\u0453"+
		"\5\u0096L\2\u0452\u0451\3\2\2\2\u0452\u0453\3\2\2\2\u0453\u0454\3\2\2"+
		"\2\u0454\u0455\7\17\2\2\u0455\u045c\3\2\2\2\u0456\u0457\7\16\2\2\u0457"+
		"\u0458\5\u0096L\2\u0458\u0459\5\u0094K\2\u0459\u045a\7\17\2\2\u045a\u045c"+
		"\3\2\2\2\u045b\u044f\3\2\2\2\u045b\u0456\3\2\2\2\u045c\u0093\3\2\2\2\u045d"+
		"\u045f\5\u0162\u00b2\2\u045e\u045d\3\2\2\2\u045e\u045f\3\2\2\2\u045f\u0461"+
		"\3\2\2\2\u0460\u0462\5p9\2\u0461\u0460\3\2\2\2\u0461\u0462\3\2\2\2\u0462"+
		"\u0463\3\2\2\2\u0463\u0464\7M\2\2\u0464\u0465\5z>\2\u0465\u0095\3\2\2"+
		"\2\u0466\u0468\5\u0162\u00b2\2\u0467\u0466\3\2\2\2\u0467\u0468\3\2\2\2"+
		"\u0468\u046a\3\2\2\2\u0469\u046b\5p9\2\u046a\u0469\3\2\2\2\u046a\u046b"+
		"\3\2\2\2\u046b\u046c\3\2\2\2\u046c\u046e\7>\2\2\u046d\u046f\5\u0098M\2"+
		"\u046e\u046d\3\2\2\2\u046e\u046f\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0471"+
		"\5z>\2\u0471\u0097\3\2\2\2\u0472\u0473\7\36\2\2\u0473\u0474\5\u021e\u0110"+
		"\2\u0474\u0475\7\37\2\2\u0475\u0099\3\2\2\2\u0476\u0477\7\16\2\2\u0477"+
		"\u0479\5\u009cO\2\u0478\u047a\5\u009eP\2\u0479\u0478\3\2\2\2\u0479\u047a"+
		"\3\2\2\2\u047a\u047b\3\2\2\2\u047b\u047c\7\17\2\2\u047c\u0483\3\2\2\2"+
		"\u047d\u047e\7\16\2\2\u047e\u047f\5\u009eP\2\u047f\u0480\5\u009cO\2\u0480"+
		"\u0481\7\17\2\2\u0481\u0483\3\2\2\2\u0482\u0476\3\2\2\2\u0482\u047d\3"+
		"\2\2\2\u0483\u009b\3\2\2\2\u0484\u0486\5\u0162\u00b2\2\u0485\u0484\3\2"+
		"\2\2\u0485\u0486\3\2\2\2\u0486\u0487\3\2\2\2\u0487\u0488\7M\2\2\u0488"+
		"\u009d\3\2\2\2\u0489\u048b\5\u0162\u00b2\2\u048a\u0489\3\2\2\2\u048a\u048b"+
		"\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u048d\7>\2\2\u048d\u009f\3\2\2\2\u048e"+
		"\u048f\7\16\2\2\u048f\u0491\5\u00a2R\2\u0490\u0492\5\u00a4S\2\u0491\u0490"+
		"\3\2\2\2\u0491\u0492\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0494\7\17\2\2"+
		"\u0494\u049d\3\2\2\2\u0495\u0496\7\16\2\2\u0496\u0498\5\u00a4S\2\u0497"+
		"\u0499\5\u00a2R\2\u0498\u0497\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049a"+
		"\3\2\2\2\u049a\u049b\7\17\2\2\u049b\u049d\3\2\2\2\u049c\u048e\3\2\2\2"+
		"\u049c\u0495\3\2\2\2\u049d\u00a1\3\2\2\2\u049e\u04a0\5\u0162\u00b2\2\u049f"+
		"\u049e\3\2\2\2\u049f\u04a0\3\2\2\2\u04a0\u04a1\3\2\2\2\u04a1\u04a3\7N"+
		"\2\2\u04a2\u04a4\5\u0098M\2\u04a3\u04a2\3\2\2\2\u04a3\u04a4\3\2\2\2\u04a4"+
		"\u04a5\3\2\2\2\u04a5\u04a6\5z>\2\u04a6\u00a3\3\2\2\2\u04a7\u04a9\5\u0162"+
		"\u00b2\2\u04a8\u04a7\3\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa"+
		"\u04ac\7O\2\2\u04ab\u04ad\5\u0098M\2\u04ac\u04ab\3\2\2\2\u04ac\u04ad\3"+
		"\2\2\2\u04ad\u04ae\3\2\2\2\u04ae\u04af\5z>\2\u04af\u00a5\3\2\2\2\u04b0"+
		"\u04b1\5\u00a8U\2\u04b1\u04b2\5\u00acW\2\u04b2\u00a7\3\2\2\2\u04b3\u04b5"+
		"\5\u0162\u00b2\2\u04b4\u04b3\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b7\3"+
		"\2\2\2\u04b6\u04b8\5t;\2\u04b7\u04b6\3\2\2\2\u04b7\u04b8\3\2\2\2\u04b8"+
		"\u04b9\3\2\2\2\u04b9\u04ba\7F\2\2\u04ba\u04bc\5\u00aaV\2\u04bb\u04bd\5"+
		"V,\2\u04bc\u04bb\3\2\2\2\u04bc\u04bd\3\2\2\2\u04bd\u00a9\3\2\2\2\u04be"+
		"\u04bf\5\u021e\u0110\2\u04bf\u00ab\3\2\2\2\u04c0\u04c1\7L\2\2\u04c1\u04c2"+
		"\5\u01d2\u00ea\2\u04c2\u00ad\3\2\2\2\u04c3\u04c4\5\u00b0Y\2\u04c4\u04c6"+
		"\5\u00b2Z\2\u04c5\u04c7\5V,\2\u04c6\u04c5\3\2\2\2\u04c6\u04c7\3\2\2\2"+
		"\u04c7\u04c8\3\2\2\2\u04c8\u04ca\5\u00b4[\2\u04c9\u04cb\5\\/\2\u04ca\u04c9"+
		"\3\2\2\2\u04ca\u04cb\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04cd\5\u00b8]"+
		"\2\u04cd\u04d8\3\2\2\2\u04ce\u04cf\5\u00b0Y\2\u04cf\u04d1\5\u00b2Z\2\u04d0"+
		"\u04d2\5V,\2\u04d1\u04d0\3\2\2\2\u04d1\u04d2\3\2\2\2\u04d2\u04d3\3\2\2"+
		"\2\u04d3\u04d5\5\u00b4[\2\u04d4\u04d6\5\\/\2\u04d5\u04d4\3\2\2\2\u04d5"+
		"\u04d6\3\2\2\2\u04d6\u04d8\3\2\2\2\u04d7\u04c3\3\2\2\2\u04d7\u04ce\3\2"+
		"\2\2\u04d8\u00af\3\2\2\2\u04d9\u04db\5\u0162\u00b2\2\u04da\u04d9\3\2\2"+
		"\2\u04da\u04db\3\2\2\2\u04db\u04dd\3\2\2\2\u04dc\u04de\5p9\2\u04dd\u04dc"+
		"\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04df\3\2\2\2\u04df\u04e0\7J\2\2\u04e0"+
		"\u00b1\3\2\2\2\u04e1\u04e4\5\u021e\u0110\2\u04e2\u04e4\5\u01ca\u00e6\2"+
		"\u04e3\u04e1\3\2\2\2\u04e3\u04e2\3\2\2\2\u04e4\u00b3\3\2\2\2\u04e5\u04e7"+
		"\5\u00ba^\2\u04e6\u04e8\t\7\2\2\u04e7\u04e6\3\2\2\2\u04e7\u04e8\3\2\2"+
		"\2\u04e8\u04ea\3\2\2\2\u04e9\u04eb\5\u00b6\\\2\u04ea\u04e9\3\2\2\2\u04ea"+
		"\u04eb\3\2\2\2\u04eb\u00b5\3\2\2\2\u04ec\u04ee\7R\2\2\u04ed\u04ef\5\u0162"+
		"\u00b2\2\u04ee\u04ed\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f0\3\2\2\2\u04f0"+
		"\u04f1\5\u01d2\u00ea\2\u04f1\u00b7\3\2\2\2\u04f2\u04f3\5z>\2\u04f3\u00b9"+
		"\3\2\2\2\u04f4\u04f5\7\36\2\2\u04f5\u04fe\7\37\2\2\u04f6\u04f7\7\36\2"+
		"\2\u04f7\u04f9\5\u00bc_\2\u04f8\u04fa\7S\2\2\u04f9\u04f8\3\2\2\2\u04f9"+
		"\u04fa\3\2\2\2\u04fa\u04fb\3\2\2\2\u04fb\u04fc\7\37\2\2\u04fc\u04fe\3"+
		"\2\2\2\u04fd\u04f4\3\2\2\2\u04fd\u04f6\3\2\2\2\u04fe\u00bb\3\2\2\2\u04ff"+
		"\u0504\5\u00be`\2\u0500\u0501\7\20\2\2\u0501\u0503\5\u00be`\2\u0502\u0500"+
		"\3\2\2\2\u0503\u0506\3\2\2\2\u0504\u0502\3\2\2\2\u0504\u0505\3\2\2\2\u0505"+
		"\u00bd\3\2\2\2\u0506\u0504\3\2\2\2\u0507\u0509\5\u0162\u00b2\2\u0508\u0507"+
		"\3\2\2\2\u0508\u0509\3\2\2\2\u0509\u050b\3\2\2\2\u050a\u050c\5\u00c0a"+
		"\2\u050b\u050a\3\2\2\2\u050b\u050c\3\2\2\2\u050c\u050d\3\2\2\2\u050d\u050e"+
		"\5\u00c2b\2\u050e\u0510\5\u01e6\u00f4\2\u050f\u0511\5\u00c4c\2\u0510\u050f"+
		"\3\2\2\2\u0510\u0511\3\2\2\2\u0511\u051d\3\2\2\2\u0512\u0514\5\u0162\u00b2"+
		"\2\u0513\u0512\3\2\2\2\u0513\u0514\3\2\2\2\u0514\u0516\3\2\2\2\u0515\u0517"+
		"\5\u00c0a\2\u0516\u0515\3\2\2\2\u0516\u0517\3\2\2\2\u0517\u0518\3\2\2"+
		"\2\u0518\u0519\5\u00c2b\2\u0519\u051a\5\u01e6\u00f4\2\u051a\u051b\7S\2"+
		"\2\u051b\u051d\3\2\2\2\u051c\u0508\3\2\2\2\u051c\u0513\3\2\2\2\u051d\u00bf"+
		"\3\2\2\2\u051e\u0522\5\u021e\u0110\2\u051f\u0522\5\u0220\u0111\2\u0520"+
		"\u0522\7T\2\2\u0521\u051e\3\2\2\2\u0521\u051f\3\2\2\2\u0521\u0520\3\2"+
		"\2\2\u0522\u00c1\3\2\2\2\u0523\u0526\5\u021e\u0110\2\u0524\u0526\7T\2"+
		"\2\u0525\u0523\3\2\2\2\u0525\u0524\3\2\2\2\u0526\u00c3\3\2\2\2\u0527\u0528"+
		"\7L\2\2\u0528\u0529\5\u0168\u00b5\2\u0529\u00c5\3\2\2\2\u052a\u052c\5"+
		"\u0162\u00b2\2\u052b\u052a\3\2\2\2\u052b\u052c\3\2\2\2\u052c\u052e\3\2"+
		"\2\2\u052d\u052f\5t;\2\u052e\u052d\3\2\2\2\u052e\u052f\3\2\2\2\u052f\u0530"+
		"\3\2\2\2\u0530\u0531\5\u00c8e\2\u0531\u00c7\3\2\2\2\u0532\u0535\5\u00ca"+
		"f\2\u0533\u0535\5\u00dan\2\u0534\u0532\3\2\2\2\u0534\u0533\3\2\2\2\u0535"+
		"\u00c9\3\2\2\2\u0536\u0538\7U\2\2\u0537\u0536\3\2\2\2\u0537\u0538\3\2"+
		"\2\2\u0538\u0539\3\2\2\2\u0539\u053a\7H\2\2\u053a\u053c\5\u00d6l\2\u053b"+
		"\u053d\5V,\2\u053c\u053b\3\2\2\2\u053c\u053d\3\2\2\2\u053d\u053f\3\2\2"+
		"\2\u053e\u0540\5\u01fc\u00ff\2\u053f\u053e\3\2\2\2\u053f\u0540\3\2\2\2"+
		"\u0540\u0542\3\2\2\2\u0541\u0543\5\\/\2\u0542\u0541\3\2\2\2\u0542\u0543"+
		"\3\2\2\2\u0543\u0544\3\2\2\2\u0544\u0546\7\16\2\2\u0545\u0547\5\u00cc"+
		"g\2\u0546\u0545\3\2\2\2\u0546\u0547\3\2\2\2\u0547\u0548\3\2\2\2\u0548"+
		"\u0549\7\17\2\2\u0549\u00cb\3\2\2\2\u054a\u054c\5\u00ceh\2\u054b\u054a"+
		"\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u054b\3\2\2\2\u054d\u054e\3\2\2\2\u054e"+
		"\u00cd\3\2\2\2\u054f\u0556\5l\67\2\u0550\u0552\5\u00d0i\2\u0551\u0553"+
		"\7\3\2\2\u0552\u0551\3\2\2\2\u0552\u0553\3\2\2\2\u0553\u0556\3\2\2\2\u0554"+
		"\u0556\5\u0202\u0102\2\u0555\u054f\3\2\2\2\u0555\u0550\3\2\2\2\u0555\u0554"+
		"\3\2\2\2\u0556\u00cf\3\2\2\2\u0557\u0559\5\u0162\u00b2\2\u0558\u0557\3"+
		"\2\2\2\u0558\u0559\3\2\2\2\u0559\u055b\3\2\2\2\u055a\u055c\7U\2\2\u055b"+
		"\u055a\3\2\2\2\u055b\u055c\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055e\7\6"+
		"\2\2\u055e\u055f\5\u00d2j\2\u055f\u00d1\3\2\2\2\u0560\u0565\5\u00d4k\2"+
		"\u0561\u0562\7\20\2\2\u0562\u0564\5\u00d4k\2\u0563\u0561\3\2\2\2\u0564"+
		"\u0567\3\2\2\2\u0565\u0563\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u00d3\3\2"+
		"\2\2\u0567\u0565\3\2\2\2\u0568\u056a\5\u00d8m\2\u0569\u056b\5\u01ec\u00f7"+
		"\2\u056a\u0569\3\2\2\2\u056a\u056b\3\2\2\2\u056b\u00d5\3\2\2\2\u056c\u056d"+
		"\5\u021e\u0110\2\u056d\u00d7\3\2\2\2\u056e\u056f\5\u021e\u0110\2\u056f"+
		"\u00d9\3\2\2\2\u0570\u0571\7H\2\2\u0571\u0573\5\u00d6l\2\u0572\u0574\5"+
		"V,\2\u0573\u0572\3\2\2\2\u0573\u0574\3\2\2\2\u0574\u0576\3\2\2\2\u0575"+
		"\u0577\5\u01fc\u00ff\2\u0576\u0575\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0579"+
		"\3\2\2\2\u0578\u057a\5\\/\2\u0579\u0578\3\2\2\2\u0579\u057a\3\2\2\2\u057a"+
		"\u057b\3\2\2\2\u057b\u057d\7\16\2\2\u057c\u057e\5\u00dco\2\u057d\u057c"+
		"\3\2\2\2\u057d\u057e\3\2\2\2\u057e\u057f\3\2\2\2\u057f\u0580\7\17\2\2"+
		"\u0580\u00db\3\2\2\2\u0581\u0583\5\u00dep\2\u0582\u0581\3\2\2\2\u0583"+
		"\u0584\3\2\2\2\u0584\u0582\3\2\2\2\u0584\u0585\3\2\2\2\u0585\u00dd\3\2"+
		"\2\2\u0586\u058a\5l\67\2\u0587\u058a\5\u00e0q\2\u0588\u058a\5\u0202\u0102"+
		"\2\u0589\u0586\3\2\2\2\u0589\u0587\3\2\2\2\u0589\u0588\3\2\2\2\u058a\u00df"+
		"\3\2\2\2\u058b\u058d\5\u0162\u00b2\2\u058c\u058b\3\2\2\2\u058c\u058d\3"+
		"\2\2\2\u058d\u058e\3\2\2\2\u058e\u058f\7\6\2\2\u058f\u0590\5\u00e2r\2"+
		"\u0590\u00e1\3\2\2\2\u0591\u0596\5\u00e4s\2\u0592\u0593\7\20\2\2\u0593"+
		"\u0595\5\u00e4s\2\u0594\u0592\3\2\2\2\u0595\u0598\3\2\2\2\u0596\u0594"+
		"\3\2\2\2\u0596\u0597\3\2\2\2\u0597\u00e3\3\2\2\2\u0598\u0596\3\2\2\2\u0599"+
		"\u059b\5\u00d8m\2\u059a\u059c\5\u00e6t\2\u059b\u059a\3\2\2\2\u059b\u059c"+
		"\3\2\2\2\u059c\u00e5\3\2\2\2\u059d\u059e\7L\2\2\u059e\u059f\5\u022a\u0116"+
		"\2\u059f\u00e7\3\2\2\2\u05a0\u05a2\5\u0162\u00b2\2\u05a1\u05a0\3\2\2\2"+
		"\u05a1\u05a2\3\2\2\2\u05a2\u05a4\3\2\2\2\u05a3\u05a5\5t;\2\u05a4\u05a3"+
		"\3\2\2\2\u05a4\u05a5\3\2\2\2\u05a5\u05a6\3\2\2\2\u05a6\u05a7\7G\2\2\u05a7"+
		"\u05a9\5\u00eav\2\u05a8\u05aa\5V,\2\u05a9\u05a8\3\2\2\2\u05a9\u05aa\3"+
		"\2\2\2\u05aa\u05ac\3\2\2\2\u05ab\u05ad\5\u01fc\u00ff\2\u05ac\u05ab\3\2"+
		"\2\2\u05ac\u05ad\3\2\2\2\u05ad\u05af\3\2\2\2\u05ae\u05b0\5\\/\2\u05af"+
		"\u05ae\3\2\2\2\u05af\u05b0\3\2\2\2\u05b0\u05b1\3\2\2\2\u05b1\u05b2\5\u00ec"+
		"w\2\u05b2\u00e9\3\2\2\2\u05b3\u05b4\5\u021e\u0110\2\u05b4\u00eb\3\2\2"+
		"\2\u05b5\u05b7\7\16\2\2\u05b6\u05b8\5\u00eex\2\u05b7\u05b6\3\2\2\2\u05b7"+
		"\u05b8\3\2\2\2\u05b8\u05b9\3\2\2\2\u05b9\u05ba\7\17\2\2\u05ba\u00ed\3"+
		"\2\2\2\u05bb\u05bd\5\u00f0y\2\u05bc\u05bb\3\2\2\2\u05bd\u05be\3\2\2\2"+
		"\u05be\u05bc\3\2\2\2\u05be\u05bf\3\2\2\2\u05bf\u00ef\3\2\2\2\u05c0\u05c3"+
		"\5l\67\2\u05c1\u05c3\5\u0202\u0102\2\u05c2\u05c0\3\2\2\2\u05c2\u05c1\3"+
		"\2\2\2\u05c3\u00f1\3\2\2\2\u05c4\u05c6\5\u0162\u00b2\2\u05c5\u05c4\3\2"+
		"\2\2\u05c5\u05c6\3\2\2\2\u05c6\u05c8\3\2\2\2\u05c7\u05c9\5\u00f4{\2\u05c8"+
		"\u05c7\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9\u05ca\3\2\2\2\u05ca\u05cb\7-"+
		"\2\2\u05cb\u05cd\5\u00f6|\2\u05cc\u05ce\5V,\2\u05cd\u05cc\3\2\2\2\u05cd"+
		"\u05ce\3\2\2\2\u05ce\u05d0\3\2\2\2\u05cf\u05d1\5\u01fc\u00ff\2\u05d0\u05cf"+
		"\3\2\2\2\u05d0\u05d1\3\2\2\2\u05d1\u05d3\3\2\2\2\u05d2\u05d4\5\\/\2\u05d3"+
		"\u05d2\3\2\2\2\u05d3\u05d4\3\2\2\2\u05d4\u05d5\3\2\2\2\u05d5\u05d6\5\u00f8"+
		"}\2\u05d6\u00f3\3\2\2\2\u05d7\u05d9\5t;\2\u05d8\u05da\7\60\2\2\u05d9\u05d8"+
		"\3\2\2\2\u05d9\u05da\3\2\2\2\u05da\u05e0\3\2\2\2\u05db\u05dd\7\60\2\2"+
		"\u05dc\u05de\5t;\2\u05dd\u05dc\3\2\2\2\u05dd\u05de\3\2\2\2\u05de\u05e0"+
		"\3\2\2\2\u05df\u05d7\3\2\2\2\u05df\u05db\3\2\2\2\u05e0\u00f5\3\2\2\2\u05e1"+
		"\u05e2\5\u021e\u0110\2\u05e2\u00f7\3\2\2\2\u05e3\u05e5\7\16\2\2\u05e4"+
		"\u05e6\5\u00fa~\2\u05e5\u05e4\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6\u05e7"+
		"\3\2\2\2\u05e7\u05e8\7\17\2\2\u05e8\u00f9\3\2\2\2\u05e9\u05eb\5\u00fc"+
		"\177\2\u05ea\u05e9\3\2\2\2\u05eb\u05ec\3\2\2\2\u05ec\u05ea\3\2\2\2\u05ec"+
		"\u05ed\3\2\2\2\u05ed\u00fb\3\2\2\2\u05ee\u05f1\5l\67\2\u05ef\u05f1\5\u0202"+
		"\u0102\2\u05f0\u05ee\3\2\2\2\u05f0\u05ef\3\2\2\2\u05f1\u00fd\3\2\2\2\u05f2"+
		"\u05f4\5\u0162\u00b2\2\u05f3\u05f2\3\2\2\2\u05f3\u05f4\3\2\2\2\u05f4\u05f6"+
		"\3\2\2\2\u05f5\u05f7\5t;\2\u05f6\u05f5\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7"+
		"\u05f8\3\2\2\2\u05f8\u05f9\7I\2\2\u05f9\u05fb\5\u0100\u0081\2\u05fa\u05fc"+
		"\5\u01fc\u00ff\2\u05fb\u05fa\3\2\2\2\u05fb\u05fc\3\2\2\2\u05fc\u05fd\3"+
		"\2\2\2\u05fd\u05fe\5\u0102\u0082\2\u05fe\u00ff\3\2\2\2\u05ff\u0600\5\u021e"+
		"\u0110\2\u0600\u0101\3\2\2\2\u0601\u0603\7\16\2\2\u0602\u0604\5\u0104"+
		"\u0083\2\u0603\u0602\3\2\2\2\u0603\u0604\3\2\2\2\u0604\u0605\3\2\2\2\u0605"+
		"\u0606\7\17\2\2\u0606\u0103\3\2\2\2\u0607\u0609\5\u0106\u0084\2\u0608"+
		"\u0607\3\2\2\2\u0609\u060a\3\2\2\2\u060a\u0608\3\2\2\2\u060a\u060b\3\2"+
		"\2\2\u060b\u0105\3\2\2\2\u060c\u060f\5\u0108\u0085\2\u060d\u060f\5\u0202"+
		"\u0102\2\u060e\u060c\3\2\2\2\u060e\u060d\3\2\2\2\u060f\u0107\3\2\2\2\u0610"+
		"\u0612\5\u010a\u0086\2\u0611\u0613\7\3\2\2\u0612\u0611\3\2\2\2\u0612\u0613"+
		"\3\2\2\2\u0613\u0625\3\2\2\2\u0614\u0616\5\u010c\u0087\2\u0615\u0617\7"+
		"\3\2\2\u0616\u0615\3\2\2\2\u0616\u0617\3\2\2\2\u0617\u0625\3\2\2\2\u0618"+
		"\u061a\5\u010e\u0088\2\u0619\u061b\7\3\2\2\u061a\u0619\3\2\2\2\u061a\u061b"+
		"\3\2\2\2\u061b\u0625\3\2\2\2\u061c\u061e\5\u0110\u0089\2\u061d\u061f\7"+
		"\3\2\2\u061e\u061d\3\2\2\2\u061e\u061f\3\2\2\2\u061f\u0625\3\2\2\2\u0620"+
		"\u0622\5\u0112\u008a\2\u0621\u0623\7\3\2\2\u0622\u0621\3\2\2\2\u0622\u0623"+
		"\3\2\2\2\u0623\u0625\3\2\2\2\u0624\u0610\3\2\2\2\u0624\u0614\3\2\2\2\u0624"+
		"\u0618\3\2\2\2\u0624\u061c\3\2\2\2\u0624\u0620\3\2\2\2\u0625\u0109\3\2"+
		"\2\2\u0626\u0627\5\u008eH\2\u0627\u0628\5\u0090I\2\u0628\u0629\5\u01e6"+
		"\u00f4\2\u0629\u062a\5\u009aN\2\u062a\u010b\3\2\2\2\u062b\u062c\5\u00b0"+
		"Y\2\u062c\u062e\5\u00b2Z\2\u062d\u062f\5V,\2\u062e\u062d\3\2\2\2\u062e"+
		"\u062f\3\2\2\2\u062f\u0630\3\2\2\2\u0630\u0632\5\u00b4[\2\u0631\u0633"+
		"\5\\/\2\u0632\u0631\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u010d\3\2\2\2\u0634"+
		"\u0636\5\u0116\u008c\2\u0635\u0637\5V,\2\u0636\u0635\3\2\2\2\u0636\u0637"+
		"\3\2\2\2\u0637\u0638\3\2\2\2\u0638\u063a\5\u00ba^\2\u0639\u063b\t\7\2"+
		"\2\u063a\u0639\3\2\2\2\u063a\u063b\3\2\2\2\u063b\u063d\3\2\2\2\u063c\u063e"+
		"\5\\/\2\u063d\u063c\3\2\2\2\u063d\u063e\3\2\2\2\u063e\u010f\3\2\2\2\u063f"+
		"\u0640\5\u0126\u0094\2\u0640\u0641\5\u0128\u0095\2\u0641\u0642\5\u009a"+
		"N\2\u0642\u0111\3\2\2\2\u0643\u0645\5\u0162\u00b2\2\u0644\u0643\3\2\2"+
		"\2\u0644\u0645\3\2\2\2\u0645\u0647\3\2\2\2\u0646\u0648\5t;\2\u0647\u0646"+
		"\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u0649\3\2\2\2\u0649\u064a\7V\2\2\u064a"+
		"\u064c\5\u00aaV\2\u064b\u064d\5\u01fc\u00ff\2\u064c\u064b\3\2\2\2\u064c"+
		"\u064d\3\2\2\2\u064d\u064f\3\2\2\2\u064e\u0650\5\u00acW\2\u064f\u064e"+
		"\3\2\2\2\u064f\u0650\3\2\2\2\u0650\u0113\3\2\2\2\u0651\u0653\5\u0116\u008c"+
		"\2\u0652\u0654\5V,\2\u0653\u0652\3\2\2\2\u0653\u0654\3\2\2\2\u0654\u0655"+
		"\3\2\2\2\u0655\u0657\5\u00ba^\2\u0656\u0658\t\7\2\2\u0657\u0656\3\2\2"+
		"\2\u0657\u0658\3\2\2\2\u0658\u065a\3\2\2\2\u0659\u065b\5\\/\2\u065a\u0659"+
		"\3\2\2\2\u065a\u065b\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u065d\5\u0118\u008d"+
		"\2\u065d\u0115\3\2\2\2\u065e\u0660\5\u0162\u00b2\2\u065f\u065e\3\2\2\2"+
		"\u065f\u0660\3\2\2\2\u0660\u0662\3\2\2\2\u0661\u0663\5p9\2\u0662\u0661"+
		"\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0664\3\2\2\2\u0664\u0666\7W\2\2\u0665"+
		"\u0667\t\b\2\2\u0666\u0665\3\2\2\2\u0666\u0667\3\2\2\2\u0667\u0117\3\2"+
		"\2\2\u0668\u0669\5z>\2\u0669\u0119\3\2\2\2\u066a\u066c\5\u0162\u00b2\2"+
		"\u066b\u066a\3\2\2\2\u066b\u066c\3\2\2\2\u066c\u066d\3\2\2\2\u066d\u066e"+
		"\7Z\2\2\u066e\u066f\5z>\2\u066f\u011b\3\2\2\2\u0670\u0672\5\u0162\u00b2"+
		"\2\u0671\u0670\3\2\2\2\u0671\u0672\3\2\2\2\u0672\u0674\3\2\2\2\u0673\u0675"+
		"\5t;\2\u0674\u0673\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0676\3\2\2\2\u0676"+
		"\u0677\7[\2\2\u0677\u067a\5\u01e8\u00f5\2\u0678\u067b\5\\/\2\u0679\u067b"+
		"\5\u01fc\u00ff\2\u067a\u0678\3\2\2\2\u067a\u0679\3\2\2\2\u067a\u067b\3"+
		"\2\2\2\u067b\u067c\3\2\2\2\u067c\u067d\5\u011e\u0090\2\u067d\u011d\3\2"+
		"\2\2\u067e\u0680\7\16\2\2\u067f\u0681\5\u0120\u0091\2\u0680\u067f\3\2"+
		"\2\2\u0680\u0681\3\2\2\2\u0681\u0682\3\2\2\2\u0682\u0683\7\17\2\2\u0683"+
		"\u011f\3\2\2\2\u0684\u0686\5\u0122\u0092\2\u0685\u0684\3\2\2\2\u0686\u0687"+
		"\3\2\2\2\u0687\u0685\3\2\2\2\u0687\u0688\3\2\2\2\u0688\u0121\3\2\2\2\u0689"+
		"\u068c\5l\67\2\u068a\u068c\5\u0202\u0102\2\u068b\u0689\3\2\2\2\u068b\u068a"+
		"\3\2\2\2\u068c\u0123\3\2\2\2\u068d\u068e\5\u0126\u0094\2\u068e\u068f\5"+
		"\u0128\u0095\2\u068f\u0690\5\u0092J\2\u0690\u069a\3\2\2\2\u0691\u0692"+
		"\5\u0126\u0094\2\u0692\u0693\5\u0128\u0095\2\u0693\u0694\5\u009aN\2\u0694"+
		"\u069a\3\2\2\2\u0695\u0696\5\u0126\u0094\2\u0696\u0697\5\u0128\u0095\2"+
		"\u0697\u0698\5z>\2\u0698\u069a\3\2\2\2\u0699\u068d\3\2\2\2\u0699\u0691"+
		"\3\2\2\2\u0699\u0695\3\2\2\2\u069a\u0125\3\2\2\2\u069b\u069d\5\u0162\u00b2"+
		"\2\u069c\u069b\3\2\2\2\u069c\u069d\3\2\2\2\u069d\u069f\3\2\2\2\u069e\u06a0"+
		"\5p9\2\u069f\u069e\3\2\2\2\u069f\u06a0\3\2\2\2\u06a0\u06a1\3\2\2\2\u06a1"+
		"\u06a2\7\\\2\2\u06a2\u06a3\5\u00ba^\2\u06a3\u0127\3\2\2\2\u06a4\u06a6"+
		"\7R\2\2\u06a5\u06a7\5\u0162\u00b2\2\u06a6\u06a5\3\2\2\2\u06a6\u06a7\3"+
		"\2\2\2\u06a7\u06a8\3\2\2\2\u06a8\u06a9\5\u01d2\u00ea\2\u06a9\u0129\3\2"+
		"\2\2\u06aa\u06ae\5\u012c\u0097\2\u06ab\u06ae\5\u012e\u0098\2\u06ac\u06ae"+
		"\5\u0130\u0099\2\u06ad\u06aa\3\2\2\2\u06ad\u06ab\3\2\2\2\u06ad\u06ac\3"+
		"\2\2\2\u06ae\u012b\3\2\2\2\u06af\u06b0\7\66\2\2\u06b0\u06b1\7]\2\2\u06b1"+
		"\u06b2\5\u01ca\u00e6\2\u06b2\u012d\3\2\2\2\u06b3\u06b4\7\65\2\2\u06b4"+
		"\u06b5\7]\2\2\u06b5\u06b6\5\u01ca\u00e6\2\u06b6\u012f\3\2\2\2\u06b7\u06b8"+
		"\7\61\2\2\u06b8\u06b9\7]\2\2\u06b9\u06bb\5\u01ca\u00e6\2\u06ba\u06bc\5"+
		"\u0132\u009a\2\u06bb\u06ba\3\2\2\2\u06bb\u06bc\3\2\2\2\u06bc\u0131\3\2"+
		"\2\2\u06bd\u06be\7\4\2\2\u06be\u06bf\5\u0142\u00a2\2\u06bf\u0133\3\2\2"+
		"\2\u06c0\u06c1\7^\2\2\u06c1\u06c2\5\u0142\u00a2\2\u06c2\u06c4\7\16\2\2"+
		"\u06c3\u06c5\5\u0136\u009c\2\u06c4\u06c3\3\2\2\2\u06c4\u06c5\3\2\2\2\u06c5"+
		"\u06c6\3\2\2\2\u06c6\u06c7\7\17\2\2\u06c7\u0135\3\2\2\2\u06c8\u06ca\5"+
		"\u0138\u009d\2\u06c9\u06c8\3\2\2\2\u06ca\u06cb\3\2\2\2\u06cb\u06c9\3\2"+
		"\2\2\u06cb\u06cc\3\2\2\2\u06cc\u0137\3\2\2\2\u06cd\u06d1\5\u013a\u009e"+
		"\2\u06ce\u06d1\5\u013c\u009f\2\u06cf\u06d1\5\u013e\u00a0\2\u06d0\u06cd"+
		"\3\2\2\2\u06d0\u06ce\3\2\2\2\u06d0\u06cf\3\2\2\2\u06d1\u0139\3\2\2\2\u06d2"+
		"\u06d3\t\t\2\2\u06d3\u06d4\7\4\2\2\u06d4\u06d5\5\u0140\u00a1\2\u06d5\u013b"+
		"\3\2\2\2\u06d6\u06d7\7a\2\2\u06d7\u06d8\7\4\2\2\u06d8\u06d9\5\u0228\u0115"+
		"\2\u06d9\u013d\3\2\2\2\u06da\u06db\7b\2\2\u06db\u06dc\7\4\2\2\u06dc\u06dd"+
		"\t\n\2\2\u06dd\u013f\3\2\2\2\u06de\u06e3\5\u0142\u00a2\2\u06df\u06e0\7"+
		"\20\2\2\u06e0\u06e2\5\u0142\u00a2\2\u06e1\u06df\3\2\2\2\u06e2\u06e5\3"+
		"\2\2\2\u06e3\u06e1\3\2\2\2\u06e3\u06e4\3\2\2\2\u06e4\u0141\3\2\2\2\u06e5"+
		"\u06e3\3\2\2\2\u06e6\u06e7\5\u021e\u0110\2\u06e7\u0143\3\2\2\2\u06e8\u06e9"+
		"\b\u00a3\1\2\u06e9\u06eb\5\u0146\u00a4\2\u06ea\u06ec\5\u01e6\u00f4\2\u06eb"+
		"\u06ea\3\2\2\2\u06eb\u06ec\3\2\2\2\u06ec\u06fe\3\2\2\2\u06ed\u06ef\5\u0146"+
		"\u00a4\2\u06ee\u06ed\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef\u06f0\3\2\2\2\u06f0"+
		"\u06f2\5\u0148\u00a5\2\u06f1\u06f3\5\u01e6\u00f4\2\u06f2\u06f1\3\2\2\2"+
		"\u06f2\u06f3\3\2\2\2\u06f3\u06fe\3\2\2\2\u06f4\u06fe\5\u014a\u00a6\2\u06f5"+
		"\u06f7\5\u014c\u00a7\2\u06f6\u06f8\5\u01e6\u00f4\2\u06f7\u06f6\3\2\2\2"+
		"\u06f7\u06f8\3\2\2\2\u06f8\u06fe\3\2\2\2\u06f9\u06fe\5\u0152\u00aa\2\u06fa"+
		"\u06fb\7f\2\2\u06fb\u06fe\5\u01d2\u00ea\2\u06fc\u06fe\5\u015a\u00ae\2"+
		"\u06fd\u06e8\3\2\2\2\u06fd\u06ee\3\2\2\2\u06fd\u06f4\3\2\2\2\u06fd\u06f5"+
		"\3\2\2\2\u06fd\u06f9\3\2\2\2\u06fd\u06fa\3\2\2\2\u06fd\u06fc\3\2\2\2\u06fe"+
		"\u0704\3\2\2\2\u06ff\u0700\f\4\2\2\u0700\u0701\7g\2\2\u0701\u0703\5\u01d2"+
		"\u00ea\2\u0702\u06ff\3\2\2\2\u0703\u0706\3\2\2\2\u0704\u0702\3\2\2\2\u0704"+
		"\u0705\3\2\2\2\u0705\u0145\3\2\2\2\u0706\u0704\3\2\2\2\u0707\u0708\7T"+
		"\2\2\u0708\u0147\3\2\2\2\u0709\u070a\5\u021e\u0110\2\u070a\u0149\3\2\2"+
		"\2\u070b\u070c\7\33\2\2\u070c\u0710\5\u0144\u00a3\2\u070d\u070e\7\32\2"+
		"\2\u070e\u0710\5\u0144\u00a3\2\u070f\u070b\3\2\2\2\u070f\u070d\3\2\2\2"+
		"\u0710\u014b\3\2\2\2\u0711\u0713\7\36\2\2\u0712\u0714\5\u014e\u00a8\2"+
		"\u0713\u0712\3\2\2\2\u0713\u0714\3\2\2\2\u0714\u0715\3\2\2\2\u0715\u0716"+
		"\7\37\2\2\u0716\u014d\3\2\2\2\u0717\u071c\5\u0150\u00a9\2\u0718\u0719"+
		"\7\20\2\2\u0719\u071b\5\u0150\u00a9\2\u071a\u0718\3\2\2\2\u071b\u071e"+
		"\3\2\2\2\u071c\u071a\3\2\2\2\u071c\u071d\3\2\2\2\u071d\u014f\3\2\2\2\u071e"+
		"\u071c\3\2\2\2\u071f\u0725\5\u0144\u00a3\2\u0720\u0721\5\u021e\u0110\2"+
		"\u0721\u0722\7\4\2\2\u0722\u0723\5\u0144\u00a3\2\u0723\u0725\3\2\2\2\u0724"+
		"\u071f\3\2\2\2\u0724\u0720\3\2\2\2\u0725\u0151\3\2\2\2\u0726\u0728\5\u01e8"+
		"\u00f5\2\u0727\u0726\3\2\2\2\u0727\u0728\3\2\2\2\u0728\u072a\3\2\2\2\u0729"+
		"\u072b\7K\2\2\u072a\u0729\3\2\2\2\u072a\u072b\3\2\2\2\u072b\u072c\3\2"+
		"\2\2\u072c\u072e\5\u00d8m\2\u072d\u072f\5\u014c\u00a7\2\u072e\u072d\3"+
		"\2\2\2\u072e\u072f\3\2\2\2\u072f\u0153\3\2\2\2\u0730\u0733\5\u0156\u00ac"+
		"\2\u0731\u0733\5\u0158\u00ad\2\u0732\u0730\3\2\2\2\u0732\u0731\3\2\2\2"+
		"\u0733\u0155\3\2\2\2\u0734\u0735\7f\2\2\u0735\u0736\5\u01d2\u00ea\2\u0736"+
		"\u0157\3\2\2\2\u0737\u0738\5\u0144\u00a3\2\u0738\u0739\7g\2\2\u0739\u073a"+
		"\5\u01d2\u00ea\2\u073a\u0159\3\2\2\2\u073b\u073c\5\u0168\u00b5\2\u073c"+
		"\u015b\3\2\2\2\u073d\u073e\7h\2\2\u073e\u0740\5\u015e\u00b0\2\u073f\u0741"+
		"\5\u0160\u00b1\2\u0740\u073f\3\2\2\2\u0740\u0741\3\2\2\2\u0741\u015d\3"+
		"\2\2\2\u0742\u0743\5\u021e\u0110\2\u0743\u015f\3\2\2\2\u0744\u0746\7\36"+
		"\2\2\u0745\u0747\5\u0164\u00b3\2\u0746\u0745\3\2\2\2\u0746\u0747\3\2\2"+
		"\2\u0747\u0748\3\2\2\2\u0748\u0749\7\37\2\2\u0749\u0161\3\2\2\2\u074a"+
		"\u074c\5\u015c\u00af\2\u074b\u074a\3\2\2\2\u074c\u074d\3\2\2\2\u074d\u074b"+
		"\3\2\2\2\u074d\u074e\3\2\2\2\u074e\u0163\3\2\2\2\u074f\u0751\5\u0166\u00b4"+
		"\2\u0750\u074f\3\2\2\2\u0751\u0752\3\2\2\2\u0752\u0750\3\2\2\2\u0752\u0753"+
		"\3\2\2\2\u0753\u0165\3\2\2\2\u0754\u0756\7\36\2\2\u0755\u0757\5\u0164"+
		"\u00b3\2\u0756\u0755\3\2\2\2\u0756\u0757\3\2\2\2\u0757\u0758\3\2\2\2\u0758"+
		"\u0776\7\37\2\2\u0759\u075b\7i\2\2\u075a\u075c\5\u0164\u00b3\2\u075b\u075a"+
		"\3\2\2\2\u075b\u075c\3\2\2\2\u075c\u075d\3\2\2\2\u075d\u0776\7j\2\2\u075e"+
		"\u0760\7\16\2\2\u075f\u0761\5\u0164\u00b3\2\u0760\u075f\3\2\2\2\u0760"+
		"\u0761\3\2\2\2\u0761\u0762\3\2\2\2\u0762\u0776\7\17\2\2\u0763\u0776\5"+
		"\u021e\u0110\2\u0764\u0776\5\u0168\u00b5\2\u0765\u0776\5\u0222\u0112\2"+
		"\u0766\u0776\5\u022a\u0116\2\u0767\u0776\5\u01ca\u00e6\2\u0768\u0776\7"+
		"\u00ae\2\2\u0769\u0776\5P)\2\u076a\u0776\7\4\2\2\u076b\u0776\7\3\2\2\u076c"+
		"\u0776\7\20\2\2\u076d\u0776\7Y\2\2\u076e\u0776\7*\2\2\u076f\u0776\7+\2"+
		"\2\u0770\u0776\7k\2\2\u0771\u0776\7l\2\2\u0772\u0776\7m\2\2\u0773\u0776"+
		"\7S\2\2\u0774\u0776\7n\2\2\u0775\u0754\3\2\2\2\u0775\u0759\3\2\2\2\u0775"+
		"\u075e\3\2\2\2\u0775\u0763\3\2\2\2\u0775\u0764\3\2\2\2\u0775\u0765\3\2"+
		"\2\2\u0775\u0766\3\2\2\2\u0775\u0767\3\2\2\2\u0775\u0768\3\2\2\2\u0775"+
		"\u0769\3\2\2\2\u0775\u076a\3\2\2\2\u0775\u076b\3\2\2\2\u0775\u076c\3\2"+
		"\2\2\u0775\u076d\3\2\2\2\u0775\u076e\3\2\2\2\u0775\u076f\3\2\2\2\u0775"+
		"\u0770\3\2\2\2\u0775\u0771\3\2\2\2\u0775\u0772\3\2\2\2\u0775\u0773\3\2"+
		"\2\2\u0775\u0774\3\2\2\2\u0776\u0167\3\2\2\2\u0777\u0779\5\u016e\u00b8"+
		"\2\u0778\u0777\3\2\2\2\u0778\u0779\3\2\2\2\u0779\u077a\3\2\2\2\u077a\u077e"+
		"\5\u016a\u00b6\2\u077b\u077d\5\u0170\u00b9\2\u077c\u077b\3\2\2\2\u077d"+
		"\u0780\3\2\2\2\u077e\u077c\3\2\2\2\u077e\u077f\3\2\2\2\u077f\u0169\3\2"+
		"\2\2\u0780\u077e\3\2\2\2\u0781\u0783\5\u01ce\u00e8\2\u0782\u0781\3\2\2"+
		"\2\u0782\u0783\3\2\2\2\u0783\u0784\3\2\2\2\u0784\u0786\5\u01b8\u00dd\2"+
		"\u0785\u0787\7\3\2\2\u0786\u0785\3\2\2\2\u0786\u0787\3\2\2\2\u0787\u078a"+
		"\3\2\2\2\u0788\u078a\5\u016c\u00b7\2\u0789\u0782\3\2\2\2\u0789\u0788\3"+
		"\2\2\2\u078a\u016b\3\2\2\2\u078b\u078c\7o\2\2\u078c\u078d\5\u021e\u0110"+
		"\2\u078d\u016d\3\2\2\2\u078e\u0790\7p\2\2\u078f\u0791\t\b\2\2\u0790\u078f"+
		"\3\2\2\2\u0790\u0791\3\2\2\2\u0791\u016f\3\2\2\2\u0792\u0793\5\u01cc\u00e7"+
		"\2\u0793\u0794\5\u016a\u00b6\2\u0794\u07a3\3\2\2\2\u0795\u0797\5\u0172"+
		"\u00ba\2\u0796\u0798\5\u016e\u00b8\2\u0797\u0796\3\2\2\2\u0797\u0798\3"+
		"\2\2\2\u0798\u0799\3\2\2\2\u0799\u079a\5\u016a\u00b6\2\u079a\u07a3\3\2"+
		"\2\2\u079b\u079d\5\u0174\u00bb\2\u079c\u079e\5\u016e\u00b8\2\u079d\u079c"+
		"\3\2\2\2\u079d\u079e\3\2\2\2\u079e\u079f\3\2\2\2\u079f\u07a0\5\u016a\u00b6"+
		"\2\u07a0\u07a3\3\2\2\2\u07a1\u07a3\5\u0176\u00bc\2\u07a2\u0792\3\2\2\2"+
		"\u07a2\u0795\3\2\2\2\u07a2\u079b\3\2\2\2\u07a2\u07a1\3\2\2\2\u07a3\u0171"+
		"\3\2\2\2\u07a4\u07a5\7L\2\2\u07a5\u0173\3\2\2\2\u07a6\u07a8\7X\2\2\u07a7"+
		"\u07a9\5\u016e\u00b8\2\u07a8\u07a7\3\2\2\2\u07a8\u07a9\3\2\2\2\u07a9\u07aa"+
		"\3\2\2\2\u07aa\u07ab\5\u0168\u00b5\2\u07ab\u07ac\7\4\2\2\u07ac\u0175\3"+
		"\2\2\2\u07ad\u07ae\7f\2\2\u07ae\u07b8\5\u01d2\u00ea\2\u07af\u07b0\7g\2"+
		"\2\u07b0\u07b1\7X\2\2\u07b1\u07b8\5\u01d2\u00ea\2\u07b2\u07b3\7g\2\2\u07b3"+
		"\u07b8\5\u01d2\u00ea\2\u07b4\u07b5\7g\2\2\u07b5\u07b6\7Y\2\2\u07b6\u07b8"+
		"\5\u01d2\u00ea\2\u07b7\u07ad\3\2\2\2\u07b7\u07af\3\2\2\2\u07b7\u07b2\3"+
		"\2\2\2\u07b7\u07b4\3\2\2\2\u07b8\u0177\3\2\2\2\u07b9\u07be\5\u021e\u0110"+
		"\2\u07ba\u07be\5\u01ca\u00e6\2\u07bb\u07be\5\u0220\u0111\2\u07bc\u07be"+
		"\5\u0222\u0112\2\u07bd\u07b9\3\2\2\2\u07bd\u07ba\3\2\2\2\u07bd\u07bb\3"+
		"\2\2\2\u07bd\u07bc\3\2\2\2\u07be\u07c0\3\2\2\2\u07bf\u07c1\5f\64\2\u07c0"+
		"\u07bf\3\2\2\2\u07c0\u07c1\3\2\2\2\u07c1\u07cd\3\2\2\2\u07c2\u07cd\5\u017a"+
		"\u00be\2\u07c3\u07cd\5\u018a\u00c6\2\u07c4\u07cd\5\u018c\u00c7\2\u07c5"+
		"\u07cd\5\u0194\u00cb\2\u07c6\u07cd\5\u01aa\u00d6\2\u07c7\u07cd\5\u01ac"+
		"\u00d7\2\u07c8\u07cd\5\u01a8\u00d5\2\u07c9\u07cd\5\u01b2\u00da\2\u07ca"+
		"\u07cd\5\u01b4\u00db\2\u07cb\u07cd\5\u01b6\u00dc\2\u07cc\u07bd\3\2\2\2"+
		"\u07cc\u07c2\3\2\2\2\u07cc\u07c3\3\2\2\2\u07cc\u07c4\3\2\2\2\u07cc\u07c5"+
		"\3\2\2\2\u07cc\u07c6\3\2\2\2\u07cc\u07c7\3\2\2\2\u07cc\u07c8\3\2\2\2\u07cc"+
		"\u07c9\3\2\2\2\u07cc\u07ca\3\2\2\2\u07cc\u07cb\3\2\2\2\u07cd\u0179\3\2"+
		"\2\2\u07ce\u07d7\5\u022a\u0116\2\u07cf\u07d7\5\u017c\u00bf\2\u07d0\u07d7"+
		"\5\u0182\u00c2\2\u07d1\u07d7\5\u0188\u00c5\2\u07d2\u07d7\7q\2\2\u07d3"+
		"\u07d7\7r\2\2\u07d4\u07d7\7s\2\2\u07d5\u07d7\7t\2\2\u07d6\u07ce\3\2\2"+
		"\2\u07d6\u07cf\3\2\2\2\u07d6\u07d0\3\2\2\2\u07d6\u07d1\3\2\2\2\u07d6\u07d2"+
		"\3\2\2\2\u07d6\u07d3\3\2\2\2\u07d6\u07d4\3\2\2\2\u07d6\u07d5\3\2\2\2\u07d7"+
		"\u017b\3\2\2\2\u07d8\u07da\7i\2\2\u07d9\u07db\5\u017e\u00c0\2\u07da\u07d9"+
		"\3\2\2\2\u07da\u07db\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\u07dd\7j\2\2\u07dd"+
		"\u017d\3\2\2\2\u07de\u07e3\5\u0180\u00c1\2\u07df\u07e0\7\20\2\2\u07e0"+
		"\u07e2\5\u0180\u00c1\2\u07e1\u07df\3\2\2\2\u07e2\u07e5\3\2\2\2\u07e3\u07e1"+
		"\3\2\2\2\u07e3\u07e4\3\2\2\2\u07e4\u07e7\3\2\2\2\u07e5\u07e3\3\2\2\2\u07e6"+
		"\u07e8\7\20\2\2\u07e7\u07e6\3\2\2\2\u07e7\u07e8\3\2\2\2\u07e8\u017f\3"+
		"\2\2\2\u07e9\u07ea\5\u0168\u00b5\2\u07ea\u0181\3\2\2\2\u07eb\u07ec\7i"+
		"\2\2\u07ec\u07ed\5\u0184\u00c3\2\u07ed\u07ee\7j\2\2\u07ee\u07f3\3\2\2"+
		"\2\u07ef\u07f0\7i\2\2\u07f0\u07f1\7\4\2\2\u07f1\u07f3\7j\2\2\u07f2\u07eb"+
		"\3\2\2\2\u07f2\u07ef\3\2\2\2\u07f3\u0183\3\2\2\2\u07f4\u07f9\5\u0186\u00c4"+
		"\2\u07f5\u07f6\7\20\2\2\u07f6\u07f8\5\u0186\u00c4\2\u07f7\u07f5\3\2\2"+
		"\2\u07f8\u07fb\3\2\2\2\u07f9\u07f7\3\2\2\2\u07f9\u07fa\3\2\2\2\u07fa\u07fd"+
		"\3\2\2\2\u07fb\u07f9\3\2\2\2\u07fc\u07fe\7\20\2\2\u07fd\u07fc\3\2\2\2"+
		"\u07fd\u07fe\3\2\2\2\u07fe\u0185\3\2\2\2\u07ff\u0800\5\u0168\u00b5\2\u0800"+
		"\u0801\7\4\2\2\u0801\u0802\5\u0168\u00b5\2\u0802\u0187\3\2\2\2\u0803\u0804"+
		"\7u\2\2\u0804\u0805\7\36\2\2\u0805\u0806\7v\2\2\u0806\u0807\7\4\2\2\u0807"+
		"\u0808\5\u0168\u00b5\2\u0808\u0809\7\20\2\2\u0809\u080a\7w\2\2\u080a\u080b"+
		"\7\4\2\2\u080b\u080c\5\u0168\u00b5\2\u080c\u080d\7\20\2\2\u080d\u080e"+
		"\7x\2\2\u080e\u080f\7\4\2\2\u080f\u0810\5\u0168\u00b5\2\u0810\u0811\7"+
		"\20\2\2\u0811\u0812\7y\2\2\u0812\u0813\7\4\2\2\u0813\u0814\5\u0168\u00b5"+
		"\2\u0814\u0815\7\37\2\2\u0815\u0825\3\2\2\2\u0816\u0817\7z\2\2\u0817\u0818"+
		"\7\36\2\2\u0818\u0819\7{\2\2\u0819\u081a\7\4\2\2\u081a\u081b\5\u0168\u00b5"+
		"\2\u081b\u081c\7\37\2\2\u081c\u0825\3\2\2\2\u081d\u081e\7|\2\2\u081e\u081f"+
		"\7\36\2\2\u081f\u0820\7{\2\2\u0820\u0821\7\4\2\2\u0821\u0822\5\u0168\u00b5"+
		"\2\u0822\u0823\7\37\2\2\u0823\u0825\3\2\2\2\u0824\u0803\3\2\2\2\u0824"+
		"\u0816\3\2\2\2\u0824\u081d\3\2\2\2\u0825\u0189\3\2\2\2\u0826\u0833\7}"+
		"\2\2\u0827\u0828\7}\2\2\u0828\u0829\7K\2\2\u0829\u0833\5\u021e\u0110\2"+
		"\u082a\u082b\7}\2\2\u082b\u082c\7i\2\2\u082c\u082d\5\u01ae\u00d8\2\u082d"+
		"\u082e\7j\2\2\u082e\u0833\3\2\2\2\u082f\u0830\7}\2\2\u0830\u0831\7K\2"+
		"\2\u0831\u0833\7W\2\2\u0832\u0826\3\2\2\2\u0832\u0827\3\2\2\2\u0832\u082a"+
		"\3\2\2\2\u0832\u082f\3\2\2\2\u0833\u018b\3\2\2\2\u0834\u0838\5\u018e\u00c8"+
		"\2\u0835\u0838\5\u0190\u00c9\2\u0836\u0838\5\u0192\u00ca\2\u0837\u0834"+
		"\3\2\2\2\u0837\u0835\3\2\2\2\u0837\u0836\3\2\2\2\u0838\u018d\3\2\2\2\u0839"+
		"\u083a\7~\2\2\u083a\u083b\7K\2\2\u083b\u083c\5\u021e\u0110\2\u083c\u018f"+
		"\3\2\2\2\u083d\u083e\7~\2\2\u083e\u083f\7i\2\2\u083f\u0840\5\u01ae\u00d8"+
		"\2\u0840\u0841\7j\2\2\u0841\u0191\3\2\2\2\u0842\u0843\7~\2\2\u0843\u0844"+
		"\7K\2\2\u0844\u0845\7W\2\2\u0845\u0193\3\2\2\2\u0846\u0848\7\16\2\2\u0847"+
		"\u0849\5\u0196\u00cc\2\u0848\u0847\3\2\2\2\u0848\u0849\3\2\2\2\u0849\u084b"+
		"\3\2\2\2\u084a\u084c\5\6\4\2\u084b\u084a\3\2\2\2\u084b\u084c\3\2\2\2\u084c"+
		"\u084d\3\2\2\2\u084d\u084e\7\17\2\2\u084e\u0195\3\2\2\2\u084f\u0851\5"+
		"\u01a0\u00d1\2\u0850\u084f\3\2\2\2\u0850\u0851\3\2\2\2\u0851\u0852\3\2"+
		"\2\2\u0852\u0854\5\u0198\u00cd\2\u0853\u0855\7P\2\2\u0854\u0853\3\2\2"+
		"\2\u0854\u0855\3\2\2\2\u0855\u0857\3\2\2\2\u0856\u0858\5\u00b6\\\2\u0857"+
		"\u0856\3\2\2\2\u0857\u0858\3\2\2\2\u0858\u0859\3\2\2\2\u0859\u085a\7\7"+
		"\2\2\u085a\u085f\3\2\2\2\u085b\u085c\5\u01a0\u00d1\2\u085c\u085d\7\7\2"+
		"\2\u085d\u085f\3\2\2\2\u085e\u0850\3\2\2\2\u085e\u085b\3\2\2\2\u085f\u0197"+
		"\3\2\2\2\u0860\u0861\7\36\2\2\u0861\u0868\7\37\2\2\u0862\u0863\7\36\2"+
		"\2\u0863\u0864\5\u019a\u00ce\2\u0864\u0865\7\37\2\2\u0865\u0868\3\2\2"+
		"\2\u0866\u0868\5\u0226\u0114\2\u0867\u0860\3\2\2\2\u0867\u0862\3\2\2\2"+
		"\u0867\u0866\3\2\2\2\u0868\u0199\3\2\2\2\u0869\u086e\5\u019c\u00cf\2\u086a"+
		"\u086b\7\20\2\2\u086b\u086d\5\u019a\u00ce\2\u086c\u086a\3\2\2\2\u086d"+
		"\u0870\3\2\2\2\u086e\u086c\3\2\2\2\u086e\u086f\3\2\2\2\u086f\u019b\3\2"+
		"\2\2\u0870\u086e\3\2\2\2\u0871\u0873\5\u019e\u00d0\2\u0872\u0874\5\u01e6"+
		"\u00f4\2\u0873\u0872\3\2\2\2\u0873\u0874\3\2\2\2\u0874\u087a\3\2\2\2\u0875"+
		"\u0876\5\u019e\u00d0\2\u0876\u0877\5\u01e6\u00f4\2\u0877\u0878\7S\2\2"+
		"\u0878\u087a\3\2\2\2\u0879\u0871\3\2\2\2\u0879\u0875\3\2\2\2\u087a\u019d"+
		"\3\2\2\2\u087b\u087e\5\u021e\u0110\2\u087c\u087e\7T\2\2\u087d\u087b\3"+
		"\2\2\2\u087d\u087c\3\2\2\2\u087e\u019f\3\2\2\2\u087f\u0880\7i\2\2\u0880"+
		"\u0881\5\u01a2\u00d2\2\u0881\u0882\7j\2\2\u0882\u01a1\3\2\2\2\u0883\u0888"+
		"\5\u01a4\u00d3\2\u0884\u0885\7\20\2\2\u0885\u0887\5\u01a4\u00d3\2\u0886"+
		"\u0884\3\2\2\2\u0887\u088a\3\2\2\2\u0888\u0886\3\2\2\2\u0888\u0889\3\2"+
		"\2\2\u0889\u01a3\3\2\2\2\u088a\u0888\3\2\2\2\u088b\u088d\5\u01a6\u00d4"+
		"\2\u088c\u088b\3\2\2\2\u088c\u088d\3\2\2\2\u088d\u088e\3\2\2\2\u088e\u088f"+
		"\5\u0168\u00b5\2\u088f\u01a5\3\2\2\2\u0890\u0891\t\13\2\2\u0891\u01a7"+
		"\3\2\2\2\u0892\u0893\7K\2\2\u0893\u0894\5\u021e\u0110\2\u0894\u01a9\3"+
		"\2\2\2\u0895\u0896\7\36\2\2\u0896\u0897\5\u0168\u00b5\2\u0897\u0898\7"+
		"\37\2\2\u0898\u01ab\3\2\2\2\u0899\u089b\7\36\2\2\u089a\u089c\5\u01ae\u00d8"+
		"\2\u089b\u089a\3\2\2\2\u089b\u089c\3\2\2\2\u089c\u089d\3\2\2\2\u089d\u089e"+
		"\7\37\2\2\u089e\u01ad\3\2\2\2\u089f\u08a4\5\u01b0\u00d9\2\u08a0\u08a1"+
		"\7\20\2\2\u08a1\u08a3\5\u01b0\u00d9\2\u08a2\u08a0\3\2\2\2\u08a3\u08a6"+
		"\3\2\2\2\u08a4\u08a2\3\2\2\2\u08a4\u08a5\3\2\2\2\u08a5\u01af\3\2\2\2\u08a6"+
		"\u08a4\3\2\2\2\u08a7\u08a8\5\u021e\u0110\2\u08a8\u08a9\7\4\2\2\u08a9\u08ab"+
		"\3\2\2\2\u08aa\u08a7\3\2\2\2\u08aa\u08ab\3\2\2\2\u08ab\u08ac\3\2\2\2\u08ac"+
		"\u08ad\5\u0168\u00b5\2\u08ad\u01b1\3\2\2\2\u08ae\u08af\7T\2\2\u08af\u01b3"+
		"\3\2\2\2\u08b0\u08b1\7\u0081\2\2\u08b1\u08b2\7\36\2\2\u08b2\u08b3\5\u0168"+
		"\u00b5\2\u08b3\u08b4\7\37\2\2\u08b4\u08bc\3\2\2\2\u08b5\u08b6\7\u0081"+
		"\2\2\u08b6\u08b7\7\36\2\2\u08b7\u08b8\t\f\2\2\u08b8\u08b9\5\u0168\u00b5"+
		"\2\u08b9\u08ba\7\37\2\2\u08ba\u08bc\3\2\2\2\u08bb\u08b0\3\2\2\2\u08bb"+
		"\u08b5\3\2\2\2\u08bc\u01b5\3\2\2\2\u08bd\u08be\7\u0084\2\2\u08be\u08bf"+
		"\7\36\2\2\u08bf\u08c0\5\u0168\u00b5\2\u08c0\u08c1\7\37\2\2\u08c1\u01b7"+
		"\3\2\2\2\u08c2\u08c3\b\u00dd\1\2\u08c3\u08cc\5\u0178\u00bd\2\u08c4\u08c5"+
		"\7\u0085\2\2\u08c5\u08c6\7\36\2\2\u08c6\u08c7\7\u0086\2\2\u08c7\u08c8"+
		"\7\4\2\2\u08c8\u08c9\5\u0168\u00b5\2\u08c9\u08ca\7\37\2\2\u08ca\u08cc"+
		"\3\2\2\2\u08cb\u08c2\3\2\2\2\u08cb\u08c4\3\2\2\2\u08cc\u08fe\3\2\2\2\u08cd"+
		"\u08ce\f\17\2\2\u08ce\u08fd\5\u01d0\u00e9\2\u08cf\u08d1\f\16\2\2\u08d0"+
		"\u08d2\5\u01ba\u00de\2\u08d1\u08d0\3\2\2\2\u08d1\u08d2\3\2\2\2\u08d2\u08d3"+
		"\3\2\2\2\u08d3\u08fd\5\u0194\u00cb\2\u08d4\u08d5\f\r\2\2\u08d5\u08fd\5"+
		"\u01ba\u00de\2\u08d6\u08d7\f\f\2\2\u08d7\u08d8\7K\2\2\u08d8\u08fd\7W\2"+
		"\2\u08d9\u08da\f\13\2\2\u08da\u08db\7K\2\2\u08db\u08dc\7W\2\2\u08dc\u08dd"+
		"\7\36\2\2\u08dd\u08de\5\u01c2\u00e2\2\u08de\u08df\7\37\2\2\u08df\u08fd"+
		"\3\2\2\2\u08e0\u08e1\f\n\2\2\u08e1\u08e2\7K\2\2\u08e2\u08fd\7\u00ab\2"+
		"\2\u08e3\u08e4\f\t\2\2\u08e4\u08e5\7K\2\2\u08e5\u08e7\5\u021e\u0110\2"+
		"\u08e6\u08e8\5f\64\2\u08e7\u08e6\3\2\2\2\u08e7\u08e8\3\2\2\2\u08e8\u08fd"+
		"\3\2\2\2\u08e9\u08ea\f\b\2\2\u08ea\u08eb\7K\2\2\u08eb\u08ec\5\u021e\u0110"+
		"\2\u08ec\u08ed\7\36\2\2\u08ed\u08ee\5\u01c2\u00e2\2\u08ee\u08ef\7\37\2"+
		"\2\u08ef\u08fd\3\2\2\2\u08f0\u08f1\f\7\2\2\u08f1\u08f2\7K\2\2\u08f2\u08fd"+
		"\7}\2\2\u08f3\u08f4\f\5\2\2\u08f4\u08f5\7i\2\2\u08f5\u08f6\5\u01ae\u00d8"+
		"\2\u08f6\u08f7\7j\2\2\u08f7\u08fd\3\2\2\2\u08f8\u08f9\f\4\2\2\u08f9\u08fd"+
		"\7Y\2\2\u08fa\u08fb\f\3\2\2\u08fb\u08fd\7X\2\2\u08fc\u08cd\3\2\2\2\u08fc"+
		"\u08cf\3\2\2\2\u08fc\u08d4\3\2\2\2\u08fc\u08d6\3\2\2\2\u08fc\u08d9\3\2"+
		"\2\2\u08fc\u08e0\3\2\2\2\u08fc\u08e3\3\2\2\2\u08fc\u08e9\3\2\2\2\u08fc"+
		"\u08f0\3\2\2\2\u08fc\u08f3\3\2\2\2\u08fc\u08f8\3\2\2\2\u08fc\u08fa\3\2"+
		"\2\2\u08fd\u0900\3\2\2\2\u08fe\u08fc\3\2\2\2\u08fe\u08ff\3\2\2\2\u08ff"+
		"\u01b9\3\2\2\2\u0900\u08fe\3\2\2\2\u0901\u0903\7\36\2\2\u0902\u0904\5"+
		"\u01bc\u00df\2\u0903\u0902\3\2\2\2\u0903\u0904\3\2\2\2\u0904\u0905\3\2"+
		"\2\2\u0905\u0906\7\37\2\2\u0906\u01bb\3\2\2\2\u0907\u090c\5\u01be\u00e0"+
		"\2\u0908\u0909\7\20\2\2\u0909\u090b\5\u01be\u00e0\2\u090a\u0908\3\2\2"+
		"\2\u090b\u090e\3\2\2\2\u090c\u090a\3\2\2\2\u090c\u090d\3\2\2\2\u090d\u01bd"+
		"\3\2\2\2\u090e\u090c\3\2\2\2\u090f\u0910\5\u01c0\u00e1\2\u0910\u0911\7"+
		"\4\2\2\u0911\u0914\3\2\2\2\u0912\u0915\5\u0168\u00b5\2\u0913\u0915\5\u01ca"+
		"\u00e6\2\u0914\u0912\3\2\2\2\u0914\u0913\3\2\2\2\u0914\u0915\3\2\2\2\u0915"+
		"\u0920\3\2\2\2\u0916\u0917\5\u01c0\u00e1\2\u0917\u0918\7\4\2\2\u0918\u091a"+
		"\3\2\2\2\u0919\u0916\3\2\2\2\u0919\u091a\3\2\2\2\u091a\u091d\3\2\2\2\u091b"+
		"\u091e\5\u0168\u00b5\2\u091c\u091e\5\u01ca\u00e6\2\u091d\u091b\3\2\2\2"+
		"\u091d\u091c\3\2\2\2\u091e\u0920\3\2\2\2\u091f\u090f\3\2\2\2\u091f\u0919"+
		"\3\2\2\2\u0920\u01bf\3\2\2\2\u0921\u0924\5\u021e\u0110\2\u0922\u0924\5"+
		"\u0220\u0111\2\u0923\u0921\3\2\2\2\u0923\u0922\3\2\2\2\u0924\u01c1\3\2"+
		"\2\2\u0925\u0927\5\u01c4\u00e3\2\u0926\u0925\3\2\2\2\u0927\u0928\3\2\2"+
		"\2\u0928\u0926\3\2\2\2\u0928\u0929\3\2\2\2\u0929\u01c3\3\2\2\2\u092a\u092d"+
		"\5\u021e\u0110\2\u092b\u092d\7T\2\2\u092c\u092a\3\2\2\2\u092c\u092b\3"+
		"\2\2\2\u092d\u092e\3\2\2\2\u092e\u092f\7\4\2\2\u092f\u01c5\3\2\2\2\u0930"+
		"\u0931\t\r\2\2\u0931\u01c7\3\2\2\2\u0932\u0935\5\u01c6\u00e4\2\u0933\u0935"+
		"\7\u00a5\2\2\u0934\u0932\3\2\2\2\u0934\u0933\3\2\2\2\u0935\u01c9\3\2\2"+
		"\2\u0936\u093a\5\u01c6\u00e4\2\u0937\u0939\5\u01c8\u00e5\2\u0938\u0937"+
		"\3\2\2\2\u0939\u093c\3\2\2\2\u093a\u0938\3\2\2\2\u093a\u093b\3\2\2\2\u093b"+
		"\u0946\3\2\2\2\u093c\u093a\3\2\2\2\u093d\u0941\7\u00a6\2\2\u093e\u0940"+
		"\5\u01c8\u00e5\2\u093f\u093e\3\2\2\2\u0940\u0943\3\2\2\2\u0941\u093f\3"+
		"\2\2\2\u0941\u0942\3\2\2\2\u0942\u0946\3\2\2\2\u0943\u0941\3\2\2\2\u0944"+
		"\u0946\7S\2\2\u0945\u0936\3\2\2\2\u0945\u093d\3\2\2\2\u0945\u0944\3\2"+
		"\2\2\u0946\u01cb\3\2\2\2\u0947\u0948\5\u01ca\u00e6\2\u0948\u01cd\3\2\2"+
		"\2\u0949\u094a\5\u01ca\u00e6\2\u094a\u01cf\3\2\2\2\u094b\u094c\5\u01ca"+
		"\u00e6\2\u094c\u01d1\3\2\2\2\u094d\u094e\b\u00ea\1\2\u094e\u0957\5\u01de"+
		"\u00f0\2\u094f\u0957\5\u01e0\u00f1\2\u0950\u0957\5\u01d4\u00eb\2\u0951"+
		"\u0957\5\u01e8\u00f5\2\u0952\u0957\5\u01ec\u00f7\2\u0953\u0957\5\u01f4"+
		"\u00fb\2\u0954\u0957\7\u008c\2\2\u0955\u0957\7\u008d\2\2\u0956\u094d\3"+
		"\2\2\2\u0956\u094f\3\2\2\2\u0956\u0950\3\2\2\2\u0956\u0951\3\2\2\2\u0956"+
		"\u0952\3\2\2\2\u0956\u0953\3\2\2\2\u0956\u0954\3\2\2\2\u0956\u0955\3\2"+
		"\2\2\u0957\u0964\3\2\2\2\u0958\u0959\f\t\2\2\u0959\u0963\7X\2\2\u095a"+
		"\u095b\f\b\2\2\u095b\u0963\7Y\2\2\u095c\u095d\f\6\2\2\u095d\u095e\7K\2"+
		"\2\u095e\u0963\7\u008a\2\2\u095f\u0960\f\5\2\2\u0960\u0961\7K\2\2\u0961"+
		"\u0963\7\u008b\2\2\u0962\u0958\3\2\2\2\u0962\u095a\3\2\2\2\u0962\u095c"+
		"\3\2\2\2\u0962\u095f\3\2\2\2\u0963\u0966\3\2\2\2\u0964\u0962\3\2\2\2\u0964"+
		"\u0965\3\2\2\2\u0965\u01d3\3\2\2\2\u0966\u0964\3\2\2\2\u0967\u0969\5\u0162"+
		"\u00b2\2\u0968\u0967\3\2\2\2\u0968\u0969\3\2\2\2\u0969\u096a\3\2\2\2\u096a"+
		"\u096c\5\u01d6\u00ec\2\u096b\u096d\t\7\2\2\u096c\u096b\3\2\2\2\u096c\u096d"+
		"\3\2\2\2\u096d\u096e\3\2\2\2\u096e\u096f\7R\2\2\u096f\u0970\5\u01d2\u00ea"+
		"\2\u0970\u01d5\3\2\2\2\u0971\u0972\7\36\2\2\u0972\u097b\7\37\2\2\u0973"+
		"\u0974\7\36\2\2\u0974\u0976\5\u01d8\u00ed\2\u0975\u0977\7S\2\2\u0976\u0975"+
		"\3\2\2\2\u0976\u0977\3\2\2\2\u0977\u0978\3\2\2\2\u0978\u0979\7\37\2\2"+
		"\u0979\u097b\3\2\2\2\u097a\u0971\3\2\2\2\u097a\u0973\3\2\2\2\u097b\u01d7"+
		"\3\2\2\2\u097c\u0981\5\u01da\u00ee\2\u097d\u097e\7\20\2\2\u097e\u0980"+
		"\5\u01da\u00ee\2\u097f\u097d\3\2\2\2\u0980\u0983\3\2\2\2\u0981\u097f\3"+
		"\2\2\2\u0981\u0982\3\2\2\2\u0982\u01d9\3\2\2\2\u0983\u0981\3\2\2\2\u0984"+
		"\u0986\5\u0162\u00b2\2\u0985\u0984\3\2\2\2\u0985\u0986\3\2\2\2\u0986\u0988"+
		"\3\2\2\2\u0987\u0989\7\u008e\2\2\u0988\u0987\3\2\2";
	private static final String _serializedATNSegment1 =
		"\2\u0988\u0989\3\2\2\2\u0989\u098a\3\2\2\2\u098a\u098f\5\u01d2\u00ea\2"+
		"\u098b\u098c\5\u01dc\u00ef\2\u098c\u098d\5\u01e6\u00f4\2\u098d\u098f\3"+
		"\2\2\2\u098e\u0985\3\2\2\2\u098e\u098b\3\2\2\2\u098f\u01db\3\2\2\2\u0990"+
		"\u0992\5\u0146\u00a4\2\u0991\u0990\3\2\2\2\u0991\u0992\3\2\2\2\u0992\u0993"+
		"\3\2\2\2\u0993\u0994\5\u021e\u0110\2\u0994\u01dd\3\2\2\2\u0995\u0996\7"+
		"i\2\2\u0996\u0997\5\u01d2\u00ea\2\u0997\u0998\7j\2\2\u0998\u01df\3\2\2"+
		"\2\u0999\u099a\7i\2\2\u099a\u099b\5\u01d2\u00ea\2\u099b\u099c\7\4\2\2"+
		"\u099c\u099d\5\u01d2\u00ea\2\u099d\u099e\7j\2\2\u099e\u01e1\3\2\2\2\u099f"+
		"\u09a0\5\u01d2\u00ea\2\u09a0\u09a1\7X\2\2\u09a1\u01e3\3\2\2\2\u09a2\u09a3"+
		"\5\u01d2\u00ea\2\u09a3\u09a4\7Y\2\2\u09a4\u01e5\3\2\2\2\u09a5\u09a7\7"+
		"\4\2\2\u09a6\u09a8\5\u0162\u00b2\2\u09a7\u09a6\3\2\2\2\u09a7\u09a8\3\2"+
		"\2\2\u09a8\u09aa\3\2\2\2\u09a9\u09ab\7\u008e\2\2\u09aa\u09a9\3\2\2\2\u09aa"+
		"\u09ab\3\2\2\2\u09ab\u09ac\3\2\2\2\u09ac\u09ad\5\u01d2\u00ea\2\u09ad\u01e7"+
		"\3\2\2\2\u09ae\u09b0\5\u01ea\u00f6\2\u09af\u09b1\5f\64\2\u09b0\u09af\3"+
		"\2\2\2\u09b0\u09b1\3\2\2\2\u09b1\u09ba\3\2\2\2\u09b2\u09b4\5\u01ea\u00f6"+
		"\2\u09b3\u09b5\5f\64\2\u09b4\u09b3\3\2\2\2\u09b4\u09b5\3\2\2\2\u09b5\u09b6"+
		"\3\2\2\2\u09b6\u09b7\7K\2\2\u09b7\u09b8\5\u01e8\u00f5\2\u09b8\u09ba\3"+
		"\2\2\2\u09b9\u09ae\3\2\2\2\u09b9\u09b2\3\2\2\2\u09ba\u01e9\3\2\2\2\u09bb"+
		"\u09bd\5\u0146\u00a4\2\u09bc\u09bb\3\2\2\2\u09bc\u09bd\3\2\2\2\u09bd\u09be"+
		"\3\2\2\2\u09be\u09bf\5\u021e\u0110\2\u09bf\u01eb\3\2\2\2\u09c0\u09c2\7"+
		"\36\2\2\u09c1\u09c3\5\u01ee\u00f8\2\u09c2\u09c1\3\2\2\2\u09c2\u09c3\3"+
		"\2\2\2\u09c3\u09c4\3\2\2\2\u09c4\u09c5\7\37\2\2\u09c5\u01ed\3\2\2\2\u09c6"+
		"\u09cb\5\u01f0\u00f9\2\u09c7\u09c8\7\20\2\2\u09c8\u09ca\5\u01f0\u00f9"+
		"\2\u09c9\u09c7\3\2\2\2\u09ca\u09cd\3\2\2\2\u09cb\u09c9\3\2\2\2\u09cb\u09cc"+
		"\3\2\2\2\u09cc\u01ef\3\2\2\2\u09cd\u09cb\3\2\2\2\u09ce\u09cf\5\u01f2\u00fa"+
		"\2\u09cf\u09d0\5\u01e6\u00f4\2\u09d0\u09d3\3\2\2\2\u09d1\u09d3\5\u01d2"+
		"\u00ea\2\u09d2\u09ce\3\2\2\2\u09d2\u09d1\3\2\2\2\u09d3\u01f1\3\2\2\2\u09d4"+
		"\u09d5\5\u021e\u0110\2\u09d5\u01f3\3\2\2\2\u09d6\u09d7\5\u01f8\u00fd\2"+
		"\u09d7\u09d8\7o\2\2\u09d8\u09d9\5\u01f6\u00fc\2\u09d9\u01f5\3\2\2\2\u09da"+
		"\u09dd\5\u01f8\u00fd\2\u09db\u09dd\5\u01f4\u00fb\2\u09dc\u09da\3\2\2\2"+
		"\u09dc\u09db\3\2\2\2\u09dd\u01f7\3\2\2\2\u09de\u09df\5\u01e8\u00f5\2\u09df"+
		"\u01f9\3\2\2\2\u09e0\u09e1\5\u01d2\u00ea\2\u09e1\u09e2\7K\2\2\u09e2\u09e3"+
		"\7\u008a\2\2\u09e3\u09e9\3\2\2\2\u09e4\u09e5\5\u01d2\u00ea\2\u09e5\u09e6"+
		"\7K\2\2\u09e6\u09e7\7\u008b\2\2\u09e7\u09e9\3\2\2\2\u09e8\u09e0\3\2\2"+
		"\2\u09e8\u09e4\3\2\2\2\u09e9\u01fb\3\2\2\2\u09ea\u09eb\7\4\2\2\u09eb\u09ec"+
		"\5\u0200\u0101\2\u09ec\u09ed\7\20\2\2\u09ed\u09ee\5\u01fe\u0100\2\u09ee"+
		"\u09f4\3\2\2\2\u09ef\u09f0\7\4\2\2\u09f0\u09f4\5\u0200\u0101\2\u09f1\u09f2"+
		"\7\4\2\2\u09f2\u09f4\5\u01fe\u0100\2\u09f3\u09ea\3\2\2\2\u09f3\u09ef\3"+
		"\2\2\2\u09f3\u09f1\3\2\2\2\u09f4\u01fd\3\2\2\2\u09f5\u09fa\5\u01e8\u00f5"+
		"\2\u09f6\u09f7\7\20\2\2\u09f7\u09f9\5\u01e8\u00f5\2\u09f8\u09f6\3\2\2"+
		"\2\u09f9\u09fc\3\2\2\2\u09fa\u09f8\3\2\2\2\u09fa\u09fb\3\2\2\2\u09fb\u01ff"+
		"\3\2\2\2\u09fc\u09fa\3\2\2\2\u09fd\u09fe\7-\2\2\u09fe\u0201\3\2\2\2\u09ff"+
		"\u0a02\5\u0204\u0103\2\u0a00\u0a02\5\u0218\u010d\2\u0a01\u09ff\3\2\2\2"+
		"\u0a01\u0a00\3\2\2\2\u0a02\u0203\3\2\2\2\u0a03\u0a05\5\u0206\u0104\2\u0a04"+
		"\u0a06\5\u0208\u0105\2\u0a05\u0a04\3\2\2\2\u0a05\u0a06\3\2\2\2\u0a06\u0a08"+
		"\3\2\2\2\u0a07\u0a09\5\u020c\u0107\2\u0a08\u0a07\3\2\2\2\u0a08\u0a09\3"+
		"\2\2\2\u0a09\u0a0a\3\2\2\2\u0a0a\u0a0b\7\u008f\2\2\u0a0b\u0205\3\2\2\2"+
		"\u0a0c\u0a0d\7\u0090\2\2\u0a0d\u0a0f\5\u020e\u0108\2\u0a0e\u0a10\5\6\4"+
		"\2\u0a0f\u0a0e\3\2\2\2\u0a0f\u0a10\3\2\2\2\u0a10\u0207\3\2\2\2\u0a11\u0a13"+
		"\5\u020a\u0106\2\u0a12\u0a11\3\2\2\2\u0a13\u0a14\3\2\2\2\u0a14\u0a12\3"+
		"\2\2\2\u0a14\u0a15\3\2\2\2\u0a15\u0209\3\2\2\2\u0a16\u0a17\7\u0091\2\2"+
		"\u0a17\u0a19\5\u020e\u0108\2\u0a18\u0a1a\5\6\4\2\u0a19\u0a18\3\2\2\2\u0a19"+
		"\u0a1a\3\2\2\2\u0a1a\u020b\3\2\2\2\u0a1b\u0a1d\7\u0092\2\2\u0a1c\u0a1e"+
		"\5\6\4\2\u0a1d\u0a1c\3\2\2\2\u0a1d\u0a1e\3\2\2\2\u0a1e\u020d\3\2\2\2\u0a1f"+
		"\u0a20\b\u0108\1\2\u0a20\u0a2a\5\u0210\u0109\2\u0a21\u0a2a\5\u021e\u0110"+
		"\2\u0a22\u0a2a\5\u0228\u0115\2\u0a23\u0a24\7\36\2\2\u0a24\u0a25\5\u020e"+
		"\u0108\2\u0a25\u0a26\7\37\2\2\u0a26\u0a2a\3\2\2\2\u0a27\u0a28\7Y\2\2\u0a28"+
		"\u0a2a\5\u020e\u0108\4\u0a29\u0a1f\3\2\2\2\u0a29\u0a21\3\2\2\2\u0a29\u0a22"+
		"\3\2\2\2\u0a29\u0a23\3\2\2\2\u0a29\u0a27\3\2\2\2\u0a2a\u0a30\3\2\2\2\u0a2b"+
		"\u0a2c\f\3\2\2\u0a2c\u0a2d\t\16\2\2\u0a2d\u0a2f\5\u020e\u0108\4\u0a2e"+
		"\u0a2b\3\2\2\2\u0a2f\u0a32\3\2\2\2\u0a30\u0a2e\3\2\2\2\u0a30\u0a31\3\2"+
		"\2\2\u0a31\u020f\3\2\2\2\u0a32\u0a30\3\2\2\2\u0a33\u0a34\7\u0093\2\2\u0a34"+
		"\u0a35\7\36\2\2\u0a35\u0a36\5\u0212\u010a\2\u0a36\u0a37\7\37\2\2\u0a37"+
		"\u0a44\3\2\2\2\u0a38\u0a39\7\u0094\2\2\u0a39\u0a3a\7\36\2\2\u0a3a\u0a3b"+
		"\5\u0214\u010b\2\u0a3b\u0a3c\7\37\2\2\u0a3c\u0a44\3\2\2\2\u0a3d\u0a3e"+
		"\7\u0095\2\2\u0a3e\u0a3f\7\36\2\2\u0a3f\u0a40\7\u0089\2\2\u0a40\u0a41"+
		"\5\u0216\u010c\2\u0a41\u0a42\7\37\2\2\u0a42\u0a44\3\2\2\2\u0a43\u0a33"+
		"\3\2\2\2\u0a43\u0a38\3\2\2\2\u0a43\u0a3d\3\2\2\2\u0a44\u0211\3\2\2\2\u0a45"+
		"\u0a46\t\17\2\2\u0a46\u0213\3\2\2\2\u0a47\u0a48\t\20\2\2\u0a48\u0215\3"+
		"\2\2\2\u0a49\u0a4a\7\u00ad\2\2\u0a4a\u0217\3\2\2\2\u0a4b\u0a4c\7\u009a"+
		"\2\2\u0a4c\u0a4d\7\36\2\2\u0a4d\u0a4e\7\u009b\2\2\u0a4e\u0a4f\7\4\2\2"+
		"\u0a4f\u0a50\5\u021c\u010f\2\u0a50\u0a51\7\20\2\2\u0a51\u0a52\7\u009c"+
		"\2\2\u0a52\u0a53\7\4\2\2\u0a53\u0a54\5\u021a\u010e\2\u0a54\u0a55\7\37"+
		"\2\2\u0a55\u0a5a\3\2\2\2\u0a56\u0a57\7\u009a\2\2\u0a57\u0a58\7\36\2\2"+
		"\u0a58\u0a5a\7\37\2\2\u0a59\u0a4b\3\2\2\2\u0a59\u0a56\3\2\2\2\u0a5a\u0219"+
		"\3\2\2\2\u0a5b\u0a5c\5\u022e\u0118\2\u0a5c\u021b\3\2\2\2\u0a5d\u0a5e\7"+
		"\u00af\2\2\u0a5e\u021d\3\2\2\2\u0a5f\u0a63\7\u00a7\2\2\u0a60\u0a63\5\u0222"+
		"\u0112\2\u0a61\u0a63\5\u0224\u0113\2\u0a62\u0a5f\3\2\2\2\u0a62\u0a60\3"+
		"\2\2\2\u0a62\u0a61\3\2\2\2\u0a63\u021f\3\2\2\2\u0a64\u0a65\t\21\2\2\u0a65"+
		"\u0221\3\2\2\2\u0a66\u0a67\t\22\2\2\u0a67\u0223\3\2\2\2\u0a68\u0a69\t"+
		"\23\2\2\u0a69\u0225\3\2\2\2\u0a6a\u0a6d\5\u021e\u0110\2\u0a6b\u0a6d\7"+
		"T\2\2\u0a6c\u0a6a\3\2\2\2\u0a6c\u0a6b\3\2\2\2\u0a6d\u0a75\3\2\2\2\u0a6e"+
		"\u0a71\7\20\2\2\u0a6f\u0a72\5\u021e\u0110\2\u0a70\u0a72\7T\2\2\u0a71\u0a6f"+
		"\3\2\2\2\u0a71\u0a70\3\2\2\2\u0a72\u0a74\3\2\2\2\u0a73\u0a6e\3\2\2\2\u0a74"+
		"\u0a77\3\2\2\2\u0a75\u0a73\3\2\2\2\u0a75\u0a76\3\2\2\2\u0a76\u0227\3\2"+
		"\2\2\u0a77\u0a75\3\2\2\2\u0a78\u0a79\7\u00a2\2\2\u0a79\u0229\3\2\2\2\u0a7a"+
		"\u0a7f\5\u022c\u0117\2\u0a7b\u0a7f\7\u00af\2\2\u0a7c\u0a7f\7\u00a2\2\2"+
		"\u0a7d\u0a7f\7\u00a3\2\2\u0a7e\u0a7a\3\2\2\2\u0a7e\u0a7b\3\2\2\2\u0a7e"+
		"\u0a7c\3\2\2\2\u0a7e\u0a7d\3\2\2\2\u0a7f\u022b\3\2\2\2\u0a80\u0a82\7k"+
		"\2\2\u0a81\u0a80\3\2\2\2\u0a81\u0a82\3\2\2\2\u0a82\u0a83\3\2\2\2\u0a83"+
		"\u0a89\5\u022e\u0118\2\u0a84\u0a86\7k\2\2\u0a85\u0a84\3\2\2\2\u0a85\u0a86"+
		"\3\2\2\2\u0a86\u0a87\3\2\2\2\u0a87\u0a89\7\u00ad\2\2\u0a88\u0a81\3\2\2"+
		"\2\u0a88\u0a85\3\2\2\2\u0a89\u022d\3\2\2\2\u0a8a\u0a8b\t\24\2\2\u0a8b"+
		"\u022f\3\2\2\2\u014d\u0231\u0237\u023b\u023f\u0244\u0248\u024c\u0250\u0254"+
		"\u0256\u025b\u0260\u0264\u026a\u027a\u0280\u0286\u0291\u0298\u02a6\u02b1"+
		"\u02b6\u02c0\u02cc\u02d0\u02d4\u02da\u02e5\u02e9\u02ed\u02f0\u02f9\u0300"+
		"\u0319\u0320\u032f\u033b\u0345\u034a\u0354\u0363\u036a\u036e\u0372\u0376"+
		"\u037a\u037e\u0382\u0386\u038a\u038e\u0392\u0396\u039a\u039e\u03a2\u03a6"+
		"\u03a8\u03ad\u03b2\u03cc\u03e7\u03ec\u03f2\u03f7\u03fb\u0406\u040a\u040d"+
		"\u0410\u041a\u041f\u0437\u0443\u0446\u0449\u0452\u045b\u045e\u0461\u0467"+
		"\u046a\u046e\u0479\u0482\u0485\u048a\u0491\u0498\u049c\u049f\u04a3\u04a8"+
		"\u04ac\u04b4\u04b7\u04bc\u04c6\u04ca\u04d1\u04d5\u04d7\u04da\u04dd\u04e3"+
		"\u04e7\u04ea\u04ee\u04f9\u04fd\u0504\u0508\u050b\u0510\u0513\u0516\u051c"+
		"\u0521\u0525\u052b\u052e\u0534\u0537\u053c\u053f\u0542\u0546\u054d\u0552"+
		"\u0555\u0558\u055b\u0565\u056a\u0573\u0576\u0579\u057d\u0584\u0589\u058c"+
		"\u0596\u059b\u05a1\u05a4\u05a9\u05ac\u05af\u05b7\u05be\u05c2\u05c5\u05c8"+
		"\u05cd\u05d0\u05d3\u05d9\u05dd\u05df\u05e5\u05ec\u05f0\u05f3\u05f6\u05fb"+
		"\u0603\u060a\u060e\u0612\u0616\u061a\u061e\u0622\u0624\u062e\u0632\u0636"+
		"\u063a\u063d\u0644\u0647\u064c\u064f\u0653\u0657\u065a\u065f\u0662\u0666"+
		"\u066b\u0671\u0674\u067a\u0680\u0687\u068b\u0699\u069c\u069f\u06a6\u06ad"+
		"\u06bb\u06c4\u06cb\u06d0\u06e3\u06eb\u06ee\u06f2\u06f7\u06fd\u0704\u070f"+
		"\u0713\u071c\u0724\u0727\u072a\u072e\u0732\u0740\u0746\u074d\u0752\u0756"+
		"\u075b\u0760\u0775\u0778\u077e\u0782\u0786\u0789\u0790\u0797\u079d\u07a2"+
		"\u07a8\u07b7\u07bd\u07c0\u07cc\u07d6\u07da\u07e3\u07e7\u07f2\u07f9\u07fd"+
		"\u0824\u0832\u0837\u0848\u084b\u0850\u0854\u0857\u085e\u0867\u086e\u0873"+
		"\u0879\u087d\u0888\u088c\u089b\u08a4\u08aa\u08bb\u08cb\u08d1\u08e7\u08fc"+
		"\u08fe\u0903\u090c\u0914\u0919\u091d\u091f\u0923\u0928\u092c\u0934\u093a"+
		"\u0941\u0945\u0956\u0962\u0964\u0968\u096c\u0976\u097a\u0981\u0985\u0988"+
		"\u098e\u0991\u09a7\u09aa\u09b0\u09b4\u09b9\u09bc\u09c2\u09cb\u09d2\u09dc"+
		"\u09e8\u09f3\u09fa\u0a01\u0a05\u0a08\u0a0f\u0a14\u0a19\u0a1d\u0a29\u0a30"+
		"\u0a43\u0a59\u0a62\u0a6c\u0a71\u0a75\u0a7e\u0a81\u0a85\u0a88";
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