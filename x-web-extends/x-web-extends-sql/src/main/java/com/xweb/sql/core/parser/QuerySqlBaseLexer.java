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
		LEFT=35, OUTER=36, FULL=37, ON=38, RIGHT=39, EQ=40, NEQ=41, LT=42, LTE=43, 
		GT=44, GTE=45, LIMIT=46, FETCH=47, FIRST=48, NEXT=49, ROW=50, ROWS=51, 
		ONLY=52, WITH=53, TIES=54, UNION=55, ALL=56, INTERVAL=57, AT=58, TIME=59, 
		ZONE=60, TO=61, YEAR=62, MONTH=63, DAY=64, HOUR=65, MINUTE=66, SECOND=67, 
		PLUS=68, MINUS=69, ASTERISK=70, SLASH=71, PERCENT=72, CONCAT=73, QUESTION_MARK=74, 
		D_ANT=75, STRING=76, INTEGER_VALUE=77, DECIMAL_VALUE=78, DOUBLE_VALUE=79, 
		IDENTIFIER=80, WS=81;
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
			"OUTER", "FULL", "ON", "RIGHT", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", 
			"LIMIT", "FETCH", "FIRST", "NEXT", "ROW", "ROWS", "ONLY", "WITH", "TIES", 
			"UNION", "ALL", "INTERVAL", "AT", "TIME", "ZONE", "TO", "YEAR", "MONTH", 
			"DAY", "HOUR", "MINUTE", "SECOND", "PLUS", "MINUS", "ASTERISK", "SLASH", 
			"PERCENT", "CONCAT", "QUESTION_MARK", "D_ANT", "STRING", "INTEGER_VALUE", 
			"DECIMAL_VALUE", "DOUBLE_VALUE", "IDENTIFIER", "EXPONENT", "DIGIT", "LETTER", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'.'", "'('", "')'", "'['", "']'", "'`'", null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'='", null, "'<'", "'<='", "'>'", "'>='", 
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
			"OUTER", "FULL", "ON", "RIGHT", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", 
			"LIMIT", "FETCH", "FIRST", "NEXT", "ROW", "ROWS", "ONLY", "WITH", "TIES", 
			"UNION", "ALL", "INTERVAL", "AT", "TIME", "ZONE", "TO", "YEAR", "MONTH", 
			"DAY", "HOUR", "MINUTE", "SECOND", "PLUS", "MINUS", "ASTERISK", "SLASH", 
			"PERCENT", "CONCAT", "QUESTION_MARK", "D_ANT", "STRING", "INTEGER_VALUE", 
			"DECIMAL_VALUE", "DOUBLE_VALUE", "IDENTIFIER", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2S\u0256\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3"+
		"\20\3\20\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3"+
		"\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3#\3#\3"+
		"#\3#\3#\3#\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'"+
		"\3(\3(\3(\3(\3(\3(\3)\3)\3*\3*\3*\3*\5*\u0167\n*\3+\3+\3,\3,\3,\3-\3-"+
		"\3.\3.\3.\3/\3/\3/\3/\3/\3/\3\60\3\60\3\60\3\60\3\60\3\60\3\61\3\61\3"+
		"\61\3\61\3\61\3\61\3\62\3\62\3\62\3\62\3\62\3\63\3\63\3\63\3\63\3\64\3"+
		"\64\3\64\3\64\3\64\3\65\3\65\3\65\3\65\3\65\3\66\3\66\3\66\3\66\3\66\3"+
		"\67\3\67\3\67\3\67\3\67\38\38\38\38\38\38\39\39\39\39\3:\3:\3:\3:\3:\3"+
		":\3:\3:\3:\3;\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3=\3=\3>\3>\3>\3?\3?\3?\3"+
		"?\3?\3@\3@\3@\3@\3@\3@\3A\3A\3A\3A\3B\3B\3B\3B\3B\3C\3C\3C\3C\3C\3C\3"+
		"C\3D\3D\3D\3D\3D\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3J\3K\3K\3"+
		"L\3L\3L\3M\3M\3M\3M\7M\u01fd\nM\fM\16M\u0200\13M\3M\3M\3N\6N\u0205\nN"+
		"\rN\16N\u0206\3O\6O\u020a\nO\rO\16O\u020b\3O\3O\7O\u0210\nO\fO\16O\u0213"+
		"\13O\3O\3O\6O\u0217\nO\rO\16O\u0218\5O\u021b\nO\3P\6P\u021e\nP\rP\16P"+
		"\u021f\3P\3P\7P\u0224\nP\fP\16P\u0227\13P\5P\u0229\nP\3P\3P\3P\3P\6P\u022f"+
		"\nP\rP\16P\u0230\3P\3P\5P\u0235\nP\3Q\3Q\5Q\u0239\nQ\3Q\3Q\3Q\7Q\u023e"+
		"\nQ\fQ\16Q\u0241\13Q\3R\3R\5R\u0245\nR\3R\6R\u0248\nR\rR\16R\u0249\3S"+
		"\3S\3T\3T\3U\6U\u0251\nU\rU\16U\u0252\3U\3U\2\2V\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O"+
		")Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;u<w=y>{?}@\177A\u0081"+
		"B\u0083C\u0085D\u0087E\u0089F\u008bG\u008dH\u008fI\u0091J\u0093K\u0095"+
		"L\u0097M\u0099N\u009bO\u009dP\u009fQ\u00a1R\u00a3\2\u00a5\2\u00a7\2\u00a9"+
		"S\3\2 \4\2FFff\4\2KKkk\4\2UUuu\4\2VVvv\4\2PPpp\4\2EEee\4\2GGgg\4\2NNn"+
		"n\4\2HHhh\4\2TTtt\4\2QQqq\4\2OOoo\4\2YYyy\4\2JJjj\4\2IIii\4\2WWww\4\2"+
		"RRrr\4\2CCcc\4\2XXxx\4\2DDdd\4\2MMmm\4\2ZZzz\4\2[[{{\4\2LLll\4\2\\\\|"+
		"|\3\2))\4\2--//\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u0266\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3"+
		"\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2"+
		"\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2"+
		"\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3"+
		"\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2"+
		"\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2"+
		"W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3"+
		"\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\2o\3\2\2"+
		"\2\2q\3\2\2\2\2s\3\2\2\2\2u\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2"+
		"}\3\2\2\2\2\177\3\2\2\2\2\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2"+
		"\2\2\u0087\3\2\2\2\2\u0089\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f"+
		"\3\2\2\2\2\u0091\3\2\2\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2"+
		"\2\2\u0099\3\2\2\2\2\u009b\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1"+
		"\3\2\2\2\2\u00a9\3\2\2\2\3\u00ab\3\2\2\2\5\u00ad\3\2\2\2\7\u00af\3\2\2"+
		"\2\t\u00b1\3\2\2\2\13\u00b3\3\2\2\2\r\u00b5\3\2\2\2\17\u00b7\3\2\2\2\21"+
		"\u00b9\3\2\2\2\23\u00c2\3\2\2\2\25\u00c9\3\2\2\2\27\u00ce\3\2\2\2\31\u00d4"+
		"\3\2\2\2\33\u00da\3\2\2\2\35\u00e0\3\2\2\2\37\u00e7\3\2\2\2!\u00ec\3\2"+
		"\2\2#\u00f1\3\2\2\2%\u00f6\3\2\2\2\'\u00fb\3\2\2\2)\u00ff\3\2\2\2+\u0103"+
		"\3\2\2\2-\u0107\3\2\2\2/\u010a\3\2\2\2\61\u0112\3\2\2\2\63\u0115\3\2\2"+
		"\2\65\u011a\3\2\2\2\67\u0121\3\2\2\29\u0128\3\2\2\2;\u012e\3\2\2\2=\u0131"+
		"\3\2\2\2?\u0134\3\2\2\2A\u0137\3\2\2\2C\u013c\3\2\2\2E\u0141\3\2\2\2G"+
		"\u0147\3\2\2\2I\u014c\3\2\2\2K\u0152\3\2\2\2M\u0157\3\2\2\2O\u015a\3\2"+
		"\2\2Q\u0160\3\2\2\2S\u0166\3\2\2\2U\u0168\3\2\2\2W\u016a\3\2\2\2Y\u016d"+
		"\3\2\2\2[\u016f\3\2\2\2]\u0172\3\2\2\2_\u0178\3\2\2\2a\u017e\3\2\2\2c"+
		"\u0184\3\2\2\2e\u0189\3\2\2\2g\u018d\3\2\2\2i\u0192\3\2\2\2k\u0197\3\2"+
		"\2\2m\u019c\3\2\2\2o\u01a1\3\2\2\2q\u01a7\3\2\2\2s\u01ab\3\2\2\2u\u01b4"+
		"\3\2\2\2w\u01b7\3\2\2\2y\u01bc\3\2\2\2{\u01c1\3\2\2\2}\u01c4\3\2\2\2\177"+
		"\u01c9\3\2\2\2\u0081\u01cf\3\2\2\2\u0083\u01d3\3\2\2\2\u0085\u01d8\3\2"+
		"\2\2\u0087\u01df\3\2\2\2\u0089\u01e6\3\2\2\2\u008b\u01e8\3\2\2\2\u008d"+
		"\u01ea\3\2\2\2\u008f\u01ec\3\2\2\2\u0091\u01ee\3\2\2\2\u0093\u01f0\3\2"+
		"\2\2\u0095\u01f3\3\2\2\2\u0097\u01f5\3\2\2\2\u0099\u01f8\3\2\2\2\u009b"+
		"\u0204\3\2\2\2\u009d\u021a\3\2\2\2\u009f\u0234\3\2\2\2\u00a1\u0238\3\2"+
		"\2\2\u00a3\u0242\3\2\2\2\u00a5\u024b\3\2\2\2\u00a7\u024d\3\2\2\2\u00a9"+
		"\u0250\3\2\2\2\u00ab\u00ac\7.\2\2\u00ac\4\3\2\2\2\u00ad\u00ae\7\60\2\2"+
		"\u00ae\6\3\2\2\2\u00af\u00b0\7*\2\2\u00b0\b\3\2\2\2\u00b1\u00b2\7+\2\2"+
		"\u00b2\n\3\2\2\2\u00b3\u00b4\7]\2\2\u00b4\f\3\2\2\2\u00b5\u00b6\7_\2\2"+
		"\u00b6\16\3\2\2\2\u00b7\u00b8\7b\2\2\u00b8\20\3\2\2\2\u00b9\u00ba\t\2"+
		"\2\2\u00ba\u00bb\t\3\2\2\u00bb\u00bc\t\4\2\2\u00bc\u00bd\t\5\2\2\u00bd"+
		"\u00be\t\3\2\2\u00be\u00bf\t\6\2\2\u00bf\u00c0\t\7\2\2\u00c0\u00c1\t\5"+
		"\2\2\u00c1\22\3\2\2\2\u00c2\u00c3\t\4\2\2\u00c3\u00c4\t\b\2\2\u00c4\u00c5"+
		"\t\t\2\2\u00c5\u00c6\t\b\2\2\u00c6\u00c7\t\7\2\2\u00c7\u00c8\t\5\2\2\u00c8"+
		"\24\3\2\2\2\u00c9\u00ca\t\n\2\2\u00ca\u00cb\t\13\2\2\u00cb\u00cc\t\f\2"+
		"\2\u00cc\u00cd\t\r\2\2\u00cd\26\3\2\2\2\u00ce\u00cf\t\16\2\2\u00cf\u00d0"+
		"\t\17\2\2\u00d0\u00d1\t\b\2\2\u00d1\u00d2\t\13\2\2\u00d2\u00d3\t\b\2\2"+
		"\u00d3\30\3\2\2\2\u00d4\u00d5\t\20\2\2\u00d5\u00d6\t\13\2\2\u00d6\u00d7"+
		"\t\f\2\2\u00d7\u00d8\t\21\2\2\u00d8\u00d9\t\22\2\2\u00d9\32\3\2\2\2\u00da"+
		"\u00db\t\f\2\2\u00db\u00dc\t\13\2\2\u00dc\u00dd\t\2\2\2\u00dd\u00de\t"+
		"\b\2\2\u00de\u00df\t\13\2\2\u00df\34\3\2\2\2\u00e0\u00e1\t\17\2\2\u00e1"+
		"\u00e2\t\23\2\2\u00e2\u00e3\t\24\2\2\u00e3\u00e4\t\3\2\2\u00e4\u00e5\t"+
		"\6\2\2\u00e5\u00e6\t\20\2\2\u00e6\36\3\2\2\2\u00e7\u00e8\t\7\2\2\u00e8"+
		"\u00e9\t\23\2\2\u00e9\u00ea\t\4\2\2\u00ea\u00eb\t\b\2\2\u00eb \3\2\2\2"+
		"\u00ec\u00ed\t\16\2\2\u00ed\u00ee\t\17\2\2\u00ee\u00ef\t\b\2\2\u00ef\u00f0"+
		"\t\6\2\2\u00f0\"\3\2\2\2\u00f1\u00f2\t\5\2\2\u00f2\u00f3\t\17\2\2\u00f3"+
		"\u00f4\t\b\2\2\u00f4\u00f5\t\6\2\2\u00f5$\3\2\2\2\u00f6\u00f7\t\b\2\2"+
		"\u00f7\u00f8\t\t\2\2\u00f8\u00f9\t\4\2\2\u00f9\u00fa\t\b\2\2\u00fa&\3"+
		"\2\2\2\u00fb\u00fc\t\b\2\2\u00fc\u00fd\t\6\2\2\u00fd\u00fe\t\2\2\2\u00fe"+
		"(\3\2\2\2\u00ff\u0100\t\23\2\2\u0100\u0101\t\6\2\2\u0101\u0102\t\2\2\2"+
		"\u0102*\3\2\2\2\u0103\u0104\t\6\2\2\u0104\u0105\t\f\2\2\u0105\u0106\t"+
		"\5\2\2\u0106,\3\2\2\2\u0107\u0108\t\f\2\2\u0108\u0109\t\13\2\2\u0109."+
		"\3\2\2\2\u010a\u010b\t\25\2\2\u010b\u010c\t\b\2\2\u010c\u010d\t\5\2\2"+
		"\u010d\u010e\t\16\2\2\u010e\u010f\t\b\2\2\u010f\u0110\t\b\2\2\u0110\u0111"+
		"\t\6\2\2\u0111\60\3\2\2\2\u0112\u0113\t\3\2\2\u0113\u0114\t\6\2\2\u0114"+
		"\62\3\2\2\2\u0115\u0116\t\t\2\2\u0116\u0117\t\3\2\2\u0117\u0118\t\26\2"+
		"\2\u0118\u0119\t\b\2\2\u0119\64\3\2\2\2\u011a\u011b\t\b\2\2\u011b\u011c"+
		"\t\4\2\2\u011c\u011d\t\7\2\2\u011d\u011e\t\23\2\2\u011e\u011f\t\22\2\2"+
		"\u011f\u0120\t\b\2\2\u0120\66\3\2\2\2\u0121\u0122\t\b\2\2\u0122\u0123"+
		"\t\27\2\2\u0123\u0124\t\3\2\2\u0124\u0125\t\4\2\2\u0125\u0126\t\5\2\2"+
		"\u0126\u0127\t\4\2\2\u01278\3\2\2\2\u0128\u0129\t\23\2\2\u0129\u012a\t"+
		"\13\2\2\u012a\u012b\t\13\2\2\u012b\u012c\t\23\2\2\u012c\u012d\t\30\2\2"+
		"\u012d:\3\2\2\2\u012e\u012f\t\3\2\2\u012f\u0130\t\4\2\2\u0130<\3\2\2\2"+
		"\u0131\u0132\t\23\2\2\u0132\u0133\t\4\2\2\u0133>\3\2\2\2\u0134\u0135\t"+
		"\25\2\2\u0135\u0136\t\30\2\2\u0136@\3\2\2\2\u0137\u0138\t\6\2\2\u0138"+
		"\u0139\t\21\2\2\u0139\u013a\t\t\2\2\u013a\u013b\t\t\2\2\u013bB\3\2\2\2"+
		"\u013c\u013d\t\31\2\2\u013d\u013e\t\f\2\2\u013e\u013f\t\3\2\2\u013f\u0140"+
		"\t\6\2\2\u0140D\3\2\2\2\u0141\u0142\t\3\2\2\u0142\u0143\t\6\2\2\u0143"+
		"\u0144\t\6\2\2\u0144\u0145\t\b\2\2\u0145\u0146\t\13\2\2\u0146F\3\2\2\2"+
		"\u0147\u0148\t\t\2\2\u0148\u0149\t\b\2\2\u0149\u014a\t\n\2\2\u014a\u014b"+
		"\t\5\2\2\u014bH\3\2\2\2\u014c\u014d\t\f\2\2\u014d\u014e\t\21\2\2\u014e"+
		"\u014f\t\5\2\2\u014f\u0150\t\b\2\2\u0150\u0151\t\13\2\2\u0151J\3\2\2\2"+
		"\u0152\u0153\t\n\2\2\u0153\u0154\t\21\2\2\u0154\u0155\t\t\2\2\u0155\u0156"+
		"\t\t\2\2\u0156L\3\2\2\2\u0157\u0158\t\f\2\2\u0158\u0159\t\6\2\2\u0159"+
		"N\3\2\2\2\u015a\u015b\t\13\2\2\u015b\u015c\t\3\2\2\u015c\u015d\t\20\2"+
		"\2\u015d\u015e\t\17\2\2\u015e\u015f\t\5\2\2\u015fP\3\2\2\2\u0160\u0161"+
		"\7?\2\2\u0161R\3\2\2\2\u0162\u0163\7>\2\2\u0163\u0167\7@\2\2\u0164\u0165"+
		"\7#\2\2\u0165\u0167\7?\2\2\u0166\u0162\3\2\2\2\u0166\u0164\3\2\2\2\u0167"+
		"T\3\2\2\2\u0168\u0169\7>\2\2\u0169V\3\2\2\2\u016a\u016b\7>\2\2\u016b\u016c"+
		"\7?\2\2\u016cX\3\2\2\2\u016d\u016e\7@\2\2\u016eZ\3\2\2\2\u016f\u0170\7"+
		"@\2\2\u0170\u0171\7?\2\2\u0171\\\3\2\2\2\u0172\u0173\t\t\2\2\u0173\u0174"+
		"\t\3\2\2\u0174\u0175\t\r\2\2\u0175\u0176\t\3\2\2\u0176\u0177\t\5\2\2\u0177"+
		"^\3\2\2\2\u0178\u0179\t\n\2\2\u0179\u017a\t\b\2\2\u017a\u017b\t\5\2\2"+
		"\u017b\u017c\t\7\2\2\u017c\u017d\t\17\2\2\u017d`\3\2\2\2\u017e\u017f\t"+
		"\n\2\2\u017f\u0180\t\3\2\2\u0180\u0181\t\13\2\2\u0181\u0182\t\4\2\2\u0182"+
		"\u0183\t\5\2\2\u0183b\3\2\2\2\u0184\u0185\t\6\2\2\u0185\u0186\t\b\2\2"+
		"\u0186\u0187\t\27\2\2\u0187\u0188\t\5\2\2\u0188d\3\2\2\2\u0189\u018a\t"+
		"\13\2\2\u018a\u018b\t\f\2\2\u018b\u018c\t\16\2\2\u018cf\3\2\2\2\u018d"+
		"\u018e\t\13\2\2\u018e\u018f\t\f\2\2\u018f\u0190\t\16\2\2\u0190\u0191\t"+
		"\4\2\2\u0191h\3\2\2\2\u0192\u0193\t\f\2\2\u0193\u0194\t\6\2\2\u0194\u0195"+
		"\t\t\2\2\u0195\u0196\t\30\2\2\u0196j\3\2\2\2\u0197\u0198\t\16\2\2\u0198"+
		"\u0199\t\3\2\2\u0199\u019a\t\5\2\2\u019a\u019b\t\17\2\2\u019bl\3\2\2\2"+
		"\u019c\u019d\t\5\2\2\u019d\u019e\t\3\2\2\u019e\u019f\t\b\2\2\u019f\u01a0"+
		"\t\4\2\2\u01a0n\3\2\2\2\u01a1\u01a2\t\21\2\2\u01a2\u01a3\t\6\2\2\u01a3"+
		"\u01a4\t\3\2\2\u01a4\u01a5\t\f\2\2\u01a5\u01a6\t\6\2\2\u01a6p\3\2\2\2"+
		"\u01a7\u01a8\t\23\2\2\u01a8\u01a9\t\t\2\2\u01a9\u01aa\t\t\2\2\u01aar\3"+
		"\2\2\2\u01ab\u01ac\t\3\2\2\u01ac\u01ad\t\6\2\2\u01ad\u01ae\t\5\2\2\u01ae"+
		"\u01af\t\b\2\2\u01af\u01b0\t\13\2\2\u01b0\u01b1\t\24\2\2\u01b1\u01b2\t"+
		"\23\2\2\u01b2\u01b3\t\t\2\2\u01b3t\3\2\2\2\u01b4\u01b5\t\23\2\2\u01b5"+
		"\u01b6\t\5\2\2\u01b6v\3\2\2\2\u01b7\u01b8\t\5\2\2\u01b8\u01b9\t\3\2\2"+
		"\u01b9\u01ba\t\r\2\2\u01ba\u01bb\t\b\2\2\u01bbx\3\2\2\2\u01bc\u01bd\t"+
		"\32\2\2\u01bd\u01be\t\f\2\2\u01be\u01bf\t\6\2\2\u01bf\u01c0\t\b\2\2\u01c0"+
		"z\3\2\2\2\u01c1\u01c2\t\5\2\2\u01c2\u01c3\t\f\2\2\u01c3|\3\2\2\2\u01c4"+
		"\u01c5\t\30\2\2\u01c5\u01c6\t\b\2\2\u01c6\u01c7\t\23\2\2\u01c7\u01c8\t"+
		"\13\2\2\u01c8~\3\2\2\2\u01c9\u01ca\t\r\2\2\u01ca\u01cb\t\f\2\2\u01cb\u01cc"+
		"\t\6\2\2\u01cc\u01cd\t\5\2\2\u01cd\u01ce\t\17\2\2\u01ce\u0080\3\2\2\2"+
		"\u01cf\u01d0\t\2\2\2\u01d0\u01d1\t\23\2\2\u01d1\u01d2\t\30\2\2\u01d2\u0082"+
		"\3\2\2\2\u01d3\u01d4\t\17\2\2\u01d4\u01d5\t\f\2\2\u01d5\u01d6\t\21\2\2"+
		"\u01d6\u01d7\t\13\2\2\u01d7\u0084\3\2\2\2\u01d8\u01d9\t\r\2\2\u01d9\u01da"+
		"\t\3\2\2\u01da\u01db\t\6\2\2\u01db\u01dc\t\21\2\2\u01dc\u01dd\t\5\2\2"+
		"\u01dd\u01de\t\b\2\2\u01de\u0086\3\2\2\2\u01df\u01e0\t\4\2\2\u01e0\u01e1"+
		"\t\b\2\2\u01e1\u01e2\t\7\2\2\u01e2\u01e3\t\f\2\2\u01e3\u01e4\t\6\2\2\u01e4"+
		"\u01e5\t\2\2\2\u01e5\u0088\3\2\2\2\u01e6\u01e7\7-\2\2\u01e7\u008a\3\2"+
		"\2\2\u01e8\u01e9\7/\2\2\u01e9\u008c\3\2\2\2\u01ea\u01eb\7,\2\2\u01eb\u008e"+
		"\3\2\2\2\u01ec\u01ed\7\61\2\2\u01ed\u0090\3\2\2\2\u01ee\u01ef\7\'\2\2"+
		"\u01ef\u0092\3\2\2\2\u01f0\u01f1\7~\2\2\u01f1\u01f2\7~\2\2\u01f2\u0094"+
		"\3\2\2\2\u01f3\u01f4\7A\2\2\u01f4\u0096\3\2\2\2\u01f5\u01f6\7B\2\2\u01f6"+
		"\u01f7\7B\2\2\u01f7\u0098\3\2\2\2\u01f8\u01fe\7)\2\2\u01f9\u01fd\n\33"+
		"\2\2\u01fa\u01fb\7)\2\2\u01fb\u01fd\7)\2\2\u01fc\u01f9\3\2\2\2\u01fc\u01fa"+
		"\3\2\2\2\u01fd\u0200\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff"+
		"\u0201\3\2\2\2\u0200\u01fe\3\2\2\2\u0201\u0202\7)\2\2\u0202\u009a\3\2"+
		"\2\2\u0203\u0205\5\u00a5S\2\u0204\u0203\3\2\2\2\u0205\u0206\3\2\2\2\u0206"+
		"\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u009c\3\2\2\2\u0208\u020a\5\u00a5"+
		"S\2\u0209\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0209\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020c\u020d\3\2\2\2\u020d\u0211\7\60\2\2\u020e\u0210\5"+
		"\u00a5S\2\u020f\u020e\3\2\2\2\u0210\u0213\3\2\2\2\u0211\u020f\3\2\2\2"+
		"\u0211\u0212\3\2\2\2\u0212\u021b\3\2\2\2\u0213\u0211\3\2\2\2\u0214\u0216"+
		"\7\60\2\2\u0215\u0217\5\u00a5S\2\u0216\u0215\3\2\2\2\u0217\u0218\3\2\2"+
		"\2\u0218\u0216\3\2\2\2\u0218\u0219\3\2\2\2\u0219\u021b\3\2\2\2\u021a\u0209"+
		"\3\2\2\2\u021a\u0214\3\2\2\2\u021b\u009e\3\2\2\2\u021c\u021e\5\u00a5S"+
		"\2\u021d\u021c\3\2\2\2\u021e\u021f\3\2\2\2\u021f\u021d\3\2\2\2\u021f\u0220"+
		"\3\2\2\2\u0220\u0228\3\2\2\2\u0221\u0225\7\60\2\2\u0222\u0224\5\u00a5"+
		"S\2\u0223\u0222\3\2\2\2\u0224\u0227\3\2\2\2\u0225\u0223\3\2\2\2\u0225"+
		"\u0226\3\2\2\2\u0226\u0229\3\2\2\2\u0227\u0225\3\2\2\2\u0228\u0221\3\2"+
		"\2\2\u0228\u0229\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022b\5\u00a3R\2\u022b"+
		"\u0235\3\2\2\2\u022c\u022e\7\60\2\2\u022d\u022f\5\u00a5S\2\u022e\u022d"+
		"\3\2\2\2\u022f\u0230\3\2\2\2\u0230\u022e\3\2\2\2\u0230\u0231\3\2\2\2\u0231"+
		"\u0232\3\2\2\2\u0232\u0233\5\u00a3R\2\u0233\u0235\3\2\2\2\u0234\u021d"+
		"\3\2\2\2\u0234\u022c\3\2\2\2\u0235\u00a0\3\2\2\2\u0236\u0239\5\u00a7T"+
		"\2\u0237\u0239\7a\2\2\u0238\u0236\3\2\2\2\u0238\u0237\3\2\2\2\u0239\u023f"+
		"\3\2\2\2\u023a\u023e\5\u00a7T\2\u023b\u023e\5\u00a5S\2\u023c\u023e\7a"+
		"\2\2\u023d\u023a\3\2\2\2\u023d\u023b\3\2\2\2\u023d\u023c\3\2\2\2\u023e"+
		"\u0241\3\2\2\2\u023f\u023d\3\2\2\2\u023f\u0240\3\2\2\2\u0240\u00a2\3\2"+
		"\2\2\u0241\u023f\3\2\2\2\u0242\u0244\7G\2\2\u0243\u0245\t\34\2\2\u0244"+
		"\u0243\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0247\3\2\2\2\u0246\u0248\5\u00a5"+
		"S\2\u0247\u0246\3\2\2\2\u0248\u0249\3\2\2\2\u0249\u0247\3\2\2\2\u0249"+
		"\u024a\3\2\2\2\u024a\u00a4\3\2\2\2\u024b\u024c\t\35\2\2\u024c\u00a6\3"+
		"\2\2\2\u024d\u024e\t\36\2\2\u024e\u00a8\3\2\2\2\u024f\u0251\t\37\2\2\u0250"+
		"\u024f\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0250\3\2\2\2\u0252\u0253\3\2"+
		"\2\2\u0253\u0254\3\2\2\2\u0254\u0255\bU\2\2\u0255\u00aa\3\2\2\2\26\2\u0166"+
		"\u01fc\u01fe\u0206\u020b\u0211\u0218\u021a\u021f\u0225\u0228\u0230\u0234"+
		"\u0238\u023d\u023f\u0244\u0249\u0252\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}