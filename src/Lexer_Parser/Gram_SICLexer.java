package Lexer_Parser;
// Generated from Gram_SIC.g4 by ANTLR 4.5.3
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Gram_SICLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, INSTR=11, HEX=12, DEC=13, ID=14, COMA=15, NEWLINE=16, WS=17;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "INSTR", "HEX", "DEC", "ID", "COMA", "NEWLINE", "WS"
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


	public Gram_SICLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Gram_SIC.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 16:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\23\u00b5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0099\n\f\3\r\6"+
		"\r\u009c\n\r\r\r\16\r\u009d\3\r\3\r\3\16\6\16\u00a3\n\16\r\16\16\16\u00a4"+
		"\3\17\6\17\u00a8\n\17\r\17\16\17\u00a9\3\20\3\20\3\21\5\21\u00af\n\21"+
		"\3\21\3\21\3\22\3\22\3\22\2\2\23\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23\3\2\6\4\2\62;CH\3\2\62;"+
		"\4\2\62;C\\\5\2\13\f\17\17\"\"\u00d0\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5+\3\2\2\2\7-\3\2\2"+
		"\2\t\62\3\2\2\2\13\67\3\2\2\2\r9\3\2\2\2\17;\3\2\2\2\21@\3\2\2\2\23E\3"+
		"\2\2\2\25J\3\2\2\2\27\u0098\3\2\2\2\31\u009b\3\2\2\2\33\u00a2\3\2\2\2"+
		"\35\u00a7\3\2\2\2\37\u00ab\3\2\2\2!\u00ae\3\2\2\2#\u00b2\3\2\2\2%&\7U"+
		"\2\2&\'\7V\2\2\'(\7C\2\2()\7T\2\2)*\7V\2\2*\4\3\2\2\2+,\7Z\2\2,\6\3\2"+
		"\2\2-.\7T\2\2./\7U\2\2/\60\7W\2\2\60\61\7D\2\2\61\b\3\2\2\2\62\63\7D\2"+
		"\2\63\64\7[\2\2\64\65\7V\2\2\65\66\7G\2\2\66\n\3\2\2\2\678\7E\2\28\f\3"+
		"\2\2\29:\7)\2\2:\16\3\2\2\2;<\7Y\2\2<=\7Q\2\2=>\7T\2\2>?\7F\2\2?\20\3"+
		"\2\2\2@A\7T\2\2AB\7G\2\2BC\7U\2\2CD\7D\2\2D\22\3\2\2\2EF\7T\2\2FG\7G\2"+
		"\2GH\7U\2\2HI\7Y\2\2I\24\3\2\2\2JK\7G\2\2KL\7P\2\2LM\7F\2\2M\26\3\2\2"+
		"\2NO\7C\2\2OP\7F\2\2P\u0099\7F\2\2QR\7C\2\2RS\7P\2\2S\u0099\7F\2\2TU\7"+
		"E\2\2UV\7Q\2\2VW\7O\2\2W\u0099\7R\2\2XY\7F\2\2YZ\7K\2\2Z\u0099\7X\2\2"+
		"[\u0099\7L\2\2\\]\7L\2\2]^\7G\2\2^\u0099\7S\2\2_`\7L\2\2`a\7I\2\2a\u0099"+
		"\7V\2\2bc\7L\2\2cd\7N\2\2d\u0099\7V\2\2ef\7L\2\2fg\7U\2\2gh\7W\2\2h\u0099"+
		"\7D\2\2ij\7N\2\2jk\7F\2\2k\u0099\7C\2\2lm\7N\2\2mn\7F\2\2no\7E\2\2o\u0099"+
		"\7J\2\2pq\7N\2\2qr\7F\2\2r\u0099\7N\2\2st\7N\2\2tu\7F\2\2u\u0099\7Z\2"+
		"\2vw\7O\2\2wx\7W\2\2x\u0099\7N\2\2yz\7Q\2\2z\u0099\7T\2\2{|\7T\2\2|\u0099"+
		"\7F\2\2}~\7U\2\2~\177\7V\2\2\177\u0099\7C\2\2\u0080\u0081\7U\2\2\u0081"+
		"\u0082\7V\2\2\u0082\u0083\7E\2\2\u0083\u0099\7J\2\2\u0084\u0085\7U\2\2"+
		"\u0085\u0086\7V\2\2\u0086\u0099\7N\2\2\u0087\u0088\7U\2\2\u0088\u0089"+
		"\7V\2\2\u0089\u008a\7U\2\2\u008a\u0099\7Y\2\2\u008b\u008c\7U\2\2\u008c"+
		"\u008d\7V\2\2\u008d\u0099\7Z\2\2\u008e\u008f\7U\2\2\u008f\u0090\7W\2\2"+
		"\u0090\u0099\7D\2\2\u0091\u0092\7V\2\2\u0092\u0099\7F\2\2\u0093\u0094"+
		"\7V\2\2\u0094\u0095\7K\2\2\u0095\u0099\7Z\2\2\u0096\u0097\7Y\2\2\u0097"+
		"\u0099\7F\2\2\u0098N\3\2\2\2\u0098Q\3\2\2\2\u0098T\3\2\2\2\u0098X\3\2"+
		"\2\2\u0098[\3\2\2\2\u0098\\\3\2\2\2\u0098_\3\2\2\2\u0098b\3\2\2\2\u0098"+
		"e\3\2\2\2\u0098i\3\2\2\2\u0098l\3\2\2\2\u0098p\3\2\2\2\u0098s\3\2\2\2"+
		"\u0098v\3\2\2\2\u0098y\3\2\2\2\u0098{\3\2\2\2\u0098}\3\2\2\2\u0098\u0080"+
		"\3\2\2\2\u0098\u0084\3\2\2\2\u0098\u0087\3\2\2\2\u0098\u008b\3\2\2\2\u0098"+
		"\u008e\3\2\2\2\u0098\u0091\3\2\2\2\u0098\u0093\3\2\2\2\u0098\u0096\3\2"+
		"\2\2\u0099\30\3\2\2\2\u009a\u009c\t\2\2\2\u009b\u009a\3\2\2\2\u009c\u009d"+
		"\3\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f\3\2\2\2\u009f"+
		"\u00a0\7J\2\2\u00a0\32\3\2\2\2\u00a1\u00a3\t\3\2\2\u00a2\u00a1\3\2\2\2"+
		"\u00a3\u00a4\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\34"+
		"\3\2\2\2\u00a6\u00a8\t\4\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\36\3\2\2\2\u00ab\u00ac\7.\2\2"+
		"\u00ac \3\2\2\2\u00ad\u00af\7\17\2\2\u00ae\u00ad\3\2\2\2\u00ae\u00af\3"+
		"\2\2\2\u00af\u00b0\3\2\2\2\u00b0\u00b1\7\f\2\2\u00b1\"\3\2\2\2\u00b2\u00b3"+
		"\t\5\2\2\u00b3\u00b4\b\22\2\2\u00b4$\3\2\2\2\b\2\u0098\u009d\u00a4\u00a9"+
		"\u00ae\3\3\22\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}