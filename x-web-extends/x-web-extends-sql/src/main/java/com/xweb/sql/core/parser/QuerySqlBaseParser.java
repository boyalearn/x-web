// Generated from com\xweb\sql\core\parser\QuerySqlBase.g4 by ANTLR 4.9.1
package com.xweb.sql.core.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class QuerySqlBaseParser extends Parser {
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
	public static final int
		RULE_statement = 0, RULE_query = 1, RULE_unionExpress = 2, RULE_queryItem = 3, 
		RULE_queryNoWith = 4, RULE_queryPrimary = 5, RULE_orderByPart = 6, RULE_limitRowCount = 7, 
		RULE_rowCount = 8, RULE_setQuantifier = 9, RULE_selectItem = 10, RULE_tableExpression = 11, 
		RULE_tableExpressionExpress = 12, RULE_joinType = 13, RULE_joinCondition = 14, 
		RULE_simpleTableExpression = 15, RULE_aliasedTableExpression = 16, RULE_tableExpressPrimary = 17, 
		RULE_unionTableExpress = 18, RULE_groupByExpression = 19, RULE_whereExpression = 20, 
		RULE_orderByExpression = 21, RULE_havingExpression = 22, RULE_expression = 23, 
		RULE_booleanExpression = 24, RULE_predicate = 25, RULE_valueExpression = 26, 
		RULE_primaryExpression = 27, RULE_whenClause = 28, RULE_qualifiedName = 29, 
		RULE_comparisonOperator = 30, RULE_identifier = 31, RULE_string = 32, 
		RULE_number = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "query", "unionExpress", "queryItem", "queryNoWith", "queryPrimary", 
			"orderByPart", "limitRowCount", "rowCount", "setQuantifier", "selectItem", 
			"tableExpression", "tableExpressionExpress", "joinType", "joinCondition", 
			"simpleTableExpression", "aliasedTableExpression", "tableExpressPrimary", 
			"unionTableExpress", "groupByExpression", "whereExpression", "orderByExpression", 
			"havingExpression", "expression", "booleanExpression", "predicate", "valueExpression", 
			"primaryExpression", "whenClause", "qualifiedName", "comparisonOperator", 
			"identifier", "string", "number"
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

	@Override
	public String getGrammarFileName() { return "QuerySqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public QuerySqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SelectContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		try {
			_localctx = new SelectContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			query();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryItemContext queryItem() {
			return getRuleContext(QueryItemContext.class,0);
		}
		public List<UnionExpressContext> unionExpress() {
			return getRuleContexts(UnionExpressContext.class);
		}
		public UnionExpressContext unionExpress(int i) {
			return getRuleContext(UnionExpressContext.class,i);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_query);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			queryItem();
			setState(74);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(71);
					unionExpress();
					}
					} 
				}
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionExpressContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(QuerySqlBaseParser.UNION, 0); }
		public QueryItemContext queryItem() {
			return getRuleContext(QueryItemContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public UnionExpressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionExpress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterUnionExpress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitUnionExpress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitUnionExpress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionExpressContext unionExpress() throws RecognitionException {
		UnionExpressContext _localctx = new UnionExpressContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_unionExpress);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(UNION);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(78);
				setQuantifier();
				}
			}

			setState(81);
			queryItem();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryItemContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public QueryItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterQueryItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitQueryItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitQueryItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryItemContext queryItem() throws RecognitionException {
		QueryItemContext _localctx = new QueryItemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_queryItem);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			queryNoWith();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryNoWithContext extends ParserRuleContext {
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
	 
		public QueryNoWithContext() { }
		public void copyFrom(QueryNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SingleSelectContext extends QueryNoWithContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public SingleSelectContext(QueryNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterSingleSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitSingleSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitSingleSelect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_queryNoWith);
		try {
			_localctx = new SingleSelectContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			queryPrimary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public WhereExpressionContext where;
		public HavingExpressionContext having;
		public LimitRowCountContext limit;
		public RowCountContext fetchFirst;
		public TerminalNode SELECT() { return getToken(QuerySqlBaseParser.SELECT, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(QuerySqlBaseParser.FROM, 0); }
		public List<TableExpressionContext> tableExpression() {
			return getRuleContexts(TableExpressionContext.class);
		}
		public TableExpressionContext tableExpression(int i) {
			return getRuleContext(TableExpressionContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(QuerySqlBaseParser.WHERE, 0); }
		public TerminalNode GROUP() { return getToken(QuerySqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(QuerySqlBaseParser.BY, 0); }
		public List<GroupByExpressionContext> groupByExpression() {
			return getRuleContexts(GroupByExpressionContext.class);
		}
		public GroupByExpressionContext groupByExpression(int i) {
			return getRuleContext(GroupByExpressionContext.class,i);
		}
		public OrderByPartContext orderByPart() {
			return getRuleContext(OrderByPartContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(QuerySqlBaseParser.HAVING, 0); }
		public WhereExpressionContext whereExpression() {
			return getRuleContext(WhereExpressionContext.class,0);
		}
		public HavingExpressionContext havingExpression() {
			return getRuleContext(HavingExpressionContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(QuerySqlBaseParser.LIMIT, 0); }
		public TerminalNode FETCH() { return getToken(QuerySqlBaseParser.FETCH, 0); }
		public LimitRowCountContext limitRowCount() {
			return getRuleContext(LimitRowCountContext.class,0);
		}
		public TerminalNode FIRST() { return getToken(QuerySqlBaseParser.FIRST, 0); }
		public TerminalNode NEXT() { return getToken(QuerySqlBaseParser.NEXT, 0); }
		public TerminalNode ROW() { return getToken(QuerySqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(QuerySqlBaseParser.ROWS, 0); }
		public TerminalNode ONLY() { return getToken(QuerySqlBaseParser.ONLY, 0); }
		public TerminalNode WITH() { return getToken(QuerySqlBaseParser.WITH, 0); }
		public TerminalNode TIES() { return getToken(QuerySqlBaseParser.TIES, 0); }
		public RowCountContext rowCount() {
			return getRuleContext(RowCountContext.class,0);
		}
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterQueryPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitQueryPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitQueryPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_queryPrimary);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(SELECT);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(88);
				setQuantifier();
				}
			}

			setState(91);
			selectItem();
			setState(96);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(92);
					match(T__0);
					setState(93);
					selectItem();
					}
					} 
				}
				setState(98);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(99);
				match(FROM);
				setState(100);
				tableExpression();
				setState(105);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(101);
						match(T__0);
						setState(102);
						tableExpression();
						}
						} 
					}
					setState(107);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				}
				break;
			}
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(110);
				match(WHERE);
				setState(111);
				((QueryPrimaryContext)_localctx).where = whereExpression();
				}
				break;
			}
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(114);
				match(GROUP);
				setState(115);
				match(BY);
				setState(116);
				groupByExpression();
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(117);
						match(T__0);
						setState(118);
						groupByExpression();
						}
						} 
					}
					setState(123);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			}
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(126);
				orderByPart();
				}
				break;
			}
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(129);
				match(HAVING);
				setState(130);
				((QueryPrimaryContext)_localctx).having = havingExpression();
				}
				break;
			}
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				{
				setState(133);
				match(LIMIT);
				setState(134);
				((QueryPrimaryContext)_localctx).limit = limitRowCount();
				}
				}
				break;
			case 2:
				{
				{
				setState(135);
				match(FETCH);
				setState(136);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==NEXT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (T__6 - 3)) | (1L << (SELECT - 3)) | (1L << (CASE - 3)) | (1L << (EXISTS - 3)) | (1L << (MINUS - 3)) | (1L << (NULL - 3)) | (1L << (QUESTION_MARK - 3)) | (1L << (D_ANT - 3)) | (1L << (STRING - 3)) | (1L << (INTEGER_VALUE - 3)) | (1L << (DECIMAL_VALUE - 3)) | (1L << (DOUBLE_VALUE - 3)) | (1L << (IDENTIFIER - 3)))) != 0)) {
					{
					setState(137);
					((QueryPrimaryContext)_localctx).fetchFirst = rowCount();
					}
				}

				setState(140);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(144);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ONLY:
					{
					setState(141);
					match(ONLY);
					}
					break;
				case WITH:
					{
					setState(142);
					match(WITH);
					setState(143);
					match(TIES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByPartContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(QuerySqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(QuerySqlBaseParser.BY, 0); }
		public List<OrderByExpressionContext> orderByExpression() {
			return getRuleContexts(OrderByExpressionContext.class);
		}
		public OrderByExpressionContext orderByExpression(int i) {
			return getRuleContext(OrderByExpressionContext.class,i);
		}
		public OrderByPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterOrderByPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitOrderByPart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitOrderByPart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByPartContext orderByPart() throws RecognitionException {
		OrderByPartContext _localctx = new OrderByPartContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_orderByPart);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(ORDER);
			setState(149);
			match(BY);
			setState(150);
			orderByExpression();
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					match(T__0);
					setState(152);
					orderByExpression();
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitRowCountContext extends ParserRuleContext {
		public List<RowCountContext> rowCount() {
			return getRuleContexts(RowCountContext.class);
		}
		public RowCountContext rowCount(int i) {
			return getRuleContext(RowCountContext.class,i);
		}
		public LimitRowCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limitRowCount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterLimitRowCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitLimitRowCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitLimitRowCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitRowCountContext limitRowCount() throws RecognitionException {
		LimitRowCountContext _localctx = new LimitRowCountContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_limitRowCount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			rowCount();
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(159);
				match(T__0);
				setState(160);
				rowCount();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowCountContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public RowCountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowCount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterRowCount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitRowCount(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitRowCount(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowCountContext rowCount() throws RecognitionException {
		RowCountContext _localctx = new RowCountContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_rowCount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			valueExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(QuerySqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(QuerySqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			_la = _input.LA(1);
			if ( !(_la==DISTINCT || _la==ALL) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectItemContext extends ParserRuleContext {
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
	 
		public SelectItemContext() { }
		public void copyFrom(SelectItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectAllContext extends SelectItemContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(QuerySqlBaseParser.ASTERISK, 0); }
		public SelectAllContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterSelectAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitSelectAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitSelectAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectSingleContext extends SelectItemContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(QuerySqlBaseParser.AS, 0); }
		public SelectSingleContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterSelectSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitSelectSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitSelectSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_selectItem);
		int _la;
		try {
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new SelectSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				expression();
				setState(172);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
				case 1:
					{
					setState(169);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(168);
						match(AS);
						}
					}

					setState(171);
					identifier();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(174);
				primaryExpression(0);
				setState(175);
				match(T__1);
				setState(176);
				match(ASTERISK);
				}
				break;
			case 3:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(178);
				match(ASTERISK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableExpressionContext extends ParserRuleContext {
		public TableExpressionExpressContext tableExpressionExpress() {
			return getRuleContext(TableExpressionExpressContext.class,0);
		}
		public TableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterTableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitTableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitTableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableExpressionContext tableExpression() throws RecognitionException {
		TableExpressionContext _localctx = new TableExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tableExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			tableExpressionExpress(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableExpressionExpressContext extends ParserRuleContext {
		public TableExpressionExpressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableExpressionExpress; }
	 
		public TableExpressionExpressContext() { }
		public void copyFrom(TableExpressionExpressContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JoinTableExpressContext extends TableExpressionExpressContext {
		public TableExpressionExpressContext left;
		public SimpleTableExpressionContext right;
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public TerminalNode JOIN() { return getToken(QuerySqlBaseParser.JOIN, 0); }
		public JoinConditionContext joinCondition() {
			return getRuleContext(JoinConditionContext.class,0);
		}
		public TableExpressionExpressContext tableExpressionExpress() {
			return getRuleContext(TableExpressionExpressContext.class,0);
		}
		public SimpleTableExpressionContext simpleTableExpression() {
			return getRuleContext(SimpleTableExpressionContext.class,0);
		}
		public JoinTableExpressContext(TableExpressionExpressContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterJoinTableExpress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitJoinTableExpress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitJoinTableExpress(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleTableExpressContext extends TableExpressionExpressContext {
		public SimpleTableExpressionContext simpleTableExpression() {
			return getRuleContext(SimpleTableExpressionContext.class,0);
		}
		public SimpleTableExpressContext(TableExpressionExpressContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterSimpleTableExpress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitSimpleTableExpress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitSimpleTableExpress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableExpressionExpressContext tableExpressionExpress() throws RecognitionException {
		return tableExpressionExpress(0);
	}

	private TableExpressionExpressContext tableExpressionExpress(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TableExpressionExpressContext _localctx = new TableExpressionExpressContext(_ctx, _parentState);
		TableExpressionExpressContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_tableExpressionExpress, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SimpleTableExpressContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(184);
			simpleTableExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(194);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinTableExpressContext(new TableExpressionExpressContext(_parentctx, _parentState));
					((JoinTableExpressContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_tableExpressionExpress);
					setState(186);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(187);
					joinType();
					setState(188);
					match(JOIN);
					setState(189);
					((JoinTableExpressContext)_localctx).right = simpleTableExpression();
					setState(190);
					joinCondition();
					}
					} 
				}
				setState(196);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(QuerySqlBaseParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(QuerySqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(QuerySqlBaseParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(QuerySqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(QuerySqlBaseParser.FULL, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_joinType);
		int _la;
		try {
			setState(212);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(197);
					match(INNER);
					}
				}

				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(200);
				match(LEFT);
				setState(202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(201);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(204);
				match(RIGHT);
				setState(206);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(205);
					match(OUTER);
					}
				}

				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				match(FULL);
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(209);
					match(OUTER);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinConditionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(QuerySqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public JoinConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterJoinCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitJoinCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitJoinCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinConditionContext joinCondition() throws RecognitionException {
		JoinConditionContext _localctx = new JoinConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_joinCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(ON);
			setState(215);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SimpleTableExpressionContext extends ParserRuleContext {
		public AliasedTableExpressionContext aliasedTableExpression() {
			return getRuleContext(AliasedTableExpressionContext.class,0);
		}
		public SimpleTableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleTableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterSimpleTableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitSimpleTableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitSimpleTableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleTableExpressionContext simpleTableExpression() throws RecognitionException {
		SimpleTableExpressionContext _localctx = new SimpleTableExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_simpleTableExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			aliasedTableExpression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasedTableExpressionContext extends ParserRuleContext {
		public TableExpressPrimaryContext tableExpressPrimary() {
			return getRuleContext(TableExpressPrimaryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(QuerySqlBaseParser.AS, 0); }
		public AliasedTableExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasedTableExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterAliasedTableExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitAliasedTableExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitAliasedTableExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasedTableExpressionContext aliasedTableExpression() throws RecognitionException {
		AliasedTableExpressionContext _localctx = new AliasedTableExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_aliasedTableExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(219);
			tableExpressPrimary();
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(220);
					match(AS);
					}
				}

				setState(223);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableExpressPrimaryContext extends ParserRuleContext {
		public TableExpressPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableExpressPrimary; }
	 
		public TableExpressPrimaryContext() { }
		public void copyFrom(TableExpressPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubQueryTableExpressContext extends TableExpressPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubQueryTableExpressContext(TableExpressPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterSubQueryTableExpress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitSubQueryTableExpress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitSubQueryTableExpress(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameExpressContext extends TableExpressPrimaryContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableNameExpressContext(TableExpressPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterTableNameExpress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitTableNameExpress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitTableNameExpress(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnionSelectTableExpressContext extends TableExpressPrimaryContext {
		public TableExpressionContext tableExpression() {
			return getRuleContext(TableExpressionContext.class,0);
		}
		public List<UnionTableExpressContext> unionTableExpress() {
			return getRuleContexts(UnionTableExpressContext.class);
		}
		public UnionTableExpressContext unionTableExpress(int i) {
			return getRuleContext(UnionTableExpressContext.class,i);
		}
		public UnionSelectTableExpressContext(TableExpressPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterUnionSelectTableExpress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitUnionSelectTableExpress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitUnionSelectTableExpress(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubTableExpressionExpressContext extends TableExpressPrimaryContext {
		public TableExpressionContext tableExpression() {
			return getRuleContext(TableExpressionContext.class,0);
		}
		public SubTableExpressionExpressContext(TableExpressPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterSubTableExpressionExpress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitSubTableExpressionExpress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitSubTableExpressionExpress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableExpressPrimaryContext tableExpressPrimary() throws RecognitionException {
		TableExpressPrimaryContext _localctx = new TableExpressPrimaryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tableExpressPrimary);
		int _la;
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new TableNameExpressContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(226);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new UnionSelectTableExpressContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(227);
				match(T__2);
				setState(228);
				tableExpression();
				setState(230); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(229);
					unionTableExpress();
					}
					}
					setState(232); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==UNION );
				setState(234);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new SubQueryTableExpressContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				match(T__2);
				setState(237);
				query();
				setState(238);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new SubTableExpressionExpressContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(240);
				match(T__2);
				setState(241);
				tableExpression();
				setState(242);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnionTableExpressContext extends ParserRuleContext {
		public TerminalNode UNION() { return getToken(QuerySqlBaseParser.UNION, 0); }
		public TableExpressPrimaryContext tableExpressPrimary() {
			return getRuleContext(TableExpressPrimaryContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public UnionTableExpressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unionTableExpress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterUnionTableExpress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitUnionTableExpress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitUnionTableExpress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnionTableExpressContext unionTableExpress() throws RecognitionException {
		UnionTableExpressContext _localctx = new UnionTableExpressContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_unionTableExpress);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(UNION);
			setState(248);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(247);
				setQuantifier();
				}
			}

			setState(250);
			tableExpressPrimary();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GroupByExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterGroupByExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitGroupByExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitGroupByExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByExpressionContext groupByExpression() throws RecognitionException {
		GroupByExpressionContext _localctx = new GroupByExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_groupByExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterWhereExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitWhereExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitWhereExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereExpressionContext whereExpression() throws RecognitionException {
		WhereExpressionContext _localctx = new WhereExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_whereExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderByExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OrderByExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterOrderByExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitOrderByExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitOrderByExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByExpressionContext orderByExpression() throws RecognitionException {
		OrderByExpressionContext _localctx = new OrderByExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_orderByExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterHavingExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitHavingExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitHavingExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingExpressionContext havingExpression() throws RecognitionException {
		HavingExpressionContext _localctx = new HavingExpressionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_havingExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(QuerySqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(QuerySqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(QuerySqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 48;
		enterRecursionRule(_localctx, 48, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__6:
			case SELECT:
			case CASE:
			case EXISTS:
			case MINUS:
			case NULL:
			case QUESTION_MARK:
			case D_ANT:
			case STRING:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case DOUBLE_VALUE:
			case IDENTIFIER:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(263);
				((PredicatedContext)_localctx).valueExpression = valueExpression();
				setState(265);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(264);
					predicate(((PredicatedContext)_localctx).valueExpression);
					}
					break;
				}
				}
				break;
			case NOT:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(267);
				match(NOT);
				setState(268);
				booleanExpression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(277);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(271);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(272);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(273);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(274);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(275);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(276);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public ParserRuleContext value;
		public PredicateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PredicateContext(ParserRuleContext parent, int invokingState, ParserRuleContext value) {
			super(parent, invokingState);
			this.value = value;
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class ComparisonContext extends PredicateContext {
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LikeContext extends PredicateContext {
		public ValueExpressionContext pattern;
		public ValueExpressionContext escape;
		public TerminalNode LIKE() { return getToken(QuerySqlBaseParser.LIKE, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(QuerySqlBaseParser.NOT, 0); }
		public TerminalNode ESCAPE() { return getToken(QuerySqlBaseParser.ESCAPE, 0); }
		public LikeContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InSubqueryContext extends PredicateContext {
		public TerminalNode IN() { return getToken(QuerySqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(QuerySqlBaseParser.NOT, 0); }
		public InSubqueryContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterInSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitInSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitInSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InListContext extends PredicateContext {
		public TerminalNode IN() { return getToken(QuerySqlBaseParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(QuerySqlBaseParser.NOT, 0); }
		public InListContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterInList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitInList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitInList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullPredicateContext extends PredicateContext {
		public TerminalNode IS() { return getToken(QuerySqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(QuerySqlBaseParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(QuerySqlBaseParser.NOT, 0); }
		public NullPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterNullPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitNullPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitNullPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenContext extends PredicateContext {
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public TerminalNode BETWEEN() { return getToken(QuerySqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(QuerySqlBaseParser.AND, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(QuerySqlBaseParser.NOT, 0); }
		public BetweenContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitBetween(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuantifiedComparisonContext extends PredicateContext {
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public QuantifiedComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterQuantifiedComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitQuantifiedComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitQuantifiedComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate(ParserRuleContext value) throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState(), value);
		enterRule(_localctx, 50, RULE_predicate);
		int _la;
		try {
			setState(335);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				_localctx = new ComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				comparisonOperator();
				setState(283);
				((ComparisonContext)_localctx).right = valueExpression();
				}
				break;
			case 2:
				_localctx = new QuantifiedComparisonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(285);
				comparisonOperator();
				setState(286);
				match(T__2);
				setState(287);
				query();
				setState(288);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new BetweenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(291);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(290);
					match(NOT);
					}
				}

				setState(293);
				match(BETWEEN);
				setState(294);
				((BetweenContext)_localctx).lower = valueExpression();
				setState(295);
				match(AND);
				setState(296);
				((BetweenContext)_localctx).upper = valueExpression();
				}
				break;
			case 4:
				_localctx = new InListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(298);
					match(NOT);
					}
				}

				setState(301);
				match(IN);
				setState(302);
				match(T__2);
				setState(303);
				expression();
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(304);
					match(T__0);
					setState(305);
					expression();
					}
					}
					setState(310);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(311);
				match(T__3);
				}
				break;
			case 5:
				_localctx = new InSubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(313);
					match(NOT);
					}
				}

				setState(316);
				match(IN);
				setState(317);
				match(T__2);
				setState(318);
				query();
				setState(319);
				match(T__3);
				}
				break;
			case 6:
				_localctx = new LikeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(322);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(321);
					match(NOT);
					}
				}

				setState(324);
				match(LIKE);
				setState(325);
				((LikeContext)_localctx).pattern = valueExpression();
				setState(328);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
				case 1:
					{
					setState(326);
					match(ESCAPE);
					setState(327);
					((LikeContext)_localctx).escape = valueExpression();
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new NullPredicateContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(330);
				match(IS);
				setState(332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(331);
					match(NOT);
					}
				}

				setState(334);
				match(NULL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterValueExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitValueExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitValueExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_valueExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			primaryExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DynamicParameterContext extends PrimaryExpressionContext {
		public TerminalNode QUESTION_MARK() { return getToken(QuerySqlBaseParser.QUESTION_MARK, 0); }
		public DynamicParameterContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterDynamicParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitDynamicParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitDynamicParameter(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(QuerySqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(QuerySqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(QuerySqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubPriorityQueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubPriorityQueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterSubPriorityQueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitSubPriorityQueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitSubPriorityQueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLiteralContext extends PrimaryExpressionContext {
		public TerminalNode NULL() { return getToken(QuerySqlBaseParser.NULL, 0); }
		public NullLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TypeConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecialVariableContext extends PrimaryExpressionContext {
		public TerminalNode D_ANT() { return getToken(QuerySqlBaseParser.D_ANT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SpecialVariableContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterSpecialVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitSpecialVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitSpecialVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends PrimaryExpressionContext {
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public StringLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends PrimaryExpressionContext {
		public TerminalNode EXISTS() { return getToken(QuerySqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends PrimaryExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubQueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubQueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterSubQueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitSubQueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitSubQueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubScriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public SubScriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterSubScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitSubScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitSubScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 54;
		enterRecursionRule(_localctx, 54, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(397);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				_localctx = new DynamicParameterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(340);
				match(QUESTION_MARK);
				}
				break;
			case 2:
				{
				_localctx = new SpecialVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(341);
				match(D_ANT);
				setState(342);
				identifier();
				}
				break;
			case 3:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(343);
				match(NULL);
				}
				break;
			case 4:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(344);
				identifier();
				setState(345);
				string();
				}
				break;
			case 5:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(347);
				number();
				}
				break;
			case 6:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(348);
				string();
				}
				break;
			case 7:
				{
				_localctx = new SubPriorityQueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(349);
				match(T__2);
				setState(350);
				query();
				setState(351);
				match(T__3);
				}
				break;
			case 8:
				{
				_localctx = new SubQueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(353);
				query();
				}
				break;
			case 9:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(354);
				match(EXISTS);
				setState(355);
				match(T__2);
				setState(356);
				query();
				setState(357);
				match(T__3);
				}
				break;
			case 10:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(359);
				match(CASE);
				setState(361); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(360);
					whenClause();
					}
					}
					setState(363); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(367);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(365);
					match(ELSE);
					setState(366);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(369);
				match(END);
				}
				break;
			case 11:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(371);
				qualifiedName();
				setState(372);
				match(T__2);
				setState(384);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 3)) & ~0x3f) == 0 && ((1L << (_la - 3)) & ((1L << (T__2 - 3)) | (1L << (T__6 - 3)) | (1L << (DISTINCT - 3)) | (1L << (SELECT - 3)) | (1L << (CASE - 3)) | (1L << (NOT - 3)) | (1L << (EXISTS - 3)) | (1L << (MINUS - 3)) | (1L << (NULL - 3)) | (1L << (ALL - 3)) | (1L << (QUESTION_MARK - 3)) | (1L << (D_ANT - 3)) | (1L << (STRING - 3)) | (1L << (INTEGER_VALUE - 3)) | (1L << (DECIMAL_VALUE - 3)) | (1L << (DOUBLE_VALUE - 3)) | (1L << (IDENTIFIER - 3)))) != 0)) {
					{
					setState(374);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTINCT || _la==ALL) {
						{
						setState(373);
						setQuantifier();
						}
					}

					setState(376);
					expression();
					setState(381);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(377);
						match(T__0);
						setState(378);
						expression();
						}
						}
						setState(383);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(386);
				match(T__3);
				}
				break;
			case 12:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(388);
				qualifiedName();
				setState(389);
				match(T__2);
				setState(390);
				match(T__3);
				}
				break;
			case 13:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(392);
				identifier();
				}
				break;
			case 14:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(393);
				match(T__2);
				setState(394);
				expression();
				setState(395);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(413);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(411);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						_localctx = new SubScriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubScriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(399);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(400);
						match(T__4);
						setState(401);
						((SubScriptContext)_localctx).index = valueExpression();
						setState(404);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__0) {
							{
							setState(402);
							match(T__0);
							setState(403);
							valueExpression();
							}
						}

						setState(406);
						match(T__5);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(408);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(409);
						match(T__1);
						setState(410);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(415);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(QuerySqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(QuerySqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			match(WHEN);
			setState(417);
			((WhenClauseContext)_localctx).condition = expression();
			setState(418);
			match(THEN);
			setState(419);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			identifier();
			setState(426);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(422);
					match(T__1);
					setState(423);
					identifier();
					}
					} 
				}
				setState(428);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(QuerySqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(QuerySqlBaseParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(QuerySqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(QuerySqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(QuerySqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(QuerySqlBaseParser.GTE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQ) | (1L << NEQ) | (1L << LT) | (1L << LTE) | (1L << GT) | (1L << GTE))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UnquotedIdentifierContext extends IdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(QuerySqlBaseParser.IDENTIFIER, 0); }
		public UnquotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_identifier);
		try {
			setState(435);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				match(T__6);
				setState(432);
				match(IDENTIFIER);
				setState(433);
				match(T__6);
				}
				break;
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(434);
				match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringContext extends ParserRuleContext {
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
	 
		public StringContext() { }
		public void copyFrom(StringContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BasicStringLiteralContext extends StringContext {
		public TerminalNode STRING() { return getToken(QuerySqlBaseParser.STRING, 0); }
		public BasicStringLiteralContext(StringContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterBasicStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitBasicStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitBasicStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_string);
		try {
			_localctx = new BasicStringLiteralContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(437);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(QuerySqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(QuerySqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_VALUE() { return getToken(QuerySqlBaseParser.DOUBLE_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(QuerySqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(QuerySqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(QuerySqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_number);
		int _la;
		try {
			setState(451);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(439);
					match(MINUS);
					}
				}

				setState(442);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(443);
					match(MINUS);
					}
				}

				setState(446);
				match(DOUBLE_VALUE);
				}
				break;
			case 3:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(448);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(447);
					match(MINUS);
					}
				}

				setState(450);
				match(INTEGER_VALUE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return tableExpressionExpress_sempred((TableExpressionExpressContext)_localctx, predIndex);
		case 24:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 27:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean tableExpressionExpress_sempred(TableExpressionExpressContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		case 2:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3D\u01c8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\7\3K\n\3\f\3\16\3N\13\3\3\4\3\4\5\4"+
		"R\n\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\5\7\\\n\7\3\7\3\7\3\7\7\7a\n\7\f"+
		"\7\16\7d\13\7\3\7\3\7\3\7\3\7\7\7j\n\7\f\7\16\7m\13\7\5\7o\n\7\3\7\3\7"+
		"\5\7s\n\7\3\7\3\7\3\7\3\7\3\7\7\7z\n\7\f\7\16\7}\13\7\5\7\177\n\7\3\7"+
		"\5\7\u0082\n\7\3\7\3\7\5\7\u0086\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u008d\n\7"+
		"\3\7\3\7\3\7\3\7\5\7\u0093\n\7\5\7\u0095\n\7\3\b\3\b\3\b\3\b\3\b\7\b\u009c"+
		"\n\b\f\b\16\b\u009f\13\b\3\t\3\t\3\t\5\t\u00a4\n\t\3\n\3\n\3\13\3\13\3"+
		"\f\3\f\5\f\u00ac\n\f\3\f\5\f\u00af\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b6\n"+
		"\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00c3\n\16"+
		"\f\16\16\16\u00c6\13\16\3\17\5\17\u00c9\n\17\3\17\3\17\5\17\u00cd\n\17"+
		"\3\17\3\17\5\17\u00d1\n\17\3\17\3\17\5\17\u00d5\n\17\5\17\u00d7\n\17\3"+
		"\20\3\20\3\20\3\21\3\21\3\22\3\22\5\22\u00e0\n\22\3\22\5\22\u00e3\n\22"+
		"\3\23\3\23\3\23\3\23\6\23\u00e9\n\23\r\23\16\23\u00ea\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00f7\n\23\3\24\3\24\5\24\u00fb"+
		"\n\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31\3\32"+
		"\3\32\3\32\5\32\u010c\n\32\3\32\3\32\5\32\u0110\n\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\7\32\u0118\n\32\f\32\16\32\u011b\13\32\3\33\3\33\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\5\33\u0126\n\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u012e\n\33\3\33\3\33\3\33\3\33\3\33\7\33\u0135\n\33\f\33\16"+
		"\33\u0138\13\33\3\33\3\33\3\33\5\33\u013d\n\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\5\33\u0145\n\33\3\33\3\33\3\33\3\33\5\33\u014b\n\33\3\33\3\33\5"+
		"\33\u014f\n\33\3\33\5\33\u0152\n\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\6\35\u016c\n\35\r\35\16\35\u016d\3\35\3\35\5\35\u0172"+
		"\n\35\3\35\3\35\3\35\3\35\3\35\5\35\u0179\n\35\3\35\3\35\3\35\7\35\u017e"+
		"\n\35\f\35\16\35\u0181\13\35\5\35\u0183\n\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0190\n\35\3\35\3\35\3\35\3\35\3\35"+
		"\5\35\u0197\n\35\3\35\3\35\3\35\3\35\3\35\7\35\u019e\n\35\f\35\16\35\u01a1"+
		"\13\35\3\36\3\36\3\36\3\36\3\36\3\37\3\37\3\37\7\37\u01ab\n\37\f\37\16"+
		"\37\u01ae\13\37\3 \3 \3!\3!\3!\3!\5!\u01b6\n!\3\"\3\"\3#\5#\u01bb\n#\3"+
		"#\3#\5#\u01bf\n#\3#\3#\5#\u01c3\n#\3#\5#\u01c6\n#\3#\2\5\32\628$\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BD\2\6\3\2"+
		"\63\64\3\2\65\66\4\2\n\n;;\3\2+\60\2\u01f6\2F\3\2\2\2\4H\3\2\2\2\6O\3"+
		"\2\2\2\bU\3\2\2\2\nW\3\2\2\2\fY\3\2\2\2\16\u0096\3\2\2\2\20\u00a0\3\2"+
		"\2\2\22\u00a5\3\2\2\2\24\u00a7\3\2\2\2\26\u00b5\3\2\2\2\30\u00b7\3\2\2"+
		"\2\32\u00b9\3\2\2\2\34\u00d6\3\2\2\2\36\u00d8\3\2\2\2 \u00db\3\2\2\2\""+
		"\u00dd\3\2\2\2$\u00f6\3\2\2\2&\u00f8\3\2\2\2(\u00fe\3\2\2\2*\u0100\3\2"+
		"\2\2,\u0102\3\2\2\2.\u0104\3\2\2\2\60\u0106\3\2\2\2\62\u010f\3\2\2\2\64"+
		"\u0151\3\2\2\2\66\u0153\3\2\2\28\u018f\3\2\2\2:\u01a2\3\2\2\2<\u01a7\3"+
		"\2\2\2>\u01af\3\2\2\2@\u01b5\3\2\2\2B\u01b7\3\2\2\2D\u01c5\3\2\2\2FG\5"+
		"\4\3\2G\3\3\2\2\2HL\5\b\5\2IK\5\6\4\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM"+
		"\3\2\2\2M\5\3\2\2\2NL\3\2\2\2OQ\7:\2\2PR\5\24\13\2QP\3\2\2\2QR\3\2\2\2"+
		"RS\3\2\2\2ST\5\b\5\2T\7\3\2\2\2UV\5\n\6\2V\t\3\2\2\2WX\5\f\7\2X\13\3\2"+
		"\2\2Y[\7\13\2\2Z\\\5\24\13\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]b\5\26\f"+
		"\2^_\7\3\2\2_a\5\26\f\2`^\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2cn\3\2"+
		"\2\2db\3\2\2\2ef\7\f\2\2fk\5\30\r\2gh\7\3\2\2hj\5\30\r\2ig\3\2\2\2jm\3"+
		"\2\2\2ki\3\2\2\2kl\3\2\2\2lo\3\2\2\2mk\3\2\2\2ne\3\2\2\2no\3\2\2\2or\3"+
		"\2\2\2pq\7\r\2\2qs\5*\26\2rp\3\2\2\2rs\3\2\2\2s~\3\2\2\2tu\7\16\2\2uv"+
		"\7\"\2\2v{\5(\25\2wx\7\3\2\2xz\5(\25\2yw\3\2\2\2z}\3\2\2\2{y\3\2\2\2{"+
		"|\3\2\2\2|\177\3\2\2\2}{\3\2\2\2~t\3\2\2\2~\177\3\2\2\2\177\u0081\3\2"+
		"\2\2\u0080\u0082\5\16\b\2\u0081\u0080\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0085\3\2\2\2\u0083\u0084\7\20\2\2\u0084\u0086\5.\30\2\u0085\u0083\3"+
		"\2\2\2\u0085\u0086\3\2\2\2\u0086\u0094\3\2\2\2\u0087\u0088\7\61\2\2\u0088"+
		"\u0095\5\20\t\2\u0089\u008a\7\62\2\2\u008a\u008c\t\2\2\2\u008b\u008d\5"+
		"\22\n\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u0092\t\3\2\2\u008f\u0093\7\67\2\2\u0090\u0091\78\2\2\u0091\u0093\79"+
		"\2\2\u0092\u008f\3\2\2\2\u0092\u0090\3\2\2\2\u0093\u0095\3\2\2\2\u0094"+
		"\u0087\3\2\2\2\u0094\u0089\3\2\2\2\u0094\u0095\3\2\2\2\u0095\r\3\2\2\2"+
		"\u0096\u0097\7\17\2\2\u0097\u0098\7\"\2\2\u0098\u009d\5,\27\2\u0099\u009a"+
		"\7\3\2\2\u009a\u009c\5,\27\2\u009b\u0099\3\2\2\2\u009c\u009f\3\2\2\2\u009d"+
		"\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\17\3\2\2\2\u009f\u009d\3\2\2"+
		"\2\u00a0\u00a3\5\22\n\2\u00a1\u00a2\7\3\2\2\u00a2\u00a4\5\22\n\2\u00a3"+
		"\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\21\3\2\2\2\u00a5\u00a6\5\66\34"+
		"\2\u00a6\23\3\2\2\2\u00a7\u00a8\t\4\2\2\u00a8\25\3\2\2\2\u00a9\u00ae\5"+
		"\60\31\2\u00aa\u00ac\7!\2\2\u00ab\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ad\3\2\2\2\u00ad\u00af\5@!\2\u00ae\u00ab\3\2\2\2\u00ae\u00af\3\2\2"+
		"\2\u00af\u00b6\3\2\2\2\u00b0\u00b1\58\35\2\u00b1\u00b2\7\4\2\2\u00b2\u00b3"+
		"\7<\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b6\7<\2\2\u00b5\u00a9\3\2\2\2\u00b5"+
		"\u00b0\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6\27\3\2\2\2\u00b7\u00b8\5\32\16"+
		"\2\u00b8\31\3\2\2\2\u00b9\u00ba\b\16\1\2\u00ba\u00bb\5 \21\2\u00bb\u00c4"+
		"\3\2\2\2\u00bc\u00bd\f\4\2\2\u00bd\u00be\5\34\17\2\u00be\u00bf\7$\2\2"+
		"\u00bf\u00c0\5 \21\2\u00c0\u00c1\5\36\20\2\u00c1\u00c3\3\2\2\2\u00c2\u00bc"+
		"\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5"+
		"\33\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c7\u00c9\7%\2\2\u00c8\u00c7\3\2\2\2"+
		"\u00c8\u00c9\3\2\2\2\u00c9\u00d7\3\2\2\2\u00ca\u00cc\7&\2\2\u00cb\u00cd"+
		"\7\'\2\2\u00cc\u00cb\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00d7\3\2\2\2\u00ce"+
		"\u00d0\7*\2\2\u00cf\u00d1\7\'\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\u00d7\3\2\2\2\u00d2\u00d4\7(\2\2\u00d3\u00d5\7\'\2\2\u00d4"+
		"\u00d3\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d7\3\2\2\2\u00d6\u00c8\3\2"+
		"\2\2\u00d6\u00ca\3\2\2\2\u00d6\u00ce\3\2\2\2\u00d6\u00d2\3\2\2\2\u00d7"+
		"\35\3\2\2\2\u00d8\u00d9\7)\2\2\u00d9\u00da\5\62\32\2\u00da\37\3\2\2\2"+
		"\u00db\u00dc\5\"\22\2\u00dc!\3\2\2\2\u00dd\u00e2\5$\23\2\u00de\u00e0\7"+
		"!\2\2\u00df\u00de\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00e3\5@!\2\u00e2\u00df\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3#\3\2\2\2\u00e4"+
		"\u00f7\5<\37\2\u00e5\u00e6\7\5\2\2\u00e6\u00e8\5\30\r\2\u00e7\u00e9\5"+
		"&\24\2\u00e8\u00e7\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea"+
		"\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7\6\2\2\u00ed\u00f7\3\2"+
		"\2\2\u00ee\u00ef\7\5\2\2\u00ef\u00f0\5\4\3\2\u00f0\u00f1\7\6\2\2\u00f1"+
		"\u00f7\3\2\2\2\u00f2\u00f3\7\5\2\2\u00f3\u00f4\5\30\r\2\u00f4\u00f5\7"+
		"\6\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00e4\3\2\2\2\u00f6\u00e5\3\2\2\2\u00f6"+
		"\u00ee\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f7%\3\2\2\2\u00f8\u00fa\7:\2\2\u00f9"+
		"\u00fb\5\24\13\2\u00fa\u00f9\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\3"+
		"\2\2\2\u00fc\u00fd\5$\23\2\u00fd\'\3\2\2\2\u00fe\u00ff\5\60\31\2\u00ff"+
		")\3\2\2\2\u0100\u0101\5\62\32\2\u0101+\3\2\2\2\u0102\u0103\5\60\31\2\u0103"+
		"-\3\2\2\2\u0104\u0105\5\62\32\2\u0105/\3\2\2\2\u0106\u0107\5\62\32\2\u0107"+
		"\61\3\2\2\2\u0108\u0109\b\32\1\2\u0109\u010b\5\66\34\2\u010a\u010c\5\64"+
		"\33\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\u0110\3\2\2\2\u010d"+
		"\u010e\7\27\2\2\u010e\u0110\5\62\32\5\u010f\u0108\3\2\2\2\u010f\u010d"+
		"\3\2\2\2\u0110\u0119\3\2\2\2\u0111\u0112\f\4\2\2\u0112\u0113\7\26\2\2"+
		"\u0113\u0118\5\62\32\5\u0114\u0115\f\3\2\2\u0115\u0116\7\30\2\2\u0116"+
		"\u0118\5\62\32\4\u0117\u0111\3\2\2\2\u0117\u0114\3\2\2\2\u0118\u011b\3"+
		"\2\2\2\u0119\u0117\3\2\2\2\u0119\u011a\3\2\2\2\u011a\63\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011c\u011d\5> \2\u011d\u011e\5\66\34\2\u011e\u0152\3\2"+
		"\2\2\u011f\u0120\5> \2\u0120\u0121\7\5\2\2\u0121\u0122\5\4\3\2\u0122\u0123"+
		"\7\6\2\2\u0123\u0152\3\2\2\2\u0124\u0126\7\27\2\2\u0125\u0124\3\2\2\2"+
		"\u0125\u0126\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\7\31\2\2\u0128\u0129"+
		"\5\66\34\2\u0129\u012a\7\26\2\2\u012a\u012b\5\66\34\2\u012b\u0152\3\2"+
		"\2\2\u012c\u012e\7\27\2\2\u012d\u012c\3\2\2\2\u012d\u012e\3\2\2\2\u012e"+
		"\u012f\3\2\2\2\u012f\u0130\7\32\2\2\u0130\u0131\7\5\2\2\u0131\u0136\5"+
		"\60\31\2\u0132\u0133\7\3\2\2\u0133\u0135\5\60\31\2\u0134\u0132\3\2\2\2"+
		"\u0135\u0138\3\2\2\2\u0136\u0134\3\2\2\2\u0136\u0137\3\2\2\2\u0137\u0139"+
		"\3\2\2\2\u0138\u0136\3\2\2\2\u0139\u013a\7\6\2\2\u013a\u0152\3\2\2\2\u013b"+
		"\u013d\7\27\2\2\u013c\u013b\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3"+
		"\2\2\2\u013e\u013f\7\32\2\2\u013f\u0140\7\5\2\2\u0140\u0141\5\4\3\2\u0141"+
		"\u0142\7\6\2\2\u0142\u0152\3\2\2\2\u0143\u0145\7\27\2\2\u0144\u0143\3"+
		"\2\2\2\u0144\u0145\3\2\2\2\u0145\u0146\3\2\2\2\u0146\u0147\7\33\2\2\u0147"+
		"\u014a\5\66\34\2\u0148\u0149\7\34\2\2\u0149\u014b\5\66\34\2\u014a\u0148"+
		"\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u0152\3\2\2\2\u014c\u014e\7 \2\2\u014d"+
		"\u014f\7\27\2\2\u014e\u014d\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150\3"+
		"\2\2\2\u0150\u0152\7#\2\2\u0151\u011c\3\2\2\2\u0151\u011f\3\2\2\2\u0151"+
		"\u0125\3\2\2\2\u0151\u012d\3\2\2\2\u0151\u013c\3\2\2\2\u0151\u0144\3\2"+
		"\2\2\u0151\u014c\3\2\2\2\u0152\65\3\2\2\2\u0153\u0154\58\35\2\u0154\67"+
		"\3\2\2\2\u0155\u0156\b\35\1\2\u0156\u0190\7=\2\2\u0157\u0158\7>\2\2\u0158"+
		"\u0190\5@!\2\u0159\u0190\7#\2\2\u015a\u015b\5@!\2\u015b\u015c\5B\"\2\u015c"+
		"\u0190\3\2\2\2\u015d\u0190\5D#\2\u015e\u0190\5B\"\2\u015f\u0160\7\5\2"+
		"\2\u0160\u0161\5\4\3\2\u0161\u0162\7\6\2\2\u0162\u0190\3\2\2\2\u0163\u0190"+
		"\5\4\3\2\u0164\u0165\7\35\2\2\u0165\u0166\7\5\2\2\u0166\u0167\5\4\3\2"+
		"\u0167\u0168\7\6\2\2\u0168\u0190\3\2\2\2\u0169\u016b\7\21\2\2\u016a\u016c"+
		"\5:\36\2\u016b\u016a\3\2\2\2\u016c\u016d\3\2\2\2\u016d\u016b\3\2\2\2\u016d"+
		"\u016e\3\2\2\2\u016e\u0171\3\2\2\2\u016f\u0170\7\24\2\2\u0170\u0172\5"+
		"\60\31\2\u0171\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\3\2\2\2\u0173"+
		"\u0174\7\25\2\2\u0174\u0190\3\2\2\2\u0175\u0176\5<\37\2\u0176\u0182\7"+
		"\5\2\2\u0177\u0179\5\24\13\2\u0178\u0177\3\2\2\2\u0178\u0179\3\2\2\2\u0179"+
		"\u017a\3\2\2\2\u017a\u017f\5\60\31\2\u017b\u017c\7\3\2\2\u017c\u017e\5"+
		"\60\31\2\u017d\u017b\3\2\2\2\u017e\u0181\3\2\2\2\u017f\u017d\3\2\2\2\u017f"+
		"\u0180\3\2\2\2\u0180\u0183\3\2\2\2\u0181\u017f\3\2\2\2\u0182\u0178\3\2"+
		"\2\2\u0182\u0183\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185\7\6\2\2\u0185"+
		"\u0190\3\2\2\2\u0186\u0187\5<\37\2\u0187\u0188\7\5\2\2\u0188\u0189\7\6"+
		"\2\2\u0189\u0190\3\2\2\2\u018a\u0190\5@!\2\u018b\u018c\7\5\2\2\u018c\u018d"+
		"\5\60\31\2\u018d\u018e\7\6\2\2\u018e\u0190\3\2\2\2\u018f\u0155\3\2\2\2"+
		"\u018f\u0157\3\2\2\2\u018f\u0159\3\2\2\2\u018f\u015a\3\2\2\2\u018f\u015d"+
		"\3\2\2\2\u018f\u015e\3\2\2\2\u018f\u015f\3\2\2\2\u018f\u0163\3\2\2\2\u018f"+
		"\u0164\3\2\2\2\u018f\u0169\3\2\2\2\u018f\u0175\3\2\2\2\u018f\u0186\3\2"+
		"\2\2\u018f\u018a\3\2\2\2\u018f\u018b\3\2\2\2\u0190\u019f\3\2\2\2\u0191"+
		"\u0192\f\b\2\2\u0192\u0193\7\7\2\2\u0193\u0196\5\66\34\2\u0194\u0195\7"+
		"\3\2\2\u0195\u0197\5\66\34\2\u0196\u0194\3\2\2\2\u0196\u0197\3\2\2\2\u0197"+
		"\u0198\3\2\2\2\u0198\u0199\7\b\2\2\u0199\u019e\3\2\2\2\u019a\u019b\f\4"+
		"\2\2\u019b\u019c\7\4\2\2\u019c\u019e\5@!\2\u019d\u0191\3\2\2\2\u019d\u019a"+
		"\3\2\2\2\u019e\u01a1\3\2\2\2\u019f\u019d\3\2\2\2\u019f\u01a0\3\2\2\2\u01a0"+
		"9\3\2\2\2\u01a1\u019f\3\2\2\2\u01a2\u01a3\7\22\2\2\u01a3\u01a4\5\60\31"+
		"\2\u01a4\u01a5\7\23\2\2\u01a5\u01a6\5\60\31\2\u01a6;\3\2\2\2\u01a7\u01ac"+
		"\5@!\2\u01a8\u01a9\7\4\2\2\u01a9\u01ab\5@!\2\u01aa\u01a8\3\2\2\2\u01ab"+
		"\u01ae\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ac\u01ad\3\2\2\2\u01ad=\3\2\2\2"+
		"\u01ae\u01ac\3\2\2\2\u01af\u01b0\t\5\2\2\u01b0?\3\2\2\2\u01b1\u01b2\7"+
		"\t\2\2\u01b2\u01b3\7C\2\2\u01b3\u01b6\7\t\2\2\u01b4\u01b6\7C\2\2\u01b5"+
		"\u01b1\3\2\2\2\u01b5\u01b4\3\2\2\2\u01b6A\3\2\2\2\u01b7\u01b8\7?\2\2\u01b8"+
		"C\3\2\2\2\u01b9\u01bb\7\36\2\2\u01ba\u01b9\3\2\2\2\u01ba\u01bb\3\2\2\2"+
		"\u01bb\u01bc\3\2\2\2\u01bc\u01c6\7A\2\2\u01bd\u01bf\7\36\2\2\u01be\u01bd"+
		"\3\2\2\2\u01be\u01bf\3\2\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c6\7B\2\2\u01c1"+
		"\u01c3\7\36\2\2\u01c2\u01c1\3\2\2\2\u01c2\u01c3\3\2\2\2\u01c3\u01c4\3"+
		"\2\2\2\u01c4\u01c6\7@\2\2\u01c5\u01ba\3\2\2\2\u01c5\u01be\3\2\2\2\u01c5"+
		"\u01c2\3\2\2\2\u01c6E\3\2\2\2;LQ[bknr{~\u0081\u0085\u008c\u0092\u0094"+
		"\u009d\u00a3\u00ab\u00ae\u00b5\u00c4\u00c8\u00cc\u00d0\u00d4\u00d6\u00df"+
		"\u00e2\u00ea\u00f6\u00fa\u010b\u010f\u0117\u0119\u0125\u012d\u0136\u013c"+
		"\u0144\u014a\u014e\u0151\u016d\u0171\u0178\u017f\u0182\u018f\u0196\u019d"+
		"\u019f\u01ac\u01b5\u01ba\u01be\u01c2\u01c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}