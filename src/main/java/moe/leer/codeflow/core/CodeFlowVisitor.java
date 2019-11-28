// Generated from CodeFlow.g4 by ANTLR 4.7.2

package moe.leer.codeflow.core;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CodeFlowParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CodeFlowVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#functionDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclare(CodeFlowParser.FunctionDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#functionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionBody(CodeFlowParser.FunctionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(CodeFlowParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#formalParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParams(CodeFlowParser.FormalParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#formalParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParamList(CodeFlowParser.FormalParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#formalParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParam(CodeFlowParser.FormalParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#lastFormalParam}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLastFormalParam(CodeFlowParser.LastFormalParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#variableModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableModifier(CodeFlowParser.VariableModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(CodeFlowParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#fieldDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclare(CodeFlowParser.FieldDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#constructorDeclare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstructorDeclare(CodeFlowParser.ConstructorDeclareContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#variableDeclarators}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarators(CodeFlowParser.VariableDeclaratorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#variableDeclarator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclarator(CodeFlowParser.VariableDeclaratorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#variableDeclaratorId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaratorId(CodeFlowParser.VariableDeclaratorIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#variableInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableInitializer(CodeFlowParser.VariableInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#arrayInitializer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayInitializer(CodeFlowParser.ArrayInitializerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#toplevelStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitToplevelStatement(CodeFlowParser.ToplevelStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(CodeFlowParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#blockStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatements(CodeFlowParser.BlockStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(CodeFlowParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(CodeFlowParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(CodeFlowParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#forBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForBlock(CodeFlowParser.ForBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#whileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileBlock(CodeFlowParser.WhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#doWhileBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoWhileBlock(CodeFlowParser.DoWhileBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#forExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForExpression(CodeFlowParser.ForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#enhancedForExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnhancedForExpression(CodeFlowParser.EnhancedForExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#forInit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInit(CodeFlowParser.ForInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#parExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParExpression(CodeFlowParser.ParExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#parBooleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParBooleanExpression(CodeFlowParser.ParBooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(CodeFlowParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(CodeFlowParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(CodeFlowParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#expressionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionList(CodeFlowParser.ExpressionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#typeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeList(CodeFlowParser.TypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#typeType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeType(CodeFlowParser.TypeTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#classOrInterfaceType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassOrInterfaceType(CodeFlowParser.ClassOrInterfaceTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#functionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionType(CodeFlowParser.FunctionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#typeTypeOrVoid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeTypeOrVoid(CodeFlowParser.TypeTypeOrVoidContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#primitiveType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveType(CodeFlowParser.PrimitiveTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(CodeFlowParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(CodeFlowParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(CodeFlowParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link CodeFlowParser#floatLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatLiteral(CodeFlowParser.FloatLiteralContext ctx);
}