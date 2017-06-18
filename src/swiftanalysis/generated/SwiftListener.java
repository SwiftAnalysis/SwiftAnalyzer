// Generated from Swift.g4 by ANTLR 4.7

package swiftanalysis.generated;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SwiftParser}.
 */
public interface SwiftListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SwiftParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void enterTopLevel(SwiftParser.TopLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#topLevel}.
	 * @param ctx the parse tree
	 */
	void exitTopLevel(SwiftParser.TopLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SwiftParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SwiftParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(SwiftParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(SwiftParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(SwiftParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(SwiftParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#forInStatement}.
	 * @param ctx the parse tree
	 */
	void enterForInStatement(SwiftParser.ForInStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#forInStatement}.
	 * @param ctx the parse tree
	 */
	void exitForInStatement(SwiftParser.ForInStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(SwiftParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(SwiftParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#repeatWhileStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatWhileStatement(SwiftParser.RepeatWhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#repeatWhileStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatWhileStatement(SwiftParser.RepeatWhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#branchStatement}.
	 * @param ctx the parse tree
	 */
	void enterBranchStatement(SwiftParser.BranchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#branchStatement}.
	 * @param ctx the parse tree
	 */
	void exitBranchStatement(SwiftParser.BranchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(SwiftParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(SwiftParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void enterElseClause(SwiftParser.ElseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#elseClause}.
	 * @param ctx the parse tree
	 */
	void exitElseClause(SwiftParser.ElseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#guardStatement}.
	 * @param ctx the parse tree
	 */
	void enterGuardStatement(SwiftParser.GuardStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#guardStatement}.
	 * @param ctx the parse tree
	 */
	void exitGuardStatement(SwiftParser.GuardStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void enterSwitchStatement(SwiftParser.SwitchStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#switchStatement}.
	 * @param ctx the parse tree
	 */
	void exitSwitchStatement(SwiftParser.SwitchStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#switchCases}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCases(SwiftParser.SwitchCasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#switchCases}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCases(SwiftParser.SwitchCasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void enterSwitchCase(SwiftParser.SwitchCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#switchCase}.
	 * @param ctx the parse tree
	 */
	void exitSwitchCase(SwiftParser.SwitchCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#caseLabel}.
	 * @param ctx the parse tree
	 */
	void enterCaseLabel(SwiftParser.CaseLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#caseLabel}.
	 * @param ctx the parse tree
	 */
	void exitCaseLabel(SwiftParser.CaseLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#caseItemList}.
	 * @param ctx the parse tree
	 */
	void enterCaseItemList(SwiftParser.CaseItemListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#caseItemList}.
	 * @param ctx the parse tree
	 */
	void exitCaseItemList(SwiftParser.CaseItemListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#caseItem}.
	 * @param ctx the parse tree
	 */
	void enterCaseItem(SwiftParser.CaseItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#caseItem}.
	 * @param ctx the parse tree
	 */
	void exitCaseItem(SwiftParser.CaseItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#defaultLabel}.
	 * @param ctx the parse tree
	 */
	void enterDefaultLabel(SwiftParser.DefaultLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#defaultLabel}.
	 * @param ctx the parse tree
	 */
	void exitDefaultLabel(SwiftParser.DefaultLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledStatement(SwiftParser.LabeledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#labeledStatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledStatement(SwiftParser.LabeledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#statementLabel}.
	 * @param ctx the parse tree
	 */
	void enterStatementLabel(SwiftParser.StatementLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#statementLabel}.
	 * @param ctx the parse tree
	 */
	void exitStatementLabel(SwiftParser.StatementLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#labelName}.
	 * @param ctx the parse tree
	 */
	void enterLabelName(SwiftParser.LabelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#labelName}.
	 * @param ctx the parse tree
	 */
	void exitLabelName(SwiftParser.LabelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#controlTransferStatement}.
	 * @param ctx the parse tree
	 */
	void enterControlTransferStatement(SwiftParser.ControlTransferStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#controlTransferStatement}.
	 * @param ctx the parse tree
	 */
	void exitControlTransferStatement(SwiftParser.ControlTransferStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void enterBreakStatement(SwiftParser.BreakStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#breakStatement}.
	 * @param ctx the parse tree
	 */
	void exitBreakStatement(SwiftParser.BreakStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void enterContinueStatement(SwiftParser.ContinueStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#continueStatement}.
	 * @param ctx the parse tree
	 */
	void exitContinueStatement(SwiftParser.ContinueStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#fallthroughStatement}.
	 * @param ctx the parse tree
	 */
	void enterFallthroughStatement(SwiftParser.FallthroughStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#fallthroughStatement}.
	 * @param ctx the parse tree
	 */
	void exitFallthroughStatement(SwiftParser.FallthroughStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(SwiftParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(SwiftParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void enterThrowStatement(SwiftParser.ThrowStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#throwStatement}.
	 * @param ctx the parse tree
	 */
	void exitThrowStatement(SwiftParser.ThrowStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#deferStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeferStatement(SwiftParser.DeferStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#deferStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeferStatement(SwiftParser.DeferStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(SwiftParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(SwiftParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#catchClauses}.
	 * @param ctx the parse tree
	 */
	void enterCatchClauses(SwiftParser.CatchClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#catchClauses}.
	 * @param ctx the parse tree
	 */
	void exitCatchClauses(SwiftParser.CatchClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void enterCatchClause(SwiftParser.CatchClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#catchClause}.
	 * @param ctx the parse tree
	 */
	void exitCatchClause(SwiftParser.CatchClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#conditionList}.
	 * @param ctx the parse tree
	 */
	void enterConditionList(SwiftParser.ConditionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#conditionList}.
	 * @param ctx the parse tree
	 */
	void exitConditionList(SwiftParser.ConditionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SwiftParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SwiftParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#caseCondition}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondition(SwiftParser.CaseConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#caseCondition}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondition(SwiftParser.CaseConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#optionalBindingCondition}.
	 * @param ctx the parse tree
	 */
	void enterOptionalBindingCondition(SwiftParser.OptionalBindingConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#optionalBindingCondition}.
	 * @param ctx the parse tree
	 */
	void exitOptionalBindingCondition(SwiftParser.OptionalBindingConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SwiftParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SwiftParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhereExpression(SwiftParser.WhereExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhereExpression(SwiftParser.WhereExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#availabilityCondition}.
	 * @param ctx the parse tree
	 */
	void enterAvailabilityCondition(SwiftParser.AvailabilityConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#availabilityCondition}.
	 * @param ctx the parse tree
	 */
	void exitAvailabilityCondition(SwiftParser.AvailabilityConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#availabilityArguments}.
	 * @param ctx the parse tree
	 */
	void enterAvailabilityArguments(SwiftParser.AvailabilityArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#availabilityArguments}.
	 * @param ctx the parse tree
	 */
	void exitAvailabilityArguments(SwiftParser.AvailabilityArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#availabilityArgument}.
	 * @param ctx the parse tree
	 */
	void enterAvailabilityArgument(SwiftParser.AvailabilityArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#availabilityArgument}.
	 * @param ctx the parse tree
	 */
	void exitAvailabilityArgument(SwiftParser.AvailabilityArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#platformName}.
	 * @param ctx the parse tree
	 */
	void enterPlatformName(SwiftParser.PlatformNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#platformName}.
	 * @param ctx the parse tree
	 */
	void exitPlatformName(SwiftParser.PlatformNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#platformVersion}.
	 * @param ctx the parse tree
	 */
	void enterPlatformVersion(SwiftParser.PlatformVersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#platformVersion}.
	 * @param ctx the parse tree
	 */
	void exitPlatformVersion(SwiftParser.PlatformVersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#genericParameterClause}.
	 * @param ctx the parse tree
	 */
	void enterGenericParameterClause(SwiftParser.GenericParameterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#genericParameterClause}.
	 * @param ctx the parse tree
	 */
	void exitGenericParameterClause(SwiftParser.GenericParameterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#genericParameterList}.
	 * @param ctx the parse tree
	 */
	void enterGenericParameterList(SwiftParser.GenericParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#genericParameterList}.
	 * @param ctx the parse tree
	 */
	void exitGenericParameterList(SwiftParser.GenericParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#genericParameter}.
	 * @param ctx the parse tree
	 */
	void enterGenericParameter(SwiftParser.GenericParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#genericParameter}.
	 * @param ctx the parse tree
	 */
	void exitGenericParameter(SwiftParser.GenericParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#genericWhereClause}.
	 * @param ctx the parse tree
	 */
	void enterGenericWhereClause(SwiftParser.GenericWhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#genericWhereClause}.
	 * @param ctx the parse tree
	 */
	void exitGenericWhereClause(SwiftParser.GenericWhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#requirementList}.
	 * @param ctx the parse tree
	 */
	void enterRequirementList(SwiftParser.RequirementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#requirementList}.
	 * @param ctx the parse tree
	 */
	void exitRequirementList(SwiftParser.RequirementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#requirement}.
	 * @param ctx the parse tree
	 */
	void enterRequirement(SwiftParser.RequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#requirement}.
	 * @param ctx the parse tree
	 */
	void exitRequirement(SwiftParser.RequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#conformanceRequirement}.
	 * @param ctx the parse tree
	 */
	void enterConformanceRequirement(SwiftParser.ConformanceRequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#conformanceRequirement}.
	 * @param ctx the parse tree
	 */
	void exitConformanceRequirement(SwiftParser.ConformanceRequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#sameTypeRequirement}.
	 * @param ctx the parse tree
	 */
	void enterSameTypeRequirement(SwiftParser.SameTypeRequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#sameTypeRequirement}.
	 * @param ctx the parse tree
	 */
	void exitSameTypeRequirement(SwiftParser.SameTypeRequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#genericArgumentClause}.
	 * @param ctx the parse tree
	 */
	void enterGenericArgumentClause(SwiftParser.GenericArgumentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#genericArgumentClause}.
	 * @param ctx the parse tree
	 */
	void exitGenericArgumentClause(SwiftParser.GenericArgumentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#genericArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterGenericArgumentList(SwiftParser.GenericArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#genericArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitGenericArgumentList(SwiftParser.GenericArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#genericArgument}.
	 * @param ctx the parse tree
	 */
	void enterGenericArgument(SwiftParser.GenericArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#genericArgument}.
	 * @param ctx the parse tree
	 */
	void exitGenericArgument(SwiftParser.GenericArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SwiftParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SwiftParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(SwiftParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(SwiftParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#declarationModifiers}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationModifiers(SwiftParser.DeclarationModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#declarationModifiers}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationModifiers(SwiftParser.DeclarationModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#declarationModifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationModifier(SwiftParser.DeclarationModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#declarationModifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationModifier(SwiftParser.DeclarationModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#accessLevelModifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessLevelModifier(SwiftParser.AccessLevelModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#accessLevelModifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessLevelModifier(SwiftParser.AccessLevelModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#accessLevelModifiers}.
	 * @param ctx the parse tree
	 */
	void enterAccessLevelModifiers(SwiftParser.AccessLevelModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#accessLevelModifiers}.
	 * @param ctx the parse tree
	 */
	void exitAccessLevelModifiers(SwiftParser.AccessLevelModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#mutationModifier}.
	 * @param ctx the parse tree
	 */
	void enterMutationModifier(SwiftParser.MutationModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#mutationModifier}.
	 * @param ctx the parse tree
	 */
	void exitMutationModifier(SwiftParser.MutationModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(SwiftParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(SwiftParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterImportDeclaration(SwiftParser.ImportDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#importDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitImportDeclaration(SwiftParser.ImportDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#importKind}.
	 * @param ctx the parse tree
	 */
	void enterImportKind(SwiftParser.ImportKindContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#importKind}.
	 * @param ctx the parse tree
	 */
	void exitImportKind(SwiftParser.ImportKindContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#importPath}.
	 * @param ctx the parse tree
	 */
	void enterImportPath(SwiftParser.ImportPathContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#importPath}.
	 * @param ctx the parse tree
	 */
	void exitImportPath(SwiftParser.ImportPathContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#importPathIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterImportPathIdentifier(SwiftParser.ImportPathIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#importPathIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitImportPathIdentifier(SwiftParser.ImportPathIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterConstantDeclaration(SwiftParser.ConstantDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#constantDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitConstantDeclaration(SwiftParser.ConstantDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#patternInitializerList}.
	 * @param ctx the parse tree
	 */
	void enterPatternInitializerList(SwiftParser.PatternInitializerListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#patternInitializerList}.
	 * @param ctx the parse tree
	 */
	void exitPatternInitializerList(SwiftParser.PatternInitializerListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#patternInitializer}.
	 * @param ctx the parse tree
	 */
	void enterPatternInitializer(SwiftParser.PatternInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#patternInitializer}.
	 * @param ctx the parse tree
	 */
	void exitPatternInitializer(SwiftParser.PatternInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(SwiftParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(SwiftParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(SwiftParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(SwiftParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#variableDeclarationHead}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationHead(SwiftParser.VariableDeclarationHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#variableDeclarationHead}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationHead(SwiftParser.VariableDeclarationHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#variableName}.
	 * @param ctx the parse tree
	 */
	void enterVariableName(SwiftParser.VariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#variableName}.
	 * @param ctx the parse tree
	 */
	void exitVariableName(SwiftParser.VariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#getterSetterBlock}.
	 * @param ctx the parse tree
	 */
	void enterGetterSetterBlock(SwiftParser.GetterSetterBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#getterSetterBlock}.
	 * @param ctx the parse tree
	 */
	void exitGetterSetterBlock(SwiftParser.GetterSetterBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#getterClause}.
	 * @param ctx the parse tree
	 */
	void enterGetterClause(SwiftParser.GetterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#getterClause}.
	 * @param ctx the parse tree
	 */
	void exitGetterClause(SwiftParser.GetterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#setterClause}.
	 * @param ctx the parse tree
	 */
	void enterSetterClause(SwiftParser.SetterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#setterClause}.
	 * @param ctx the parse tree
	 */
	void exitSetterClause(SwiftParser.SetterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#setterName}.
	 * @param ctx the parse tree
	 */
	void enterSetterName(SwiftParser.SetterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#setterName}.
	 * @param ctx the parse tree
	 */
	void exitSetterName(SwiftParser.SetterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#getterSetterKeywordBlock}.
	 * @param ctx the parse tree
	 */
	void enterGetterSetterKeywordBlock(SwiftParser.GetterSetterKeywordBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#getterSetterKeywordBlock}.
	 * @param ctx the parse tree
	 */
	void exitGetterSetterKeywordBlock(SwiftParser.GetterSetterKeywordBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#getterKeywordClause}.
	 * @param ctx the parse tree
	 */
	void enterGetterKeywordClause(SwiftParser.GetterKeywordClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#getterKeywordClause}.
	 * @param ctx the parse tree
	 */
	void exitGetterKeywordClause(SwiftParser.GetterKeywordClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#setterKeywordClause}.
	 * @param ctx the parse tree
	 */
	void enterSetterKeywordClause(SwiftParser.SetterKeywordClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#setterKeywordClause}.
	 * @param ctx the parse tree
	 */
	void exitSetterKeywordClause(SwiftParser.SetterKeywordClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#willSetDidSetBlock}.
	 * @param ctx the parse tree
	 */
	void enterWillSetDidSetBlock(SwiftParser.WillSetDidSetBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#willSetDidSetBlock}.
	 * @param ctx the parse tree
	 */
	void exitWillSetDidSetBlock(SwiftParser.WillSetDidSetBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#willSetClause}.
	 * @param ctx the parse tree
	 */
	void enterWillSetClause(SwiftParser.WillSetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#willSetClause}.
	 * @param ctx the parse tree
	 */
	void exitWillSetClause(SwiftParser.WillSetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#didSetClause}.
	 * @param ctx the parse tree
	 */
	void enterDidSetClause(SwiftParser.DidSetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#didSetClause}.
	 * @param ctx the parse tree
	 */
	void exitDidSetClause(SwiftParser.DidSetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#typealiasDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTypealiasDeclaration(SwiftParser.TypealiasDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#typealiasDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTypealiasDeclaration(SwiftParser.TypealiasDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#typealiasHead}.
	 * @param ctx the parse tree
	 */
	void enterTypealiasHead(SwiftParser.TypealiasHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#typealiasHead}.
	 * @param ctx the parse tree
	 */
	void exitTypealiasHead(SwiftParser.TypealiasHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#typealiasName}.
	 * @param ctx the parse tree
	 */
	void enterTypealiasName(SwiftParser.TypealiasNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#typealiasName}.
	 * @param ctx the parse tree
	 */
	void exitTypealiasName(SwiftParser.TypealiasNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#typealiasAssignment}.
	 * @param ctx the parse tree
	 */
	void enterTypealiasAssignment(SwiftParser.TypealiasAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#typealiasAssignment}.
	 * @param ctx the parse tree
	 */
	void exitTypealiasAssignment(SwiftParser.TypealiasAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(SwiftParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(SwiftParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#functionHead}.
	 * @param ctx the parse tree
	 */
	void enterFunctionHead(SwiftParser.FunctionHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#functionHead}.
	 * @param ctx the parse tree
	 */
	void exitFunctionHead(SwiftParser.FunctionHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(SwiftParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(SwiftParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSignature(SwiftParser.FunctionSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSignature(SwiftParser.FunctionSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#functionResult}.
	 * @param ctx the parse tree
	 */
	void enterFunctionResult(SwiftParser.FunctionResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#functionResult}.
	 * @param ctx the parse tree
	 */
	void exitFunctionResult(SwiftParser.FunctionResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(SwiftParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(SwiftParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#parameterClause}.
	 * @param ctx the parse tree
	 */
	void enterParameterClause(SwiftParser.ParameterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#parameterClause}.
	 * @param ctx the parse tree
	 */
	void exitParameterClause(SwiftParser.ParameterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(SwiftParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(SwiftParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(SwiftParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(SwiftParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#externalParameterName}.
	 * @param ctx the parse tree
	 */
	void enterExternalParameterName(SwiftParser.ExternalParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#externalParameterName}.
	 * @param ctx the parse tree
	 */
	void exitExternalParameterName(SwiftParser.ExternalParameterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#localParameterName}.
	 * @param ctx the parse tree
	 */
	void enterLocalParameterName(SwiftParser.LocalParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#localParameterName}.
	 * @param ctx the parse tree
	 */
	void exitLocalParameterName(SwiftParser.LocalParameterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#defaultArgumentClause}.
	 * @param ctx the parse tree
	 */
	void enterDefaultArgumentClause(SwiftParser.DefaultArgumentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#defaultArgumentClause}.
	 * @param ctx the parse tree
	 */
	void exitDefaultArgumentClause(SwiftParser.DefaultArgumentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEnumDeclaration(SwiftParser.EnumDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#enumDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEnumDeclaration(SwiftParser.EnumDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#enumDef}.
	 * @param ctx the parse tree
	 */
	void enterEnumDef(SwiftParser.EnumDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#enumDef}.
	 * @param ctx the parse tree
	 */
	void exitEnumDef(SwiftParser.EnumDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#unionStyleEnum}.
	 * @param ctx the parse tree
	 */
	void enterUnionStyleEnum(SwiftParser.UnionStyleEnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#unionStyleEnum}.
	 * @param ctx the parse tree
	 */
	void exitUnionStyleEnum(SwiftParser.UnionStyleEnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#unionStyleEnumMembers}.
	 * @param ctx the parse tree
	 */
	void enterUnionStyleEnumMembers(SwiftParser.UnionStyleEnumMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#unionStyleEnumMembers}.
	 * @param ctx the parse tree
	 */
	void exitUnionStyleEnumMembers(SwiftParser.UnionStyleEnumMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#unionStyleEnumMember}.
	 * @param ctx the parse tree
	 */
	void enterUnionStyleEnumMember(SwiftParser.UnionStyleEnumMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#unionStyleEnumMember}.
	 * @param ctx the parse tree
	 */
	void exitUnionStyleEnumMember(SwiftParser.UnionStyleEnumMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#unionStyleEnumCaseClause}.
	 * @param ctx the parse tree
	 */
	void enterUnionStyleEnumCaseClause(SwiftParser.UnionStyleEnumCaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#unionStyleEnumCaseClause}.
	 * @param ctx the parse tree
	 */
	void exitUnionStyleEnumCaseClause(SwiftParser.UnionStyleEnumCaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#unionStyleEnumCaseList}.
	 * @param ctx the parse tree
	 */
	void enterUnionStyleEnumCaseList(SwiftParser.UnionStyleEnumCaseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#unionStyleEnumCaseList}.
	 * @param ctx the parse tree
	 */
	void exitUnionStyleEnumCaseList(SwiftParser.UnionStyleEnumCaseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#unionStyleEnumCase}.
	 * @param ctx the parse tree
	 */
	void enterUnionStyleEnumCase(SwiftParser.UnionStyleEnumCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#unionStyleEnumCase}.
	 * @param ctx the parse tree
	 */
	void exitUnionStyleEnumCase(SwiftParser.UnionStyleEnumCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#enumName}.
	 * @param ctx the parse tree
	 */
	void enterEnumName(SwiftParser.EnumNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#enumName}.
	 * @param ctx the parse tree
	 */
	void exitEnumName(SwiftParser.EnumNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#enumCaseName}.
	 * @param ctx the parse tree
	 */
	void enterEnumCaseName(SwiftParser.EnumCaseNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#enumCaseName}.
	 * @param ctx the parse tree
	 */
	void exitEnumCaseName(SwiftParser.EnumCaseNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#rawValueStyleEnum}.
	 * @param ctx the parse tree
	 */
	void enterRawValueStyleEnum(SwiftParser.RawValueStyleEnumContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#rawValueStyleEnum}.
	 * @param ctx the parse tree
	 */
	void exitRawValueStyleEnum(SwiftParser.RawValueStyleEnumContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#rawValueStyleEnumMembers}.
	 * @param ctx the parse tree
	 */
	void enterRawValueStyleEnumMembers(SwiftParser.RawValueStyleEnumMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#rawValueStyleEnumMembers}.
	 * @param ctx the parse tree
	 */
	void exitRawValueStyleEnumMembers(SwiftParser.RawValueStyleEnumMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#rawValueStyleEnumMember}.
	 * @param ctx the parse tree
	 */
	void enterRawValueStyleEnumMember(SwiftParser.RawValueStyleEnumMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#rawValueStyleEnumMember}.
	 * @param ctx the parse tree
	 */
	void exitRawValueStyleEnumMember(SwiftParser.RawValueStyleEnumMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#rawValueStyleEnumCaseClause}.
	 * @param ctx the parse tree
	 */
	void enterRawValueStyleEnumCaseClause(SwiftParser.RawValueStyleEnumCaseClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#rawValueStyleEnumCaseClause}.
	 * @param ctx the parse tree
	 */
	void exitRawValueStyleEnumCaseClause(SwiftParser.RawValueStyleEnumCaseClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#rawValueStyleEnumCaseList}.
	 * @param ctx the parse tree
	 */
	void enterRawValueStyleEnumCaseList(SwiftParser.RawValueStyleEnumCaseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#rawValueStyleEnumCaseList}.
	 * @param ctx the parse tree
	 */
	void exitRawValueStyleEnumCaseList(SwiftParser.RawValueStyleEnumCaseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#rawValueStyleEnumCase}.
	 * @param ctx the parse tree
	 */
	void enterRawValueStyleEnumCase(SwiftParser.RawValueStyleEnumCaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#rawValueStyleEnumCase}.
	 * @param ctx the parse tree
	 */
	void exitRawValueStyleEnumCase(SwiftParser.RawValueStyleEnumCaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#rawValueAssignment}.
	 * @param ctx the parse tree
	 */
	void enterRawValueAssignment(SwiftParser.RawValueAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#rawValueAssignment}.
	 * @param ctx the parse tree
	 */
	void exitRawValueAssignment(SwiftParser.RawValueAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStructDeclaration(SwiftParser.StructDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#structDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStructDeclaration(SwiftParser.StructDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#structName}.
	 * @param ctx the parse tree
	 */
	void enterStructName(SwiftParser.StructNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#structName}.
	 * @param ctx the parse tree
	 */
	void exitStructName(SwiftParser.StructNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#structBody}.
	 * @param ctx the parse tree
	 */
	void enterStructBody(SwiftParser.StructBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#structBody}.
	 * @param ctx the parse tree
	 */
	void exitStructBody(SwiftParser.StructBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#structMembers}.
	 * @param ctx the parse tree
	 */
	void enterStructMembers(SwiftParser.StructMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#structMembers}.
	 * @param ctx the parse tree
	 */
	void exitStructMembers(SwiftParser.StructMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#structMember}.
	 * @param ctx the parse tree
	 */
	void enterStructMember(SwiftParser.StructMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#structMember}.
	 * @param ctx the parse tree
	 */
	void exitStructMember(SwiftParser.StructMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(SwiftParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(SwiftParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#classDeclarationModifiers}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclarationModifiers(SwiftParser.ClassDeclarationModifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#classDeclarationModifiers}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclarationModifiers(SwiftParser.ClassDeclarationModifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(SwiftParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(SwiftParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(SwiftParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(SwiftParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#classMembers}.
	 * @param ctx the parse tree
	 */
	void enterClassMembers(SwiftParser.ClassMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#classMembers}.
	 * @param ctx the parse tree
	 */
	void exitClassMembers(SwiftParser.ClassMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#classMember}.
	 * @param ctx the parse tree
	 */
	void enterClassMember(SwiftParser.ClassMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#classMember}.
	 * @param ctx the parse tree
	 */
	void exitClassMember(SwiftParser.ClassMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocolDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolDeclaration(SwiftParser.ProtocolDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocolDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolDeclaration(SwiftParser.ProtocolDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocolName}.
	 * @param ctx the parse tree
	 */
	void enterProtocolName(SwiftParser.ProtocolNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocolName}.
	 * @param ctx the parse tree
	 */
	void exitProtocolName(SwiftParser.ProtocolNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocolBody}.
	 * @param ctx the parse tree
	 */
	void enterProtocolBody(SwiftParser.ProtocolBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocolBody}.
	 * @param ctx the parse tree
	 */
	void exitProtocolBody(SwiftParser.ProtocolBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocolMembers}.
	 * @param ctx the parse tree
	 */
	void enterProtocolMembers(SwiftParser.ProtocolMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocolMembers}.
	 * @param ctx the parse tree
	 */
	void exitProtocolMembers(SwiftParser.ProtocolMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocolMember}.
	 * @param ctx the parse tree
	 */
	void enterProtocolMember(SwiftParser.ProtocolMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocolMember}.
	 * @param ctx the parse tree
	 */
	void exitProtocolMember(SwiftParser.ProtocolMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocolMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolMemberDeclaration(SwiftParser.ProtocolMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocolMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolMemberDeclaration(SwiftParser.ProtocolMemberDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocolPropertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolPropertyDeclaration(SwiftParser.ProtocolPropertyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocolPropertyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolPropertyDeclaration(SwiftParser.ProtocolPropertyDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocolMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolMethodDeclaration(SwiftParser.ProtocolMethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocolMethodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolMethodDeclaration(SwiftParser.ProtocolMethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocolInitializerDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolInitializerDeclaration(SwiftParser.ProtocolInitializerDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocolInitializerDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolInitializerDeclaration(SwiftParser.ProtocolInitializerDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocolSubscriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolSubscriptDeclaration(SwiftParser.ProtocolSubscriptDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocolSubscriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolSubscriptDeclaration(SwiftParser.ProtocolSubscriptDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocolAssociatedTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProtocolAssociatedTypeDeclaration(SwiftParser.ProtocolAssociatedTypeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocolAssociatedTypeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProtocolAssociatedTypeDeclaration(SwiftParser.ProtocolAssociatedTypeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#initializerDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInitializerDeclaration(SwiftParser.InitializerDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#initializerDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInitializerDeclaration(SwiftParser.InitializerDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#initializerHead}.
	 * @param ctx the parse tree
	 */
	void enterInitializerHead(SwiftParser.InitializerHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#initializerHead}.
	 * @param ctx the parse tree
	 */
	void exitInitializerHead(SwiftParser.InitializerHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#initializerBody}.
	 * @param ctx the parse tree
	 */
	void enterInitializerBody(SwiftParser.InitializerBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#initializerBody}.
	 * @param ctx the parse tree
	 */
	void exitInitializerBody(SwiftParser.InitializerBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#deinitializerDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterDeinitializerDeclaration(SwiftParser.DeinitializerDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#deinitializerDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitDeinitializerDeclaration(SwiftParser.DeinitializerDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#extensionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExtensionDeclaration(SwiftParser.ExtensionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#extensionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExtensionDeclaration(SwiftParser.ExtensionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#extensionBody}.
	 * @param ctx the parse tree
	 */
	void enterExtensionBody(SwiftParser.ExtensionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#extensionBody}.
	 * @param ctx the parse tree
	 */
	void exitExtensionBody(SwiftParser.ExtensionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#extensionMembers}.
	 * @param ctx the parse tree
	 */
	void enterExtensionMembers(SwiftParser.ExtensionMembersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#extensionMembers}.
	 * @param ctx the parse tree
	 */
	void exitExtensionMembers(SwiftParser.ExtensionMembersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#extensionMember}.
	 * @param ctx the parse tree
	 */
	void enterExtensionMember(SwiftParser.ExtensionMemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#extensionMember}.
	 * @param ctx the parse tree
	 */
	void exitExtensionMember(SwiftParser.ExtensionMemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#subscriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptDeclaration(SwiftParser.SubscriptDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#subscriptDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptDeclaration(SwiftParser.SubscriptDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#subscriptHead}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptHead(SwiftParser.SubscriptHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#subscriptHead}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptHead(SwiftParser.SubscriptHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#subscriptResult}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptResult(SwiftParser.SubscriptResultContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#subscriptResult}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptResult(SwiftParser.SubscriptResultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#operatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOperatorDeclaration(SwiftParser.OperatorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#operatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOperatorDeclaration(SwiftParser.OperatorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#prefixOperatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOperatorDeclaration(SwiftParser.PrefixOperatorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#prefixOperatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOperatorDeclaration(SwiftParser.PrefixOperatorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#postfixOperatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPostfixOperatorDeclaration(SwiftParser.PostfixOperatorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#postfixOperatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPostfixOperatorDeclaration(SwiftParser.PostfixOperatorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#infixOperatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterInfixOperatorDeclaration(SwiftParser.InfixOperatorDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#infixOperatorDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitInfixOperatorDeclaration(SwiftParser.InfixOperatorDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#infixOperatorGroup}.
	 * @param ctx the parse tree
	 */
	void enterInfixOperatorGroup(SwiftParser.InfixOperatorGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#infixOperatorGroup}.
	 * @param ctx the parse tree
	 */
	void exitInfixOperatorGroup(SwiftParser.InfixOperatorGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#precedenceGroupDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterPrecedenceGroupDeclaration(SwiftParser.PrecedenceGroupDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#precedenceGroupDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitPrecedenceGroupDeclaration(SwiftParser.PrecedenceGroupDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#precedenceGroupAttributes}.
	 * @param ctx the parse tree
	 */
	void enterPrecedenceGroupAttributes(SwiftParser.PrecedenceGroupAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#precedenceGroupAttributes}.
	 * @param ctx the parse tree
	 */
	void exitPrecedenceGroupAttributes(SwiftParser.PrecedenceGroupAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#precedenceGroupAttribute}.
	 * @param ctx the parse tree
	 */
	void enterPrecedenceGroupAttribute(SwiftParser.PrecedenceGroupAttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#precedenceGroupAttribute}.
	 * @param ctx the parse tree
	 */
	void exitPrecedenceGroupAttribute(SwiftParser.PrecedenceGroupAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#precedenceGroupRelation}.
	 * @param ctx the parse tree
	 */
	void enterPrecedenceGroupRelation(SwiftParser.PrecedenceGroupRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#precedenceGroupRelation}.
	 * @param ctx the parse tree
	 */
	void exitPrecedenceGroupRelation(SwiftParser.PrecedenceGroupRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#precedenceGroupAssignment}.
	 * @param ctx the parse tree
	 */
	void enterPrecedenceGroupAssignment(SwiftParser.PrecedenceGroupAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#precedenceGroupAssignment}.
	 * @param ctx the parse tree
	 */
	void exitPrecedenceGroupAssignment(SwiftParser.PrecedenceGroupAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#precedenceGroupAssociativity}.
	 * @param ctx the parse tree
	 */
	void enterPrecedenceGroupAssociativity(SwiftParser.PrecedenceGroupAssociativityContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#precedenceGroupAssociativity}.
	 * @param ctx the parse tree
	 */
	void exitPrecedenceGroupAssociativity(SwiftParser.PrecedenceGroupAssociativityContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#precedenceGroupNames}.
	 * @param ctx the parse tree
	 */
	void enterPrecedenceGroupNames(SwiftParser.PrecedenceGroupNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#precedenceGroupNames}.
	 * @param ctx the parse tree
	 */
	void exitPrecedenceGroupNames(SwiftParser.PrecedenceGroupNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#precedenceGroupName}.
	 * @param ctx the parse tree
	 */
	void enterPrecedenceGroupName(SwiftParser.PrecedenceGroupNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#precedenceGroupName}.
	 * @param ctx the parse tree
	 */
	void exitPrecedenceGroupName(SwiftParser.PrecedenceGroupNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void enterPattern(SwiftParser.PatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#pattern}.
	 * @param ctx the parse tree
	 */
	void exitPattern(SwiftParser.PatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#wildcardPattern}.
	 * @param ctx the parse tree
	 */
	void enterWildcardPattern(SwiftParser.WildcardPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#wildcardPattern}.
	 * @param ctx the parse tree
	 */
	void exitWildcardPattern(SwiftParser.WildcardPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#identifierPattern}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierPattern(SwiftParser.IdentifierPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#identifierPattern}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierPattern(SwiftParser.IdentifierPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#valueBindingPattern}.
	 * @param ctx the parse tree
	 */
	void enterValueBindingPattern(SwiftParser.ValueBindingPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#valueBindingPattern}.
	 * @param ctx the parse tree
	 */
	void exitValueBindingPattern(SwiftParser.ValueBindingPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#tuplePattern}.
	 * @param ctx the parse tree
	 */
	void enterTuplePattern(SwiftParser.TuplePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tuplePattern}.
	 * @param ctx the parse tree
	 */
	void exitTuplePattern(SwiftParser.TuplePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#tuplePatternElementList}.
	 * @param ctx the parse tree
	 */
	void enterTuplePatternElementList(SwiftParser.TuplePatternElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tuplePatternElementList}.
	 * @param ctx the parse tree
	 */
	void exitTuplePatternElementList(SwiftParser.TuplePatternElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#tuplePatternElement}.
	 * @param ctx the parse tree
	 */
	void enterTuplePatternElement(SwiftParser.TuplePatternElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tuplePatternElement}.
	 * @param ctx the parse tree
	 */
	void exitTuplePatternElement(SwiftParser.TuplePatternElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#enumCasePattern}.
	 * @param ctx the parse tree
	 */
	void enterEnumCasePattern(SwiftParser.EnumCasePatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#enumCasePattern}.
	 * @param ctx the parse tree
	 */
	void exitEnumCasePattern(SwiftParser.EnumCasePatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#typeCastingPattern}.
	 * @param ctx the parse tree
	 */
	void enterTypeCastingPattern(SwiftParser.TypeCastingPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#typeCastingPattern}.
	 * @param ctx the parse tree
	 */
	void exitTypeCastingPattern(SwiftParser.TypeCastingPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#isPattern}.
	 * @param ctx the parse tree
	 */
	void enterIsPattern(SwiftParser.IsPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#isPattern}.
	 * @param ctx the parse tree
	 */
	void exitIsPattern(SwiftParser.IsPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#asPattern}.
	 * @param ctx the parse tree
	 */
	void enterAsPattern(SwiftParser.AsPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#asPattern}.
	 * @param ctx the parse tree
	 */
	void exitAsPattern(SwiftParser.AsPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#expressionPattern}.
	 * @param ctx the parse tree
	 */
	void enterExpressionPattern(SwiftParser.ExpressionPatternContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#expressionPattern}.
	 * @param ctx the parse tree
	 */
	void exitExpressionPattern(SwiftParser.ExpressionPatternContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(SwiftParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(SwiftParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void enterAttributeName(SwiftParser.AttributeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#attributeName}.
	 * @param ctx the parse tree
	 */
	void exitAttributeName(SwiftParser.AttributeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#attributeArgumentClause}.
	 * @param ctx the parse tree
	 */
	void enterAttributeArgumentClause(SwiftParser.AttributeArgumentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#attributeArgumentClause}.
	 * @param ctx the parse tree
	 */
	void exitAttributeArgumentClause(SwiftParser.AttributeArgumentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(SwiftParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(SwiftParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#balancedTokens}.
	 * @param ctx the parse tree
	 */
	void enterBalancedTokens(SwiftParser.BalancedTokensContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#balancedTokens}.
	 * @param ctx the parse tree
	 */
	void exitBalancedTokens(SwiftParser.BalancedTokensContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#balancedToken}.
	 * @param ctx the parse tree
	 */
	void enterBalancedToken(SwiftParser.BalancedTokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#balancedToken}.
	 * @param ctx the parse tree
	 */
	void exitBalancedToken(SwiftParser.BalancedTokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SwiftParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SwiftParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#prefixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrefixExpression(SwiftParser.PrefixExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#prefixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrefixExpression(SwiftParser.PrefixExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#inOutExpression}.
	 * @param ctx the parse tree
	 */
	void enterInOutExpression(SwiftParser.InOutExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#inOutExpression}.
	 * @param ctx the parse tree
	 */
	void exitInOutExpression(SwiftParser.InOutExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#tryOperator}.
	 * @param ctx the parse tree
	 */
	void enterTryOperator(SwiftParser.TryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tryOperator}.
	 * @param ctx the parse tree
	 */
	void exitTryOperator(SwiftParser.TryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpression(SwiftParser.BinaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#binaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpression(SwiftParser.BinaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(SwiftParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(SwiftParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void enterConditionalOperator(SwiftParser.ConditionalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#conditionalOperator}.
	 * @param ctx the parse tree
	 */
	void exitConditionalOperator(SwiftParser.ConditionalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#typeCastingOperator}.
	 * @param ctx the parse tree
	 */
	void enterTypeCastingOperator(SwiftParser.TypeCastingOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#typeCastingOperator}.
	 * @param ctx the parse tree
	 */
	void exitTypeCastingOperator(SwiftParser.TypeCastingOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExpression(SwiftParser.PrimaryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExpression(SwiftParser.PrimaryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLiteralExpression(SwiftParser.LiteralExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#literalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLiteralExpression(SwiftParser.LiteralExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteral(SwiftParser.ArrayLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#arrayLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteral(SwiftParser.ArrayLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#arrayLiteralItems}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralItems(SwiftParser.ArrayLiteralItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#arrayLiteralItems}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralItems(SwiftParser.ArrayLiteralItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#arrayLiteralItem}.
	 * @param ctx the parse tree
	 */
	void enterArrayLiteralItem(SwiftParser.ArrayLiteralItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#arrayLiteralItem}.
	 * @param ctx the parse tree
	 */
	void exitArrayLiteralItem(SwiftParser.ArrayLiteralItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#dictionaryLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryLiteral(SwiftParser.DictionaryLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#dictionaryLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryLiteral(SwiftParser.DictionaryLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#dictionaryLiteralItems}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryLiteralItems(SwiftParser.DictionaryLiteralItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#dictionaryLiteralItems}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryLiteralItems(SwiftParser.DictionaryLiteralItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#dictionaryLiteralItem}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryLiteralItem(SwiftParser.DictionaryLiteralItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#dictionaryLiteralItem}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryLiteralItem(SwiftParser.DictionaryLiteralItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#playgroundLiteral}.
	 * @param ctx the parse tree
	 */
	void enterPlaygroundLiteral(SwiftParser.PlaygroundLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#playgroundLiteral}.
	 * @param ctx the parse tree
	 */
	void exitPlaygroundLiteral(SwiftParser.PlaygroundLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#selfExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelfExpression(SwiftParser.SelfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#selfExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelfExpression(SwiftParser.SelfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#superclassExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclassExpression(SwiftParser.SuperclassExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#superclassExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclassExpression(SwiftParser.SuperclassExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#superclassMethodExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclassMethodExpression(SwiftParser.SuperclassMethodExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#superclassMethodExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclassMethodExpression(SwiftParser.SuperclassMethodExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#superclassSubscriptExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclassSubscriptExpression(SwiftParser.SuperclassSubscriptExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#superclassSubscriptExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclassSubscriptExpression(SwiftParser.SuperclassSubscriptExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#superclassInitializerExpression}.
	 * @param ctx the parse tree
	 */
	void enterSuperclassInitializerExpression(SwiftParser.SuperclassInitializerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#superclassInitializerExpression}.
	 * @param ctx the parse tree
	 */
	void exitSuperclassInitializerExpression(SwiftParser.SuperclassInitializerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#closureExpression}.
	 * @param ctx the parse tree
	 */
	void enterClosureExpression(SwiftParser.ClosureExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#closureExpression}.
	 * @param ctx the parse tree
	 */
	void exitClosureExpression(SwiftParser.ClosureExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#closureSignature}.
	 * @param ctx the parse tree
	 */
	void enterClosureSignature(SwiftParser.ClosureSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#closureSignature}.
	 * @param ctx the parse tree
	 */
	void exitClosureSignature(SwiftParser.ClosureSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#closureParameterClause}.
	 * @param ctx the parse tree
	 */
	void enterClosureParameterClause(SwiftParser.ClosureParameterClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#closureParameterClause}.
	 * @param ctx the parse tree
	 */
	void exitClosureParameterClause(SwiftParser.ClosureParameterClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#closureParameterList}.
	 * @param ctx the parse tree
	 */
	void enterClosureParameterList(SwiftParser.ClosureParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#closureParameterList}.
	 * @param ctx the parse tree
	 */
	void exitClosureParameterList(SwiftParser.ClosureParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#closureParameter}.
	 * @param ctx the parse tree
	 */
	void enterClosureParameter(SwiftParser.ClosureParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#closureParameter}.
	 * @param ctx the parse tree
	 */
	void exitClosureParameter(SwiftParser.ClosureParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#closureParameterName}.
	 * @param ctx the parse tree
	 */
	void enterClosureParameterName(SwiftParser.ClosureParameterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#closureParameterName}.
	 * @param ctx the parse tree
	 */
	void exitClosureParameterName(SwiftParser.ClosureParameterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#captureList}.
	 * @param ctx the parse tree
	 */
	void enterCaptureList(SwiftParser.CaptureListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#captureList}.
	 * @param ctx the parse tree
	 */
	void exitCaptureList(SwiftParser.CaptureListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#captureListItems}.
	 * @param ctx the parse tree
	 */
	void enterCaptureListItems(SwiftParser.CaptureListItemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#captureListItems}.
	 * @param ctx the parse tree
	 */
	void exitCaptureListItems(SwiftParser.CaptureListItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#captureListItem}.
	 * @param ctx the parse tree
	 */
	void enterCaptureListItem(SwiftParser.CaptureListItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#captureListItem}.
	 * @param ctx the parse tree
	 */
	void exitCaptureListItem(SwiftParser.CaptureListItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#captureSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterCaptureSpecifier(SwiftParser.CaptureSpecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#captureSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitCaptureSpecifier(SwiftParser.CaptureSpecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#implicitMemberExpression}.
	 * @param ctx the parse tree
	 */
	void enterImplicitMemberExpression(SwiftParser.ImplicitMemberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#implicitMemberExpression}.
	 * @param ctx the parse tree
	 */
	void exitImplicitMemberExpression(SwiftParser.ImplicitMemberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(SwiftParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#parenthesizedExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(SwiftParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void enterTupleExpression(SwiftParser.TupleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tupleExpression}.
	 * @param ctx the parse tree
	 */
	void exitTupleExpression(SwiftParser.TupleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#tupleElementList}.
	 * @param ctx the parse tree
	 */
	void enterTupleElementList(SwiftParser.TupleElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tupleElementList}.
	 * @param ctx the parse tree
	 */
	void exitTupleElementList(SwiftParser.TupleElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#tupleElement}.
	 * @param ctx the parse tree
	 */
	void enterTupleElement(SwiftParser.TupleElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tupleElement}.
	 * @param ctx the parse tree
	 */
	void exitTupleElement(SwiftParser.TupleElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#wildcardExpression}.
	 * @param ctx the parse tree
	 */
	void enterWildcardExpression(SwiftParser.WildcardExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#wildcardExpression}.
	 * @param ctx the parse tree
	 */
	void exitWildcardExpression(SwiftParser.WildcardExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#selectorExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectorExpression(SwiftParser.SelectorExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#selectorExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectorExpression(SwiftParser.SelectorExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#keyPathExpression}.
	 * @param ctx the parse tree
	 */
	void enterKeyPathExpression(SwiftParser.KeyPathExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#keyPathExpression}.
	 * @param ctx the parse tree
	 */
	void exitKeyPathExpression(SwiftParser.KeyPathExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dynamicTypeExpression}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterDynamicTypeExpression(SwiftParser.DynamicTypeExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dynamicTypeExpression}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitDynamicTypeExpression(SwiftParser.DynamicTypeExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallWithClosureExpression}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallWithClosureExpression(SwiftParser.FunctionCallWithClosureExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallWithClosureExpression}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallWithClosureExpression(SwiftParser.FunctionCallWithClosureExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscriptExpression}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscriptExpression(SwiftParser.SubscriptExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscriptExpression}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscriptExpression(SwiftParser.SubscriptExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixSelfExpression}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixSelfExpression(SwiftParser.PostfixSelfExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixSelfExpression}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixSelfExpression(SwiftParser.PostfixSelfExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionalChainingExpression}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterOptionalChainingExpression(SwiftParser.OptionalChainingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionalChainingExpression}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitOptionalChainingExpression(SwiftParser.OptionalChainingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicitMemberExpression1}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterExplicitMemberExpression1(SwiftParser.ExplicitMemberExpression1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code explicitMemberExpression1}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitExplicitMemberExpression1(SwiftParser.ExplicitMemberExpression1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code postfixOperation}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixOperation(SwiftParser.PostfixOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code postfixOperation}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixOperation(SwiftParser.PostfixOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initializerExpression}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterInitializerExpression(SwiftParser.InitializerExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initializerExpression}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitInitializerExpression(SwiftParser.InitializerExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forcedValueExpression}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterForcedValueExpression(SwiftParser.ForcedValueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forcedValueExpression}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitForcedValueExpression(SwiftParser.ForcedValueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explicitMemberExpression3}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterExplicitMemberExpression3(SwiftParser.ExplicitMemberExpression3Context ctx);
	/**
	 * Exit a parse tree produced by the {@code explicitMemberExpression3}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitExplicitMemberExpression3(SwiftParser.ExplicitMemberExpression3Context ctx);
	/**
	 * Enter a parse tree produced by the {@code explicitMemberExpression2}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterExplicitMemberExpression2(SwiftParser.ExplicitMemberExpression2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code explicitMemberExpression2}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitExplicitMemberExpression2(SwiftParser.ExplicitMemberExpression2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(SwiftParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(SwiftParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code initializerExpressionWithArguments}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterInitializerExpressionWithArguments(SwiftParser.InitializerExpressionWithArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code initializerExpressionWithArguments}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitInitializerExpressionWithArguments(SwiftParser.InitializerExpressionWithArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primary}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(SwiftParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primary}
	 * labeled alternative in {@link SwiftParser#postfixExpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(SwiftParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#functionCallArgumentClause}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallArgumentClause(SwiftParser.FunctionCallArgumentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#functionCallArgumentClause}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallArgumentClause(SwiftParser.FunctionCallArgumentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#functionCallArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallArgumentList(SwiftParser.FunctionCallArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#functionCallArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallArgumentList(SwiftParser.FunctionCallArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#functionCallArgument}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallArgument(SwiftParser.FunctionCallArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#functionCallArgument}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallArgument(SwiftParser.FunctionCallArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#functionCallIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallIdentifier(SwiftParser.FunctionCallIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#functionCallIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallIdentifier(SwiftParser.FunctionCallIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#argumentNames}.
	 * @param ctx the parse tree
	 */
	void enterArgumentNames(SwiftParser.ArgumentNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#argumentNames}.
	 * @param ctx the parse tree
	 */
	void exitArgumentNames(SwiftParser.ArgumentNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#argumentName}.
	 * @param ctx the parse tree
	 */
	void enterArgumentName(SwiftParser.ArgumentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#argumentName}.
	 * @param ctx the parse tree
	 */
	void exitArgumentName(SwiftParser.ArgumentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#operatorHead}.
	 * @param ctx the parse tree
	 */
	void enterOperatorHead(SwiftParser.OperatorHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#operatorHead}.
	 * @param ctx the parse tree
	 */
	void exitOperatorHead(SwiftParser.OperatorHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#operatorCharacter}.
	 * @param ctx the parse tree
	 */
	void enterOperatorCharacter(SwiftParser.OperatorCharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#operatorCharacter}.
	 * @param ctx the parse tree
	 */
	void exitOperatorCharacter(SwiftParser.OperatorCharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(SwiftParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(SwiftParser.OperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOperator(SwiftParser.BinaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#binaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOperator(SwiftParser.BinaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void enterPrefixOperator(SwiftParser.PrefixOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#prefixOperator}.
	 * @param ctx the parse tree
	 */
	void exitPrefixOperator(SwiftParser.PrefixOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#postfixOperator}.
	 * @param ctx the parse tree
	 */
	void enterPostfixOperator(SwiftParser.PostfixOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#postfixOperator}.
	 * @param ctx the parse tree
	 */
	void exitPostfixOperator(SwiftParser.PostfixOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#sType}.
	 * @param ctx the parse tree
	 */
	void enterSType(SwiftParser.STypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#sType}.
	 * @param ctx the parse tree
	 */
	void exitSType(SwiftParser.STypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(SwiftParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(SwiftParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#functionTypeArgumentClause}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeArgumentClause(SwiftParser.FunctionTypeArgumentClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#functionTypeArgumentClause}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeArgumentClause(SwiftParser.FunctionTypeArgumentClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#functionTypeArgumentList}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeArgumentList(SwiftParser.FunctionTypeArgumentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#functionTypeArgumentList}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeArgumentList(SwiftParser.FunctionTypeArgumentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#functionTypeArgument}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTypeArgument(SwiftParser.FunctionTypeArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#functionTypeArgument}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTypeArgument(SwiftParser.FunctionTypeArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#argumentLabel}.
	 * @param ctx the parse tree
	 */
	void enterArgumentLabel(SwiftParser.ArgumentLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#argumentLabel}.
	 * @param ctx the parse tree
	 */
	void exitArgumentLabel(SwiftParser.ArgumentLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(SwiftParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(SwiftParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#dictionaryType}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryType(SwiftParser.DictionaryTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#dictionaryType}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryType(SwiftParser.DictionaryTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#optionalType}.
	 * @param ctx the parse tree
	 */
	void enterOptionalType(SwiftParser.OptionalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#optionalType}.
	 * @param ctx the parse tree
	 */
	void exitOptionalType(SwiftParser.OptionalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#implicitlyUnwrappedOptionalType}.
	 * @param ctx the parse tree
	 */
	void enterImplicitlyUnwrappedOptionalType(SwiftParser.ImplicitlyUnwrappedOptionalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#implicitlyUnwrappedOptionalType}.
	 * @param ctx the parse tree
	 */
	void exitImplicitlyUnwrappedOptionalType(SwiftParser.ImplicitlyUnwrappedOptionalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void enterTypeAnnotation(SwiftParser.TypeAnnotationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#typeAnnotation}.
	 * @param ctx the parse tree
	 */
	void exitTypeAnnotation(SwiftParser.TypeAnnotationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(SwiftParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(SwiftParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#typeName}.
	 * @param ctx the parse tree
	 */
	void enterTypeName(SwiftParser.TypeNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#typeName}.
	 * @param ctx the parse tree
	 */
	void exitTypeName(SwiftParser.TypeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#tupleType}.
	 * @param ctx the parse tree
	 */
	void enterTupleType(SwiftParser.TupleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tupleType}.
	 * @param ctx the parse tree
	 */
	void exitTupleType(SwiftParser.TupleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#tupleTypeElementList}.
	 * @param ctx the parse tree
	 */
	void enterTupleTypeElementList(SwiftParser.TupleTypeElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tupleTypeElementList}.
	 * @param ctx the parse tree
	 */
	void exitTupleTypeElementList(SwiftParser.TupleTypeElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#tupleTypeElement}.
	 * @param ctx the parse tree
	 */
	void enterTupleTypeElement(SwiftParser.TupleTypeElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#tupleTypeElement}.
	 * @param ctx the parse tree
	 */
	void exitTupleTypeElement(SwiftParser.TupleTypeElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#elementName}.
	 * @param ctx the parse tree
	 */
	void enterElementName(SwiftParser.ElementNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#elementName}.
	 * @param ctx the parse tree
	 */
	void exitElementName(SwiftParser.ElementNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocolCompositionType}.
	 * @param ctx the parse tree
	 */
	void enterProtocolCompositionType(SwiftParser.ProtocolCompositionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocolCompositionType}.
	 * @param ctx the parse tree
	 */
	void exitProtocolCompositionType(SwiftParser.ProtocolCompositionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocolCompositionContinuation}.
	 * @param ctx the parse tree
	 */
	void enterProtocolCompositionContinuation(SwiftParser.ProtocolCompositionContinuationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocolCompositionContinuation}.
	 * @param ctx the parse tree
	 */
	void exitProtocolCompositionContinuation(SwiftParser.ProtocolCompositionContinuationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#protocolIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterProtocolIdentifier(SwiftParser.ProtocolIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#protocolIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitProtocolIdentifier(SwiftParser.ProtocolIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#metatypeType}.
	 * @param ctx the parse tree
	 */
	void enterMetatypeType(SwiftParser.MetatypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#metatypeType}.
	 * @param ctx the parse tree
	 */
	void exitMetatypeType(SwiftParser.MetatypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#typeInheritanceClause}.
	 * @param ctx the parse tree
	 */
	void enterTypeInheritanceClause(SwiftParser.TypeInheritanceClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#typeInheritanceClause}.
	 * @param ctx the parse tree
	 */
	void exitTypeInheritanceClause(SwiftParser.TypeInheritanceClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#typeInheritanceList}.
	 * @param ctx the parse tree
	 */
	void enterTypeInheritanceList(SwiftParser.TypeInheritanceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#typeInheritanceList}.
	 * @param ctx the parse tree
	 */
	void exitTypeInheritanceList(SwiftParser.TypeInheritanceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#classRequirement}.
	 * @param ctx the parse tree
	 */
	void enterClassRequirement(SwiftParser.ClassRequirementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#classRequirement}.
	 * @param ctx the parse tree
	 */
	void exitClassRequirement(SwiftParser.ClassRequirementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#compilerControlStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompilerControlStatement(SwiftParser.CompilerControlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#compilerControlStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompilerControlStatement(SwiftParser.CompilerControlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#conditionalCompilationBlock}.
	 * @param ctx the parse tree
	 */
	void enterConditionalCompilationBlock(SwiftParser.ConditionalCompilationBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#conditionalCompilationBlock}.
	 * @param ctx the parse tree
	 */
	void exitConditionalCompilationBlock(SwiftParser.ConditionalCompilationBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#ifDirectiveClause}.
	 * @param ctx the parse tree
	 */
	void enterIfDirectiveClause(SwiftParser.IfDirectiveClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#ifDirectiveClause}.
	 * @param ctx the parse tree
	 */
	void exitIfDirectiveClause(SwiftParser.IfDirectiveClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#elseifDirectiveClauses}.
	 * @param ctx the parse tree
	 */
	void enterElseifDirectiveClauses(SwiftParser.ElseifDirectiveClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#elseifDirectiveClauses}.
	 * @param ctx the parse tree
	 */
	void exitElseifDirectiveClauses(SwiftParser.ElseifDirectiveClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#elseifDirectiveClause}.
	 * @param ctx the parse tree
	 */
	void enterElseifDirectiveClause(SwiftParser.ElseifDirectiveClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#elseifDirectiveClause}.
	 * @param ctx the parse tree
	 */
	void exitElseifDirectiveClause(SwiftParser.ElseifDirectiveClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#elseDirectiveClause}.
	 * @param ctx the parse tree
	 */
	void enterElseDirectiveClause(SwiftParser.ElseDirectiveClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#elseDirectiveClause}.
	 * @param ctx the parse tree
	 */
	void exitElseDirectiveClause(SwiftParser.ElseDirectiveClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#compilationCondition}.
	 * @param ctx the parse tree
	 */
	void enterCompilationCondition(SwiftParser.CompilationConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#compilationCondition}.
	 * @param ctx the parse tree
	 */
	void exitCompilationCondition(SwiftParser.CompilationConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#platformCondition}.
	 * @param ctx the parse tree
	 */
	void enterPlatformCondition(SwiftParser.PlatformConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#platformCondition}.
	 * @param ctx the parse tree
	 */
	void exitPlatformCondition(SwiftParser.PlatformConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#operatingSystem}.
	 * @param ctx the parse tree
	 */
	void enterOperatingSystem(SwiftParser.OperatingSystemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#operatingSystem}.
	 * @param ctx the parse tree
	 */
	void exitOperatingSystem(SwiftParser.OperatingSystemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#architecture}.
	 * @param ctx the parse tree
	 */
	void enterArchitecture(SwiftParser.ArchitectureContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#architecture}.
	 * @param ctx the parse tree
	 */
	void exitArchitecture(SwiftParser.ArchitectureContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#swiftVersion}.
	 * @param ctx the parse tree
	 */
	void enterSwiftVersion(SwiftParser.SwiftVersionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#swiftVersion}.
	 * @param ctx the parse tree
	 */
	void exitSwiftVersion(SwiftParser.SwiftVersionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#lineControlStatement}.
	 * @param ctx the parse tree
	 */
	void enterLineControlStatement(SwiftParser.LineControlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#lineControlStatement}.
	 * @param ctx the parse tree
	 */
	void exitLineControlStatement(SwiftParser.LineControlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#lineNumber}.
	 * @param ctx the parse tree
	 */
	void enterLineNumber(SwiftParser.LineNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#lineNumber}.
	 * @param ctx the parse tree
	 */
	void exitLineNumber(SwiftParser.LineNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#fileName}.
	 * @param ctx the parse tree
	 */
	void enterFileName(SwiftParser.FileNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#fileName}.
	 * @param ctx the parse tree
	 */
	void exitFileName(SwiftParser.FileNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SwiftParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SwiftParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(SwiftParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(SwiftParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#contextSensitiveKeyword}.
	 * @param ctx the parse tree
	 */
	void enterContextSensitiveKeyword(SwiftParser.ContextSensitiveKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#contextSensitiveKeyword}.
	 * @param ctx the parse tree
	 */
	void exitContextSensitiveKeyword(SwiftParser.ContextSensitiveKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#grammarString}.
	 * @param ctx the parse tree
	 */
	void enterGrammarString(SwiftParser.GrammarStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#grammarString}.
	 * @param ctx the parse tree
	 */
	void exitGrammarString(SwiftParser.GrammarStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(SwiftParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(SwiftParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(SwiftParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(SwiftParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SwiftParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SwiftParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(SwiftParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#numericLiteral}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(SwiftParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SwiftParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(SwiftParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SwiftParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(SwiftParser.IntegerLiteralContext ctx);
}