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
		INSERT=43, INTO=44, VALUES=45, EQ=46, NEQ=47, LT=48, LTE=49, GT=50, GTE=51, 
		LIMIT=52, FETCH=53, FIRST=54, NEXT=55, ROW=56, ROWS=57, ONLY=58, WITH=59, 
		TIES=60, UNION=61, ALL=62, INTERVAL=63, AT=64, TIME=65, ZONE=66, TO=67, 
		YEAR=68, MONTH=69, DAY=70, HOUR=71, MINUTE=72, SECOND=73, PLUS=74, MINUS=75, 
		ASTERISK=76, SLASH=77, PERCENT=78, CONCAT=79, PARAMETER=80, D_ANT=81, 
		STRING=82, INTEGER_VALUE=83, DECIMAL_VALUE=84, DOUBLE_VALUE=85, IDENTIFIER=86, 
		WS=87;
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
			"INTO", "VALUES", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", "LIMIT", "FETCH", 
			"FIRST", "NEXT", "ROW", "ROWS", "ONLY", "WITH", "TIES", "UNION", "ALL", 
			"INTERVAL", "AT", "TIME", "ZONE", "TO", "YEAR", "MONTH", "DAY", "HOUR", 
			"MINUTE", "SECOND", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", 
			"CONCAT", "PARAMETER", "D_ANT", "STRING", "INTEGER_VALUE", "DECIMAL_VALUE", 
			"DOUBLE_VALUE", "IDENTIFIER", "EXPONENT", "DIGIT", "LETTER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'.'", "'('", "')'", "'['", "']'", "'`'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, "'='", 
			null, "'<'", "'<='", "'>'", "'>='", null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", "'||'", "'?'", 
			"'@@'"
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
			"INTO", "VALUES", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", "LIMIT", "FETCH", 
			"FIRST", "NEXT", "ROW", "ROWS", "ONLY", "WITH", "TIES", "UNION", "ALL", 
			"INTERVAL", "AT", "TIME", "ZONE", "TO", "YEAR", "MONTH", "DAY", "HOUR", 
			"MINUTE", "SECOND", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", 
			"CONCAT", "PARAMETER", "D_ANT", "STRING", "INTEGER_VALUE", "DECIMAL_VALUE", 
			"DOUBLE_VALUE", "IDENTIFIER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2Y\u028a\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\3\2\3\2\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3"+
		"!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%"+
		"\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3(\3(\3(\3(\3(\3(\3)\3)\3)\3)"+
		"\3)\3)\3)\3)\3)\3)\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3,\3,\3,"+
		"\3,\3-\3-\3-\3-\3-\3.\3.\3.\3.\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\60\5\60"+
		"\u019b\n\60\3\61\3\61\3\62\3\62\3\62\3\63\3\63\3\64\3\64\3\64\3\65\3\65"+
		"\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67"+
		"\3\67\3\67\38\38\38\38\38\39\39\39\39\3:\3:\3:\3:\3:\3;\3;\3;\3;\3;\3"+
		"<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3>\3>\3>\3?\3?\3?\3?\3@\3@\3@\3"+
		"@\3@\3@\3@\3@\3@\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3D\3D\3D\3E\3"+
		"E\3E\3E\3E\3F\3F\3F\3F\3F\3F\3G\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3I\3"+
		"I\3I\3I\3J\3J\3J\3J\3J\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3P\3"+
		"Q\3Q\3R\3R\3R\3S\3S\3S\3S\7S\u0231\nS\fS\16S\u0234\13S\3S\3S\3T\6T\u0239"+
		"\nT\rT\16T\u023a\3U\6U\u023e\nU\rU\16U\u023f\3U\3U\7U\u0244\nU\fU\16U"+
		"\u0247\13U\3U\3U\6U\u024b\nU\rU\16U\u024c\5U\u024f\nU\3V\6V\u0252\nV\r"+
		"V\16V\u0253\3V\3V\7V\u0258\nV\fV\16V\u025b\13V\5V\u025d\nV\3V\3V\3V\3"+
		"V\6V\u0263\nV\rV\16V\u0264\3V\3V\5V\u0269\nV\3W\3W\5W\u026d\nW\3W\3W\3"+
		"W\7W\u0272\nW\fW\16W\u0275\13W\3X\3X\5X\u0279\nX\3X\6X\u027c\nX\rX\16"+
		"X\u027d\3Y\3Y\3Z\3Z\3[\6[\u0285\n[\r[\16[\u0286\3[\3[\2\2\\\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w"+
		"=y>{?}@\177A\u0081B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091"+
		"J\u0093K\u0095L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3S\u00a5"+
		"T\u00a7U\u00a9V\u00abW\u00adX\u00af\2\u00b1\2\u00b3\2\u00b5Y\3\2 \4\2"+
		"FFff\4\2KKkk\4\2UUuu\4\2VVvv\4\2PPpp\4\2EEee\4\2GGgg\4\2NNnn\4\2HHhh\4"+
		"\2TTtt\4\2QQqq\4\2OOoo\4\2YYyy\4\2JJjj\4\2IIii\4\2WWww\4\2RRrr\4\2CCc"+
		"c\4\2XXxx\4\2DDdd\4\2MMmm\4\2ZZzz\4\2[[{{\4\2LLll\4\2\\\\||\3\2))\4\2"+
		"--//\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u029a\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2"+
		"\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2"+
		"\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3"+
		"\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2"+
		"\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099"+
		"\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2"+
		"\2\2\u00a3\3\2\2\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab"+
		"\3\2\2\2\2\u00ad\3\2\2\2\2\u00b5\3\2\2\2\3\u00b7\3\2\2\2\5\u00b9\3\2\2"+
		"\2\7\u00bb\3\2\2\2\t\u00bd\3\2\2\2\13\u00bf\3\2\2\2\r\u00c1\3\2\2\2\17"+
		"\u00c3\3\2\2\2\21\u00c5\3\2\2\2\23\u00ce\3\2\2\2\25\u00d5\3\2\2\2\27\u00da"+
		"\3\2\2\2\31\u00e0\3\2\2\2\33\u00e6\3\2\2\2\35\u00ec\3\2\2\2\37\u00f3\3"+
		"\2\2\2!\u00f8\3\2\2\2#\u00fd\3\2\2\2%\u0102\3\2\2\2\'\u0107\3\2\2\2)\u010b"+
		"\3\2\2\2+\u010f\3\2\2\2-\u0113\3\2\2\2/\u0116\3\2\2\2\61\u011e\3\2\2\2"+
		"\63\u0121\3\2\2\2\65\u0126\3\2\2\2\67\u012d\3\2\2\29\u0134\3\2\2\2;\u013a"+
		"\3\2\2\2=\u013d\3\2\2\2?\u0140\3\2\2\2A\u0143\3\2\2\2C\u0148\3\2\2\2E"+
		"\u014d\3\2\2\2G\u0153\3\2\2\2I\u0158\3\2\2\2K\u015e\3\2\2\2M\u0163\3\2"+
		"\2\2O\u0166\3\2\2\2Q\u016c\3\2\2\2S\u0176\3\2\2\2U\u017a\3\2\2\2W\u0181"+
		"\3\2\2\2Y\u0188\3\2\2\2[\u018d\3\2\2\2]\u0194\3\2\2\2_\u019a\3\2\2\2a"+
		"\u019c\3\2\2\2c\u019e\3\2\2\2e\u01a1\3\2\2\2g\u01a3\3\2\2\2i\u01a6\3\2"+
		"\2\2k\u01ac\3\2\2\2m\u01b2\3\2\2\2o\u01b8\3\2\2\2q\u01bd\3\2\2\2s\u01c1"+
		"\3\2\2\2u\u01c6\3\2\2\2w\u01cb\3\2\2\2y\u01d0\3\2\2\2{\u01d5\3\2\2\2}"+
		"\u01db\3\2\2\2\177\u01df\3\2\2\2\u0081\u01e8\3\2\2\2\u0083\u01eb\3\2\2"+
		"\2\u0085\u01f0\3\2\2\2\u0087\u01f5\3\2\2\2\u0089\u01f8\3\2\2\2\u008b\u01fd"+
		"\3\2\2\2\u008d\u0203\3\2\2\2\u008f\u0207\3\2\2\2\u0091\u020c\3\2\2\2\u0093"+
		"\u0213\3\2\2\2\u0095\u021a\3\2\2\2\u0097\u021c\3\2\2\2\u0099\u021e\3\2"+
		"\2\2\u009b\u0220\3\2\2\2\u009d\u0222\3\2\2\2\u009f\u0224\3\2\2\2\u00a1"+
		"\u0227\3\2\2\2\u00a3\u0229\3\2\2\2\u00a5\u022c\3\2\2\2\u00a7\u0238\3\2"+
		"\2\2\u00a9\u024e\3\2\2\2\u00ab\u0268\3\2\2\2\u00ad\u026c\3\2\2\2\u00af"+
		"\u0276\3\2\2\2\u00b1\u027f\3\2\2\2\u00b3\u0281\3\2\2\2\u00b5\u0284\3\2"+
		"\2\2\u00b7\u00b8\7.\2\2\u00b8\4\3\2\2\2\u00b9\u00ba\7\60\2\2\u00ba\6\3"+
		"\2\2\2\u00bb\u00bc\7*\2\2\u00bc\b\3\2\2\2\u00bd\u00be\7+\2\2\u00be\n\3"+
		"\2\2\2\u00bf\u00c0\7]\2\2\u00c0\f\3\2\2\2\u00c1\u00c2\7_\2\2\u00c2\16"+
		"\3\2\2\2\u00c3\u00c4\7b\2\2\u00c4\20\3\2\2\2\u00c5\u00c6\t\2\2\2\u00c6"+
		"\u00c7\t\3\2\2\u00c7\u00c8\t\4\2\2\u00c8\u00c9\t\5\2\2\u00c9\u00ca\t\3"+
		"\2\2\u00ca\u00cb\t\6\2\2\u00cb\u00cc\t\7\2\2\u00cc\u00cd\t\5\2\2\u00cd"+
		"\22\3\2\2\2\u00ce\u00cf\t\4\2\2\u00cf\u00d0\t\b\2\2\u00d0\u00d1\t\t\2"+
		"\2\u00d1\u00d2\t\b\2\2\u00d2\u00d3\t\7\2\2\u00d3\u00d4\t\5\2\2\u00d4\24"+
		"\3\2\2\2\u00d5\u00d6\t\n\2\2\u00d6\u00d7\t\13\2\2\u00d7\u00d8\t\f\2\2"+
		"\u00d8\u00d9\t\r\2\2\u00d9\26\3\2\2\2\u00da\u00db\t\16\2\2\u00db\u00dc"+
		"\t\17\2\2\u00dc\u00dd\t\b\2\2\u00dd\u00de\t\13\2\2\u00de\u00df\t\b\2\2"+
		"\u00df\30\3\2\2\2\u00e0\u00e1\t\20\2\2\u00e1\u00e2\t\13\2\2\u00e2\u00e3"+
		"\t\f\2\2\u00e3\u00e4\t\21\2\2\u00e4\u00e5\t\22\2\2\u00e5\32\3\2\2\2\u00e6"+
		"\u00e7\t\f\2\2\u00e7\u00e8\t\13\2\2\u00e8\u00e9\t\2\2\2\u00e9\u00ea\t"+
		"\b\2\2\u00ea\u00eb\t\13\2\2\u00eb\34\3\2\2\2\u00ec\u00ed\t\17\2\2\u00ed"+
		"\u00ee\t\23\2\2\u00ee\u00ef\t\24\2\2\u00ef\u00f0\t\3\2\2\u00f0\u00f1\t"+
		"\6\2\2\u00f1\u00f2\t\20\2\2\u00f2\36\3\2\2\2\u00f3\u00f4\t\7\2\2\u00f4"+
		"\u00f5\t\23\2\2\u00f5\u00f6\t\4\2\2\u00f6\u00f7\t\b\2\2\u00f7 \3\2\2\2"+
		"\u00f8\u00f9\t\16\2\2\u00f9\u00fa\t\17\2\2\u00fa\u00fb\t\b\2\2\u00fb\u00fc"+
		"\t\6\2\2\u00fc\"\3\2\2\2\u00fd\u00fe\t\5\2\2\u00fe\u00ff\t\17\2\2\u00ff"+
		"\u0100\t\b\2\2\u0100\u0101\t\6\2\2\u0101$\3\2\2\2\u0102\u0103\t\b\2\2"+
		"\u0103\u0104\t\t\2\2\u0104\u0105\t\4\2\2\u0105\u0106\t\b\2\2\u0106&\3"+
		"\2\2\2\u0107\u0108\t\b\2\2\u0108\u0109\t\6\2\2\u0109\u010a\t\2\2\2\u010a"+
		"(\3\2\2\2\u010b\u010c\t\23\2\2\u010c\u010d\t\6\2\2\u010d\u010e\t\2\2\2"+
		"\u010e*\3\2\2\2\u010f\u0110\t\6\2\2\u0110\u0111\t\f\2\2\u0111\u0112\t"+
		"\5\2\2\u0112,\3\2\2\2\u0113\u0114\t\f\2\2\u0114\u0115\t\13\2\2\u0115."+
		"\3\2\2\2\u0116\u0117\t\25\2\2\u0117\u0118\t\b\2\2\u0118\u0119\t\5\2\2"+
		"\u0119\u011a\t\16\2\2\u011a\u011b\t\b\2\2\u011b\u011c\t\b\2\2\u011c\u011d"+
		"\t\6\2\2\u011d\60\3\2\2\2\u011e\u011f\t\3\2\2\u011f\u0120\t\6\2\2\u0120"+
		"\62\3\2\2\2\u0121\u0122\t\t\2\2\u0122\u0123\t\3\2\2\u0123\u0124\t\26\2"+
		"\2\u0124\u0125\t\b\2\2\u0125\64\3\2\2\2\u0126\u0127\t\b\2\2\u0127\u0128"+
		"\t\4\2\2\u0128\u0129\t\7\2\2\u0129\u012a\t\23\2\2\u012a\u012b\t\22\2\2"+
		"\u012b\u012c\t\b\2\2\u012c\66\3\2\2\2\u012d\u012e\t\b\2\2\u012e\u012f"+
		"\t\27\2\2\u012f\u0130\t\3\2\2\u0130\u0131\t\4\2\2\u0131\u0132\t\5\2\2"+
		"\u0132\u0133\t\4\2\2\u01338\3\2\2\2\u0134\u0135\t\23\2\2\u0135\u0136\t"+
		"\13\2\2\u0136\u0137\t\13\2\2\u0137\u0138\t\23\2\2\u0138\u0139\t\30\2\2"+
		"\u0139:\3\2\2\2\u013a\u013b\t\3\2\2\u013b\u013c\t\4\2\2\u013c<\3\2\2\2"+
		"\u013d\u013e\t\23\2\2\u013e\u013f\t\4\2\2\u013f>\3\2\2\2\u0140\u0141\t"+
		"\25\2\2\u0141\u0142\t\30\2\2\u0142@\3\2\2\2\u0143\u0144\t\6\2\2\u0144"+
		"\u0145\t\21\2\2\u0145\u0146\t\t\2\2\u0146\u0147\t\t\2\2\u0147B\3\2\2\2"+
		"\u0148\u0149\t\31\2\2\u0149\u014a\t\f\2\2\u014a\u014b\t\3\2\2\u014b\u014c"+
		"\t\6\2\2\u014cD\3\2\2\2\u014d\u014e\t\3\2\2\u014e\u014f\t\6\2\2\u014f"+
		"\u0150\t\6\2\2\u0150\u0151\t\b\2\2\u0151\u0152\t\13\2\2\u0152F\3\2\2\2"+
		"\u0153\u0154\t\t\2\2\u0154\u0155\t\b\2\2\u0155\u0156\t\n\2\2\u0156\u0157"+
		"\t\5\2\2\u0157H\3\2\2\2\u0158\u0159\t\f\2\2\u0159\u015a\t\21\2\2\u015a"+
		"\u015b\t\5\2\2\u015b\u015c\t\b\2\2\u015c\u015d\t\13\2\2\u015dJ\3\2\2\2"+
		"\u015e\u015f\t\n\2\2\u015f\u0160\t\21\2\2\u0160\u0161\t\t\2\2\u0161\u0162"+
		"\t\t\2\2\u0162L\3\2\2\2\u0163\u0164\t\f\2\2\u0164\u0165\t\6\2\2\u0165"+
		"N\3\2\2\2\u0166\u0167\t\13\2\2\u0167\u0168\t\3\2\2\u0168\u0169\t\20\2"+
		"\2\u0169\u016a\t\17\2\2\u016a\u016b\t\5\2\2\u016bP\3\2\2\2\u016c\u016d"+
		"\t\2\2\2\u016d\u016e\t\21\2\2\u016e\u016f\t\22\2\2\u016f\u0170\t\t\2\2"+
		"\u0170\u0171\t\3\2\2\u0171\u0172\t\7\2\2\u0172\u0173\t\23\2\2\u0173\u0174"+
		"\t\5\2\2\u0174\u0175\t\b\2\2\u0175R\3\2\2\2\u0176\u0177\t\26\2\2\u0177"+
		"\u0178\t\b\2\2\u0178\u0179\t\30\2\2\u0179T\3\2\2\2\u017a\u017b\t\21\2"+
		"\2\u017b\u017c\t\22\2\2\u017c\u017d\t\2\2\2\u017d\u017e\t\23\2\2\u017e"+
		"\u017f\t\5\2\2\u017f\u0180\t\b\2\2\u0180V\3\2\2\2\u0181\u0182\t\3\2\2"+
		"\u0182\u0183\t\6\2\2\u0183\u0184\t\4\2\2\u0184\u0185\t\b\2\2\u0185\u0186"+
		"\t\13\2\2\u0186\u0187\t\5\2\2\u0187X\3\2\2\2\u0188\u0189\t\3\2\2\u0189"+
		"\u018a\t\6\2\2\u018a\u018b\t\5\2\2\u018b\u018c\t\f\2\2\u018cZ\3\2\2\2"+
		"\u018d\u018e\t\24\2\2\u018e\u018f\t\23\2\2\u018f\u0190\t\t\2\2\u0190\u0191"+
		"\t\21\2\2\u0191\u0192\t\b\2\2\u0192\u0193\t\4\2\2\u0193\\\3\2\2\2\u0194"+
		"\u0195\7?\2\2\u0195^\3\2\2\2\u0196\u0197\7>\2\2\u0197\u019b\7@\2\2\u0198"+
		"\u0199\7#\2\2\u0199\u019b\7?\2\2\u019a\u0196\3\2\2\2\u019a\u0198\3\2\2"+
		"\2\u019b`\3\2\2\2\u019c\u019d\7>\2\2\u019db\3\2\2\2\u019e\u019f\7>\2\2"+
		"\u019f\u01a0\7?\2\2\u01a0d\3\2\2\2\u01a1\u01a2\7@\2\2\u01a2f\3\2\2\2\u01a3"+
		"\u01a4\7@\2\2\u01a4\u01a5\7?\2\2\u01a5h\3\2\2\2\u01a6\u01a7\t\t\2\2\u01a7"+
		"\u01a8\t\3\2\2\u01a8\u01a9\t\r\2\2\u01a9\u01aa\t\3\2\2\u01aa\u01ab\t\5"+
		"\2\2\u01abj\3\2\2\2\u01ac\u01ad\t\n\2\2\u01ad\u01ae\t\b\2\2\u01ae\u01af"+
		"\t\5\2\2\u01af\u01b0\t\7\2\2\u01b0\u01b1\t\17\2\2\u01b1l\3\2\2\2\u01b2"+
		"\u01b3\t\n\2\2\u01b3\u01b4\t\3\2\2\u01b4\u01b5\t\13\2\2\u01b5\u01b6\t"+
		"\4\2\2\u01b6\u01b7\t\5\2\2\u01b7n\3\2\2\2\u01b8\u01b9\t\6\2\2\u01b9\u01ba"+
		"\t\b\2\2\u01ba\u01bb\t\27\2\2\u01bb\u01bc\t\5\2\2\u01bcp\3\2\2\2\u01bd"+
		"\u01be\t\13\2\2\u01be\u01bf\t\f\2\2\u01bf\u01c0\t\16\2\2\u01c0r\3\2\2"+
		"\2\u01c1\u01c2\t\13\2\2\u01c2\u01c3\t\f\2\2\u01c3\u01c4\t\16\2\2\u01c4"+
		"\u01c5\t\4\2\2\u01c5t\3\2\2\2\u01c6\u01c7\t\f\2\2\u01c7\u01c8\t\6\2\2"+
		"\u01c8\u01c9\t\t\2\2\u01c9\u01ca\t\30\2\2\u01cav\3\2\2\2\u01cb\u01cc\t"+
		"\16\2\2\u01cc\u01cd\t\3\2\2\u01cd\u01ce\t\5\2\2\u01ce\u01cf\t\17\2\2\u01cf"+
		"x\3\2\2\2\u01d0\u01d1\t\5\2\2\u01d1\u01d2\t\3\2\2\u01d2\u01d3\t\b\2\2"+
		"\u01d3\u01d4\t\4\2\2\u01d4z\3\2\2\2\u01d5\u01d6\t\21\2\2\u01d6\u01d7\t"+
		"\6\2\2\u01d7\u01d8\t\3\2\2\u01d8\u01d9\t\f\2\2\u01d9\u01da\t\6\2\2\u01da"+
		"|\3\2\2\2\u01db\u01dc\t\23\2\2\u01dc\u01dd\t\t\2\2\u01dd\u01de\t\t\2\2"+
		"\u01de~\3\2\2\2\u01df\u01e0\t\3\2\2\u01e0\u01e1\t\6\2\2\u01e1\u01e2\t"+
		"\5\2\2\u01e2\u01e3\t\b\2\2\u01e3\u01e4\t\13\2\2\u01e4\u01e5\t\24\2\2\u01e5"+
		"\u01e6\t\23\2\2\u01e6\u01e7\t\t\2\2\u01e7\u0080\3\2\2\2\u01e8\u01e9\t"+
		"\23\2\2\u01e9\u01ea\t\5\2\2\u01ea\u0082\3\2\2\2\u01eb\u01ec\t\5\2\2\u01ec"+
		"\u01ed\t\3\2\2\u01ed\u01ee\t\r\2\2\u01ee\u01ef\t\b\2\2\u01ef\u0084\3\2"+
		"\2\2\u01f0\u01f1\t\32\2\2\u01f1\u01f2\t\f\2\2\u01f2\u01f3\t\6\2\2\u01f3"+
		"\u01f4\t\b\2\2\u01f4\u0086\3\2\2\2\u01f5\u01f6\t\5\2\2\u01f6\u01f7\t\f"+
		"\2\2\u01f7\u0088\3\2\2\2\u01f8\u01f9\t\30\2\2\u01f9\u01fa\t\b\2\2\u01fa"+
		"\u01fb\t\23\2\2\u01fb\u01fc\t\13\2\2\u01fc\u008a\3\2\2\2\u01fd\u01fe\t"+
		"\r\2\2\u01fe\u01ff\t\f\2\2\u01ff\u0200\t\6\2\2\u0200\u0201\t\5\2\2\u0201"+
		"\u0202\t\17\2\2\u0202\u008c\3\2\2\2\u0203\u0204\t\2\2\2\u0204\u0205\t"+
		"\23\2\2\u0205\u0206\t\30\2\2\u0206\u008e\3\2\2\2\u0207\u0208\t\17\2\2"+
		"\u0208\u0209\t\f\2\2\u0209\u020a\t\21\2\2\u020a\u020b\t\13\2\2\u020b\u0090"+
		"\3\2\2\2\u020c\u020d\t\r\2\2\u020d\u020e\t\3\2\2\u020e\u020f\t\6\2\2\u020f"+
		"\u0210\t\21\2\2\u0210\u0211\t\5\2\2\u0211\u0212\t\b\2\2\u0212\u0092\3"+
		"\2\2\2\u0213\u0214\t\4\2\2\u0214\u0215\t\b\2\2\u0215\u0216\t\7\2\2\u0216"+
		"\u0217\t\f\2\2\u0217\u0218\t\6\2\2\u0218\u0219\t\2\2\2\u0219\u0094\3\2"+
		"\2\2\u021a\u021b\7-\2\2\u021b\u0096\3\2\2\2\u021c\u021d\7/\2\2\u021d\u0098"+
		"\3\2\2\2\u021e\u021f\7,\2\2\u021f\u009a\3\2\2\2\u0220\u0221\7\61\2\2\u0221"+
		"\u009c\3\2\2\2\u0222\u0223\7\'\2\2\u0223\u009e\3\2\2\2\u0224\u0225\7~"+
		"\2\2\u0225\u0226\7~\2\2\u0226\u00a0\3\2\2\2\u0227\u0228\7A\2\2\u0228\u00a2"+
		"\3\2\2\2\u0229\u022a\7B\2\2\u022a\u022b\7B\2\2\u022b\u00a4\3\2\2\2\u022c"+
		"\u0232\7)\2\2\u022d\u0231\n\33\2\2\u022e\u022f\7)\2\2\u022f\u0231\7)\2"+
		"\2\u0230\u022d\3\2\2\2\u0230\u022e\3\2\2\2\u0231\u0234\3\2\2\2\u0232\u0230"+
		"\3\2\2\2\u0232\u0233\3\2\2\2\u0233\u0235\3\2\2\2\u0234\u0232\3\2\2\2\u0235"+
		"\u0236\7)\2\2\u0236\u00a6\3\2\2\2\u0237\u0239\5\u00b1Y\2\u0238\u0237\3"+
		"\2\2\2\u0239\u023a\3\2\2\2\u023a\u0238\3\2\2\2\u023a\u023b\3\2\2\2\u023b"+
		"\u00a8\3\2\2\2\u023c\u023e\5\u00b1Y\2\u023d\u023c\3\2\2\2\u023e\u023f"+
		"\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u0241\3\2\2\2\u0241"+
		"\u0245\7\60\2\2\u0242\u0244\5\u00b1Y\2\u0243\u0242\3\2\2\2\u0244\u0247"+
		"\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u024f\3\2\2\2\u0247"+
		"\u0245\3\2\2\2\u0248\u024a\7\60\2\2\u0249\u024b\5\u00b1Y\2\u024a\u0249"+
		"\3\2\2\2\u024b\u024c\3\2\2\2\u024c\u024a\3\2\2\2\u024c\u024d\3\2\2\2\u024d"+
		"\u024f\3\2\2\2\u024e\u023d\3\2\2\2\u024e\u0248\3\2\2\2\u024f\u00aa\3\2"+
		"\2\2\u0250\u0252\5\u00b1Y\2\u0251\u0250\3\2\2\2\u0252\u0253\3\2\2\2\u0253"+
		"\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u025c\3\2\2\2\u0255\u0259\7\60"+
		"\2\2\u0256\u0258\5\u00b1Y\2\u0257\u0256\3\2\2\2\u0258\u025b\3\2\2\2\u0259"+
		"\u0257\3\2\2\2\u0259\u025a\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2"+
		"\2\2\u025c\u0255\3\2\2\2\u025c\u025d\3\2\2\2\u025d\u025e\3\2\2\2\u025e"+
		"\u025f\5\u00afX\2\u025f\u0269\3\2\2\2\u0260\u0262\7\60\2\2\u0261\u0263"+
		"\5\u00b1Y\2\u0262\u0261\3\2\2\2\u0263\u0264\3\2\2\2\u0264\u0262\3\2\2"+
		"\2\u0264\u0265\3\2\2\2\u0265\u0266\3\2\2\2\u0266\u0267\5\u00afX\2\u0267"+
		"\u0269\3\2\2\2\u0268\u0251\3\2\2\2\u0268\u0260\3\2\2\2\u0269\u00ac\3\2"+
		"\2\2\u026a\u026d\5\u00b3Z\2\u026b\u026d\7a\2\2\u026c\u026a\3\2\2\2\u026c"+
		"\u026b\3\2\2\2\u026d\u0273\3\2\2\2\u026e\u0272\5\u00b3Z\2\u026f\u0272"+
		"\5\u00b1Y\2\u0270\u0272\7a\2\2\u0271\u026e\3\2\2\2\u0271\u026f\3\2\2\2"+
		"\u0271\u0270\3\2\2\2\u0272\u0275\3\2\2\2\u0273\u0271\3\2\2\2\u0273\u0274"+
		"\3\2\2\2\u0274\u00ae\3\2\2\2\u0275\u0273\3\2\2\2\u0276\u0278\7G\2\2\u0277"+
		"\u0279\t\34\2\2\u0278\u0277\3\2\2\2\u0278\u0279\3\2\2\2\u0279\u027b\3"+
		"\2\2\2\u027a\u027c\5\u00b1Y\2\u027b\u027a\3\2\2\2\u027c\u027d\3\2\2\2"+
		"\u027d\u027b\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u00b0\3\2\2\2\u027f\u0280"+
		"\t\35\2\2\u0280\u00b2\3\2\2\2\u0281\u0282\t\36\2\2\u0282\u00b4\3\2\2\2"+
		"\u0283\u0285\t\37\2\2\u0284\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0284"+
		"\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\3\2\2\2\u0288\u0289\b[\2\2\u0289"+
		"\u00b6\3\2\2\2\26\2\u019a\u0230\u0232\u023a\u023f\u0245\u024c\u024e\u0253"+
		"\u0259\u025c\u0264\u0268\u026c\u0271\u0273\u0278\u027d\u0286\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}