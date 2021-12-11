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
		WHITESPACE=1, COLON=2, OPEN_PAR=3, CLOSE_PAR=4, OPEN_BRAC=5, CLOSE_BRAC=6, 
		IF=7, ELIF=8, ELSE=9, WHILE=10, FOR=11, PLUS=12, MINUS=13, TIMES=14, DIV=15, 
		MOD=16, POW=17, ASSIGN=18, INCREMENT=19, DECREMENT=20, MULT_EQ=21, DIV_EQ=22, 
		POW_EQ=23, MOD_EQ=24, LESS=25, LESS_EQ=26, GREATER=27, GREATER_EQ=28, 
		EQUAL=29, NOT_EQUAL=30, AND=31, OR=32, NOT=33, COMMENT=34, NUMBER=35;
	public static final int
		RULE_base = 0, RULE_parenthesis = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"base", "parenthesis"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "':'", "'('", "')'", "'['", "']'", "'if'", "'elif'", "'else'", 
			"'while'", "'for'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", "'='", 
			"'+='", "'-='", "'*='", "'/='", "'**='", "'%='", "'<'", "'<='", "'>'", 
			"'>='", "'=='", "'!='", "'and'", "'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACE", "COLON", "OPEN_PAR", "CLOSE_PAR", "OPEN_BRAC", "CLOSE_BRAC", 
			"IF", "ELIF", "ELSE", "WHILE", "FOR", "PLUS", "MINUS", "TIMES", "DIV", 
			"MOD", "POW", "ASSIGN", "INCREMENT", "DECREMENT", "MULT_EQ", "DIV_EQ", 
			"POW_EQ", "MOD_EQ", "LESS", "LESS_EQ", "GREATER", "GREATER_EQ", "EQUAL", 
			"NOT_EQUAL", "AND", "OR", "NOT", "COMMENT", "NUMBER"
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

	public static class BaseContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(supercritParser.NUMBER, 0); }
		public BaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_base; }
	}

	public final BaseContext base() throws RecognitionException {
		BaseContext _localctx = new BaseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_base);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(4);
			match(NUMBER);
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

	public static class ParenthesisContext extends ParserRuleContext {
		public TerminalNode OPEN_PAR() { return getToken(supercritParser.OPEN_PAR, 0); }
		public TerminalNode NUMBER() { return getToken(supercritParser.NUMBER, 0); }
		public TerminalNode CLOSE_PAR() { return getToken(supercritParser.CLOSE_PAR, 0); }
		public ParenthesisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parenthesis; }
	}

	public final ParenthesisContext parenthesis() throws RecognitionException {
		ParenthesisContext _localctx = new ParenthesisContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_parenthesis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			match(OPEN_PAR);
			setState(7);
			match(NUMBER);
			setState(8);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3%\r\4\2\t\2\4\3\t"+
		"\3\3\2\3\2\3\3\3\3\3\3\3\3\3\3\2\2\4\2\4\2\2\2\n\2\6\3\2\2\2\4\b\3\2\2"+
		"\2\6\7\7%\2\2\7\3\3\2\2\2\b\t\7\5\2\2\t\n\7%\2\2\n\13\7\6\2\2\13\5\3\2"+
		"\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}