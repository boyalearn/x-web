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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, DISTINCT=7, SELECT=8, 
		FROM=9, WHERE=10, GROUP=11, ORDER=12, HAVING=13, CASE=14, WHEN=15, THEN=16, 
		ELSE=17, END=18, AND=19, NOT=20, OR=21, BETWEEN=22, IN=23, LIKE=24, ESCAPE=25, 
		EXISTS=26, MINUS=27, ARRAY=28, IS=29, AS=30, GBY=31, OBY=32, BY=33, NULL=34, 
		JOIN=35, INNER=36, LEFT=37, OUTER=38, FULL=39, ON=40, RIGHT=41, EQ=42, 
		NEQ=43, LT=44, LTE=45, GT=46, GTE=47, ASTERISK=48, STRING=49, INTEGER_VALUE=50, 
		DECIMAL_VALUE=51, DOUBLE_VALUE=52, IDENTIFIER=53, WS=54;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "DISTINCT", "SELECT", 
			"FROM", "WHERE", "GROUP", "ORDER", "HAVING", "CASE", "WHEN", "THEN", 
			"ELSE", "END", "AND", "NOT", "OR", "BETWEEN", "IN", "LIKE", "ESCAPE", 
			"EXISTS", "MINUS", "ARRAY", "IS", "AS", "GBY", "OBY", "BY", "NULL", "JOIN", 
			"INNER", "LEFT", "OUTER", "FULL", "ON", "RIGHT", "EQ", "NEQ", "LT", "LTE", 
			"GT", "GTE", "ASTERISK", "STRING", "INTEGER_VALUE", "DECIMAL_VALUE", 
			"DOUBLE_VALUE", "IDENTIFIER", "EXPONENT", "DIGIT", "LETTER", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'.'", "'('", "')'", "'['", "']'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "'='", null, "'<'", "'<='", 
			"'>'", "'>='", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "DISTINCT", "SELECT", "FROM", 
			"WHERE", "GROUP", "ORDER", "HAVING", "CASE", "WHEN", "THEN", "ELSE", 
			"END", "AND", "NOT", "OR", "BETWEEN", "IN", "LIKE", "ESCAPE", "EXISTS", 
			"MINUS", "ARRAY", "IS", "AS", "GBY", "OBY", "BY", "NULL", "JOIN", "INNER", 
			"LEFT", "OUTER", "FULL", "ON", "RIGHT", "EQ", "NEQ", "LT", "LTE", "GT", 
			"GTE", "ASTERISK", "STRING", "INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_VALUE", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u01a6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\3\3\3\3"+
		"\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3"+
		"\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3"+
		"\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3"+
		"$\3$\3%\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\3(\3)\3)\3)\3*\3*\3*\3*\3*\3*\3+\3+\3,\3,\3,\3,\5,\u013b\n,\3-\3"+
		"-\3.\3.\3.\3/\3/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\7\62\u014d"+
		"\n\62\f\62\16\62\u0150\13\62\3\62\3\62\3\63\6\63\u0155\n\63\r\63\16\63"+
		"\u0156\3\64\6\64\u015a\n\64\r\64\16\64\u015b\3\64\3\64\7\64\u0160\n\64"+
		"\f\64\16\64\u0163\13\64\3\64\3\64\6\64\u0167\n\64\r\64\16\64\u0168\5\64"+
		"\u016b\n\64\3\65\6\65\u016e\n\65\r\65\16\65\u016f\3\65\3\65\7\65\u0174"+
		"\n\65\f\65\16\65\u0177\13\65\5\65\u0179\n\65\3\65\3\65\3\65\3\65\6\65"+
		"\u017f\n\65\r\65\16\65\u0180\3\65\3\65\5\65\u0185\n\65\3\66\3\66\5\66"+
		"\u0189\n\66\3\66\3\66\3\66\7\66\u018e\n\66\f\66\16\66\u0191\13\66\3\67"+
		"\3\67\5\67\u0195\n\67\3\67\6\67\u0198\n\67\r\67\16\67\u0199\38\38\39\3"+
		"9\3:\6:\u01a1\n:\r:\16:\u01a2\3:\3:\2\2;\3\3\5\4\7\5\t\6\13\7\r\b\17\t"+
		"\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27"+
		"-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W"+
		"-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m\2o\2q\2s8\3\2\37\4\2FFff\4\2KK"+
		"kk\4\2UUuu\4\2VVvv\4\2PPpp\4\2EEee\4\2GGgg\4\2NNnn\4\2HHhh\4\2TTtt\4\2"+
		"QQqq\4\2OOoo\4\2YYyy\4\2JJjj\4\2IIii\4\2WWww\4\2RRrr\4\2CCcc\4\2XXxx\4"+
		"\2DDdd\4\2MMmm\4\2ZZzz\4\2[[{{\4\2LLll\3\2))\4\2--//\3\2\62;\4\2C\\c|"+
		"\5\2\13\f\17\17\"\"\2\u01b6\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3"+
		"\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2"+
		"\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37"+
		"\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3"+
		"\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2"+
		"\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C"+
		"\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2"+
		"\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2"+
		"\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i"+
		"\3\2\2\2\2k\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5w\3\2\2\2\7y\3\2\2\2\t{\3\2"+
		"\2\2\13}\3\2\2\2\r\177\3\2\2\2\17\u0081\3\2\2\2\21\u008a\3\2\2\2\23\u0091"+
		"\3\2\2\2\25\u0096\3\2\2\2\27\u009c\3\2\2\2\31\u00a2\3\2\2\2\33\u00a8\3"+
		"\2\2\2\35\u00af\3\2\2\2\37\u00b4\3\2\2\2!\u00b9\3\2\2\2#\u00be\3\2\2\2"+
		"%\u00c3\3\2\2\2\'\u00c7\3\2\2\2)\u00cb\3\2\2\2+\u00cf\3\2\2\2-\u00d2\3"+
		"\2\2\2/\u00da\3\2\2\2\61\u00dd\3\2\2\2\63\u00e2\3\2\2\2\65\u00e9\3\2\2"+
		"\2\67\u00f0\3\2\2\29\u00f6\3\2\2\2;\u00fc\3\2\2\2=\u00ff\3\2\2\2?\u0102"+
		"\3\2\2\2A\u0105\3\2\2\2C\u0108\3\2\2\2E\u010b\3\2\2\2G\u0110\3\2\2\2I"+
		"\u0115\3\2\2\2K\u011b\3\2\2\2M\u0120\3\2\2\2O\u0126\3\2\2\2Q\u012b\3\2"+
		"\2\2S\u012e\3\2\2\2U\u0134\3\2\2\2W\u013a\3\2\2\2Y\u013c\3\2\2\2[\u013e"+
		"\3\2\2\2]\u0141\3\2\2\2_\u0143\3\2\2\2a\u0146\3\2\2\2c\u0148\3\2\2\2e"+
		"\u0154\3\2\2\2g\u016a\3\2\2\2i\u0184\3\2\2\2k\u0188\3\2\2\2m\u0192\3\2"+
		"\2\2o\u019b\3\2\2\2q\u019d\3\2\2\2s\u01a0\3\2\2\2uv\7.\2\2v\4\3\2\2\2"+
		"wx\7\60\2\2x\6\3\2\2\2yz\7*\2\2z\b\3\2\2\2{|\7+\2\2|\n\3\2\2\2}~\7]\2"+
		"\2~\f\3\2\2\2\177\u0080\7_\2\2\u0080\16\3\2\2\2\u0081\u0082\t\2\2\2\u0082"+
		"\u0083\t\3\2\2\u0083\u0084\t\4\2\2\u0084\u0085\t\5\2\2\u0085\u0086\t\3"+
		"\2\2\u0086\u0087\t\6\2\2\u0087\u0088\t\7\2\2\u0088\u0089\t\5\2\2\u0089"+
		"\20\3\2\2\2\u008a\u008b\t\4\2\2\u008b\u008c\t\b\2\2\u008c\u008d\t\t\2"+
		"\2\u008d\u008e\t\b\2\2\u008e\u008f\t\7\2\2\u008f\u0090\t\5\2\2\u0090\22"+
		"\3\2\2\2\u0091\u0092\t\n\2\2\u0092\u0093\t\13\2\2\u0093\u0094\t\f\2\2"+
		"\u0094\u0095\t\r\2\2\u0095\24\3\2\2\2\u0096\u0097\t\16\2\2\u0097\u0098"+
		"\t\17\2\2\u0098\u0099\t\b\2\2\u0099\u009a\t\13\2\2\u009a\u009b\t\b\2\2"+
		"\u009b\26\3\2\2\2\u009c\u009d\t\20\2\2\u009d\u009e\t\13\2\2\u009e\u009f"+
		"\t\f\2\2\u009f\u00a0\t\21\2\2\u00a0\u00a1\t\22\2\2\u00a1\30\3\2\2\2\u00a2"+
		"\u00a3\t\f\2\2\u00a3\u00a4\t\13\2\2\u00a4\u00a5\t\2\2\2\u00a5\u00a6\t"+
		"\b\2\2\u00a6\u00a7\t\13\2\2\u00a7\32\3\2\2\2\u00a8\u00a9\t\17\2\2\u00a9"+
		"\u00aa\t\23\2\2\u00aa\u00ab\t\24\2\2\u00ab\u00ac\t\3\2\2\u00ac\u00ad\t"+
		"\6\2\2\u00ad\u00ae\t\20\2\2\u00ae\34\3\2\2\2\u00af\u00b0\t\7\2\2\u00b0"+
		"\u00b1\t\23\2\2\u00b1\u00b2\t\4\2\2\u00b2\u00b3\t\b\2\2\u00b3\36\3\2\2"+
		"\2\u00b4\u00b5\t\16\2\2\u00b5\u00b6\t\17\2\2\u00b6\u00b7\t\b\2\2\u00b7"+
		"\u00b8\t\6\2\2\u00b8 \3\2\2\2\u00b9\u00ba\t\5\2\2\u00ba\u00bb\t\17\2\2"+
		"\u00bb\u00bc\t\b\2\2\u00bc\u00bd\t\6\2\2\u00bd\"\3\2\2\2\u00be\u00bf\t"+
		"\b\2\2\u00bf\u00c0\t\t\2\2\u00c0\u00c1\t\4\2\2\u00c1\u00c2\t\b\2\2\u00c2"+
		"$\3\2\2\2\u00c3\u00c4\t\b\2\2\u00c4\u00c5\t\6\2\2\u00c5\u00c6\t\2\2\2"+
		"\u00c6&\3\2\2\2\u00c7\u00c8\t\23\2\2\u00c8\u00c9\t\6\2\2\u00c9\u00ca\t"+
		"\2\2\2\u00ca(\3\2\2\2\u00cb\u00cc\t\6\2\2\u00cc\u00cd\t\f\2\2\u00cd\u00ce"+
		"\t\5\2\2\u00ce*\3\2\2\2\u00cf\u00d0\t\f\2\2\u00d0\u00d1\t\13\2\2\u00d1"+
		",\3\2\2\2\u00d2\u00d3\t\25\2\2\u00d3\u00d4\t\b\2\2\u00d4\u00d5\t\5\2\2"+
		"\u00d5\u00d6\t\16\2\2\u00d6\u00d7\t\b\2\2\u00d7\u00d8\t\b\2\2\u00d8\u00d9"+
		"\t\6\2\2\u00d9.\3\2\2\2\u00da\u00db\t\3\2\2\u00db\u00dc\t\6\2\2\u00dc"+
		"\60\3\2\2\2\u00dd\u00de\t\t\2\2\u00de\u00df\t\3\2\2\u00df\u00e0\t\26\2"+
		"\2\u00e0\u00e1\t\b\2\2\u00e1\62\3\2\2\2\u00e2\u00e3\t\b\2\2\u00e3\u00e4"+
		"\t\4\2\2\u00e4\u00e5\t\7\2\2\u00e5\u00e6\t\23\2\2\u00e6\u00e7\t\22\2\2"+
		"\u00e7\u00e8\t\b\2\2\u00e8\64\3\2\2\2\u00e9\u00ea\t\b\2\2\u00ea\u00eb"+
		"\t\27\2\2\u00eb\u00ec\t\3\2\2\u00ec\u00ed\t\4\2\2\u00ed\u00ee\t\5\2\2"+
		"\u00ee\u00ef\t\4\2\2\u00ef\66\3\2\2\2\u00f0\u00f1\t\r\2\2\u00f1\u00f2"+
		"\t\3\2\2\u00f2\u00f3\t\6\2\2\u00f3\u00f4\t\21\2\2\u00f4\u00f5\t\4\2\2"+
		"\u00f58\3\2\2\2\u00f6\u00f7\t\23\2\2\u00f7\u00f8\t\13\2\2\u00f8\u00f9"+
		"\t\13\2\2\u00f9\u00fa\t\23\2\2\u00fa\u00fb\t\30\2\2\u00fb:\3\2\2\2\u00fc"+
		"\u00fd\t\3\2\2\u00fd\u00fe\t\4\2\2\u00fe<\3\2\2\2\u00ff\u0100\t\23\2\2"+
		"\u0100\u0101\t\4\2\2\u0101>\3\2\2\2\u0102\u0103\t\25\2\2\u0103\u0104\t"+
		"\30\2\2\u0104@\3\2\2\2\u0105\u0106\t\25\2\2\u0106\u0107\t\30\2\2\u0107"+
		"B\3\2\2\2\u0108\u0109\t\25\2\2\u0109\u010a\t\30\2\2\u010aD\3\2\2\2\u010b"+
		"\u010c\t\6\2\2\u010c\u010d\t\21\2\2\u010d\u010e\t\t\2\2\u010e\u010f\t"+
		"\t\2\2\u010fF\3\2\2\2\u0110\u0111\t\31\2\2\u0111\u0112\t\f\2\2\u0112\u0113"+
		"\t\3\2\2\u0113\u0114\t\6\2\2\u0114H\3\2\2\2\u0115\u0116\t\3\2\2\u0116"+
		"\u0117\t\6\2\2\u0117\u0118\t\6\2\2\u0118\u0119\t\b\2\2\u0119\u011a\t\13"+
		"\2\2\u011aJ\3\2\2\2\u011b\u011c\t\t\2\2\u011c\u011d\t\b\2\2\u011d\u011e"+
		"\t\n\2\2\u011e\u011f\t\5\2\2\u011fL\3\2\2\2\u0120\u0121\t\f\2\2\u0121"+
		"\u0122\t\21\2\2\u0122\u0123\t\5\2\2\u0123\u0124\t\b\2\2\u0124\u0125\t"+
		"\13\2\2\u0125N\3\2\2\2\u0126\u0127\t\n\2\2\u0127\u0128\t\21\2\2\u0128"+
		"\u0129\t\t\2\2\u0129\u012a\t\t\2\2\u012aP\3\2\2\2\u012b\u012c\t\f\2\2"+
		"\u012c\u012d\t\6\2\2\u012dR\3\2\2\2\u012e\u012f\t\13\2\2\u012f\u0130\t"+
		"\3\2\2\u0130\u0131\t\20\2\2\u0131\u0132\t\17\2\2\u0132\u0133\t\5\2\2\u0133"+
		"T\3\2\2\2\u0134\u0135\7?\2\2\u0135V\3\2\2\2\u0136\u0137\7>\2\2\u0137\u013b"+
		"\7@\2\2\u0138\u0139\7#\2\2\u0139\u013b\7?\2\2\u013a\u0136\3\2\2\2\u013a"+
		"\u0138\3\2\2\2\u013bX\3\2\2\2\u013c\u013d\7>\2\2\u013dZ\3\2\2\2\u013e"+
		"\u013f\7>\2\2\u013f\u0140\7?\2\2\u0140\\\3\2\2\2\u0141\u0142\7@\2\2\u0142"+
		"^\3\2\2\2\u0143\u0144\7@\2\2\u0144\u0145\7?\2\2\u0145`\3\2\2\2\u0146\u0147"+
		"\7,\2\2\u0147b\3\2\2\2\u0148\u014e\7)\2\2\u0149\u014d\n\32\2\2\u014a\u014b"+
		"\7)\2\2\u014b\u014d\7)\2\2\u014c\u0149\3\2\2\2\u014c\u014a\3\2\2\2\u014d"+
		"\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0151\3\2"+
		"\2\2\u0150\u014e\3\2\2\2\u0151\u0152\7)\2\2\u0152d\3\2\2\2\u0153\u0155"+
		"\5o8\2\u0154\u0153\3\2\2\2\u0155\u0156\3\2\2\2\u0156\u0154\3\2\2\2\u0156"+
		"\u0157\3\2\2\2\u0157f\3\2\2\2\u0158\u015a\5o8\2\u0159\u0158\3\2\2\2\u015a"+
		"\u015b\3\2\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2"+
		"\2\2\u015d\u0161\7\60\2\2\u015e\u0160\5o8\2\u015f\u015e\3\2\2\2\u0160"+
		"\u0163\3\2\2\2\u0161\u015f\3\2\2\2\u0161\u0162\3\2\2\2\u0162\u016b\3\2"+
		"\2\2\u0163\u0161\3\2\2\2\u0164\u0166\7\60\2\2\u0165\u0167\5o8\2\u0166"+
		"\u0165\3\2\2\2\u0167\u0168\3\2\2\2\u0168\u0166\3\2\2\2\u0168\u0169\3\2"+
		"\2\2\u0169\u016b\3\2\2\2\u016a\u0159\3\2\2\2\u016a\u0164\3\2\2\2\u016b"+
		"h\3\2\2\2\u016c\u016e\5o8\2\u016d\u016c\3\2\2\2\u016e\u016f\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u0178\3\2\2\2\u0171\u0175\7\60"+
		"\2\2\u0172\u0174\5o8\2\u0173\u0172\3\2\2\2\u0174\u0177\3\2\2\2\u0175\u0173"+
		"\3\2\2\2\u0175\u0176\3\2\2\2\u0176\u0179\3\2\2\2\u0177\u0175\3\2\2\2\u0178"+
		"\u0171\3\2\2\2\u0178\u0179\3\2\2\2\u0179\u017a\3\2\2\2\u017a\u017b\5m"+
		"\67\2\u017b\u0185\3\2\2\2\u017c\u017e\7\60\2\2\u017d\u017f\5o8\2\u017e"+
		"\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u017e\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0182\3\2\2\2\u0182\u0183\5m\67\2\u0183\u0185\3\2\2\2\u0184"+
		"\u016d\3\2\2\2\u0184\u017c\3\2\2\2\u0185j\3\2\2\2\u0186\u0189\5q9\2\u0187"+
		"\u0189\7a\2\2\u0188\u0186\3\2\2\2\u0188\u0187\3\2\2\2\u0189\u018f\3\2"+
		"\2\2\u018a\u018e\5q9\2\u018b\u018e\5o8\2\u018c\u018e\7a\2\2\u018d\u018a"+
		"\3\2\2\2\u018d\u018b\3\2\2\2\u018d\u018c\3\2\2\2\u018e\u0191\3\2\2\2\u018f"+
		"\u018d\3\2\2\2\u018f\u0190\3\2\2\2\u0190l\3\2\2\2\u0191\u018f\3\2\2\2"+
		"\u0192\u0194\7G\2\2\u0193\u0195\t\33\2\2\u0194\u0193\3\2\2\2\u0194\u0195"+
		"\3\2\2\2\u0195\u0197\3\2\2\2\u0196\u0198\5o8\2\u0197\u0196\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019an\3\2\2\2"+
		"\u019b\u019c\t\34\2\2\u019cp\3\2\2\2\u019d\u019e\t\35\2\2\u019er\3\2\2"+
		"\2\u019f\u01a1\t\36\2\2\u01a0\u019f\3\2\2\2\u01a1\u01a2\3\2\2\2\u01a2"+
		"\u01a0\3\2\2\2\u01a2\u01a3\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a4\u01a5\b:"+
		"\2\2\u01a5t\3\2\2\2\26\2\u013a\u014c\u014e\u0156\u015b\u0161\u0168\u016a"+
		"\u016f\u0175\u0178\u0180\u0184\u0188\u018d\u018f\u0194\u0199\u01a2\3\2"+
		"\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}