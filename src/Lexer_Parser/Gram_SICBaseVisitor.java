package Lexer_Parser;
// Generated from Gram_SIC.g4 by ANTLR 4.5.3
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link Gram_SICVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class Gram_SICBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements Gram_SICVisitor<T> {
    static final Map<String, String> tab_Simb;    
    static {
        Map<String, String> m = new TreeMap<String,String> ();
        
        m.put("ADD", "18");
        m.put("AND", "40");
        m.put("COMP", "28");
        m.put("DIV", "24");
        m.put("J", "3c");
        m.put("JEQ", "30");
        m.put("JGT", "34");
        m.put("JLT", "38");
        m.put("JSUB", "48");
        m.put("LDA", "34");
        m.put("LDCH", "50");
        m.put("LDL", "08");
        m.put("LDX", "04");
        m.put("MUL", "20");
        m.put("OR", "44");
        m.put("RD", "D8");
        m.put("RSUB", "4C");
        m.put("STA", "0C");
        m.put("STCH", "54");
        m.put("STL", "14");
        m.put("STSW", "E8");
        m.put("STX", "10");
        m.put("SUB", "D8");
        m.put("TD", "E0");
        m.put("TIX", "2C");
        m.put("WD", "DC");
        tab_Simb = Collections.unmodifiableMap(m);
    }
    
    static final Map<String, String> ascii_code;
    static 
    {
        Map<String, String> m = new TreeMap<String,String> ();
        m.put("0", "30");
        m.put("1", "31");
        m.put("2", "32");
        m.put("3", "33");
        m.put("4", "34");
        m.put("5", "35");
        m.put("6", "36");
        m.put("7", "37");
        m.put("8", "38");
        m.put("9", "39");
        m.put("A", "41");
        m.put("B", "42");
        m.put("C", "43");
        m.put("D", "44");
        m.put("E", "45");
        m.put("F", "46");
        m.put("G", "47");
        m.put("H", "48");
        m.put("I", "49");
        m.put("J", "4A");
        m.put("K", "4B");
        m.put("L", "4C");
        m.put("M", "4D");
        m.put("N", "4E");
        m.put("O", "4F");
        m.put("P", "50");
        m.put("Q", "51");
        m.put("R", "52");
        m.put("S", "53");
        m.put("T", "54");
        m.put("U", "55");
        m.put("V", "56");
        m.put("W", "57");
        m.put("X", "58");
        m.put("Y", "59");
        m.put("Z", "5A");
        ascii_code = Collections.unmodifiableMap(m);
    }
    
    
    
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitProg(Gram_SICParser.ProgContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStart(Gram_SICParser.StartContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitBody(Gram_SICParser.BodyContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitStat(Gram_SICParser.StatContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitInstr(Gram_SICParser.InstrContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitByte_Dec(Gram_SICParser.Byte_DecContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitByte_Hex(Gram_SICParser.Byte_HexContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitWord(Gram_SICParser.WordContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitReserve_Bytes_Dec(Gram_SICParser.Reserve_Bytes_DecContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitReserve_Bytes_Hex(Gram_SICParser.Reserve_Bytes_HexContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitReserve_Words_Dec(Gram_SICParser.Reserve_Words_DecContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitReserve_Words_Hex(Gram_SICParser.Reserve_Words_HexContext ctx) { return visitChildren(ctx); }
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitEnding(Gram_SICParser.EndingContext ctx) { return visitChildren(ctx); }
}