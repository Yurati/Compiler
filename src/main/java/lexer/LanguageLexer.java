// Generated from C:/SabreDeveloper/code/Studia/Compiler/src/main/resources/grammar\LanguageLexer.g4 by ANTLR 4.8
package lexer;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHOLE=1, DOULOT=2, BOOELAN=3, INSCRIPTION=4, FUNC=5, UNLESS=6, ANDWHILE=7, 
		AGAINST=8, DONT=9, NOTTHISTIME=10, IRRELEVANT=11, IntegerLiteral=12, FloatingPointLiteral=13, 
		BooleanLiteral=14, CharacterLiteral=15, StringLiteral=16, NopeLiteral=17, 
		RPAREN=18, LPAREN=19, RBRACE=20, LBRACE=21, RBRACK=22, LBRACK=23, SEMICOLON=24, 
		COMMA=25, DOT=26, ASSIGN=27, GT=28, LT=29, BANG=30, QUESTION=31, COLON=32, 
		EQUAL=33, LE=34, GE=35, NOTEQUAL=36, AND=37, OR=38, ADD=39, SUB=40, MUL=41, 
		DIV=42, WS=43, LINE_COMMENT=44;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHOLE", "DOULOT", "BOOELAN", "INSCRIPTION", "FUNC", "UNLESS", "ANDWHILE", 
			"AGAINST", "DONT", "NOTTHISTIME", "IRRELEVANT", "IntegerLiteral", "DecimalIntegerLiteral", 
			"IntegerTypeSuffix", "DecimalNumeral", "Digits", "Digit", "NonZeroDigit", 
			"DigitsAndUnderscores", "DigitOrUnderscore", "Underscores", "FloatingPointLiteral", 
			"DecimalFloatingPointLiteral", "ExponentPart", "ExponentIndicator", "SignedInteger", 
			"Sign", "FloatTypeSuffix", "BooleanLiteral", "CharacterLiteral", "SingleCharacter", 
			"StringLiteral", "StringCharacters", "StringCharacter", "ZeroToThree", 
			"NopeLiteral", "RPAREN", "LPAREN", "RBRACE", "LBRACE", "RBRACK", "LBRACK", 
			"SEMICOLON", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "QUESTION", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "ADD", "SUB", 
			"MUL", "DIV", "WS", "LINE_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'whole'", "'doulot'", "'boolean'", "'inscription'", "'func'", 
			"'unless'", "'and'", "'against'", "'dont'", "'not this time'", "'irrelevant'", 
			null, null, null, null, null, "'nope'", "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "';'", "','", "'.'", "'=='", "'<'", "'>'", "'?'", "'!'", "':'", 
			"'='", "'>='", "'<='", "'?=='", "'||'", "'&&'", "'-'", "'+'", "'/'", 
			"'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHOLE", "DOULOT", "BOOELAN", "INSCRIPTION", "FUNC", "UNLESS", 
			"ANDWHILE", "AGAINST", "DONT", "NOTTHISTIME", "IRRELEVANT", "IntegerLiteral", 
			"FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", 
			"NopeLiteral", "RPAREN", "LPAREN", "RBRACE", "LBRACE", "RBRACK", "LBRACK", 
			"SEMICOLON", "COMMA", "DOT", "ASSIGN", "GT", "LT", "BANG", "QUESTION", 
			"COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", "OR", "ADD", "SUB", 
			"MUL", "DIV", "WS", "LINE_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u01a2\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\5\16\u00dd\n\16\3\17"+
		"\3\17\3\20\3\20\3\20\5\20\u00e4\n\20\3\20\3\20\3\20\5\20\u00e9\n\20\5"+
		"\20\u00eb\n\20\3\21\3\21\5\21\u00ef\n\21\3\21\5\21\u00f2\n\21\3\22\3\22"+
		"\5\22\u00f6\n\22\3\23\3\23\3\24\6\24\u00fb\n\24\r\24\16\24\u00fc\3\25"+
		"\3\25\5\25\u0101\n\25\3\26\6\26\u0104\n\26\r\26\16\26\u0105\3\27\3\27"+
		"\3\30\3\30\3\30\5\30\u010d\n\30\3\30\5\30\u0110\n\30\3\30\5\30\u0113\n"+
		"\30\3\30\3\30\3\30\5\30\u0118\n\30\3\30\5\30\u011b\n\30\3\30\3\30\3\30"+
		"\5\30\u0120\n\30\3\30\3\30\3\30\5\30\u0125\n\30\3\31\3\31\3\31\3\32\3"+
		"\32\3\33\5\33\u012d\n\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u013e\n\36\3\37\3\37\3\37\3\37\3 "+
		"\3 \3!\3!\5!\u0148\n!\3!\3!\3\"\6\"\u014d\n\"\r\"\16\"\u014e\3#\3#\3$"+
		"\3$\3%\3%\3%\3%\3%\3&\3&\3\'\3\'\3(\3(\3)\3)\3*\3*\3+\3+\3,\3,\3-\3-\3"+
		".\3.\3/\3/\3/\3\60\3\60\3\61\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3"+
		"\65\3\66\3\66\3\66\3\67\3\67\3\67\38\38\38\38\39\39\39\3:\3:\3:\3;\3;"+
		"\3<\3<\3=\3=\3>\3>\3?\6?\u0194\n?\r?\16?\u0195\3?\3?\3@\3@\7@\u019c\n"+
		"@\f@\16@\u019f\13@\3@\3@\2\2A\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\2\35\2\37\2!\2#\2%\2\'\2)\2+\2-\17/\2\61\2\63\2\65"+
		"\2\67\29\2;\20=\21?\2A\22C\2E\2G\2I\23K\24M\25O\26Q\27S\30U\31W\32Y\33"+
		"[\34]\35_\36a\37c e!g\"i#k$m%o&q\'s(u)w*y+{,}-\177.\3\2\f\4\2NNnn\3\2"+
		"\63;\4\2GGgg\4\2--//\6\2FFHHffhh\6\2\f\f\17\17))^^\6\2\f\f\17\17$$^^\3"+
		"\2\62\65\5\2\13\f\16\17\"\"\4\2\f\f\17\17\2\u01a7\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2-\3\2\2"+
		"\2\2;\3\2\2\2\2=\3\2\2\2\2A\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3"+
		"\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2"+
		"\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2"+
		"u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\3"+
		"\u0081\3\2\2\2\5\u0087\3\2\2\2\7\u008e\3\2\2\2\t\u0096\3\2\2\2\13\u00a2"+
		"\3\2\2\2\r\u00a7\3\2\2\2\17\u00ae\3\2\2\2\21\u00b2\3\2\2\2\23\u00ba\3"+
		"\2\2\2\25\u00bf\3\2\2\2\27\u00cd\3\2\2\2\31\u00d8\3\2\2\2\33\u00da\3\2"+
		"\2\2\35\u00de\3\2\2\2\37\u00ea\3\2\2\2!\u00ec\3\2\2\2#\u00f5\3\2\2\2%"+
		"\u00f7\3\2\2\2\'\u00fa\3\2\2\2)\u0100\3\2\2\2+\u0103\3\2\2\2-\u0107\3"+
		"\2\2\2/\u0124\3\2\2\2\61\u0126\3\2\2\2\63\u0129\3\2\2\2\65\u012c\3\2\2"+
		"\2\67\u0130\3\2\2\29\u0132\3\2\2\2;\u013d\3\2\2\2=\u013f\3\2\2\2?\u0143"+
		"\3\2\2\2A\u0145\3\2\2\2C\u014c\3\2\2\2E\u0150\3\2\2\2G\u0152\3\2\2\2I"+
		"\u0154\3\2\2\2K\u0159\3\2\2\2M\u015b\3\2\2\2O\u015d\3\2\2\2Q\u015f\3\2"+
		"\2\2S\u0161\3\2\2\2U\u0163\3\2\2\2W\u0165\3\2\2\2Y\u0167\3\2\2\2[\u0169"+
		"\3\2\2\2]\u016b\3\2\2\2_\u016e\3\2\2\2a\u0170\3\2\2\2c\u0172\3\2\2\2e"+
		"\u0174\3\2\2\2g\u0176\3\2\2\2i\u0178\3\2\2\2k\u017a\3\2\2\2m\u017d\3\2"+
		"\2\2o\u0180\3\2\2\2q\u0184\3\2\2\2s\u0187\3\2\2\2u\u018a\3\2\2\2w\u018c"+
		"\3\2\2\2y\u018e\3\2\2\2{\u0190\3\2\2\2}\u0193\3\2\2\2\177\u0199\3\2\2"+
		"\2\u0081\u0082\7y\2\2\u0082\u0083\7j\2\2\u0083\u0084\7q\2\2\u0084\u0085"+
		"\7n\2\2\u0085\u0086\7g\2\2\u0086\4\3\2\2\2\u0087\u0088\7f\2\2\u0088\u0089"+
		"\7q\2\2\u0089\u008a\7w\2\2\u008a\u008b\7n\2\2\u008b\u008c\7q\2\2\u008c"+
		"\u008d\7v\2\2\u008d\6\3\2\2\2\u008e\u008f\7d\2\2\u008f\u0090\7q\2\2\u0090"+
		"\u0091\7q\2\2\u0091\u0092\7n\2\2\u0092\u0093\7g\2\2\u0093\u0094\7c\2\2"+
		"\u0094\u0095\7p\2\2\u0095\b\3\2\2\2\u0096\u0097\7k\2\2\u0097\u0098\7p"+
		"\2\2\u0098\u0099\7u\2\2\u0099\u009a\7e\2\2\u009a\u009b\7t\2\2\u009b\u009c"+
		"\7k\2\2\u009c\u009d\7r\2\2\u009d\u009e\7v\2\2\u009e\u009f\7k\2\2\u009f"+
		"\u00a0\7q\2\2\u00a0\u00a1\7p\2\2\u00a1\n\3\2\2\2\u00a2\u00a3\7h\2\2\u00a3"+
		"\u00a4\7w\2\2\u00a4\u00a5\7p\2\2\u00a5\u00a6\7e\2\2\u00a6\f\3\2\2\2\u00a7"+
		"\u00a8\7w\2\2\u00a8\u00a9\7p\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7g\2\2"+
		"\u00ab\u00ac\7u\2\2\u00ac\u00ad\7u\2\2\u00ad\16\3\2\2\2\u00ae\u00af\7"+
		"c\2\2\u00af\u00b0\7p\2\2\u00b0\u00b1\7f\2\2\u00b1\20\3\2\2\2\u00b2\u00b3"+
		"\7c\2\2\u00b3\u00b4\7i\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7k\2\2\u00b6"+
		"\u00b7\7p\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7v\2\2\u00b9\22\3\2\2\2\u00ba"+
		"\u00bb\7f\2\2\u00bb\u00bc\7q\2\2\u00bc\u00bd\7p\2\2\u00bd\u00be\7v\2\2"+
		"\u00be\24\3\2\2\2\u00bf\u00c0\7p\2\2\u00c0\u00c1\7q\2\2\u00c1\u00c2\7"+
		"v\2\2\u00c2\u00c3\7\"\2\2\u00c3\u00c4\7v\2\2\u00c4\u00c5\7j\2\2\u00c5"+
		"\u00c6\7k\2\2\u00c6\u00c7\7u\2\2\u00c7\u00c8\7\"\2\2\u00c8\u00c9\7v\2"+
		"\2\u00c9\u00ca\7k\2\2\u00ca\u00cb\7o\2\2\u00cb\u00cc\7g\2\2\u00cc\26\3"+
		"\2\2\2\u00cd\u00ce\7k\2\2\u00ce\u00cf\7t\2\2\u00cf\u00d0\7t\2\2\u00d0"+
		"\u00d1\7g\2\2\u00d1\u00d2\7n\2\2\u00d2\u00d3\7g\2\2\u00d3\u00d4\7x\2\2"+
		"\u00d4\u00d5\7c\2\2\u00d5\u00d6\7p\2\2\u00d6\u00d7\7v\2\2\u00d7\30\3\2"+
		"\2\2\u00d8\u00d9\5\33\16\2\u00d9\32\3\2\2\2\u00da\u00dc\5\37\20\2\u00db"+
		"\u00dd\5\35\17\2\u00dc\u00db\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\34\3\2"+
		"\2\2\u00de\u00df\t\2\2\2\u00df\36\3\2\2\2\u00e0\u00eb\7\62\2\2\u00e1\u00e8"+
		"\5%\23\2\u00e2\u00e4\5!\21\2\u00e3\u00e2\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4"+
		"\u00e9\3\2\2\2\u00e5\u00e6\5+\26\2\u00e6\u00e7\5!\21\2\u00e7\u00e9\3\2"+
		"\2\2\u00e8\u00e3\3\2\2\2\u00e8\u00e5\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea"+
		"\u00e0\3\2\2\2\u00ea\u00e1\3\2\2\2\u00eb \3\2\2\2\u00ec\u00f1\5#\22\2"+
		"\u00ed\u00ef\5\'\24\2\u00ee\u00ed\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ef\u00f0"+
		"\3\2\2\2\u00f0\u00f2\5#\22\2\u00f1\u00ee\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\"\3\2\2\2\u00f3\u00f6\7\62\2\2\u00f4\u00f6\5%\23\2\u00f5\u00f3\3\2\2"+
		"\2\u00f5\u00f4\3\2\2\2\u00f6$\3\2\2\2\u00f7\u00f8\t\3\2\2\u00f8&\3\2\2"+
		"\2\u00f9\u00fb\5)\25\2\u00fa\u00f9\3\2\2\2\u00fb\u00fc\3\2\2\2\u00fc\u00fa"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd(\3\2\2\2\u00fe\u0101\5#\22\2\u00ff"+
		"\u0101\7a\2\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101*\3\2\2\2\u0102"+
		"\u0104\7a\2\2\u0103\u0102\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0103\3\2"+
		"\2\2\u0105\u0106\3\2\2\2\u0106,\3\2\2\2\u0107\u0108\5/\30\2\u0108.\3\2"+
		"\2\2\u0109\u010a\5!\21\2\u010a\u010c\7\60\2\2\u010b\u010d\5!\21\2\u010c"+
		"\u010b\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\3\2\2\2\u010e\u0110\5\61"+
		"\31\2\u010f\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0112\3\2\2\2\u0111"+
		"\u0113\59\35\2\u0112\u0111\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u0125\3\2"+
		"\2\2\u0114\u0115\7\60\2\2\u0115\u0117\5!\21\2\u0116\u0118\5\61\31\2\u0117"+
		"\u0116\3\2\2\2\u0117\u0118\3\2\2\2\u0118\u011a\3\2\2\2\u0119\u011b\59"+
		"\35\2\u011a\u0119\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u0125\3\2\2\2\u011c"+
		"\u011d\5!\21\2\u011d\u011f\5\61\31\2\u011e\u0120\59\35\2\u011f\u011e\3"+
		"\2\2\2\u011f\u0120\3\2\2\2\u0120\u0125\3\2\2\2\u0121\u0122\5!\21\2\u0122"+
		"\u0123\59\35\2\u0123\u0125\3\2\2\2\u0124\u0109\3\2\2\2\u0124\u0114\3\2"+
		"\2\2\u0124\u011c\3\2\2\2\u0124\u0121\3\2\2\2\u0125\60\3\2\2\2\u0126\u0127"+
		"\5\63\32\2\u0127\u0128\5\65\33\2\u0128\62\3\2\2\2\u0129\u012a\t\4\2\2"+
		"\u012a\64\3\2\2\2\u012b\u012d\5\67\34\2\u012c\u012b\3\2\2\2\u012c\u012d"+
		"\3\2\2\2\u012d\u012e\3\2\2\2\u012e\u012f\5!\21\2\u012f\66\3\2\2\2\u0130"+
		"\u0131\t\5\2\2\u01318\3\2\2\2\u0132\u0133\t\6\2\2\u0133:\3\2\2\2\u0134"+
		"\u0135\7v\2\2\u0135\u0136\7t\2\2\u0136\u0137\7w\2\2\u0137\u013e\7g\2\2"+
		"\u0138\u0139\7h\2\2\u0139\u013a\7c\2\2\u013a\u013b\7n\2\2\u013b\u013c"+
		"\7u\2\2\u013c\u013e\7g\2\2\u013d\u0134\3\2\2\2\u013d\u0138\3\2\2\2\u013e"+
		"<\3\2\2\2\u013f\u0140\7)\2\2\u0140\u0141\5? \2\u0141\u0142\7)\2\2\u0142"+
		">\3\2\2\2\u0143\u0144\n\7\2\2\u0144@\3\2\2\2\u0145\u0147\7$\2\2\u0146"+
		"\u0148\5C\"\2\u0147\u0146\3\2\2\2\u0147\u0148\3\2\2\2\u0148\u0149\3\2"+
		"\2\2\u0149\u014a\7$\2\2\u014aB\3\2\2\2\u014b\u014d\5E#\2\u014c\u014b\3"+
		"\2\2\2\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f"+
		"D\3\2\2\2\u0150\u0151\n\b\2\2\u0151F\3\2\2\2\u0152\u0153\t\t\2\2\u0153"+
		"H\3\2\2\2\u0154\u0155\7p\2\2\u0155\u0156\7q\2\2\u0156\u0157\7r\2\2\u0157"+
		"\u0158\7g\2\2\u0158J\3\2\2\2\u0159\u015a\7*\2\2\u015aL\3\2\2\2\u015b\u015c"+
		"\7+\2\2\u015cN\3\2\2\2\u015d\u015e\7}\2\2\u015eP\3\2\2\2\u015f\u0160\7"+
		"\177\2\2\u0160R\3\2\2\2\u0161\u0162\7]\2\2\u0162T\3\2\2\2\u0163\u0164"+
		"\7_\2\2\u0164V\3\2\2\2\u0165\u0166\7=\2\2\u0166X\3\2\2\2\u0167\u0168\7"+
		".\2\2\u0168Z\3\2\2\2\u0169\u016a\7\60\2\2\u016a\\\3\2\2\2\u016b\u016c"+
		"\7?\2\2\u016c\u016d\7?\2\2\u016d^\3\2\2\2\u016e\u016f\7>\2\2\u016f`\3"+
		"\2\2\2\u0170\u0171\7@\2\2\u0171b\3\2\2\2\u0172\u0173\7A\2\2\u0173d\3\2"+
		"\2\2\u0174\u0175\7#\2\2\u0175f\3\2\2\2\u0176\u0177\7<\2\2\u0177h\3\2\2"+
		"\2\u0178\u0179\7?\2\2\u0179j\3\2\2\2\u017a\u017b\7@\2\2\u017b\u017c\7"+
		"?\2\2\u017cl\3\2\2\2\u017d\u017e\7>\2\2\u017e\u017f\7?\2\2\u017fn\3\2"+
		"\2\2\u0180\u0181\7A\2\2\u0181\u0182\7?\2\2\u0182\u0183\7?\2\2\u0183p\3"+
		"\2\2\2\u0184\u0185\7~\2\2\u0185\u0186\7~\2\2\u0186r\3\2\2\2\u0187\u0188"+
		"\7(\2\2\u0188\u0189\7(\2\2\u0189t\3\2\2\2\u018a\u018b\7/\2\2\u018bv\3"+
		"\2\2\2\u018c\u018d\7-\2\2\u018dx\3\2\2\2\u018e\u018f\7\61\2\2\u018fz\3"+
		"\2\2\2\u0190\u0191\7,\2\2\u0191|\3\2\2\2\u0192\u0194\t\n\2\2\u0193\u0192"+
		"\3\2\2\2\u0194\u0195\3\2\2\2\u0195\u0193\3\2\2\2\u0195\u0196\3\2\2\2\u0196"+
		"\u0197\3\2\2\2\u0197\u0198\b?\2\2\u0198~\3\2\2\2\u0199\u019d\5\27\f\2"+
		"\u019a\u019c\n\13\2\2\u019b\u019a\3\2\2\2\u019c\u019f\3\2\2\2\u019d\u019b"+
		"\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u01a0\3\2\2\2\u019f\u019d\3\2\2\2\u01a0"+
		"\u01a1\b@\2\2\u01a1\u0080\3\2\2\2\32\2\u00dc\u00e3\u00e8\u00ea\u00ee\u00f1"+
		"\u00f5\u00fc\u0100\u0105\u010c\u010f\u0112\u0117\u011a\u011f\u0124\u012c"+
		"\u013d\u0147\u014e\u0195\u019d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}