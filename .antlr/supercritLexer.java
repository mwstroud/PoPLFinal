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
		WHITESPACE=1, NEWLINE=2, COLON=3, OPEN_PAR=4, CLOSE_PAR=5, OPEN_BRAC=6, 
		CLOSE_BRAC=7, IF=8, ELIF=9, ELSE=10, TAB=11, VAR=12, WHILE=13, FOR=14, 
		BREAK=15, CONTINUE=16, PLUS=17, MINUS=18, TIMES=19, DIV=20, MOD=21, POW=22, 
		ASSIGN=23, INCREMENT=24, DECREMENT=25, MULT_EQ=26, DIV_EQ=27, POW_EQ=28, 
		MOD_EQ=29, LESS=30, LESS_EQ=31, GREATER=32, GREATER_EQ=33, EQUAL=34, NOT_EQUAL=35, 
		AND=36, OR=37, NOT=38, COMMENT=39;
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
			"FOR", "BREAK", "CONTINUE", "PLUS", "MINUS", "TIMES", "DIV", "MOD", "POW", 
			"ASSIGN", "INCREMENT", "DECREMENT", "MULT_EQ", "DIV_EQ", "POW_EQ", "MOD_EQ", 
			"LESS", "LESS_EQ", "GREATER", "GREATER_EQ", "EQUAL", "NOT_EQUAL", "AND", 
			"OR", "NOT", "COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u0111\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\5\6m\n\6\3\6\3\6\7\6q\n\6\f\6\16\6t\13\6\3\6\5\6w\n\6\3\7\3\7"+
		"\6\7{\n\7\r\7\16\7|\3\b\5\b\u0080\n\b\3\b\3\b\3\b\3\b\5\b\u0086\n\b\3"+
		"\t\3\t\5\t\u008a\n\t\3\n\3\n\3\n\5\n\u008f\n\n\3\13\3\13\3\f\3\f\3\r\3"+
		"\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\26\3\26\7\26\u00b0"+
		"\n\26\f\26\16\26\u00b3\13\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 "+
		"\3 \3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3%\3&\3&\3&\3&\3\'\3\'\3"+
		"\'\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3,\3-\3-\3-\3.\3.\3.\3.\3/\3/\3"+
		"/\3\60\3\60\3\60\3\60\3\61\3\61\7\61\u010d\n\61\f\61\16\61\u0110\13\61"+
		"\2\2\62\3\2\5\2\7\2\t\2\13\2\r\2\17\2\21\2\23\3\25\4\27\2\31\5\33\6\35"+
		"\7\37\b!\t#\n%\13\'\f)\r+\16-\17/\20\61\21\63\22\65\23\67\249\25;\26="+
		"\27?\30A\31C\32E\33G\34I\35K\36M\37O Q!S\"U#W$Y%[&]\'_(a)\3\2\n\3\2\62"+
		";\3\2\63;\3\2c|\3\2C\\\3\2\13\13\5\2C\\aac|\6\2\62;C\\aac|\4\2\f\f\16"+
		"\17\2\u0112\2\23\3\2\2\2\2\25\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65"+
		"\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3"+
		"\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2"+
		"\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2"+
		"[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5e\3\2\2\2\7g\3"+
		"\2\2\2\ti\3\2\2\2\13v\3\2\2\2\rx\3\2\2\2\17\u0085\3\2\2\2\21\u0089\3\2"+
		"\2\2\23\u008e\3\2\2\2\25\u0090\3\2\2\2\27\u0092\3\2\2\2\31\u0094\3\2\2"+
		"\2\33\u0096\3\2\2\2\35\u0098\3\2\2\2\37\u009a\3\2\2\2!\u009c\3\2\2\2#"+
		"\u009e\3\2\2\2%\u00a1\3\2\2\2\'\u00a6\3\2\2\2)\u00ab\3\2\2\2+\u00ad\3"+
		"\2\2\2-\u00b4\3\2\2\2/\u00ba\3\2\2\2\61\u00be\3\2\2\2\63\u00c4\3\2\2\2"+
		"\65\u00cd\3\2\2\2\67\u00cf\3\2\2\29\u00d1\3\2\2\2;\u00d3\3\2\2\2=\u00d5"+
		"\3\2\2\2?\u00d7\3\2\2\2A\u00da\3\2\2\2C\u00dc\3\2\2\2E\u00df\3\2\2\2G"+
		"\u00e2\3\2\2\2I\u00e5\3\2\2\2K\u00e8\3\2\2\2M\u00ec\3\2\2\2O\u00ef\3\2"+
		"\2\2Q\u00f1\3\2\2\2S\u00f4\3\2\2\2U\u00f6\3\2\2\2W\u00f9\3\2\2\2Y\u00fc"+
		"\3\2\2\2[\u00ff\3\2\2\2]\u0103\3\2\2\2_\u0106\3\2\2\2a\u010a\3\2\2\2c"+
		"d\t\2\2\2d\4\3\2\2\2ef\t\3\2\2f\6\3\2\2\2gh\t\4\2\2h\b\3\2\2\2ij\t\5\2"+
		"\2j\n\3\2\2\2km\5\67\34\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2nr\5\5\3\2oq\5"+
		"\3\2\2po\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2sw\3\2\2\2tr\3\2\2\2uw\7"+
		"\62\2\2vl\3\2\2\2vu\3\2\2\2w\f\3\2\2\2xz\7\60\2\2y{\5\3\2\2zy\3\2\2\2"+
		"{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\16\3\2\2\2~\u0080\5\13\6\2\177~\3\2\2"+
		"\2\177\u0080\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0086\5\r\7\2\u0082\u0083"+
		"\5\13\6\2\u0083\u0084\7\60\2\2\u0084\u0086\3\2\2\2\u0085\177\3\2\2\2\u0085"+
		"\u0082\3\2\2\2\u0086\20\3\2\2\2\u0087\u008a\5\13\6\2\u0088\u008a\5\17"+
		"\b\2\u0089\u0087\3\2\2\2\u0089\u0088\3\2\2\2\u008a\22\3\2\2\2\u008b\u008f"+
		"\7\"\2\2\u008c\u008f\5\25\13\2\u008d\u008f\5\27\f\2\u008e\u008b\3\2\2"+
		"\2\u008e\u008c\3\2\2\2\u008e\u008d\3\2\2\2\u008f\24\3\2\2\2\u0090\u0091"+
		"\7\f\2\2\u0091\26\3\2\2\2\u0092\u0093\7\13\2\2\u0093\30\3\2\2\2\u0094"+
		"\u0095\7<\2\2\u0095\32\3\2\2\2\u0096\u0097\7*\2\2\u0097\34\3\2\2\2\u0098"+
		"\u0099\7+\2\2\u0099\36\3\2\2\2\u009a\u009b\7]\2\2\u009b \3\2\2\2\u009c"+
		"\u009d\7_\2\2\u009d\"\3\2\2\2\u009e\u009f\7k\2\2\u009f\u00a0\7h\2\2\u00a0"+
		"$\3\2\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7n\2\2\u00a3\u00a4\7k\2\2\u00a4"+
		"\u00a5\7h\2\2\u00a5&\3\2\2\2\u00a6\u00a7\7g\2\2\u00a7\u00a8\7n\2\2\u00a8"+
		"\u00a9\7u\2\2\u00a9\u00aa\7g\2\2\u00aa(\3\2\2\2\u00ab\u00ac\t\6\2\2\u00ac"+
		"*\3\2\2\2\u00ad\u00b1\t\7\2\2\u00ae\u00b0\t\b\2\2\u00af\u00ae\3\2\2\2"+
		"\u00b0\u00b3\3\2\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2,\3"+
		"\2\2\2\u00b3\u00b1\3\2\2\2\u00b4\u00b5\7y\2\2\u00b5\u00b6\7j\2\2\u00b6"+
		"\u00b7\7k\2\2\u00b7\u00b8\7n\2\2\u00b8\u00b9\7g\2\2\u00b9.\3\2\2\2\u00ba"+
		"\u00bb\7h\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7t\2\2\u00bd\60\3\2\2\2\u00be"+
		"\u00bf\7d\2\2\u00bf\u00c0\7t\2\2\u00c0\u00c1\7g\2\2\u00c1\u00c2\7c\2\2"+
		"\u00c2\u00c3\7m\2\2\u00c3\62\3\2\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6\7"+
		"q\2\2\u00c6\u00c7\7p\2\2\u00c7\u00c8\7v\2\2\u00c8\u00c9\7k\2\2\u00c9\u00ca"+
		"\7p\2\2\u00ca\u00cb\7w\2\2\u00cb\u00cc\7g\2\2\u00cc\64\3\2\2\2\u00cd\u00ce"+
		"\7-\2\2\u00ce\66\3\2\2\2\u00cf\u00d0\7/\2\2\u00d08\3\2\2\2\u00d1\u00d2"+
		"\7,\2\2\u00d2:\3\2\2\2\u00d3\u00d4\7\61\2\2\u00d4<\3\2\2\2\u00d5\u00d6"+
		"\7\'\2\2\u00d6>\3\2\2\2\u00d7\u00d8\7,\2\2\u00d8\u00d9\7,\2\2\u00d9@\3"+
		"\2\2\2\u00da\u00db\7?\2\2\u00dbB\3\2\2\2\u00dc\u00dd\7-\2\2\u00dd\u00de"+
		"\7?\2\2\u00deD\3\2\2\2\u00df\u00e0\7/\2\2\u00e0\u00e1\7?\2\2\u00e1F\3"+
		"\2\2\2\u00e2\u00e3\7,\2\2\u00e3\u00e4\7?\2\2\u00e4H\3\2\2\2\u00e5\u00e6"+
		"\7\61\2\2\u00e6\u00e7\7?\2\2\u00e7J\3\2\2\2\u00e8\u00e9\7,\2\2\u00e9\u00ea"+
		"\7,\2\2\u00ea\u00eb\7?\2\2\u00ebL\3\2\2\2\u00ec\u00ed\7\'\2\2\u00ed\u00ee"+
		"\7?\2\2\u00eeN\3\2\2\2\u00ef\u00f0\7>\2\2\u00f0P\3\2\2\2\u00f1\u00f2\7"+
		">\2\2\u00f2\u00f3\7?\2\2\u00f3R\3\2\2\2\u00f4\u00f5\7@\2\2\u00f5T\3\2"+
		"\2\2\u00f6\u00f7\7@\2\2\u00f7\u00f8\7?\2\2\u00f8V\3\2\2\2\u00f9\u00fa"+
		"\7?\2\2\u00fa\u00fb\7?\2\2\u00fbX\3\2\2\2\u00fc\u00fd\7#\2\2\u00fd\u00fe"+
		"\7?\2\2\u00feZ\3\2\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7p\2\2\u0101\u0102"+
		"\7f\2\2\u0102\\\3\2\2\2\u0103\u0104\7q\2\2\u0104\u0105\7t\2\2\u0105^\3"+
		"\2\2\2\u0106\u0107\7p\2\2\u0107\u0108\7q\2\2\u0108\u0109\7v\2\2\u0109"+
		"`\3\2\2\2\u010a\u010e\7%\2\2\u010b\u010d\n\t\2\2\u010c\u010b\3\2\2\2\u010d"+
		"\u0110\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010fb\3\2\2\2"+
		"\u0110\u010e\3\2\2\2\r\2lrv|\177\u0085\u0089\u008e\u00b1\u010e\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}