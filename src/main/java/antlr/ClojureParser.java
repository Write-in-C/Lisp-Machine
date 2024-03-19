// Generated from ./src/main/antlr4/Clojure.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class ClojureParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NS=1, OP=2, CP=3, SO=4, SC=5, IF=6, DEFN=7, LET=8, IDENT=9, INT=10, EQ=11, 
		LEQ=12, MUL=13, SUB=14, ADD=15, BOOLEAN=16, NIL=17, WHITESPACE=18, INT_HINT=19, 
		DOUBLE_HINT=20, BOOLEAN_HINT=21;
	public static final int
		RULE_program = 0, RULE_filename = 1, RULE_expressions = 2, RULE_expression = 3, 
		RULE_list = 4, RULE_call = 5, RULE_atom = 6, RULE_number = 7, RULE_ident = 8, 
		RULE_boolean = 9, RULE_nil = 10, RULE_hint = 11, RULE_if = 12, RULE_ifBody = 13, 
		RULE_then = 14, RULE_else = 15, RULE_parameters = 16, RULE_defnID = 17, 
		RULE_defn = 18, RULE_idents = 19, RULE_arguments = 20, RULE_let = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "filename", "expressions", "expression", "list", "call", "atom", 
			"number", "ident", "boolean", "nil", "hint", "if", "ifBody", "then", 
			"else", "parameters", "defnID", "defn", "idents", "arguments", "let"
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

	@Override
	public String getGrammarFileName() { return "Clojure.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public ClojureParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public FilenameContext filename() {
			return getRuleContext(FilenameContext.class,0);
		}
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode EOF() { return getToken(ClojureParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			filename();
			setState(45);
			expressions();
			setState(46);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FilenameContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(ClojureParser.OP, 0); }
		public TerminalNode NS() { return getToken(ClojureParser.NS, 0); }
		public TerminalNode IDENT() { return getToken(ClojureParser.IDENT, 0); }
		public TerminalNode CP() { return getToken(ClojureParser.CP, 0); }
		public FilenameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filename; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFilename(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilenameContext filename() throws RecognitionException {
		FilenameContext _localctx = new FilenameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_filename);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(OP);
			setState(49);
			match(NS);
			setState(50);
			match(IDENT);
			setState(51);
			match(CP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionsContext expressions() throws RecognitionException {
		ExpressionsContext _localctx = new ExpressionsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expressions);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 198404L) != 0)) {
				{
				{
				setState(53);
				expression();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public CallContext call() {
			return getRuleContext(CallContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public DefnContext defn() {
			return getRuleContext(DefnContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public LetContext let() {
			return getRuleContext(LetContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_expression);
		try {
			setState(65);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				call();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(60);
				atom();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				if_();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(62);
				defn();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				list();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				let();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ListContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(ClojureParser.OP, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public TerminalNode CP() { return getToken(ClojureParser.CP, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(OP);
			setState(68);
			expressions();
			setState(69);
			match(CP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(ClojureParser.OP, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode CP() { return getToken(ClojureParser.CP, 0); }
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(OP);
			setState(72);
			ident();
			setState(73);
			arguments();
			setState(74);
			match(CP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
		}
		public NilContext nil() {
			return getRuleContext(NilContext.class,0);
		}
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_atom);
		try {
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				number();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(77);
				ident();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(78);
				boolean_();
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 4);
				{
				setState(79);
				nil();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NumberContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(ClojureParser.INT, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(INT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(ClojureParser.IDENT, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(IDENT);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(ClojureParser.BOOLEAN, 0); }
		public BooleanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolean; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitBoolean(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanContext boolean_() throws RecognitionException {
		BooleanContext _localctx = new BooleanContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_boolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(BOOLEAN);
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

	@SuppressWarnings("CheckReturnValue")
	public static class NilContext extends ParserRuleContext {
		public TerminalNode NIL() { return getToken(ClojureParser.NIL, 0); }
		public NilContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nil; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitNil(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NilContext nil() throws RecognitionException {
		NilContext _localctx = new NilContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_nil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(NIL);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HintContext extends ParserRuleContext {
		public TerminalNode INT_HINT() { return getToken(ClojureParser.INT_HINT, 0); }
		public TerminalNode DOUBLE_HINT() { return getToken(ClojureParser.DOUBLE_HINT, 0); }
		public TerminalNode BOOLEAN_HINT() { return getToken(ClojureParser.BOOLEAN_HINT, 0); }
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_hint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(90);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public TerminalNode OP() { return getToken(ClojureParser.OP, 0); }
		public TerminalNode IF() { return getToken(ClojureParser.IF, 0); }
		public IfBodyContext ifBody() {
			return getRuleContext(IfBodyContext.class,0);
		}
		public ThenContext then() {
			return getRuleContext(ThenContext.class,0);
		}
		public ElseContext else_() {
			return getRuleContext(ElseContext.class,0);
		}
		public TerminalNode CP() { return getToken(ClojureParser.CP, 0); }
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(OP);
			setState(93);
			match(IF);
			setState(94);
			ifBody();
			setState(95);
			then();
			setState(96);
			else_();
			setState(97);
			match(CP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IfBodyContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IfBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitIfBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBodyContext ifBody() throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ThenContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ThenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_then; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitThen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ThenContext then() throws RecognitionException {
		ThenContext _localctx = new ThenContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_then);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ElseContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseContext else_() throws RecognitionException {
		ElseContext _localctx = new ElseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			expression();
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

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) {
				{
				{
				setState(105);
				hint();
				setState(106);
				ident();
				}
				}
				setState(112);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefnIDContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public HintContext hint() {
			return getRuleContext(HintContext.class,0);
		}
		public DefnIDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defnID; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitDefnID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefnIDContext defnID() throws RecognitionException {
		DefnIDContext _localctx = new DefnIDContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_defnID);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			ident();
			setState(114);
			hint();
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

	@SuppressWarnings("CheckReturnValue")
	public static class DefnContext extends ParserRuleContext {
		public ExpressionsContext body;
		public TerminalNode OP() { return getToken(ClojureParser.OP, 0); }
		public TerminalNode DEFN() { return getToken(ClojureParser.DEFN, 0); }
		public DefnIDContext defnID() {
			return getRuleContext(DefnIDContext.class,0);
		}
		public TerminalNode SO() { return getToken(ClojureParser.SO, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode SC() { return getToken(ClojureParser.SC, 0); }
		public TerminalNode CP() { return getToken(ClojureParser.CP, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public DefnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitDefn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefnContext defn() throws RecognitionException {
		DefnContext _localctx = new DefnContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_defn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(OP);
			setState(117);
			match(DEFN);
			setState(118);
			defnID();
			setState(119);
			match(SO);
			setState(120);
			parameters();
			setState(121);
			match(SC);
			setState(122);
			((DefnContext)_localctx).body = expressions();
			setState(123);
			match(CP);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdentsContext extends ParserRuleContext {
		public List<IdentContext> ident() {
			return getRuleContexts(IdentContext.class);
		}
		public IdentContext ident(int i) {
			return getRuleContext(IdentContext.class,i);
		}
		public IdentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_idents; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitIdents(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentsContext idents() throws RecognitionException {
		IdentsContext _localctx = new IdentsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_idents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(125);
				ident();
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 198404L) != 0)) {
				{
				{
				setState(131);
				expression();
				}
				}
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class LetContext extends ParserRuleContext {
		public TerminalNode LET() { return getToken(ClojureParser.LET, 0); }
		public TerminalNode SO() { return getToken(ClojureParser.SO, 0); }
		public HintContext hint() {
			return getRuleContext(HintContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SC() { return getToken(ClojureParser.SC, 0); }
		public LetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_let; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitLet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LetContext let() throws RecognitionException {
		LetContext _localctx = new LetContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(LET);
			setState(138);
			match(SO);
			setState(139);
			hint();
			setState(140);
			ident();
			setState(141);
			expression();
			setState(142);
			match(SC);
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
		"\u0004\u0001\u0015\u0091\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u00027\b"+
		"\u0002\n\u0002\f\u0002:\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003B\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006Q\b\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010m\b"+
		"\u0010\n\u0010\f\u0010p\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0005\u0013\u007f\b\u0013\n"+
		"\u0013\f\u0013\u0082\t\u0013\u0001\u0014\u0005\u0014\u0085\b\u0014\n\u0014"+
		"\f\u0014\u0088\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0000\u0000\u0016\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*\u0000\u0001\u0001\u0000\u0013\u0015\u0086\u0000,\u0001\u0000"+
		"\u0000\u0000\u00020\u0001\u0000\u0000\u0000\u00048\u0001\u0000\u0000\u0000"+
		"\u0006A\u0001\u0000\u0000\u0000\bC\u0001\u0000\u0000\u0000\nG\u0001\u0000"+
		"\u0000\u0000\fP\u0001\u0000\u0000\u0000\u000eR\u0001\u0000\u0000\u0000"+
		"\u0010T\u0001\u0000\u0000\u0000\u0012V\u0001\u0000\u0000\u0000\u0014X"+
		"\u0001\u0000\u0000\u0000\u0016Z\u0001\u0000\u0000\u0000\u0018\\\u0001"+
		"\u0000\u0000\u0000\u001ac\u0001\u0000\u0000\u0000\u001ce\u0001\u0000\u0000"+
		"\u0000\u001eg\u0001\u0000\u0000\u0000 n\u0001\u0000\u0000\u0000\"q\u0001"+
		"\u0000\u0000\u0000$t\u0001\u0000\u0000\u0000&\u0080\u0001\u0000\u0000"+
		"\u0000(\u0086\u0001\u0000\u0000\u0000*\u0089\u0001\u0000\u0000\u0000,"+
		"-\u0003\u0002\u0001\u0000-.\u0003\u0004\u0002\u0000./\u0005\u0000\u0000"+
		"\u0001/\u0001\u0001\u0000\u0000\u000001\u0005\u0002\u0000\u000012\u0005"+
		"\u0001\u0000\u000023\u0005\t\u0000\u000034\u0005\u0003\u0000\u00004\u0003"+
		"\u0001\u0000\u0000\u000057\u0003\u0006\u0003\u000065\u0001\u0000\u0000"+
		"\u00007:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000"+
		"\u0000\u00009\u0005\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000"+
		";B\u0003\n\u0005\u0000<B\u0003\f\u0006\u0000=B\u0003\u0018\f\u0000>B\u0003"+
		"$\u0012\u0000?B\u0003\b\u0004\u0000@B\u0003*\u0015\u0000A;\u0001\u0000"+
		"\u0000\u0000A<\u0001\u0000\u0000\u0000A=\u0001\u0000\u0000\u0000A>\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000\u0000\u0000"+
		"B\u0007\u0001\u0000\u0000\u0000CD\u0005\u0002\u0000\u0000DE\u0003\u0004"+
		"\u0002\u0000EF\u0005\u0003\u0000\u0000F\t\u0001\u0000\u0000\u0000GH\u0005"+
		"\u0002\u0000\u0000HI\u0003\u0010\b\u0000IJ\u0003(\u0014\u0000JK\u0005"+
		"\u0003\u0000\u0000K\u000b\u0001\u0000\u0000\u0000LQ\u0003\u000e\u0007"+
		"\u0000MQ\u0003\u0010\b\u0000NQ\u0003\u0012\t\u0000OQ\u0003\u0014\n\u0000"+
		"PL\u0001\u0000\u0000\u0000PM\u0001\u0000\u0000\u0000PN\u0001\u0000\u0000"+
		"\u0000PO\u0001\u0000\u0000\u0000Q\r\u0001\u0000\u0000\u0000RS\u0005\n"+
		"\u0000\u0000S\u000f\u0001\u0000\u0000\u0000TU\u0005\t\u0000\u0000U\u0011"+
		"\u0001\u0000\u0000\u0000VW\u0005\u0010\u0000\u0000W\u0013\u0001\u0000"+
		"\u0000\u0000XY\u0005\u0011\u0000\u0000Y\u0015\u0001\u0000\u0000\u0000"+
		"Z[\u0007\u0000\u0000\u0000[\u0017\u0001\u0000\u0000\u0000\\]\u0005\u0002"+
		"\u0000\u0000]^\u0005\u0006\u0000\u0000^_\u0003\u001a\r\u0000_`\u0003\u001c"+
		"\u000e\u0000`a\u0003\u001e\u000f\u0000ab\u0005\u0003\u0000\u0000b\u0019"+
		"\u0001\u0000\u0000\u0000cd\u0003\u0006\u0003\u0000d\u001b\u0001\u0000"+
		"\u0000\u0000ef\u0003\u0006\u0003\u0000f\u001d\u0001\u0000\u0000\u0000"+
		"gh\u0003\u0006\u0003\u0000h\u001f\u0001\u0000\u0000\u0000ij\u0003\u0016"+
		"\u000b\u0000jk\u0003\u0010\b\u0000km\u0001\u0000\u0000\u0000li\u0001\u0000"+
		"\u0000\u0000mp\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000no\u0001"+
		"\u0000\u0000\u0000o!\u0001\u0000\u0000\u0000pn\u0001\u0000\u0000\u0000"+
		"qr\u0003\u0010\b\u0000rs\u0003\u0016\u000b\u0000s#\u0001\u0000\u0000\u0000"+
		"tu\u0005\u0002\u0000\u0000uv\u0005\u0007\u0000\u0000vw\u0003\"\u0011\u0000"+
		"wx\u0005\u0004\u0000\u0000xy\u0003 \u0010\u0000yz\u0005\u0005\u0000\u0000"+
		"z{\u0003\u0004\u0002\u0000{|\u0005\u0003\u0000\u0000|%\u0001\u0000\u0000"+
		"\u0000}\u007f\u0003\u0010\b\u0000~}\u0001\u0000\u0000\u0000\u007f\u0082"+
		"\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081\u0001"+
		"\u0000\u0000\u0000\u0081\'\u0001\u0000\u0000\u0000\u0082\u0080\u0001\u0000"+
		"\u0000\u0000\u0083\u0085\u0003\u0006\u0003\u0000\u0084\u0083\u0001\u0000"+
		"\u0000\u0000\u0085\u0088\u0001\u0000\u0000\u0000\u0086\u0084\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087)\u0001\u0000\u0000"+
		"\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0089\u008a\u0005\b\u0000\u0000"+
		"\u008a\u008b\u0005\u0004\u0000\u0000\u008b\u008c\u0003\u0016\u000b\u0000"+
		"\u008c\u008d\u0003\u0010\b\u0000\u008d\u008e\u0003\u0006\u0003\u0000\u008e"+
		"\u008f\u0005\u0005\u0000\u0000\u008f+\u0001\u0000\u0000\u0000\u00068A"+
		"Pn\u0080\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}