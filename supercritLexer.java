// Generated from supercrit.g4 by ANTLR 4.9.2
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "DIGIT", "NONZERO", "LOWERCASE", 
			"UPPERCASE", "INT", "DECIMAL", "FLOAT", "STRING", "NEWLINE", "TAB", "WHITESPACE", 
			"COLON", "OPEN_PAR", "CLOSE_PAR", "OPEN_BRAC", "CLOSE_BRAC", "IF", "ELIF", 
			"ELSE", "WHILE", "FOR", "BREAK", "CONTINUE", "PLUS", "MINUS", "TIMES", 
			"DIV", "MOD", "POW", "ASSIGN", "INCREMENT", "DECREMENT", "MULT_EQ", "DIV_EQ", 
			"POW_EQ", "MOD_EQ", "LESS", "LESS_EQ", "GREATER", "GREATER_EQ", "EQUAL", 
			"NOT_EQUAL", "AND", "OR", "NOT", "TRUE", "FALSE", "COMMENT", "VAR"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0144\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b"+
		"\3\t\3\t\3\n\3\n\3\13\5\13\u008f\n\13\3\13\3\13\7\13\u0093\n\13\f\13\16"+
		"\13\u0096\13\13\3\13\5\13\u0099\n\13\3\f\3\f\6\f\u009d\n\f\r\f\16\f\u009e"+
		"\3\r\5\r\u00a2\n\r\3\r\3\r\3\r\3\r\5\r\u00a8\n\r\3\16\3\16\7\16\u00ac"+
		"\n\16\f\16\16\16\u00af\13\16\3\16\3\16\3\17\3\17\3\17\5\17\u00b6\n\17"+
		"\3\20\3\20\3\21\6\21\u00bb\n\21\r\21\16\21\u00bc\3\22\3\22\3\23\3\23\3"+
		"\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3"+
		"\33\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3%\3%"+
		"\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3)\3)\3)\3)\3*\3*\3*\3+\3+\3,\3,\3,"+
		"\3-\3-\3.\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\62\3\62"+
		"\3\62\3\63\3\63\3\63\3\63\3\64\3\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65"+
		"\3\65\3\65\3\66\3\66\7\66\u0139\n\66\f\66\16\66\u013c\13\66\3\67\3\67"+
		"\7\67\u0140\n\67\f\67\16\67\u0143\13\67\3\u00ad\28\3\3\5\4\7\5\t\6\13"+
		"\7\r\2\17\2\21\2\23\2\25\b\27\2\31\t\33\n\35\13\37\f!\r#\16%\17\'\20)"+
		"\21+\22-\23/\24\61\25\63\26\65\27\67\309\31;\32=\33?\34A\35C\36E\37G "+
		"I!K\"M#O$Q%S&U\'W(Y)[*]+_,a-c.e/g\60i\61k\62m\63\3\2\t\3\2\62;\3\2\63"+
		";\3\2c|\3\2C\\\4\2\f\f\17\17\5\2C\\aac|\6\2\62;C\\aac|\2\u0149\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\25\3\2\2\2\2\31"+
		"\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2"+
		"\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2"+
		"\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2"+
		"\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2"+
		"I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3"+
		"\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2"+
		"\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3"+
		"o\3\2\2\2\5s\3\2\2\2\7w\3\2\2\2\t}\3\2\2\2\13\177\3\2\2\2\r\u0085\3\2"+
		"\2\2\17\u0087\3\2\2\2\21\u0089\3\2\2\2\23\u008b\3\2\2\2\25\u0098\3\2\2"+
		"\2\27\u009a\3\2\2\2\31\u00a7\3\2\2\2\33\u00a9\3\2\2\2\35\u00b5\3\2\2\2"+
		"\37\u00b7\3\2\2\2!\u00ba\3\2\2\2#\u00be\3\2\2\2%\u00c0\3\2\2\2\'\u00c2"+
		"\3\2\2\2)\u00c4\3\2\2\2+\u00c6\3\2\2\2-\u00c8\3\2\2\2/\u00cb\3\2\2\2\61"+
		"\u00d0\3\2\2\2\63\u00d5\3\2\2\2\65\u00db\3\2\2\2\67\u00df\3\2\2\29\u00e5"+
		"\3\2\2\2;\u00ee\3\2\2\2=\u00f0\3\2\2\2?\u00f2\3\2\2\2A\u00f4\3\2\2\2C"+
		"\u00f6\3\2\2\2E\u00f8\3\2\2\2G\u00fb\3\2\2\2I\u00fd\3\2\2\2K\u0100\3\2"+
		"\2\2M\u0103\3\2\2\2O\u0106\3\2\2\2Q\u0109\3\2\2\2S\u010d\3\2\2\2U\u0110"+
		"\3\2\2\2W\u0112\3\2\2\2Y\u0115\3\2\2\2[\u0117\3\2\2\2]\u011a\3\2\2\2_"+
		"\u011d\3\2\2\2a\u0120\3\2\2\2c\u0124\3\2\2\2e\u0127\3\2\2\2g\u012b\3\2"+
		"\2\2i\u0130\3\2\2\2k\u0136\3\2\2\2m\u013d\3\2\2\2op\7u\2\2pq\7v\2\2qr"+
		"\7t\2\2r\4\3\2\2\2st\7k\2\2tu\7p\2\2uv\7v\2\2v\6\3\2\2\2wx\7t\2\2xy\7"+
		"c\2\2yz\7p\2\2z{\7i\2\2{|\7g\2\2|\b\3\2\2\2}~\7.\2\2~\n\3\2\2\2\177\u0080"+
		"\7r\2\2\u0080\u0081\7t\2\2\u0081\u0082\7k\2\2\u0082\u0083\7p\2\2\u0083"+
		"\u0084\7v\2\2\u0084\f\3\2\2\2\u0085\u0086\t\2\2\2\u0086\16\3\2\2\2\u0087"+
		"\u0088\t\3\2\2\u0088\20\3\2\2\2\u0089\u008a\t\4\2\2\u008a\22\3\2\2\2\u008b"+
		"\u008c\t\5\2\2\u008c\24\3\2\2\2\u008d\u008f\5=\37\2\u008e\u008d\3\2\2"+
		"\2\u008e\u008f\3\2\2\2\u008f\u0090\3\2\2\2\u0090\u0094\5\17\b\2\u0091"+
		"\u0093\5\r\7\2\u0092\u0091\3\2\2\2\u0093\u0096\3\2\2\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0099\3\2\2\2\u0096\u0094\3\2\2\2\u0097"+
		"\u0099\7\62\2\2\u0098\u008e\3\2\2\2\u0098\u0097\3\2\2\2\u0099\26\3\2\2"+
		"\2\u009a\u009c\7\60\2\2\u009b\u009d\5\r\7\2\u009c\u009b\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f\3\2\2\2\u009f\30\3\2\2"+
		"\2\u00a0\u00a2\5\25\13\2\u00a1\u00a0\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2"+
		"\u00a3\3\2\2\2\u00a3\u00a8\5\27\f\2\u00a4\u00a5\5\25\13\2\u00a5\u00a6"+
		"\7\60\2\2\u00a6\u00a8\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a4\3\2\2\2"+
		"\u00a8\32\3\2\2\2\u00a9\u00ad\7$\2\2\u00aa\u00ac\13\2\2\2\u00ab\u00aa"+
		"\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ad\u00ab\3\2\2\2\u00ae"+
		"\u00b0\3\2\2\2\u00af\u00ad\3\2\2\2\u00b0\u00b1\7$\2\2\u00b1\34\3\2\2\2"+
		"\u00b2\u00b3\7\17\2\2\u00b3\u00b6\7\f\2\2\u00b4\u00b6\t\6\2\2\u00b5\u00b2"+
		"\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\36\3\2\2\2\u00b7\u00b8\7\13\2\2\u00b8"+
		" \3\2\2\2\u00b9\u00bb\7\"\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2"+
		"\u00bc\u00ba\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\"\3\2\2\2\u00be\u00bf\7"+
		"<\2\2\u00bf$\3\2\2\2\u00c0\u00c1\7*\2\2\u00c1&\3\2\2\2\u00c2\u00c3\7+"+
		"\2\2\u00c3(\3\2\2\2\u00c4\u00c5\7]\2\2\u00c5*\3\2\2\2\u00c6\u00c7\7_\2"+
		"\2\u00c7,\3\2\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca\7h\2\2\u00ca.\3\2\2\2"+
		"\u00cb\u00cc\7g\2\2\u00cc\u00cd\7n\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf"+
		"\7h\2\2\u00cf\60\3\2\2\2\u00d0\u00d1\7g\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3"+
		"\7u\2\2\u00d3\u00d4\7g\2\2\u00d4\62\3\2\2\2\u00d5\u00d6\7y\2\2\u00d6\u00d7"+
		"\7j\2\2\u00d7\u00d8\7k\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7g\2\2\u00da"+
		"\64\3\2\2\2\u00db\u00dc\7h\2\2\u00dc\u00dd\7q\2\2\u00dd\u00de\7t\2\2\u00de"+
		"\66\3\2\2\2\u00df\u00e0\7d\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7g\2\2\u00e2"+
		"\u00e3\7c\2\2\u00e3\u00e4\7m\2\2\u00e48\3\2\2\2\u00e5\u00e6\7e\2\2\u00e6"+
		"\u00e7\7q\2\2\u00e7\u00e8\7p\2\2\u00e8\u00e9\7v\2\2\u00e9\u00ea\7k\2\2"+
		"\u00ea\u00eb\7p\2\2\u00eb\u00ec\7w\2\2\u00ec\u00ed\7g\2\2\u00ed:\3\2\2"+
		"\2\u00ee\u00ef\7-\2\2\u00ef<\3\2\2\2\u00f0\u00f1\7/\2\2\u00f1>\3\2\2\2"+
		"\u00f2\u00f3\7,\2\2\u00f3@\3\2\2\2\u00f4\u00f5\7\61\2\2\u00f5B\3\2\2\2"+
		"\u00f6\u00f7\7\'\2\2\u00f7D\3\2\2\2\u00f8\u00f9\7,\2\2\u00f9\u00fa\7,"+
		"\2\2\u00faF\3\2\2\2\u00fb\u00fc\7?\2\2\u00fcH\3\2\2\2\u00fd\u00fe\7-\2"+
		"\2\u00fe\u00ff\7?\2\2\u00ffJ\3\2\2\2\u0100\u0101\7/\2\2\u0101\u0102\7"+
		"?\2\2\u0102L\3\2\2\2\u0103\u0104\7,\2\2\u0104\u0105\7?\2\2\u0105N\3\2"+
		"\2\2\u0106\u0107\7\61\2\2\u0107\u0108\7?\2\2\u0108P\3\2\2\2\u0109\u010a"+
		"\7,\2\2\u010a\u010b\7,\2\2\u010b\u010c\7?\2\2\u010cR\3\2\2\2\u010d\u010e"+
		"\7\'\2\2\u010e\u010f\7?\2\2\u010fT\3\2\2\2\u0110\u0111\7>\2\2\u0111V\3"+
		"\2\2\2\u0112\u0113\7>\2\2\u0113\u0114\7?\2\2\u0114X\3\2\2\2\u0115\u0116"+
		"\7@\2\2\u0116Z\3\2\2\2\u0117\u0118\7@\2\2\u0118\u0119\7?\2\2\u0119\\\3"+
		"\2\2\2\u011a\u011b\7?\2\2\u011b\u011c\7?\2\2\u011c^\3\2\2\2\u011d\u011e"+
		"\7#\2\2\u011e\u011f\7?\2\2\u011f`\3\2\2\2\u0120\u0121\7c\2\2\u0121\u0122"+
		"\7p\2\2\u0122\u0123\7f\2\2\u0123b\3\2\2\2\u0124\u0125\7q\2\2\u0125\u0126"+
		"\7t\2\2\u0126d\3\2\2\2\u0127\u0128\7p\2\2\u0128\u0129\7q\2\2\u0129\u012a"+
		"\7v\2\2\u012af\3\2\2\2\u012b\u012c\7V\2\2\u012c\u012d\7t\2\2\u012d\u012e"+
		"\7w\2\2\u012e\u012f\7g\2\2\u012fh\3\2\2\2\u0130\u0131\7H\2\2\u0131\u0132"+
		"\7c\2\2\u0132\u0133\7n\2\2\u0133\u0134\7u\2\2\u0134\u0135\7g\2\2\u0135"+
		"j\3\2\2\2\u0136\u013a\7%\2\2\u0137\u0139\n\6\2\2\u0138\u0137\3\2\2\2\u0139"+
		"\u013c\3\2\2\2\u013a\u0138\3\2\2\2\u013a\u013b\3\2\2\2\u013bl\3\2\2\2"+
		"\u013c\u013a\3\2\2\2\u013d\u0141\t\7\2\2\u013e\u0140\t\b\2\2\u013f\u013e"+
		"\3\2\2\2\u0140\u0143\3\2\2\2\u0141\u013f\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"n\3\2\2\2\u0143\u0141\3\2\2\2\16\2\u008e\u0094\u0098\u009e\u00a1\u00a7"+
		"\u00ad\u00b5\u00bc\u013a\u0141\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}