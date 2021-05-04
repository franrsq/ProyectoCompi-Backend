// Generated from C:/Users/fran-/IdeaProjects/ProyectoCompi-Backend\PseudoJavaScanner.g4 by ANTLR 4.9.1
package com.compi.generated;
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
		MULTIPLICATION=38, QUOTATION_MARKS=39, SINGLE_QUOTE=40, WHITESPACES=41, 
		LINE_COMMENT=42, IDENTIFIER=43, INT_LITERAL=44, REAL_LITERAL=45, STRING_LITERAL=46, 
		CHAR_LITERAL=47;
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
			"SINGLE_QUOTE", "WHITESPACES", "LINE_COMMENT", "IDENTIFIER", "INT_LITERAL", 
			"REAL_LITERAL", "STRING_LITERAL", "CHAR_LITERAL", "PRINTABLE", "LETTER", 
			"DIGIT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'while'", "'if'", "'else'", "'return'", "'print'", "'class'", 
			"'boolean'", "'char'", "'int'", "'string'", "'length'", "'true'", "'false'", 
			"'||'", "'&&'", "'{'", "'}'", "'('", "')'", "';'", "','", "'='", "'.'", 
			"'+'", "'-'", "'!'", "'new'", "'['", "']'", "'<'", "'>'", "'=='", "'!='", 
			"'<='", "'>='", "'_'", "'/'", "'*'", "'\"'", "'''"
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
			"SINGLE_QUOTE", "WHITESPACES", "LINE_COMMENT", "IDENTIFIER", "INT_LITERAL", 
			"REAL_LITERAL", "STRING_LITERAL", "CHAR_LITERAL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\61\u014b\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3"+
		"\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3"+
		"\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3"+
		"\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3"+
		"\37\3\37\3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3$\3$\3$\3%\3%\3&\3&\3\'"+
		"\3\'\3(\3(\3)\3)\3*\6*\u00f2\n*\r*\16*\u00f3\3*\3*\3+\3+\3+\3+\7+\u00fc"+
		"\n+\f+\16+\u00ff\13+\3+\3+\3,\3,\5,\u0105\n,\3,\3,\3,\7,\u010a\n,\f,\16"+
		",\u010d\13,\3-\3-\7-\u0111\n-\f-\16-\u0114\13-\3.\3.\7.\u0118\n.\f.\16"+
		".\u011b\13.\3.\3.\7.\u011f\n.\f.\16.\u0122\13.\3.\3.\3.\7.\u0127\n.\f"+
		".\16.\u012a\13.\5.\u012c\n.\3/\3/\3/\3/\3/\7/\u0133\n/\f/\16/\u0136\13"+
		"/\3/\3/\3\60\3\60\3\60\3\60\3\60\5\60\u013f\n\60\3\60\3\60\3\61\3\61\3"+
		"\61\5\61\u0146\n\61\3\62\3\62\3\63\3\63\2\2\64\3\3\5\4\7\5\t\6\13\7\r"+
		"\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\2c\2e\2\3\2\7\5\2\13\f\17\17\"\"\4\2\f\f\17\17"+
		"\b\2\"#%(*\61<B]b}\u0080\4\2C\\c|\3\2\62;\2\u0159\2\3\3\2\2\2\2\5\3\2"+
		"\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\3g\3\2\2\2\5m\3\2\2\2\7p\3"+
		"\2\2\2\tu\3\2\2\2\13|\3\2\2\2\r\u0082\3\2\2\2\17\u0088\3\2\2\2\21\u0090"+
		"\3\2\2\2\23\u0095\3\2\2\2\25\u0099\3\2\2\2\27\u00a0\3\2\2\2\31\u00a7\3"+
		"\2\2\2\33\u00ac\3\2\2\2\35\u00b2\3\2\2\2\37\u00b5\3\2\2\2!\u00b8\3\2\2"+
		"\2#\u00ba\3\2\2\2%\u00bc\3\2\2\2\'\u00be\3\2\2\2)\u00c0\3\2\2\2+\u00c2"+
		"\3\2\2\2-\u00c4\3\2\2\2/\u00c6\3\2\2\2\61\u00c8\3\2\2\2\63\u00ca\3\2\2"+
		"\2\65\u00cc\3\2\2\2\67\u00ce\3\2\2\29\u00d2\3\2\2\2;\u00d4\3\2\2\2=\u00d6"+
		"\3\2\2\2?\u00d8\3\2\2\2A\u00da\3\2\2\2C\u00dd\3\2\2\2E\u00e0\3\2\2\2G"+
		"\u00e3\3\2\2\2I\u00e6\3\2\2\2K\u00e8\3\2\2\2M\u00ea\3\2\2\2O\u00ec\3\2"+
		"\2\2Q\u00ee\3\2\2\2S\u00f1\3\2\2\2U\u00f7\3\2\2\2W\u0104\3\2\2\2Y\u010e"+
		"\3\2\2\2[\u012b\3\2\2\2]\u012d\3\2\2\2_\u0139\3\2\2\2a\u0145\3\2\2\2c"+
		"\u0147\3\2\2\2e\u0149\3\2\2\2gh\7y\2\2hi\7j\2\2ij\7k\2\2jk\7n\2\2kl\7"+
		"g\2\2l\4\3\2\2\2mn\7k\2\2no\7h\2\2o\6\3\2\2\2pq\7g\2\2qr\7n\2\2rs\7u\2"+
		"\2st\7g\2\2t\b\3\2\2\2uv\7t\2\2vw\7g\2\2wx\7v\2\2xy\7w\2\2yz\7t\2\2z{"+
		"\7p\2\2{\n\3\2\2\2|}\7r\2\2}~\7t\2\2~\177\7k\2\2\177\u0080\7p\2\2\u0080"+
		"\u0081\7v\2\2\u0081\f\3\2\2\2\u0082\u0083\7e\2\2\u0083\u0084\7n\2\2\u0084"+
		"\u0085\7c\2\2\u0085\u0086\7u\2\2\u0086\u0087\7u\2\2\u0087\16\3\2\2\2\u0088"+
		"\u0089\7d\2\2\u0089\u008a\7q\2\2\u008a\u008b\7q\2\2\u008b\u008c\7n\2\2"+
		"\u008c\u008d\7g\2\2\u008d\u008e\7c\2\2\u008e\u008f\7p\2\2\u008f\20\3\2"+
		"\2\2\u0090\u0091\7e\2\2\u0091\u0092\7j\2\2\u0092\u0093\7c\2\2\u0093\u0094"+
		"\7t\2\2\u0094\22\3\2\2\2\u0095\u0096\7k\2\2\u0096\u0097\7p\2\2\u0097\u0098"+
		"\7v\2\2\u0098\24\3\2\2\2\u0099\u009a\7u\2\2\u009a\u009b\7v\2\2\u009b\u009c"+
		"\7t\2\2\u009c\u009d\7k\2\2\u009d\u009e\7p\2\2\u009e\u009f\7i\2\2\u009f"+
		"\26\3\2\2\2\u00a0\u00a1\7n\2\2\u00a1\u00a2\7g\2\2\u00a2\u00a3\7p\2\2\u00a3"+
		"\u00a4\7i\2\2\u00a4\u00a5\7v\2\2\u00a5\u00a6\7j\2\2\u00a6\30\3\2\2\2\u00a7"+
		"\u00a8\7v\2\2\u00a8\u00a9\7t\2\2\u00a9\u00aa\7w\2\2\u00aa\u00ab\7g\2\2"+
		"\u00ab\32\3\2\2\2\u00ac\u00ad\7h\2\2\u00ad\u00ae\7c\2\2\u00ae\u00af\7"+
		"n\2\2\u00af\u00b0\7u\2\2\u00b0\u00b1\7g\2\2\u00b1\34\3\2\2\2\u00b2\u00b3"+
		"\7~\2\2\u00b3\u00b4\7~\2\2\u00b4\36\3\2\2\2\u00b5\u00b6\7(\2\2\u00b6\u00b7"+
		"\7(\2\2\u00b7 \3\2\2\2\u00b8\u00b9\7}\2\2\u00b9\"\3\2\2\2\u00ba\u00bb"+
		"\7\177\2\2\u00bb$\3\2\2\2\u00bc\u00bd\7*\2\2\u00bd&\3\2\2\2\u00be\u00bf"+
		"\7+\2\2\u00bf(\3\2\2\2\u00c0\u00c1\7=\2\2\u00c1*\3\2\2\2\u00c2\u00c3\7"+
		".\2\2\u00c3,\3\2\2\2\u00c4\u00c5\7?\2\2\u00c5.\3\2\2\2\u00c6\u00c7\7\60"+
		"\2\2\u00c7\60\3\2\2\2\u00c8\u00c9\7-\2\2\u00c9\62\3\2\2\2\u00ca\u00cb"+
		"\7/\2\2\u00cb\64\3\2\2\2\u00cc\u00cd\7#\2\2\u00cd\66\3\2\2\2\u00ce\u00cf"+
		"\7p\2\2\u00cf\u00d0\7g\2\2\u00d0\u00d1\7y\2\2\u00d18\3\2\2\2\u00d2\u00d3"+
		"\7]\2\2\u00d3:\3\2\2\2\u00d4\u00d5\7_\2\2\u00d5<\3\2\2\2\u00d6\u00d7\7"+
		">\2\2\u00d7>\3\2\2\2\u00d8\u00d9\7@\2\2\u00d9@\3\2\2\2\u00da\u00db\7?"+
		"\2\2\u00db\u00dc\7?\2\2\u00dcB\3\2\2\2\u00dd\u00de\7#\2\2\u00de\u00df"+
		"\7?\2\2\u00dfD\3\2\2\2\u00e0\u00e1\7>\2\2\u00e1\u00e2\7?\2\2\u00e2F\3"+
		"\2\2\2\u00e3\u00e4\7@\2\2\u00e4\u00e5\7?\2\2\u00e5H\3\2\2\2\u00e6\u00e7"+
		"\7a\2\2\u00e7J\3\2\2\2\u00e8\u00e9\7\61\2\2\u00e9L\3\2\2\2\u00ea\u00eb"+
		"\7,\2\2\u00ebN\3\2\2\2\u00ec\u00ed\7$\2\2\u00edP\3\2\2\2\u00ee\u00ef\7"+
		")\2\2\u00efR\3\2\2\2\u00f0\u00f2\t\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f6\b*\2\2\u00f6T\3\2\2\2\u00f7\u00f8\7\61\2\2\u00f8\u00f9\7\61\2\2"+
		"\u00f9\u00fd\3\2\2\2\u00fa\u00fc\n\3\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff"+
		"\3\2\2\2\u00fd\u00fb\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff"+
		"\u00fd\3\2\2\2\u0100\u0101\b+\2\2\u0101V\3\2\2\2\u0102\u0105\5I%\2\u0103"+
		"\u0105\5c\62\2\u0104\u0102\3\2\2\2\u0104\u0103\3\2\2\2\u0105\u010b\3\2"+
		"\2\2\u0106\u010a\5I%\2\u0107\u010a\5c\62\2\u0108\u010a\5e\63\2\u0109\u0106"+
		"\3\2\2\2\u0109\u0107\3\2\2\2\u0109\u0108\3\2\2\2\u010a\u010d\3\2\2\2\u010b"+
		"\u0109\3\2\2\2\u010b\u010c\3\2\2\2\u010cX\3\2\2\2\u010d\u010b\3\2\2\2"+
		"\u010e\u0112\5e\63\2\u010f\u0111\5e\63\2\u0110\u010f\3\2\2\2\u0111\u0114"+
		"\3\2\2\2\u0112\u0110\3\2\2\2\u0112\u0113\3\2\2\2\u0113Z\3\2\2\2\u0114"+
		"\u0112\3\2\2\2\u0115\u0119\5e\63\2\u0116\u0118\5e\63\2\u0117\u0116\3\2"+
		"\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a"+
		"\u011c\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u0120\5/\30\2\u011d\u011f\5e"+
		"\63\2\u011e\u011d\3\2\2\2\u011f\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120"+
		"\u0121\3\2\2\2\u0121\u012c\3\2\2\2\u0122\u0120\3\2\2\2\u0123\u0124\5/"+
		"\30\2\u0124\u0128\5e\63\2\u0125\u0127\5e\63\2\u0126\u0125\3\2\2\2\u0127"+
		"\u012a\3\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012c\3\2"+
		"\2\2\u012a\u0128\3\2\2\2\u012b\u0115\3\2\2\2\u012b\u0123\3\2\2\2\u012c"+
		"\\\3\2\2\2\u012d\u0134\5O(\2\u012e\u012f\7^\2\2\u012f\u0133\7$\2\2\u0130"+
		"\u0133\7)\2\2\u0131\u0133\5a\61\2\u0132\u012e\3\2\2\2\u0132\u0130\3\2"+
		"\2\2\u0132\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134"+
		"\u0135\3\2\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\5O"+
		"(\2\u0138^\3\2\2\2\u0139\u013e\5Q)\2\u013a\u013f\7$\2\2\u013b\u013c\7"+
		"^\2\2\u013c\u013f\7)\2\2\u013d\u013f\5a\61\2\u013e\u013a\3\2\2\2\u013e"+
		"\u013b\3\2\2\2\u013e\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0141\5Q"+
		")\2\u0141`\3\2\2\2\u0142\u0146\5e\63\2\u0143\u0146\5c\62\2\u0144\u0146"+
		"\t\4\2\2\u0145\u0142\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0144\3\2\2\2\u0146"+
		"b\3\2\2\2\u0147\u0148\t\5\2\2\u0148d\3\2\2\2\u0149\u014a\t\6\2\2\u014a"+
		"f\3\2\2\2\21\2\u00f3\u00fd\u0104\u0109\u010b\u0112\u0119\u0120\u0128\u012b"+
		"\u0132\u0134\u013e\u0145\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}