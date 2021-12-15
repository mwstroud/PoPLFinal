// Generated from c:\Users\Admin\Documents\courses\PoPL\Final\PoPLFinal\supercrit.g4 by ANTLR 4.8
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class supercritParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, WHITESPACE=2, NEWLINE=3, COLON=4, OPEN_PAR=5, CLOSE_PAR=6, OPEN_BRAC=7, 
		CLOSE_BRAC=8, IF=9, ELIF=10, ELSE=11, TAB=12, VAR=13, WHILE=14, FOR=15, 
		BREAK=16, CONTINUE=17, PLUS=18, MINUS=19, TIMES=20, DIV=21, MOD=22, POW=23, 
		ASSIGN=24, INCREMENT=25, DECREMENT=26, MULT_EQ=27, DIV_EQ=28, POW_EQ=29, 
		MOD_EQ=30, LESS=31, LESS_EQ=32, GREATER=33, GREATER_EQ=34, EQUAL=35, NOT_EQUAL=36, 
		AND=37, OR=38, NOT=39, COMMENT=40;
	public static final int
		RULE_start = 0, RULE_block = 1, RULE_line = 2, RULE_tab_block = 3, RULE_if_block = 4, 
		RULE_while_block = 5, RULE_for_block = 6, RULE_print = 7, RULE_statement = 8, 
		RULE_expr = 9, RULE_conditional = 10, RULE_assignment = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "block", "line", "tab_block", "if_block", "while_block", "for_block", 
			"print", "statement", "expr", "conditional", "assignment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", null, "'\n'", "':'", "'('", "')'", "'['", "']'", "'if'", 
			"'elif'", "'else'", null, null, "'while'", "'for'", "'break'", "'continue'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'='", "'+='", "'-='", "'*='", 
			"'/='", "'**='", "'%='", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", 
			"'and'", "'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "WHITESPACE", "NEWLINE", "COLON", "OPEN_PAR", "CLOSE_PAR", 
			"OPEN_BRAC", "CLOSE_BRAC", "IF", "ELIF", "ELSE", "TAB", "VAR", "WHILE", 
			"FOR", "BREAK", "CONTINUE", "PLUS", "MINUS", "TIMES", "DIV", "MOD", "POW", 
			"ASSIGN", "INCREMENT", "DECREMENT", "MULT_EQ", "DIV_EQ", "POW_EQ", "MOD_EQ", 
			"LESS", "LESS_EQ", "GREATER", "GREATER_EQ", "EQUAL", "NOT_EQUAL", "AND", 
			"OR", "NOT", "COMMENT"
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
	public String getGrammarFileName() { return "supercrit.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public supercritParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(supercritParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(24);
			block();
			setState(25);
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

	public static class BlockContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<If_blockContext> if_block() {
			return getRuleContexts(If_blockContext.class);
		}
		public If_blockContext if_block(int i) {
			return getRuleContext(If_blockContext.class,i);
		}
		public List<While_blockContext> while_block() {
			return getRuleContexts(While_blockContext.class);
		}
		public While_blockContext while_block(int i) {
			return getRuleContext(While_blockContext.class,i);
		}
		public List<For_blockContext> for_block() {
			return getRuleContexts(For_blockContext.class);
		}
		public For_blockContext for_block(int i) {
			return getRuleContext(For_blockContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			setState(51);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VAR) {
					{
					{
					setState(27);
					line();
					}
					}
					setState(32);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IF) {
					{
					{
					setState(33);
					if_block();
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHILE) {
					{
					{
					setState(39);
					while_block();
					}
					}
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FOR) {
					{
					{
					setState(45);
					for_block();
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static class LineContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(supercritParser.NEWLINE, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			assignment();
			setState(54);
			match(NEWLINE);
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

	public static class Tab_blockContext extends ParserRuleContext {
		public List<TerminalNode> TAB() { return getTokens(supercritParser.TAB); }
		public TerminalNode TAB(int i) {
			return getToken(supercritParser.TAB, i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public Tab_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab_block; }
	}

	public final Tab_blockContext tab_block() throws RecognitionException {
		Tab_blockContext _localctx = new Tab_blockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tab_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(56);
				match(TAB);
				setState(57);
				line();
				}
				}
				setState(62);
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

	public static class If_blockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(supercritParser.IF, 0); }
		public List<ConditionalContext> conditional() {
			return getRuleContexts(ConditionalContext.class);
		}
		public ConditionalContext conditional(int i) {
			return getRuleContext(ConditionalContext.class,i);
		}
		public List<TerminalNode> COLON() { return getTokens(supercritParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(supercritParser.COLON, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(supercritParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(supercritParser.NEWLINE, i);
		}
		public List<Tab_blockContext> tab_block() {
			return getRuleContexts(Tab_blockContext.class);
		}
		public Tab_blockContext tab_block(int i) {
			return getRuleContext(Tab_blockContext.class,i);
		}
		public List<TerminalNode> OPEN_PAR() { return getTokens(supercritParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(supercritParser.OPEN_PAR, i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(supercritParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(supercritParser.CLOSE_PAR, i);
		}
		public List<TerminalNode> ELIF() { return getTokens(supercritParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(supercritParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(supercritParser.ELSE, 0); }
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(IF);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(64);
				match(OPEN_PAR);
				}
			}

			setState(67);
			conditional();
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_PAR) {
				{
				setState(68);
				match(CLOSE_PAR);
				}
			}

			setState(71);
			match(COLON);
			setState(72);
			match(NEWLINE);
			setState(73);
			tab_block();
			setState(88);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(74);
				match(ELIF);
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR) {
					{
					setState(75);
					match(OPEN_PAR);
					}
				}

				setState(78);
				conditional();
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAR) {
					{
					setState(79);
					match(CLOSE_PAR);
					}
				}

				setState(82);
				match(COLON);
				setState(83);
				match(NEWLINE);
				setState(84);
				tab_block();
				}
				}
				setState(90);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(91);
				match(ELSE);
				setState(92);
				match(COLON);
				setState(93);
				match(NEWLINE);
				setState(94);
				tab_block();
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

	public static class While_blockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(supercritParser.WHILE, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode COLON() { return getToken(supercritParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(supercritParser.NEWLINE, 0); }
		public Tab_blockContext tab_block() {
			return getRuleContext(Tab_blockContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(supercritParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(supercritParser.CLOSE_PAR, 0); }
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(WHILE);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(98);
				match(OPEN_PAR);
				}
			}

			setState(101);
			conditional();
			setState(103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_PAR) {
				{
				setState(102);
				match(CLOSE_PAR);
				}
			}

			setState(105);
			match(COLON);
			setState(106);
			match(NEWLINE);
			setState(107);
			tab_block();
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

	public static class For_blockContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(supercritParser.FOR, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode COLON() { return getToken(supercritParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(supercritParser.NEWLINE, 0); }
		public Tab_blockContext tab_block() {
			return getRuleContext(Tab_blockContext.class,0);
		}
		public TerminalNode OPEN_PAR() { return getToken(supercritParser.OPEN_PAR, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(supercritParser.CLOSE_PAR, 0); }
		public For_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_block; }
	}

	public final For_blockContext for_block() throws RecognitionException {
		For_blockContext _localctx = new For_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(FOR);
			setState(111);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(110);
				match(OPEN_PAR);
				}
			}

			setState(113);
			conditional();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_PAR) {
				{
				setState(114);
				match(CLOSE_PAR);
				}
			}

			setState(117);
			match(COLON);
			setState(118);
			match(NEWLINE);
			setState(119);
			tab_block();
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

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(supercritParser.OPEN_PAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(supercritParser.CLOSE_PAR, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__0);
			setState(122);
			match(OPEN_PAR);
			setState(123);
			expr(0);
			setState(124);
			match(CLOSE_PAR);
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

	public static class StatementContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(129);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				conditional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				assignment();
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode MINUS() { return getToken(supercritParser.MINUS, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(supercritParser.POW, 0); }
		public TerminalNode TIMES() { return getToken(supercritParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(supercritParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(supercritParser.PLUS, 0); }
		public TerminalNode MOD() { return getToken(supercritParser.MOD, 0); }
		public TerminalNode EQUAL() { return getToken(supercritParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(supercritParser.NOT_EQUAL, 0); }
		public TerminalNode AND() { return getToken(supercritParser.AND, 0); }
		public TerminalNode OR() { return getToken(supercritParser.OR, 0); }
		public TerminalNode NOT() { return getToken(supercritParser.NOT, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(132);
			match(MINUS);
			setState(133);
			expr(9);
			}
			_ctx.stop = _input.LT(-1);
			setState(161);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(159);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(135);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(136);
						match(POW);
						setState(137);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(138);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(139);
						_la = _input.LA(1);
						if ( !(_la==TIMES || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(140);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(141);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(142);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(143);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(144);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(145);
						match(MOD);
						setState(146);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(147);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(148);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(149);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(150);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(151);
						match(AND);
						setState(152);
						expr(4);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(153);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(154);
						match(OR);
						setState(155);
						expr(3);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(156);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(157);
						match(NOT);
						setState(158);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(163);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConditionalContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LESS() { return getToken(supercritParser.LESS, 0); }
		public TerminalNode LESS_EQ() { return getToken(supercritParser.LESS_EQ, 0); }
		public TerminalNode GREATER() { return getToken(supercritParser.GREATER, 0); }
		public TerminalNode GREATER_EQ() { return getToken(supercritParser.GREATER_EQ, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			expr(0);
			setState(165);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESS_EQ) | (1L << GREATER) | (1L << GREATER_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(166);
			expr(0);
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

	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(supercritParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(supercritParser.ASSIGN, 0); }
		public TerminalNode INCREMENT() { return getToken(supercritParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(supercritParser.DECREMENT, 0); }
		public TerminalNode MULT_EQ() { return getToken(supercritParser.MULT_EQ, 0); }
		public TerminalNode DIV_EQ() { return getToken(supercritParser.DIV_EQ, 0); }
		public TerminalNode POW_EQ() { return getToken(supercritParser.POW_EQ, 0); }
		public TerminalNode MOD_EQ() { return getToken(supercritParser.MOD_EQ, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(VAR);
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << MULT_EQ) | (1L << DIV_EQ) | (1L << POW_EQ) | (1L << MOD_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(170);
			expr(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3*\u00af\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\3\2\3\2\3\2\3\3\7\3\37\n\3\f\3\16\3\"\13\3\3\3\7\3"+
		"%\n\3\f\3\16\3(\13\3\3\3\7\3+\n\3\f\3\16\3.\13\3\3\3\7\3\61\n\3\f\3\16"+
		"\3\64\13\3\5\3\66\n\3\3\4\3\4\3\4\3\5\3\5\7\5=\n\5\f\5\16\5@\13\5\3\6"+
		"\3\6\5\6D\n\6\3\6\3\6\5\6H\n\6\3\6\3\6\3\6\3\6\3\6\5\6O\n\6\3\6\3\6\5"+
		"\6S\n\6\3\6\3\6\3\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\3\6\3\6\3\6\5\6b"+
		"\n\6\3\7\3\7\5\7f\n\7\3\7\3\7\5\7j\n\7\3\7\3\7\3\7\3\7\3\b\3\b\5\br\n"+
		"\b\3\b\3\b\5\bv\n\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5"+
		"\n\u0084\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\3\13\7\13\u00a2\n\13\f\13\16\13\u00a5\13\13\3\f\3\f\3\f\3\f\3"+
		"\r\3\r\3\r\3\r\3\r\2\3\24\16\2\4\6\b\n\f\16\20\22\24\26\30\2\7\3\2\26"+
		"\27\3\2\24\25\3\2%&\3\2!$\3\2\32 \2\u00be\2\32\3\2\2\2\4\65\3\2\2\2\6"+
		"\67\3\2\2\2\b>\3\2\2\2\nA\3\2\2\2\fc\3\2\2\2\16o\3\2\2\2\20{\3\2\2\2\22"+
		"\u0083\3\2\2\2\24\u0085\3\2\2\2\26\u00a6\3\2\2\2\30\u00aa\3\2\2\2\32\33"+
		"\5\4\3\2\33\34\7\2\2\3\34\3\3\2\2\2\35\37\5\6\4\2\36\35\3\2\2\2\37\"\3"+
		"\2\2\2 \36\3\2\2\2 !\3\2\2\2!\66\3\2\2\2\" \3\2\2\2#%\5\n\6\2$#\3\2\2"+
		"\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\'\66\3\2\2\2(&\3\2\2\2)+\5\f\7\2*)\3"+
		"\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\66\3\2\2\2.,\3\2\2\2/\61\5\16\b"+
		"\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62\63\3\2\2\2\63\66\3\2\2\2"+
		"\64\62\3\2\2\2\65 \3\2\2\2\65&\3\2\2\2\65,\3\2\2\2\65\62\3\2\2\2\66\5"+
		"\3\2\2\2\678\5\30\r\289\7\5\2\29\7\3\2\2\2:;\7\16\2\2;=\5\6\4\2<:\3\2"+
		"\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?\t\3\2\2\2@>\3\2\2\2AC\7\13\2\2BD\7"+
		"\7\2\2CB\3\2\2\2CD\3\2\2\2DE\3\2\2\2EG\5\26\f\2FH\7\b\2\2GF\3\2\2\2GH"+
		"\3\2\2\2HI\3\2\2\2IJ\7\6\2\2JK\7\5\2\2KZ\5\b\5\2LN\7\f\2\2MO\7\7\2\2N"+
		"M\3\2\2\2NO\3\2\2\2OP\3\2\2\2PR\5\26\f\2QS\7\b\2\2RQ\3\2\2\2RS\3\2\2\2"+
		"ST\3\2\2\2TU\7\6\2\2UV\7\5\2\2VW\5\b\5\2WY\3\2\2\2XL\3\2\2\2Y\\\3\2\2"+
		"\2ZX\3\2\2\2Z[\3\2\2\2[a\3\2\2\2\\Z\3\2\2\2]^\7\r\2\2^_\7\6\2\2_`\7\5"+
		"\2\2`b\5\b\5\2a]\3\2\2\2ab\3\2\2\2b\13\3\2\2\2ce\7\20\2\2df\7\7\2\2ed"+
		"\3\2\2\2ef\3\2\2\2fg\3\2\2\2gi\5\26\f\2hj\7\b\2\2ih\3\2\2\2ij\3\2\2\2"+
		"jk\3\2\2\2kl\7\6\2\2lm\7\5\2\2mn\5\b\5\2n\r\3\2\2\2oq\7\21\2\2pr\7\7\2"+
		"\2qp\3\2\2\2qr\3\2\2\2rs\3\2\2\2su\5\26\f\2tv\7\b\2\2ut\3\2\2\2uv\3\2"+
		"\2\2vw\3\2\2\2wx\7\6\2\2xy\7\5\2\2yz\5\b\5\2z\17\3\2\2\2{|\7\3\2\2|}\7"+
		"\7\2\2}~\5\24\13\2~\177\7\b\2\2\177\21\3\2\2\2\u0080\u0084\5\24\13\2\u0081"+
		"\u0084\5\26\f\2\u0082\u0084\5\30\r\2\u0083\u0080\3\2\2\2\u0083\u0081\3"+
		"\2\2\2\u0083\u0082\3\2\2\2\u0084\23\3\2\2\2\u0085\u0086\b\13\1\2\u0086"+
		"\u0087\7\25\2\2\u0087\u0088\5\24\13\13\u0088\u00a3\3\2\2\2\u0089\u008a"+
		"\f\n\2\2\u008a\u008b\7\31\2\2\u008b\u00a2\5\24\13\13\u008c\u008d\f\t\2"+
		"\2\u008d\u008e\t\2\2\2\u008e\u00a2\5\24\13\n\u008f\u0090\f\b\2\2\u0090"+
		"\u0091\t\3\2\2\u0091\u00a2\5\24\13\t\u0092\u0093\f\7\2\2\u0093\u0094\7"+
		"\30\2\2\u0094\u00a2\5\24\13\b\u0095\u0096\f\6\2\2\u0096\u0097\t\4\2\2"+
		"\u0097\u00a2\5\24\13\7\u0098\u0099\f\5\2\2\u0099\u009a\7\'\2\2\u009a\u00a2"+
		"\5\24\13\6\u009b\u009c\f\4\2\2\u009c\u009d\7(\2\2\u009d\u00a2\5\24\13"+
		"\5\u009e\u009f\f\3\2\2\u009f\u00a0\7)\2\2\u00a0\u00a2\5\24\13\4\u00a1"+
		"\u0089\3\2\2\2\u00a1\u008c\3\2\2\2\u00a1\u008f\3\2\2\2\u00a1\u0092\3\2"+
		"\2\2\u00a1\u0095\3\2\2\2\u00a1\u0098\3\2\2\2\u00a1\u009b\3\2\2\2\u00a1"+
		"\u009e\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2"+
		"\2\2\u00a4\25\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\5\24\13\2\u00a7"+
		"\u00a8\t\5\2\2\u00a8\u00a9\5\24\13\2\u00a9\27\3\2\2\2\u00aa\u00ab\7\17"+
		"\2\2\u00ab\u00ac\t\6\2\2\u00ac\u00ad\5\24\13\2\u00ad\31\3\2\2\2\25 &,"+
		"\62\65>CGNRZaeiqu\u0083\u00a1\u00a3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}