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
		NS=1, OP=2, CP=3, SO=4, SC=5, IF=6, DEFN=7, IDENT=8, DECIMAL=9, BOOLEAN=10, 
		NIL=11, WHITESPACE=12;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NS", "OP", "CP", "SO", "SC", "IF", "DEFN", "IDENT", "DECIMAL", "BOOLEAN", 
			"NIL", "WHITESPACE", "DIGIT", "LETTER", "SYMBOLS", "ANY_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ns'", "'('", "')'", "'['", "']'", "'if'", "'defn'", null, null, 
			null, "'nil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NS", "OP", "CP", "SO", "SC", "IF", "DEFN", "IDENT", "DECIMAL", 
			"BOOLEAN", "NIL", "WHITESPACE"
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
		"\u0004\u0000\f`\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u00079\b\u0007\n\u0007\f\u0007<\t\u0007\u0001\b\u0004\b?"+
		"\b\b\u000b\b\f\b@\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\tL\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\u000b\u0004\u000bS\b\u000b\u000b\u000b\f\u000bT\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0000\u0000\u0010\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\u0000\u001b\u0000\u001d\u0000\u001f\u0000\u0001\u0000\u0004\u0003"+
		"\u0000\t\n\r\r  \u0001\u000009\u0002\u0000AZaz\u0002\u0000--__a\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0001!\u0001"+
		"\u0000\u0000\u0000\u0003$\u0001\u0000\u0000\u0000\u0005&\u0001\u0000\u0000"+
		"\u0000\u0007(\u0001\u0000\u0000\u0000\t*\u0001\u0000\u0000\u0000\u000b"+
		",\u0001\u0000\u0000\u0000\r/\u0001\u0000\u0000\u0000\u000f4\u0001\u0000"+
		"\u0000\u0000\u0011>\u0001\u0000\u0000\u0000\u0013K\u0001\u0000\u0000\u0000"+
		"\u0015M\u0001\u0000\u0000\u0000\u0017R\u0001\u0000\u0000\u0000\u0019X"+
		"\u0001\u0000\u0000\u0000\u001bZ\u0001\u0000\u0000\u0000\u001d\\\u0001"+
		"\u0000\u0000\u0000\u001f^\u0001\u0000\u0000\u0000!\"\u0005n\u0000\u0000"+
		"\"#\u0005s\u0000\u0000#\u0002\u0001\u0000\u0000\u0000$%\u0005(\u0000\u0000"+
		"%\u0004\u0001\u0000\u0000\u0000&\'\u0005)\u0000\u0000\'\u0006\u0001\u0000"+
		"\u0000\u0000()\u0005[\u0000\u0000)\b\u0001\u0000\u0000\u0000*+\u0005]"+
		"\u0000\u0000+\n\u0001\u0000\u0000\u0000,-\u0005i\u0000\u0000-.\u0005f"+
		"\u0000\u0000.\f\u0001\u0000\u0000\u0000/0\u0005d\u0000\u000001\u0005e"+
		"\u0000\u000012\u0005f\u0000\u000023\u0005n\u0000\u00003\u000e\u0001\u0000"+
		"\u0000\u00004:\u0003\u001b\r\u000059\u0003\u0019\f\u000069\u0003\u001b"+
		"\r\u000079\u0003\u001d\u000e\u000085\u0001\u0000\u0000\u000086\u0001\u0000"+
		"\u0000\u000087\u0001\u0000\u0000\u00009<\u0001\u0000\u0000\u0000:8\u0001"+
		"\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;\u0010\u0001\u0000\u0000"+
		"\u0000<:\u0001\u0000\u0000\u0000=?\u0003\u0019\f\u0000>=\u0001\u0000\u0000"+
		"\u0000?@\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000"+
		"\u0000\u0000A\u0012\u0001\u0000\u0000\u0000BC\u0005t\u0000\u0000CD\u0005"+
		"r\u0000\u0000DE\u0005u\u0000\u0000EL\u0005e\u0000\u0000FG\u0005f\u0000"+
		"\u0000GH\u0005a\u0000\u0000HI\u0005l\u0000\u0000IJ\u0005s\u0000\u0000"+
		"JL\u0005e\u0000\u0000KB\u0001\u0000\u0000\u0000KF\u0001\u0000\u0000\u0000"+
		"L\u0014\u0001\u0000\u0000\u0000MN\u0005n\u0000\u0000NO\u0005i\u0000\u0000"+
		"OP\u0005l\u0000\u0000P\u0016\u0001\u0000\u0000\u0000QS\u0007\u0000\u0000"+
		"\u0000RQ\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TR\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0006"+
		"\u000b\u0000\u0000W\u0018\u0001\u0000\u0000\u0000XY\u0007\u0001\u0000"+
		"\u0000Y\u001a\u0001\u0000\u0000\u0000Z[\u0007\u0002\u0000\u0000[\u001c"+
		"\u0001\u0000\u0000\u0000\\]\u0007\u0003\u0000\u0000]\u001e\u0001\u0000"+
		"\u0000\u0000^_\u0005\\\u0000\u0000_ \u0001\u0000\u0000\u0000\u0006\u0000"+
		"8:@KT\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}