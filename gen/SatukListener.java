// Generated from C:/Users/Msi/Desktop/2rok - studia/testAntlr4/src/Satuk.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SatukParser}.
 */
public interface SatukListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SatukParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(SatukParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link SatukParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(SatukParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link SatukParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SatukParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SatukParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SatukParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SatukParser#assign_bool}.
	 * @param ctx the parse tree
	 */
	void enterAssign_bool(SatukParser.Assign_boolContext ctx);
	/**
	 * Exit a parse tree produced by {@link SatukParser#assign_bool}.
	 * @param ctx the parse tree
	 */
	void exitAssign_bool(SatukParser.Assign_boolContext ctx);
	/**
	 * Enter a parse tree produced by {@link SatukParser#assign_float}.
	 * @param ctx the parse tree
	 */
	void enterAssign_float(SatukParser.Assign_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SatukParser#assign_float}.
	 * @param ctx the parse tree
	 */
	void exitAssign_float(SatukParser.Assign_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SatukParser#assign_string}.
	 * @param ctx the parse tree
	 */
	void enterAssign_string(SatukParser.Assign_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link SatukParser#assign_string}.
	 * @param ctx the parse tree
	 */
	void exitAssign_string(SatukParser.Assign_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SatukParser#assign_char}.
	 * @param ctx the parse tree
	 */
	void enterAssign_char(SatukParser.Assign_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link SatukParser#assign_char}.
	 * @param ctx the parse tree
	 */
	void exitAssign_char(SatukParser.Assign_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link SatukParser#assign_int}.
	 * @param ctx the parse tree
	 */
	void enterAssign_int(SatukParser.Assign_intContext ctx);
	/**
	 * Exit a parse tree produced by {@link SatukParser#assign_int}.
	 * @param ctx the parse tree
	 */
	void exitAssign_int(SatukParser.Assign_intContext ctx);
}