// Generated from ./src/main/antlr4/Clojure.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class ClojureLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NS=1, OP=2, CP=3, SO=4, SC=5, IF=6, DEFN=7, LET=8, IDENT=9, INT=10, EQ=11, 
		LEQ=12, MUL=13, SUB=14, ADD=15, BOOLEAN=16, NIL=17, WHITESPACE=18, INT_HINT=19, 
		DOUBLE_HINT=20, BOOLEAN_HINT=21;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NS", "OP", "CP", "SO", "SC", "IF", "DEFN", "LET", "IDENT", "INT", "EQ", 
			"LEQ", "MUL", "SUB", "ADD", "BOOLEAN", "NIL", "WHITESPACE", "INT_HINT", 
			"DOUBLE_HINT", "BOOLEAN_HINT", "HINT_HEAD", "DIGIT", "LETTER", "SYMBOLS", 
			"ANY_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ns'", "'('", "')'", "'['", "']'", "'if'", "'defn'", "'let'", 
			null, null, "'='", "'<='", "'*'", "'-'", "'+'", null, "'nil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NS", "OP", "CP", "SO", "SC", "IF", "DEFN", "LET", "IDENT", "INT", 
			"EQ", "LEQ", "MUL", "SUB", "ADD", "BOOLEAN", "NIL", "WHITESPACE", "INT_HINT", 
			"DOUBLE_HINT", "BOOLEAN_HINT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public ClojureLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Clojure.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0015\u00a6\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0005"+
		"\bQ\b\b\n\b\f\bT\t\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b["+
		"\b\b\u0001\t\u0004\t^\b\t\u000b\t\f\t_\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000fv\b\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011}\b\u0011"+
		"\u000b\u0011\f\u0011~\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0000\u0000\u001a\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0000-\u0000/"+
		"\u00001\u00003\u0000\u0001\u0000\u0004\u0003\u0000\t\n\r\r  \u0001\u0000"+
		"09\u0002\u0000AZaz\u0002\u0000--__\u00ab\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u00015\u0001\u0000\u0000\u0000"+
		"\u00038\u0001\u0000\u0000\u0000\u0005:\u0001\u0000\u0000\u0000\u0007<"+
		"\u0001\u0000\u0000\u0000\t>\u0001\u0000\u0000\u0000\u000b@\u0001\u0000"+
		"\u0000\u0000\rC\u0001\u0000\u0000\u0000\u000fH\u0001\u0000\u0000\u0000"+
		"\u0011Z\u0001\u0000\u0000\u0000\u0013]\u0001\u0000\u0000\u0000\u0015a"+
		"\u0001\u0000\u0000\u0000\u0017c\u0001\u0000\u0000\u0000\u0019f\u0001\u0000"+
		"\u0000\u0000\u001bh\u0001\u0000\u0000\u0000\u001dj\u0001\u0000\u0000\u0000"+
		"\u001fu\u0001\u0000\u0000\u0000!w\u0001\u0000\u0000\u0000#|\u0001\u0000"+
		"\u0000\u0000%\u0082\u0001\u0000\u0000\u0000\'\u008b\u0001\u0000\u0000"+
		"\u0000)\u0093\u0001\u0000\u0000\u0000+\u009c\u0001\u0000\u0000\u0000-"+
		"\u009e\u0001\u0000\u0000\u0000/\u00a0\u0001\u0000\u0000\u00001\u00a2\u0001"+
		"\u0000\u0000\u00003\u00a4\u0001\u0000\u0000\u000056\u0005n\u0000\u0000"+
		"67\u0005s\u0000\u00007\u0002\u0001\u0000\u0000\u000089\u0005(\u0000\u0000"+
		"9\u0004\u0001\u0000\u0000\u0000:;\u0005)\u0000\u0000;\u0006\u0001\u0000"+
		"\u0000\u0000<=\u0005[\u0000\u0000=\b\u0001\u0000\u0000\u0000>?\u0005]"+
		"\u0000\u0000?\n\u0001\u0000\u0000\u0000@A\u0005i\u0000\u0000AB\u0005f"+
		"\u0000\u0000B\f\u0001\u0000\u0000\u0000CD\u0005d\u0000\u0000DE\u0005e"+
		"\u0000\u0000EF\u0005f\u0000\u0000FG\u0005n\u0000\u0000G\u000e\u0001\u0000"+
		"\u0000\u0000HI\u0005l\u0000\u0000IJ\u0005e\u0000\u0000JK\u0005t\u0000"+
		"\u0000K\u0010\u0001\u0000\u0000\u0000LR\u0003/\u0017\u0000MQ\u0003-\u0016"+
		"\u0000NQ\u0003/\u0017\u0000OQ\u00031\u0018\u0000PM\u0001\u0000\u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000QT\u0001\u0000\u0000"+
		"\u0000RP\u0001\u0000\u0000\u0000RS\u0001\u0000\u0000\u0000S[\u0001\u0000"+
		"\u0000\u0000TR\u0001\u0000\u0000\u0000U[\u0003\u0015\n\u0000V[\u0003\u0019"+
		"\f\u0000W[\u0003\u001b\r\u0000X[\u0003\u001d\u000e\u0000Y[\u0003\u0017"+
		"\u000b\u0000ZL\u0001\u0000\u0000\u0000ZU\u0001\u0000\u0000\u0000ZV\u0001"+
		"\u0000\u0000\u0000ZW\u0001\u0000\u0000\u0000ZX\u0001\u0000\u0000\u0000"+
		"ZY\u0001\u0000\u0000\u0000[\u0012\u0001\u0000\u0000\u0000\\^\u0003-\u0016"+
		"\u0000]\\\u0001\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`\u0014\u0001\u0000\u0000\u0000"+
		"ab\u0005=\u0000\u0000b\u0016\u0001\u0000\u0000\u0000cd\u0005<\u0000\u0000"+
		"de\u0005=\u0000\u0000e\u0018\u0001\u0000\u0000\u0000fg\u0005*\u0000\u0000"+
		"g\u001a\u0001\u0000\u0000\u0000hi\u0005-\u0000\u0000i\u001c\u0001\u0000"+
		"\u0000\u0000jk\u0005+\u0000\u0000k\u001e\u0001\u0000\u0000\u0000lm\u0005"+
		"t\u0000\u0000mn\u0005r\u0000\u0000no\u0005u\u0000\u0000ov\u0005e\u0000"+
		"\u0000pq\u0005f\u0000\u0000qr\u0005a\u0000\u0000rs\u0005l\u0000\u0000"+
		"st\u0005s\u0000\u0000tv\u0005e\u0000\u0000ul\u0001\u0000\u0000\u0000u"+
		"p\u0001\u0000\u0000\u0000v \u0001\u0000\u0000\u0000wx\u0005n\u0000\u0000"+
		"xy\u0005i\u0000\u0000yz\u0005l\u0000\u0000z\"\u0001\u0000\u0000\u0000"+
		"{}\u0007\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000"+
		"\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f"+
		"\u0080\u0001\u0000\u0000\u0000\u0080\u0081\u0006\u0011\u0000\u0000\u0081"+
		"$\u0001\u0000\u0000\u0000\u0082\u0083\u0003+\u0015\u0000\u0083\u0084\u0005"+
		"I\u0000\u0000\u0084\u0085\u0005n\u0000\u0000\u0085\u0086\u0005t\u0000"+
		"\u0000\u0086\u0087\u0005e\u0000\u0000\u0087\u0088\u0005g\u0000\u0000\u0088"+
		"\u0089\u0005e\u0000\u0000\u0089\u008a\u0005r\u0000\u0000\u008a&\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0003+\u0015\u0000\u008c\u008d\u0005d\u0000"+
		"\u0000\u008d\u008e\u0005o\u0000\u0000\u008e\u008f\u0005u\u0000\u0000\u008f"+
		"\u0090\u0005b\u0000\u0000\u0090\u0091\u0005l\u0000\u0000\u0091\u0092\u0005"+
		"e\u0000\u0000\u0092(\u0001\u0000\u0000\u0000\u0093\u0094\u0003+\u0015"+
		"\u0000\u0094\u0095\u0005B\u0000\u0000\u0095\u0096\u0005o\u0000\u0000\u0096"+
		"\u0097\u0005o\u0000\u0000\u0097\u0098\u0005l\u0000\u0000\u0098\u0099\u0005"+
		"e\u0000\u0000\u0099\u009a\u0005a\u0000\u0000\u009a\u009b\u0005n\u0000"+
		"\u0000\u009b*\u0001\u0000\u0000\u0000\u009c\u009d\u0005^\u0000\u0000\u009d"+
		",\u0001\u0000\u0000\u0000\u009e\u009f\u0007\u0001\u0000\u0000\u009f.\u0001"+
		"\u0000\u0000\u0000\u00a0\u00a1\u0007\u0002\u0000\u0000\u00a10\u0001\u0000"+
		"\u0000\u0000\u00a2\u00a3\u0007\u0003\u0000\u0000\u00a32\u0001\u0000\u0000"+
		"\u0000\u00a4\u00a5\u0005\\\u0000\u0000\u00a54\u0001\u0000\u0000\u0000"+
		"\u0007\u0000PRZ_u~\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}