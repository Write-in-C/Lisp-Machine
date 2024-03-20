// Generated from ./src/main/antlr4/Clojure.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ClojureParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ClojureVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ClojureParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(ClojureParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#filename}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilename(ClojureParser.FilenameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(ClojureParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(ClojureParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(ClojureParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(ClojureParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#atom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtom(ClojureParser.AtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(ClojureParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(ClojureParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#boolean}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(ClojureParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#nil}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNil(ClojureParser.NilContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHint(ClojureParser.HintContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(ClojureParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#ifBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBody(ClojureParser.IfBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#then}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThen(ClojureParser.ThenContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(ClojureParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(ClojureParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(ClojureParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#defnID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefnID(ClojureParser.DefnIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#defn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefn(ClojureParser.DefnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#idents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdents(ClojureParser.IdentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(ClojureParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClojureParser#let}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLet(ClojureParser.LetContext ctx);
}