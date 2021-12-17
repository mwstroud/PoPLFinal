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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INT=6, FLOAT=7, STRING=8, NEWLINE=9, 
		TAB=10, WHITESPACE=11, COLON=12, OPEN_PAR=13, CLOSE_PAR=14, OPEN_BRAC=15, 
		CLOSE_BRAC=16, IF=17, ELIF=18, ELSE=19, WHILE=20, FOR=21, BREAK=22, CONTINUE=23, 
		IN=24, PLUS=25, MINUS=26, TIMES=27, DIV=28, MOD=29, POW=30, ASSIGN=31, 
		INCREMENT=32, DECREMENT=33, MULT_EQ=34, DIV_EQ=35, POW_EQ=36, MOD_EQ=37, 
		LESS=38, LESS_EQ=39, GREATER=40, GREATER_EQ=41, EQUAL=42, NOT_EQUAL=43, 
		AND=44, OR=45, NOT=46, TRUE=47, FALSE=48, COMMENT=49, VAR=50;
	public static final int
		RULE_start = 0, RULE_block = 1, RULE_line = 2, RULE_comment = 3, RULE_tab_block = 4, 
		RULE_if_block = 5, RULE_elif_block = 6, RULE_else_block = 7, RULE_while_block = 8, 
		RULE_for_block = 9, RULE_function = 10, RULE_expr = 11, RULE_bool = 12, 
		RULE_conditional = 13, RULE_assignment = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "block", "line", "comment", "tab_block", "if_block", "elif_block", 
			"else_block", "while_block", "for_block", "function", "expr", "bool", 
			"conditional", "assignment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'str'", "'int'", "'range'", "','", "'print'", null, null, null, 
			null, null, null, "':'", "'('", "')'", "'['", "']'", "'if'", "'elif'", 
			"'else'", "'while'", "'for'", "'break'", "'continue'", "'in'", "'+'", 
			"'-'", "'*'", "'/'", "'%'", "'**'", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'**='", "'%='", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'and'", 
			"'or'", "'not'", "'True'", "'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "INT", "FLOAT", "STRING", "NEWLINE", 
			"TAB", "WHITESPACE", "COLON", "OPEN_PAR", "CLOSE_PAR", "OPEN_BRAC", "CLOSE_BRAC", 
			"IF", "ELIF", "ELSE", "WHILE", "FOR", "BREAK", "CONTINUE", "IN", "PLUS", 
			"MINUS", "TIMES", "DIV", "MOD", "POW", "ASSIGN", "INCREMENT", "DECREMENT", 
			"MULT_EQ", "DIV_EQ", "POW_EQ", "MOD_EQ", "LESS", "LESS_EQ", "GREATER", 
			"GREATER_EQ", "EQUAL", "NOT_EQUAL", "AND", "OR", "NOT", "TRUE", "FALSE", 
			"COMMENT", "VAR"
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
		public TerminalNode EOF() { return getToken(supercritParser.EOF, 0); }
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << NEWLINE) | (1L << TAB) | (1L << WHITESPACE) | (1L << IF) | (1L << ELIF) | (1L << ELSE) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << COMMENT) | (1L << VAR))) != 0)) {
				{
				{
				setState(30);
				block();
				}
				}
				setState(35);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
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
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public Elif_blockContext elif_block() {
			return getRuleContext(Elif_blockContext.class,0);
		}
		public Else_blockContext else_block() {
			return getRuleContext(Else_blockContext.class,0);
		}
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
		}
		public For_blockContext for_block() {
			return getRuleContext(For_blockContext.class,0);
		}
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			setState(44);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(38);
				if_block();
				}
				break;
			case ELIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(39);
				elif_block();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				else_block();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(41);
				while_block();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(42);
				for_block();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__4:
			case INT:
			case FLOAT:
			case STRING:
			case NEWLINE:
			case TAB:
			case WHITESPACE:
			case BREAK:
			case CONTINUE:
			case COMMENT:
			case VAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(43);
				line();
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

	public static class LineContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(supercritParser.NEWLINE, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(supercritParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(supercritParser.WHITESPACE, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode TAB() { return getToken(supercritParser.TAB, 0); }
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_line);
		int _la;
		try {
			setState(66);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(47);
				assignment();
				setState(48);
				comment();
				setState(49);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				comment();
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(52);
					match(NEWLINE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(55);
					match(WHITESPACE);
					}
					}
					setState(58); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHITESPACE );
				setState(60);
				match(NEWLINE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(61);
				expr(0);
				setState(62);
				match(NEWLINE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(64);
				match(NEWLINE);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(65);
				match(TAB);
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

	public static class CommentContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(supercritParser.COMMENT, 0); }
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(COMMENT);
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
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public Tab_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab_block; }
	}

	public final Tab_blockContext tab_block() throws RecognitionException {
		Tab_blockContext _localctx = new Tab_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tab_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(70);
					match(TAB);
					setState(71);
					block();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(74); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public TerminalNode OPEN_PAR() { return getToken(supercritParser.OPEN_PAR, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(supercritParser.CLOSE_PAR, 0); }
		public TerminalNode COLON() { return getToken(supercritParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(supercritParser.NEWLINE, 0); }
		public Tab_blockContext tab_block() {
			return getRuleContext(Tab_blockContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(supercritParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(supercritParser.WHITESPACE, i);
		}
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_if_block);
		int _la;
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(IF);
				setState(77);
				match(OPEN_PAR);
				setState(78);
				conditional();
				setState(79);
				match(CLOSE_PAR);
				setState(83);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(80);
					match(WHITESPACE);
					}
					}
					setState(85);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(86);
				match(COLON);
				setState(87);
				match(NEWLINE);
				setState(88);
				tab_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(90);
				match(IF);
				setState(91);
				conditional();
				setState(92);
				match(COLON);
				setState(93);
				match(NEWLINE);
				setState(94);
				tab_block();
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

	public static class Elif_blockContext extends ParserRuleContext {
		public TerminalNode ELIF() { return getToken(supercritParser.ELIF, 0); }
		public TerminalNode OPEN_PAR() { return getToken(supercritParser.OPEN_PAR, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(supercritParser.CLOSE_PAR, 0); }
		public TerminalNode COLON() { return getToken(supercritParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(supercritParser.NEWLINE, 0); }
		public Tab_blockContext tab_block() {
			return getRuleContext(Tab_blockContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(supercritParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(supercritParser.WHITESPACE, i);
		}
		public Elif_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elif_block; }
	}

	public final Elif_blockContext elif_block() throws RecognitionException {
		Elif_blockContext _localctx = new Elif_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_elif_block);
		int _la;
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(ELIF);
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(99);
					match(WHITESPACE);
					}
					}
					setState(104);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(105);
				match(OPEN_PAR);
				setState(106);
				conditional();
				setState(107);
				match(CLOSE_PAR);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(108);
					match(WHITESPACE);
					}
					}
					setState(113);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(114);
				match(COLON);
				setState(115);
				match(NEWLINE);
				setState(116);
				tab_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				match(ELIF);
				setState(119);
				conditional();
				setState(120);
				match(COLON);
				setState(121);
				match(NEWLINE);
				setState(122);
				tab_block();
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

	public static class Else_blockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(supercritParser.ELSE, 0); }
		public TerminalNode COLON() { return getToken(supercritParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(supercritParser.NEWLINE, 0); }
		public Tab_blockContext tab_block() {
			return getRuleContext(Tab_blockContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(supercritParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(supercritParser.WHITESPACE, i);
		}
		public Else_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_block; }
	}

	public final Else_blockContext else_block() throws RecognitionException {
		Else_blockContext _localctx = new Else_blockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_else_block);
		int _la;
		try {
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(126);
				match(ELSE);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(127);
					match(WHITESPACE);
					}
					}
					setState(132);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(133);
				match(COLON);
				setState(134);
				match(NEWLINE);
				setState(135);
				tab_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				match(ELSE);
				setState(140);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(137);
					match(WHITESPACE);
					}
					}
					setState(142);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(143);
				match(COLON);
				setState(144);
				match(NEWLINE);
				setState(145);
				tab_block();
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

	public static class While_blockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(supercritParser.WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(supercritParser.OPEN_PAR, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(supercritParser.CLOSE_PAR, 0); }
		public TerminalNode COLON() { return getToken(supercritParser.COLON, 0); }
		public Tab_blockContext tab_block() {
			return getRuleContext(Tab_blockContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(supercritParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(supercritParser.WHITESPACE, i);
		}
		public TerminalNode NEWLINE() { return getToken(supercritParser.NEWLINE, 0); }
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_block);
		int _la;
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(148);
				match(WHILE);
				setState(152);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(149);
					match(WHITESPACE);
					}
					}
					setState(154);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(155);
				match(OPEN_PAR);
				setState(156);
				conditional();
				setState(157);
				match(CLOSE_PAR);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(158);
					match(WHITESPACE);
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(164);
				match(COLON);
				setState(165);
				tab_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				match(WHILE);
				setState(168);
				conditional();
				setState(169);
				match(COLON);
				setState(170);
				match(NEWLINE);
				setState(171);
				tab_block();
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

	public static class For_blockContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(supercritParser.FOR, 0); }
		public TerminalNode VAR() { return getToken(supercritParser.VAR, 0); }
		public TerminalNode IN() { return getToken(supercritParser.IN, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode COLON() { return getToken(supercritParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(supercritParser.NEWLINE, 0); }
		public Tab_blockContext tab_block() {
			return getRuleContext(Tab_blockContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(supercritParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(supercritParser.WHITESPACE, i);
		}
		public For_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_block; }
	}

	public final For_blockContext for_block() throws RecognitionException {
		For_blockContext _localctx = new For_blockContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(FOR);
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(176);
				match(WHITESPACE);
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(182);
			match(VAR);
			setState(186);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(183);
				match(WHITESPACE);
				}
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(189);
			match(IN);
			setState(193);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(190);
				match(WHITESPACE);
				}
				}
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(196);
			function();
			setState(197);
			match(COLON);
			setState(198);
			match(NEWLINE);
			setState(199);
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(supercritParser.OPEN_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(supercritParser.CLOSE_PAR, 0); }
		public TerminalNode WHITESPACE() { return getToken(supercritParser.WHITESPACE, 0); }
		public TerminalNode BREAK() { return getToken(supercritParser.BREAK, 0); }
		public TerminalNode CONTINUE() { return getToken(supercritParser.CONTINUE, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_function);
		try {
			setState(226);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(201);
				match(T__0);
				setState(202);
				match(OPEN_PAR);
				setState(203);
				expr(0);
				setState(204);
				match(CLOSE_PAR);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				match(T__1);
				setState(207);
				match(OPEN_PAR);
				setState(208);
				expr(0);
				setState(209);
				match(CLOSE_PAR);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(211);
				match(T__2);
				setState(212);
				match(OPEN_PAR);
				setState(213);
				expr(0);
				setState(214);
				match(T__3);
				setState(215);
				match(WHITESPACE);
				setState(216);
				expr(0);
				setState(217);
				match(CLOSE_PAR);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(219);
				match(T__4);
				setState(220);
				match(OPEN_PAR);
				setState(221);
				expr(0);
				setState(222);
				match(CLOSE_PAR);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 5);
				{
				setState(224);
				match(BREAK);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(225);
				match(CONTINUE);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(supercritParser.VAR, 0); }
		public TerminalNode INT() { return getToken(supercritParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(supercritParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(supercritParser.STRING, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW() { return getToken(supercritParser.POW, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(supercritParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(supercritParser.WHITESPACE, i);
		}
		public TerminalNode TIMES() { return getToken(supercritParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(supercritParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(supercritParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(supercritParser.MINUS, 0); }
		public TerminalNode MOD() { return getToken(supercritParser.MOD, 0); }
		public TerminalNode EQUAL() { return getToken(supercritParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(supercritParser.NOT_EQUAL, 0); }
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
		int _startState = 22;
		enterRecursionRule(_localctx, 22, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(229);
				match(VAR);
				}
				break;
			case INT:
				{
				setState(230);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(231);
				match(FLOAT);
				}
				break;
			case STRING:
				{
				setState(232);
				match(STRING);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__4:
			case BREAK:
			case CONTINUE:
				{
				setState(233);
				function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(313);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(311);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(236);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(240);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(237);
							match(WHITESPACE);
							}
							}
							setState(242);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(243);
						match(POW);
						setState(247);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(244);
							match(WHITESPACE);
							}
							}
							setState(249);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(250);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(251);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(255);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(252);
							match(WHITESPACE);
							}
							}
							setState(257);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(258);
						_la = _input.LA(1);
						if ( !(_la==TIMES || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(262);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(259);
							match(WHITESPACE);
							}
							}
							setState(264);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(265);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(266);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(270);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(267);
							match(WHITESPACE);
							}
							}
							setState(272);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(273);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(277);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(274);
							match(WHITESPACE);
							}
							}
							setState(279);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(280);
						expr(4);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(281);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(285);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(282);
							match(WHITESPACE);
							}
							}
							setState(287);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(288);
						match(MOD);
						setState(292);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(289);
							match(WHITESPACE);
							}
							}
							setState(294);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(295);
						expr(3);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(296);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(300);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(297);
							match(WHITESPACE);
							}
							}
							setState(302);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(303);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(307);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(304);
							match(WHITESPACE);
							}
							}
							setState(309);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(310);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(315);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(supercritParser.OPEN_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(supercritParser.CLOSE_PAR, 0); }
		public TerminalNode LESS() { return getToken(supercritParser.LESS, 0); }
		public TerminalNode LESS_EQ() { return getToken(supercritParser.LESS_EQ, 0); }
		public TerminalNode GREATER() { return getToken(supercritParser.GREATER, 0); }
		public TerminalNode GREATER_EQ() { return getToken(supercritParser.GREATER_EQ, 0); }
		public TerminalNode EQUAL() { return getToken(supercritParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(supercritParser.NOT_EQUAL, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(supercritParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(supercritParser.WHITESPACE, i);
		}
		public TerminalNode TRUE() { return getToken(supercritParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(supercritParser.FALSE, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_bool);
		int _la;
		try {
			setState(364);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				match(OPEN_PAR);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(317);
					match(WHITESPACE);
					}
					}
					setState(322);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(323);
				expr(0);
				setState(327);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(324);
					match(WHITESPACE);
					}
					}
					setState(329);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(330);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESS_EQ) | (1L << GREATER) | (1L << GREATER_EQ) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(331);
					match(WHITESPACE);
					}
					}
					setState(336);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(337);
				expr(0);
				setState(341);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(338);
					match(WHITESPACE);
					}
					}
					setState(343);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(344);
				match(CLOSE_PAR);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__4:
			case INT:
			case FLOAT:
			case STRING:
			case BREAK:
			case CONTINUE:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(346);
				expr(0);
				setState(350);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(347);
					match(WHITESPACE);
					}
					}
					setState(352);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(353);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESS_EQ) | (1L << GREATER) | (1L << GREATER_EQ) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(354);
					match(WHITESPACE);
					}
					}
					setState(359);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(360);
				expr(0);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(362);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(363);
				match(FALSE);
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

	public static class ConditionalContext extends ParserRuleContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(supercritParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(supercritParser.WHITESPACE, i);
		}
		public List<TerminalNode> AND() { return getTokens(supercritParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(supercritParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(supercritParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(supercritParser.OR, i);
		}
		public TerminalNode NOT() { return getToken(supercritParser.NOT, 0); }
		public ConditionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditional; }
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_conditional);
		int _la;
		try {
			int _alt;
			setState(461);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(366);
					match(WHITESPACE);
					}
					}
					setState(371);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(386); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(372);
						bool();
						setState(376);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(373);
							match(WHITESPACE);
							}
							}
							setState(378);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(379);
						match(AND);
						setState(383);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(380);
							match(WHITESPACE);
							}
							}
							setState(385);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(388); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(390);
				bool();
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(391);
					match(WHITESPACE);
					}
					}
					setState(396);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(397);
					match(WHITESPACE);
					}
					}
					setState(402);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(417); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(403);
						bool();
						setState(407);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(404);
							match(WHITESPACE);
							}
							}
							setState(409);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(410);
						match(OR);
						setState(414);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(411);
							match(WHITESPACE);
							}
							}
							setState(416);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(419); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(421);
				bool();
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(422);
					match(WHITESPACE);
					}
					}
					setState(427);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(431);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(428);
					match(WHITESPACE);
					}
					}
					setState(433);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(434);
				bool();
				setState(438);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(435);
					match(WHITESPACE);
					}
					}
					setState(440);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(441);
					match(WHITESPACE);
					}
					}
					setState(446);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(447);
				match(NOT);
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(448);
					match(WHITESPACE);
					}
					}
					setState(453);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(454);
				bool();
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(455);
					match(WHITESPACE);
					}
					}
					setState(460);
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
		public List<TerminalNode> WHITESPACE() { return getTokens(supercritParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(supercritParser.WHITESPACE, i);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			match(VAR);
			setState(467);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(464);
				match(WHITESPACE);
				}
				}
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(470);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << MULT_EQ) | (1L << DIV_EQ) | (1L << POW_EQ) | (1L << MOD_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(471);
				match(WHITESPACE);
				}
				}
				setState(476);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(477);
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
		case 11:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 5);
		case 1:
			return precpred(_ctx, 4);
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		case 4:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u01e2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\7\2\"\n\2\f\2"+
		"\16\2%\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3/\n\3\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\5\48\n\4\3\4\6\4;\n\4\r\4\16\4<\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"E\n\4\3\5\3\5\3\6\3\6\6\6K\n\6\r\6\16\6L\3\7\3\7\3\7\3\7\3\7\7\7T\n\7"+
		"\f\7\16\7W\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7c\n\7\3\b\3"+
		"\b\7\bg\n\b\f\b\16\bj\13\b\3\b\3\b\3\b\3\b\7\bp\n\b\f\b\16\bs\13\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\177\n\b\3\t\3\t\7\t\u0083\n\t"+
		"\f\t\16\t\u0086\13\t\3\t\3\t\3\t\3\t\3\t\7\t\u008d\n\t\f\t\16\t\u0090"+
		"\13\t\3\t\3\t\3\t\5\t\u0095\n\t\3\n\3\n\7\n\u0099\n\n\f\n\16\n\u009c\13"+
		"\n\3\n\3\n\3\n\3\n\7\n\u00a2\n\n\f\n\16\n\u00a5\13\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\5\n\u00b0\n\n\3\13\3\13\7\13\u00b4\n\13\f\13\16\13"+
		"\u00b7\13\13\3\13\3\13\7\13\u00bb\n\13\f\13\16\13\u00be\13\13\3\13\3\13"+
		"\7\13\u00c2\n\13\f\13\16\13\u00c5\13\13\3\13\3\13\3\13\3\13\3\13\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00e5\n\f\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00ed"+
		"\n\r\3\r\3\r\7\r\u00f1\n\r\f\r\16\r\u00f4\13\r\3\r\3\r\7\r\u00f8\n\r\f"+
		"\r\16\r\u00fb\13\r\3\r\3\r\3\r\7\r\u0100\n\r\f\r\16\r\u0103\13\r\3\r\3"+
		"\r\7\r\u0107\n\r\f\r\16\r\u010a\13\r\3\r\3\r\3\r\7\r\u010f\n\r\f\r\16"+
		"\r\u0112\13\r\3\r\3\r\7\r\u0116\n\r\f\r\16\r\u0119\13\r\3\r\3\r\3\r\7"+
		"\r\u011e\n\r\f\r\16\r\u0121\13\r\3\r\3\r\7\r\u0125\n\r\f\r\16\r\u0128"+
		"\13\r\3\r\3\r\3\r\7\r\u012d\n\r\f\r\16\r\u0130\13\r\3\r\3\r\7\r\u0134"+
		"\n\r\f\r\16\r\u0137\13\r\3\r\7\r\u013a\n\r\f\r\16\r\u013d\13\r\3\16\3"+
		"\16\7\16\u0141\n\16\f\16\16\16\u0144\13\16\3\16\3\16\7\16\u0148\n\16\f"+
		"\16\16\16\u014b\13\16\3\16\3\16\7\16\u014f\n\16\f\16\16\16\u0152\13\16"+
		"\3\16\3\16\7\16\u0156\n\16\f\16\16\16\u0159\13\16\3\16\3\16\3\16\3\16"+
		"\7\16\u015f\n\16\f\16\16\16\u0162\13\16\3\16\3\16\7\16\u0166\n\16\f\16"+
		"\16\16\u0169\13\16\3\16\3\16\3\16\3\16\5\16\u016f\n\16\3\17\7\17\u0172"+
		"\n\17\f\17\16\17\u0175\13\17\3\17\3\17\7\17\u0179\n\17\f\17\16\17\u017c"+
		"\13\17\3\17\3\17\7\17\u0180\n\17\f\17\16\17\u0183\13\17\6\17\u0185\n\17"+
		"\r\17\16\17\u0186\3\17\3\17\7\17\u018b\n\17\f\17\16\17\u018e\13\17\3\17"+
		"\7\17\u0191\n\17\f\17\16\17\u0194\13\17\3\17\3\17\7\17\u0198\n\17\f\17"+
		"\16\17\u019b\13\17\3\17\3\17\7\17\u019f\n\17\f\17\16\17\u01a2\13\17\6"+
		"\17\u01a4\n\17\r\17\16\17\u01a5\3\17\3\17\7\17\u01aa\n\17\f\17\16\17\u01ad"+
		"\13\17\3\17\7\17\u01b0\n\17\f\17\16\17\u01b3\13\17\3\17\3\17\7\17\u01b7"+
		"\n\17\f\17\16\17\u01ba\13\17\3\17\7\17\u01bd\n\17\f\17\16\17\u01c0\13"+
		"\17\3\17\3\17\7\17\u01c4\n\17\f\17\16\17\u01c7\13\17\3\17\3\17\7\17\u01cb"+
		"\n\17\f\17\16\17\u01ce\13\17\5\17\u01d0\n\17\3\20\3\20\7\20\u01d4\n\20"+
		"\f\20\16\20\u01d7\13\20\3\20\3\20\7\20\u01db\n\20\f\20\16\20\u01de\13"+
		"\20\3\20\3\20\3\20\2\3\30\21\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36\2"+
		"\7\3\2\35\36\3\2\33\34\3\2,-\3\2(-\3\2!\'\2\u0224\2#\3\2\2\2\4.\3\2\2"+
		"\2\6D\3\2\2\2\bF\3\2\2\2\nJ\3\2\2\2\fb\3\2\2\2\16~\3\2\2\2\20\u0094\3"+
		"\2\2\2\22\u00af\3\2\2\2\24\u00b1\3\2\2\2\26\u00e4\3\2\2\2\30\u00ec\3\2"+
		"\2\2\32\u016e\3\2\2\2\34\u01cf\3\2\2\2\36\u01d1\3\2\2\2 \"\5\4\3\2! \3"+
		"\2\2\2\"%\3\2\2\2#!\3\2\2\2#$\3\2\2\2$&\3\2\2\2%#\3\2\2\2&\'\7\2\2\3\'"+
		"\3\3\2\2\2(/\5\f\7\2)/\5\16\b\2*/\5\20\t\2+/\5\22\n\2,/\5\24\13\2-/\5"+
		"\6\4\2.(\3\2\2\2.)\3\2\2\2.*\3\2\2\2.+\3\2\2\2.,\3\2\2\2.-\3\2\2\2/\5"+
		"\3\2\2\2\60E\5\36\20\2\61\62\5\36\20\2\62\63\5\b\5\2\63\64\7\13\2\2\64"+
		"E\3\2\2\2\65\67\5\b\5\2\668\7\13\2\2\67\66\3\2\2\2\678\3\2\2\28E\3\2\2"+
		"\29;\7\r\2\2:9\3\2\2\2;<\3\2\2\2<:\3\2\2\2<=\3\2\2\2=>\3\2\2\2>E\7\13"+
		"\2\2?@\5\30\r\2@A\7\13\2\2AE\3\2\2\2BE\7\13\2\2CE\7\f\2\2D\60\3\2\2\2"+
		"D\61\3\2\2\2D\65\3\2\2\2D:\3\2\2\2D?\3\2\2\2DB\3\2\2\2DC\3\2\2\2E\7\3"+
		"\2\2\2FG\7\63\2\2G\t\3\2\2\2HI\7\f\2\2IK\5\4\3\2JH\3\2\2\2KL\3\2\2\2L"+
		"J\3\2\2\2LM\3\2\2\2M\13\3\2\2\2NO\7\23\2\2OP\7\17\2\2PQ\5\34\17\2QU\7"+
		"\20\2\2RT\7\r\2\2SR\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2VX\3\2\2\2WU"+
		"\3\2\2\2XY\7\16\2\2YZ\7\13\2\2Z[\5\n\6\2[c\3\2\2\2\\]\7\23\2\2]^\5\34"+
		"\17\2^_\7\16\2\2_`\7\13\2\2`a\5\n\6\2ac\3\2\2\2bN\3\2\2\2b\\\3\2\2\2c"+
		"\r\3\2\2\2dh\7\24\2\2eg\7\r\2\2fe\3\2\2\2gj\3\2\2\2hf\3\2\2\2hi\3\2\2"+
		"\2ik\3\2\2\2jh\3\2\2\2kl\7\17\2\2lm\5\34\17\2mq\7\20\2\2np\7\r\2\2on\3"+
		"\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tu\7\16\2\2uv"+
		"\7\13\2\2vw\5\n\6\2w\177\3\2\2\2xy\7\24\2\2yz\5\34\17\2z{\7\16\2\2{|\7"+
		"\13\2\2|}\5\n\6\2}\177\3\2\2\2~d\3\2\2\2~x\3\2\2\2\177\17\3\2\2\2\u0080"+
		"\u0084\7\25\2\2\u0081\u0083\7\r\2\2\u0082\u0081\3\2\2\2\u0083\u0086\3"+
		"\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0087\3\2\2\2\u0086"+
		"\u0084\3\2\2\2\u0087\u0088\7\16\2\2\u0088\u0089\7\13\2\2\u0089\u0095\5"+
		"\n\6\2\u008a\u008e\7\25\2\2\u008b\u008d\7\r\2\2\u008c\u008b\3\2\2\2\u008d"+
		"\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0091\3\2"+
		"\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\16\2\2\u0092\u0093\7\13\2\2\u0093"+
		"\u0095\5\n\6\2\u0094\u0080\3\2\2\2\u0094\u008a\3\2\2\2\u0095\21\3\2\2"+
		"\2\u0096\u009a\7\26\2\2\u0097\u0099\7\r\2\2\u0098\u0097\3\2\2\2\u0099"+
		"\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b\3\2\2\2\u009b\u009d\3\2"+
		"\2\2\u009c\u009a\3\2\2\2\u009d\u009e\7\17\2\2\u009e\u009f\5\34\17\2\u009f"+
		"\u00a3\7\20\2\2\u00a0\u00a2\7\r\2\2\u00a1\u00a0\3\2\2\2\u00a2\u00a5\3"+
		"\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\u00a6\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a6\u00a7\7\16\2\2\u00a7\u00a8\5\n\6\2\u00a8\u00b0\3"+
		"\2\2\2\u00a9\u00aa\7\26\2\2\u00aa\u00ab\5\34\17\2\u00ab\u00ac\7\16\2\2"+
		"\u00ac\u00ad\7\13\2\2\u00ad\u00ae\5\n\6\2\u00ae\u00b0\3\2\2\2\u00af\u0096"+
		"\3\2\2\2\u00af\u00a9\3\2\2\2\u00b0\23\3\2\2\2\u00b1\u00b5\7\27\2\2\u00b2"+
		"\u00b4\7\r\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2"+
		"\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8"+
		"\u00bc\7\64\2\2\u00b9\u00bb\7\r\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3"+
		"\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00bf\3\2\2\2\u00be"+
		"\u00bc\3\2\2\2\u00bf\u00c3\7\32\2\2\u00c0\u00c2\7\r\2\2\u00c1\u00c0\3"+
		"\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4"+
		"\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\5\26\f\2\u00c7\u00c8\7"+
		"\16\2\2\u00c8\u00c9\7\13\2\2\u00c9\u00ca\5\n\6\2\u00ca\25\3\2\2\2\u00cb"+
		"\u00cc\7\3\2\2\u00cc\u00cd\7\17\2\2\u00cd\u00ce\5\30\r\2\u00ce\u00cf\7"+
		"\20\2\2\u00cf\u00e5\3\2\2\2\u00d0\u00d1\7\4\2\2\u00d1\u00d2\7\17\2\2\u00d2"+
		"\u00d3\5\30\r\2\u00d3\u00d4\7\20\2\2\u00d4\u00e5\3\2\2\2\u00d5\u00d6\7"+
		"\5\2\2\u00d6\u00d7\7\17\2\2\u00d7\u00d8\5\30\r\2\u00d8\u00d9\7\6\2\2\u00d9"+
		"\u00da\7\r\2\2\u00da\u00db\5\30\r\2\u00db\u00dc\7\20\2\2\u00dc\u00e5\3"+
		"\2\2\2\u00dd\u00de\7\7\2\2\u00de\u00df\7\17\2\2\u00df\u00e0\5\30\r\2\u00e0"+
		"\u00e1\7\20\2\2\u00e1\u00e5\3\2\2\2\u00e2\u00e5\7\30\2\2\u00e3\u00e5\7"+
		"\31\2\2\u00e4\u00cb\3\2\2\2\u00e4\u00d0\3\2\2\2\u00e4\u00d5\3\2\2\2\u00e4"+
		"\u00dd\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e4\u00e3\3\2\2\2\u00e5\27\3\2\2"+
		"\2\u00e6\u00e7\b\r\1\2\u00e7\u00ed\7\64\2\2\u00e8\u00ed\7\b\2\2\u00e9"+
		"\u00ed\7\t\2\2\u00ea\u00ed\7\n\2\2\u00eb\u00ed\5\26\f\2\u00ec\u00e6\3"+
		"\2\2\2\u00ec\u00e8\3\2\2\2\u00ec\u00e9\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00eb\3\2\2\2\u00ed\u013b\3\2\2\2\u00ee\u00f2\f\7\2\2\u00ef\u00f1\7\r"+
		"\2\2\u00f0\u00ef\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2"+
		"\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5\u00f9\7 "+
		"\2\2\u00f6\u00f8\7\r\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2\2\2\u00f9"+
		"\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb\u00f9\3\2"+
		"\2\2\u00fc\u013a\5\30\r\b\u00fd\u0101\f\6\2\2\u00fe\u0100\7\r\2\2\u00ff"+
		"\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0102\3\2"+
		"\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104\u0108\t\2\2\2\u0105"+
		"\u0107\7\r\2\2\u0106\u0105\3\2\2\2\u0107\u010a\3\2\2\2\u0108\u0106\3\2"+
		"\2\2\u0108\u0109\3\2\2\2\u0109\u010b\3\2\2\2\u010a\u0108\3\2\2\2\u010b"+
		"\u013a\5\30\r\7\u010c\u0110\f\5\2\2\u010d\u010f\7\r\2\2\u010e\u010d\3"+
		"\2\2\2\u010f\u0112\3\2\2\2\u0110\u010e\3\2\2\2\u0110\u0111\3\2\2\2\u0111"+
		"\u0113\3\2\2\2\u0112\u0110\3\2\2\2\u0113\u0117\t\3\2\2\u0114\u0116\7\r"+
		"\2\2\u0115\u0114\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u013a\5\30"+
		"\r\6\u011b\u011f\f\4\2\2\u011c\u011e\7\r\2\2\u011d\u011c\3\2\2\2\u011e"+
		"\u0121\3\2\2\2\u011f\u011d\3\2\2\2\u011f\u0120\3\2\2\2\u0120\u0122\3\2"+
		"\2\2\u0121\u011f\3\2\2\2\u0122\u0126\7\37\2\2\u0123\u0125\7\r\2\2\u0124"+
		"\u0123\3\2\2\2\u0125\u0128\3\2\2\2\u0126\u0124\3\2\2\2\u0126\u0127\3\2"+
		"\2\2\u0127\u0129\3\2\2\2\u0128\u0126\3\2\2\2\u0129\u013a\5\30\r\5\u012a"+
		"\u012e\f\3\2\2\u012b\u012d\7\r\2\2\u012c\u012b\3\2\2\2\u012d\u0130\3\2"+
		"\2\2\u012e\u012c\3\2\2\2\u012e\u012f\3\2\2\2\u012f\u0131\3\2\2\2\u0130"+
		"\u012e\3\2\2\2\u0131\u0135\t\4\2\2\u0132\u0134\7\r\2\2\u0133\u0132\3\2"+
		"\2\2\u0134\u0137\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0136\3\2\2\2\u0136"+
		"\u0138\3\2\2\2\u0137\u0135\3\2\2\2\u0138\u013a\5\30\r\4\u0139\u00ee\3"+
		"\2\2\2\u0139\u00fd\3\2\2\2\u0139\u010c\3\2\2\2\u0139\u011b\3\2\2\2\u0139"+
		"\u012a\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013b\u013c\3\2"+
		"\2\2\u013c\31\3\2\2\2\u013d\u013b\3\2\2\2\u013e\u0142\7\17\2\2\u013f\u0141"+
		"\7\r\2\2\u0140\u013f\3\2\2\2\u0141\u0144\3\2\2\2\u0142\u0140\3\2\2\2\u0142"+
		"\u0143\3\2\2\2\u0143\u0145\3\2\2\2\u0144\u0142\3\2\2\2\u0145\u0149\5\30"+
		"\r\2\u0146\u0148\7\r\2\2\u0147\u0146\3\2\2\2\u0148\u014b\3\2\2\2\u0149"+
		"\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b\u0149\3\2"+
		"\2\2\u014c\u0150\t\5\2\2\u014d\u014f\7\r\2\2\u014e\u014d\3\2\2\2\u014f"+
		"\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0153\u0157\5\30\r\2\u0154\u0156\7\r\2\2\u0155"+
		"\u0154\3\2\2\2\u0156\u0159\3\2\2\2\u0157\u0155\3\2\2\2\u0157\u0158\3\2"+
		"\2\2\u0158\u015a\3\2\2\2\u0159\u0157\3\2\2\2\u015a\u015b\7\20\2\2\u015b"+
		"\u016f\3\2\2\2\u015c\u0160\5\30\r\2\u015d\u015f\7\r\2\2\u015e\u015d\3"+
		"\2\2\2\u015f\u0162\3\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0163\3\2\2\2\u0162\u0160\3\2\2\2\u0163\u0167\t\5\2\2\u0164\u0166\7\r"+
		"\2\2\u0165\u0164\3\2\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167"+
		"\u0168\3\2\2\2\u0168\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016b\5\30"+
		"\r\2\u016b\u016f\3\2\2\2\u016c\u016f\7\61\2\2\u016d\u016f\7\62\2\2\u016e"+
		"\u013e\3\2\2\2\u016e\u015c\3\2\2\2\u016e\u016c\3\2\2\2\u016e\u016d\3\2"+
		"\2\2\u016f\33\3\2\2\2\u0170\u0172\7\r\2\2\u0171\u0170\3\2\2\2\u0172\u0175"+
		"\3\2\2\2\u0173\u0171\3\2\2\2\u0173\u0174\3\2\2\2\u0174\u0184\3\2\2\2\u0175"+
		"\u0173\3\2\2\2\u0176\u017a\5\32\16\2\u0177\u0179\7\r\2\2\u0178\u0177\3"+
		"\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178\3\2\2\2\u017a\u017b\3\2\2\2\u017b"+
		"\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d\u0181\7.\2\2\u017e\u0180\7\r"+
		"\2\2\u017f\u017e\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0181"+
		"\u0182\3\2\2\2\u0182\u0185\3\2\2\2\u0183\u0181\3\2\2\2\u0184\u0176\3\2"+
		"\2\2\u0185\u0186\3\2\2\2\u0186\u0184\3\2\2\2\u0186\u0187\3\2\2\2\u0187"+
		"\u0188\3\2\2\2\u0188\u018c\5\32\16\2\u0189\u018b\7\r\2\2\u018a\u0189\3"+
		"\2\2\2\u018b\u018e\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018d\3\2\2\2\u018d"+
		"\u01d0\3\2\2\2\u018e\u018c\3\2\2\2\u018f\u0191\7\r\2\2\u0190\u018f\3\2"+
		"\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0192\u0193\3\2\2\2\u0193"+
		"\u01a3\3\2\2\2\u0194\u0192\3\2\2\2\u0195\u0199\5\32\16\2\u0196\u0198\7"+
		"\r\2\2\u0197\u0196\3\2\2\2\u0198\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019c\3\2\2\2\u019b\u0199\3\2\2\2\u019c\u01a0\7/"+
		"\2\2\u019d\u019f\7\r\2\2\u019e\u019d\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0"+
		"\u019e\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u01a4\3\2\2\2\u01a2\u01a0\3\2"+
		"\2\2\u01a3\u0195\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5"+
		"\u01a6\3\2\2\2\u01a6\u01a7\3\2\2\2\u01a7\u01ab\5\32\16\2\u01a8\u01aa\7"+
		"\r\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ad\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab"+
		"\u01ac\3\2\2\2\u01ac\u01d0\3\2\2\2\u01ad\u01ab\3\2\2\2\u01ae\u01b0\7\r"+
		"\2\2\u01af\u01ae\3\2\2\2\u01b0\u01b3\3\2\2\2\u01b1\u01af\3\2\2\2\u01b1"+
		"\u01b2\3\2\2\2\u01b2\u01b4\3\2\2\2\u01b3\u01b1\3\2\2\2\u01b4\u01b8\5\32"+
		"\16\2\u01b5\u01b7\7\r\2\2\u01b6\u01b5\3\2\2\2\u01b7\u01ba\3\2\2\2\u01b8"+
		"\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01d0\3\2\2\2\u01ba\u01b8\3\2"+
		"\2\2\u01bb\u01bd\7\r\2\2\u01bc\u01bb\3\2\2\2\u01bd\u01c0\3\2\2\2\u01be"+
		"\u01bc\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c1\3\2\2\2\u01c0\u01be\3\2"+
		"\2\2\u01c1\u01c5\7\60\2\2\u01c2\u01c4\7\r\2\2\u01c3\u01c2\3\2\2\2\u01c4"+
		"\u01c7\3\2\2\2\u01c5\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c8\3\2"+
		"\2\2\u01c7\u01c5\3\2\2\2\u01c8\u01cc\5\32\16\2\u01c9\u01cb\7\r\2\2\u01ca"+
		"\u01c9\3\2\2\2\u01cb\u01ce\3\2\2\2\u01cc\u01ca\3\2\2\2\u01cc\u01cd\3\2"+
		"\2\2\u01cd\u01d0\3\2\2\2\u01ce\u01cc\3\2\2\2\u01cf\u0173\3\2\2\2\u01cf"+
		"\u0192\3\2\2\2\u01cf\u01b1\3\2\2\2\u01cf\u01be\3\2\2\2\u01d0\35\3\2\2"+
		"\2\u01d1\u01d5\7\64\2\2\u01d2\u01d4\7\r\2\2\u01d3\u01d2\3\2\2\2\u01d4"+
		"\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2"+
		"\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01dc\t\6\2\2\u01d9\u01db\7\r\2\2\u01da"+
		"\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2"+
		"\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e0\5\30\r\2\u01e0"+
		"\37\3\2\2\2=#.\67<DLUbhq~\u0084\u008e\u0094\u009a\u00a3\u00af\u00b5\u00bc"+
		"\u00c3\u00e4\u00ec\u00f2\u00f9\u0101\u0108\u0110\u0117\u011f\u0126\u012e"+
		"\u0135\u0139\u013b\u0142\u0149\u0150\u0157\u0160\u0167\u016e\u0173\u017a"+
		"\u0181\u0186\u018c\u0192\u0199\u01a0\u01a5\u01ab\u01b1\u01b8\u01be\u01c5"+
		"\u01cc\u01cf\u01d5\u01dc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}