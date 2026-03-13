// Generated from com\xweb\sql\core\parser\QuerySqlBase.g4 by ANTLR 4.9.1
package com.xweb.sql.core.parser;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QuerySqlBaseLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, DISTINCT=8, SELECT=9, 
		FROM=10, WHERE=11, GROUP=12, ORDER=13, HAVING=14, CASE=15, WHEN=16, THEN=17, 
		ELSE=18, END=19, AND=20, NOT=21, OR=22, BETWEEN=23, IN=24, LIKE=25, ESCAPE=26, 
		EXISTS=27, MINUS=28, ARRAY=29, IS=30, AS=31, BY=32, NULL=33, JOIN=34, 
		INNER=35, LEFT=36, OUTER=37, FULL=38, ON=39, RIGHT=40, EQ=41, NEQ=42, 
		LT=43, LTE=44, GT=45, GTE=46, LIMIT=47, FETCH=48, FIRST=49, NEXT=50, ROW=51, 
		ROWS=52, ONLY=53, WITH=54, TIES=55, UNION=56, ALL=57, ASTERISK=58, QUESTION_MARK=59, 
		D_ANT=60, STRING=61, INTEGER_VALUE=62, DECIMAL_VALUE=63, DOUBLE_VALUE=64, 
		IDENTIFIER=65, WS=66;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "DISTINCT", "SELECT", 
			"FROM", "WHERE", "GROUP", "ORDER", "HAVING", "CASE", "WHEN", "THEN", 
			"ELSE", "END", "AND", "NOT", "OR", "BETWEEN", "IN", "LIKE", "ESCAPE", 
			"EXISTS", "MINUS", "ARRAY", "IS", "AS", "BY", "NULL", "JOIN", "INNER", 
			"LEFT", "OUTER", "FULL", "ON", "RIGHT", "EQ", "NEQ", "LT", "LTE", "GT", 
			"GTE", "LIMIT", "FETCH", "FIRST", "NEXT", "ROW", "ROWS", "ONLY", "WITH", 
			"TIES", "UNION", "ALL", "ASTERISK", "QUESTION_MARK", "D_ANT", "STRING", 
			"INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_VALUE", "IDENTIFIER", "EXPONENT", 
			"DIGIT", "LETTER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'.'", "'('", "')'", "'['", "']'", "'`'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, "'='", null, "'<'", "'<='", "'>'", 
			"'>='", null, null, null, null, null, null, null, null, null, null, null, 
			"'*'", "'?'", "'@@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "DISTINCT", "SELECT", 
			"FROM", "WHERE", "GROUP", "ORDER", "HAVING", "CASE", "WHEN", "THEN", 
			"ELSE", "END", "AND", "NOT", "OR", "BETWEEN", "IN", "LIKE", "ESCAPE", 
			"EXISTS", "MINUS", "ARRAY", "IS", "AS", "BY", "NULL", "JOIN", "INNER", 
			"LEFT", "OUTER", "FULL", "ON", "RIGHT", "EQ", "NEQ", "LT", "LTE", "GT", 
			"GTE", "LIMIT", "FETCH", "FIRST", "NEXT", "ROW", "ROWS", "ONLY", "WITH", 
			"TIES", "UNION", "ALL", "ASTERISK", "QUESTION_MARK", "D_ANT", "STRING", 
			"INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_VALUE", "IDENTIFIER", "WS"
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


	public QuerySqlBaseLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "QuerySqlBase.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2D\u01f8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\3\2\3\2\3\3\3\3"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3"+
		"\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3"+
		"\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$"+
		"\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3"+
		"(\3(\3(\3)\3)\3)\3)\3)\3)\3*\3*\3+\3+\3+\3+\5+\u014f\n+\3,\3,\3-\3-\3"+
		"-\3.\3.\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3\61\3\61\3\61"+
		"\3\61\3\62\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\63\3\64\3\64"+
		"\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\67\3\67"+
		"\3\67\3\67\3\67\38\38\38\38\38\39\39\39\39\39\39\3:\3:\3:\3:\3;\3;\3<"+
		"\3<\3=\3=\3=\3>\3>\3>\3>\7>\u019f\n>\f>\16>\u01a2\13>\3>\3>\3?\6?\u01a7"+
		"\n?\r?\16?\u01a8\3@\6@\u01ac\n@\r@\16@\u01ad\3@\3@\7@\u01b2\n@\f@\16@"+
		"\u01b5\13@\3@\3@\6@\u01b9\n@\r@\16@\u01ba\5@\u01bd\n@\3A\6A\u01c0\nA\r"+
		"A\16A\u01c1\3A\3A\7A\u01c6\nA\fA\16A\u01c9\13A\5A\u01cb\nA\3A\3A\3A\3"+
		"A\6A\u01d1\nA\rA\16A\u01d2\3A\3A\5A\u01d7\nA\3B\3B\5B\u01db\nB\3B\3B\3"+
		"B\7B\u01e0\nB\fB\16B\u01e3\13B\3C\3C\5C\u01e7\nC\3C\6C\u01ea\nC\rC\16"+
		"C\u01eb\3D\3D\3E\3E\3F\6F\u01f3\nF\rF\16F\u01f4\3F\3F\2\2G\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G"+
		"%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{"+
		"?}@\177A\u0081B\u0083C\u0085\2\u0087\2\u0089\2\u008bD\3\2\37\4\2FFff\4"+
		"\2KKkk\4\2UUuu\4\2VVvv\4\2PPpp\4\2EEee\4\2GGgg\4\2NNnn\4\2HHhh\4\2TTt"+
		"t\4\2QQqq\4\2OOoo\4\2YYyy\4\2JJjj\4\2IIii\4\2WWww\4\2RRrr\4\2CCcc\4\2"+
		"XXxx\4\2DDdd\4\2MMmm\4\2ZZzz\4\2[[{{\4\2LLll\3\2))\4\2--//\3\2\62;\4\2"+
		"C\\c|\5\2\13\f\17\17\"\"\2\u0208\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2"+
		"\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2"+
		"\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\2u"+
		"\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2\u0081"+
		"\3\2\2\2\2\u0083\3\2\2\2\2\u008b\3\2\2\2\3\u008d\3\2\2\2\5\u008f\3\2\2"+
		"\2\7\u0091\3\2\2\2\t\u0093\3\2\2\2\13\u0095\3\2\2\2\r\u0097\3\2\2\2\17"+
		"\u0099\3\2\2\2\21\u009b\3\2\2\2\23\u00a4\3\2\2\2\25\u00ab\3\2\2\2\27\u00b0"+
		"\3\2\2\2\31\u00b6\3\2\2\2\33\u00bc\3\2\2\2\35\u00c2\3\2\2\2\37\u00c9\3"+
		"\2\2\2!\u00ce\3\2\2\2#\u00d3\3\2\2\2%\u00d8\3\2\2\2\'\u00dd\3\2\2\2)\u00e1"+
		"\3\2\2\2+\u00e5\3\2\2\2-\u00e9\3\2\2\2/\u00ec\3\2\2\2\61\u00f4\3\2\2\2"+
		"\63\u00f7\3\2\2\2\65\u00fc\3\2\2\2\67\u0103\3\2\2\29\u010a\3\2\2\2;\u0110"+
		"\3\2\2\2=\u0116\3\2\2\2?\u0119\3\2\2\2A\u011c\3\2\2\2C\u011f\3\2\2\2E"+
		"\u0124\3\2\2\2G\u0129\3\2\2\2I\u012f\3\2\2\2K\u0134\3\2\2\2M\u013a\3\2"+
		"\2\2O\u013f\3\2\2\2Q\u0142\3\2\2\2S\u0148\3\2\2\2U\u014e\3\2\2\2W\u0150"+
		"\3\2\2\2Y\u0152\3\2\2\2[\u0155\3\2\2\2]\u0157\3\2\2\2_\u015a\3\2\2\2a"+
		"\u0160\3\2\2\2c\u0166\3\2\2\2e\u016c\3\2\2\2g\u0171\3\2\2\2i\u0175\3\2"+
		"\2\2k\u017a\3\2\2\2m\u017f\3\2\2\2o\u0184\3\2\2\2q\u0189\3\2\2\2s\u018f"+
		"\3\2\2\2u\u0193\3\2\2\2w\u0195\3\2\2\2y\u0197\3\2\2\2{\u019a\3\2\2\2}"+
		"\u01a6\3\2\2\2\177\u01bc\3\2\2\2\u0081\u01d6\3\2\2\2\u0083\u01da\3\2\2"+
		"\2\u0085\u01e4\3\2\2\2\u0087\u01ed\3\2\2\2\u0089\u01ef\3\2\2\2\u008b\u01f2"+
		"\3\2\2\2\u008d\u008e\7.\2\2\u008e\4\3\2\2\2\u008f\u0090\7\60\2\2\u0090"+
		"\6\3\2\2\2\u0091\u0092\7*\2\2\u0092\b\3\2\2\2\u0093\u0094\7+\2\2\u0094"+
		"\n\3\2\2\2\u0095\u0096\7]\2\2\u0096\f\3\2\2\2\u0097\u0098\7_\2\2\u0098"+
		"\16\3\2\2\2\u0099\u009a\7b\2\2\u009a\20\3\2\2\2\u009b\u009c\t\2\2\2\u009c"+
		"\u009d\t\3\2\2\u009d\u009e\t\4\2\2\u009e\u009f\t\5\2\2\u009f\u00a0\t\3"+
		"\2\2\u00a0\u00a1\t\6\2\2\u00a1\u00a2\t\7\2\2\u00a2\u00a3\t\5\2\2\u00a3"+
		"\22\3\2\2\2\u00a4\u00a5\t\4\2\2\u00a5\u00a6\t\b\2\2\u00a6\u00a7\t\t\2"+
		"\2\u00a7\u00a8\t\b\2\2\u00a8\u00a9\t\7\2\2\u00a9\u00aa\t\5\2\2\u00aa\24"+
		"\3\2\2\2\u00ab\u00ac\t\n\2\2\u00ac\u00ad\t\13\2\2\u00ad\u00ae\t\f\2\2"+
		"\u00ae\u00af\t\r\2\2\u00af\26\3\2\2\2\u00b0\u00b1\t\16\2\2\u00b1\u00b2"+
		"\t\17\2\2\u00b2\u00b3\t\b\2\2\u00b3\u00b4\t\13\2\2\u00b4\u00b5\t\b\2\2"+
		"\u00b5\30\3\2\2\2\u00b6\u00b7\t\20\2\2\u00b7\u00b8\t\13\2\2\u00b8\u00b9"+
		"\t\f\2\2\u00b9\u00ba\t\21\2\2\u00ba\u00bb\t\22\2\2\u00bb\32\3\2\2\2\u00bc"+
		"\u00bd\t\f\2\2\u00bd\u00be\t\13\2\2\u00be\u00bf\t\2\2\2\u00bf\u00c0\t"+
		"\b\2\2\u00c0\u00c1\t\13\2\2\u00c1\34\3\2\2\2\u00c2\u00c3\t\17\2\2\u00c3"+
		"\u00c4\t\23\2\2\u00c4\u00c5\t\24\2\2\u00c5\u00c6\t\3\2\2\u00c6\u00c7\t"+
		"\6\2\2\u00c7\u00c8\t\20\2\2\u00c8\36\3\2\2\2\u00c9\u00ca\t\7\2\2\u00ca"+
		"\u00cb\t\23\2\2\u00cb\u00cc\t\4\2\2\u00cc\u00cd\t\b\2\2\u00cd \3\2\2\2"+
		"\u00ce\u00cf\t\16\2\2\u00cf\u00d0\t\17\2\2\u00d0\u00d1\t\b\2\2\u00d1\u00d2"+
		"\t\6\2\2\u00d2\"\3\2\2\2\u00d3\u00d4\t\5\2\2\u00d4\u00d5\t\17\2\2\u00d5"+
		"\u00d6\t\b\2\2\u00d6\u00d7\t\6\2\2\u00d7$\3\2\2\2\u00d8\u00d9\t\b\2\2"+
		"\u00d9\u00da\t\t\2\2\u00da\u00db\t\4\2\2\u00db\u00dc\t\b\2\2\u00dc&\3"+
		"\2\2\2\u00dd\u00de\t\b\2\2\u00de\u00df\t\6\2\2\u00df\u00e0\t\2\2\2\u00e0"+
		"(\3\2\2\2\u00e1\u00e2\t\23\2\2\u00e2\u00e3\t\6\2\2\u00e3\u00e4\t\2\2\2"+
		"\u00e4*\3\2\2\2\u00e5\u00e6\t\6\2\2\u00e6\u00e7\t\f\2\2\u00e7\u00e8\t"+
		"\5\2\2\u00e8,\3\2\2\2\u00e9\u00ea\t\f\2\2\u00ea\u00eb\t\13\2\2\u00eb."+
		"\3\2\2\2\u00ec\u00ed\t\25\2\2\u00ed\u00ee\t\b\2\2\u00ee\u00ef\t\5\2\2"+
		"\u00ef\u00f0\t\16\2\2\u00f0\u00f1\t\b\2\2\u00f1\u00f2\t\b\2\2\u00f2\u00f3"+
		"\t\6\2\2\u00f3\60\3\2\2\2\u00f4\u00f5\t\3\2\2\u00f5\u00f6\t\6\2\2\u00f6"+
		"\62\3\2\2\2\u00f7\u00f8\t\t\2\2\u00f8\u00f9\t\3\2\2\u00f9\u00fa\t\26\2"+
		"\2\u00fa\u00fb\t\b\2\2\u00fb\64\3\2\2\2\u00fc\u00fd\t\b\2\2\u00fd\u00fe"+
		"\t\4\2\2\u00fe\u00ff\t\7\2\2\u00ff\u0100\t\23\2\2\u0100\u0101\t\22\2\2"+
		"\u0101\u0102\t\b\2\2\u0102\66\3\2\2\2\u0103\u0104\t\b\2\2\u0104\u0105"+
		"\t\27\2\2\u0105\u0106\t\3\2\2\u0106\u0107\t\4\2\2\u0107\u0108\t\5\2\2"+
		"\u0108\u0109\t\4\2\2\u01098\3\2\2\2\u010a\u010b\t\r\2\2\u010b\u010c\t"+
		"\3\2\2\u010c\u010d\t\6\2\2\u010d\u010e\t\21\2\2\u010e\u010f\t\4\2\2\u010f"+
		":\3\2\2\2\u0110\u0111\t\23\2\2\u0111\u0112\t\13\2\2\u0112\u0113\t\13\2"+
		"\2\u0113\u0114\t\23\2\2\u0114\u0115\t\30\2\2\u0115<\3\2\2\2\u0116\u0117"+
		"\t\3\2\2\u0117\u0118\t\4\2\2\u0118>\3\2\2\2\u0119\u011a\t\23\2\2\u011a"+
		"\u011b\t\4\2\2\u011b@\3\2\2\2\u011c\u011d\t\25\2\2\u011d\u011e\t\30\2"+
		"\2\u011eB\3\2\2\2\u011f\u0120\t\6\2\2\u0120\u0121\t\21\2\2\u0121\u0122"+
		"\t\t\2\2\u0122\u0123\t\t\2\2\u0123D\3\2\2\2\u0124\u0125\t\31\2\2\u0125"+
		"\u0126\t\f\2\2\u0126\u0127\t\3\2\2\u0127\u0128\t\6\2\2\u0128F\3\2\2\2"+
		"\u0129\u012a\t\3\2\2\u012a\u012b\t\6\2\2\u012b\u012c\t\6\2\2\u012c\u012d"+
		"\t\b\2\2\u012d\u012e\t\13\2\2\u012eH\3\2\2\2\u012f\u0130\t\t\2\2\u0130"+
		"\u0131\t\b\2\2\u0131\u0132\t\n\2\2\u0132\u0133\t\5\2\2\u0133J\3\2\2\2"+
		"\u0134\u0135\t\f\2\2\u0135\u0136\t\21\2\2\u0136\u0137\t\5\2\2\u0137\u0138"+
		"\t\b\2\2\u0138\u0139\t\13\2\2\u0139L\3\2\2\2\u013a\u013b\t\n\2\2\u013b"+
		"\u013c\t\21\2\2\u013c\u013d\t\t\2\2\u013d\u013e\t\t\2\2\u013eN\3\2\2\2"+
		"\u013f\u0140\t\f\2\2\u0140\u0141\t\6\2\2\u0141P\3\2\2\2\u0142\u0143\t"+
		"\13\2\2\u0143\u0144\t\3\2\2\u0144\u0145\t\20\2\2\u0145\u0146\t\17\2\2"+
		"\u0146\u0147\t\5\2\2\u0147R\3\2\2\2\u0148\u0149\7?\2\2\u0149T\3\2\2\2"+
		"\u014a\u014b\7>\2\2\u014b\u014f\7@\2\2\u014c\u014d\7#\2\2\u014d\u014f"+
		"\7?\2\2\u014e\u014a\3\2\2\2\u014e\u014c\3\2\2\2\u014fV\3\2\2\2\u0150\u0151"+
		"\7>\2\2\u0151X\3\2\2\2\u0152\u0153\7>\2\2\u0153\u0154\7?\2\2\u0154Z\3"+
		"\2\2\2\u0155\u0156\7@\2\2\u0156\\\3\2\2\2\u0157\u0158\7@\2\2\u0158\u0159"+
		"\7?\2\2\u0159^\3\2\2\2\u015a\u015b\t\t\2\2\u015b\u015c\t\3\2\2\u015c\u015d"+
		"\t\r\2\2\u015d\u015e\t\3\2\2\u015e\u015f\t\5\2\2\u015f`\3\2\2\2\u0160"+
		"\u0161\t\n\2\2\u0161\u0162\t\b\2\2\u0162\u0163\t\5\2\2\u0163\u0164\t\7"+
		"\2\2\u0164\u0165\t\17\2\2\u0165b\3\2\2\2\u0166\u0167\t\n\2\2\u0167\u0168"+
		"\t\3\2\2\u0168\u0169\t\13\2\2\u0169\u016a\t\4\2\2\u016a\u016b\t\5\2\2"+
		"\u016bd\3\2\2\2\u016c\u016d\t\6\2\2\u016d\u016e\t\b\2\2\u016e\u016f\t"+
		"\27\2\2\u016f\u0170\t\5\2\2\u0170f\3\2\2\2\u0171\u0172\t\13\2\2\u0172"+
		"\u0173\t\f\2\2\u0173\u0174\t\16\2\2\u0174h\3\2\2\2\u0175\u0176\t\13\2"+
		"\2\u0176\u0177\t\f\2\2\u0177\u0178\t\16\2\2\u0178\u0179\t\4\2\2\u0179"+
		"j\3\2\2\2\u017a\u017b\t\f\2\2\u017b\u017c\t\6\2\2\u017c\u017d\t\t\2\2"+
		"\u017d\u017e\t\30\2\2\u017el\3\2\2\2\u017f\u0180\t\16\2\2\u0180\u0181"+
		"\t\3\2\2\u0181\u0182\t\5\2\2\u0182\u0183\t\17\2\2\u0183n\3\2\2\2\u0184"+
		"\u0185\t\5\2\2\u0185\u0186\t\3\2\2\u0186\u0187\t\b\2\2\u0187\u0188\t\4"+
		"\2\2\u0188p\3\2\2\2\u0189\u018a\t\21\2\2\u018a\u018b\t\6\2\2\u018b\u018c"+
		"\t\3\2\2\u018c\u018d\t\f\2\2\u018d\u018e\t\6\2\2\u018er\3\2\2\2\u018f"+
		"\u0190\t\23\2\2\u0190\u0191\t\t\2\2\u0191\u0192\t\t\2\2\u0192t\3\2\2\2"+
		"\u0193\u0194\7,\2\2\u0194v\3\2\2\2\u0195\u0196\7A\2\2\u0196x\3\2\2\2\u0197"+
		"\u0198\7B\2\2\u0198\u0199\7B\2\2\u0199z\3\2\2\2\u019a\u01a0\7)\2\2\u019b"+
		"\u019f\n\32\2\2\u019c\u019d\7)\2\2\u019d\u019f\7)\2\2\u019e\u019b\3\2"+
		"\2\2\u019e\u019c\3\2\2\2\u019f\u01a2\3\2\2\2\u01a0\u019e\3\2\2\2\u01a0"+
		"\u01a1\3\2\2\2\u01a1\u01a3\3\2\2\2\u01a2\u01a0\3\2\2\2\u01a3\u01a4\7)"+
		"\2\2\u01a4|\3\2\2\2\u01a5\u01a7\5\u0087D\2\u01a6\u01a5\3\2\2\2\u01a7\u01a8"+
		"\3\2\2\2\u01a8\u01a6\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9~\3\2\2\2\u01aa"+
		"\u01ac\5\u0087D\2\u01ab\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad\u01ab"+
		"\3\2\2\2\u01ad\u01ae\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b3\7\60\2\2"+
		"\u01b0\u01b2\5\u0087D\2\u01b1\u01b0\3\2\2\2\u01b2\u01b5\3\2\2\2\u01b3"+
		"\u01b1\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01bd\3\2\2\2\u01b5\u01b3\3\2"+
		"\2\2\u01b6\u01b8\7\60\2\2\u01b7\u01b9\5\u0087D\2\u01b8\u01b7\3\2\2\2\u01b9"+
		"\u01ba\3\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bd\3\2"+
		"\2\2\u01bc\u01ab\3\2\2\2\u01bc\u01b6\3\2\2\2\u01bd\u0080\3\2\2\2\u01be"+
		"\u01c0\5\u0087D\2\u01bf\u01be\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01bf"+
		"\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01ca\3\2\2\2\u01c3\u01c7\7\60\2\2"+
		"\u01c4\u01c6\5\u0087D\2\u01c5\u01c4\3\2\2\2\u01c6\u01c9\3\2\2\2\u01c7"+
		"\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01cb\3\2\2\2\u01c9\u01c7\3\2"+
		"\2\2\u01ca\u01c3\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01cd\5\u0085C\2\u01cd\u01d7\3\2\2\2\u01ce\u01d0\7\60\2\2\u01cf\u01d1"+
		"\5\u0087D\2\u01d0\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d0\3\2\2"+
		"\2\u01d2\u01d3\3\2\2\2\u01d3\u01d4\3\2\2\2\u01d4\u01d5\5\u0085C\2\u01d5"+
		"\u01d7\3\2\2\2\u01d6\u01bf\3\2\2\2\u01d6\u01ce\3\2\2\2\u01d7\u0082\3\2"+
		"\2\2\u01d8\u01db\5\u0089E\2\u01d9\u01db\7a\2\2\u01da\u01d8\3\2\2\2\u01da"+
		"\u01d9\3\2\2\2\u01db\u01e1\3\2\2\2\u01dc\u01e0\5\u0089E\2\u01dd\u01e0"+
		"\5\u0087D\2\u01de\u01e0\7a\2\2\u01df\u01dc\3\2\2\2\u01df\u01dd\3\2\2\2"+
		"\u01df\u01de\3\2\2\2\u01e0\u01e3\3\2\2\2\u01e1\u01df\3\2\2\2\u01e1\u01e2"+
		"\3\2\2\2\u01e2\u0084\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e6\7G\2\2\u01e5"+
		"\u01e7\t\33\2\2\u01e6\u01e5\3\2\2\2\u01e6\u01e7\3\2\2\2\u01e7\u01e9\3"+
		"\2\2\2\u01e8\u01ea\5\u0087D\2\u01e9\u01e8\3\2\2\2\u01ea\u01eb\3\2\2\2"+
		"\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec\u0086\3\2\2\2\u01ed\u01ee"+
		"\t\34\2\2\u01ee\u0088\3\2\2\2\u01ef\u01f0\t\35\2\2\u01f0\u008a\3\2\2\2"+
		"\u01f1\u01f3\t\36\2\2\u01f2\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f2"+
		"\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6\u01f7\bF\2\2\u01f7"+
		"\u008c\3\2\2\2\26\2\u014e\u019e\u01a0\u01a8\u01ad\u01b3\u01ba\u01bc\u01c1"+
		"\u01c7\u01ca\u01d2\u01d6\u01da\u01df\u01e1\u01e6\u01eb\u01f4\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}