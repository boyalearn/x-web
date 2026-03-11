// Generated from com\xweb\sql\parser\QuerySqlBase.g4 by ANTLR 4.9.1
package com.xweb.sql.parser;
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
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, DISTINCT=7, SELECT=8, 
		FROM=9, WHERE=10, GROUP=11, ORDER=12, HAVING=13, CASE=14, WHEN=15, THEN=16, 
		ELSE=17, END=18, AND=19, NOT=20, OR=21, BETWEEN=22, IN=23, LIKE=24, ESCAPE=25, 
		EXISTS=26, MINUS=27, ARRAY=28, IS=29, AS=30, BY=31, NULL=32, JOIN=33, 
		INNER=34, LEFT=35, OUTER=36, FULL=37, ON=38, RIGHT=39, EQ=40, NEQ=41, 
		LT=42, LTE=43, GT=44, GTE=45, ASTERISK=46, STRING=47, INTEGER_VALUE=48, 
		DECIMAL_VALUE=49, DOUBLE_VALUE=50, IDENTIFIER=51, WS=52;
	public static final int
		RULE_statement = 0, RULE_query = 1, RULE_queryNoWith = 2, RULE_setQuantifier = 3, 
		RULE_selectItem = 4, RULE_tableExpression = 5, RULE_tableExpressionExpress = 6, 
		RULE_joinType = 7, RULE_joinCondition = 8, RULE_simpleTableExpression = 9, 
		RULE_aliasedTableExpression = 10, RULE_tableExpressPrimary = 11, RULE_groupByExpression = 12, 
		RULE_whereExpression = 13, RULE_orderByExpression = 14, RULE_havingExpression = 15, 
		RULE_expression = 16, RULE_booleanExpression = 17, RULE_predicate = 18, 
		RULE_valueExpression = 19, RULE_primaryExpression = 20, RULE_whenClause = 21, 
		RULE_qualifiedName = 22, RULE_comparisonOperator = 23, RULE_identifier = 24, 
		RULE_string = 25, RULE_number = 26;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "query", "queryNoWith", "setQuantifier", "selectItem", "tableExpression", 
			"tableExpressionExpress", "joinType", "joinCondition", "simpleTableExpression", 
			"aliasedTableExpression", "tableExpressPrimary", "groupByExpression", 
			"whereExpression", "orderByExpression", "havingExpression", "expression", 
			"booleanExpression", "predicate", "valueExpression", "primaryExpression", 
			"whenClause", "qualifiedName", "comparisonOperator", "identifier", "string", 
			"number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "','", "'.'", "'('", "')'", "'['", "']'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "'='", null, "'<'", "'<='", "'>'", "'>='", 
			"'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "DISTINCT", "SELECT", "FROM", 
			"WHERE", "GROUP", "ORDER", "HAVING", "CASE", "WHEN", "THEN", "ELSE", 
			"END", "AND", "NOT", "OR", "BETWEEN", "IN", "LIKE", "ESCAPE", "EXISTS", 
			"MINUS", "ARRAY", "IS", "AS", "BY", "NULL", "JOIN", "INNER", "LEFT", 
			"OUTER", "FULL", "ON", "RIGHT", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", 
			"ASTERISK", "STRING", "INTEGER_VALUE", "DECIMAL_VALUE", "DOUBLE_VALUE", 
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
			setState(54);
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
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
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
		public WhereExpressionContext where;
		public HavingExpressionContext having;
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
		public List<TerminalNode> BY() { return getTokens(QuerySqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(QuerySqlBaseParser.BY, i);
		}
		public List<GroupByExpressionContext> groupByExpression() {
			return getRuleContexts(GroupByExpressionContext.class);
		}
		public GroupByExpressionContext groupByExpression(int i) {
			return getRuleContext(GroupByExpressionContext.class,i);
		}
		public TerminalNode ORDER() { return getToken(QuerySqlBaseParser.ORDER, 0); }
		public List<OrderByExpressionContext> orderByExpression() {
			return getRuleContexts(OrderByExpressionContext.class);
		}
		public OrderByExpressionContext orderByExpression(int i) {
			return getRuleContext(OrderByExpressionContext.class,i);
		}
		public TerminalNode HAVING() { return getToken(QuerySqlBaseParser.HAVING, 0); }
		public WhereExpressionContext whereExpression() {
			return getRuleContext(WhereExpressionContext.class,0);
		}
		public HavingExpressionContext havingExpression() {
			return getRuleContext(HavingExpressionContext.class,0);
		}
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterQueryNoWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitQueryNoWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitQueryNoWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_queryNoWith);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			match(SELECT);
			setState(60);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(59);
				setQuantifier();
				}
			}

			setState(62);
			selectItem();
			setState(67);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(63);
					match(T__0);
					setState(64);
					selectItem();
					}
					} 
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(70);
				match(FROM);
				setState(71);
				tableExpression();
				setState(76);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(72);
						match(T__0);
						setState(73);
						tableExpression();
						}
						} 
					}
					setState(78);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
				}
				}
				break;
			}
			setState(83);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(81);
				match(WHERE);
				setState(82);
				((QueryNoWithContext)_localctx).where = whereExpression();
				}
				break;
			}
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(85);
				match(GROUP);
				setState(86);
				match(BY);
				setState(87);
				groupByExpression();
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(88);
						match(T__0);
						setState(89);
						groupByExpression();
						}
						} 
					}
					setState(94);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
				}
				}
				break;
			}
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(97);
				match(ORDER);
				setState(98);
				match(BY);
				setState(99);
				orderByExpression();
				setState(104);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(100);
						match(T__0);
						setState(101);
						orderByExpression();
						}
						} 
					}
					setState(106);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
				}
				}
				break;
			}
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(109);
				match(HAVING);
				setState(110);
				((QueryNoWithContext)_localctx).having = havingExpression();
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

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(QuerySqlBaseParser.DISTINCT, 0); }
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
		enterRule(_localctx, 6, RULE_setQuantifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(DISTINCT);
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
		enterRule(_localctx, 8, RULE_selectItem);
		int _la;
		try {
			setState(127);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				_localctx = new SelectSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				expression();
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(117);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(116);
						match(AS);
						}
					}

					setState(119);
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
				setState(122);
				primaryExpression(0);
				setState(123);
				match(T__1);
				setState(124);
				match(ASTERISK);
				}
				break;
			case 3:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
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
		enterRule(_localctx, 10, RULE_tableExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
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
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_tableExpressionExpress, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SimpleTableExpressContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(132);
			simpleTableExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(142);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinTableExpressContext(new TableExpressionExpressContext(_parentctx, _parentState));
					((JoinTableExpressContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_tableExpressionExpress);
					setState(134);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(135);
					joinType();
					setState(136);
					match(JOIN);
					setState(137);
					((JoinTableExpressContext)_localctx).right = simpleTableExpression();
					setState(138);
					joinCondition();
					}
					} 
				}
				setState(144);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
		enterRule(_localctx, 14, RULE_joinType);
		int _la;
		try {
			setState(160);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(145);
					match(INNER);
					}
				}

				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				match(LEFT);
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(149);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(RIGHT);
				setState(154);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(153);
					match(OUTER);
					}
				}

				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(156);
				match(FULL);
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(157);
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
		enterRule(_localctx, 16, RULE_joinCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(ON);
			setState(163);
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
		enterRule(_localctx, 18, RULE_simpleTableExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
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
		enterRule(_localctx, 20, RULE_aliasedTableExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			tableExpressPrimary();
			setState(172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
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
		enterRule(_localctx, 22, RULE_tableExpressPrimary);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new TableNameExpressContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(174);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new SubQueryTableExpressContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(175);
				match(T__2);
				setState(176);
				query();
				setState(177);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new SubTableExpressionExpressContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(179);
				match(T__2);
				setState(180);
				tableExpression();
				setState(181);
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

	public static class GroupByExpressionContext extends ParserRuleContext {
		public GroupByExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByExpression; }
	 
		public GroupByExpressionContext() { }
		public void copyFrom(GroupByExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class GroupByExpressContext extends GroupByExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GroupByExpressContext(GroupByExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterGroupByExpress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitGroupByExpress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitGroupByExpress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByExpressionContext groupByExpression() throws RecognitionException {
		GroupByExpressionContext _localctx = new GroupByExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_groupByExpression);
		try {
			_localctx = new GroupByExpressContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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
		public WhereExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereExpression; }
	 
		public WhereExpressionContext() { }
		public void copyFrom(WhereExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WhereExpressContext extends WhereExpressionContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereExpressContext(WhereExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterWhereExpress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitWhereExpress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitWhereExpress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereExpressionContext whereExpression() throws RecognitionException {
		WhereExpressionContext _localctx = new WhereExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_whereExpression);
		try {
			_localctx = new WhereExpressContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
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
		public OrderByExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByExpression; }
	 
		public OrderByExpressionContext() { }
		public void copyFrom(OrderByExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class OrderByExpressContext extends OrderByExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OrderByExpressContext(OrderByExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterOrderByExpress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitOrderByExpress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitOrderByExpress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByExpressionContext orderByExpression() throws RecognitionException {
		OrderByExpressionContext _localctx = new OrderByExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_orderByExpression);
		try {
			_localctx = new OrderByExpressContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
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
		public HavingExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingExpression; }
	 
		public HavingExpressionContext() { }
		public void copyFrom(HavingExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class HavingExpressContext extends HavingExpressionContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingExpressContext(HavingExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterHavingExpress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitHavingExpress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitHavingExpress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingExpressionContext havingExpression() throws RecognitionException {
		HavingExpressionContext _localctx = new HavingExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_havingExpression);
		try {
			_localctx = new HavingExpressContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
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
		enterRule(_localctx, 32, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
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
		int _startState = 34;
		enterRecursionRule(_localctx, 34, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case SELECT:
			case CASE:
			case EXISTS:
			case MINUS:
			case NULL:
			case STRING:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case DOUBLE_VALUE:
			case IDENTIFIER:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(196);
				((PredicatedContext)_localctx).valueExpression = valueExpression();
				setState(198);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
				case 1:
					{
					setState(197);
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
				setState(200);
				match(NOT);
				setState(201);
				booleanExpression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(212);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(210);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(204);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(205);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(206);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(207);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(208);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(209);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(214);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
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
		enterRule(_localctx, 36, RULE_predicate);
		int _la;
		try {
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new ComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(215);
				comparisonOperator();
				setState(216);
				((ComparisonContext)_localctx).right = valueExpression();
				}
				break;
			case 2:
				_localctx = new QuantifiedComparisonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
				comparisonOperator();
				setState(219);
				match(T__2);
				setState(220);
				query();
				setState(221);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new BetweenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(223);
					match(NOT);
					}
				}

				setState(226);
				match(BETWEEN);
				setState(227);
				((BetweenContext)_localctx).lower = valueExpression();
				setState(228);
				match(AND);
				setState(229);
				((BetweenContext)_localctx).upper = valueExpression();
				}
				break;
			case 4:
				_localctx = new InListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(231);
					match(NOT);
					}
				}

				setState(234);
				match(IN);
				setState(235);
				match(T__2);
				setState(236);
				expression();
				setState(241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(237);
					match(T__0);
					setState(238);
					expression();
					}
					}
					setState(243);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(244);
				match(T__3);
				}
				break;
			case 5:
				_localctx = new InSubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(247);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(246);
					match(NOT);
					}
				}

				setState(249);
				match(IN);
				setState(250);
				match(T__2);
				setState(251);
				query();
				setState(252);
				match(T__3);
				}
				break;
			case 6:
				_localctx = new LikeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(254);
					match(NOT);
					}
				}

				setState(257);
				match(LIKE);
				setState(258);
				((LikeContext)_localctx).pattern = valueExpression();
				setState(261);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(259);
					match(ESCAPE);
					setState(260);
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
				setState(263);
				match(IS);
				setState(265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(264);
					match(NOT);
					}
				}

				setState(267);
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
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_valueExpression);
		try {
			_localctx = new ValueExpressionDefaultContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
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
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
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
	public static class SubSupQueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubSupQueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterSubSupQueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitSubSupQueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitSubSupQueryExpression(this);
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

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(273);
				match(NULL);
				}
				break;
			case 2:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				identifier();
				setState(275);
				string();
				}
				break;
			case 3:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(277);
				number();
				}
				break;
			case 4:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(278);
				string();
				}
				break;
			case 5:
				{
				_localctx = new SubSupQueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(279);
				match(T__2);
				setState(280);
				query();
				setState(281);
				match(T__3);
				}
				break;
			case 6:
				{
				_localctx = new SubQueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(283);
				query();
				}
				break;
			case 7:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284);
				match(EXISTS);
				setState(285);
				match(T__2);
				setState(286);
				query();
				setState(287);
				match(T__3);
				}
				break;
			case 8:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(289);
				match(CASE);
				setState(291); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(290);
					whenClause();
					}
					}
					setState(293); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(297);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(295);
					match(ELSE);
					setState(296);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(299);
				match(END);
				}
				break;
			case 9:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301);
				qualifiedName();
				setState(302);
				match(T__2);
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << DISTINCT) | (1L << SELECT) | (1L << CASE) | (1L << NOT) | (1L << EXISTS) | (1L << MINUS) | (1L << NULL) | (1L << STRING) | (1L << INTEGER_VALUE) | (1L << DECIMAL_VALUE) | (1L << DOUBLE_VALUE) | (1L << IDENTIFIER))) != 0)) {
					{
					setState(304);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTINCT) {
						{
						setState(303);
						setQuantifier();
						}
					}

					setState(306);
					expression();
					setState(311);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(307);
						match(T__0);
						setState(308);
						expression();
						}
						}
						setState(313);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(316);
				match(T__3);
				}
				break;
			case 10:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(318);
				identifier();
				}
				break;
			case 11:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(319);
				match(T__2);
				setState(320);
				expression();
				setState(321);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(335);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(333);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(325);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(326);
						match(T__4);
						setState(327);
						((SubscriptContext)_localctx).index = valueExpression();
						setState(328);
						match(T__5);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(330);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(331);
						match(T__1);
						setState(332);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(337);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
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
		enterRule(_localctx, 42, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(WHEN);
			setState(339);
			((WhenClauseContext)_localctx).condition = expression();
			setState(340);
			match(THEN);
			setState(341);
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
		enterRule(_localctx, 44, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(343);
			identifier();
			setState(348);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(344);
					match(T__1);
					setState(345);
					identifier();
					}
					} 
				}
				setState(350);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,42,_ctx);
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
		enterRule(_localctx, 46, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
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
		enterRule(_localctx, 48, RULE_identifier);
		try {
			_localctx = new UnquotedIdentifierContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(IDENTIFIER);
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
		enterRule(_localctx, 50, RULE_string);
		try {
			_localctx = new BasicStringLiteralContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(355);
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
		enterRule(_localctx, 52, RULE_number);
		int _la;
		try {
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(358);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(357);
					match(MINUS);
					}
				}

				setState(360);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(362);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(361);
					match(MINUS);
					}
				}

				setState(364);
				match(DOUBLE_VALUE);
				}
				break;
			case 3:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(366);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(365);
					match(MINUS);
					}
				}

				setState(368);
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
		case 6:
			return tableExpressionExpress_sempred((TableExpressionExpressContext)_localctx, predIndex);
		case 17:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 20:
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
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\66\u0176\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\5\4?\n\4\3\4\3"+
		"\4\3\4\7\4D\n\4\f\4\16\4G\13\4\3\4\3\4\3\4\3\4\7\4M\n\4\f\4\16\4P\13\4"+
		"\5\4R\n\4\3\4\3\4\5\4V\n\4\3\4\3\4\3\4\3\4\3\4\7\4]\n\4\f\4\16\4`\13\4"+
		"\5\4b\n\4\3\4\3\4\3\4\3\4\3\4\7\4i\n\4\f\4\16\4l\13\4\5\4n\n\4\3\4\3\4"+
		"\5\4r\n\4\3\5\3\5\3\6\3\6\5\6x\n\6\3\6\5\6{\n\6\3\6\3\6\3\6\3\6\3\6\5"+
		"\6\u0082\n\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u008f\n\b"+
		"\f\b\16\b\u0092\13\b\3\t\5\t\u0095\n\t\3\t\3\t\5\t\u0099\n\t\3\t\3\t\5"+
		"\t\u009d\n\t\3\t\3\t\5\t\u00a1\n\t\5\t\u00a3\n\t\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\5\f\u00ac\n\f\3\f\5\f\u00af\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u00ba\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\5\23\u00c9\n\23\3\23\3\23\5\23\u00cd\n\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\7\23\u00d5\n\23\f\23\16\23\u00d8\13\23\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00e3\n\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\5\24\u00eb\n\24\3\24\3\24\3\24\3\24\3\24\7\24\u00f2\n\24\f"+
		"\24\16\24\u00f5\13\24\3\24\3\24\3\24\5\24\u00fa\n\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\5\24\u0102\n\24\3\24\3\24\3\24\3\24\5\24\u0108\n\24\3\24"+
		"\3\24\5\24\u010c\n\24\3\24\5\24\u010f\n\24\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\6\26\u0126\n\26\r\26\16\26\u0127\3\26\3\26\5\26\u012c\n\26\3"+
		"\26\3\26\3\26\3\26\3\26\5\26\u0133\n\26\3\26\3\26\3\26\7\26\u0138\n\26"+
		"\f\26\16\26\u013b\13\26\5\26\u013d\n\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u0146\n\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u0150"+
		"\n\26\f\26\16\26\u0153\13\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\7"+
		"\30\u015d\n\30\f\30\16\30\u0160\13\30\3\31\3\31\3\32\3\32\3\33\3\33\3"+
		"\34\5\34\u0169\n\34\3\34\3\34\5\34\u016d\n\34\3\34\3\34\5\34\u0171\n\34"+
		"\3\34\5\34\u0174\n\34\3\34\2\5\16$*\35\2\4\6\b\n\f\16\20\22\24\26\30\32"+
		"\34\36 \"$&(*,.\60\62\64\66\2\3\3\2*/\2\u019c\28\3\2\2\2\4:\3\2\2\2\6"+
		"<\3\2\2\2\bs\3\2\2\2\n\u0081\3\2\2\2\f\u0083\3\2\2\2\16\u0085\3\2\2\2"+
		"\20\u00a2\3\2\2\2\22\u00a4\3\2\2\2\24\u00a7\3\2\2\2\26\u00a9\3\2\2\2\30"+
		"\u00b9\3\2\2\2\32\u00bb\3\2\2\2\34\u00bd\3\2\2\2\36\u00bf\3\2\2\2 \u00c1"+
		"\3\2\2\2\"\u00c3\3\2\2\2$\u00cc\3\2\2\2&\u010e\3\2\2\2(\u0110\3\2\2\2"+
		"*\u0145\3\2\2\2,\u0154\3\2\2\2.\u0159\3\2\2\2\60\u0161\3\2\2\2\62\u0163"+
		"\3\2\2\2\64\u0165\3\2\2\2\66\u0173\3\2\2\289\5\4\3\29\3\3\2\2\2:;\5\6"+
		"\4\2;\5\3\2\2\2<>\7\n\2\2=?\5\b\5\2>=\3\2\2\2>?\3\2\2\2?@\3\2\2\2@E\5"+
		"\n\6\2AB\7\3\2\2BD\5\n\6\2CA\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FQ\3"+
		"\2\2\2GE\3\2\2\2HI\7\13\2\2IN\5\f\7\2JK\7\3\2\2KM\5\f\7\2LJ\3\2\2\2MP"+
		"\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2PN\3\2\2\2QH\3\2\2\2QR\3\2\2\2R"+
		"U\3\2\2\2ST\7\f\2\2TV\5\34\17\2US\3\2\2\2UV\3\2\2\2Va\3\2\2\2WX\7\r\2"+
		"\2XY\7!\2\2Y^\5\32\16\2Z[\7\3\2\2[]\5\32\16\2\\Z\3\2\2\2]`\3\2\2\2^\\"+
		"\3\2\2\2^_\3\2\2\2_b\3\2\2\2`^\3\2\2\2aW\3\2\2\2ab\3\2\2\2bm\3\2\2\2c"+
		"d\7\16\2\2de\7!\2\2ej\5\36\20\2fg\7\3\2\2gi\5\36\20\2hf\3\2\2\2il\3\2"+
		"\2\2jh\3\2\2\2jk\3\2\2\2kn\3\2\2\2lj\3\2\2\2mc\3\2\2\2mn\3\2\2\2nq\3\2"+
		"\2\2op\7\17\2\2pr\5 \21\2qo\3\2\2\2qr\3\2\2\2r\7\3\2\2\2st\7\t\2\2t\t"+
		"\3\2\2\2uz\5\"\22\2vx\7 \2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2y{\5\62\32\2"+
		"zw\3\2\2\2z{\3\2\2\2{\u0082\3\2\2\2|}\5*\26\2}~\7\4\2\2~\177\7\60\2\2"+
		"\177\u0082\3\2\2\2\u0080\u0082\7\60\2\2\u0081u\3\2\2\2\u0081|\3\2\2\2"+
		"\u0081\u0080\3\2\2\2\u0082\13\3\2\2\2\u0083\u0084\5\16\b\2\u0084\r\3\2"+
		"\2\2\u0085\u0086\b\b\1\2\u0086\u0087\5\24\13\2\u0087\u0090\3\2\2\2\u0088"+
		"\u0089\f\4\2\2\u0089\u008a\5\20\t\2\u008a\u008b\7#\2\2\u008b\u008c\5\24"+
		"\13\2\u008c\u008d\5\22\n\2\u008d\u008f\3\2\2\2\u008e\u0088\3\2\2\2\u008f"+
		"\u0092\3\2\2\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\17\3\2\2"+
		"\2\u0092\u0090\3\2\2\2\u0093\u0095\7$\2\2\u0094\u0093\3\2\2\2\u0094\u0095"+
		"\3\2\2\2\u0095\u00a3\3\2\2\2\u0096\u0098\7%\2\2\u0097\u0099\7&\2\2\u0098"+
		"\u0097\3\2\2\2\u0098\u0099\3\2\2\2\u0099\u00a3\3\2\2\2\u009a\u009c\7)"+
		"\2\2\u009b\u009d\7&\2\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d"+
		"\u00a3\3\2\2\2\u009e\u00a0\7\'\2\2\u009f\u00a1\7&\2\2\u00a0\u009f\3\2"+
		"\2\2\u00a0\u00a1\3\2\2\2\u00a1\u00a3\3\2\2\2\u00a2\u0094\3\2\2\2\u00a2"+
		"\u0096\3\2\2\2\u00a2\u009a\3\2\2\2\u00a2\u009e\3\2\2\2\u00a3\21\3\2\2"+
		"\2\u00a4\u00a5\7(\2\2\u00a5\u00a6\5$\23\2\u00a6\23\3\2\2\2\u00a7\u00a8"+
		"\5\26\f\2\u00a8\25\3\2\2\2\u00a9\u00ae\5\30\r\2\u00aa\u00ac\7 \2\2\u00ab"+
		"\u00aa\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u00ad\3\2\2\2\u00ad\u00af\5\62"+
		"\32\2\u00ae\u00ab\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\27\3\2\2\2\u00b0\u00ba"+
		"\5.\30\2\u00b1\u00b2\7\5\2\2\u00b2\u00b3\5\4\3\2\u00b3\u00b4\7\6\2\2\u00b4"+
		"\u00ba\3\2\2\2\u00b5\u00b6\7\5\2\2\u00b6\u00b7\5\f\7\2\u00b7\u00b8\7\6"+
		"\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b0\3\2\2\2\u00b9\u00b1\3\2\2\2\u00b9"+
		"\u00b5\3\2\2\2\u00ba\31\3\2\2\2\u00bb\u00bc\5\"\22\2\u00bc\33\3\2\2\2"+
		"\u00bd\u00be\5$\23\2\u00be\35\3\2\2\2\u00bf\u00c0\5\"\22\2\u00c0\37\3"+
		"\2\2\2\u00c1\u00c2\5$\23\2\u00c2!\3\2\2\2\u00c3\u00c4\5$\23\2\u00c4#\3"+
		"\2\2\2\u00c5\u00c6\b\23\1\2\u00c6\u00c8\5(\25\2\u00c7\u00c9\5&\24\2\u00c8"+
		"\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cd\3\2\2\2\u00ca\u00cb\7\26"+
		"\2\2\u00cb\u00cd\5$\23\5\u00cc\u00c5\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd"+
		"\u00d6\3\2\2\2\u00ce\u00cf\f\4\2\2\u00cf\u00d0\7\25\2\2\u00d0\u00d5\5"+
		"$\23\5\u00d1\u00d2\f\3\2\2\u00d2\u00d3\7\27\2\2\u00d3\u00d5\5$\23\4\u00d4"+
		"\u00ce\3\2\2\2\u00d4\u00d1\3\2\2\2\u00d5\u00d8\3\2\2\2\u00d6\u00d4\3\2"+
		"\2\2\u00d6\u00d7\3\2\2\2\u00d7%\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d9\u00da"+
		"\5\60\31\2\u00da\u00db\5(\25\2\u00db\u010f\3\2\2\2\u00dc\u00dd\5\60\31"+
		"\2\u00dd\u00de\7\5\2\2\u00de\u00df\5\4\3\2\u00df\u00e0\7\6\2\2\u00e0\u010f"+
		"\3\2\2\2\u00e1\u00e3\7\26\2\2\u00e2\u00e1\3\2\2\2\u00e2\u00e3\3\2\2\2"+
		"\u00e3\u00e4\3\2\2\2\u00e4\u00e5\7\30\2\2\u00e5\u00e6\5(\25\2\u00e6\u00e7"+
		"\7\25\2\2\u00e7\u00e8\5(\25\2\u00e8\u010f\3\2\2\2\u00e9\u00eb\7\26\2\2"+
		"\u00ea\u00e9\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed"+
		"\7\31\2\2\u00ed\u00ee\7\5\2\2\u00ee\u00f3\5\"\22\2\u00ef\u00f0\7\3\2\2"+
		"\u00f0\u00f2\5\"\22\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1"+
		"\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00f7\7\6\2\2\u00f7\u010f\3\2\2\2\u00f8\u00fa\7\26\2\2\u00f9\u00f8\3"+
		"\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fc\7\31\2\2\u00fc"+
		"\u00fd\7\5\2\2\u00fd\u00fe\5\4\3\2\u00fe\u00ff\7\6\2\2\u00ff\u010f\3\2"+
		"\2\2\u0100\u0102\7\26\2\2\u0101\u0100\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0103\3\2\2\2\u0103\u0104\7\32\2\2\u0104\u0107\5(\25\2\u0105\u0106\7"+
		"\33\2\2\u0106\u0108\5(\25\2\u0107\u0105\3\2\2\2\u0107\u0108\3\2\2\2\u0108"+
		"\u010f\3\2\2\2\u0109\u010b\7\37\2\2\u010a\u010c\7\26\2\2\u010b\u010a\3"+
		"\2\2\2\u010b\u010c\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010f\7\"\2\2\u010e"+
		"\u00d9\3\2\2\2\u010e\u00dc\3\2\2\2\u010e\u00e2\3\2\2\2\u010e\u00ea\3\2"+
		"\2\2\u010e\u00f9\3\2\2\2\u010e\u0101\3\2\2\2\u010e\u0109\3\2\2\2\u010f"+
		"\'\3\2\2\2\u0110\u0111\5*\26\2\u0111)\3\2\2\2\u0112\u0113\b\26\1\2\u0113"+
		"\u0146\7\"\2\2\u0114\u0115\5\62\32\2\u0115\u0116\5\64\33\2\u0116\u0146"+
		"\3\2\2\2\u0117\u0146\5\66\34\2\u0118\u0146\5\64\33\2\u0119\u011a\7\5\2"+
		"\2\u011a\u011b\5\4\3\2\u011b\u011c\7\6\2\2\u011c\u0146\3\2\2\2\u011d\u0146"+
		"\5\4\3\2\u011e\u011f\7\34\2\2\u011f\u0120\7\5\2\2\u0120\u0121\5\4\3\2"+
		"\u0121\u0122\7\6\2\2\u0122\u0146\3\2\2\2\u0123\u0125\7\20\2\2\u0124\u0126"+
		"\5,\27\2\u0125\u0124\3\2\2\2\u0126\u0127\3\2\2\2\u0127\u0125\3\2\2\2\u0127"+
		"\u0128\3\2\2\2\u0128\u012b\3\2\2\2\u0129\u012a\7\23\2\2\u012a\u012c\5"+
		"\"\22\2\u012b\u0129\3\2\2\2\u012b\u012c\3\2\2\2\u012c\u012d\3\2\2\2\u012d"+
		"\u012e\7\24\2\2\u012e\u0146\3\2\2\2\u012f\u0130\5.\30\2\u0130\u013c\7"+
		"\5\2\2\u0131\u0133\5\b\5\2\u0132\u0131\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u0134\3\2\2\2\u0134\u0139\5\"\22\2\u0135\u0136\7\3\2\2\u0136\u0138\5"+
		"\"\22\2\u0137\u0135\3\2\2\2\u0138\u013b\3\2\2\2\u0139\u0137\3\2\2\2\u0139"+
		"\u013a\3\2\2\2\u013a\u013d\3\2\2\2\u013b\u0139\3\2\2\2\u013c\u0132\3\2"+
		"\2\2\u013c\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u013f\7\6\2\2\u013f"+
		"\u0146\3\2\2\2\u0140\u0146\5\62\32\2\u0141\u0142\7\5\2\2\u0142\u0143\5"+
		"\"\22\2\u0143\u0144\7\6\2\2\u0144\u0146\3\2\2\2\u0145\u0112\3\2\2\2\u0145"+
		"\u0114\3\2\2\2\u0145\u0117\3\2\2\2\u0145\u0118\3\2\2\2\u0145\u0119\3\2"+
		"\2\2\u0145\u011d\3\2\2\2\u0145\u011e\3\2\2\2\u0145\u0123\3\2\2\2\u0145"+
		"\u012f\3\2\2\2\u0145\u0140\3\2\2\2\u0145\u0141\3\2\2\2\u0146\u0151\3\2"+
		"\2\2\u0147\u0148\f\7\2\2\u0148\u0149\7\7\2\2\u0149\u014a\5(\25\2\u014a"+
		"\u014b\7\b\2\2\u014b\u0150\3\2\2\2\u014c\u014d\f\4\2\2\u014d\u014e\7\4"+
		"\2\2\u014e\u0150\5\62\32\2\u014f\u0147\3\2\2\2\u014f\u014c\3\2\2\2\u0150"+
		"\u0153\3\2\2\2\u0151\u014f\3\2\2\2\u0151\u0152\3\2\2\2\u0152+\3\2\2\2"+
		"\u0153\u0151\3\2\2\2\u0154\u0155\7\21\2\2\u0155\u0156\5\"\22\2\u0156\u0157"+
		"\7\22\2\2\u0157\u0158\5\"\22\2\u0158-\3\2\2\2\u0159\u015e\5\62\32\2\u015a"+
		"\u015b\7\4\2\2\u015b\u015d\5\62\32\2\u015c\u015a\3\2\2\2\u015d\u0160\3"+
		"\2\2\2\u015e\u015c\3\2\2\2\u015e\u015f\3\2\2\2\u015f/\3\2\2\2\u0160\u015e"+
		"\3\2\2\2\u0161\u0162\t\2\2\2\u0162\61\3\2\2\2\u0163\u0164\7\65\2\2\u0164"+
		"\63\3\2\2\2\u0165\u0166\7\61\2\2\u0166\65\3\2\2\2\u0167\u0169\7\35\2\2"+
		"\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169\u016a\3\2\2\2\u016a\u0174"+
		"\7\63\2\2\u016b\u016d\7\35\2\2\u016c\u016b\3\2\2\2\u016c\u016d\3\2\2\2"+
		"\u016d\u016e\3\2\2\2\u016e\u0174\7\64\2\2\u016f\u0171\7\35\2\2\u0170\u016f"+
		"\3\2\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0174\7\62\2\2"+
		"\u0173\u0168\3\2\2\2\u0173\u016c\3\2\2\2\u0173\u0170\3\2\2\2\u0174\67"+
		"\3\2\2\2\61>ENQU^ajmqwz\u0081\u0090\u0094\u0098\u009c\u00a0\u00a2\u00ab"+
		"\u00ae\u00b9\u00c8\u00cc\u00d4\u00d6\u00e2\u00ea\u00f3\u00f9\u0101\u0107"+
		"\u010b\u010e\u0127\u012b\u0132\u0139\u013c\u0145\u014f\u0151\u015e\u0168"+
		"\u016c\u0170\u0173";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}