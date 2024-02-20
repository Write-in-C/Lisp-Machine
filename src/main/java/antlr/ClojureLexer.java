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
		NS=1, OP=2, CP=3, SO=4, SC=5, IF=6, DEFN=7, IDENT=8, DECIMAL=9, EQ=10, 
		MUL=11, SUB=12, BOOLEAN=13, NIL=14, WHITESPACE=15;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NS", "OP", "CP", "SO", "SC", "IF", "DEFN", "IDENT", "DECIMAL", "EQ", 
			"MUL", "SUB", "BOOLEAN", "NIL", "WHITESPACE", "DIGIT", "LETTER", "SYMBOLS", 
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
			null, "NS", "OP", "CP", "SO", "SC", "IF", "DEFN", "IDENT", "DECIMAL", 
			"EQ", "MUL", "SUB", "BOOLEAN", "NIL", "WHITESPACE"
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


	  MakeGenerator gen;
	  public MakeParser(TokenStream input, MakeGenerator gen) {
	  super(input);
	  this.gen = gen;
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
		"\u0004\u0000\u000fl\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0005\u0007?\b\u0007\n\u0007\f\u0007B\t\u0007\u0001\b\u0004\bE"+
		"\b\b\u000b\b\f\bF\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0003\fX\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0004\u000e"+
		"_\b\u000e\u000b\u000e\f\u000e`\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0000\u0000\u0013\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004"+
		"\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017"+
		"\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0000!\u0000#\u0000%\u0000\u0001"+
		"\u0000\u0004\u0003\u0000\t\n\r\r  \u0001\u000009\u0002\u0000AZaz\u0002"+
		"\u0000--__m\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000"+
		"\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000"+
		"\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000"+
		"\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000"+
		"\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000"+
		"\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000"+
		"\u0000\u001d\u0001\u0000\u0000\u0000\u0001\'\u0001\u0000\u0000\u0000\u0003"+
		"*\u0001\u0000\u0000\u0000\u0005,\u0001\u0000\u0000\u0000\u0007.\u0001"+
		"\u0000\u0000\u0000\t0\u0001\u0000\u0000\u0000\u000b2\u0001\u0000\u0000"+
		"\u0000\r5\u0001\u0000\u0000\u0000\u000f:\u0001\u0000\u0000\u0000\u0011"+
		"D\u0001\u0000\u0000\u0000\u0013H\u0001\u0000\u0000\u0000\u0015J\u0001"+
		"\u0000\u0000\u0000\u0017L\u0001\u0000\u0000\u0000\u0019W\u0001\u0000\u0000"+
		"\u0000\u001bY\u0001\u0000\u0000\u0000\u001d^\u0001\u0000\u0000\u0000\u001f"+
		"d\u0001\u0000\u0000\u0000!f\u0001\u0000\u0000\u0000#h\u0001\u0000\u0000"+
		"\u0000%j\u0001\u0000\u0000\u0000\'(\u0005n\u0000\u0000()\u0005s\u0000"+
		"\u0000)\u0002\u0001\u0000\u0000\u0000*+\u0005(\u0000\u0000+\u0004\u0001"+
		"\u0000\u0000\u0000,-\u0005)\u0000\u0000-\u0006\u0001\u0000\u0000\u0000"+
		"./\u0005[\u0000\u0000/\b\u0001\u0000\u0000\u000001\u0005]\u0000\u0000"+
		"1\n\u0001\u0000\u0000\u000023\u0005i\u0000\u000034\u0005f\u0000\u0000"+
		"4\f\u0001\u0000\u0000\u000056\u0005d\u0000\u000067\u0005e\u0000\u0000"+
		"78\u0005f\u0000\u000089\u0005n\u0000\u00009\u000e\u0001\u0000\u0000\u0000"+
		":@\u0003!\u0010\u0000;?\u0003\u001f\u000f\u0000<?\u0003!\u0010\u0000="+
		"?\u0003#\u0011\u0000>;\u0001\u0000\u0000\u0000><\u0001\u0000\u0000\u0000"+
		">=\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001\u0000\u0000"+
		"\u0000@A\u0001\u0000\u0000\u0000A\u0010\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000CE\u0003\u001f\u000f\u0000DC\u0001\u0000\u0000\u0000"+
		"EF\u0001\u0000\u0000\u0000FD\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000"+
		"\u0000G\u0012\u0001\u0000\u0000\u0000HI\u0005=\u0000\u0000I\u0014\u0001"+
		"\u0000\u0000\u0000JK\u0005*\u0000\u0000K\u0016\u0001\u0000\u0000\u0000"+
		"LM\u0005-\u0000\u0000M\u0018\u0001\u0000\u0000\u0000NO\u0005t\u0000\u0000"+
		"OP\u0005r\u0000\u0000PQ\u0005u\u0000\u0000QX\u0005e\u0000\u0000RS\u0005"+
		"f\u0000\u0000ST\u0005a\u0000\u0000TU\u0005l\u0000\u0000UV\u0005s\u0000"+
		"\u0000VX\u0005e\u0000\u0000WN\u0001\u0000\u0000\u0000WR\u0001\u0000\u0000"+
		"\u0000X\u001a\u0001\u0000\u0000\u0000YZ\u0005n\u0000\u0000Z[\u0005i\u0000"+
		"\u0000[\\\u0005l\u0000\u0000\\\u001c\u0001\u0000\u0000\u0000]_\u0007\u0000"+
		"\u0000\u0000^]\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000"+
		"bc\u0006\u000e\u0000\u0000c\u001e\u0001\u0000\u0000\u0000de\u0007\u0001"+
		"\u0000\u0000e \u0001\u0000\u0000\u0000fg\u0007\u0002\u0000\u0000g\"\u0001"+
		"\u0000\u0000\u0000hi\u0007\u0003\u0000\u0000i$\u0001\u0000\u0000\u0000"+
		"jk\u0005\\\u0000\u0000k&\u0001\u0000\u0000\u0000\u0006\u0000>@FW`\u0001"+
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