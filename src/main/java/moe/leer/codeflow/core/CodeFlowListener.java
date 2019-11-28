// Generated from CodeFlow.g4 by ANTLR 4.7.2

package moe.leer.codeflow.core;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CodeFlowParser}.
 */
public interface CodeFlowListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#functionDeclare}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclare(CodeFlowParser.FunctionDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#functionDeclare}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclare(CodeFlowParser.FunctionDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionBody(CodeFlowParser.FunctionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#functionBody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionBody(CodeFlowParser.FunctionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(CodeFlowParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(CodeFlowParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#formalParams}.
	 * @param ctx the parse tree
	 */
	void enterFormalParams(CodeFlowParser.FormalParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#formalParams}.
	 * @param ctx the parse tree
	 */
	void exitFormalParams(CodeFlowParser.FormalParamsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#formalParamList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParamList(CodeFlowParser.FormalParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#formalParamList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParamList(CodeFlowParser.FormalParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void enterFormalParam(CodeFlowParser.FormalParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#formalParam}.
	 * @param ctx the parse tree
	 */
	void exitFormalParam(CodeFlowParser.FormalParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#lastFormalParam}.
	 * @param ctx the parse tree
	 */
	void enterLastFormalParam(CodeFlowParser.LastFormalParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#lastFormalParam}.
	 * @param ctx the parse tree
	 */
	void exitLastFormalParam(CodeFlowParser.LastFormalParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void enterVariableModifier(CodeFlowParser.VariableModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#variableModifier}.
	 * @param ctx the parse tree
	 */
	void exitVariableModifier(CodeFlowParser.VariableModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(CodeFlowParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(CodeFlowParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#fieldDeclare}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclare(CodeFlowParser.FieldDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#fieldDeclare}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclare(CodeFlowParser.FieldDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#constructorDeclare}.
	 * @param ctx the parse tree
	 */
	void enterConstructorDeclare(CodeFlowParser.ConstructorDeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#constructorDeclare}.
	 * @param ctx the parse tree
	 */
	void exitConstructorDeclare(CodeFlowParser.ConstructorDeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarators(CodeFlowParser.VariableDeclaratorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#variableDeclarators}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarators(CodeFlowParser.VariableDeclaratorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarator(CodeFlowParser.VariableDeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#variableDeclarator}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarator(CodeFlowParser.VariableDeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaratorId(CodeFlowParser.VariableDeclaratorIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaratorId(CodeFlowParser.VariableDeclaratorIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void enterVariableInitializer(CodeFlowParser.VariableInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#variableInitializer}.
	 * @param ctx the parse tree
	 */
	void exitVariableInitializer(CodeFlowParser.VariableInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void enterArrayInitializer(CodeFlowParser.ArrayInitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#arrayInitializer}.
	 * @param ctx the parse tree
	 */
	void exitArrayInitializer(CodeFlowParser.ArrayInitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#toplevelStatement}.
	 * @param ctx the parse tree
	 */
	void enterToplevelStatement(CodeFlowParser.ToplevelStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#toplevelStatement}.
	 * @param ctx the parse tree
	 */
	void exitToplevelStatement(CodeFlowParser.ToplevelStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CodeFlowParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CodeFlowParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatements(CodeFlowParser.BlockStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#blockStatements}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatements(CodeFlowParser.BlockStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(CodeFlowParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(CodeFlowParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CodeFlowParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CodeFlowParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(CodeFlowParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(CodeFlowParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void enterForBlock(CodeFlowParser.ForBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#forBlock}.
	 * @param ctx the parse tree
	 */
	void exitForBlock(CodeFlowParser.ForBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void enterWhileBlock(CodeFlowParser.WhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#whileBlock}.
	 * @param ctx the parse tree
	 */
	void exitWhileBlock(CodeFlowParser.WhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#doWhileBlock}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileBlock(CodeFlowParser.DoWhileBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#doWhileBlock}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileBlock(CodeFlowParser.DoWhileBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void enterForExpression(CodeFlowParser.ForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#forExpression}.
	 * @param ctx the parse tree
	 */
	void exitForExpression(CodeFlowParser.ForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#enhancedForExpression}.
	 * @param ctx the parse tree
	 */
	void enterEnhancedForExpression(CodeFlowParser.EnhancedForExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#enhancedForExpression}.
	 * @param ctx the parse tree
	 */
	void exitEnhancedForExpression(CodeFlowParser.EnhancedForExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#forInit}.
	 * @param ctx the parse tree
	 */
	void enterForInit(CodeFlowParser.ForInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#forInit}.
	 * @param ctx the parse tree
	 */
	void exitForInit(CodeFlowParser.ForInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void enterParExpression(CodeFlowParser.ParExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#parExpression}.
	 * @param ctx the parse tree
	 */
	void exitParExpression(CodeFlowParser.ParExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#parBooleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterParBooleanExpression(CodeFlowParser.ParBooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#parBooleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitParBooleanExpression(CodeFlowParser.ParBooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(CodeFlowParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(CodeFlowParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CodeFlowParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CodeFlowParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(CodeFlowParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(CodeFlowParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void enterExpressionList(CodeFlowParser.ExpressionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#expressionList}.
	 * @param ctx the parse tree
	 */
	void exitExpressionList(CodeFlowParser.ExpressionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(CodeFlowParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(CodeFlowParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#typeType}.
	 * @param ctx the parse tree
	 */
	void enterTypeType(CodeFlowParser.TypeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#typeType}.
	 * @param ctx the parse tree
	 */
	void exitTypeType(CodeFlowParser.TypeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void enterClassOrInterfaceType(CodeFlowParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 */
	void exitClassOrInterfaceType(CodeFlowParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(CodeFlowParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(CodeFlowParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void enterTypeTypeOrVoid(CodeFlowParser.TypeTypeOrVoidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 */
	void exitTypeTypeOrVoid(CodeFlowParser.TypeTypeOrVoidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveType(CodeFlowParser.PrimitiveTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#primitiveType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveType(CodeFlowParser.PrimitiveTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(CodeFlowParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(CodeFlowParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CodeFlowParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CodeFlowParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(CodeFlowParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(CodeFlowParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CodeFlowParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFloatLiteral(CodeFlowParser.FloatLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CodeFlowParser#floatLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFloatLiteral(CodeFlowParser.FloatLiteralContext ctx);
}