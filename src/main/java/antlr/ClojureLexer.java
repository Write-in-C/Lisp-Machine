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
		NS=1, OP=2, CP=3, SO=4, SC=5, IF=6, DEFN=7, FN=8, LET=9, IDENT=10, INT=11, 
		EQ=12, LEQ=13, MUL=14, SUB=15, ADD=16, BOOLEAN=17, NIL=18, WHITESPACE=19, 
		INT_HINT=20, DOUBLE_HINT=21, BOOLEAN_HINT=22, NO_HINT=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"NS", "OP", "CP", "SO", "SC", "IF", "DEFN", "FN", "LET", "IDENT", "INT", 
			"EQ", "LEQ", "MUL", "SUB", "ADD", "BOOLEAN", "NIL", "WHITESPACE", "INT_HINT", 
			"DOUBLE_HINT", "BOOLEAN_HINT", "NO_HINT", "HINT_HEAD", "DIGIT", "LETTER", 
			"SYMBOLS", "ANY_CHAR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ns'", "'('", "')'", "'['", "']'", "'if'", "'defn'", "'fn'", "'let'", 
			null, null, "'='", "'<='", "'*'", "'-'", "'+'", null, "'nil'", null, 
			null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NS", "OP", "CP", "SO", "SC", "IF", "DEFN", "FN", "LET", "IDENT", 
			"INT", "EQ", "LEQ", "MUL", "SUB", "ADD", "BOOLEAN", "NIL", "WHITESPACE", 
			"INT_HINT", "DOUBLE_HINT", "BOOLEAN_HINT", "NO_HINT"
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
		"\u0004\u0000\u0017\u00af\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017"+
		"\u0002\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a"+
		"\u0002\u001b\u0007\u001b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0005"+
		"\tX\b\t\n\t\f\t[\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\tb"+
		"\b\t\u0001\n\u0004\ne\b\n\u000b\n\f\nf\u0001\u000b\u0001\u000b\u0001\f"+
		"\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010}\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0004\u0012\u0084"+
		"\b\u0012\u000b\u0012\f\u0012\u0085\u0001\u0012\u0001\u0012\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b"+
		"\u0001\u001b\u0000\u0000\u001c\u0001\u0001\u0003\u0002\u0005\u0003\u0007"+
		"\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b"+
		"\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013"+
		"\'\u0014)\u0015+\u0016-\u0017/\u00001\u00003\u00005\u00007\u0000\u0001"+
		"\u0000\u0004\u0003\u0000\t\n\r\r  \u0001\u000009\u0002\u0000AZaz\u0002"+
		"\u0000--__\u00b4\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001"+
		"\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001"+
		"\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000"+
		"\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000"+
		"\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000"+
		"\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000"+
		"\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000"+
		"\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000"+
		"\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000"+
		"%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000)\u0001"+
		"\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001\u0000\u0000"+
		"\u0000\u00019\u0001\u0000\u0000\u0000\u0003<\u0001\u0000\u0000\u0000\u0005"+
		">\u0001\u0000\u0000\u0000\u0007@\u0001\u0000\u0000\u0000\tB\u0001\u0000"+
		"\u0000\u0000\u000bD\u0001\u0000\u0000\u0000\rG\u0001\u0000\u0000\u0000"+
		"\u000fL\u0001\u0000\u0000\u0000\u0011O\u0001\u0000\u0000\u0000\u0013a"+
		"\u0001\u0000\u0000\u0000\u0015d\u0001\u0000\u0000\u0000\u0017h\u0001\u0000"+
		"\u0000\u0000\u0019j\u0001\u0000\u0000\u0000\u001bm\u0001\u0000\u0000\u0000"+
		"\u001do\u0001\u0000\u0000\u0000\u001fq\u0001\u0000\u0000\u0000!|\u0001"+
		"\u0000\u0000\u0000#~\u0001\u0000\u0000\u0000%\u0083\u0001\u0000\u0000"+
		"\u0000\'\u0089\u0001\u0000\u0000\u0000)\u0092\u0001\u0000\u0000\u0000"+
		"+\u009a\u0001\u0000\u0000\u0000-\u00a3\u0001\u0000\u0000\u0000/\u00a5"+
		"\u0001\u0000\u0000\u00001\u00a7\u0001\u0000\u0000\u00003\u00a9\u0001\u0000"+
		"\u0000\u00005\u00ab\u0001\u0000\u0000\u00007\u00ad\u0001\u0000\u0000\u0000"+
		"9:\u0005n\u0000\u0000:;\u0005s\u0000\u0000;\u0002\u0001\u0000\u0000\u0000"+
		"<=\u0005(\u0000\u0000=\u0004\u0001\u0000\u0000\u0000>?\u0005)\u0000\u0000"+
		"?\u0006\u0001\u0000\u0000\u0000@A\u0005[\u0000\u0000A\b\u0001\u0000\u0000"+
		"\u0000BC\u0005]\u0000\u0000C\n\u0001\u0000\u0000\u0000DE\u0005i\u0000"+
		"\u0000EF\u0005f\u0000\u0000F\f\u0001\u0000\u0000\u0000GH\u0005d\u0000"+
		"\u0000HI\u0005e\u0000\u0000IJ\u0005f\u0000\u0000JK\u0005n\u0000\u0000"+
		"K\u000e\u0001\u0000\u0000\u0000LM\u0005f\u0000\u0000MN\u0005n\u0000\u0000"+
		"N\u0010\u0001\u0000\u0000\u0000OP\u0005l\u0000\u0000PQ\u0005e\u0000\u0000"+
		"QR\u0005t\u0000\u0000R\u0012\u0001\u0000\u0000\u0000SY\u00033\u0019\u0000"+
		"TX\u00031\u0018\u0000UX\u00033\u0019\u0000VX\u00035\u001a\u0000WT\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WV\u0001\u0000\u0000\u0000"+
		"X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Zb\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000\\b\u0003\u0017"+
		"\u000b\u0000]b\u0003\u001b\r\u0000^b\u0003\u001d\u000e\u0000_b\u0003\u001f"+
		"\u000f\u0000`b\u0003\u0019\f\u0000aS\u0001\u0000\u0000\u0000a\\\u0001"+
		"\u0000\u0000\u0000a]\u0001\u0000\u0000\u0000a^\u0001\u0000\u0000\u0000"+
		"a_\u0001\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000b\u0014\u0001\u0000"+
		"\u0000\u0000ce\u00031\u0018\u0000dc\u0001\u0000\u0000\u0000ef\u0001\u0000"+
		"\u0000\u0000fd\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000g\u0016"+
		"\u0001\u0000\u0000\u0000hi\u0005=\u0000\u0000i\u0018\u0001\u0000\u0000"+
		"\u0000jk\u0005<\u0000\u0000kl\u0005=\u0000\u0000l\u001a\u0001\u0000\u0000"+
		"\u0000mn\u0005*\u0000\u0000n\u001c\u0001\u0000\u0000\u0000op\u0005-\u0000"+
		"\u0000p\u001e\u0001\u0000\u0000\u0000qr\u0005+\u0000\u0000r \u0001\u0000"+
		"\u0000\u0000st\u0005t\u0000\u0000tu\u0005r\u0000\u0000uv\u0005u\u0000"+
		"\u0000v}\u0005e\u0000\u0000wx\u0005f\u0000\u0000xy\u0005a\u0000\u0000"+
		"yz\u0005l\u0000\u0000z{\u0005s\u0000\u0000{}\u0005e\u0000\u0000|s\u0001"+
		"\u0000\u0000\u0000|w\u0001\u0000\u0000\u0000}\"\u0001\u0000\u0000\u0000"+
		"~\u007f\u0005n\u0000\u0000\u007f\u0080\u0005i\u0000\u0000\u0080\u0081"+
		"\u0005l\u0000\u0000\u0081$\u0001\u0000\u0000\u0000\u0082\u0084\u0007\u0000"+
		"\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u0085\u0001\u0000"+
		"\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087\u0088\u0006\u0012"+
		"\u0000\u0000\u0088&\u0001\u0000\u0000\u0000\u0089\u008a\u0003/\u0017\u0000"+
		"\u008a\u008b\u0005I\u0000\u0000\u008b\u008c\u0005n\u0000\u0000\u008c\u008d"+
		"\u0005t\u0000\u0000\u008d\u008e\u0005e\u0000\u0000\u008e\u008f\u0005g"+
		"\u0000\u0000\u008f\u0090\u0005e\u0000\u0000\u0090\u0091\u0005r\u0000\u0000"+
		"\u0091(\u0001\u0000\u0000\u0000\u0092\u0093\u0003/\u0017\u0000\u0093\u0094"+
		"\u0005d\u0000\u0000\u0094\u0095\u0005o\u0000\u0000\u0095\u0096\u0005u"+
		"\u0000\u0000\u0096\u0097\u0005b\u0000\u0000\u0097\u0098\u0005l\u0000\u0000"+
		"\u0098\u0099\u0005e\u0000\u0000\u0099*\u0001\u0000\u0000\u0000\u009a\u009b"+
		"\u0003/\u0017\u0000\u009b\u009c\u0005B\u0000\u0000\u009c\u009d\u0005o"+
		"\u0000\u0000\u009d\u009e\u0005o\u0000\u0000\u009e\u009f\u0005l\u0000\u0000"+
		"\u009f\u00a0\u0005e\u0000\u0000\u00a0\u00a1\u0005a\u0000\u0000\u00a1\u00a2"+
		"\u0005n\u0000\u0000\u00a2,\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005 "+
		"\u0000\u0000\u00a4.\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005^\u0000\u0000"+
		"\u00a60\u0001\u0000\u0000\u0000\u00a7\u00a8\u0007\u0001\u0000\u0000\u00a8"+
		"2\u0001\u0000\u0000\u0000\u00a9\u00aa\u0007\u0002\u0000\u0000\u00aa4\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0007\u0003\u0000\u0000\u00ac6\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0005\\\u0000\u0000\u00ae8\u0001\u0000\u0000"+
		"\u0000\u0007\u0000WYaf|\u0085\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}