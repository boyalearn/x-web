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
		EXISTS=27, ARRAY=28, IS=29, AS=30, BY=31, NULL=32, JOIN=33, INNER=34, 
		LEFT=35, OUTER=36, FULL=37, ON=38, RIGHT=39, DUPLICATE=40, KEY=41, UPDATE=42, 
		INSERT=43, INTO=44, VALUES=45, DELETE=46, SET=47, EQ=48, NEQ=49, LT=50, 
		LTE=51, GT=52, GTE=53, LIMIT=54, FETCH=55, FIRST=56, NEXT=57, ROW=58, 
		ROWS=59, ONLY=60, WITH=61, TIES=62, UNION=63, ALL=64, INTERVAL=65, AT=66, 
		TIME=67, ZONE=68, TO=69, YEAR=70, MONTH=71, DAY=72, HOUR=73, MINUTE=74, 
		SECOND=75, MERGE=76, USING=77, MATCHED=78, SOURCE=79, PLUS=80, MINUS=81, 
		ASTERISK=82, SLASH=83, PERCENT=84, CONCAT=85, PARAMETER=86, D_ANT=87, 
		STRING=88, INTEGER_VALUE=89, DECIMAL_VALUE=90, DOUBLE_VALUE=91, IDENTIFIER=92, 
		WS=93;
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
			"EXISTS", "ARRAY", "IS", "AS", "BY", "NULL", "JOIN", "INNER", "LEFT", 
			"OUTER", "FULL", "ON", "RIGHT", "DUPLICATE", "KEY", "UPDATE", "INSERT", 
			"INTO", "VALUES", "DELETE", "SET", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", 
			"LIMIT", "FETCH", "FIRST", "NEXT", "ROW", "ROWS", "ONLY", "WITH", "TIES", 
			"UNION", "ALL", "INTERVAL", "AT", "TIME", "ZONE", "TO", "YEAR", "MONTH", 
			"DAY", "HOUR", "MINUTE", "SECOND", "MERGE", "USING", "MATCHED", "SOURCE", 
			"PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "CONCAT", "PARAMETER", 
			"D_ANT", "STRING", "INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_VALUE", 
			"IDENTIFIER", "EXPONENT", "DIGIT", "LETTER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'.'", "'('", "')'", "'['", "']'", "'`'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "'='", null, "'<'", "'<='", "'>'", "'>='", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "'+'", "'-'", 
			"'*'", "'/'", "'%'", "'||'", "'?'", "'@@'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "DISTINCT", "SELECT", 
			"FROM", "WHERE", "GROUP", "ORDER", "HAVING", "CASE", "WHEN", "THEN", 
			"ELSE", "END", "AND", "NOT", "OR", "BETWEEN", "IN", "LIKE", "ESCAPE", 
			"EXISTS", "ARRAY", "IS", "AS", "BY", "NULL", "JOIN", "INNER", "LEFT", 
			"OUTER", "FULL", "ON", "RIGHT", "DUPLICATE", "KEY", "UPDATE", "INSERT", 
			"INTO", "VALUES", "DELETE", "SET", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", 
			"LIMIT", "FETCH", "FIRST", "NEXT", "ROW", "ROWS", "ONLY", "WITH", "TIES", 
			"UNION", "ALL", "INTERVAL", "AT", "TIME", "ZONE", "TO", "YEAR", "MONTH", 
			"DAY", "HOUR", "MINUTE", "SECOND", "MERGE", "USING", "MATCHED", "SOURCE", 
			"PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", "CONCAT", "PARAMETER", 
			"D_ANT", "STRING", "INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_VALUE", 
			"IDENTIFIER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2_\u02bc\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3"+
		"\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3"+
		"\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+"+
		"\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3."+
		"\3.\3.\3/\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3"+
		"\62\3\62\5\62\u01b2\n\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\66\3\66"+
		"\3\66\3\67\3\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39\39\39\39\3"+
		"9\3:\3:\3:\3:\3:\3;\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3"+
		">\3>\3?\3?\3?\3?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3B\3B\3"+
		"B\3B\3B\3C\3C\3C\3D\3D\3D\3D\3D\3E\3E\3E\3E\3E\3F\3F\3F\3G\3G\3G\3G\3"+
		"G\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3J\3J\3J\3J\3J\3K\3K\3K\3K\3K\3K\3K\3"+
		"L\3L\3L\3L\3L\3L\3L\3M\3M\3M\3M\3M\3M\3N\3N\3N\3N\3N\3N\3O\3O\3O\3O\3"+
		"O\3O\3O\3O\3P\3P\3P\3P\3P\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\3U\3U\3V\3V\3"+
		"V\3W\3W\3X\3X\3X\3Y\3Y\3Y\3Y\7Y\u0263\nY\fY\16Y\u0266\13Y\3Y\3Y\3Z\6Z"+
		"\u026b\nZ\rZ\16Z\u026c\3[\6[\u0270\n[\r[\16[\u0271\3[\3[\7[\u0276\n[\f"+
		"[\16[\u0279\13[\3[\3[\6[\u027d\n[\r[\16[\u027e\5[\u0281\n[\3\\\6\\\u0284"+
		"\n\\\r\\\16\\\u0285\3\\\3\\\7\\\u028a\n\\\f\\\16\\\u028d\13\\\5\\\u028f"+
		"\n\\\3\\\3\\\3\\\3\\\6\\\u0295\n\\\r\\\16\\\u0296\3\\\3\\\5\\\u029b\n"+
		"\\\3]\3]\5]\u029f\n]\3]\3]\3]\7]\u02a4\n]\f]\16]\u02a7\13]\3^\3^\5^\u02ab"+
		"\n^\3^\6^\u02ae\n^\r^\16^\u02af\3_\3_\3`\3`\3a\6a\u02b7\na\ra\16a\u02b8"+
		"\3a\3a\2\2b\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65"+
		"i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008b"+
		"G\u008dH\u008fI\u0091J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009f"+
		"Q\u00a1R\u00a3S\u00a5T\u00a7U\u00a9V\u00abW\u00adX\u00afY\u00b1Z\u00b3"+
		"[\u00b5\\\u00b7]\u00b9^\u00bb\2\u00bd\2\u00bf\2\u00c1_\3\2 \4\2FFff\4"+
		"\2KKkk\4\2UUuu\4\2VVvv\4\2PPpp\4\2EEee\4\2GGgg\4\2NNnn\4\2HHhh\4\2TTt"+
		"t\4\2QQqq\4\2OOoo\4\2YYyy\4\2JJjj\4\2IIii\4\2WWww\4\2RRrr\4\2CCcc\4\2"+
		"XXxx\4\2DDdd\4\2MMmm\4\2ZZzz\4\2[[{{\4\2LLll\4\2\\\\||\3\2))\4\2--//\3"+
		"\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u02cc\2\3\3\2\2\2\2\5\3\2\2\2\2\7"+
		"\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2"+
		"\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2"+
		"\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2"+
		"\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2"+
		"\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2"+
		"\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M"+
		"\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2"+
		"\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2"+
		"\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s"+
		"\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177"+
		"\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2"+
		"\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091"+
		"\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2"+
		"\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3"+
		"\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2"+
		"\2\2\u00ad\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5"+
		"\3\2\2\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00c1\3\2\2\2\3\u00c3\3\2\2"+
		"\2\5\u00c5\3\2\2\2\7\u00c7\3\2\2\2\t\u00c9\3\2\2\2\13\u00cb\3\2\2\2\r"+
		"\u00cd\3\2\2\2\17\u00cf\3\2\2\2\21\u00d1\3\2\2\2\23\u00da\3\2\2\2\25\u00e1"+
		"\3\2\2\2\27\u00e6\3\2\2\2\31\u00ec\3\2\2\2\33\u00f2\3\2\2\2\35\u00f8\3"+
		"\2\2\2\37\u00ff\3\2\2\2!\u0104\3\2\2\2#\u0109\3\2\2\2%\u010e\3\2\2\2\'"+
		"\u0113\3\2\2\2)\u0117\3\2\2\2+\u011b\3\2\2\2-\u011f\3\2\2\2/\u0122\3\2"+
		"\2\2\61\u012a\3\2\2\2\63\u012d\3\2\2\2\65\u0132\3\2\2\2\67\u0139\3\2\2"+
		"\29\u0140\3\2\2\2;\u0146\3\2\2\2=\u0149\3\2\2\2?\u014c\3\2\2\2A\u014f"+
		"\3\2\2\2C\u0154\3\2\2\2E\u0159\3\2\2\2G\u015f\3\2\2\2I\u0164\3\2\2\2K"+
		"\u016a\3\2\2\2M\u016f\3\2\2\2O\u0172\3\2\2\2Q\u0178\3\2\2\2S\u0182\3\2"+
		"\2\2U\u0186\3\2\2\2W\u018d\3\2\2\2Y\u0194\3\2\2\2[\u0199\3\2\2\2]\u01a0"+
		"\3\2\2\2_\u01a7\3\2\2\2a\u01ab\3\2\2\2c\u01b1\3\2\2\2e\u01b3\3\2\2\2g"+
		"\u01b5\3\2\2\2i\u01b8\3\2\2\2k\u01ba\3\2\2\2m\u01bd\3\2\2\2o\u01c3\3\2"+
		"\2\2q\u01c9\3\2\2\2s\u01cf\3\2\2\2u\u01d4\3\2\2\2w\u01d8\3\2\2\2y\u01dd"+
		"\3\2\2\2{\u01e2\3\2\2\2}\u01e7\3\2\2\2\177\u01ec\3\2\2\2\u0081\u01f2\3"+
		"\2\2\2\u0083\u01f6\3\2\2\2\u0085\u01ff\3\2\2\2\u0087\u0202\3\2\2\2\u0089"+
		"\u0207\3\2\2\2\u008b\u020c\3\2\2\2\u008d\u020f\3\2\2\2\u008f\u0214\3\2"+
		"\2\2\u0091\u021a\3\2\2\2\u0093\u021e\3\2\2\2\u0095\u0223\3\2\2\2\u0097"+
		"\u022a\3\2\2\2\u0099\u0231\3\2\2\2\u009b\u0237\3\2\2\2\u009d\u023d\3\2"+
		"\2\2\u009f\u0245\3\2\2\2\u00a1\u024c\3\2\2\2\u00a3\u024e\3\2\2\2\u00a5"+
		"\u0250\3\2\2\2\u00a7\u0252\3\2\2\2\u00a9\u0254\3\2\2\2\u00ab\u0256\3\2"+
		"\2\2\u00ad\u0259\3\2\2\2\u00af\u025b\3\2\2\2\u00b1\u025e\3\2\2\2\u00b3"+
		"\u026a\3\2\2\2\u00b5\u0280\3\2\2\2\u00b7\u029a\3\2\2\2\u00b9\u029e\3\2"+
		"\2\2\u00bb\u02a8\3\2\2\2\u00bd\u02b1\3\2\2\2\u00bf\u02b3\3\2\2\2\u00c1"+
		"\u02b6\3\2\2\2\u00c3\u00c4\7.\2\2\u00c4\4\3\2\2\2\u00c5\u00c6\7\60\2\2"+
		"\u00c6\6\3\2\2\2\u00c7\u00c8\7*\2\2\u00c8\b\3\2\2\2\u00c9\u00ca\7+\2\2"+
		"\u00ca\n\3\2\2\2\u00cb\u00cc\7]\2\2\u00cc\f\3\2\2\2\u00cd\u00ce\7_\2\2"+
		"\u00ce\16\3\2\2\2\u00cf\u00d0\7b\2\2\u00d0\20\3\2\2\2\u00d1\u00d2\t\2"+
		"\2\2\u00d2\u00d3\t\3\2\2\u00d3\u00d4\t\4\2\2\u00d4\u00d5\t\5\2\2\u00d5"+
		"\u00d6\t\3\2\2\u00d6\u00d7\t\6\2\2\u00d7\u00d8\t\7\2\2\u00d8\u00d9\t\5"+
		"\2\2\u00d9\22\3\2\2\2\u00da\u00db\t\4\2\2\u00db\u00dc\t\b\2\2\u00dc\u00dd"+
		"\t\t\2\2\u00dd\u00de\t\b\2\2\u00de\u00df\t\7\2\2\u00df\u00e0\t\5\2\2\u00e0"+
		"\24\3\2\2\2\u00e1\u00e2\t\n\2\2\u00e2\u00e3\t\13\2\2\u00e3\u00e4\t\f\2"+
		"\2\u00e4\u00e5\t\r\2\2\u00e5\26\3\2\2\2\u00e6\u00e7\t\16\2\2\u00e7\u00e8"+
		"\t\17\2\2\u00e8\u00e9\t\b\2\2\u00e9\u00ea\t\13\2\2\u00ea\u00eb\t\b\2\2"+
		"\u00eb\30\3\2\2\2\u00ec\u00ed\t\20\2\2\u00ed\u00ee\t\13\2\2\u00ee\u00ef"+
		"\t\f\2\2\u00ef\u00f0\t\21\2\2\u00f0\u00f1\t\22\2\2\u00f1\32\3\2\2\2\u00f2"+
		"\u00f3\t\f\2\2\u00f3\u00f4\t\13\2\2\u00f4\u00f5\t\2\2\2\u00f5\u00f6\t"+
		"\b\2\2\u00f6\u00f7\t\13\2\2\u00f7\34\3\2\2\2\u00f8\u00f9\t\17\2\2\u00f9"+
		"\u00fa\t\23\2\2\u00fa\u00fb\t\24\2\2\u00fb\u00fc\t\3\2\2\u00fc\u00fd\t"+
		"\6\2\2\u00fd\u00fe\t\20\2\2\u00fe\36\3\2\2\2\u00ff\u0100\t\7\2\2\u0100"+
		"\u0101\t\23\2\2\u0101\u0102\t\4\2\2\u0102\u0103\t\b\2\2\u0103 \3\2\2\2"+
		"\u0104\u0105\t\16\2\2\u0105\u0106\t\17\2\2\u0106\u0107\t\b\2\2\u0107\u0108"+
		"\t\6\2\2\u0108\"\3\2\2\2\u0109\u010a\t\5\2\2\u010a\u010b\t\17\2\2\u010b"+
		"\u010c\t\b\2\2\u010c\u010d\t\6\2\2\u010d$\3\2\2\2\u010e\u010f\t\b\2\2"+
		"\u010f\u0110\t\t\2\2\u0110\u0111\t\4\2\2\u0111\u0112\t\b\2\2\u0112&\3"+
		"\2\2\2\u0113\u0114\t\b\2\2\u0114\u0115\t\6\2\2\u0115\u0116\t\2\2\2\u0116"+
		"(\3\2\2\2\u0117\u0118\t\23\2\2\u0118\u0119\t\6\2\2\u0119\u011a\t\2\2\2"+
		"\u011a*\3\2\2\2\u011b\u011c\t\6\2\2\u011c\u011d\t\f\2\2\u011d\u011e\t"+
		"\5\2\2\u011e,\3\2\2\2\u011f\u0120\t\f\2\2\u0120\u0121\t\13\2\2\u0121."+
		"\3\2\2\2\u0122\u0123\t\25\2\2\u0123\u0124\t\b\2\2\u0124\u0125\t\5\2\2"+
		"\u0125\u0126\t\16\2\2\u0126\u0127\t\b\2\2\u0127\u0128\t\b\2\2\u0128\u0129"+
		"\t\6\2\2\u0129\60\3\2\2\2\u012a\u012b\t\3\2\2\u012b\u012c\t\6\2\2\u012c"+
		"\62\3\2\2\2\u012d\u012e\t\t\2\2\u012e\u012f\t\3\2\2\u012f\u0130\t\26\2"+
		"\2\u0130\u0131\t\b\2\2\u0131\64\3\2\2\2\u0132\u0133\t\b\2\2\u0133\u0134"+
		"\t\4\2\2\u0134\u0135\t\7\2\2\u0135\u0136\t\23\2\2\u0136\u0137\t\22\2\2"+
		"\u0137\u0138\t\b\2\2\u0138\66\3\2\2\2\u0139\u013a\t\b\2\2\u013a\u013b"+
		"\t\27\2\2\u013b\u013c\t\3\2\2\u013c\u013d\t\4\2\2\u013d\u013e\t\5\2\2"+
		"\u013e\u013f\t\4\2\2\u013f8\3\2\2\2\u0140\u0141\t\23\2\2\u0141\u0142\t"+
		"\13\2\2\u0142\u0143\t\13\2\2\u0143\u0144\t\23\2\2\u0144\u0145\t\30\2\2"+
		"\u0145:\3\2\2\2\u0146\u0147\t\3\2\2\u0147\u0148\t\4\2\2\u0148<\3\2\2\2"+
		"\u0149\u014a\t\23\2\2\u014a\u014b\t\4\2\2\u014b>\3\2\2\2\u014c\u014d\t"+
		"\25\2\2\u014d\u014e\t\30\2\2\u014e@\3\2\2\2\u014f\u0150\t\6\2\2\u0150"+
		"\u0151\t\21\2\2\u0151\u0152\t\t\2\2\u0152\u0153\t\t\2\2\u0153B\3\2\2\2"+
		"\u0154\u0155\t\31\2\2\u0155\u0156\t\f\2\2\u0156\u0157\t\3\2\2\u0157\u0158"+
		"\t\6\2\2\u0158D\3\2\2\2\u0159\u015a\t\3\2\2\u015a\u015b\t\6\2\2\u015b"+
		"\u015c\t\6\2\2\u015c\u015d\t\b\2\2\u015d\u015e\t\13\2\2\u015eF\3\2\2\2"+
		"\u015f\u0160\t\t\2\2\u0160\u0161\t\b\2\2\u0161\u0162\t\n\2\2\u0162\u0163"+
		"\t\5\2\2\u0163H\3\2\2\2\u0164\u0165\t\f\2\2\u0165\u0166\t\21\2\2\u0166"+
		"\u0167\t\5\2\2\u0167\u0168\t\b\2\2\u0168\u0169\t\13\2\2\u0169J\3\2\2\2"+
		"\u016a\u016b\t\n\2\2\u016b\u016c\t\21\2\2\u016c\u016d\t\t\2\2\u016d\u016e"+
		"\t\t\2\2\u016eL\3\2\2\2\u016f\u0170\t\f\2\2\u0170\u0171\t\6\2\2\u0171"+
		"N\3\2\2\2\u0172\u0173\t\13\2\2\u0173\u0174\t\3\2\2\u0174\u0175\t\20\2"+
		"\2\u0175\u0176\t\17\2\2\u0176\u0177\t\5\2\2\u0177P\3\2\2\2\u0178\u0179"+
		"\t\2\2\2\u0179\u017a\t\21\2\2\u017a\u017b\t\22\2\2\u017b\u017c\t\t\2\2"+
		"\u017c\u017d\t\3\2\2\u017d\u017e\t\7\2\2\u017e\u017f\t\23\2\2\u017f\u0180"+
		"\t\5\2\2\u0180\u0181\t\b\2\2\u0181R\3\2\2\2\u0182\u0183\t\26\2\2\u0183"+
		"\u0184\t\b\2\2\u0184\u0185\t\30\2\2\u0185T\3\2\2\2\u0186\u0187\t\21\2"+
		"\2\u0187\u0188\t\22\2\2\u0188\u0189\t\2\2\2\u0189\u018a\t\23\2\2\u018a"+
		"\u018b\t\5\2\2\u018b\u018c\t\b\2\2\u018cV\3\2\2\2\u018d\u018e\t\3\2\2"+
		"\u018e\u018f\t\6\2\2\u018f\u0190\t\4\2\2\u0190\u0191\t\b\2\2\u0191\u0192"+
		"\t\13\2\2\u0192\u0193\t\5\2\2\u0193X\3\2\2\2\u0194\u0195\t\3\2\2\u0195"+
		"\u0196\t\6\2\2\u0196\u0197\t\5\2\2\u0197\u0198\t\f\2\2\u0198Z\3\2\2\2"+
		"\u0199\u019a\t\24\2\2\u019a\u019b\t\23\2\2\u019b\u019c\t\t\2\2\u019c\u019d"+
		"\t\21\2\2\u019d\u019e\t\b\2\2\u019e\u019f\t\4\2\2\u019f\\\3\2\2\2\u01a0"+
		"\u01a1\t\2\2\2\u01a1\u01a2\t\b\2\2\u01a2\u01a3\t\t\2\2\u01a3\u01a4\t\b"+
		"\2\2\u01a4\u01a5\t\5\2\2\u01a5\u01a6\t\b\2\2\u01a6^\3\2\2\2\u01a7\u01a8"+
		"\t\4\2\2\u01a8\u01a9\t\b\2\2\u01a9\u01aa\t\5\2\2\u01aa`\3\2\2\2\u01ab"+
		"\u01ac\7?\2\2\u01acb\3\2\2\2\u01ad\u01ae\7>\2\2\u01ae\u01b2\7@\2\2\u01af"+
		"\u01b0\7#\2\2\u01b0\u01b2\7?\2\2\u01b1\u01ad\3\2\2\2\u01b1\u01af\3\2\2"+
		"\2\u01b2d\3\2\2\2\u01b3\u01b4\7>\2\2\u01b4f\3\2\2\2\u01b5\u01b6\7>\2\2"+
		"\u01b6\u01b7\7?\2\2\u01b7h\3\2\2\2\u01b8\u01b9\7@\2\2\u01b9j\3\2\2\2\u01ba"+
		"\u01bb\7@\2\2\u01bb\u01bc\7?\2\2\u01bcl\3\2\2\2\u01bd\u01be\t\t\2\2\u01be"+
		"\u01bf\t\3\2\2\u01bf\u01c0\t\r\2\2\u01c0\u01c1\t\3\2\2\u01c1\u01c2\t\5"+
		"\2\2\u01c2n\3\2\2\2\u01c3\u01c4\t\n\2\2\u01c4\u01c5\t\b\2\2\u01c5\u01c6"+
		"\t\5\2\2\u01c6\u01c7\t\7\2\2\u01c7\u01c8\t\17\2\2\u01c8p\3\2\2\2\u01c9"+
		"\u01ca\t\n\2\2\u01ca\u01cb\t\3\2\2\u01cb\u01cc\t\13\2\2\u01cc\u01cd\t"+
		"\4\2\2\u01cd\u01ce\t\5\2\2\u01cer\3\2\2\2\u01cf\u01d0\t\6\2\2\u01d0\u01d1"+
		"\t\b\2\2\u01d1\u01d2\t\27\2\2\u01d2\u01d3\t\5\2\2\u01d3t\3\2\2\2\u01d4"+
		"\u01d5\t\13\2\2\u01d5\u01d6\t\f\2\2\u01d6\u01d7\t\16\2\2\u01d7v\3\2\2"+
		"\2\u01d8\u01d9\t\13\2\2\u01d9\u01da\t\f\2\2\u01da\u01db\t\16\2\2\u01db"+
		"\u01dc\t\4\2\2\u01dcx\3\2\2\2\u01dd\u01de\t\f\2\2\u01de\u01df\t\6\2\2"+
		"\u01df\u01e0\t\t\2\2\u01e0\u01e1\t\30\2\2\u01e1z\3\2\2\2\u01e2\u01e3\t"+
		"\16\2\2\u01e3\u01e4\t\3\2\2\u01e4\u01e5\t\5\2\2\u01e5\u01e6\t\17\2\2\u01e6"+
		"|\3\2\2\2\u01e7\u01e8\t\5\2\2\u01e8\u01e9\t\3\2\2\u01e9\u01ea\t\b\2\2"+
		"\u01ea\u01eb\t\4\2\2\u01eb~\3\2\2\2\u01ec\u01ed\t\21\2\2\u01ed\u01ee\t"+
		"\6\2\2\u01ee\u01ef\t\3\2\2\u01ef\u01f0\t\f\2\2\u01f0\u01f1\t\6\2\2\u01f1"+
		"\u0080\3\2\2\2\u01f2\u01f3\t\23\2\2\u01f3\u01f4\t\t\2\2\u01f4\u01f5\t"+
		"\t\2\2\u01f5\u0082\3\2\2\2\u01f6\u01f7\t\3\2\2\u01f7\u01f8\t\6\2\2\u01f8"+
		"\u01f9\t\5\2\2\u01f9\u01fa\t\b\2\2\u01fa\u01fb\t\13\2\2\u01fb\u01fc\t"+
		"\24\2\2\u01fc\u01fd\t\23\2\2\u01fd\u01fe\t\t\2\2\u01fe\u0084\3\2\2\2\u01ff"+
		"\u0200\t\23\2\2\u0200\u0201\t\5\2\2\u0201\u0086\3\2\2\2\u0202\u0203\t"+
		"\5\2\2\u0203\u0204\t\3\2\2\u0204\u0205\t\r\2\2\u0205\u0206\t\b\2\2\u0206"+
		"\u0088\3\2\2\2\u0207\u0208\t\32\2\2\u0208\u0209\t\f\2\2\u0209\u020a\t"+
		"\6\2\2\u020a\u020b\t\b\2\2\u020b\u008a\3\2\2\2\u020c\u020d\t\5\2\2\u020d"+
		"\u020e\t\f\2\2\u020e\u008c\3\2\2\2\u020f\u0210\t\30\2\2\u0210\u0211\t"+
		"\b\2\2\u0211\u0212\t\23\2\2\u0212\u0213\t\13\2\2\u0213\u008e\3\2\2\2\u0214"+
		"\u0215\t\r\2\2\u0215\u0216\t\f\2\2\u0216\u0217\t\6\2\2\u0217\u0218\t\5"+
		"\2\2\u0218\u0219\t\17\2\2\u0219\u0090\3\2\2\2\u021a\u021b\t\2\2\2\u021b"+
		"\u021c\t\23\2\2\u021c\u021d\t\30\2\2\u021d\u0092\3\2\2\2\u021e\u021f\t"+
		"\17\2\2\u021f\u0220\t\f\2\2\u0220\u0221\t\21\2\2\u0221\u0222\t\13\2\2"+
		"\u0222\u0094\3\2\2\2\u0223\u0224\t\r\2\2\u0224\u0225\t\3\2\2\u0225\u0226"+
		"\t\6\2\2\u0226\u0227\t\21\2\2\u0227\u0228\t\5\2\2\u0228\u0229\t\b\2\2"+
		"\u0229\u0096\3\2\2\2\u022a\u022b\t\4\2\2\u022b\u022c\t\b\2\2\u022c\u022d"+
		"\t\7\2\2\u022d\u022e\t\f\2\2\u022e\u022f\t\6\2\2\u022f\u0230\t\2\2\2\u0230"+
		"\u0098\3\2\2\2\u0231\u0232\t\r\2\2\u0232\u0233\t\b\2\2\u0233\u0234\t\13"+
		"\2\2\u0234\u0235\t\20\2\2\u0235\u0236\t\b\2\2\u0236\u009a\3\2\2\2\u0237"+
		"\u0238\t\21\2\2\u0238\u0239\t\4\2\2\u0239\u023a\t\3\2\2\u023a\u023b\t"+
		"\6\2\2\u023b\u023c\t\20\2\2\u023c\u009c\3\2\2\2\u023d\u023e\t\r\2\2\u023e"+
		"\u023f\t\23\2\2\u023f\u0240\t\5\2\2\u0240\u0241\t\7\2\2\u0241\u0242\t"+
		"\17\2\2\u0242\u0243\t\b\2\2\u0243\u0244\t\2\2\2\u0244\u009e\3\2\2\2\u0245"+
		"\u0246\t\4\2\2\u0246\u0247\t\f\2\2\u0247\u0248\t\21\2\2\u0248\u0249\t"+
		"\13\2\2\u0249\u024a\t\7\2\2\u024a\u024b\t\b\2\2\u024b\u00a0\3\2\2\2\u024c"+
		"\u024d\7-\2\2\u024d\u00a2\3\2\2\2\u024e\u024f\7/\2\2\u024f\u00a4\3\2\2"+
		"\2\u0250\u0251\7,\2\2\u0251\u00a6\3\2\2\2\u0252\u0253\7\61\2\2\u0253\u00a8"+
		"\3\2\2\2\u0254\u0255\7\'\2\2\u0255\u00aa\3\2\2\2\u0256\u0257\7~\2\2\u0257"+
		"\u0258\7~\2\2\u0258\u00ac\3\2\2\2\u0259\u025a\7A\2\2\u025a\u00ae\3\2\2"+
		"\2\u025b\u025c\7B\2\2\u025c\u025d\7B\2\2\u025d\u00b0\3\2\2\2\u025e\u0264"+
		"\7)\2\2\u025f\u0263\n\33\2\2\u0260\u0261\7)\2\2\u0261\u0263\7)\2\2\u0262"+
		"\u025f\3\2\2\2\u0262\u0260\3\2\2\2\u0263\u0266\3\2\2\2\u0264\u0262\3\2"+
		"\2\2\u0264\u0265\3\2\2\2\u0265\u0267\3\2\2\2\u0266\u0264\3\2\2\2\u0267"+
		"\u0268\7)\2\2\u0268\u00b2\3\2\2\2\u0269\u026b\5\u00bd_\2\u026a\u0269\3"+
		"\2\2\2\u026b\u026c\3\2\2\2\u026c\u026a\3\2\2\2\u026c\u026d\3\2\2\2\u026d"+
		"\u00b4\3\2\2\2\u026e\u0270\5\u00bd_\2\u026f\u026e\3\2\2\2\u0270\u0271"+
		"\3\2\2\2\u0271\u026f\3\2\2\2\u0271\u0272\3\2\2\2\u0272\u0273\3\2\2\2\u0273"+
		"\u0277\7\60\2\2\u0274\u0276\5\u00bd_\2\u0275\u0274\3\2\2\2\u0276\u0279"+
		"\3\2\2\2\u0277\u0275\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0281\3\2\2\2\u0279"+
		"\u0277\3\2\2\2\u027a\u027c\7\60\2\2\u027b\u027d\5\u00bd_\2\u027c\u027b"+
		"\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027c\3\2\2\2\u027e\u027f\3\2\2\2\u027f"+
		"\u0281\3\2\2\2\u0280\u026f\3\2\2\2\u0280\u027a\3\2\2\2\u0281\u00b6\3\2"+
		"\2\2\u0282\u0284\5\u00bd_\2\u0283\u0282\3\2\2\2\u0284\u0285\3\2\2\2\u0285"+
		"\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u028e\3\2\2\2\u0287\u028b\7\60"+
		"\2\2\u0288\u028a\5\u00bd_\2\u0289\u0288\3\2\2\2\u028a\u028d\3\2\2\2\u028b"+
		"\u0289\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u028f\3\2\2\2\u028d\u028b\3\2"+
		"\2\2\u028e\u0287\3\2\2\2\u028e\u028f\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"\u0291\5\u00bb^\2\u0291\u029b\3\2\2\2\u0292\u0294\7\60\2\2\u0293\u0295"+
		"\5\u00bd_\2\u0294\u0293\3\2\2\2\u0295\u0296\3\2\2\2\u0296\u0294\3\2\2"+
		"\2\u0296\u0297\3\2\2\2\u0297\u0298\3\2\2\2\u0298\u0299\5\u00bb^\2\u0299"+
		"\u029b\3\2\2\2\u029a\u0283\3\2\2\2\u029a\u0292\3\2\2\2\u029b\u00b8\3\2"+
		"\2\2\u029c\u029f\5\u00bf`\2\u029d\u029f\7a\2\2\u029e\u029c\3\2\2\2\u029e"+
		"\u029d\3\2\2\2\u029f\u02a5\3\2\2\2\u02a0\u02a4\5\u00bf`\2\u02a1\u02a4"+
		"\5\u00bd_\2\u02a2\u02a4\7a\2\2\u02a3\u02a0\3\2\2\2\u02a3\u02a1\3\2\2\2"+
		"\u02a3\u02a2\3\2\2\2\u02a4\u02a7\3\2\2\2\u02a5\u02a3\3\2\2\2\u02a5\u02a6"+
		"\3\2\2\2\u02a6\u00ba\3\2\2\2\u02a7\u02a5\3\2\2\2\u02a8\u02aa\7G\2\2\u02a9"+
		"\u02ab\t\34\2\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab\u02ad\3"+
		"\2\2\2\u02ac\u02ae\5\u00bd_\2\u02ad\u02ac\3\2\2\2\u02ae\u02af\3\2\2\2"+
		"\u02af\u02ad\3\2\2\2\u02af\u02b0\3\2\2\2\u02b0\u00bc\3\2\2\2\u02b1\u02b2"+
		"\t\35\2\2\u02b2\u00be\3\2\2\2\u02b3\u02b4\t\36\2\2\u02b4\u00c0\3\2\2\2"+
		"\u02b5\u02b7\t\37\2\2\u02b6\u02b5\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02b6"+
		"\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9\u02ba\3\2\2\2\u02ba\u02bb\ba\2\2\u02bb"+
		"\u00c2\3\2\2\2\26\2\u01b1\u0262\u0264\u026c\u0271\u0277\u027e\u0280\u0285"+
		"\u028b\u028e\u0296\u029a\u029e\u02a3\u02a5\u02aa\u02af\u02b8\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}