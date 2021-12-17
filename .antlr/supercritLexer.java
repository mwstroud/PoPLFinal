// Generated from c:\Users\Admin\Documents\courses\PoPL\Final\PoPLFinal\supercrit.g4 by ANTLR 4.8

  import com.yuvalshavit.antlr4.DenterHelper;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class supercritLexer extends Lexer {
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
		TRUE=46, FALSE=47, COMMENT=48, VAR=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "NEWLINE", "DIGIT", "NONZERO", 
			"LOWERCASE", "UPPERCASE", "INT", "DECIMAL", "FLOAT", "STRING", "WHITESPACE", 
			"COLON", "OPEN_PAR", "CLOSE_PAR", "OPEN_BRAC", "CLOSE_BRAC", "IF", "ELIF", 
			"ELSE", "WHILE", "FOR", "BREAK", "CONTINUE", "IN", "PLUS", "MINUS", "TIMES", 
			"DIV", "MOD", "POW", "ASSIGN", "INCREMENT", "DECREMENT", "MULT_EQ", "DIV_EQ", 
			"POW_EQ", "MOD_EQ", "LESS", "LESS_EQ", "GREATER", "GREATER_EQ", "EQUAL", 
			"NOT_EQUAL", "AND", "OR", "NOT", "TRUE", "FALSE", "COMMENT", "VAR"
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


	  private final DenterHelper denter = new DenterHelper(NL,
	                                                       MyCoolParser.INDENT,
	                                                       MyCoolParser.DEDENT)
	  {
	    @Override
	    public Token pullToken() {
	      return MyCoolLexer.super.nextToken();
	    }
	  };

	  @Override
	  public Token nextToken() {
	    return denter.nextToken();
	  }


	public supercritLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "supercrit.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u014a\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\5\7\u0087\n"+
		"\7\3\7\3\7\7\7\u008b\n\7\f\7\16\7\u008e\13\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\5\f\u0099\n\f\3\f\3\f\7\f\u009d\n\f\f\f\16\f\u00a0\13\f\3"+
		"\f\5\f\u00a3\n\f\3\r\3\r\6\r\u00a7\n\r\r\r\16\r\u00a8\3\16\5\16\u00ac"+
		"\n\16\3\16\3\16\3\16\3\16\5\16\u00b2\n\16\3\17\3\17\7\17\u00b6\n\17\f"+
		"\17\16\17\u00b9\13\17\3\17\3\17\3\20\6\20\u00be\n\20\r\20\16\20\u00bf"+
		"\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3"+
		" \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3("+
		"\3)\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60"+
		"\3\60\3\61\3\61\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\65\3\66\3\66\7\66\u013f\n\66"+
		"\f\66\16\66\u0142\13\66\3\67\3\67\7\67\u0146\n\67\f\67\16\67\u0149\13"+
		"\67\3\u00b7\28\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\2\23\2\25\2\27\t\31\2"+
		"\33\n\35\13\37\f!\r#\16%\17\'\20)\21+\22-\23/\24\61\25\63\26\65\27\67"+
		"\309\31;\32=\33?\34A\35C\36E\37G I!K\"M#O$Q%S&U\'W(Y)[*]+_,a-c.e/g\60"+
		"i\61k\62m\63\3\2\t\3\2\62;\3\2\63;\3\2c|\3\2C\\\4\2\f\f\17\17\5\2C\\a"+
		"ac|\6\2\62;C\\aac|\2\u0150\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\27\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2"+
		"\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2"+
		"C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3"+
		"\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2"+
		"\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2"+
		"i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3o\3\2\2\2\5s\3\2\2\2\7w\3\2\2\2\t}\3"+
		"\2\2\2\13\177\3\2\2\2\r\u0086\3\2\2\2\17\u008f\3\2\2\2\21\u0091\3\2\2"+
		"\2\23\u0093\3\2\2\2\25\u0095\3\2\2\2\27\u00a2\3\2\2\2\31\u00a4\3\2\2\2"+
		"\33\u00b1\3\2\2\2\35\u00b3\3\2\2\2\37\u00bd\3\2\2\2!\u00c1\3\2\2\2#\u00c3"+
		"\3\2\2\2%\u00c5\3\2\2\2\'\u00c7\3\2\2\2)\u00c9\3\2\2\2+\u00cb\3\2\2\2"+
		"-\u00ce\3\2\2\2/\u00d3\3\2\2\2\61\u00d8\3\2\2\2\63\u00de\3\2\2\2\65\u00e2"+
		"\3\2\2\2\67\u00e8\3\2\2\29\u00f1\3\2\2\2;\u00f4\3\2\2\2=\u00f6\3\2\2\2"+
		"?\u00f8\3\2\2\2A\u00fa\3\2\2\2C\u00fc\3\2\2\2E\u00fe\3\2\2\2G\u0101\3"+
		"\2\2\2I\u0103\3\2\2\2K\u0106\3\2\2\2M\u0109\3\2\2\2O\u010c\3\2\2\2Q\u010f"+
		"\3\2\2\2S\u0113\3\2\2\2U\u0116\3\2\2\2W\u0118\3\2\2\2Y\u011b\3\2\2\2["+
		"\u011d\3\2\2\2]\u0120\3\2\2\2_\u0123\3\2\2\2a\u0126\3\2\2\2c\u012a\3\2"+
		"\2\2e\u012d\3\2\2\2g\u0131\3\2\2\2i\u0136\3\2\2\2k\u013c\3\2\2\2m\u0143"+
		"\3\2\2\2op\7u\2\2pq\7v\2\2qr\7t\2\2r\4\3\2\2\2st\7k\2\2tu\7p\2\2uv\7v"+
		"\2\2v\6\3\2\2\2wx\7t\2\2xy\7c\2\2yz\7p\2\2z{\7i\2\2{|\7g\2\2|\b\3\2\2"+
		"\2}~\7.\2\2~\n\3\2\2\2\177\u0080\7r\2\2\u0080\u0081\7t\2\2\u0081\u0082"+
		"\7k\2\2\u0082\u0083\7p\2\2\u0083\u0084\7v\2\2\u0084\f\3\2\2\2\u0085\u0087"+
		"\7\17\2\2\u0086\u0085\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0088\3\2\2\2"+
		"\u0088\u008c\7\f\2\2\u0089\u008b\7\"\2\2\u008a\u0089\3\2\2\2\u008b\u008e"+
		"\3\2\2\2\u008c\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\16\3\2\2\2\u008e"+
		"\u008c\3\2\2\2\u008f\u0090\t\2\2\2\u0090\20\3\2\2\2\u0091\u0092\t\3\2"+
		"\2\u0092\22\3\2\2\2\u0093\u0094\t\4\2\2\u0094\24\3\2\2\2\u0095\u0096\t"+
		"\5\2\2\u0096\26\3\2\2\2\u0097\u0099\5=\37\2\u0098\u0097\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009e\5\21\t\2\u009b\u009d\5"+
		"\17\b\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u00a3\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a3\7\62"+
		"\2\2\u00a2\u0098\3\2\2\2\u00a2\u00a1\3\2\2\2\u00a3\30\3\2\2\2\u00a4\u00a6"+
		"\7\60\2\2\u00a5\u00a7\5\17\b\2\u00a6\u00a5\3\2\2\2\u00a7\u00a8\3\2\2\2"+
		"\u00a8\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\32\3\2\2\2\u00aa\u00ac"+
		"\5\27\f\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2"+
		"\u00ad\u00b2\5\31\r\2\u00ae\u00af\5\27\f\2\u00af\u00b0\7\60\2\2\u00b0"+
		"\u00b2\3\2\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00ae\3\2\2\2\u00b2\34\3\2\2"+
		"\2\u00b3\u00b7\7$\2\2\u00b4\u00b6\13\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\u00b9"+
		"\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00ba\u00bb\7$\2\2\u00bb\36\3\2\2\2\u00bc\u00be\7\"\2\2"+
		"\u00bd\u00bc\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0 \3\2\2\2\u00c1\u00c2\7<\2\2\u00c2\"\3\2\2\2\u00c3\u00c4"+
		"\7*\2\2\u00c4$\3\2\2\2\u00c5\u00c6\7+\2\2\u00c6&\3\2\2\2\u00c7\u00c8\7"+
		"]\2\2\u00c8(\3\2\2\2\u00c9\u00ca\7_\2\2\u00ca*\3\2\2\2\u00cb\u00cc\7k"+
		"\2\2\u00cc\u00cd\7h\2\2\u00cd,\3\2\2\2\u00ce\u00cf\7g\2\2\u00cf\u00d0"+
		"\7n\2\2\u00d0\u00d1\7k\2\2\u00d1\u00d2\7h\2\2\u00d2.\3\2\2\2\u00d3\u00d4"+
		"\7g\2\2\u00d4\u00d5\7n\2\2\u00d5\u00d6\7u\2\2\u00d6\u00d7\7g\2\2\u00d7"+
		"\60\3\2\2\2\u00d8\u00d9\7y\2\2\u00d9\u00da\7j\2\2\u00da\u00db\7k\2\2\u00db"+
		"\u00dc\7n\2\2\u00dc\u00dd\7g\2\2\u00dd\62\3\2\2\2\u00de\u00df\7h\2\2\u00df"+
		"\u00e0\7q\2\2\u00e0\u00e1\7t\2\2\u00e1\64\3\2\2\2\u00e2\u00e3\7d\2\2\u00e3"+
		"\u00e4\7t\2\2\u00e4\u00e5\7g\2\2\u00e5\u00e6\7c\2\2\u00e6\u00e7\7m\2\2"+
		"\u00e7\66\3\2\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea\7q\2\2\u00ea\u00eb\7"+
		"p\2\2\u00eb\u00ec\7v\2\2\u00ec\u00ed\7k\2\2\u00ed\u00ee\7p\2\2\u00ee\u00ef"+
		"\7w\2\2\u00ef\u00f0\7g\2\2\u00f08\3\2\2\2\u00f1\u00f2\7k\2\2\u00f2\u00f3"+
		"\7p\2\2\u00f3:\3\2\2\2\u00f4\u00f5\7-\2\2\u00f5<\3\2\2\2\u00f6\u00f7\7"+
		"/\2\2\u00f7>\3\2\2\2\u00f8\u00f9\7,\2\2\u00f9@\3\2\2\2\u00fa\u00fb\7\61"+
		"\2\2\u00fbB\3\2\2\2\u00fc\u00fd\7\'\2\2\u00fdD\3\2\2\2\u00fe\u00ff\7,"+
		"\2\2\u00ff\u0100\7,\2\2\u0100F\3\2\2\2\u0101\u0102\7?\2\2\u0102H\3\2\2"+
		"\2\u0103\u0104\7-\2\2\u0104\u0105\7?\2\2\u0105J\3\2\2\2\u0106\u0107\7"+
		"/\2\2\u0107\u0108\7?\2\2\u0108L\3\2\2\2\u0109\u010a\7,\2\2\u010a\u010b"+
		"\7?\2\2\u010bN\3\2\2\2\u010c\u010d\7\61\2\2\u010d\u010e\7?\2\2\u010eP"+
		"\3\2\2\2\u010f\u0110\7,\2\2\u0110\u0111\7,\2\2\u0111\u0112\7?\2\2\u0112"+
		"R\3\2\2\2\u0113\u0114\7\'\2\2\u0114\u0115\7?\2\2\u0115T\3\2\2\2\u0116"+
		"\u0117\7>\2\2\u0117V\3\2\2\2\u0118\u0119\7>\2\2\u0119\u011a\7?\2\2\u011a"+
		"X\3\2\2\2\u011b\u011c\7@\2\2\u011cZ\3\2\2\2\u011d\u011e\7@\2\2\u011e\u011f"+
		"\7?\2\2\u011f\\\3\2\2\2\u0120\u0121\7?\2\2\u0121\u0122\7?\2\2\u0122^\3"+
		"\2\2\2\u0123\u0124\7#\2\2\u0124\u0125\7?\2\2\u0125`\3\2\2\2\u0126\u0127"+
		"\7c\2\2\u0127\u0128\7p\2\2\u0128\u0129\7f\2\2\u0129b\3\2\2\2\u012a\u012b"+
		"\7q\2\2\u012b\u012c\7t\2\2\u012cd\3\2\2\2\u012d\u012e\7p\2\2\u012e\u012f"+
		"\7q\2\2\u012f\u0130\7v\2\2\u0130f\3\2\2\2\u0131\u0132\7V\2\2\u0132\u0133"+
		"\7t\2\2\u0133\u0134\7w\2\2\u0134\u0135\7g\2\2\u0135h\3\2\2\2\u0136\u0137"+
		"\7H\2\2\u0137\u0138\7c\2\2\u0138\u0139\7n\2\2\u0139\u013a\7u\2\2\u013a"+
		"\u013b\7g\2\2\u013bj\3\2\2\2\u013c\u0140\7%\2\2\u013d\u013f\n\6\2\2\u013e"+
		"\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3\2\2\2\u0140\u0141\3\2"+
		"\2\2\u0141l\3\2\2\2\u0142\u0140\3\2\2\2\u0143\u0147\t\7\2\2\u0144\u0146"+
		"\t\b\2\2\u0145\u0144\3\2\2\2\u0146\u0149\3\2\2\2\u0147\u0145\3\2\2\2\u0147"+
		"\u0148\3\2\2\2\u0148n\3\2\2\2\u0149\u0147\3\2\2\2\17\2\u0086\u008c\u0098"+
		"\u009e\u00a2\u00a8\u00ab\u00b1\u00b7\u00bf\u0140\u0147\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}