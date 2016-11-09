package Lexer_Parser;
// Generated from Gram_SIC.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Gram_SICParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, INSTR=11, HEX=12, DEC=13, ID=14, COMA=15, NEWLINE=16, WS=17;
	public static final int
		RULE_prog = 0, RULE_start = 1, RULE_body = 2, RULE_stat = 3, RULE_instr = 4, 
		RULE_directive = 5, RULE_ending = 6;
	public static final String[] ruleNames = {
		"prog", "start", "body", "stat", "instr", "directive", "ending"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'START'", "'X'", "'RSUB'", "'BYTE'", "'C'", "'''", "'WORD'", "'RESB'", 
		"'RESW'", "'END'", null, null, null, null, "','"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "INSTR", 
		"HEX", "DEC", "ID", "COMA", "NEWLINE", "WS"
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
	public String getGrammarFileName() { return "Gram_SIC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Gram_SICParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public StartContext start() {
			return getRuleContext(StartContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Gram_SICParser.NEWLINE, 0); }
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Gram_SICVisitor ) return ((Gram_SICVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(14);
			start();
			setState(15);
			match(NEWLINE);
			setState(16);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Gram_SICParser.ID, 0); }
		public TerminalNode HEX() { return getToken(Gram_SICParser.HEX, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Gram_SICVisitor ) return ((Gram_SICVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			match(ID);
			setState(19);
			match(T__0);
			setState(20);
			match(HEX);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public EndingContext ending() {
			return getRuleContext(EndingContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Gram_SICVisitor ) return ((Gram_SICVisitor<? extends T>)visitor).visitBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(22);
				stat();
				}
				}
				setState(25); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << INSTR) | (1L << ID))) != 0) );
			setState(27);
			ending();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(Gram_SICParser.NEWLINE, 0); }
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Gram_SICVisitor ) return ((Gram_SICVisitor<? extends T>)visitor).visitStat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			setState(35);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				instr();
				setState(30);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(32);
				directive();
				setState(33);
				match(NEWLINE);
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

	public static class InstrContext extends ParserRuleContext {
		public TerminalNode INSTR() { return getToken(Gram_SICParser.INSTR, 0); }
		public List<TerminalNode> ID() { return getTokens(Gram_SICParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Gram_SICParser.ID, i);
		}
		public TerminalNode COMA() { return getToken(Gram_SICParser.COMA, 0); }
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Gram_SICVisitor ) return ((Gram_SICVisitor<? extends T>)visitor).visitInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrContext instr() throws RecognitionException {
		InstrContext _localctx = new InstrContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_instr);
		int _la;
		try {
			setState(50);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(37);
					match(ID);
					}
				}

				setState(40);
				match(INSTR);
				setState(41);
				match(ID);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(42);
					match(ID);
					}
				}

				setState(45);
				match(INSTR);
				setState(46);
				match(ID);
				setState(47);
				match(COMA);
				setState(48);
				match(T__1);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				match(T__2);
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

	public static class DirectiveContext extends ParserRuleContext {
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
	 
		public DirectiveContext() { }
		public void copyFrom(DirectiveContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Reserve_Words_DecContext extends DirectiveContext {
		public TerminalNode ID() { return getToken(Gram_SICParser.ID, 0); }
		public TerminalNode DEC() { return getToken(Gram_SICParser.DEC, 0); }
		public Reserve_Words_DecContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Gram_SICVisitor ) return ((Gram_SICVisitor<? extends T>)visitor).visitReserve_Words_Dec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Reserve_Bytes_DecContext extends DirectiveContext {
		public TerminalNode ID() { return getToken(Gram_SICParser.ID, 0); }
		public TerminalNode DEC() { return getToken(Gram_SICParser.DEC, 0); }
		public Reserve_Bytes_DecContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Gram_SICVisitor ) return ((Gram_SICVisitor<? extends T>)visitor).visitReserve_Bytes_Dec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Byte_HexContext extends DirectiveContext {
		public TerminalNode ID() { return getToken(Gram_SICParser.ID, 0); }
		public TerminalNode HEX() { return getToken(Gram_SICParser.HEX, 0); }
		public Byte_HexContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Gram_SICVisitor ) return ((Gram_SICVisitor<? extends T>)visitor).visitByte_Hex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Byte_DecContext extends DirectiveContext {
		public List<TerminalNode> ID() { return getTokens(Gram_SICParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(Gram_SICParser.ID, i);
		}
		public Byte_DecContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Gram_SICVisitor ) return ((Gram_SICVisitor<? extends T>)visitor).visitByte_Dec(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Reserve_Words_HexContext extends DirectiveContext {
		public TerminalNode ID() { return getToken(Gram_SICParser.ID, 0); }
		public TerminalNode HEX() { return getToken(Gram_SICParser.HEX, 0); }
		public Reserve_Words_HexContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Gram_SICVisitor ) return ((Gram_SICVisitor<? extends T>)visitor).visitReserve_Words_Hex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WordContext extends DirectiveContext {
		public TerminalNode ID() { return getToken(Gram_SICParser.ID, 0); }
		public TerminalNode HEX() { return getToken(Gram_SICParser.HEX, 0); }
		public TerminalNode DEC() { return getToken(Gram_SICParser.DEC, 0); }
		public WordContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Gram_SICVisitor ) return ((Gram_SICVisitor<? extends T>)visitor).visitWord(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Reserve_Bytes_HexContext extends DirectiveContext {
		public TerminalNode ID() { return getToken(Gram_SICParser.ID, 0); }
		public TerminalNode HEX() { return getToken(Gram_SICParser.HEX, 0); }
		public Reserve_Bytes_HexContext(DirectiveContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Gram_SICVisitor ) return ((Gram_SICVisitor<? extends T>)visitor).visitReserve_Bytes_Hex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_directive);
		try {
			setState(82);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new Byte_DecContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(52);
				match(ID);
				setState(53);
				match(T__3);
				setState(54);
				match(T__4);
				setState(55);
				match(T__5);
				setState(56);
				match(ID);
				setState(57);
				match(T__5);
				}
				break;
			case 2:
				_localctx = new Byte_HexContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(58);
				match(ID);
				setState(59);
				match(T__3);
				setState(60);
				match(T__1);
				setState(61);
				match(T__5);
				setState(62);
				match(HEX);
				setState(63);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new WordContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				match(ID);
				setState(65);
				match(T__6);
				setState(66);
				match(HEX);
				}
				break;
			case 4:
				_localctx = new WordContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				match(ID);
				setState(68);
				match(T__6);
				setState(69);
				match(DEC);
				}
				break;
			case 5:
				_localctx = new Reserve_Bytes_DecContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(70);
				match(ID);
				setState(71);
				match(T__7);
				setState(72);
				match(DEC);
				}
				break;
			case 6:
				_localctx = new Reserve_Bytes_HexContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(73);
				match(ID);
				setState(74);
				match(T__7);
				setState(75);
				match(HEX);
				}
				break;
			case 7:
				_localctx = new Reserve_Words_DecContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(76);
				match(ID);
				setState(77);
				match(T__8);
				setState(78);
				match(DEC);
				}
				break;
			case 8:
				_localctx = new Reserve_Words_HexContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(79);
				match(ID);
				setState(80);
				match(T__8);
				setState(81);
				match(HEX);
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

	public static class EndingContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(Gram_SICParser.ID, 0); }
		public EndingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ending; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof Gram_SICVisitor ) return ((Gram_SICVisitor<? extends T>)visitor).visitEnding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EndingContext ending() throws RecognitionException {
		EndingContext _localctx = new EndingContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ending);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(T__9);
			setState(86);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(85);
				match(ID);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\23[\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\6\4\32\n\4\r\4\16\4\33\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5&\n"+
		"\5\3\6\5\6)\n\6\3\6\3\6\3\6\5\6.\n\6\3\6\3\6\3\6\3\6\3\6\5\6\65\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7U\n\7\3\b\3\b\5\b"+
		"Y\n\b\3\b\2\2\t\2\4\6\b\n\f\16\2\2a\2\20\3\2\2\2\4\24\3\2\2\2\6\31\3\2"+
		"\2\2\b%\3\2\2\2\n\64\3\2\2\2\fT\3\2\2\2\16V\3\2\2\2\20\21\5\4\3\2\21\22"+
		"\7\22\2\2\22\23\5\6\4\2\23\3\3\2\2\2\24\25\7\20\2\2\25\26\7\3\2\2\26\27"+
		"\7\16\2\2\27\5\3\2\2\2\30\32\5\b\5\2\31\30\3\2\2\2\32\33\3\2\2\2\33\31"+
		"\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2\2\35\36\5\16\b\2\36\7\3\2\2\2\37 \5"+
		"\n\6\2 !\7\22\2\2!&\3\2\2\2\"#\5\f\7\2#$\7\22\2\2$&\3\2\2\2%\37\3\2\2"+
		"\2%\"\3\2\2\2&\t\3\2\2\2\')\7\20\2\2(\'\3\2\2\2()\3\2\2\2)*\3\2\2\2*+"+
		"\7\r\2\2+\65\7\20\2\2,.\7\20\2\2-,\3\2\2\2-.\3\2\2\2./\3\2\2\2/\60\7\r"+
		"\2\2\60\61\7\20\2\2\61\62\7\21\2\2\62\65\7\4\2\2\63\65\7\5\2\2\64(\3\2"+
		"\2\2\64-\3\2\2\2\64\63\3\2\2\2\65\13\3\2\2\2\66\67\7\20\2\2\678\7\6\2"+
		"\289\7\7\2\29:\7\b\2\2:;\7\20\2\2;U\7\b\2\2<=\7\20\2\2=>\7\6\2\2>?\7\4"+
		"\2\2?@\7\b\2\2@A\7\16\2\2AU\7\b\2\2BC\7\20\2\2CD\7\t\2\2DU\7\16\2\2EF"+
		"\7\20\2\2FG\7\t\2\2GU\7\17\2\2HI\7\20\2\2IJ\7\n\2\2JU\7\17\2\2KL\7\20"+
		"\2\2LM\7\n\2\2MU\7\16\2\2NO\7\20\2\2OP\7\13\2\2PU\7\17\2\2QR\7\20\2\2"+
		"RS\7\13\2\2SU\7\16\2\2T\66\3\2\2\2T<\3\2\2\2TB\3\2\2\2TE\3\2\2\2TH\3\2"+
		"\2\2TK\3\2\2\2TN\3\2\2\2TQ\3\2\2\2U\r\3\2\2\2VX\7\f\2\2WY\7\20\2\2XW\3"+
		"\2\2\2XY\3\2\2\2Y\17\3\2\2\2\t\33%(-\64TX";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}