package Lexer_Parser;
// Generated from Gram_SIC.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Gram_SICParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Gram_SICVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Gram_SICParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(Gram_SICParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link Gram_SICParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(Gram_SICParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link Gram_SICParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(Gram_SICParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link Gram_SICParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(Gram_SICParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Gram_SICParser#instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr(Gram_SICParser.InstrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code byte_Dec}
	 * labeled alternative in {@link Gram_SICParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByte_Dec(Gram_SICParser.Byte_DecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code byte_Hex}
	 * labeled alternative in {@link Gram_SICParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitByte_Hex(Gram_SICParser.Byte_HexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code word}
	 * labeled alternative in {@link Gram_SICParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(Gram_SICParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reserve_Bytes_Dec}
	 * labeled alternative in {@link Gram_SICParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReserve_Bytes_Dec(Gram_SICParser.Reserve_Bytes_DecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reserve_Bytes_Hex}
	 * labeled alternative in {@link Gram_SICParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReserve_Bytes_Hex(Gram_SICParser.Reserve_Bytes_HexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reserve_Words_Dec}
	 * labeled alternative in {@link Gram_SICParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReserve_Words_Dec(Gram_SICParser.Reserve_Words_DecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code reserve_Words_Hex}
	 * labeled alternative in {@link Gram_SICParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReserve_Words_Hex(Gram_SICParser.Reserve_Words_HexContext ctx);
	/**
	 * Visit a parse tree produced by {@link Gram_SICParser#ending}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnding(Gram_SICParser.EndingContext ctx);
}