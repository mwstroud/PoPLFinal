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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, NEWLINE=6, INT=7, FLOAT=8, STRING=9, 
		WHITESPACE=10, COLON=11, OPEN_PAR=12, CLOSE_PAR=13, OPEN_BRAC=14, CLOSE_BRAC=15, 
		IF=16, ELIF=17, ELSE=18, WHILE=19, FOR=20, BREAK=21, CONTINUE=22, IN=23, 
		PLUS=24, MINUS=25, TIMES=26, DIV=27, MOD=28, POW=29, ASSIGN=30, INCREMENT=31, 
		DECREMENT=32, MULT_EQ=33, DIV_EQ=34, POW_EQ=35, MOD_EQ=36, LESS=37, LESS_EQ=38, 
		GREATER=39, GREATER_EQ=40, EQUAL=41, NOT_EQUAL=42, AND=43, OR=44, NOT=45, 
		TRUE=46, FALSE=47, COMMENT=48, VAR=49, INDENT=50, DEDENT=51;
	public static final int
		RULE_start = 0, RULE_block = 1, RULE_line = 2, RULE_comment = 3, RULE_tab_block = 4, 
		RULE_if_block = 5, RULE_elif_block = 6, RULE_else_block = 7, RULE_while_block = 8, 
		RULE_for_block = 9, RULE_function = 10, RULE_statement = 11, RULE_expr = 12, 
		RULE_bool = 13, RULE_conditional = 14, RULE_assignment = 15;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "block", "line", "comment", "tab_block", "if_block", "elif_block", 
			"else_block", "while_block", "for_block", "function", "statement", "expr", 
			"bool", "conditional", "assignment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'str'", "'int'", "'range'", "','", "'print'", null, null, null, 
			null, null, "':'", "'('", "')'", "'['", "']'", "'if'", "'elif'", "'else'", 
			"'while'", "'for'", "'break'", "'continue'", "'in'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'**'", "'='", "'+='", "'-='", "'*='", "'/='", "'**='", 
			"'%='", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'and'", "'or'", 
			"'not'", "'True'", "'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "NEWLINE", "INT", "FLOAT", "STRING", 
			"WHITESPACE", "COLON", "OPEN_PAR", "CLOSE_PAR", "OPEN_BRAC", "CLOSE_BRAC", 
			"IF", "ELIF", "ELSE", "WHILE", "FOR", "BREAK", "CONTINUE", "IN", "PLUS", 
			"MINUS", "TIMES", "DIV", "MOD", "POW", "ASSIGN", "INCREMENT", "DECREMENT", 
			"MULT_EQ", "DIV_EQ", "POW_EQ", "MOD_EQ", "LESS", "LESS_EQ", "GREATER", 
			"GREATER_EQ", "EQUAL", "NOT_EQUAL", "AND", "OR", "NOT", "TRUE", "FALSE", 
			"COMMENT", "VAR", "INDENT", "DEDENT"
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
			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << NEWLINE) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << WHITESPACE) | (1L << IF) | (1L << ELIF) | (1L << ELSE) | (1L << WHILE) | (1L << FOR) | (1L << BREAK) | (1L << CONTINUE) | (1L << MINUS) | (1L << COMMENT) | (1L << VAR))) != 0)) {
				{
				{
				setState(32);
				block();
				}
				}
				setState(37);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(38);
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
			setState(46);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				if_block();
				}
				break;
			case ELIF:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				elif_block();
				}
				break;
			case ELSE:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				else_block();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				while_block();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
				for_block();
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__4:
			case NEWLINE:
			case INT:
			case FLOAT:
			case STRING:
			case WHITESPACE:
			case BREAK:
			case CONTINUE:
			case MINUS:
			case COMMENT:
			case VAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(45);
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
		public TerminalNode NEWLINE() { return getToken(supercritParser.NEWLINE, 0); }
		public CommentContext comment() {
			return getRuleContext(CommentContext.class,0);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(supercritParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(supercritParser.WHITESPACE, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
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
			setState(68);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(48);
				assignment();
				setState(49);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				assignment();
				setState(52);
				comment();
				setState(53);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(55);
				comment();
				setState(56);
				match(NEWLINE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(59); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(58);
					match(WHITESPACE);
					}
					}
					setState(61); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHITESPACE );
				setState(63);
				match(NEWLINE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(64);
				expr(0);
				setState(65);
				match(NEWLINE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				match(NEWLINE);
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
			setState(70);
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
		public TerminalNode INDENT() { return getToken(supercritParser.INDENT, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public TerminalNode DEDENT() { return getToken(supercritParser.DEDENT, 0); }
		public Tab_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tab_block; }
	}

	public final Tab_blockContext tab_block() throws RecognitionException {
		Tab_blockContext _localctx = new Tab_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tab_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			match(INDENT);
			setState(73);
			block();
			setState(74);
			match(DEDENT);
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
			setState(102);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(76);
				match(IF);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(77);
					match(WHITESPACE);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(OPEN_PAR);
				setState(84);
				conditional();
				setState(85);
				match(CLOSE_PAR);
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(86);
					match(WHITESPACE);
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
				match(COLON);
				setState(93);
				match(NEWLINE);
				setState(94);
				tab_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				match(IF);
				setState(97);
				conditional();
				setState(98);
				match(COLON);
				setState(99);
				match(NEWLINE);
				setState(100);
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
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(ELIF);
				setState(108);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(105);
					match(WHITESPACE);
					}
					}
					setState(110);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(111);
				match(OPEN_PAR);
				setState(112);
				conditional();
				setState(113);
				match(CLOSE_PAR);
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(114);
					match(WHITESPACE);
					}
					}
					setState(119);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(120);
				match(COLON);
				setState(121);
				match(NEWLINE);
				setState(122);
				tab_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(ELIF);
				setState(125);
				conditional();
				setState(126);
				match(COLON);
				setState(127);
				match(NEWLINE);
				setState(128);
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
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(132);
				match(ELSE);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(133);
					match(WHITESPACE);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				match(COLON);
				setState(140);
				match(NEWLINE);
				setState(141);
				tab_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(142);
				match(ELSE);
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(143);
					match(WHITESPACE);
					}
					}
					setState(148);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(149);
				match(COLON);
				setState(150);
				match(NEWLINE);
				setState(151);
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
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				match(WHILE);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(155);
					match(WHITESPACE);
					}
					}
					setState(160);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(161);
				match(OPEN_PAR);
				setState(162);
				conditional();
				setState(163);
				match(CLOSE_PAR);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(164);
					match(WHITESPACE);
					}
					}
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(170);
				match(COLON);
				setState(171);
				tab_block();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(WHILE);
				setState(174);
				conditional();
				setState(175);
				match(COLON);
				setState(176);
				match(NEWLINE);
				setState(177);
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
		public List<TerminalNode> VAR() { return getTokens(supercritParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(supercritParser.VAR, i);
		}
		public TerminalNode IN() { return getToken(supercritParser.IN, 0); }
		public TerminalNode COLON() { return getToken(supercritParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(supercritParser.NEWLINE, 0); }
		public Tab_blockContext tab_block() {
			return getRuleContext(Tab_blockContext.class,0);
		}
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
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
			setState(181);
			match(FOR);
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(182);
				match(WHITESPACE);
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(VAR);
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(189);
				match(WHITESPACE);
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(IN);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(196);
				match(WHITESPACE);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				setState(202);
				match(VAR);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__4:
			case BREAK:
			case CONTINUE:
				{
				setState(203);
				function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(206);
			match(COLON);
			setState(207);
			match(NEWLINE);
			setState(208);
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
			int _alt;
			setState(240);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(T__0);
				setState(211);
				match(OPEN_PAR);
				setState(212);
				expr(0);
				setState(213);
				match(CLOSE_PAR);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(T__1);
				setState(216);
				match(OPEN_PAR);
				setState(217);
				expr(0);
				setState(218);
				match(CLOSE_PAR);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(220);
				match(T__2);
				setState(221);
				match(OPEN_PAR);
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(222);
						expr(0);
						setState(223);
						match(T__3);
						}
						} 
					}
					setState(229);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
				}
				setState(230);
				expr(0);
				setState(231);
				match(CLOSE_PAR);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(233);
				match(T__4);
				setState(234);
				match(OPEN_PAR);
				setState(235);
				expr(0);
				setState(236);
				match(CLOSE_PAR);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				match(BREAK);
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
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
		enterRule(_localctx, 22, RULE_statement);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				conditional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
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
		public TerminalNode VAR() { return getToken(supercritParser.VAR, 0); }
		public TerminalNode INT() { return getToken(supercritParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(supercritParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(supercritParser.STRING, 0); }
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode POW() { return getToken(supercritParser.POW, 0); }
		public TerminalNode TIMES() { return getToken(supercritParser.TIMES, 0); }
		public TerminalNode DIV() { return getToken(supercritParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(supercritParser.PLUS, 0); }
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
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				setState(248);
				match(MINUS);
				setState(249);
				expr(11);
				}
				break;
			case VAR:
				{
				setState(250);
				match(VAR);
				}
				break;
			case INT:
				{
				setState(251);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(252);
				match(FLOAT);
				}
				break;
			case STRING:
				{
				setState(253);
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
				setState(254);
				function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(274);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(272);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(257);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(258);
						match(POW);
						setState(259);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(260);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(261);
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
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(263);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(264);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(265);
						expr(4);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(266);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(267);
						match(MOD);
						setState(268);
						expr(3);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(269);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(270);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(271);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(276);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		enterRule(_localctx, 26, RULE_bool);
		int _la;
		try {
			setState(325);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(OPEN_PAR);
				setState(281);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(278);
					match(WHITESPACE);
					}
					}
					setState(283);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(284);
				expr(0);
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(285);
					match(WHITESPACE);
					}
					}
					setState(290);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(291);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESS_EQ) | (1L << GREATER) | (1L << GREATER_EQ) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(292);
					match(WHITESPACE);
					}
					}
					setState(297);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(298);
				expr(0);
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(299);
					match(WHITESPACE);
					}
					}
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(305);
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
			case MINUS:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(307);
				expr(0);
				setState(311);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(308);
					match(WHITESPACE);
					}
					}
					setState(313);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(314);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESS_EQ) | (1L << GREATER) | (1L << GREATER_EQ) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(318);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(315);
					match(WHITESPACE);
					}
					}
					setState(320);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(321);
				expr(0);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(323);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(324);
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
		enterRule(_localctx, 28, RULE_conditional);
		int _la;
		try {
			int _alt;
			setState(422);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(327);
					match(WHITESPACE);
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(347); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(333);
						bool();
						setState(337);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(334);
							match(WHITESPACE);
							}
							}
							setState(339);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(340);
						match(AND);
						setState(344);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(341);
							match(WHITESPACE);
							}
							}
							setState(346);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(349); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,36,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(351);
				bool();
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(352);
					match(WHITESPACE);
					}
					}
					setState(357);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(358);
					match(WHITESPACE);
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(378); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(364);
						bool();
						setState(368);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(365);
							match(WHITESPACE);
							}
							}
							setState(370);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(371);
						match(OR);
						setState(375);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(372);
							match(WHITESPACE);
							}
							}
							setState(377);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(380); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(382);
				bool();
				setState(386);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(383);
					match(WHITESPACE);
					}
					}
					setState(388);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(389);
					match(WHITESPACE);
					}
					}
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(395);
				bool();
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(396);
					match(WHITESPACE);
					}
					}
					setState(401);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(405);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(402);
					match(WHITESPACE);
					}
					}
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(408);
				match(NOT);
				setState(412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(409);
					match(WHITESPACE);
					}
					}
					setState(414);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(415);
				bool();
				setState(419);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(416);
					match(WHITESPACE);
					}
					}
					setState(421);
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
		enterRule(_localctx, 30, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(424);
			match(VAR);
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(425);
				match(WHITESPACE);
				}
				}
				setState(430);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(431);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << MULT_EQ) | (1L << DIV_EQ) | (1L << POW_EQ) | (1L << MOD_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(435);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(432);
				match(WHITESPACE);
				}
				}
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(438);
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
		case 12:
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\65\u01bb\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\7\2"+
		"$\n\2\f\2\16\2\'\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\61\n\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\6\4>\n\4\r\4\16\4?\3\4\3\4\3\4"+
		"\3\4\3\4\5\4G\n\4\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\7\7Q\n\7\f\7\16\7T\13"+
		"\7\3\7\3\7\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\5\7i\n\7\3\b\3\b\7\bm\n\b\f\b\16\bp\13\b\3\b\3\b\3\b\3\b"+
		"\7\bv\n\b\f\b\16\by\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0085"+
		"\n\b\3\t\3\t\7\t\u0089\n\t\f\t\16\t\u008c\13\t\3\t\3\t\3\t\3\t\3\t\7\t"+
		"\u0093\n\t\f\t\16\t\u0096\13\t\3\t\3\t\3\t\5\t\u009b\n\t\3\n\3\n\7\n\u009f"+
		"\n\n\f\n\16\n\u00a2\13\n\3\n\3\n\3\n\3\n\7\n\u00a8\n\n\f\n\16\n\u00ab"+
		"\13\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00b6\n\n\3\13\3\13\7\13"+
		"\u00ba\n\13\f\13\16\13\u00bd\13\13\3\13\3\13\7\13\u00c1\n\13\f\13\16\13"+
		"\u00c4\13\13\3\13\3\13\7\13\u00c8\n\13\f\13\16\13\u00cb\13\13\3\13\3\13"+
		"\5\13\u00cf\n\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00e4\n\f\f\f\16\f\u00e7\13\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00f3\n\f\3\r\3\r\3\r\5\r\u00f8\n\r"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0102\n\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u0113"+
		"\n\16\f\16\16\16\u0116\13\16\3\17\3\17\7\17\u011a\n\17\f\17\16\17\u011d"+
		"\13\17\3\17\3\17\7\17\u0121\n\17\f\17\16\17\u0124\13\17\3\17\3\17\7\17"+
		"\u0128\n\17\f\17\16\17\u012b\13\17\3\17\3\17\7\17\u012f\n\17\f\17\16\17"+
		"\u0132\13\17\3\17\3\17\3\17\3\17\7\17\u0138\n\17\f\17\16\17\u013b\13\17"+
		"\3\17\3\17\7\17\u013f\n\17\f\17\16\17\u0142\13\17\3\17\3\17\3\17\3\17"+
		"\5\17\u0148\n\17\3\20\7\20\u014b\n\20\f\20\16\20\u014e\13\20\3\20\3\20"+
		"\7\20\u0152\n\20\f\20\16\20\u0155\13\20\3\20\3\20\7\20\u0159\n\20\f\20"+
		"\16\20\u015c\13\20\6\20\u015e\n\20\r\20\16\20\u015f\3\20\3\20\7\20\u0164"+
		"\n\20\f\20\16\20\u0167\13\20\3\20\7\20\u016a\n\20\f\20\16\20\u016d\13"+
		"\20\3\20\3\20\7\20\u0171\n\20\f\20\16\20\u0174\13\20\3\20\3\20\7\20\u0178"+
		"\n\20\f\20\16\20\u017b\13\20\6\20\u017d\n\20\r\20\16\20\u017e\3\20\3\20"+
		"\7\20\u0183\n\20\f\20\16\20\u0186\13\20\3\20\7\20\u0189\n\20\f\20\16\20"+
		"\u018c\13\20\3\20\3\20\7\20\u0190\n\20\f\20\16\20\u0193\13\20\3\20\7\20"+
		"\u0196\n\20\f\20\16\20\u0199\13\20\3\20\3\20\7\20\u019d\n\20\f\20\16\20"+
		"\u01a0\13\20\3\20\3\20\7\20\u01a4\n\20\f\20\16\20\u01a7\13\20\5\20\u01a9"+
		"\n\20\3\21\3\21\7\21\u01ad\n\21\f\21\16\21\u01b0\13\21\3\21\3\21\7\21"+
		"\u01b4\n\21\f\21\16\21\u01b7\13\21\3\21\3\21\3\21\2\3\32\22\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \2\7\3\2\34\35\3\2\32\33\3\2+,\3\2\',\3"+
		"\2 &\2\u01f5\2%\3\2\2\2\4\60\3\2\2\2\6F\3\2\2\2\bH\3\2\2\2\nJ\3\2\2\2"+
		"\fh\3\2\2\2\16\u0084\3\2\2\2\20\u009a\3\2\2\2\22\u00b5\3\2\2\2\24\u00b7"+
		"\3\2\2\2\26\u00f2\3\2\2\2\30\u00f7\3\2\2\2\32\u0101\3\2\2\2\34\u0147\3"+
		"\2\2\2\36\u01a8\3\2\2\2 \u01aa\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$\'\3\2\2"+
		"\2%#\3\2\2\2%&\3\2\2\2&(\3\2\2\2\'%\3\2\2\2()\7\2\2\3)\3\3\2\2\2*\61\5"+
		"\f\7\2+\61\5\16\b\2,\61\5\20\t\2-\61\5\22\n\2.\61\5\24\13\2/\61\5\6\4"+
		"\2\60*\3\2\2\2\60+\3\2\2\2\60,\3\2\2\2\60-\3\2\2\2\60.\3\2\2\2\60/\3\2"+
		"\2\2\61\5\3\2\2\2\62\63\5 \21\2\63\64\7\b\2\2\64G\3\2\2\2\65\66\5 \21"+
		"\2\66\67\5\b\5\2\678\7\b\2\28G\3\2\2\29:\5\b\5\2:;\7\b\2\2;G\3\2\2\2<"+
		">\7\f\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2\2?@\3\2\2\2@A\3\2\2\2AG\7\b\2\2"+
		"BC\5\32\16\2CD\7\b\2\2DG\3\2\2\2EG\7\b\2\2F\62\3\2\2\2F\65\3\2\2\2F9\3"+
		"\2\2\2F=\3\2\2\2FB\3\2\2\2FE\3\2\2\2G\7\3\2\2\2HI\7\62\2\2I\t\3\2\2\2"+
		"JK\7\64\2\2KL\5\4\3\2LM\7\65\2\2M\13\3\2\2\2NR\7\22\2\2OQ\7\f\2\2PO\3"+
		"\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\16\2\2VW"+
		"\5\36\20\2W[\7\17\2\2XZ\7\f\2\2YX\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2"+
		"\2\\^\3\2\2\2][\3\2\2\2^_\7\r\2\2_`\7\b\2\2`a\5\n\6\2ai\3\2\2\2bc\7\22"+
		"\2\2cd\5\36\20\2de\7\r\2\2ef\7\b\2\2fg\5\n\6\2gi\3\2\2\2hN\3\2\2\2hb\3"+
		"\2\2\2i\r\3\2\2\2jn\7\23\2\2km\7\f\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2n"+
		"o\3\2\2\2oq\3\2\2\2pn\3\2\2\2qr\7\16\2\2rs\5\36\20\2sw\7\17\2\2tv\7\f"+
		"\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\r"+
		"\2\2{|\7\b\2\2|}\5\n\6\2}\u0085\3\2\2\2~\177\7\23\2\2\177\u0080\5\36\20"+
		"\2\u0080\u0081\7\r\2\2\u0081\u0082\7\b\2\2\u0082\u0083\5\n\6\2\u0083\u0085"+
		"\3\2\2\2\u0084j\3\2\2\2\u0084~\3\2\2\2\u0085\17\3\2\2\2\u0086\u008a\7"+
		"\24\2\2\u0087\u0089\7\f\2\2\u0088\u0087\3\2\2\2\u0089\u008c\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008d\3\2\2\2\u008c\u008a\3\2"+
		"\2\2\u008d\u008e\7\r\2\2\u008e\u008f\7\b\2\2\u008f\u009b\5\n\6\2\u0090"+
		"\u0094\7\24\2\2\u0091\u0093\7\f\2\2\u0092\u0091\3\2\2\2\u0093\u0096\3"+
		"\2\2\2\u0094\u0092\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0097\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0097\u0098\7\r\2\2\u0098\u0099\7\b\2\2\u0099\u009b\5\n"+
		"\6\2\u009a\u0086\3\2\2\2\u009a\u0090\3\2\2\2\u009b\21\3\2\2\2\u009c\u00a0"+
		"\7\25\2\2\u009d\u009f\7\f\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2"+
		"\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u00a0"+
		"\3\2\2\2\u00a3\u00a4\7\16\2\2\u00a4\u00a5\5\36\20\2\u00a5\u00a9\7\17\2"+
		"\2\u00a6\u00a8\7\f\2\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ac\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac"+
		"\u00ad\7\r\2\2\u00ad\u00ae\5\n\6\2\u00ae\u00b6\3\2\2\2\u00af\u00b0\7\25"+
		"\2\2\u00b0\u00b1\5\36\20\2\u00b1\u00b2\7\r\2\2\u00b2\u00b3\7\b\2\2\u00b3"+
		"\u00b4\5\n\6\2\u00b4\u00b6\3\2\2\2\u00b5\u009c\3\2\2\2\u00b5\u00af\3\2"+
		"\2\2\u00b6\23\3\2\2\2\u00b7\u00bb\7\26\2\2\u00b8\u00ba\7\f\2\2\u00b9\u00b8"+
		"\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00c2\7\63\2\2\u00bf\u00c1\7"+
		"\f\2\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c9\7\31"+
		"\2\2\u00c6\u00c8\7\f\2\2\u00c7\u00c6\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00ce\3\2\2\2\u00cb\u00c9\3\2"+
		"\2\2\u00cc\u00cf\7\63\2\2\u00cd\u00cf\5\26\f\2\u00ce\u00cc\3\2\2\2\u00ce"+
		"\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\7\r\2\2\u00d1\u00d2\7\b"+
		"\2\2\u00d2\u00d3\5\n\6\2\u00d3\25\3\2\2\2\u00d4\u00d5\7\3\2\2\u00d5\u00d6"+
		"\7\16\2\2\u00d6\u00d7\5\32\16\2\u00d7\u00d8\7\17\2\2\u00d8\u00f3\3\2\2"+
		"\2\u00d9\u00da\7\4\2\2\u00da\u00db\7\16\2\2\u00db\u00dc\5\32\16\2\u00dc"+
		"\u00dd\7\17\2\2\u00dd\u00f3\3\2\2\2\u00de\u00df\7\5\2\2\u00df\u00e5\7"+
		"\16\2\2\u00e0\u00e1\5\32\16\2\u00e1\u00e2\7\6\2\2\u00e2\u00e4\3\2\2\2"+
		"\u00e3\u00e0\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6"+
		"\3\2\2\2\u00e6\u00e8\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e8\u00e9\5\32\16\2"+
		"\u00e9\u00ea\7\17\2\2\u00ea\u00f3\3\2\2\2\u00eb\u00ec\7\7\2\2\u00ec\u00ed"+
		"\7\16\2\2\u00ed\u00ee\5\32\16\2\u00ee\u00ef\7\17\2\2\u00ef\u00f3\3\2\2"+
		"\2\u00f0\u00f3\7\27\2\2\u00f1\u00f3\7\30\2\2\u00f2\u00d4\3\2\2\2\u00f2"+
		"\u00d9\3\2\2\2\u00f2\u00de\3\2\2\2\u00f2\u00eb\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f2\u00f1\3\2\2\2\u00f3\27\3\2\2\2\u00f4\u00f8\5\32\16\2\u00f5"+
		"\u00f8\5\36\20\2\u00f6\u00f8\5 \21\2\u00f7\u00f4\3\2\2\2\u00f7\u00f5\3"+
		"\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\31\3\2\2\2\u00f9\u00fa\b\16\1\2\u00fa"+
		"\u00fb\7\33\2\2\u00fb\u0102\5\32\16\r\u00fc\u0102\7\63\2\2\u00fd\u0102"+
		"\7\t\2\2\u00fe\u0102\7\n\2\2\u00ff\u0102\7\13\2\2\u0100\u0102\5\26\f\2"+
		"\u0101\u00f9\3\2\2\2\u0101\u00fc\3\2\2\2\u0101\u00fd\3\2\2\2\u0101\u00fe"+
		"\3\2\2\2\u0101\u00ff\3\2\2\2\u0101\u0100\3\2\2\2\u0102\u0114\3\2\2\2\u0103"+
		"\u0104\f\7\2\2\u0104\u0105\7\37\2\2\u0105\u0113\5\32\16\b\u0106\u0107"+
		"\f\6\2\2\u0107\u0108\t\2\2\2\u0108\u0113\5\32\16\7\u0109\u010a\f\5\2\2"+
		"\u010a\u010b\t\3\2\2\u010b\u0113\5\32\16\6\u010c\u010d\f\4\2\2\u010d\u010e"+
		"\7\36\2\2\u010e\u0113\5\32\16\5\u010f\u0110\f\3\2\2\u0110\u0111\t\4\2"+
		"\2\u0111\u0113\5\32\16\4\u0112\u0103\3\2\2\2\u0112\u0106\3\2\2\2\u0112"+
		"\u0109\3\2\2\2\u0112\u010c\3\2\2\2\u0112\u010f\3\2\2\2\u0113\u0116\3\2"+
		"\2\2\u0114\u0112\3\2\2\2\u0114\u0115\3\2\2\2\u0115\33\3\2\2\2\u0116\u0114"+
		"\3\2\2\2\u0117\u011b\7\16\2\2\u0118\u011a\7\f\2\2\u0119\u0118\3\2\2\2"+
		"\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u011e"+
		"\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0122\5\32\16\2\u011f\u0121\7\f\2\2"+
		"\u0120\u011f\3\2\2\2\u0121\u0124\3\2\2\2\u0122\u0120\3\2\2\2\u0122\u0123"+
		"\3\2\2\2\u0123\u0125\3\2\2\2\u0124\u0122\3\2\2\2\u0125\u0129\t\5\2\2\u0126"+
		"\u0128\7\f\2\2\u0127\u0126\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u0127\3\2"+
		"\2\2\u0129\u012a\3\2\2\2\u012a\u012c\3\2\2\2\u012b\u0129\3\2\2\2\u012c"+
		"\u0130\5\32\16\2\u012d\u012f\7\f\2\2\u012e\u012d\3\2\2\2\u012f\u0132\3"+
		"\2\2\2\u0130\u012e\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u0133\3\2\2\2\u0132"+
		"\u0130\3\2\2\2\u0133\u0134\7\17\2\2\u0134\u0148\3\2\2\2\u0135\u0139\5"+
		"\32\16\2\u0136\u0138\7\f\2\2\u0137\u0136\3\2\2\2\u0138\u013b\3\2\2\2\u0139"+
		"\u0137\3\2\2\2\u0139\u013a\3\2\2\2\u013a\u013c\3\2\2\2\u013b\u0139\3\2"+
		"\2\2\u013c\u0140\t\5\2\2\u013d\u013f\7\f\2\2\u013e\u013d\3\2\2\2\u013f"+
		"\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2\2\2\u0141\u0143\3\2"+
		"\2\2\u0142\u0140\3\2\2\2\u0143\u0144\5\32\16\2\u0144\u0148\3\2\2\2\u0145"+
		"\u0148\7\60\2\2\u0146\u0148\7\61\2\2\u0147\u0117\3\2\2\2\u0147\u0135\3"+
		"\2\2\2\u0147\u0145\3\2\2\2\u0147\u0146\3\2\2\2\u0148\35\3\2\2\2\u0149"+
		"\u014b\7\f\2\2\u014a\u0149\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2"+
		"\2\2\u014c\u014d\3\2\2\2\u014d\u015d\3\2\2\2\u014e\u014c\3\2\2\2\u014f"+
		"\u0153\5\34\17\2\u0150\u0152\7\f\2\2\u0151\u0150\3\2\2\2\u0152\u0155\3"+
		"\2\2\2\u0153\u0151\3\2\2\2\u0153\u0154\3\2\2\2\u0154\u0156\3\2\2\2\u0155"+
		"\u0153\3\2\2\2\u0156\u015a\7-\2\2\u0157\u0159\7\f\2\2\u0158\u0157\3\2"+
		"\2\2\u0159\u015c\3\2\2\2\u015a\u0158\3\2\2\2\u015a\u015b\3\2\2\2\u015b"+
		"\u015e\3\2\2\2\u015c\u015a\3\2\2\2\u015d\u014f\3\2\2\2\u015e\u015f\3\2"+
		"\2\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\3\2\2\2\u0161"+
		"\u0165\5\34\17\2\u0162\u0164\7\f\2\2\u0163\u0162\3\2\2\2\u0164\u0167\3"+
		"\2\2\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u01a9\3\2\2\2\u0167"+
		"\u0165\3\2\2\2\u0168\u016a\7\f\2\2\u0169\u0168\3\2\2\2\u016a\u016d\3\2"+
		"\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u017c\3\2\2\2\u016d"+
		"\u016b\3\2\2\2\u016e\u0172\5\34\17\2\u016f\u0171\7\f\2\2\u0170\u016f\3"+
		"\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0179\7.\2\2\u0176\u0178\7\f"+
		"\2\2\u0177\u0176\3\2\2\2\u0178\u017b\3\2\2\2\u0179\u0177\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017d\3\2\2\2\u017b\u0179\3\2\2\2\u017c\u016e\3\2"+
		"\2\2\u017d\u017e\3\2\2\2\u017e\u017c\3\2\2\2\u017e\u017f\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0184\5\34\17\2\u0181\u0183\7\f\2\2\u0182\u0181\3"+
		"\2\2\2\u0183\u0186\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0185\3\2\2\2\u0185"+
		"\u01a9\3\2\2\2\u0186\u0184\3\2\2\2\u0187\u0189\7\f\2\2\u0188\u0187\3\2"+
		"\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u0191\5\34\17\2\u018e\u0190\7"+
		"\f\2\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u01a9\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0196\7\f"+
		"\2\2\u0195\u0194\3\2\2\2\u0196\u0199\3\2\2\2\u0197\u0195\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u019a\3\2\2\2\u0199\u0197\3\2\2\2\u019a\u019e\7/"+
		"\2\2\u019b\u019d\7\f\2\2\u019c\u019b\3\2\2\2\u019d\u01a0\3\2\2\2\u019e"+
		"\u019c\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a1\3\2\2\2\u01a0\u019e\3\2"+
		"\2\2\u01a1\u01a5\5\34\17\2\u01a2\u01a4\7\f\2\2\u01a3\u01a2\3\2\2\2\u01a4"+
		"\u01a7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a9\3\2"+
		"\2\2\u01a7\u01a5\3\2\2\2\u01a8\u014c\3\2\2\2\u01a8\u016b\3\2\2\2\u01a8"+
		"\u018a\3\2\2\2\u01a8\u0197\3\2\2\2\u01a9\37\3\2\2\2\u01aa\u01ae\7\63\2"+
		"\2\u01ab\u01ad\7\f\2\2\u01ac\u01ab\3\2\2\2\u01ad\u01b0\3\2\2\2\u01ae\u01ac"+
		"\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b1\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b1"+
		"\u01b5\t\6\2\2\u01b2\u01b4\7\f\2\2\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2"+
		"\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b8\3\2\2\2\u01b7"+
		"\u01b5\3\2\2\2\u01b8\u01b9\5\32\16\2\u01b9!\3\2\2\2\65%\60?FR[hnw\u0084"+
		"\u008a\u0094\u009a\u00a0\u00a9\u00b5\u00bb\u00c2\u00c9\u00ce\u00e5\u00f2"+
		"\u00f7\u0101\u0112\u0114\u011b\u0122\u0129\u0130\u0139\u0140\u0147\u014c"+
		"\u0153\u015a\u015f\u0165\u016b\u0172\u0179\u017e\u0184\u018a\u0191\u0197"+
		"\u019e\u01a5\u01a8\u01ae\u01b5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}