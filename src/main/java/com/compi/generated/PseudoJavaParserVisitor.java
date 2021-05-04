// Generated from C:/Users/fran-/IdeaProjects/ProyectoCompi-Backend\PseudoJavaParser.g4 by ANTLR 4.9.1
package com.compi.generated;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PseudoJavaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PseudoJavaParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code programAST}
	 * labeled alternative in {@link PseudoJavaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgramAST(PseudoJavaParser.ProgramASTContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoJavaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PseudoJavaParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code blockAST}
	 * labeled alternative in {@link PseudoJavaParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockAST(PseudoJavaParser.BlockASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionDeclAST}
	 * labeled alternative in {@link PseudoJavaParser#function_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclAST(PseudoJavaParser.FunctionDeclASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formalParamsAST}
	 * labeled alternative in {@link PseudoJavaParser#formal_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParamsAST(PseudoJavaParser.FormalParamsASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formalParamAST}
	 * labeled alternative in {@link PseudoJavaParser#formal_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormalParamAST(PseudoJavaParser.FormalParamASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileAST}
	 * labeled alternative in {@link PseudoJavaParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileAST(PseudoJavaParser.WhileASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifAST}
	 * labeled alternative in {@link PseudoJavaParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfAST(PseudoJavaParser.IfASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnAST}
	 * labeled alternative in {@link PseudoJavaParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnAST(PseudoJavaParser.ReturnASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printAST}
	 * labeled alternative in {@link PseudoJavaParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintAST(PseudoJavaParser.PrintASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code classDeclAST}
	 * labeled alternative in {@link PseudoJavaParser#class_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclAST(PseudoJavaParser.ClassDeclASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableDeclAST}
	 * labeled alternative in {@link PseudoJavaParser#variable_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclAST(PseudoJavaParser.VariableDeclASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smpTypeAST}
	 * labeled alternative in {@link PseudoJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmpTypeAST(PseudoJavaParser.SmpTypeASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrTypeAST}
	 * labeled alternative in {@link PseudoJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrTypeAST(PseudoJavaParser.ArrTypeASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idTypeAST}
	 * labeled alternative in {@link PseudoJavaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdTypeAST(PseudoJavaParser.IdTypeASTContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoJavaParser#simple_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_type(PseudoJavaParser.Simple_typeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayTypeAST}
	 * labeled alternative in {@link PseudoJavaParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayTypeAST(PseudoJavaParser.ArrayTypeASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignmentAST}
	 * labeled alternative in {@link PseudoJavaParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentAST(PseudoJavaParser.AssignmentASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAssignmentAST}
	 * labeled alternative in {@link PseudoJavaParser#array_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAssignmentAST(PseudoJavaParser.ArrayAssignmentASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAST}
	 * labeled alternative in {@link PseudoJavaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAST(PseudoJavaParser.ExpressionASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleExpAST}
	 * labeled alternative in {@link PseudoJavaParser#simple_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpAST(PseudoJavaParser.SimpleExpASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code termAST}
	 * labeled alternative in {@link PseudoJavaParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermAST(PseudoJavaParser.TermASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code literalFactAST}
	 * labeled alternative in {@link PseudoJavaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteralFactAST(PseudoJavaParser.LiteralFactASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idFactAST}
	 * labeled alternative in {@link PseudoJavaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdFactAST(PseudoJavaParser.IdFactASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code objectFactAST}
	 * labeled alternative in {@link PseudoJavaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectFactAST(PseudoJavaParser.ObjectFactASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcCallFactAST}
	 * labeled alternative in {@link PseudoJavaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCallFactAST(PseudoJavaParser.FuncCallFactASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrLookUpFactAST}
	 * labeled alternative in {@link PseudoJavaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrLookUpFactAST(PseudoJavaParser.ArrLookUpFactASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrLengthFactAST}
	 * labeled alternative in {@link PseudoJavaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrLengthFactAST(PseudoJavaParser.ArrLengthFactASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExpFactAST}
	 * labeled alternative in {@link PseudoJavaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpFactAST(PseudoJavaParser.SubExpFactASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrAllocFactAST}
	 * labeled alternative in {@link PseudoJavaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrAllocFactAST(PseudoJavaParser.ArrAllocFactASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allocFactAST}
	 * labeled alternative in {@link PseudoJavaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocFactAST(PseudoJavaParser.AllocFactASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryFactAST}
	 * labeled alternative in {@link PseudoJavaParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryFactAST(PseudoJavaParser.UnaryFactASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryAST}
	 * labeled alternative in {@link PseudoJavaParser#unary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryAST(PseudoJavaParser.UnaryASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code allocAST}
	 * labeled alternative in {@link PseudoJavaParser#allocation_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllocAST(PseudoJavaParser.AllocASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayAllocAST}
	 * labeled alternative in {@link PseudoJavaParser#array_allocation_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayAllocAST(PseudoJavaParser.ArrayAllocASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExpAST}
	 * labeled alternative in {@link PseudoJavaParser#sub_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpAST(PseudoJavaParser.SubExpASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallAST}
	 * labeled alternative in {@link PseudoJavaParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallAST(PseudoJavaParser.FunctionCallASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code actualParamsAST}
	 * labeled alternative in {@link PseudoJavaParser#actual_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualParamsAST(PseudoJavaParser.ActualParamsASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLookupAST}
	 * labeled alternative in {@link PseudoJavaParser#array_lookup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLookupAST(PseudoJavaParser.ArrayLookupASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arrayLengthAST}
	 * labeled alternative in {@link PseudoJavaParser#array_length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayLengthAST(PseudoJavaParser.ArrayLengthASTContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoJavaParser#relational_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational_op(PseudoJavaParser.Relational_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoJavaParser#additive_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditive_op(PseudoJavaParser.Additive_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PseudoJavaParser#multiplicative_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplicative_op(PseudoJavaParser.Multiplicative_opContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intLiteralAST}
	 * labeled alternative in {@link PseudoJavaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntLiteralAST(PseudoJavaParser.IntLiteralASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realLiteralAST}
	 * labeled alternative in {@link PseudoJavaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealLiteralAST(PseudoJavaParser.RealLiteralASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code boolLiteralAST}
	 * labeled alternative in {@link PseudoJavaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolLiteralAST(PseudoJavaParser.BoolLiteralASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strLiteralAST}
	 * labeled alternative in {@link PseudoJavaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrLiteralAST(PseudoJavaParser.StrLiteralASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charLiteralAST}
	 * labeled alternative in {@link PseudoJavaParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharLiteralAST(PseudoJavaParser.CharLiteralASTContext ctx);
}