// Generated from c:\Users\Admin\Documents\courses\PoPL\Final\PoPLFinal\supercrit.g4 by ANTLR 4.8
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
		T__0=1, WHITESPACE=2, NEWLINE=3, COLON=4, OPEN_PAR=5, CLOSE_PAR=6, OPEN_BRAC=7, 
		CLOSE_BRAC=8, IF=9, ELIF=10, ELSE=11, TAB=12, VAR=13, WHILE=14, FOR=15, 
		BREAK=16, CONTINUE=17, PLUS=18, MINUS=19, TIMES=20, DIV=21, MOD=22, POW=23, 
		ASSIGN=24, INCREMENT=25, DECREMENT=26, MULT_EQ=27, DIV_EQ=28, POW_EQ=29, 
		MOD_EQ=30, LESS=31, LESS_EQ=32, GREATER=33, GREATER_EQ=34, EQUAL=35, NOT_EQUAL=36, 
		AND=37, OR=38, NOT=39, COMMENT=40;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "DIGIT", "NONZERO", "LOWERCASE", "UPPERCASE", "INT", "DECIMAL", 
			"FLOAT", "NUMBER", "WHITESPACE", "NEWLINE", "INDENT", "COLON", "OPEN_PAR", 
			"CLOSE_PAR", "OPEN_BRAC", "CLOSE_BRAC", "IF", "ELIF", "ELSE", "TAB", 
			"VAR", "WHILE", "FOR", "BREAK", "CONTINUE", "PLUS", "MINUS", "TIMES", 
			"DIV", "MOD", "POW", "ASSIGN", "INCREMENT", "DECREMENT", "MULT_EQ", "DIV_EQ", 
			"POW_EQ", "MOD_EQ", "LESS", "LESS_EQ", "GREATER", "GREATER_EQ", "EQUAL", 
			"NOT_EQUAL", "AND", "OR", "NOT", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2*\u0119\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\5\7u\n\7\3\7\3\7\7\7y\n\7\f"+
		"\7\16\7|\13\7\3\7\5\7\177\n\7\3\b\3\b\6\b\u0083\n\b\r\b\16\b\u0084\3\t"+
		"\5\t\u0088\n\t\3\t\3\t\3\t\3\t\5\t\u008e\n\t\3\n\3\n\5\n\u0092\n\n\3\13"+
		"\3\13\3\13\5\13\u0097\n\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3"+
		"\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\7\27\u00b8\n\27\f\27\16\27\u00bb"+
		"\13\27\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3#\3#\3#\3$\3$\3"+
		"$\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3\'\3(\3(\3(\3)\3)\3*\3*\3*\3+\3+\3,\3"+
		",\3,\3-\3-\3-\3.\3.\3.\3/\3/\3/\3/\3\60\3\60\3\60\3\61\3\61\3\61\3\61"+
		"\3\62\3\62\7\62\u0115\n\62\f\62\16\62\u0118\13\62\2\2\63\3\3\5\2\7\2\t"+
		"\2\13\2\r\2\17\2\21\2\23\2\25\4\27\5\31\2\33\6\35\7\37\b!\t#\n%\13\'\f"+
		")\r+\16-\17/\20\61\21\63\22\65\23\67\249\25;\26=\27?\30A\31C\32E\33G\34"+
		"I\35K\36M\37O Q!S\"U#W$Y%[&]\'_(a)c*\3\2\n\3\2\62;\3\2\63;\3\2c|\3\2C"+
		"\\\3\2\13\13\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\16\17\2\u011a\2\3\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E"+
		"\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2"+
		"\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2"+
		"\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5k\3\2\2\2\7m\3\2\2\2\to"+
		"\3\2\2\2\13q\3\2\2\2\r~\3\2\2\2\17\u0080\3\2\2\2\21\u008d\3\2\2\2\23\u0091"+
		"\3\2\2\2\25\u0096\3\2\2\2\27\u0098\3\2\2\2\31\u009a\3\2\2\2\33\u009c\3"+
		"\2\2\2\35\u009e\3\2\2\2\37\u00a0\3\2\2\2!\u00a2\3\2\2\2#\u00a4\3\2\2\2"+
		"%\u00a6\3\2\2\2\'\u00a9\3\2\2\2)\u00ae\3\2\2\2+\u00b3\3\2\2\2-\u00b5\3"+
		"\2\2\2/\u00bc\3\2\2\2\61\u00c2\3\2\2\2\63\u00c6\3\2\2\2\65\u00cc\3\2\2"+
		"\2\67\u00d5\3\2\2\29\u00d7\3\2\2\2;\u00d9\3\2\2\2=\u00db\3\2\2\2?\u00dd"+
		"\3\2\2\2A\u00df\3\2\2\2C\u00e2\3\2\2\2E\u00e4\3\2\2\2G\u00e7\3\2\2\2I"+
		"\u00ea\3\2\2\2K\u00ed\3\2\2\2M\u00f0\3\2\2\2O\u00f4\3\2\2\2Q\u00f7\3\2"+
		"\2\2S\u00f9\3\2\2\2U\u00fc\3\2\2\2W\u00fe\3\2\2\2Y\u0101\3\2\2\2[\u0104"+
		"\3\2\2\2]\u0107\3\2\2\2_\u010b\3\2\2\2a\u010e\3\2\2\2c\u0112\3\2\2\2e"+
		"f\7r\2\2fg\7t\2\2gh\7k\2\2hi\7p\2\2ij\7v\2\2j\4\3\2\2\2kl\t\2\2\2l\6\3"+
		"\2\2\2mn\t\3\2\2n\b\3\2\2\2op\t\4\2\2p\n\3\2\2\2qr\t\5\2\2r\f\3\2\2\2"+
		"su\59\35\2ts\3\2\2\2tu\3\2\2\2uv\3\2\2\2vz\5\7\4\2wy\5\5\3\2xw\3\2\2\2"+
		"y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\177\3\2\2\2|z\3\2\2\2}\177\7\62\2\2~t"+
		"\3\2\2\2~}\3\2\2\2\177\16\3\2\2\2\u0080\u0082\7\60\2\2\u0081\u0083\5\5"+
		"\3\2\u0082\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084"+
		"\u0085\3\2\2\2\u0085\20\3\2\2\2\u0086\u0088\5\r\7\2\u0087\u0086\3\2\2"+
		"\2\u0087\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008e\5\17\b\2\u008a"+
		"\u008b\5\r\7\2\u008b\u008c\7\60\2\2\u008c\u008e\3\2\2\2\u008d\u0087\3"+
		"\2\2\2\u008d\u008a\3\2\2\2\u008e\22\3\2\2\2\u008f\u0092\5\r\7\2\u0090"+
		"\u0092\5\21\t\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2\u0092\24\3\2\2"+
		"\2\u0093\u0097\7\"\2\2\u0094\u0097\5\27\f\2\u0095\u0097\5\31\r\2\u0096"+
		"\u0093\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0095\3\2\2\2\u0097\26\3\2\2"+
		"\2\u0098\u0099\7\f\2\2\u0099\30\3\2\2\2\u009a\u009b\7\13\2\2\u009b\32"+
		"\3\2\2\2\u009c\u009d\7<\2\2\u009d\34\3\2\2\2\u009e\u009f\7*\2\2\u009f"+
		"\36\3\2\2\2\u00a0\u00a1\7+\2\2\u00a1 \3\2\2\2\u00a2\u00a3\7]\2\2\u00a3"+
		"\"\3\2\2\2\u00a4\u00a5\7_\2\2\u00a5$\3\2\2\2\u00a6\u00a7\7k\2\2\u00a7"+
		"\u00a8\7h\2\2\u00a8&\3\2\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7n\2\2\u00ab"+
		"\u00ac\7k\2\2\u00ac\u00ad\7h\2\2\u00ad(\3\2\2\2\u00ae\u00af\7g\2\2\u00af"+
		"\u00b0\7n\2\2\u00b0\u00b1\7u\2\2\u00b1\u00b2\7g\2\2\u00b2*\3\2\2\2\u00b3"+
		"\u00b4\t\6\2\2\u00b4,\3\2\2\2\u00b5\u00b9\t\7\2\2\u00b6\u00b8\t\b\2\2"+
		"\u00b7\u00b6\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00ba"+
		"\3\2\2\2\u00ba.\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd\7y\2\2\u00bd\u00be"+
		"\7j\2\2\u00be\u00bf\7k\2\2\u00bf\u00c0\7n\2\2\u00c0\u00c1\7g\2\2\u00c1"+
		"\60\3\2\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7t\2\2\u00c5"+
		"\62\3\2\2\2\u00c6\u00c7\7d\2\2\u00c7\u00c8\7t\2\2\u00c8\u00c9\7g\2\2\u00c9"+
		"\u00ca\7c\2\2\u00ca\u00cb\7m\2\2\u00cb\64\3\2\2\2\u00cc\u00cd\7e\2\2\u00cd"+
		"\u00ce\7q\2\2\u00ce\u00cf\7p\2\2\u00cf\u00d0\7v\2\2\u00d0\u00d1\7k\2\2"+
		"\u00d1\u00d2\7p\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7g\2\2\u00d4\66\3\2"+
		"\2\2\u00d5\u00d6\7-\2\2\u00d68\3\2\2\2\u00d7\u00d8\7/\2\2\u00d8:\3\2\2"+
		"\2\u00d9\u00da\7,\2\2\u00da<\3\2\2\2\u00db\u00dc\7\61\2\2\u00dc>\3\2\2"+
		"\2\u00dd\u00de\7\'\2\2\u00de@\3\2\2\2\u00df\u00e0\7,\2\2\u00e0\u00e1\7"+
		",\2\2\u00e1B\3\2\2\2\u00e2\u00e3\7?\2\2\u00e3D\3\2\2\2\u00e4\u00e5\7-"+
		"\2\2\u00e5\u00e6\7?\2\2\u00e6F\3\2\2\2\u00e7\u00e8\7/\2\2\u00e8\u00e9"+
		"\7?\2\2\u00e9H\3\2\2\2\u00ea\u00eb\7,\2\2\u00eb\u00ec\7?\2\2\u00ecJ\3"+
		"\2\2\2\u00ed\u00ee\7\61\2\2\u00ee\u00ef\7?\2\2\u00efL\3\2\2\2\u00f0\u00f1"+
		"\7,\2\2\u00f1\u00f2\7,\2\2\u00f2\u00f3\7?\2\2\u00f3N\3\2\2\2\u00f4\u00f5"+
		"\7\'\2\2\u00f5\u00f6\7?\2\2\u00f6P\3\2\2\2\u00f7\u00f8\7>\2\2\u00f8R\3"+
		"\2\2\2\u00f9\u00fa\7>\2\2\u00fa\u00fb\7?\2\2\u00fbT\3\2\2\2\u00fc\u00fd"+
		"\7@\2\2\u00fdV\3\2\2\2\u00fe\u00ff\7@\2\2\u00ff\u0100\7?\2\2\u0100X\3"+
		"\2\2\2\u0101\u0102\7?\2\2\u0102\u0103\7?\2\2\u0103Z\3\2\2\2\u0104\u0105"+
		"\7#\2\2\u0105\u0106\7?\2\2\u0106\\\3\2\2\2\u0107\u0108\7c\2\2\u0108\u0109"+
		"\7p\2\2\u0109\u010a\7f\2\2\u010a^\3\2\2\2\u010b\u010c\7q\2\2\u010c\u010d"+
		"\7t\2\2\u010d`\3\2\2\2\u010e\u010f\7p\2\2\u010f\u0110\7q\2\2\u0110\u0111"+
		"\7v\2\2\u0111b\3\2\2\2\u0112\u0116\7%\2\2\u0113\u0115\n\t\2\2\u0114\u0113"+
		"\3\2\2\2\u0115\u0118\3\2\2\2\u0116\u0114\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"d\3\2\2\2\u0118\u0116\3\2\2\2\r\2tz~\u0084\u0087\u008d\u0091\u0096\u00b9"+
		"\u0116\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}