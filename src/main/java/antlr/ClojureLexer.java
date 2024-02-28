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
		SUB=12, BOOLEAN=13, NIL=14, WHITESPACE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NS", "OP", "CP", "SO", "SC", "IF", "DEFN", "IDENT", "INT", "EQ", "MUL", 
			"SUB", "BOOLEAN", "NIL", "WHITESPACE", "DIGIT", "LETTER", "SYMBOLS", 
			"ANY_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ns'", "'('", "')'", "'['", "']'", "'if'", "'defn'", null, null, 
			"'='", "'*'", "'-'", null, "'nil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NS", "OP", "CP", "SO", "SC", "IF", "DEFN", "IDENT", "INT", "EQ", 
			"MUL", "SUB", "BOOLEAN", "NIL", "WHITESPACE"
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


	//  MakeGenerator gen;
	//  public MakeParser(TokenStream input, MakeGenerator gen) {
	//  super(input);
	//  this.gen = gen;
	//  }


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
		"\u0004\u0000\u000fq\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007?\b\u0007\n\u0007\f\u0007B\t\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007G\b\u0007\u0001\b\u0004\bJ\b\b\u000b\b\f"+
		"\bK\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f]\b"+
		"\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0004\u000ed\b\u000e\u000b"+
		"\u000e\f\u000ee\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0000"+
		"\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0000!\u0000#\u0000%\u0000\u0001\u0000\u0004"+
		"\u0003\u0000\t\n\r\r  \u0001\u000009\u0002\u0000AZaz\u0002\u0000--__u"+
		"\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000"+
		"\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000"+
		"\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000"+
		"\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003*\u0001"+
		"\u0000\u0000\u0000\u0005,\u0001\u0000\u0000\u0000\u0007.\u0001\u0000\u0000"+
		"\u0000\t0\u0001\u0000\u0000\u0000\u000b2\u0001\u0000\u0000\u0000\r5\u0001"+
		"\u0000\u0000\u0000\u000fF\u0001\u0000\u0000\u0000\u0011I\u0001\u0000\u0000"+
		"\u0000\u0013M\u0001\u0000\u0000\u0000\u0015O\u0001\u0000\u0000\u0000\u0017"+
		"Q\u0001\u0000\u0000\u0000\u0019\\\u0001\u0000\u0000\u0000\u001b^\u0001"+
		"\u0000\u0000\u0000\u001dc\u0001\u0000\u0000\u0000\u001fi\u0001\u0000\u0000"+
		"\u0000!k\u0001\u0000\u0000\u0000#m\u0001\u0000\u0000\u0000%o\u0001\u0000"+
		"\u0000\u0000\'(\u0005n\u0000\u0000()\u0005s\u0000\u0000)\u0002\u0001\u0000"+
		"\u0000\u0000*+\u0005(\u0000\u0000+\u0004\u0001\u0000\u0000\u0000,-\u0005"+
		")\u0000\u0000-\u0006\u0001\u0000\u0000\u0000./\u0005[\u0000\u0000/\b\u0001"+
		"\u0000\u0000\u000001\u0005]\u0000\u00001\n\u0001\u0000\u0000\u000023\u0005"+
		"i\u0000\u000034\u0005f\u0000\u00004\f\u0001\u0000\u0000\u000056\u0005"+
		"d\u0000\u000067\u0005e\u0000\u000078\u0005f\u0000\u000089\u0005n\u0000"+
		"\u00009\u000e\u0001\u0000\u0000\u0000:@\u0003!\u0010\u0000;?\u0003\u001f"+
		"\u000f\u0000<?\u0003!\u0010\u0000=?\u0003#\u0011\u0000>;\u0001\u0000\u0000"+
		"\u0000><\u0001\u0000\u0000\u0000>=\u0001\u0000\u0000\u0000?B\u0001\u0000"+
		"\u0000\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AG\u0001"+
		"\u0000\u0000\u0000B@\u0001\u0000\u0000\u0000CG\u0003\u0013\t\u0000DG\u0003"+
		"\u0015\n\u0000EG\u0003\u0017\u000b\u0000F:\u0001\u0000\u0000\u0000FC\u0001"+
		"\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FE\u0001\u0000\u0000\u0000"+
		"G\u0010\u0001\u0000\u0000\u0000HJ\u0003\u001f\u000f\u0000IH\u0001\u0000"+
		"\u0000\u0000JK\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001"+
		"\u0000\u0000\u0000L\u0012\u0001\u0000\u0000\u0000MN\u0005=\u0000\u0000"+
		"N\u0014\u0001\u0000\u0000\u0000OP\u0005*\u0000\u0000P\u0016\u0001\u0000"+
		"\u0000\u0000QR\u0005-\u0000\u0000R\u0018\u0001\u0000\u0000\u0000ST\u0005"+
		"t\u0000\u0000TU\u0005r\u0000\u0000UV\u0005u\u0000\u0000V]\u0005e\u0000"+
		"\u0000WX\u0005f\u0000\u0000XY\u0005a\u0000\u0000YZ\u0005l\u0000\u0000"+
		"Z[\u0005s\u0000\u0000[]\u0005e\u0000\u0000\\S\u0001\u0000\u0000\u0000"+
		"\\W\u0001\u0000\u0000\u0000]\u001a\u0001\u0000\u0000\u0000^_\u0005n\u0000"+
		"\u0000_`\u0005i\u0000\u0000`a\u0005l\u0000\u0000a\u001c\u0001\u0000\u0000"+
		"\u0000bd\u0007\u0000\u0000\u0000cb\u0001\u0000\u0000\u0000de\u0001\u0000"+
		"\u0000\u0000ec\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0001"+
		"\u0000\u0000\u0000gh\u0006\u000e\u0000\u0000h\u001e\u0001\u0000\u0000"+
		"\u0000ij\u0007\u0001\u0000\u0000j \u0001\u0000\u0000\u0000kl\u0007\u0002"+
		"\u0000\u0000l\"\u0001\u0000\u0000\u0000mn\u0007\u0003\u0000\u0000n$\u0001"+
		"\u0000\u0000\u0000op\u0005\\\u0000\u0000p&\u0001\u0000\u0000\u0000\u0007"+
		"\u0000>@FK\\e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}