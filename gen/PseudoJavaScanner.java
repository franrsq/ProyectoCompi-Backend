// Generated from C:/Users/fran-/IdeaProjects/PseudoJava\PseudoJavaScanner.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PseudoJavaScanner extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		WHILE=1, IF=2, ELSE=3, RETURN=4, PRINT=5, CLASS=6, BOOLEAN=7, CHAR=8, 
		INT=9, STRING=10, LENGTH=11, TRUE=12, FALSE=13, OR=14, AND=15, CUR_OPEN_BRACE=16, 
		CUR_CLOSE_BRACE=17, OPEN_PARENTHESIS=18, CLOSED_PARENTHESIS=19, SEMICOLON=20, 
		COMMA=21, ASSIGN=22, DOT=23, SUM=24, MINUS=25, NEAGTE=26, NEW=27, OPEN_BRACKET=28, 
		CLOSED_BRACKET=29, LESS_THAN=30, GREATER_THAN=31, EQUAL=32, DISTINCT=33, 
		LESS_OR_EQUAL_THAN=34, GREATER_OR_EQUAL_THAN=35, UNDERSCORE=36, SLASH=37, 
		MULTIPLICATION=38, QUOTATION_MARKS=39, WHITESPACES=40, LINE_COMMENT=41, 
		IDENTIFIER=42, INT_LITERAL=43, REAL_LITERAL=44, BOOL_LITERAL=45, STRING_LITERAL=46;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"WHILE", "IF", "ELSE", "RETURN", "PRINT", "CLASS", "BOOLEAN", "CHAR", 
			"INT", "STRING", "LENGTH", "TRUE", "FALSE", "OR", "AND", "CUR_OPEN_BRACE", 
			"CUR_CLOSE_BRACE", "OPEN_PARENTHESIS", "CLOSED_PARENTHESIS", "SEMICOLON", 
			"COMMA", "ASSIGN", "DOT", "SUM", "MINUS", "NEAGTE", "NEW", "OPEN_BRACKET", 
			"CLOSED_BRACKET", "LESS_THAN", "GREATER_THAN", "EQUAL", "DISTINCT", "LESS_OR_EQUAL_THAN", 
			"GREATER_OR_EQUAL_THAN", "UNDERSCORE", "SLASH", "MULTIPLICATION", "QUOTATION_MARKS", 
			"WHITESPACES", "LINE_COMMENT", "IDENTIFIER", "INT_LITERAL", "REAL_LITERAL", 
			"BOOL_LITERAL", "STRING_LITERAL", "PRINTABLE", "LETTER", "DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'if'", "'else'", "'return'", "'print'", "'class'", 
			"'boolean'", "'char'", "'int'", "'string'", "'length'", "'true'", "'false'", 
			"'||'", "'&&'", "'{'", "'}'", "'('", "')'", "';'", "','", "'='", "'.'", 
			"'+'", "'-'", "'!'", "'new'", "'['", "']'", "'<'", "'>'", "'=='", "'!='", 
			"'<='", "'>='", "'_'", "'/'", "'*'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "WHILE", "IF", "ELSE", "RETURN", "PRINT", "CLASS", "BOOLEAN", "CHAR", 
			"INT", "STRING", "LENGTH", "TRUE", "FALSE", "OR", "AND", "CUR_OPEN_BRACE", 
			"CUR_CLOSE_BRACE", "OPEN_PARENTHESIS", "CLOSED_PARENTHESIS", "SEMICOLON", 
			"COMMA", "ASSIGN", "DOT", "SUM", "MINUS", "NEAGTE", "NEW", "OPEN_BRACKET", 
			"CLOSED_BRACKET", "LESS_THAN", "GREATER_THAN", "EQUAL", "DISTINCT", "LESS_OR_EQUAL_THAN", 
			"GREATER_OR_EQUAL_THAN", "UNDERSCORE", "SLASH", "MULTIPLICATION", "QUOTATION_MARKS", 
			"WHITESPACES", "LINE_COMMENT", "IDENTIFIER", "INT_LITERAL", "REAL_LITERAL", 
			"BOOL_LITERAL", "STRING_LITERAL"
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


	public PseudoJavaScanner(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PseudoJavaScanner.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\60\u013f\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3"+
		"\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3"+
		" \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3("+
		"\3)\6)\u00ee\n)\r)\16)\u00ef\3)\3)\3*\3*\3*\3*\7*\u00f8\n*\f*\16*\u00fb"+
		"\13*\3*\3*\3+\3+\5+\u0101\n+\3+\3+\3+\7+\u0106\n+\f+\16+\u0109\13+\3,"+
		"\3,\7,\u010d\n,\f,\16,\u0110\13,\3-\3-\7-\u0114\n-\f-\16-\u0117\13-\3"+
		"-\3-\7-\u011b\n-\f-\16-\u011e\13-\3-\3-\3-\7-\u0123\n-\f-\16-\u0126\13"+
		"-\5-\u0128\n-\3.\3.\5.\u012c\n.\3/\3/\7/\u0130\n/\f/\16/\u0133\13/\3/"+
		"\3/\3\60\3\60\3\60\5\60\u013a\n\60\3\61\3\61\3\62\3\62\2\2\63\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\2a\2c\2\3\2\7\5\2\13\f\17\17\"\"\4\2\f"+
		"\f\17\17\6\2\"\61<B]b}\u0080\4\2C\\c|\3\2\62;\2\u014a\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2"+
		"\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3e\3\2\2\2\5k\3\2\2\2\7n\3\2\2\2"+
		"\ts\3\2\2\2\13z\3\2\2\2\r\u0080\3\2\2\2\17\u0086\3\2\2\2\21\u008e\3\2"+
		"\2\2\23\u0093\3\2\2\2\25\u0097\3\2\2\2\27\u009e\3\2\2\2\31\u00a5\3\2\2"+
		"\2\33\u00aa\3\2\2\2\35\u00b0\3\2\2\2\37\u00b3\3\2\2\2!\u00b6\3\2\2\2#"+
		"\u00b8\3\2\2\2%\u00ba\3\2\2\2\'\u00bc\3\2\2\2)\u00be\3\2\2\2+\u00c0\3"+
		"\2\2\2-\u00c2\3\2\2\2/\u00c4\3\2\2\2\61\u00c6\3\2\2\2\63\u00c8\3\2\2\2"+
		"\65\u00ca\3\2\2\2\67\u00cc\3\2\2\29\u00d0\3\2\2\2;\u00d2\3\2\2\2=\u00d4"+
		"\3\2\2\2?\u00d6\3\2\2\2A\u00d8\3\2\2\2C\u00db\3\2\2\2E\u00de\3\2\2\2G"+
		"\u00e1\3\2\2\2I\u00e4\3\2\2\2K\u00e6\3\2\2\2M\u00e8\3\2\2\2O\u00ea\3\2"+
		"\2\2Q\u00ed\3\2\2\2S\u00f3\3\2\2\2U\u0100\3\2\2\2W\u010a\3\2\2\2Y\u0127"+
		"\3\2\2\2[\u012b\3\2\2\2]\u012d\3\2\2\2_\u0139\3\2\2\2a\u013b\3\2\2\2c"+
		"\u013d\3\2\2\2ef\7y\2\2fg\7j\2\2gh\7k\2\2hi\7n\2\2ij\7g\2\2j\4\3\2\2\2"+
		"kl\7k\2\2lm\7h\2\2m\6\3\2\2\2no\7g\2\2op\7n\2\2pq\7u\2\2qr\7g\2\2r\b\3"+
		"\2\2\2st\7t\2\2tu\7g\2\2uv\7v\2\2vw\7w\2\2wx\7t\2\2xy\7p\2\2y\n\3\2\2"+
		"\2z{\7r\2\2{|\7t\2\2|}\7k\2\2}~\7p\2\2~\177\7v\2\2\177\f\3\2\2\2\u0080"+
		"\u0081\7e\2\2\u0081\u0082\7n\2\2\u0082\u0083\7c\2\2\u0083\u0084\7u\2\2"+
		"\u0084\u0085\7u\2\2\u0085\16\3\2\2\2\u0086\u0087\7d\2\2\u0087\u0088\7"+
		"q\2\2\u0088\u0089\7q\2\2\u0089\u008a\7n\2\2\u008a\u008b\7g\2\2\u008b\u008c"+
		"\7c\2\2\u008c\u008d\7p\2\2\u008d\20\3\2\2\2\u008e\u008f\7e\2\2\u008f\u0090"+
		"\7j\2\2\u0090\u0091\7c\2\2\u0091\u0092\7t\2\2\u0092\22\3\2\2\2\u0093\u0094"+
		"\7k\2\2\u0094\u0095\7p\2\2\u0095\u0096\7v\2\2\u0096\24\3\2\2\2\u0097\u0098"+
		"\7u\2\2\u0098\u0099\7v\2\2\u0099\u009a\7t\2\2\u009a\u009b\7k\2\2\u009b"+
		"\u009c\7p\2\2\u009c\u009d\7i\2\2\u009d\26\3\2\2\2\u009e\u009f\7n\2\2\u009f"+
		"\u00a0\7g\2\2\u00a0\u00a1\7p\2\2\u00a1\u00a2\7i\2\2\u00a2\u00a3\7v\2\2"+
		"\u00a3\u00a4\7j\2\2\u00a4\30\3\2\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7"+
		"t\2\2\u00a7\u00a8\7w\2\2\u00a8\u00a9\7g\2\2\u00a9\32\3\2\2\2\u00aa\u00ab"+
		"\7h\2\2\u00ab\u00ac\7c\2\2\u00ac\u00ad\7n\2\2\u00ad\u00ae\7u\2\2\u00ae"+
		"\u00af\7g\2\2\u00af\34\3\2\2\2\u00b0\u00b1\7~\2\2\u00b1\u00b2\7~\2\2\u00b2"+
		"\36\3\2\2\2\u00b3\u00b4\7(\2\2\u00b4\u00b5\7(\2\2\u00b5 \3\2\2\2\u00b6"+
		"\u00b7\7}\2\2\u00b7\"\3\2\2\2\u00b8\u00b9\7\177\2\2\u00b9$\3\2\2\2\u00ba"+
		"\u00bb\7*\2\2\u00bb&\3\2\2\2\u00bc\u00bd\7+\2\2\u00bd(\3\2\2\2\u00be\u00bf"+
		"\7=\2\2\u00bf*\3\2\2\2\u00c0\u00c1\7.\2\2\u00c1,\3\2\2\2\u00c2\u00c3\7"+
		"?\2\2\u00c3.\3\2\2\2\u00c4\u00c5\7\60\2\2\u00c5\60\3\2\2\2\u00c6\u00c7"+
		"\7-\2\2\u00c7\62\3\2\2\2\u00c8\u00c9\7/\2\2\u00c9\64\3\2\2\2\u00ca\u00cb"+
		"\7#\2\2\u00cb\66\3\2\2\2\u00cc\u00cd\7p\2\2\u00cd\u00ce\7g\2\2\u00ce\u00cf"+
		"\7y\2\2\u00cf8\3\2\2\2\u00d0\u00d1\7]\2\2\u00d1:\3\2\2\2\u00d2\u00d3\7"+
		"_\2\2\u00d3<\3\2\2\2\u00d4\u00d5\7>\2\2\u00d5>\3\2\2\2\u00d6\u00d7\7@"+
		"\2\2\u00d7@\3\2\2\2\u00d8\u00d9\7?\2\2\u00d9\u00da\7?\2\2\u00daB\3\2\2"+
		"\2\u00db\u00dc\7#\2\2\u00dc\u00dd\7?\2\2\u00ddD\3\2\2\2\u00de\u00df\7"+
		">\2\2\u00df\u00e0\7?\2\2\u00e0F\3\2\2\2\u00e1\u00e2\7@\2\2\u00e2\u00e3"+
		"\7?\2\2\u00e3H\3\2\2\2\u00e4\u00e5\7a\2\2\u00e5J\3\2\2\2\u00e6\u00e7\7"+
		"\61\2\2\u00e7L\3\2\2\2\u00e8\u00e9\7,\2\2\u00e9N\3\2\2\2\u00ea\u00eb\7"+
		"$\2\2\u00ebP\3\2\2\2\u00ec\u00ee\t\2\2\2\u00ed\u00ec\3\2\2\2\u00ee\u00ef"+
		"\3\2\2\2\u00ef\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\b)\2\2\u00f2R\3\2\2\2\u00f3\u00f4\7\61\2\2\u00f4\u00f5\7\61\2\2"+
		"\u00f5\u00f9\3\2\2\2\u00f6\u00f8\n\3\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb"+
		"\3\2\2\2\u00f9\u00f7\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fc\u00fd\b*\2\2\u00fdT\3\2\2\2\u00fe\u0101\5I%\2\u00ff"+
		"\u0101\5a\61\2\u0100\u00fe\3\2\2\2\u0100\u00ff\3\2\2\2\u0101\u0107\3\2"+
		"\2\2\u0102\u0106\5I%\2\u0103\u0106\5a\61\2\u0104\u0106\5c\62\2\u0105\u0102"+
		"\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106\u0109\3\2\2\2\u0107"+
		"\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108V\3\2\2\2\u0109\u0107\3\2\2\2"+
		"\u010a\u010e\5c\62\2\u010b\u010d\5c\62\2\u010c\u010b\3\2\2\2\u010d\u0110"+
		"\3\2\2\2\u010e\u010c\3\2\2\2\u010e\u010f\3\2\2\2\u010fX\3\2\2\2\u0110"+
		"\u010e\3\2\2\2\u0111\u0115\5c\62\2\u0112\u0114\5c\62\2\u0113\u0112\3\2"+
		"\2\2\u0114\u0117\3\2\2\2\u0115\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116"+
		"\u0118\3\2\2\2\u0117\u0115\3\2\2\2\u0118\u011c\5/\30\2\u0119\u011b\5c"+
		"\62\2\u011a\u0119\3\2\2\2\u011b\u011e\3\2\2\2\u011c\u011a\3\2\2\2\u011c"+
		"\u011d\3\2\2\2\u011d\u0128\3\2\2\2\u011e\u011c\3\2\2\2\u011f\u0120\5/"+
		"\30\2\u0120\u0124\5c\62\2\u0121\u0123\5c\62\2\u0122\u0121\3\2\2\2\u0123"+
		"\u0126\3\2\2\2\u0124\u0122\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0128\3\2"+
		"\2\2\u0126\u0124\3\2\2\2\u0127\u0111\3\2\2\2\u0127\u011f\3\2\2\2\u0128"+
		"Z\3\2\2\2\u0129\u012c\5\31\r\2\u012a\u012c\5\33\16\2\u012b\u0129\3\2\2"+
		"\2\u012b\u012a\3\2\2\2\u012c\\\3\2\2\2\u012d\u0131\5O(\2\u012e\u0130\5"+
		"_\60\2\u012f\u012e\3\2\2\2\u0130\u0133\3\2\2\2\u0131\u012f\3\2\2\2\u0131"+
		"\u0132\3\2\2\2\u0132\u0134\3\2\2\2\u0133\u0131\3\2\2\2\u0134\u0135\5O"+
		"(\2\u0135^\3\2\2\2\u0136\u013a\5c\62\2\u0137\u013a\5a\61\2\u0138\u013a"+
		"\t\4\2\2\u0139\u0136\3\2\2\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2\2\2\u013a"+
		"`\3\2\2\2\u013b\u013c\t\5\2\2\u013cb\3\2\2\2\u013d\u013e\t\6\2\2\u013e"+
		"d\3\2\2\2\20\2\u00ef\u00f9\u0100\u0105\u0107\u010e\u0115\u011c\u0124\u0127"+
		"\u012b\u0131\u0139\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}