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
		WHITESPACE=1, NEWLINE=2, COLON=3, OPEN_PAR=4, CLOSE_PAR=5, OPEN_BRAC=6, 
		CLOSE_BRAC=7, IF=8, ELIF=9, ELSE=10, TAB=11, VAR=12, WHILE=13, FOR=14, 
		BREAK=15, CONTINUE=16, PLUS=17, MINUS=18, TIMES=19, DIV=20, MOD=21, POW=22, 
		ASSIGN=23, INCREMENT=24, DECREMENT=25, MULT_EQ=26, DIV_EQ=27, POW_EQ=28, 
		MOD_EQ=29, LESS=30, LESS_EQ=31, GREATER=32, GREATER_EQ=33, EQUAL=34, NOT_EQUAL=35, 
		AND=36, OR=37, NOT=38, COMMENT=39;
	public static final int
		RULE_start = 0, RULE_block = 1, RULE_line = 2, RULE_tab_block = 3, RULE_if_block = 4, 
		RULE_while_block = 5, RULE_for_block = 6, RULE_statement = 7, RULE_expr = 8, 
		RULE_conditional = 9, RULE_assignment = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "block", "line", "tab_block", "if_block", "while_block", "for_block", 
			"statement", "expr", "conditional", "assignment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'\n'", "':'", "'('", "')'", "'['", "']'", "'if'", "'elif'", 
			"'else'", null, null, "'while'", "'for'", "'break'", "'continue'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'**'", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'**='", "'%='", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'and'", 
			"'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACE", "NEWLINE", "COLON", "OPEN_PAR", "CLOSE_PAR", "OPEN_BRAC", 
			"CLOSE_BRAC", "IF", "ELIF", "ELSE", "TAB", "VAR", "WHILE", "FOR", "BREAK", 
			"CONTINUE", "PLUS", "MINUS", "TIMES", "DIV", "MOD", "POW", "ASSIGN", 
			"INCREMENT", "DECREMENT", "MULT_EQ", "DIV_EQ", "POW_EQ", "MOD_EQ", "LESS", 
			"LESS_EQ", "GREATER", "GREATER_EQ", "EQUAL", "NOT_EQUAL", "AND", "OR", 
			"NOT", "COMMENT"
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
			setState(22);
			block();
			setState(23);
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
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==VAR) {
					{
					{
					setState(25);
					line();
					}
					}
					setState(30);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==IF) {
					{
					{
					setState(31);
					if_block();
					}
					}
					setState(36);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHILE) {
					{
					{
					setState(37);
					while_block();
					}
					}
					setState(42);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==FOR) {
					{
					{
					setState(43);
					for_block();
					}
					}
					setState(48);
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
			setState(51);
			assignment();
			setState(52);
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
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TAB) {
				{
				{
				setState(54);
				match(TAB);
				setState(55);
				line();
				}
				}
				setState(60);
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
			setState(61);
			match(IF);
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(62);
				match(OPEN_PAR);
				}
			}

			setState(65);
			conditional();
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_PAR) {
				{
				setState(66);
				match(CLOSE_PAR);
				}
			}

			setState(69);
			match(COLON);
			setState(70);
			match(NEWLINE);
			setState(71);
			tab_block();
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELIF) {
				{
				{
				setState(72);
				match(ELIF);
				setState(74);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_PAR) {
					{
					setState(73);
					match(OPEN_PAR);
					}
				}

				setState(76);
				conditional();
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CLOSE_PAR) {
					{
					setState(77);
					match(CLOSE_PAR);
					}
				}

				setState(80);
				match(COLON);
				setState(81);
				match(NEWLINE);
				setState(82);
				tab_block();
				}
				}
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(89);
				match(ELSE);
				setState(90);
				match(COLON);
				setState(91);
				match(NEWLINE);
				setState(92);
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
			setState(95);
			match(WHILE);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(96);
				match(OPEN_PAR);
				}
			}

			setState(99);
			conditional();
			setState(101);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_PAR) {
				{
				setState(100);
				match(CLOSE_PAR);
				}
			}

			setState(103);
			match(COLON);
			setState(104);
			match(NEWLINE);
			setState(105);
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
			setState(107);
			match(FOR);
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(108);
				match(OPEN_PAR);
				}
			}

			setState(111);
			conditional();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CLOSE_PAR) {
				{
				setState(112);
				match(CLOSE_PAR);
				}
			}

			setState(115);
			match(COLON);
			setState(116);
			match(NEWLINE);
			setState(117);
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
		enterRule(_localctx, 14, RULE_statement);
		try {
			setState(122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				conditional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(121);
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
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(125);
			match(MINUS);
			setState(126);
			expr(9);
			}
			_ctx.stop = _input.LT(-1);
			setState(154);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(152);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(128);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(129);
						match(POW);
						setState(130);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(131);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(132);
						_la = _input.LA(1);
						if ( !(_la==TIMES || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(133);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(134);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(135);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(136);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(137);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(138);
						match(MOD);
						setState(139);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(140);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(141);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(142);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(143);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(144);
						match(AND);
						setState(145);
						expr(4);
						}
						break;
					case 7:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(146);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(147);
						match(OR);
						setState(148);
						expr(3);
						}
						break;
					case 8:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(149);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(150);
						match(NOT);
						setState(151);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(156);
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
		enterRule(_localctx, 18, RULE_conditional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			expr(0);
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESS_EQ) | (1L << GREATER) | (1L << GREATER_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(159);
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
		enterRule(_localctx, 20, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(VAR);
			setState(162);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << MULT_EQ) | (1L << DIV_EQ) | (1L << POW_EQ) | (1L << MOD_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(163);
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
		case 8:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00a8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\3\2\3\2\3\2\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\7\3#\n\3\f\3"+
		"\16\3&\13\3\3\3\7\3)\n\3\f\3\16\3,\13\3\3\3\7\3/\n\3\f\3\16\3\62\13\3"+
		"\5\3\64\n\3\3\4\3\4\3\4\3\5\3\5\7\5;\n\5\f\5\16\5>\13\5\3\6\3\6\5\6B\n"+
		"\6\3\6\3\6\5\6F\n\6\3\6\3\6\3\6\3\6\3\6\5\6M\n\6\3\6\3\6\5\6Q\n\6\3\6"+
		"\3\6\3\6\3\6\7\6W\n\6\f\6\16\6Z\13\6\3\6\3\6\3\6\3\6\5\6`\n\6\3\7\3\7"+
		"\5\7d\n\7\3\7\3\7\5\7h\n\7\3\7\3\7\3\7\3\7\3\b\3\b\5\bp\n\b\3\b\3\b\5"+
		"\bt\n\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\5\t}\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\7\n\u009b\n\n\f\n\16\n\u009e\13\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\2\3\22\r\2\4\6\b\n\f\16\20\22\24\26\2\7\3\2\25\26"+
		"\3\2\23\24\3\2$%\3\2 #\3\2\31\37\2\u00b8\2\30\3\2\2\2\4\63\3\2\2\2\6\65"+
		"\3\2\2\2\b<\3\2\2\2\n?\3\2\2\2\fa\3\2\2\2\16m\3\2\2\2\20|\3\2\2\2\22~"+
		"\3\2\2\2\24\u009f\3\2\2\2\26\u00a3\3\2\2\2\30\31\5\4\3\2\31\32\7\2\2\3"+
		"\32\3\3\2\2\2\33\35\5\6\4\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36"+
		"\37\3\2\2\2\37\64\3\2\2\2 \36\3\2\2\2!#\5\n\6\2\"!\3\2\2\2#&\3\2\2\2$"+
		"\"\3\2\2\2$%\3\2\2\2%\64\3\2\2\2&$\3\2\2\2\')\5\f\7\2(\'\3\2\2\2),\3\2"+
		"\2\2*(\3\2\2\2*+\3\2\2\2+\64\3\2\2\2,*\3\2\2\2-/\5\16\b\2.-\3\2\2\2/\62"+
		"\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\63\36\3"+
		"\2\2\2\63$\3\2\2\2\63*\3\2\2\2\63\60\3\2\2\2\64\5\3\2\2\2\65\66\5\26\f"+
		"\2\66\67\7\4\2\2\67\7\3\2\2\289\7\r\2\29;\5\6\4\2:8\3\2\2\2;>\3\2\2\2"+
		"<:\3\2\2\2<=\3\2\2\2=\t\3\2\2\2><\3\2\2\2?A\7\n\2\2@B\7\6\2\2A@\3\2\2"+
		"\2AB\3\2\2\2BC\3\2\2\2CE\5\24\13\2DF\7\7\2\2ED\3\2\2\2EF\3\2\2\2FG\3\2"+
		"\2\2GH\7\5\2\2HI\7\4\2\2IX\5\b\5\2JL\7\13\2\2KM\7\6\2\2LK\3\2\2\2LM\3"+
		"\2\2\2MN\3\2\2\2NP\5\24\13\2OQ\7\7\2\2PO\3\2\2\2PQ\3\2\2\2QR\3\2\2\2R"+
		"S\7\5\2\2ST\7\4\2\2TU\5\b\5\2UW\3\2\2\2VJ\3\2\2\2WZ\3\2\2\2XV\3\2\2\2"+
		"XY\3\2\2\2Y_\3\2\2\2ZX\3\2\2\2[\\\7\f\2\2\\]\7\5\2\2]^\7\4\2\2^`\5\b\5"+
		"\2_[\3\2\2\2_`\3\2\2\2`\13\3\2\2\2ac\7\17\2\2bd\7\6\2\2cb\3\2\2\2cd\3"+
		"\2\2\2de\3\2\2\2eg\5\24\13\2fh\7\7\2\2gf\3\2\2\2gh\3\2\2\2hi\3\2\2\2i"+
		"j\7\5\2\2jk\7\4\2\2kl\5\b\5\2l\r\3\2\2\2mo\7\20\2\2np\7\6\2\2on\3\2\2"+
		"\2op\3\2\2\2pq\3\2\2\2qs\5\24\13\2rt\7\7\2\2sr\3\2\2\2st\3\2\2\2tu\3\2"+
		"\2\2uv\7\5\2\2vw\7\4\2\2wx\5\b\5\2x\17\3\2\2\2y}\5\22\n\2z}\5\24\13\2"+
		"{}\5\26\f\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\21\3\2\2\2~\177\b\n\1\2\177"+
		"\u0080\7\24\2\2\u0080\u0081\5\22\n\13\u0081\u009c\3\2\2\2\u0082\u0083"+
		"\f\n\2\2\u0083\u0084\7\30\2\2\u0084\u009b\5\22\n\13\u0085\u0086\f\t\2"+
		"\2\u0086\u0087\t\2\2\2\u0087\u009b\5\22\n\n\u0088\u0089\f\b\2\2\u0089"+
		"\u008a\t\3\2\2\u008a\u009b\5\22\n\t\u008b\u008c\f\7\2\2\u008c\u008d\7"+
		"\27\2\2\u008d\u009b\5\22\n\b\u008e\u008f\f\6\2\2\u008f\u0090\t\4\2\2\u0090"+
		"\u009b\5\22\n\7\u0091\u0092\f\5\2\2\u0092\u0093\7&\2\2\u0093\u009b\5\22"+
		"\n\6\u0094\u0095\f\4\2\2\u0095\u0096\7\'\2\2\u0096\u009b\5\22\n\5\u0097"+
		"\u0098\f\3\2\2\u0098\u0099\7(\2\2\u0099\u009b\5\22\n\4\u009a\u0082\3\2"+
		"\2\2\u009a\u0085\3\2\2\2\u009a\u0088\3\2\2\2\u009a\u008b\3\2\2\2\u009a"+
		"\u008e\3\2\2\2\u009a\u0091\3\2\2\2\u009a\u0094\3\2\2\2\u009a\u0097\3\2"+
		"\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\23\3\2\2\2\u009e\u009c\3\2\2\2\u009f\u00a0\5\22\n\2\u00a0\u00a1\t\5\2"+
		"\2\u00a1\u00a2\5\22\n\2\u00a2\25\3\2\2\2\u00a3\u00a4\7\16\2\2\u00a4\u00a5"+
		"\t\6\2\2\u00a5\u00a6\5\22\n\2\u00a6\27\3\2\2\2\25\36$*\60\63<AELPX_cg"+
		"os|\u009a\u009c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}