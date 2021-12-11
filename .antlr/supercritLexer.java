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
		WHITESPACE=1, COLON=2, OPEN_PAR=3, CLOSE_PAR=4, OPEN_BRAC=5, CLOSE_BRAC=6, 
		IF=7, ELIF=8, ELSE=9, TAB=10, VAR=11, WHILE=12, FOR=13, PLUS=14, MINUS=15, 
		TIMES=16, DIV=17, MOD=18, POW=19, ASSIGN=20, INCREMENT=21, DECREMENT=22, 
		MULT_EQ=23, DIV_EQ=24, POW_EQ=25, MOD_EQ=26, LESS=27, LESS_EQ=28, GREATER=29, 
		GREATER_EQ=30, EQUAL=31, NOT_EQUAL=32, AND=33, OR=34, NOT=35, COMMENT=36;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGIT", "NONZERO", "LOWERCASE", "UPPERCASE", "INT", "DECIMAL", "FLOAT", 
			"NUMBER", "WHITESPACE", "NEWLINE", "INDENT", "COLON", "OPEN_PAR", "CLOSE_PAR", 
			"OPEN_BRAC", "CLOSE_BRAC", "IF", "ELIF", "ELSE", "TAB", "VAR", "WHILE", 
			"FOR", "PLUS", "MINUS", "TIMES", "DIV", "MOD", "POW", "ASSIGN", "INCREMENT", 
			"DECREMENT", "MULT_EQ", "DIV_EQ", "POW_EQ", "MOD_EQ", "LESS", "LESS_EQ", 
			"GREATER", "GREATER_EQ", "EQUAL", "NOT_EQUAL", "AND", "OR", "NOT", "COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "':'", "'('", "')'", "'['", "']'", "'if'", "'elif'", "'else'", 
			null, null, "'while'", "'for'", "'+'", "'-'", "'*'", "'/'", "'%'", "'**'", 
			"'='", "'+='", "'-='", "'*='", "'/='", "'**='", "'%='", "'<'", "'<='", 
			"'>'", "'>='", "'=='", "'!='", "'and'", "'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHITESPACE", "COLON", "OPEN_PAR", "CLOSE_PAR", "OPEN_BRAC", "CLOSE_BRAC", 
			"IF", "ELIF", "ELSE", "TAB", "VAR", "WHILE", "FOR", "PLUS", "MINUS", 
			"TIMES", "DIV", "MOD", "POW", "ASSIGN", "INCREMENT", "DECREMENT", "MULT_EQ", 
			"DIV_EQ", "POW_EQ", "MOD_EQ", "LESS", "LESS_EQ", "GREATER", "GREATER_EQ", 
			"EQUAL", "NOT_EQUAL", "AND", "OR", "NOT", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2&\u0105\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\5\6i\n\6\3"+
		"\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\6\5\6s\n\6\3\7\3\7\6\7w\n\7\r\7\16\7"+
		"x\3\b\5\b|\n\b\3\b\3\b\3\b\3\b\5\b\u0082\n\b\3\t\3\t\5\t\u0086\n\t\3\n"+
		"\3\n\3\n\5\n\u008b\n\n\3\13\5\13\u008e\n\13\3\13\3\13\6\13\u0092\n\13"+
		"\r\13\16\13\u0093\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3"+
		"\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\7\26\u00b3\n\26\f\26\16\26\u00b6\13\26\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\34\3\34\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\""+
		"\3\"\3#\3#\3#\3$\3$\3$\3$\3%\3%\3%\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3)\3"+
		"*\3*\3*\3+\3+\3+\3,\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3/\3/\7/\u0101\n/\f"+
		"/\16/\u0104\13/\2\2\60\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\3\25\2\27"+
		"\2\31\4\33\5\35\6\37\7!\b#\t%\n\'\13)\f+\r-\16/\17\61\20\63\21\65\22\67"+
		"\239\24;\25=\26?\27A\30C\31E\32G\33I\34K\35M\36O\37Q S!U\"W#Y$[%]&\3\2"+
		"\n\3\2\62;\3\2\63;\3\2c|\3\2C\\\3\2\13\13\5\2C\\aac|\6\2\62;C\\aac|\4"+
		"\2\f\f\16\17\2\u0108\2\23\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2"+
		"\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2"+
		"\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2"+
		"\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2"+
		"\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5a\3\2\2\2\7c\3\2\2\2\te\3\2\2\2\13r\3\2"+
		"\2\2\rt\3\2\2\2\17\u0081\3\2\2\2\21\u0085\3\2\2\2\23\u008a\3\2\2\2\25"+
		"\u0091\3\2\2\2\27\u0095\3\2\2\2\31\u0097\3\2\2\2\33\u0099\3\2\2\2\35\u009b"+
		"\3\2\2\2\37\u009d\3\2\2\2!\u009f\3\2\2\2#\u00a1\3\2\2\2%\u00a4\3\2\2\2"+
		"\'\u00a9\3\2\2\2)\u00ae\3\2\2\2+\u00b0\3\2\2\2-\u00b7\3\2\2\2/\u00bd\3"+
		"\2\2\2\61\u00c1\3\2\2\2\63\u00c3\3\2\2\2\65\u00c5\3\2\2\2\67\u00c7\3\2"+
		"\2\29\u00c9\3\2\2\2;\u00cb\3\2\2\2=\u00ce\3\2\2\2?\u00d0\3\2\2\2A\u00d3"+
		"\3\2\2\2C\u00d6\3\2\2\2E\u00d9\3\2\2\2G\u00dc\3\2\2\2I\u00e0\3\2\2\2K"+
		"\u00e3\3\2\2\2M\u00e5\3\2\2\2O\u00e8\3\2\2\2Q\u00ea\3\2\2\2S\u00ed\3\2"+
		"\2\2U\u00f0\3\2\2\2W\u00f3\3\2\2\2Y\u00f7\3\2\2\2[\u00fa\3\2\2\2]\u00fe"+
		"\3\2\2\2_`\t\2\2\2`\4\3\2\2\2ab\t\3\2\2b\6\3\2\2\2cd\t\4\2\2d\b\3\2\2"+
		"\2ef\t\5\2\2f\n\3\2\2\2gi\5\63\32\2hg\3\2\2\2hi\3\2\2\2ij\3\2\2\2jn\5"+
		"\5\3\2km\5\3\2\2lk\3\2\2\2mp\3\2\2\2nl\3\2\2\2no\3\2\2\2os\3\2\2\2pn\3"+
		"\2\2\2qs\7\62\2\2rh\3\2\2\2rq\3\2\2\2s\f\3\2\2\2tv\7\60\2\2uw\5\3\2\2"+
		"vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\16\3\2\2\2z|\5\13\6\2{z\3\2"+
		"\2\2{|\3\2\2\2|}\3\2\2\2}\u0082\5\r\7\2~\177\5\13\6\2\177\u0080\7\60\2"+
		"\2\u0080\u0082\3\2\2\2\u0081{\3\2\2\2\u0081~\3\2\2\2\u0082\20\3\2\2\2"+
		"\u0083\u0086\5\13\6\2\u0084\u0086\5\17\b\2\u0085\u0083\3\2\2\2\u0085\u0084"+
		"\3\2\2\2\u0086\22\3\2\2\2\u0087\u008b\7\"\2\2\u0088\u008b\5\25\13\2\u0089"+
		"\u008b\5\27\f\2\u008a\u0087\3\2\2\2\u008a\u0088\3\2\2\2\u008a\u0089\3"+
		"\2\2\2\u008b\24\3\2\2\2\u008c\u008e\7\17\2\2\u008d\u008c\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u008f\3\2\2\2\u008f\u0092\7\f\2\2\u0090\u0092\7\17"+
		"\2\2\u0091\u008d\3\2\2\2\u0091\u0090\3\2\2\2\u0092\u0093\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\26\3\2\2\2\u0095\u0096\7\13\2"+
		"\2\u0096\30\3\2\2\2\u0097\u0098\7<\2\2\u0098\32\3\2\2\2\u0099\u009a\7"+
		"*\2\2\u009a\34\3\2\2\2\u009b\u009c\7+\2\2\u009c\36\3\2\2\2\u009d\u009e"+
		"\7]\2\2\u009e \3\2\2\2\u009f\u00a0\7_\2\2\u00a0\"\3\2\2\2\u00a1\u00a2"+
		"\7k\2\2\u00a2\u00a3\7h\2\2\u00a3$\3\2\2\2\u00a4\u00a5\7g\2\2\u00a5\u00a6"+
		"\7n\2\2\u00a6\u00a7\7k\2\2\u00a7\u00a8\7h\2\2\u00a8&\3\2\2\2\u00a9\u00aa"+
		"\7g\2\2\u00aa\u00ab\7n\2\2\u00ab\u00ac\7u\2\2\u00ac\u00ad\7g\2\2\u00ad"+
		"(\3\2\2\2\u00ae\u00af\t\6\2\2\u00af*\3\2\2\2\u00b0\u00b4\t\7\2\2\u00b1"+
		"\u00b3\t\b\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2"+
		"\2\2\u00b4\u00b5\3\2\2\2\u00b5,\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8"+
		"\7y\2\2\u00b8\u00b9\7j\2\2\u00b9\u00ba\7k\2\2\u00ba\u00bb\7n\2\2\u00bb"+
		"\u00bc\7g\2\2\u00bc.\3\2\2\2\u00bd\u00be\7h\2\2\u00be\u00bf\7q\2\2\u00bf"+
		"\u00c0\7t\2\2\u00c0\60\3\2\2\2\u00c1\u00c2\7-\2\2\u00c2\62\3\2\2\2\u00c3"+
		"\u00c4\7/\2\2\u00c4\64\3\2\2\2\u00c5\u00c6\7,\2\2\u00c6\66\3\2\2\2\u00c7"+
		"\u00c8\7\61\2\2\u00c88\3\2\2\2\u00c9\u00ca\7\'\2\2\u00ca:\3\2\2\2\u00cb"+
		"\u00cc\7,\2\2\u00cc\u00cd\7,\2\2\u00cd<\3\2\2\2\u00ce\u00cf\7?\2\2\u00cf"+
		">\3\2\2\2\u00d0\u00d1\7-\2\2\u00d1\u00d2\7?\2\2\u00d2@\3\2\2\2\u00d3\u00d4"+
		"\7/\2\2\u00d4\u00d5\7?\2\2\u00d5B\3\2\2\2\u00d6\u00d7\7,\2\2\u00d7\u00d8"+
		"\7?\2\2\u00d8D\3\2\2\2\u00d9\u00da\7\61\2\2\u00da\u00db\7?\2\2\u00dbF"+
		"\3\2\2\2\u00dc\u00dd\7,\2\2\u00dd\u00de\7,\2\2\u00de\u00df\7?\2\2\u00df"+
		"H\3\2\2\2\u00e0\u00e1\7\'\2\2\u00e1\u00e2\7?\2\2\u00e2J\3\2\2\2\u00e3"+
		"\u00e4\7>\2\2\u00e4L\3\2\2\2\u00e5\u00e6\7>\2\2\u00e6\u00e7\7?\2\2\u00e7"+
		"N\3\2\2\2\u00e8\u00e9\7@\2\2\u00e9P\3\2\2\2\u00ea\u00eb\7@\2\2\u00eb\u00ec"+
		"\7?\2\2\u00ecR\3\2\2\2\u00ed\u00ee\7?\2\2\u00ee\u00ef\7?\2\2\u00efT\3"+
		"\2\2\2\u00f0\u00f1\7#\2\2\u00f1\u00f2\7?\2\2\u00f2V\3\2\2\2\u00f3\u00f4"+
		"\7c\2\2\u00f4\u00f5\7p\2\2\u00f5\u00f6\7f\2\2\u00f6X\3\2\2\2\u00f7\u00f8"+
		"\7q\2\2\u00f8\u00f9\7t\2\2\u00f9Z\3\2\2\2\u00fa\u00fb\7p\2\2\u00fb\u00fc"+
		"\7q\2\2\u00fc\u00fd\7v\2\2\u00fd\\\3\2\2\2\u00fe\u0102\7%\2\2\u00ff\u0101"+
		"\n\t\2\2\u0100\u00ff\3\2\2\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103^\3\2\2\2\u0104\u0102\3\2\2\2\20\2hnrx{\u0081\u0085"+
		"\u008a\u008d\u0091\u0093\u00b4\u0102\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}