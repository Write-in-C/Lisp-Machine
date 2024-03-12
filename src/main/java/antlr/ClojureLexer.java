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
		NS=1, OP=2, CP=3, SO=4, SC=5, IF=6, DEFN=7, IDENT=8, INT=9, EQ=10, MUL=11, 
		SUB=12, ADD=13, BOOLEAN=14, NIL=15, WHITESPACE=16, INT_HINT=17, DOUBLE_HINT=18, 
		BOOLEAN_HINT=19;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NS", "OP", "CP", "SO", "SC", "IF", "DEFN", "IDENT", "INT", "EQ", "MUL", 
			"SUB", "ADD", "BOOLEAN", "NIL", "WHITESPACE", "INT_HINT", "DOUBLE_HINT", 
			"BOOLEAN_HINT", "HINT_HEAD", "DIGIT", "LETTER", "SYMBOLS", "ANY_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ns'", "'('", "')'", "'['", "']'", "'if'", "'defn'", null, null, 
			"'='", "'*'", "'-'", "'+'", null, "'nil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NS", "OP", "CP", "SO", "SC", "IF", "DEFN", "IDENT", "INT", "EQ", 
			"MUL", "SUB", "ADD", "BOOLEAN", "NIL", "WHITESPACE", "INT_HINT", "DOUBLE_HINT", 
			"BOOLEAN_HINT"
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
		"\u0004\u0000\u0013\u009a\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007"+
		"I\b\u0007\n\u0007\f\u0007L\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007R\b\u0007\u0001\b\u0004\bU\b\b\u000b\b\f\bV\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\rj\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0004"+
		"\u000fq\b\u000f\u000b\u000f\f\u000fr\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0000\u0000"+
		"\u0018\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006"+
		"\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e"+
		"\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0000)\u0000+\u0000-\u0000"+
		"/\u0000\u0001\u0000\u0004\u0003\u0000\t\n\r\r  \u0001\u000009\u0002\u0000"+
		"AZaz\u0002\u0000--__\u009e\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u00011\u0001\u0000\u0000\u0000\u00034"+
		"\u0001\u0000\u0000\u0000\u00056\u0001\u0000\u0000\u0000\u00078\u0001\u0000"+
		"\u0000\u0000\t:\u0001\u0000\u0000\u0000\u000b<\u0001\u0000\u0000\u0000"+
		"\r?\u0001\u0000\u0000\u0000\u000fQ\u0001\u0000\u0000\u0000\u0011T\u0001"+
		"\u0000\u0000\u0000\u0013X\u0001\u0000\u0000\u0000\u0015Z\u0001\u0000\u0000"+
		"\u0000\u0017\\\u0001\u0000\u0000\u0000\u0019^\u0001\u0000\u0000\u0000"+
		"\u001bi\u0001\u0000\u0000\u0000\u001dk\u0001\u0000\u0000\u0000\u001fp"+
		"\u0001\u0000\u0000\u0000!v\u0001\u0000\u0000\u0000#\u007f\u0001\u0000"+
		"\u0000\u0000%\u0087\u0001\u0000\u0000\u0000\'\u0090\u0001\u0000\u0000"+
		"\u0000)\u0092\u0001\u0000\u0000\u0000+\u0094\u0001\u0000\u0000\u0000-"+
		"\u0096\u0001\u0000\u0000\u0000/\u0098\u0001\u0000\u0000\u000012\u0005"+
		"n\u0000\u000023\u0005s\u0000\u00003\u0002\u0001\u0000\u0000\u000045\u0005"+
		"(\u0000\u00005\u0004\u0001\u0000\u0000\u000067\u0005)\u0000\u00007\u0006"+
		"\u0001\u0000\u0000\u000089\u0005[\u0000\u00009\b\u0001\u0000\u0000\u0000"+
		":;\u0005]\u0000\u0000;\n\u0001\u0000\u0000\u0000<=\u0005i\u0000\u0000"+
		"=>\u0005f\u0000\u0000>\f\u0001\u0000\u0000\u0000?@\u0005d\u0000\u0000"+
		"@A\u0005e\u0000\u0000AB\u0005f\u0000\u0000BC\u0005n\u0000\u0000C\u000e"+
		"\u0001\u0000\u0000\u0000DJ\u0003+\u0015\u0000EI\u0003)\u0014\u0000FI\u0003"+
		"+\u0015\u0000GI\u0003-\u0016\u0000HE\u0001\u0000\u0000\u0000HF\u0001\u0000"+
		"\u0000\u0000HG\u0001\u0000\u0000\u0000IL\u0001\u0000\u0000\u0000JH\u0001"+
		"\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KR\u0001\u0000\u0000\u0000"+
		"LJ\u0001\u0000\u0000\u0000MR\u0003\u0013\t\u0000NR\u0003\u0015\n\u0000"+
		"OR\u0003\u0017\u000b\u0000PR\u0003\u0019\f\u0000QD\u0001\u0000\u0000\u0000"+
		"QM\u0001\u0000\u0000\u0000QN\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000"+
		"\u0000QP\u0001\u0000\u0000\u0000R\u0010\u0001\u0000\u0000\u0000SU\u0003"+
		")\u0014\u0000TS\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VT\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000W\u0012\u0001\u0000\u0000"+
		"\u0000XY\u0005=\u0000\u0000Y\u0014\u0001\u0000\u0000\u0000Z[\u0005*\u0000"+
		"\u0000[\u0016\u0001\u0000\u0000\u0000\\]\u0005-\u0000\u0000]\u0018\u0001"+
		"\u0000\u0000\u0000^_\u0005+\u0000\u0000_\u001a\u0001\u0000\u0000\u0000"+
		"`a\u0005t\u0000\u0000ab\u0005r\u0000\u0000bc\u0005u\u0000\u0000cj\u0005"+
		"e\u0000\u0000de\u0005f\u0000\u0000ef\u0005a\u0000\u0000fg\u0005l\u0000"+
		"\u0000gh\u0005s\u0000\u0000hj\u0005e\u0000\u0000i`\u0001\u0000\u0000\u0000"+
		"id\u0001\u0000\u0000\u0000j\u001c\u0001\u0000\u0000\u0000kl\u0005n\u0000"+
		"\u0000lm\u0005i\u0000\u0000mn\u0005l\u0000\u0000n\u001e\u0001\u0000\u0000"+
		"\u0000oq\u0007\u0000\u0000\u0000po\u0001\u0000\u0000\u0000qr\u0001\u0000"+
		"\u0000\u0000rp\u0001\u0000\u0000\u0000rs\u0001\u0000\u0000\u0000st\u0001"+
		"\u0000\u0000\u0000tu\u0006\u000f\u0000\u0000u \u0001\u0000\u0000\u0000"+
		"vw\u0003\'\u0013\u0000wx\u0005I\u0000\u0000xy\u0005n\u0000\u0000yz\u0005"+
		"t\u0000\u0000z{\u0005e\u0000\u0000{|\u0005g\u0000\u0000|}\u0005e\u0000"+
		"\u0000}~\u0005r\u0000\u0000~\"\u0001\u0000\u0000\u0000\u007f\u0080\u0003"+
		"\'\u0013\u0000\u0080\u0081\u0005d\u0000\u0000\u0081\u0082\u0005o\u0000"+
		"\u0000\u0082\u0083\u0005u\u0000\u0000\u0083\u0084\u0005b\u0000\u0000\u0084"+
		"\u0085\u0005l\u0000\u0000\u0085\u0086\u0005e\u0000\u0000\u0086$\u0001"+
		"\u0000\u0000\u0000\u0087\u0088\u0003\'\u0013\u0000\u0088\u0089\u0005B"+
		"\u0000\u0000\u0089\u008a\u0005o\u0000\u0000\u008a\u008b\u0005o\u0000\u0000"+
		"\u008b\u008c\u0005l\u0000\u0000\u008c\u008d\u0005e\u0000\u0000\u008d\u008e"+
		"\u0005a\u0000\u0000\u008e\u008f\u0005n\u0000\u0000\u008f&\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0005^\u0000\u0000\u0091(\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0007\u0001\u0000\u0000\u0093*\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0007\u0002\u0000\u0000\u0095,\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0007\u0003\u0000\u0000\u0097.\u0001\u0000\u0000\u0000\u0098\u0099\u0005"+
		"\\\u0000\u0000\u00990\u0001\u0000\u0000\u0000\u0007\u0000HJQVir\u0001"+
		"\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}