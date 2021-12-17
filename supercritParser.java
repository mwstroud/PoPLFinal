// Generated from supercrit.g4 by ANTLR 4.9.2
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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, INT=6, FLOAT=7, STRING=8, NEWLINE=9, 
		TAB=10, WHITESPACE=11, COLON=12, OPEN_PAR=13, CLOSE_PAR=14, OPEN_BRAC=15, 
		CLOSE_BRAC=16, IF=17, ELIF=18, ELSE=19, WHILE=20, FOR=21, BREAK=22, CONTINUE=23, 
		PLUS=24, MINUS=25, TIMES=26, DIV=27, MOD=28, POW=29, ASSIGN=30, INCREMENT=31, 
		DECREMENT=32, MULT_EQ=33, DIV_EQ=34, POW_EQ=35, MOD_EQ=36, LESS=37, LESS_EQ=38, 
		GREATER=39, GREATER_EQ=40, EQUAL=41, NOT_EQUAL=42, AND=43, OR=44, NOT=45, 
		TRUE=46, FALSE=47, COMMENT=48, VAR=49;
	public static final int
		RULE_start = 0, RULE_block = 1, RULE_line = 2, RULE_comment = 3, RULE_if_block = 4, 
		RULE_while_block = 5, RULE_for_block = 6, RULE_function = 7, RULE_statement = 8, 
		RULE_expr = 9, RULE_bool = 10, RULE_conditional = 11, RULE_assignment = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "block", "line", "comment", "if_block", "while_block", "for_block", 
			"function", "statement", "expr", "bool", "conditional", "assignment"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'str'", "'int'", "'range'", "','", "'print'", null, null, null, 
			null, "'\t'", null, "':'", "'('", "')'", "'['", "']'", "'if'", "'elif'", 
			"'else'", "'while'", "'for'", "'break'", "'continue'", "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'**'", "'='", "'+='", "'-='", "'*='", "'/='", "'**='", 
			"'%='", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'and'", "'or'", 
			"'not'", "'True'", "'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "INT", "FLOAT", "STRING", "NEWLINE", 
			"TAB", "WHITESPACE", "COLON", "OPEN_PAR", "CLOSE_PAR", "OPEN_BRAC", "CLOSE_BRAC", 
			"IF", "ELIF", "ELSE", "WHILE", "FOR", "BREAK", "CONTINUE", "PLUS", "MINUS", 
			"TIMES", "DIV", "MOD", "POW", "ASSIGN", "INCREMENT", "DECREMENT", "MULT_EQ", 
			"DIV_EQ", "POW_EQ", "MOD_EQ", "LESS", "LESS_EQ", "GREATER", "GREATER_EQ", 
			"EQUAL", "NOT_EQUAL", "AND", "OR", "NOT", "TRUE", "FALSE", "COMMENT", 
			"VAR"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << T__2) | (1L << T__4) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << NEWLINE) | (1L << WHITESPACE) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << MINUS) | (1L << COMMENT) | (1L << VAR))) != 0)) {
				{
				{
				setState(26);
				block();
				}
				}
				setState(31);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(32);
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
		public LineContext line() {
			return getRuleContext(LineContext.class,0);
		}
		public If_blockContext if_block() {
			return getRuleContext(If_blockContext.class,0);
		}
		public While_blockContext while_block() {
			return getRuleContext(While_blockContext.class,0);
		}
		public For_blockContext for_block() {
			return getRuleContext(For_blockContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(supercritParser.NEWLINE, 0); }
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case T__1:
			case T__2:
			case T__4:
			case INT:
			case FLOAT:
			case STRING:
			case WHITESPACE:
			case MINUS:
			case COMMENT:
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				line();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(35);
				if_block();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(36);
				while_block();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(37);
				for_block();
				}
				break;
			case NEWLINE:
				enterOuterAlt(_localctx, 5);
				{
				setState(38);
				match(NEWLINE);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_line);
		int _la;
		try {
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				assignment();
				setState(42);
				match(NEWLINE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				assignment();
				setState(45);
				comment();
				setState(46);
				match(NEWLINE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(48);
				comment();
				setState(49);
				match(NEWLINE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(51);
					match(WHITESPACE);
					}
					}
					setState(54); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHITESPACE );
				setState(56);
				match(NEWLINE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(57);
				expr(0);
				setState(58);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_comment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
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

	public static class If_blockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(supercritParser.IF, 0); }
		public List<TerminalNode> OPEN_PAR() { return getTokens(supercritParser.OPEN_PAR); }
		public TerminalNode OPEN_PAR(int i) {
			return getToken(supercritParser.OPEN_PAR, i);
		}
		public List<ConditionalContext> conditional() {
			return getRuleContexts(ConditionalContext.class);
		}
		public ConditionalContext conditional(int i) {
			return getRuleContext(ConditionalContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAR() { return getTokens(supercritParser.CLOSE_PAR); }
		public TerminalNode CLOSE_PAR(int i) {
			return getToken(supercritParser.CLOSE_PAR, i);
		}
		public List<TerminalNode> COLON() { return getTokens(supercritParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(supercritParser.COLON, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(supercritParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(supercritParser.NEWLINE, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(supercritParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(supercritParser.WHITESPACE, i);
		}
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
		public List<TerminalNode> ELIF() { return getTokens(supercritParser.ELIF); }
		public TerminalNode ELIF(int i) {
			return getToken(supercritParser.ELIF, i);
		}
		public TerminalNode ELSE() { return getToken(supercritParser.ELSE, 0); }
		public If_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).enterIf_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).exitIf_block(this);
		}
	}

	public final If_blockContext if_block() throws RecognitionException {
		If_blockContext _localctx = new If_blockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_if_block);
		int _la;
		try {
			int _alt;
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(IF);
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(65);
					match(WHITESPACE);
					}
					}
					setState(70);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(71);
				match(OPEN_PAR);
				setState(72);
				conditional();
				setState(73);
				match(CLOSE_PAR);
				setState(77);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(74);
					match(WHITESPACE);
					}
					}
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(80);
				match(COLON);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(81);
					match(WHITESPACE);
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(87);
				match(NEWLINE);
				setState(90); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(88);
						match(TAB);
						setState(89);
						block();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(92); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(94);
						match(ELIF);
						setState(98);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(95);
							match(WHITESPACE);
							}
							}
							setState(100);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(101);
						match(OPEN_PAR);
						setState(102);
						conditional();
						setState(103);
						match(CLOSE_PAR);
						setState(107);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(104);
							match(WHITESPACE);
							}
							}
							setState(109);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(110);
						match(COLON);
						setState(114);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(111);
							match(WHITESPACE);
							}
							}
							setState(116);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(117);
						match(NEWLINE);
						setState(120); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(118);
								match(TAB);
								setState(119);
								block();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(122); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						} 
					}
					setState(128);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				setState(150);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
				case 1:
					{
					setState(129);
					match(ELSE);
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WHITESPACE) {
						{
						{
						setState(130);
						match(WHITESPACE);
						}
						}
						setState(135);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(136);
					match(COLON);
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
					match(NEWLINE);
					setState(146); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(144);
							match(TAB);
							setState(145);
							block();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(148); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(152);
				match(IF);
				setState(153);
				conditional();
				setState(154);
				match(COLON);
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
				match(NEWLINE);
				setState(164); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(162);
						match(TAB);
						setState(163);
						block();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(166); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(186);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(168);
						match(ELIF);
						setState(169);
						conditional();
						setState(170);
						match(COLON);
						setState(174);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(171);
							match(WHITESPACE);
							}
							}
							setState(176);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(177);
						match(NEWLINE);
						setState(180); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(178);
								match(TAB);
								setState(179);
								block();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(182); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						} 
					}
					setState(188);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
				}
				setState(210);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(189);
					match(ELSE);
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
					match(COLON);
					setState(200);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==WHITESPACE) {
						{
						{
						setState(197);
						match(WHITESPACE);
						}
						}
						setState(202);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(203);
					match(NEWLINE);
					setState(206); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(204);
							match(TAB);
							setState(205);
							block();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(208); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					break;
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

	public static class While_blockContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(supercritParser.WHILE, 0); }
		public TerminalNode OPEN_PAR() { return getToken(supercritParser.OPEN_PAR, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(supercritParser.CLOSE_PAR, 0); }
		public TerminalNode COLON() { return getToken(supercritParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(supercritParser.NEWLINE, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(supercritParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(supercritParser.WHITESPACE, i);
		}
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
		public While_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).enterWhile_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).exitWhile_block(this);
		}
	}

	public final While_blockContext while_block() throws RecognitionException {
		While_blockContext _localctx = new While_blockContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_while_block);
		int _la;
		try {
			int _alt;
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(WHILE);
				setState(218);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(215);
					match(WHITESPACE);
					}
					}
					setState(220);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(221);
				match(OPEN_PAR);
				setState(222);
				conditional();
				setState(223);
				match(CLOSE_PAR);
				setState(224);
				match(COLON);
				setState(225);
				match(NEWLINE);
				setState(228); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(226);
						match(TAB);
						setState(227);
						block();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(230); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(WHILE);
				setState(233);
				conditional();
				setState(234);
				match(COLON);
				setState(235);
				match(NEWLINE);
				setState(238); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(236);
						match(TAB);
						setState(237);
						block();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(240); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public TerminalNode OPEN_PAR() { return getToken(supercritParser.OPEN_PAR, 0); }
		public ConditionalContext conditional() {
			return getRuleContext(ConditionalContext.class,0);
		}
		public TerminalNode CLOSE_PAR() { return getToken(supercritParser.CLOSE_PAR, 0); }
		public TerminalNode COLON() { return getToken(supercritParser.COLON, 0); }
		public TerminalNode NEWLINE() { return getToken(supercritParser.NEWLINE, 0); }
		public List<TerminalNode> WHITESPACE() { return getTokens(supercritParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(supercritParser.WHITESPACE, i);
		}
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
		public For_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).enterFor_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).exitFor_block(this);
		}
	}

	public final For_blockContext for_block() throws RecognitionException {
		For_blockContext _localctx = new For_blockContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_for_block);
		int _la;
		try {
			int _alt;
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				match(FOR);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(245);
					match(WHITESPACE);
					}
					}
					setState(250);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(251);
				match(OPEN_PAR);
				setState(252);
				conditional();
				setState(253);
				match(CLOSE_PAR);
				setState(254);
				match(COLON);
				setState(255);
				match(NEWLINE);
				setState(258); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(256);
						match(TAB);
						setState(257);
						block();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(260); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(262);
				match(FOR);
				setState(263);
				conditional();
				setState(264);
				match(COLON);
				setState(265);
				match(NEWLINE);
				setState(268); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(266);
						match(TAB);
						setState(267);
						block();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(270); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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

	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(supercritParser.OPEN_PAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CLOSE_PAR() { return getToken(supercritParser.CLOSE_PAR, 0); }
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).exitFunction(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_function);
		try {
			int _alt;
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				match(T__0);
				setState(275);
				match(OPEN_PAR);
				setState(276);
				expr(0);
				setState(277);
				match(CLOSE_PAR);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(279);
				match(T__1);
				setState(280);
				match(OPEN_PAR);
				setState(281);
				expr(0);
				setState(282);
				match(CLOSE_PAR);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(T__2);
				setState(285);
				match(OPEN_PAR);
				setState(291);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(286);
						expr(0);
						setState(287);
						match(T__3);
						}
						} 
					}
					setState(293);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				setState(294);
				expr(0);
				setState(295);
				match(CLOSE_PAR);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 4);
				{
				setState(297);
				match(T__4);
				setState(298);
				match(OPEN_PAR);
				setState(299);
				expr(0);
				setState(300);
				match(CLOSE_PAR);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_statement);
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				conditional();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).exitExpr(this);
		}
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
			setState(317);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				setState(310);
				match(MINUS);
				setState(311);
				expr(11);
				}
				break;
			case VAR:
				{
				setState(312);
				match(VAR);
				}
				break;
			case INT:
				{
				setState(313);
				match(INT);
				}
				break;
			case FLOAT:
				{
				setState(314);
				match(FLOAT);
				}
				break;
			case STRING:
				{
				setState(315);
				match(STRING);
				}
				break;
			case T__0:
			case T__1:
			case T__2:
			case T__4:
				{
				setState(316);
				function();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(336);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(334);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(319);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(320);
						match(POW);
						setState(321);
						expr(6);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(322);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(323);
						_la = _input.LA(1);
						if ( !(_la==TIMES || _la==DIV) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(324);
						expr(5);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(325);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(326);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(327);
						expr(4);
						}
						break;
					case 4:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(328);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(329);
						match(MOD);
						setState(330);
						expr(3);
						}
						break;
					case 5:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(331);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(332);
						_la = _input.LA(1);
						if ( !(_la==EQUAL || _la==NOT_EQUAL) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(333);
						expr(2);
						}
						break;
					}
					} 
				}
				setState(338);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,40,_ctx);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bool);
		int _la;
		try {
			setState(387);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(339);
				match(OPEN_PAR);
				setState(343);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(340);
					match(WHITESPACE);
					}
					}
					setState(345);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
				setState(364);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(361);
					match(WHITESPACE);
					}
					}
					setState(366);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(367);
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
			case MINUS:
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(369);
				expr(0);
				setState(373);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(370);
					match(WHITESPACE);
					}
					}
					setState(375);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(376);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS) | (1L << LESS_EQ) | (1L << GREATER) | (1L << GREATER_EQ) | (1L << EQUAL) | (1L << NOT_EQUAL))) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(377);
					match(WHITESPACE);
					}
					}
					setState(382);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(383);
				expr(0);
				}
				break;
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(385);
				match(TRUE);
				}
				break;
			case FALSE:
				enterOuterAlt(_localctx, 4);
				{
				setState(386);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).enterConditional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).exitConditional(this);
		}
	}

	public final ConditionalContext conditional() throws RecognitionException {
		ConditionalContext _localctx = new ConditionalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_conditional);
		int _la;
		try {
			int _alt;
			setState(484);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
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
				setState(409); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
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
						setState(402);
						match(AND);
						setState(406);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(403);
							match(WHITESPACE);
							}
							}
							setState(408);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(411); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(413);
				bool();
				setState(417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(414);
					match(WHITESPACE);
					}
					}
					setState(419);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(420);
					match(WHITESPACE);
					}
					}
					setState(425);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(440); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(426);
						bool();
						setState(430);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(427);
							match(WHITESPACE);
							}
							}
							setState(432);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						setState(433);
						match(OR);
						setState(437);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==WHITESPACE) {
							{
							{
							setState(434);
							match(WHITESPACE);
							}
							}
							setState(439);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(442); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				setState(444);
				bool();
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(445);
					match(WHITESPACE);
					}
					}
					setState(450);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(454);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(451);
					match(WHITESPACE);
					}
					}
					setState(456);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(457);
				bool();
				setState(461);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(458);
					match(WHITESPACE);
					}
					}
					setState(463);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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
				match(NOT);
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
				bool();
				setState(481);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHITESPACE) {
					{
					{
					setState(478);
					match(WHITESPACE);
					}
					}
					setState(483);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof supercritListener ) ((supercritListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			match(VAR);
			setState(490);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(487);
				match(WHITESPACE);
				}
				}
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(493);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ASSIGN) | (1L << INCREMENT) | (1L << DECREMENT) | (1L << MULT_EQ) | (1L << DIV_EQ) | (1L << POW_EQ) | (1L << MOD_EQ))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(497);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==WHITESPACE) {
				{
				{
				setState(494);
				match(WHITESPACE);
				}
				}
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(500);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u01f9\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\3\2\7\2\36\n\2\f\2\16\2!\13\2\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\3\5\3*\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\6\4\67\n\4\r\4\16\48\3\4\3\4\3\4\3\4\5\4?\n\4\3\5\3\5\3\6\3\6\7\6"+
		"E\n\6\f\6\16\6H\13\6\3\6\3\6\3\6\3\6\7\6N\n\6\f\6\16\6Q\13\6\3\6\3\6\7"+
		"\6U\n\6\f\6\16\6X\13\6\3\6\3\6\3\6\6\6]\n\6\r\6\16\6^\3\6\3\6\7\6c\n\6"+
		"\f\6\16\6f\13\6\3\6\3\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\6\3\6\7\6s\n"+
		"\6\f\6\16\6v\13\6\3\6\3\6\3\6\6\6{\n\6\r\6\16\6|\7\6\177\n\6\f\6\16\6"+
		"\u0082\13\6\3\6\3\6\7\6\u0086\n\6\f\6\16\6\u0089\13\6\3\6\3\6\7\6\u008d"+
		"\n\6\f\6\16\6\u0090\13\6\3\6\3\6\3\6\6\6\u0095\n\6\r\6\16\6\u0096\5\6"+
		"\u0099\n\6\3\6\3\6\3\6\3\6\7\6\u009f\n\6\f\6\16\6\u00a2\13\6\3\6\3\6\3"+
		"\6\6\6\u00a7\n\6\r\6\16\6\u00a8\3\6\3\6\3\6\3\6\7\6\u00af\n\6\f\6\16\6"+
		"\u00b2\13\6\3\6\3\6\3\6\6\6\u00b7\n\6\r\6\16\6\u00b8\7\6\u00bb\n\6\f\6"+
		"\16\6\u00be\13\6\3\6\3\6\7\6\u00c2\n\6\f\6\16\6\u00c5\13\6\3\6\3\6\7\6"+
		"\u00c9\n\6\f\6\16\6\u00cc\13\6\3\6\3\6\3\6\6\6\u00d1\n\6\r\6\16\6\u00d2"+
		"\5\6\u00d5\n\6\5\6\u00d7\n\6\3\7\3\7\7\7\u00db\n\7\f\7\16\7\u00de\13\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00e7\n\7\r\7\16\7\u00e8\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\6\7\u00f1\n\7\r\7\16\7\u00f2\5\7\u00f5\n\7\3\b\3\b\7\b\u00f9"+
		"\n\b\f\b\16\b\u00fc\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u0105\n\b\r\b"+
		"\16\b\u0106\3\b\3\b\3\b\3\b\3\b\3\b\6\b\u010f\n\b\r\b\16\b\u0110\5\b\u0113"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0124"+
		"\n\t\f\t\16\t\u0127\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0131\n\t"+
		"\3\n\3\n\3\n\5\n\u0136\n\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"\u0140\n\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\7\13\u0151\n\13\f\13\16\13\u0154\13\13\3\f\3\f\7\f\u0158"+
		"\n\f\f\f\16\f\u015b\13\f\3\f\3\f\7\f\u015f\n\f\f\f\16\f\u0162\13\f\3\f"+
		"\3\f\7\f\u0166\n\f\f\f\16\f\u0169\13\f\3\f\3\f\7\f\u016d\n\f\f\f\16\f"+
		"\u0170\13\f\3\f\3\f\3\f\3\f\7\f\u0176\n\f\f\f\16\f\u0179\13\f\3\f\3\f"+
		"\7\f\u017d\n\f\f\f\16\f\u0180\13\f\3\f\3\f\3\f\3\f\5\f\u0186\n\f\3\r\7"+
		"\r\u0189\n\r\f\r\16\r\u018c\13\r\3\r\3\r\7\r\u0190\n\r\f\r\16\r\u0193"+
		"\13\r\3\r\3\r\7\r\u0197\n\r\f\r\16\r\u019a\13\r\6\r\u019c\n\r\r\r\16\r"+
		"\u019d\3\r\3\r\7\r\u01a2\n\r\f\r\16\r\u01a5\13\r\3\r\7\r\u01a8\n\r\f\r"+
		"\16\r\u01ab\13\r\3\r\3\r\7\r\u01af\n\r\f\r\16\r\u01b2\13\r\3\r\3\r\7\r"+
		"\u01b6\n\r\f\r\16\r\u01b9\13\r\6\r\u01bb\n\r\r\r\16\r\u01bc\3\r\3\r\7"+
		"\r\u01c1\n\r\f\r\16\r\u01c4\13\r\3\r\7\r\u01c7\n\r\f\r\16\r\u01ca\13\r"+
		"\3\r\3\r\7\r\u01ce\n\r\f\r\16\r\u01d1\13\r\3\r\7\r\u01d4\n\r\f\r\16\r"+
		"\u01d7\13\r\3\r\3\r\7\r\u01db\n\r\f\r\16\r\u01de\13\r\3\r\3\r\7\r\u01e2"+
		"\n\r\f\r\16\r\u01e5\13\r\5\r\u01e7\n\r\3\16\3\16\7\16\u01eb\n\16\f\16"+
		"\16\16\u01ee\13\16\3\16\3\16\7\16\u01f2\n\16\f\16\16\16\u01f5\13\16\3"+
		"\16\3\16\3\16\2\3\24\17\2\4\6\b\n\f\16\20\22\24\26\30\32\2\7\3\2\34\35"+
		"\3\2\32\33\3\2+,\3\2\',\3\2 &\2\u0241\2\37\3\2\2\2\4)\3\2\2\2\6>\3\2\2"+
		"\2\b@\3\2\2\2\n\u00d6\3\2\2\2\f\u00f4\3\2\2\2\16\u0112\3\2\2\2\20\u0130"+
		"\3\2\2\2\22\u0135\3\2\2\2\24\u013f\3\2\2\2\26\u0185\3\2\2\2\30\u01e6\3"+
		"\2\2\2\32\u01e8\3\2\2\2\34\36\5\4\3\2\35\34\3\2\2\2\36!\3\2\2\2\37\35"+
		"\3\2\2\2\37 \3\2\2\2 \"\3\2\2\2!\37\3\2\2\2\"#\7\2\2\3#\3\3\2\2\2$*\5"+
		"\6\4\2%*\5\n\6\2&*\5\f\7\2\'*\5\16\b\2(*\7\13\2\2)$\3\2\2\2)%\3\2\2\2"+
		")&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\5\3\2\2\2+,\5\32\16\2,-\7\13\2\2-?\3"+
		"\2\2\2./\5\32\16\2/\60\5\b\5\2\60\61\7\13\2\2\61?\3\2\2\2\62\63\5\b\5"+
		"\2\63\64\7\13\2\2\64?\3\2\2\2\65\67\7\r\2\2\66\65\3\2\2\2\678\3\2\2\2"+
		"8\66\3\2\2\289\3\2\2\29:\3\2\2\2:?\7\13\2\2;<\5\24\13\2<=\7\13\2\2=?\3"+
		"\2\2\2>+\3\2\2\2>.\3\2\2\2>\62\3\2\2\2>\66\3\2\2\2>;\3\2\2\2?\7\3\2\2"+
		"\2@A\7\62\2\2A\t\3\2\2\2BF\7\23\2\2CE\7\r\2\2DC\3\2\2\2EH\3\2\2\2FD\3"+
		"\2\2\2FG\3\2\2\2GI\3\2\2\2HF\3\2\2\2IJ\7\17\2\2JK\5\30\r\2KO\7\20\2\2"+
		"LN\7\r\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2PR\3\2\2\2QO\3\2\2\2"+
		"RV\7\16\2\2SU\7\r\2\2TS\3\2\2\2UX\3\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2"+
		"\2XV\3\2\2\2Y\\\7\13\2\2Z[\7\f\2\2[]\5\4\3\2\\Z\3\2\2\2]^\3\2\2\2^\\\3"+
		"\2\2\2^_\3\2\2\2_\u0080\3\2\2\2`d\7\24\2\2ac\7\r\2\2ba\3\2\2\2cf\3\2\2"+
		"\2db\3\2\2\2de\3\2\2\2eg\3\2\2\2fd\3\2\2\2gh\7\17\2\2hi\5\30\r\2im\7\20"+
		"\2\2jl\7\r\2\2kj\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3\2\2\2np\3\2\2\2om\3\2"+
		"\2\2pt\7\16\2\2qs\7\r\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2\2\2uw\3"+
		"\2\2\2vt\3\2\2\2wz\7\13\2\2xy\7\f\2\2y{\5\4\3\2zx\3\2\2\2{|\3\2\2\2|z"+
		"\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~`\3\2\2\2\177\u0082\3\2\2\2\u0080~\3\2"+
		"\2\2\u0080\u0081\3\2\2\2\u0081\u0098\3\2\2\2\u0082\u0080\3\2\2\2\u0083"+
		"\u0087\7\25\2\2\u0084\u0086\7\r\2\2\u0085\u0084\3\2\2\2\u0086\u0089\3"+
		"\2\2\2\u0087\u0085\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089"+
		"\u0087\3\2\2\2\u008a\u008e\7\16\2\2\u008b\u008d\7\r\2\2\u008c\u008b\3"+
		"\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2\2\2\u008f"+
		"\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0094\7\13\2\2\u0092\u0093\7"+
		"\f\2\2\u0093\u0095\5\4\3\2\u0094\u0092\3\2\2\2\u0095\u0096\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098\u0083\3\2"+
		"\2\2\u0098\u0099\3\2\2\2\u0099\u00d7\3\2\2\2\u009a\u009b\7\23\2\2\u009b"+
		"\u009c\5\30\r\2\u009c\u00a0\7\16\2\2\u009d\u009f\7\r\2\2\u009e\u009d\3"+
		"\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1"+
		"\u00a3\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a6\7\13\2\2\u00a4\u00a5\7"+
		"\f\2\2\u00a5\u00a7\5\4\3\2\u00a6\u00a4\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\u00bc\3\2\2\2\u00aa\u00ab\7\24"+
		"\2\2\u00ab\u00ac\5\30\r\2\u00ac\u00b0\7\16\2\2\u00ad\u00af\7\r\2\2\u00ae"+
		"\u00ad\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b6\7\13\2\2\u00b4"+
		"\u00b5\7\f\2\2\u00b5\u00b7\5\4\3\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00bb\3\2\2\2\u00ba"+
		"\u00aa\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2"+
		"\2\2\u00bd\u00d4\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c3\7\25\2\2\u00c0"+
		"\u00c2\7\r\2\2\u00c1\u00c0\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6"+
		"\u00ca\7\16\2\2\u00c7\u00c9\7\r\2\2\u00c8\u00c7\3\2\2\2\u00c9\u00cc\3"+
		"\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00ca\3\2\2\2\u00cd\u00d0\7\13\2\2\u00ce\u00cf\7\f\2\2\u00cf\u00d1\5"+
		"\4\3\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2"+
		"\u00d3\3\2\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00bf\3\2\2\2\u00d4\u00d5\3\2"+
		"\2\2\u00d5\u00d7\3\2\2\2\u00d6B\3\2\2\2\u00d6\u009a\3\2\2\2\u00d7\13\3"+
		"\2\2\2\u00d8\u00dc\7\26\2\2\u00d9\u00db\7\r\2\2\u00da\u00d9\3\2\2\2\u00db"+
		"\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2"+
		"\2\2\u00de\u00dc\3\2\2\2\u00df\u00e0\7\17\2\2\u00e0\u00e1\5\30\r\2\u00e1"+
		"\u00e2\7\20\2\2\u00e2\u00e3\7\16\2\2\u00e3\u00e6\7\13\2\2\u00e4\u00e5"+
		"\7\f\2\2\u00e5\u00e7\5\4\3\2\u00e6\u00e4\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00f5\3\2\2\2\u00ea\u00eb\7\26"+
		"\2\2\u00eb\u00ec\5\30\r\2\u00ec\u00ed\7\16\2\2\u00ed\u00f0\7\13\2\2\u00ee"+
		"\u00ef\7\f\2\2\u00ef\u00f1\5\4\3\2\u00f0\u00ee\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f5\3\2\2\2\u00f4"+
		"\u00d8\3\2\2\2\u00f4\u00ea\3\2\2\2\u00f5\r\3\2\2\2\u00f6\u00fa\7\27\2"+
		"\2\u00f7\u00f9\7\r\2\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8"+
		"\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd"+
		"\u00fe\7\17\2\2\u00fe\u00ff\5\30\r\2\u00ff\u0100\7\20\2\2\u0100\u0101"+
		"\7\16\2\2\u0101\u0104\7\13\2\2\u0102\u0103\7\f\2\2\u0103\u0105\5\4\3\2"+
		"\u0104\u0102\3\2\2\2\u0105\u0106\3\2\2\2\u0106\u0104\3\2\2\2\u0106\u0107"+
		"\3\2\2\2\u0107\u0113\3\2\2\2\u0108\u0109\7\27\2\2\u0109\u010a\5\30\r\2"+
		"\u010a\u010b\7\16\2\2\u010b\u010e\7\13\2\2\u010c\u010d\7\f\2\2\u010d\u010f"+
		"\5\4\3\2\u010e\u010c\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0113\3\2\2\2\u0112\u00f6\3\2\2\2\u0112\u0108\3\2"+
		"\2\2\u0113\17\3\2\2\2\u0114\u0115\7\3\2\2\u0115\u0116\7\17\2\2\u0116\u0117"+
		"\5\24\13\2\u0117\u0118\7\20\2\2\u0118\u0131\3\2\2\2\u0119\u011a\7\4\2"+
		"\2\u011a\u011b\7\17\2\2\u011b\u011c\5\24\13\2\u011c\u011d\7\20\2\2\u011d"+
		"\u0131\3\2\2\2\u011e\u011f\7\5\2\2\u011f\u0125\7\17\2\2\u0120\u0121\5"+
		"\24\13\2\u0121\u0122\7\6\2\2\u0122\u0124\3\2\2\2\u0123\u0120\3\2\2\2\u0124"+
		"\u0127\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0126\3\2\2\2\u0126\u0128\3\2"+
		"\2\2\u0127\u0125\3\2\2\2\u0128\u0129\5\24\13\2\u0129\u012a\7\20\2\2\u012a"+
		"\u0131\3\2\2\2\u012b\u012c\7\7\2\2\u012c\u012d\7\17\2\2\u012d\u012e\5"+
		"\24\13\2\u012e\u012f\7\20\2\2\u012f\u0131\3\2\2\2\u0130\u0114\3\2\2\2"+
		"\u0130\u0119\3\2\2\2\u0130\u011e\3\2\2\2\u0130\u012b\3\2\2\2\u0131\21"+
		"\3\2\2\2\u0132\u0136\5\24\13\2\u0133\u0136\5\30\r\2\u0134\u0136\5\32\16"+
		"\2\u0135\u0132\3\2\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136\23"+
		"\3\2\2\2\u0137\u0138\b\13\1\2\u0138\u0139\7\33\2\2\u0139\u0140\5\24\13"+
		"\r\u013a\u0140\7\63\2\2\u013b\u0140\7\b\2\2\u013c\u0140\7\t\2\2\u013d"+
		"\u0140\7\n\2\2\u013e\u0140\5\20\t\2\u013f\u0137\3\2\2\2\u013f\u013a\3"+
		"\2\2\2\u013f\u013b\3\2\2\2\u013f\u013c\3\2\2\2\u013f\u013d\3\2\2\2\u013f"+
		"\u013e\3\2\2\2\u0140\u0152\3\2\2\2\u0141\u0142\f\7\2\2\u0142\u0143\7\37"+
		"\2\2\u0143\u0151\5\24\13\b\u0144\u0145\f\6\2\2\u0145\u0146\t\2\2\2\u0146"+
		"\u0151\5\24\13\7\u0147\u0148\f\5\2\2\u0148\u0149\t\3\2\2\u0149\u0151\5"+
		"\24\13\6\u014a\u014b\f\4\2\2\u014b\u014c\7\36\2\2\u014c\u0151\5\24\13"+
		"\5\u014d\u014e\f\3\2\2\u014e\u014f\t\4\2\2\u014f\u0151\5\24\13\4\u0150"+
		"\u0141\3\2\2\2\u0150\u0144\3\2\2\2\u0150\u0147\3\2\2\2\u0150\u014a\3\2"+
		"\2\2\u0150\u014d\3\2\2\2\u0151\u0154\3\2\2\2\u0152\u0150\3\2\2\2\u0152"+
		"\u0153\3\2\2\2\u0153\25\3\2\2\2\u0154\u0152\3\2\2\2\u0155\u0159\7\17\2"+
		"\2\u0156\u0158\7\r\2\2\u0157\u0156\3\2\2\2\u0158\u015b\3\2\2\2\u0159\u0157"+
		"\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u015c\3\2\2\2\u015b\u0159\3\2\2\2\u015c"+
		"\u0160\5\24\13\2\u015d\u015f\7\r\2\2\u015e\u015d\3\2\2\2\u015f\u0162\3"+
		"\2\2\2\u0160\u015e\3\2\2\2\u0160\u0161\3\2\2\2\u0161\u0163\3\2\2\2\u0162"+
		"\u0160\3\2\2\2\u0163\u0167\t\5\2\2\u0164\u0166\7\r\2\2\u0165\u0164\3\2"+
		"\2\2\u0166\u0169\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168"+
		"\u016a\3\2\2\2\u0169\u0167\3\2\2\2\u016a\u016e\5\24\13\2\u016b\u016d\7"+
		"\r\2\2\u016c\u016b\3\2\2\2\u016d\u0170\3\2\2\2\u016e\u016c\3\2\2\2\u016e"+
		"\u016f\3\2\2\2\u016f\u0171\3\2\2\2\u0170\u016e\3\2\2\2\u0171\u0172\7\20"+
		"\2\2\u0172\u0186\3\2\2\2\u0173\u0177\5\24\13\2\u0174\u0176\7\r\2\2\u0175"+
		"\u0174\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0177\u0178\3\2"+
		"\2\2\u0178\u017a\3\2\2\2\u0179\u0177\3\2\2\2\u017a\u017e\t\5\2\2\u017b"+
		"\u017d\7\r\2\2\u017c\u017b\3\2\2\2\u017d\u0180\3\2\2\2\u017e\u017c\3\2"+
		"\2\2\u017e\u017f\3\2\2\2\u017f\u0181\3\2\2\2\u0180\u017e\3\2\2\2\u0181"+
		"\u0182\5\24\13\2\u0182\u0186\3\2\2\2\u0183\u0186\7\60\2\2\u0184\u0186"+
		"\7\61\2\2\u0185\u0155\3\2\2\2\u0185\u0173\3\2\2\2\u0185\u0183\3\2\2\2"+
		"\u0185\u0184\3\2\2\2\u0186\27\3\2\2\2\u0187\u0189\7\r\2\2\u0188\u0187"+
		"\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2\2\2\u018b"+
		"\u019b\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u0191\5\26\f\2\u018e\u0190\7"+
		"\r\2\2\u018f\u018e\3\2\2\2\u0190\u0193\3\2\2\2\u0191\u018f\3\2\2\2\u0191"+
		"\u0192\3\2\2\2\u0192\u0194\3\2\2\2\u0193\u0191\3\2\2\2\u0194\u0198\7-"+
		"\2\2\u0195\u0197\7\r\2\2\u0196\u0195\3\2\2\2\u0197\u019a\3\2\2\2\u0198"+
		"\u0196\3\2\2\2\u0198\u0199\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2"+
		"\2\2\u019b\u018d\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u019b\3\2\2\2\u019d"+
		"\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f\u01a3\5\26\f\2\u01a0\u01a2\7"+
		"\r\2\2\u01a1\u01a0\3\2\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a3"+
		"\u01a4\3\2\2\2\u01a4\u01e7\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01a8\7\r"+
		"\2\2\u01a7\u01a6\3\2\2\2\u01a8\u01ab\3\2\2\2\u01a9\u01a7\3\2\2\2\u01a9"+
		"\u01aa\3\2\2\2\u01aa\u01ba\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ac\u01b0\5\26"+
		"\f\2\u01ad\u01af\7\r\2\2\u01ae\u01ad\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0"+
		"\u01ae\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b3\3\2\2\2\u01b2\u01b0\3\2"+
		"\2\2\u01b3\u01b7\7.\2\2\u01b4\u01b6\7\r\2\2\u01b5\u01b4\3\2\2\2\u01b6"+
		"\u01b9\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b7\u01b8\3\2\2\2\u01b8\u01bb\3\2"+
		"\2\2\u01b9\u01b7\3\2\2\2\u01ba\u01ac\3\2\2\2\u01bb\u01bc\3\2\2\2\u01bc"+
		"\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01be\3\2\2\2\u01be\u01c2\5\26"+
		"\f\2\u01bf\u01c1\7\r\2\2\u01c0\u01bf\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2"+
		"\u01c0\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01e7\3\2\2\2\u01c4\u01c2\3\2"+
		"\2\2\u01c5\u01c7\7\r\2\2\u01c6\u01c5\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8"+
		"\u01c6\3\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01c8\3\2"+
		"\2\2\u01cb\u01cf\5\26\f\2\u01cc\u01ce\7\r\2\2\u01cd\u01cc\3\2\2\2\u01ce"+
		"\u01d1\3\2\2\2\u01cf\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01e7\3\2"+
		"\2\2\u01d1\u01cf\3\2\2\2\u01d2\u01d4\7\r\2\2\u01d3\u01d2\3\2\2\2\u01d4"+
		"\u01d7\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d8\3\2"+
		"\2\2\u01d7\u01d5\3\2\2\2\u01d8\u01dc\7/\2\2\u01d9\u01db\7\r\2\2\u01da"+
		"\u01d9\3\2\2\2\u01db\u01de\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc\u01dd\3\2"+
		"\2\2\u01dd\u01df\3\2\2\2\u01de\u01dc\3\2\2\2\u01df\u01e3\5\26\f\2\u01e0"+
		"\u01e2\7\r\2\2\u01e1\u01e0\3\2\2\2\u01e2\u01e5\3\2\2\2\u01e3\u01e1\3\2"+
		"\2\2\u01e3\u01e4\3\2\2\2\u01e4\u01e7\3\2\2\2\u01e5\u01e3\3\2\2\2\u01e6"+
		"\u018a\3\2\2\2\u01e6\u01a9\3\2\2\2\u01e6\u01c8\3\2\2\2\u01e6\u01d5\3\2"+
		"\2\2\u01e7\31\3\2\2\2\u01e8\u01ec\7\63\2\2\u01e9\u01eb\7\r\2\2\u01ea\u01e9"+
		"\3\2\2\2\u01eb\u01ee\3\2\2\2\u01ec\u01ea\3\2\2\2\u01ec\u01ed\3\2\2\2\u01ed"+
		"\u01ef\3\2\2\2\u01ee\u01ec\3\2\2\2\u01ef\u01f3\t\6\2\2\u01f0\u01f2\7\r"+
		"\2\2\u01f1\u01f0\3\2\2\2\u01f2\u01f5\3\2\2\2\u01f3\u01f1\3\2\2\2\u01f3"+
		"\u01f4\3\2\2\2\u01f4\u01f6\3\2\2\2\u01f5\u01f3\3\2\2\2\u01f6\u01f7\5\24"+
		"\13\2\u01f7\33\3\2\2\2D\37)8>FOV^dmt|\u0080\u0087\u008e\u0096\u0098\u00a0"+
		"\u00a8\u00b0\u00b8\u00bc\u00c3\u00ca\u00d2\u00d4\u00d6\u00dc\u00e8\u00f2"+
		"\u00f4\u00fa\u0106\u0110\u0112\u0125\u0130\u0135\u013f\u0150\u0152\u0159"+
		"\u0160\u0167\u016e\u0177\u017e\u0185\u018a\u0191\u0198\u019d\u01a3\u01a9"+
		"\u01b0\u01b7\u01bc\u01c2\u01c8\u01cf\u01d5\u01dc\u01e3\u01e6\u01ec\u01f3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}