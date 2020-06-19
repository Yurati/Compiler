package grammar;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHOLE=1, DOULOT=2, BOOELAN=3, INSCRIPTION=4, FUNC=5, UNLESS=6, ELSE=7, 
		AGAINST=8, DONT=9, NOTTHISTIME=10, IRRELEVANT=11, BREAK=12, CONTINUE=13, 
		PRINT=14, TRUE=15, FALSE=16, NOPELITERAL=17, RPAREN=18, LPAREN=19, RBRACE=20, 
		LBRACE=21, RBRACK=22, LBRACK=23, SEMICOLON=24, COMMA=25, DOT=26, ASSIGN=27, 
		GT=28, LT=29, BANG=30, QUESTION=31, COLON=32, EQUAL=33, LTEQ=34, GTEQ=35, 
		NOTEQUAL=36, AND=37, OR=38, ADD=39, SUB=40, MUL=41, DIV=42, COMMENT=43, 
		ID=44, WHOLE_VALUE=45, DOULOT_VALUE=46, INSCRIPTION_VALUE=47, SPACE=48, 
		OTHER=49;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHOLE", "DOULOT", "BOOELAN", "INSCRIPTION", "FUNC", "UNLESS", "ELSE", 
			"AGAINST", "DONT", "NOTTHISTIME", "IRRELEVANT", "BREAK", "CONTINUE", 
			"PRINT", "TRUE", "FALSE", "NOPELITERAL", "RPAREN", "LPAREN", "RBRACE", 
			"LBRACE", "RBRACK", "LBRACK", "SEMICOLON", "COMMA", "DOT", "ASSIGN", 
			"GT", "LT", "BANG", "QUESTION", "COLON", "EQUAL", "LTEQ", "GTEQ", "NOTEQUAL", 
			"AND", "OR", "ADD", "SUB", "MUL", "DIV", "COMMENT", "ID", "WHOLE_VALUE", 
			"DOULOT_VALUE", "INSCRIPTION_VALUE", "SPACE", "OTHER"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'whole'", "'doulot'", "'boolean'", "'inscription'", "'func'", 
			"'unless'", "'and'", "'against'", "'dont'", "'not this time'", "'irrelevant'", 
			"'break'", "'continue'", "'print'", "'true'", "'false'", "'nope'", "'('", 
			"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'=='", "'<'", 
			"'>'", "'?'", "'!'", "':'", "'='", "'>='", "'<='", "'?=='", "'||'", "'&&'", 
			"'-'", "'+'", "'/'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHOLE", "DOULOT", "BOOELAN", "INSCRIPTION", "FUNC", "UNLESS", 
			"ELSE", "AGAINST", "DONT", "NOTTHISTIME", "IRRELEVANT", "BREAK", "CONTINUE", 
			"PRINT", "TRUE", "FALSE", "NOPELITERAL", "RPAREN", "LPAREN", "RBRACE", 
			"LBRACE", "RBRACK", "LBRACK", "SEMICOLON", "COMMA", "DOT", "ASSIGN", 
			"GT", "LT", "BANG", "QUESTION", "COLON", "EQUAL", "LTEQ", "GTEQ", "NOTEQUAL", 
			"AND", "OR", "ADD", "SUB", "MUL", "DIV", "COMMENT", "ID", "WHOLE_VALUE", 
			"DOULOT_VALUE", "INSCRIPTION_VALUE", "SPACE", "OTHER"
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


	public LanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "LanguageLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\63\u0154\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3$\3"+
		"$\3$\3%\3%\3%\3%\3&\3&\3&\3\'\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\7"+
		",\u011d\n,\f,\16,\u0120\13,\3,\3,\3-\3-\7-\u0126\n-\f-\16-\u0129\13-\3"+
		".\6.\u012c\n.\r.\16.\u012d\3/\6/\u0131\n/\r/\16/\u0132\3/\3/\7/\u0137"+
		"\n/\f/\16/\u013a\13/\3/\3/\6/\u013e\n/\r/\16/\u013f\5/\u0142\n/\3\60\3"+
		"\60\3\60\3\60\7\60\u0148\n\60\f\60\16\60\u014b\13\60\3\60\3\60\3\61\3"+
		"\61\3\61\3\61\3\62\3\62\2\2\63\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61"+
		"a\62c\63\3\2\b\4\2\f\f\17\17\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\f\f"+
		"\17\17$$\5\2\13\f\17\17\"\"\2\u015c\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2"+
		"\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2["+
		"\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\3e\3\2\2\2\5k\3\2"+
		"\2\2\7r\3\2\2\2\tz\3\2\2\2\13\u0086\3\2\2\2\r\u008b\3\2\2\2\17\u0092\3"+
		"\2\2\2\21\u0096\3\2\2\2\23\u009e\3\2\2\2\25\u00a3\3\2\2\2\27\u00b1\3\2"+
		"\2\2\31\u00bc\3\2\2\2\33\u00c2\3\2\2\2\35\u00cb\3\2\2\2\37\u00d1\3\2\2"+
		"\2!\u00d6\3\2\2\2#\u00dc\3\2\2\2%\u00e1\3\2\2\2\'\u00e3\3\2\2\2)\u00e5"+
		"\3\2\2\2+\u00e7\3\2\2\2-\u00e9\3\2\2\2/\u00eb\3\2\2\2\61\u00ed\3\2\2\2"+
		"\63\u00ef\3\2\2\2\65\u00f1\3\2\2\2\67\u00f3\3\2\2\29\u00f6\3\2\2\2;\u00f8"+
		"\3\2\2\2=\u00fa\3\2\2\2?\u00fc\3\2\2\2A\u00fe\3\2\2\2C\u0100\3\2\2\2E"+
		"\u0102\3\2\2\2G\u0105\3\2\2\2I\u0108\3\2\2\2K\u010c\3\2\2\2M\u010f\3\2"+
		"\2\2O\u0112\3\2\2\2Q\u0114\3\2\2\2S\u0116\3\2\2\2U\u0118\3\2\2\2W\u011a"+
		"\3\2\2\2Y\u0123\3\2\2\2[\u012b\3\2\2\2]\u0141\3\2\2\2_\u0143\3\2\2\2a"+
		"\u014e\3\2\2\2c\u0152\3\2\2\2ef\7y\2\2fg\7j\2\2gh\7q\2\2hi\7n\2\2ij\7"+
		"g\2\2j\4\3\2\2\2kl\7f\2\2lm\7q\2\2mn\7w\2\2no\7n\2\2op\7q\2\2pq\7v\2\2"+
		"q\6\3\2\2\2rs\7d\2\2st\7q\2\2tu\7q\2\2uv\7n\2\2vw\7g\2\2wx\7c\2\2xy\7"+
		"p\2\2y\b\3\2\2\2z{\7k\2\2{|\7p\2\2|}\7u\2\2}~\7e\2\2~\177\7t\2\2\177\u0080"+
		"\7k\2\2\u0080\u0081\7r\2\2\u0081\u0082\7v\2\2\u0082\u0083\7k\2\2\u0083"+
		"\u0084\7q\2\2\u0084\u0085\7p\2\2\u0085\n\3\2\2\2\u0086\u0087\7h\2\2\u0087"+
		"\u0088\7w\2\2\u0088\u0089\7p\2\2\u0089\u008a\7e\2\2\u008a\f\3\2\2\2\u008b"+
		"\u008c\7w\2\2\u008c\u008d\7p\2\2\u008d\u008e\7n\2\2\u008e\u008f\7g\2\2"+
		"\u008f\u0090\7u\2\2\u0090\u0091\7u\2\2\u0091\16\3\2\2\2\u0092\u0093\7"+
		"c\2\2\u0093\u0094\7p\2\2\u0094\u0095\7f\2\2\u0095\20\3\2\2\2\u0096\u0097"+
		"\7c\2\2\u0097\u0098\7i\2\2\u0098\u0099\7c\2\2\u0099\u009a\7k\2\2\u009a"+
		"\u009b\7p\2\2\u009b\u009c\7u\2\2\u009c\u009d\7v\2\2\u009d\22\3\2\2\2\u009e"+
		"\u009f\7f\2\2\u009f\u00a0\7q\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7v\2\2"+
		"\u00a2\24\3\2\2\2\u00a3\u00a4\7p\2\2\u00a4\u00a5\7q\2\2\u00a5\u00a6\7"+
		"v\2\2\u00a6\u00a7\7\"\2\2\u00a7\u00a8\7v\2\2\u00a8\u00a9\7j\2\2\u00a9"+
		"\u00aa\7k\2\2\u00aa\u00ab\7u\2\2\u00ab\u00ac\7\"\2\2\u00ac\u00ad\7v\2"+
		"\2\u00ad\u00ae\7k\2\2\u00ae\u00af\7o\2\2\u00af\u00b0\7g\2\2\u00b0\26\3"+
		"\2\2\2\u00b1\u00b2\7k\2\2\u00b2\u00b3\7t\2\2\u00b3\u00b4\7t\2\2\u00b4"+
		"\u00b5\7g\2\2\u00b5\u00b6\7n\2\2\u00b6\u00b7\7g\2\2\u00b7\u00b8\7x\2\2"+
		"\u00b8\u00b9\7c\2\2\u00b9\u00ba\7p\2\2\u00ba\u00bb\7v\2\2\u00bb\30\3\2"+
		"\2\2\u00bc\u00bd\7d\2\2\u00bd\u00be\7t\2\2\u00be\u00bf\7g\2\2\u00bf\u00c0"+
		"\7c\2\2\u00c0\u00c1\7m\2\2\u00c1\32\3\2\2\2\u00c2\u00c3\7e\2\2\u00c3\u00c4"+
		"\7q\2\2\u00c4\u00c5\7p\2\2\u00c5\u00c6\7v\2\2\u00c6\u00c7\7k\2\2\u00c7"+
		"\u00c8\7p\2\2\u00c8\u00c9\7w\2\2\u00c9\u00ca\7g\2\2\u00ca\34\3\2\2\2\u00cb"+
		"\u00cc\7r\2\2\u00cc\u00cd\7t\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7p\2\2"+
		"\u00cf\u00d0\7v\2\2\u00d0\36\3\2\2\2\u00d1\u00d2\7v\2\2\u00d2\u00d3\7"+
		"t\2\2\u00d3\u00d4\7w\2\2\u00d4\u00d5\7g\2\2\u00d5 \3\2\2\2\u00d6\u00d7"+
		"\7h\2\2\u00d7\u00d8\7c\2\2\u00d8\u00d9\7n\2\2\u00d9\u00da\7u\2\2\u00da"+
		"\u00db\7g\2\2\u00db\"\3\2\2\2\u00dc\u00dd\7p\2\2\u00dd\u00de\7q\2\2\u00de"+
		"\u00df\7r\2\2\u00df\u00e0\7g\2\2\u00e0$\3\2\2\2\u00e1\u00e2\7*\2\2\u00e2"+
		"&\3\2\2\2\u00e3\u00e4\7+\2\2\u00e4(\3\2\2\2\u00e5\u00e6\7}\2\2\u00e6*"+
		"\3\2\2\2\u00e7\u00e8\7\177\2\2\u00e8,\3\2\2\2\u00e9\u00ea\7]\2\2\u00ea"+
		".\3\2\2\2\u00eb\u00ec\7_\2\2\u00ec\60\3\2\2\2\u00ed\u00ee\7=\2\2\u00ee"+
		"\62\3\2\2\2\u00ef\u00f0\7.\2\2\u00f0\64\3\2\2\2\u00f1\u00f2\7\60\2\2\u00f2"+
		"\66\3\2\2\2\u00f3\u00f4\7?\2\2\u00f4\u00f5\7?\2\2\u00f58\3\2\2\2\u00f6"+
		"\u00f7\7>\2\2\u00f7:\3\2\2\2\u00f8\u00f9\7@\2\2\u00f9<\3\2\2\2\u00fa\u00fb"+
		"\7A\2\2\u00fb>\3\2\2\2\u00fc\u00fd\7#\2\2\u00fd@\3\2\2\2\u00fe\u00ff\7"+
		"<\2\2\u00ffB\3\2\2\2\u0100\u0101\7?\2\2\u0101D\3\2\2\2\u0102\u0103\7@"+
		"\2\2\u0103\u0104\7?\2\2\u0104F\3\2\2\2\u0105\u0106\7>\2\2\u0106\u0107"+
		"\7?\2\2\u0107H\3\2\2\2\u0108\u0109\7A\2\2\u0109\u010a\7?\2\2\u010a\u010b"+
		"\7?\2\2\u010bJ\3\2\2\2\u010c\u010d\7~\2\2\u010d\u010e\7~\2\2\u010eL\3"+
		"\2\2\2\u010f\u0110\7(\2\2\u0110\u0111\7(\2\2\u0111N\3\2\2\2\u0112\u0113"+
		"\7/\2\2\u0113P\3\2\2\2\u0114\u0115\7-\2\2\u0115R\3\2\2\2\u0116\u0117\7"+
		"\61\2\2\u0117T\3\2\2\2\u0118\u0119\7,\2\2\u0119V\3\2\2\2\u011a\u011e\5"+
		"\27\f\2\u011b\u011d\n\2\2\2\u011c\u011b\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0121\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0121\u0122\b,\2\2\u0122X\3\2\2\2\u0123\u0127\t\3\2\2\u0124\u0126"+
		"\t\4\2\2\u0125\u0124\3\2\2\2\u0126\u0129\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128Z\3\2\2\2\u0129\u0127\3\2\2\2\u012a\u012c\t\5\2\2"+
		"\u012b\u012a\3\2\2\2\u012c\u012d\3\2\2\2\u012d\u012b\3\2\2\2\u012d\u012e"+
		"\3\2\2\2\u012e\\\3\2\2\2\u012f\u0131\t\5\2\2\u0130\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u0138\7\60\2\2\u0135\u0137\t\5\2\2\u0136\u0135\3\2\2\2\u0137"+
		"\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139\u0142\3\2"+
		"\2\2\u013a\u0138\3\2\2\2\u013b\u013d\7\60\2\2\u013c\u013e\t\5\2\2\u013d"+
		"\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u013d\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0142\3\2\2\2\u0141\u0130\3\2\2\2\u0141\u013b\3\2\2\2\u0142"+
		"^\3\2\2\2\u0143\u0149\7$\2\2\u0144\u0148\n\6\2\2\u0145\u0146\7$\2\2\u0146"+
		"\u0148\7$\2\2\u0147\u0144\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u014b\3\2"+
		"\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014c\3\2\2\2\u014b"+
		"\u0149\3\2\2\2\u014c\u014d\7$\2\2\u014d`\3\2\2\2\u014e\u014f\t\7\2\2\u014f"+
		"\u0150\3\2\2\2\u0150\u0151\b\61\2\2\u0151b\3\2\2\2\u0152\u0153\13\2\2"+
		"\2\u0153d\3\2\2\2\f\2\u011e\u0127\u012d\u0132\u0138\u013f\u0141\u0147"+
		"\u0149\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}