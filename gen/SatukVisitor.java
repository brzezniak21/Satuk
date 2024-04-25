// Generated from C:/Users/Msi/Desktop/2rok - studia/testAntlr4/src/Satuk.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SatukParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SatukVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SatukParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SatukParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link SatukParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SatukParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SatukParser#assign_bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_bool(SatukParser.Assign_boolContext ctx);
	/**
	 * Visit a parse tree produced by {@link SatukParser#assign_float}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_float(SatukParser.Assign_floatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SatukParser#assign_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_string(SatukParser.Assign_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SatukParser#assign_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_char(SatukParser.Assign_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link SatukParser#assign_int}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_int(SatukParser.Assign_intContext ctx);
}