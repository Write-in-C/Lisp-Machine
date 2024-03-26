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
		NS=1, NIL=2, OP=3, CP=4, SO=5, SC=6, IF=7, DEFN=8, FN=9, CONS=10, LET=11, 
		IDENT=12, INT=13, EQ=14, LEQ=15, MUL=16, SUB=17, ADD=18, BOOLEAN=19, WHITESPACE=20, 
		INT_HINT=21, DOUBLE_HINT=22, BOOLEAN_HINT=23, FUNCTION_HINT=24, NO_HINT=25;
	public static final int
		RULE_program = 0, RULE_filename = 1, RULE_expressions = 2, RULE_expression = 3, 
		RULE_list = 4, RULE_list_elem = 5, RULE_call = 6, RULE_atom = 7, RULE_number = 8, 
		RULE_ident = 9, RULE_boolean = 10, RULE_nil = 11, RULE_hint = 12, RULE_if = 13, 
		RULE_ifBody = 14, RULE_then = 15, RULE_else = 16, RULE_parameter = 17, 
		RULE_parameters = 18, RULE_defnID = 19, RULE_defn = 20, RULE_idents = 21, 
		RULE_arguments = 22, RULE_let = 23, RULE_fn = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "filename", "expressions", "expression", "list", "list_elem", 
			"call", "atom", "number", "ident", "boolean", "nil", "hint", "if", "ifBody", 
			"then", "else", "parameter", "parameters", "defnID", "defn", "idents", 
			"arguments", "let", "fn"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'ns'", "'nil'", "'('", "')'", "'['", "']'", "'if'", "'defn'", 
			"'fn'", "'cons'", "'let'", null, null, "'='", "'<='", "'*'", "'-'", "'+'", 
			null, null, null, null, null, null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NS", "NIL", "OP", "CP", "SO", "SC", "IF", "DEFN", "FN", "CONS", 
			"LET", "IDENT", "INT", "EQ", "LEQ", "MUL", "SUB", "ADD", "BOOLEAN", "WHITESPACE", 
			"INT_HINT", "DOUBLE_HINT", "BOOLEAN_HINT", "FUNCTION_HINT", "NO_HINT"
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
			setState(50);
			filename();
			setState(51);
			expressions();
			setState(52);
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
			setState(54);
			match(OP);
			setState(55);
			match(NS);
			setState(56);
			match(IDENT);
			setState(57);
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
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 536588L) != 0)) {
				{
				{
				setState(59);
				expression();
				}
				}
				setState(64);
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
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
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
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				list();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				atom();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				if_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(69);
				defn();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(70);
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
		public List_elemContext list_elem() {
			return getRuleContext(List_elemContext.class,0);
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
			setState(73);
			match(OP);
			setState(74);
			list_elem();
			setState(75);
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
	public static class List_elemContext extends ParserRuleContext {
		public TerminalNode CONS() { return getToken(ClojureParser.CONS, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode OP() { return getToken(ClojureParser.OP, 0); }
		public List_elemContext list_elem() {
			return getRuleContext(List_elemContext.class,0);
		}
		public TerminalNode CP() { return getToken(ClojureParser.CP, 0); }
		public List_elemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list_elem; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitList_elem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final List_elemContext list_elem() throws RecognitionException {
		List_elemContext _localctx = new List_elemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_list_elem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(CONS);
			setState(78);
			expression();
			setState(84);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(79);
				expression();
				}
				break;
			case 2:
				{
				setState(80);
				match(OP);
				setState(81);
				list_elem();
				setState(82);
				match(CP);
				}
				break;
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
		enterRule(_localctx, 12, RULE_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(OP);
			setState(87);
			ident();
			setState(88);
			arguments();
			setState(89);
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
		public NilContext nil() {
			return getRuleContext(NilContext.class,0);
		}
		public BooleanContext boolean_() {
			return getRuleContext(BooleanContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public FnContext fn() {
			return getRuleContext(FnContext.class,0);
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
		enterRule(_localctx, 14, RULE_atom);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				number();
				}
				break;
			case NIL:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				nil();
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(93);
				boolean_();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 4);
				{
				setState(94);
				ident();
				}
				break;
			case OP:
				enterOuterAlt(_localctx, 5);
				{
				setState(95);
				fn();
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
		enterRule(_localctx, 16, RULE_number);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
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
		enterRule(_localctx, 18, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
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
		enterRule(_localctx, 20, RULE_boolean);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
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
		enterRule(_localctx, 22, RULE_nil);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
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
		public TerminalNode FUNCTION_HINT() { return getToken(ClojureParser.FUNCTION_HINT, 0); }
		public TerminalNode BOOLEAN_HINT() { return getToken(ClojureParser.BOOLEAN_HINT, 0); }
		public TerminalNode NO_HINT() { return getToken(ClojureParser.NO_HINT, 0); }
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
		enterRule(_localctx, 24, RULE_hint);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 65011712L) != 0)) ) {
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
		enterRule(_localctx, 26, RULE_if);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(OP);
			setState(109);
			match(IF);
			setState(110);
			ifBody();
			setState(111);
			then();
			setState(112);
			else_();
			setState(113);
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
		enterRule(_localctx, 28, RULE_ifBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
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
		enterRule(_localctx, 30, RULE_then);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
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
		enterRule(_localctx, 32, RULE_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
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
	public static class ParameterContext extends ParserRuleContext {
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public HintContext hint() {
			return getRuleContext(HintContext.class,0);
		}
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_parameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65011712L) != 0)) {
				{
				setState(121);
				hint();
				}
			}

			setState(124);
			ident();
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
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
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
		enterRule(_localctx, 36, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65015808L) != 0)) {
				{
				{
				setState(126);
				parameter();
				}
				}
				setState(131);
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
		enterRule(_localctx, 38, RULE_defnID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			ident();
			setState(134);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 65011712L) != 0)) {
				{
				setState(133);
				hint();
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
		enterRule(_localctx, 40, RULE_defn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(OP);
			setState(137);
			match(DEFN);
			setState(138);
			defnID();
			setState(139);
			match(SO);
			setState(140);
			parameters();
			setState(141);
			match(SC);
			setState(142);
			((DefnContext)_localctx).body = expressions();
			setState(143);
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
		enterRule(_localctx, 42, RULE_idents);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENT) {
				{
				{
				setState(145);
				ident();
				}
				}
				setState(150);
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
		enterRule(_localctx, 44, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 536588L) != 0)) {
				{
				{
				setState(151);
				expression();
				}
				}
				setState(156);
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
		public ExpressionContext body;
		public TerminalNode OP() { return getToken(ClojureParser.OP, 0); }
		public TerminalNode LET() { return getToken(ClojureParser.LET, 0); }
		public TerminalNode SO() { return getToken(ClojureParser.SO, 0); }
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SC() { return getToken(ClojureParser.SC, 0); }
		public TerminalNode CP() { return getToken(ClojureParser.CP, 0); }
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
		enterRule(_localctx, 46, RULE_let);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(OP);
			setState(158);
			match(LET);
			setState(159);
			match(SO);
			setState(160);
			ident();
			setState(161);
			expression();
			setState(162);
			match(SC);
			setState(163);
			((LetContext)_localctx).body = expression();
			setState(164);
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
	public static class FnContext extends ParserRuleContext {
		public ExpressionsContext body;
		public TerminalNode OP() { return getToken(ClojureParser.OP, 0); }
		public TerminalNode FN() { return getToken(ClojureParser.FN, 0); }
		public TerminalNode SO() { return getToken(ClojureParser.SO, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public TerminalNode SC() { return getToken(ClojureParser.SC, 0); }
		public TerminalNode CP() { return getToken(ClojureParser.CP, 0); }
		public ExpressionsContext expressions() {
			return getRuleContext(ExpressionsContext.class,0);
		}
		public FnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fn; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof ClojureVisitor ) return ((ClojureVisitor<? extends T>)visitor).visitFn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FnContext fn() throws RecognitionException {
		FnContext _localctx = new FnContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_fn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(OP);
			setState(167);
			match(FN);
			setState(168);
			match(SO);
			setState(169);
			parameters();
			setState(170);
			match(SC);
			setState(171);
			((FnContext)_localctx).body = expressions();
			setState(172);
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

	public static final String _serializedATN =
		"\u0004\u0001\u0019\u00af\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0005\u0002=\b"+
		"\u0002\n\u0002\f\u0002@\t\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0003\u0003H\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005U\b\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007a\b\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"+
		"\u0011\u0003\u0011{\b\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0005"+
		"\u0012\u0080\b\u0012\n\u0012\f\u0012\u0083\t\u0012\u0001\u0013\u0001\u0013"+
		"\u0003\u0013\u0087\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0005\u0015\u0093\b\u0015\n\u0015\f\u0015\u0096\t\u0015\u0001\u0016\u0005"+
		"\u0016\u0099\b\u0016\n\u0016\f\u0016\u009c\t\u0016\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0000\u0000\u0019\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.0\u0000\u0001\u0001\u0000\u0015\u0019\u00a5\u00002\u0001"+
		"\u0000\u0000\u0000\u00026\u0001\u0000\u0000\u0000\u0004>\u0001\u0000\u0000"+
		"\u0000\u0006G\u0001\u0000\u0000\u0000\bI\u0001\u0000\u0000\u0000\nM\u0001"+
		"\u0000\u0000\u0000\fV\u0001\u0000\u0000\u0000\u000e`\u0001\u0000\u0000"+
		"\u0000\u0010b\u0001\u0000\u0000\u0000\u0012d\u0001\u0000\u0000\u0000\u0014"+
		"f\u0001\u0000\u0000\u0000\u0016h\u0001\u0000\u0000\u0000\u0018j\u0001"+
		"\u0000\u0000\u0000\u001al\u0001\u0000\u0000\u0000\u001cs\u0001\u0000\u0000"+
		"\u0000\u001eu\u0001\u0000\u0000\u0000 w\u0001\u0000\u0000\u0000\"z\u0001"+
		"\u0000\u0000\u0000$\u0081\u0001\u0000\u0000\u0000&\u0084\u0001\u0000\u0000"+
		"\u0000(\u0088\u0001\u0000\u0000\u0000*\u0094\u0001\u0000\u0000\u0000,"+
		"\u009a\u0001\u0000\u0000\u0000.\u009d\u0001\u0000\u0000\u00000\u00a6\u0001"+
		"\u0000\u0000\u000023\u0003\u0002\u0001\u000034\u0003\u0004\u0002\u0000"+
		"45\u0005\u0000\u0000\u00015\u0001\u0001\u0000\u0000\u000067\u0005\u0003"+
		"\u0000\u000078\u0005\u0001\u0000\u000089\u0005\f\u0000\u00009:\u0005\u0004"+
		"\u0000\u0000:\u0003\u0001\u0000\u0000\u0000;=\u0003\u0006\u0003\u0000"+
		"<;\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?\u0005\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000AH\u0003\b\u0004\u0000BH\u0003\f\u0006\u0000CH\u0003"+
		"\u000e\u0007\u0000DH\u0003\u001a\r\u0000EH\u0003(\u0014\u0000FH\u0003"+
		".\u0017\u0000GA\u0001\u0000\u0000\u0000GB\u0001\u0000\u0000\u0000GC\u0001"+
		"\u0000\u0000\u0000GD\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GF\u0001\u0000\u0000\u0000H\u0007\u0001\u0000\u0000\u0000IJ\u0005\u0003"+
		"\u0000\u0000JK\u0003\n\u0005\u0000KL\u0005\u0004\u0000\u0000L\t\u0001"+
		"\u0000\u0000\u0000MN\u0005\n\u0000\u0000NT\u0003\u0006\u0003\u0000OU\u0003"+
		"\u0006\u0003\u0000PQ\u0005\u0003\u0000\u0000QR\u0003\n\u0005\u0000RS\u0005"+
		"\u0004\u0000\u0000SU\u0001\u0000\u0000\u0000TO\u0001\u0000\u0000\u0000"+
		"TP\u0001\u0000\u0000\u0000U\u000b\u0001\u0000\u0000\u0000VW\u0005\u0003"+
		"\u0000\u0000WX\u0003\u0012\t\u0000XY\u0003,\u0016\u0000YZ\u0005\u0004"+
		"\u0000\u0000Z\r\u0001\u0000\u0000\u0000[a\u0003\u0010\b\u0000\\a\u0003"+
		"\u0016\u000b\u0000]a\u0003\u0014\n\u0000^a\u0003\u0012\t\u0000_a\u0003"+
		"0\u0018\u0000`[\u0001\u0000\u0000\u0000`\\\u0001\u0000\u0000\u0000`]\u0001"+
		"\u0000\u0000\u0000`^\u0001\u0000\u0000\u0000`_\u0001\u0000\u0000\u0000"+
		"a\u000f\u0001\u0000\u0000\u0000bc\u0005\r\u0000\u0000c\u0011\u0001\u0000"+
		"\u0000\u0000de\u0005\f\u0000\u0000e\u0013\u0001\u0000\u0000\u0000fg\u0005"+
		"\u0013\u0000\u0000g\u0015\u0001\u0000\u0000\u0000hi\u0005\u0002\u0000"+
		"\u0000i\u0017\u0001\u0000\u0000\u0000jk\u0007\u0000\u0000\u0000k\u0019"+
		"\u0001\u0000\u0000\u0000lm\u0005\u0003\u0000\u0000mn\u0005\u0007\u0000"+
		"\u0000no\u0003\u001c\u000e\u0000op\u0003\u001e\u000f\u0000pq\u0003 \u0010"+
		"\u0000qr\u0005\u0004\u0000\u0000r\u001b\u0001\u0000\u0000\u0000st\u0003"+
		"\u0006\u0003\u0000t\u001d\u0001\u0000\u0000\u0000uv\u0003\u0006\u0003"+
		"\u0000v\u001f\u0001\u0000\u0000\u0000wx\u0003\u0006\u0003\u0000x!\u0001"+
		"\u0000\u0000\u0000y{\u0003\u0018\f\u0000zy\u0001\u0000\u0000\u0000z{\u0001"+
		"\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000|}\u0003\u0012\t\u0000}#\u0001"+
		"\u0000\u0000\u0000~\u0080\u0003\"\u0011\u0000\u007f~\u0001\u0000\u0000"+
		"\u0000\u0080\u0083\u0001\u0000\u0000\u0000\u0081\u007f\u0001\u0000\u0000"+
		"\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082%\u0001\u0000\u0000\u0000"+
		"\u0083\u0081\u0001\u0000\u0000\u0000\u0084\u0086\u0003\u0012\t\u0000\u0085"+
		"\u0087\u0003\u0018\f\u0000\u0086\u0085\u0001\u0000\u0000\u0000\u0086\u0087"+
		"\u0001\u0000\u0000\u0000\u0087\'\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		"\u0003\u0000\u0000\u0089\u008a\u0005\b\u0000\u0000\u008a\u008b\u0003&"+
		"\u0013\u0000\u008b\u008c\u0005\u0005\u0000\u0000\u008c\u008d\u0003$\u0012"+
		"\u0000\u008d\u008e\u0005\u0006\u0000\u0000\u008e\u008f\u0003\u0004\u0002"+
		"\u0000\u008f\u0090\u0005\u0004\u0000\u0000\u0090)\u0001\u0000\u0000\u0000"+
		"\u0091\u0093\u0003\u0012\t\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093"+
		"\u0096\u0001\u0000\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094"+
		"\u0095\u0001\u0000\u0000\u0000\u0095+\u0001\u0000\u0000\u0000\u0096\u0094"+
		"\u0001\u0000\u0000\u0000\u0097\u0099\u0003\u0006\u0003\u0000\u0098\u0097"+
		"\u0001\u0000\u0000\u0000\u0099\u009c\u0001\u0000\u0000\u0000\u009a\u0098"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b-\u0001"+
		"\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009d\u009e\u0005"+
		"\u0003\u0000\u0000\u009e\u009f\u0005\u000b\u0000\u0000\u009f\u00a0\u0005"+
		"\u0005\u0000\u0000\u00a0\u00a1\u0003\u0012\t\u0000\u00a1\u00a2\u0003\u0006"+
		"\u0003\u0000\u00a2\u00a3\u0005\u0006\u0000\u0000\u00a3\u00a4\u0003\u0006"+
		"\u0003\u0000\u00a4\u00a5\u0005\u0004\u0000\u0000\u00a5/\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a7\u0005\u0003\u0000\u0000\u00a7\u00a8\u0005\t\u0000\u0000"+
		"\u00a8\u00a9\u0005\u0005\u0000\u0000\u00a9\u00aa\u0003$\u0012\u0000\u00aa"+
		"\u00ab\u0005\u0006\u0000\u0000\u00ab\u00ac\u0003\u0004\u0002\u0000\u00ac"+
		"\u00ad\u0005\u0004\u0000\u0000\u00ad1\u0001\u0000\u0000\u0000\t>GT`z\u0081"+
		"\u0086\u0094\u009a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}