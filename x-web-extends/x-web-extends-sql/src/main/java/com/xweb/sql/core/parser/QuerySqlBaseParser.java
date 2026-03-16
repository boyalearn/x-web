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
	public static final int
		RULE_statement = 0, RULE_query = 1, RULE_unionExpress = 2, RULE_queryItem = 3, 
		RULE_queryNoWith = 4, RULE_queryPrimary = 5, RULE_orderByPart = 6, RULE_matchThenExpression = 7, 
		RULE_mergeOperator = 8, RULE_limitRowCount = 9, RULE_rowCount = 10, RULE_setQuantifier = 11, 
		RULE_selectItem = 12, RULE_tableExpression = 13, RULE_tableExpressionExpress = 14, 
		RULE_joinType = 15, RULE_joinCondition = 16, RULE_simpleTableExpression = 17, 
		RULE_aliasedTableExpression = 18, RULE_tableExpressPrimary = 19, RULE_unionTableExpress = 20, 
		RULE_groupByExpression = 21, RULE_whereExpression = 22, RULE_orderByExpression = 23, 
		RULE_havingExpression = 24, RULE_expression = 25, RULE_booleanExpression = 26, 
		RULE_predicate = 27, RULE_valueExpression = 28, RULE_timeZoneSpecifier = 29, 
		RULE_interval = 30, RULE_intervalField = 31, RULE_primaryExpression = 32, 
		RULE_onDuplicateCondition = 33, RULE_columnAliases = 34, RULE_valueAliases = 35, 
		RULE_whenClause = 36, RULE_qualifiedName = 37, RULE_comparisonOperator = 38, 
		RULE_identifier = 39, RULE_string = 40, RULE_number = 41;
	private static String[] makeRuleNames() {
		return new String[] {
			"statement", "query", "unionExpress", "queryItem", "queryNoWith", "queryPrimary", 
			"orderByPart", "matchThenExpression", "mergeOperator", "limitRowCount", 
			"rowCount", "setQuantifier", "selectItem", "tableExpression", "tableExpressionExpress", 
			"joinType", "joinCondition", "simpleTableExpression", "aliasedTableExpression", 
			"tableExpressPrimary", "unionTableExpress", "groupByExpression", "whereExpression", 
			"orderByExpression", "havingExpression", "expression", "booleanExpression", 
			"predicate", "valueExpression", "timeZoneSpecifier", "interval", "intervalField", 
			"primaryExpression", "onDuplicateCondition", "columnAliases", "valueAliases", 
			"whenClause", "qualifiedName", "comparisonOperator", "identifier", "string", 
			"number"
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
	public static class InsertIntoDefaultContext extends StatementContext {
		public TerminalNode INSERT() { return getToken(QuerySqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(QuerySqlBaseParser.INTO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(QuerySqlBaseParser.VALUES, 0); }
		public ValueAliasesContext valueAliases() {
			return getRuleContext(ValueAliasesContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public OnDuplicateConditionContext onDuplicateCondition() {
			return getRuleContext(OnDuplicateConditionContext.class,0);
		}
		public InsertIntoDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterInsertIntoDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitInsertIntoDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitInsertIntoDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpdateDefaultContext extends StatementContext {
		public TerminalNode UPDATE() { return getToken(QuerySqlBaseParser.UPDATE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode SET() { return getToken(QuerySqlBaseParser.SET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(QuerySqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public UpdateDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterUpdateDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitUpdateDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitUpdateDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoAsQueryContext extends StatementContext {
		public TerminalNode INSERT() { return getToken(QuerySqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(QuerySqlBaseParser.INTO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public InsertIntoAsQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterInsertIntoAsQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitInsertIntoAsQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitInsertIntoAsQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeDefaultContext extends StatementContext {
		public TableExpressionContext target;
		public TableExpressionContext useTable;
		public TerminalNode MERGE() { return getToken(QuerySqlBaseParser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(QuerySqlBaseParser.INTO, 0); }
		public TerminalNode USING() { return getToken(QuerySqlBaseParser.USING, 0); }
		public TerminalNode ON() { return getToken(QuerySqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public List<TableExpressionContext> tableExpression() {
			return getRuleContexts(TableExpressionContext.class);
		}
		public TableExpressionContext tableExpression(int i) {
			return getRuleContext(TableExpressionContext.class,i);
		}
		public List<MatchThenExpressionContext> matchThenExpression() {
			return getRuleContexts(MatchThenExpressionContext.class);
		}
		public MatchThenExpressionContext matchThenExpression(int i) {
			return getRuleContext(MatchThenExpressionContext.class,i);
		}
		public MergeDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterMergeDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitMergeDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitMergeDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteDefaultContext extends StatementContext {
		public TerminalNode DELETE() { return getToken(QuerySqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(QuerySqlBaseParser.FROM, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(QuerySqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public DeleteDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterDeleteDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitDeleteDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitDeleteDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_statement);
		int _la;
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				query();
				}
				break;
			case 2:
				_localctx = new InsertIntoDefaultContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(INSERT);
				setState(86);
				match(INTO);
				setState(87);
				qualifiedName();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(88);
					columnAliases();
					}
				}

				setState(91);
				match(VALUES);
				setState(92);
				valueAliases();
				setState(94);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(93);
					onDuplicateCondition();
					}
				}

				}
				break;
			case 3:
				_localctx = new InsertIntoAsQueryContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(96);
				match(INSERT);
				setState(97);
				match(INTO);
				setState(98);
				qualifiedName();
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(99);
					columnAliases();
					}
				}

				setState(102);
				query();
				}
				break;
			case 4:
				_localctx = new DeleteDefaultContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(DELETE);
				setState(105);
				match(FROM);
				setState(106);
				qualifiedName();
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(107);
					match(WHERE);
					setState(108);
					booleanExpression(0);
					}
				}

				}
				break;
			case 5:
				_localctx = new UpdateDefaultContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(111);
				match(UPDATE);
				setState(112);
				qualifiedName();
				setState(113);
				match(SET);
				setState(114);
				expression();
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(115);
					match(T__0);
					setState(116);
					expression();
					}
				}

				setState(121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(119);
					match(WHERE);
					setState(120);
					booleanExpression(0);
					}
				}

				}
				break;
			case 6:
				_localctx = new MergeDefaultContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(123);
				match(MERGE);
				setState(124);
				match(INTO);
				setState(125);
				((MergeDefaultContext)_localctx).target = tableExpression();
				setState(126);
				match(USING);
				setState(127);
				((MergeDefaultContext)_localctx).useTable = tableExpression();
				setState(128);
				match(ON);
				setState(129);
				booleanExpression(0);
				setState(131); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(130);
					matchThenExpression();
					}
					}
					setState(133); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
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
			setState(137);
			queryItem();
			setState(141);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(138);
					unionExpress();
					}
					} 
				}
				setState(143);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
			setState(144);
			match(UNION);
			setState(146);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(145);
				setQuantifier();
				}
			}

			setState(148);
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
			setState(150);
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
			setState(152);
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
			setState(154);
			match(SELECT);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(155);
				setQuantifier();
				}
			}

			setState(158);
			selectItem();
			setState(163);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(159);
					match(T__0);
					setState(160);
					selectItem();
					}
					} 
				}
				setState(165);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			}
			setState(175);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(166);
				match(FROM);
				setState(167);
				tableExpression();
				setState(172);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(168);
						match(T__0);
						setState(169);
						tableExpression();
						}
						} 
					}
					setState(174);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				}
				}
				break;
			}
			setState(179);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(177);
				match(WHERE);
				setState(178);
				((QueryPrimaryContext)_localctx).where = whereExpression();
				}
				break;
			}
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(181);
				match(GROUP);
				setState(182);
				match(BY);
				setState(183);
				groupByExpression();
				setState(188);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(184);
						match(T__0);
						setState(185);
						groupByExpression();
						}
						} 
					}
					setState(190);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
				}
				}
				break;
			}
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(193);
				orderByPart();
				}
				break;
			}
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(196);
				match(HAVING);
				setState(197);
				((QueryPrimaryContext)_localctx).having = havingExpression();
				}
				break;
			}
			setState(213);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				{
				setState(200);
				match(LIMIT);
				setState(201);
				((QueryPrimaryContext)_localctx).limit = limitRowCount();
				}
				}
				break;
			case 2:
				{
				{
				setState(202);
				match(FETCH);
				setState(203);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==NEXT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << SELECT) | (1L << CASE) | (1L << EXISTS) | (1L << NULL))) != 0) || ((((_la - 80)) & ~0x3f) == 0 && ((1L << (_la - 80)) & ((1L << (PLUS - 80)) | (1L << (MINUS - 80)) | (1L << (PARAMETER - 80)) | (1L << (D_ANT - 80)) | (1L << (STRING - 80)) | (1L << (INTEGER_VALUE - 80)) | (1L << (DECIMAL_VALUE - 80)) | (1L << (DOUBLE_VALUE - 80)) | (1L << (IDENTIFIER - 80)))) != 0)) {
					{
					setState(204);
					((QueryPrimaryContext)_localctx).fetchFirst = rowCount();
					}
				}

				setState(207);
				_la = _input.LA(1);
				if ( !(_la==ROW || _la==ROWS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(211);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ONLY:
					{
					setState(208);
					match(ONLY);
					}
					break;
				case WITH:
					{
					setState(209);
					match(WITH);
					setState(210);
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
			setState(215);
			match(ORDER);
			setState(216);
			match(BY);
			setState(217);
			orderByExpression();
			setState(222);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(218);
					match(T__0);
					setState(219);
					orderByExpression();
					}
					} 
				}
				setState(224);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class MatchThenExpressionContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(QuerySqlBaseParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(QuerySqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(QuerySqlBaseParser.THEN, 0); }
		public MergeOperatorContext mergeOperator() {
			return getRuleContext(MergeOperatorContext.class,0);
		}
		public TerminalNode NOT() { return getToken(QuerySqlBaseParser.NOT, 0); }
		public TerminalNode BY() { return getToken(QuerySqlBaseParser.BY, 0); }
		public TerminalNode SOURCE() { return getToken(QuerySqlBaseParser.SOURCE, 0); }
		public MatchThenExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchThenExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterMatchThenExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitMatchThenExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitMatchThenExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchThenExpressionContext matchThenExpression() throws RecognitionException {
		MatchThenExpressionContext _localctx = new MatchThenExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_matchThenExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(WHEN);
			setState(227);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(226);
				match(NOT);
				}
			}

			setState(229);
			match(MATCHED);
			setState(232);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(230);
				match(BY);
				setState(231);
				match(SOURCE);
				}
			}

			setState(234);
			match(THEN);
			setState(235);
			mergeOperator();
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

	public static class MergeOperatorContext extends ParserRuleContext {
		public MergeOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mergeOperator; }
	 
		public MergeOperatorContext() { }
		public void copyFrom(MergeOperatorContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MergeDeleteOperatorContext extends MergeOperatorContext {
		public TerminalNode DELETE() { return getToken(QuerySqlBaseParser.DELETE, 0); }
		public MergeDeleteOperatorContext(MergeOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterMergeDeleteOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitMergeDeleteOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitMergeDeleteOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeUpdateOperatorContext extends MergeOperatorContext {
		public TerminalNode UPDATE() { return getToken(QuerySqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(QuerySqlBaseParser.SET, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode KEY() { return getToken(QuerySqlBaseParser.KEY, 0); }
		public MergeUpdateOperatorContext(MergeOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterMergeUpdateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitMergeUpdateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitMergeUpdateOperator(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeInsertOperatorContext extends MergeOperatorContext {
		public TerminalNode INSERT() { return getToken(QuerySqlBaseParser.INSERT, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public TerminalNode VALUES() { return getToken(QuerySqlBaseParser.VALUES, 0); }
		public ValueAliasesContext valueAliases() {
			return getRuleContext(ValueAliasesContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public MergeInsertOperatorContext(MergeOperatorContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterMergeInsertOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitMergeInsertOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitMergeInsertOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MergeOperatorContext mergeOperator() throws RecognitionException {
		MergeOperatorContext _localctx = new MergeOperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_mergeOperator);
		int _la;
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UPDATE:
				_localctx = new MergeUpdateOperatorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(237);
				match(UPDATE);
				setState(239);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==KEY) {
					{
					setState(238);
					match(KEY);
					}
				}

				setState(241);
				match(SET);
				setState(242);
				expression();
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(243);
					match(T__0);
					setState(244);
					expression();
					}
				}

				}
				break;
			case DELETE:
				_localctx = new MergeDeleteOperatorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				match(DELETE);
				}
				break;
			case INSERT:
				_localctx = new MergeInsertOperatorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				match(INSERT);
				setState(250);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__6 || _la==IDENTIFIER) {
					{
					setState(249);
					qualifiedName();
					}
				}

				setState(252);
				columnAliases();
				setState(253);
				match(VALUES);
				setState(254);
				valueAliases();
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
		enterRule(_localctx, 18, RULE_limitRowCount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			rowCount();
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				setState(259);
				match(T__0);
				setState(260);
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
		enterRule(_localctx, 20, RULE_rowCount);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			valueExpression(0);
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
		enterRule(_localctx, 22, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
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
		enterRule(_localctx, 24, RULE_selectItem);
		int _la;
		try {
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				_localctx = new SelectSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(267);
				expression();
				setState(272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
				case 1:
					{
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(268);
						match(AS);
						}
					}

					setState(271);
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
				setState(274);
				primaryExpression(0);
				setState(275);
				match(T__1);
				setState(276);
				match(ASTERISK);
				}
				break;
			case 3:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(278);
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
		enterRule(_localctx, 26, RULE_tableExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
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
		int _startState = 28;
		enterRecursionRule(_localctx, 28, RULE_tableExpressionExpress, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new SimpleTableExpressContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(284);
			simpleTableExpression();
			}
			_ctx.stop = _input.LT(-1);
			setState(294);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinTableExpressContext(new TableExpressionExpressContext(_parentctx, _parentState));
					((JoinTableExpressContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_tableExpressionExpress);
					setState(286);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(287);
					joinType();
					setState(288);
					match(JOIN);
					setState(289);
					((JoinTableExpressContext)_localctx).right = simpleTableExpression();
					setState(290);
					joinCondition();
					}
					} 
				}
				setState(296);
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
		enterRule(_localctx, 30, RULE_joinType);
		int _la;
		try {
			setState(312);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(297);
					match(INNER);
					}
				}

				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(300);
				match(LEFT);
				setState(302);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(301);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(304);
				match(RIGHT);
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(305);
					match(OUTER);
					}
				}

				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(308);
				match(FULL);
				setState(310);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(309);
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
		enterRule(_localctx, 32, RULE_joinCondition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(ON);
			setState(315);
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
		enterRule(_localctx, 34, RULE_simpleTableExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
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
		enterRule(_localctx, 36, RULE_aliasedTableExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			tableExpressPrimary();
			setState(324);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(321);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(320);
					match(AS);
					}
				}

				setState(323);
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
		enterRule(_localctx, 38, RULE_tableExpressPrimary);
		int _la;
		try {
			setState(344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				_localctx = new TableNameExpressContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new UnionSelectTableExpressContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(327);
				match(T__2);
				setState(328);
				tableExpression();
				setState(330); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(329);
					unionTableExpress();
					}
					}
					setState(332); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==UNION );
				setState(334);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new SubQueryTableExpressContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(336);
				match(T__2);
				setState(337);
				query();
				setState(338);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new SubTableExpressionExpressContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(340);
				match(T__2);
				setState(341);
				tableExpression();
				setState(342);
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
		enterRule(_localctx, 40, RULE_unionTableExpress);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(UNION);
			setState(348);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT || _la==ALL) {
				{
				setState(347);
				setQuantifier();
				}
			}

			setState(350);
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
		enterRule(_localctx, 42, RULE_groupByExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
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
		enterRule(_localctx, 44, RULE_whereExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
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
		enterRule(_localctx, 46, RULE_orderByExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(356);
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
		enterRule(_localctx, 48, RULE_havingExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
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
		enterRule(_localctx, 50, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
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
		int _startState = 52;
		enterRecursionRule(_localctx, 52, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__6:
			case SELECT:
			case CASE:
			case EXISTS:
			case NULL:
			case PLUS:
			case MINUS:
			case PARAMETER:
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

				setState(363);
				((PredicatedContext)_localctx).valueExpression = valueExpression(0);
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(364);
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
				setState(367);
				match(NOT);
				setState(368);
				booleanExpression(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(379);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(377);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(371);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(372);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(373);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(374);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(375);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(376);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(381);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
		enterRule(_localctx, 54, RULE_predicate);
		int _la;
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				_localctx = new ComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(382);
				comparisonOperator();
				setState(383);
				((ComparisonContext)_localctx).right = valueExpression(0);
				}
				break;
			case 2:
				_localctx = new QuantifiedComparisonContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				comparisonOperator();
				setState(386);
				match(T__2);
				setState(387);
				query();
				setState(388);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new BetweenContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(390);
					match(NOT);
					}
				}

				setState(393);
				match(BETWEEN);
				setState(394);
				((BetweenContext)_localctx).lower = valueExpression(0);
				setState(395);
				match(AND);
				setState(396);
				((BetweenContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 4:
				_localctx = new InListContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(398);
					match(NOT);
					}
				}

				setState(401);
				match(IN);
				setState(402);
				match(T__2);
				setState(403);
				expression();
				setState(408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(404);
					match(T__0);
					setState(405);
					expression();
					}
					}
					setState(410);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(411);
				match(T__3);
				}
				break;
			case 5:
				_localctx = new InSubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(413);
					match(NOT);
					}
				}

				setState(416);
				match(IN);
				setState(417);
				match(T__2);
				setState(418);
				query();
				setState(419);
				match(T__3);
				}
				break;
			case 6:
				_localctx = new LikeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(422);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(421);
					match(NOT);
					}
				}

				setState(424);
				match(LIKE);
				setState(425);
				((LikeContext)_localctx).pattern = valueExpression(0);
				setState(428);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,53,_ctx) ) {
				case 1:
					{
					setState(426);
					match(ESCAPE);
					setState(427);
					((LikeContext)_localctx).escape = valueExpression(0);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new NullPredicateContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(430);
				match(IS);
				setState(432);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(431);
					match(NOT);
					}
				}

				setState(434);
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
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(QuerySqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(QuerySqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(QuerySqlBaseParser.PERCENT, 0); }
		public TerminalNode PLUS() { return getToken(QuerySqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(QuerySqlBaseParser.MINUS, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(QuerySqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(QuerySqlBaseParser.PLUS, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtTimeZoneContext extends ValueExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode AT() { return getToken(QuerySqlBaseParser.AT, 0); }
		public TimeZoneSpecifierContext timeZoneSpecifier() {
			return getRuleContext(TimeZoneSpecifierContext.class,0);
		}
		public AtTimeZoneContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterAtTimeZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitAtTimeZone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitAtTimeZone(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatenationExpressionContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public TerminalNode CONCAT() { return getToken(QuerySqlBaseParser.CONCAT, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ConcatenationExpressionContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterConcatenationExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitConcatenationExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitConcatenationExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(438);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(439);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(440);
				valueExpression(4);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(457);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(455);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(443);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(444);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 82)) & ~0x3f) == 0 && ((1L << (_la - 82)) & ((1L << (ASTERISK - 82)) | (1L << (SLASH - 82)) | (1L << (PERCENT - 82)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(445);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(446);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(447);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(448);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 3:
						{
						_localctx = new ConcatenationExpressionContext(new ValueExpressionContext(_parentctx, _parentState));
						((ConcatenationExpressionContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(449);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(450);
						match(CONCAT);
						setState(451);
						((ConcatenationExpressionContext)_localctx).right = valueExpression(2);
						}
						break;
					case 4:
						{
						_localctx = new AtTimeZoneContext(new ValueExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(452);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(453);
						match(AT);
						setState(454);
						timeZoneSpecifier();
						}
						break;
					}
					} 
				}
				setState(459);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,58,_ctx);
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

	public static class TimeZoneSpecifierContext extends ParserRuleContext {
		public TimeZoneSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeZoneSpecifier; }
	 
		public TimeZoneSpecifierContext() { }
		public void copyFrom(TimeZoneSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimeZoneIntervalContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(QuerySqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(QuerySqlBaseParser.ZONE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TimeZoneIntervalContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterTimeZoneInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitTimeZoneInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitTimeZoneInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeZoneStringContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(QuerySqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(QuerySqlBaseParser.ZONE, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TimeZoneStringContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterTimeZoneString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitTimeZoneString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitTimeZoneString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeZoneSpecifierContext timeZoneSpecifier() throws RecognitionException {
		TimeZoneSpecifierContext _localctx = new TimeZoneSpecifierContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_timeZoneSpecifier);
		try {
			setState(466);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				_localctx = new TimeZoneIntervalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(460);
				match(TIME);
				setState(461);
				match(ZONE);
				setState(462);
				interval();
				}
				break;
			case 2:
				_localctx = new TimeZoneStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(463);
				match(TIME);
				setState(464);
				match(ZONE);
				setState(465);
				string();
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

	public static class IntervalContext extends ParserRuleContext {
		public Token sign;
		public IntervalFieldContext from;
		public IntervalFieldContext to;
		public TerminalNode INTERVAL() { return getToken(QuerySqlBaseParser.INTERVAL, 0); }
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TerminalNode TO() { return getToken(QuerySqlBaseParser.TO, 0); }
		public TerminalNode PLUS() { return getToken(QuerySqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(QuerySqlBaseParser.MINUS, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(468);
			match(INTERVAL);
			setState(470);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(469);
				((IntervalContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((IntervalContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(472);
			string();
			setState(473);
			((IntervalContext)_localctx).from = intervalField();
			setState(476);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(474);
				match(TO);
				setState(475);
				((IntervalContext)_localctx).to = intervalField();
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

	public static class IntervalFieldContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(QuerySqlBaseParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(QuerySqlBaseParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(QuerySqlBaseParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(QuerySqlBaseParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(QuerySqlBaseParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(QuerySqlBaseParser.SECOND, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_intervalField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(478);
			_la = _input.LA(1);
			if ( !(((((_la - 70)) & ~0x3f) == 0 && ((1L << (_la - 70)) & ((1L << (YEAR - 70)) | (1L << (MONTH - 70)) | (1L << (DAY - 70)) | (1L << (HOUR - 70)) | (1L << (MINUTE - 70)) | (1L << (SECOND - 70)))) != 0)) ) {
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
		public TerminalNode PARAMETER() { return getToken(QuerySqlBaseParser.PARAMETER, 0); }
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
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(538);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
			case 1:
				{
				_localctx = new DynamicParameterContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(481);
				match(PARAMETER);
				}
				break;
			case 2:
				{
				_localctx = new SpecialVariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(482);
				match(D_ANT);
				setState(483);
				identifier();
				}
				break;
			case 3:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(484);
				match(NULL);
				}
				break;
			case 4:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(485);
				identifier();
				setState(486);
				string();
				}
				break;
			case 5:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(488);
				number();
				}
				break;
			case 6:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(489);
				string();
				}
				break;
			case 7:
				{
				_localctx = new SubPriorityQueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(490);
				match(T__2);
				setState(491);
				query();
				setState(492);
				match(T__3);
				}
				break;
			case 8:
				{
				_localctx = new SubQueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(494);
				query();
				}
				break;
			case 9:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(495);
				match(EXISTS);
				setState(496);
				match(T__2);
				setState(497);
				query();
				setState(498);
				match(T__3);
				}
				break;
			case 10:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(500);
				match(CASE);
				setState(502); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(501);
					whenClause();
					}
					}
					setState(504); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(508);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(506);
					match(ELSE);
					setState(507);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(510);
				match(END);
				}
				break;
			case 11:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(512);
				qualifiedName();
				setState(513);
				match(T__2);
				setState(525);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__6) | (1L << DISTINCT) | (1L << SELECT) | (1L << CASE) | (1L << NOT) | (1L << EXISTS) | (1L << NULL))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ALL - 64)) | (1L << (PLUS - 64)) | (1L << (MINUS - 64)) | (1L << (PARAMETER - 64)) | (1L << (D_ANT - 64)) | (1L << (STRING - 64)) | (1L << (INTEGER_VALUE - 64)) | (1L << (DECIMAL_VALUE - 64)) | (1L << (DOUBLE_VALUE - 64)) | (1L << (IDENTIFIER - 64)))) != 0)) {
					{
					setState(515);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTINCT || _la==ALL) {
						{
						setState(514);
						setQuantifier();
						}
					}

					setState(517);
					expression();
					setState(522);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(518);
						match(T__0);
						setState(519);
						expression();
						}
						}
						setState(524);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(527);
				match(T__3);
				}
				break;
			case 12:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(529);
				qualifiedName();
				setState(530);
				match(T__2);
				setState(531);
				match(T__3);
				}
				break;
			case 13:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(533);
				identifier();
				}
				break;
			case 14:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(534);
				match(T__2);
				setState(535);
				expression();
				setState(536);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(554);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(552);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
					case 1:
						{
						_localctx = new SubScriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubScriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(540);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(541);
						match(T__4);
						setState(542);
						((SubScriptContext)_localctx).index = valueExpression(0);
						setState(545);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__0) {
							{
							setState(543);
							match(T__0);
							setState(544);
							valueExpression(0);
							}
						}

						setState(547);
						match(T__5);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(549);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(550);
						match(T__1);
						setState(551);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(556);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
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

	public static class OnDuplicateConditionContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(QuerySqlBaseParser.ON, 0); }
		public TerminalNode DUPLICATE() { return getToken(QuerySqlBaseParser.DUPLICATE, 0); }
		public TerminalNode KEY() { return getToken(QuerySqlBaseParser.KEY, 0); }
		public TerminalNode UPDATE() { return getToken(QuerySqlBaseParser.UPDATE, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OnDuplicateConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onDuplicateCondition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterOnDuplicateCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitOnDuplicateCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitOnDuplicateCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnDuplicateConditionContext onDuplicateCondition() throws RecognitionException {
		OnDuplicateConditionContext _localctx = new OnDuplicateConditionContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_onDuplicateCondition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(557);
			match(ON);
			setState(558);
			match(DUPLICATE);
			setState(559);
			match(KEY);
			setState(560);
			match(UPDATE);
			setState(561);
			expression();
			setState(564);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0) {
				{
				setState(562);
				match(T__0);
				setState(563);
				expression();
				}
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

	public static class ColumnAliasesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ColumnAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAliases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterColumnAliases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitColumnAliases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitColumnAliases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasesContext columnAliases() throws RecognitionException {
		ColumnAliasesContext _localctx = new ColumnAliasesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_columnAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			match(T__2);
			setState(567);
			identifier();
			setState(572);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(568);
				match(T__0);
				setState(569);
				identifier();
				}
				}
				setState(574);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(575);
			match(T__3);
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

	public static class ValueAliasesContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ValueAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueAliases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).enterValueAliases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof QuerySqlBaseListener ) ((QuerySqlBaseListener)listener).exitValueAliases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof QuerySqlBaseVisitor ) return ((QuerySqlBaseVisitor<? extends T>)visitor).visitValueAliases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueAliasesContext valueAliases() throws RecognitionException {
		ValueAliasesContext _localctx = new ValueAliasesContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_valueAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(577);
			match(T__2);
			setState(578);
			expression();
			setState(583);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(579);
				match(T__0);
				setState(580);
				expression();
				}
				}
				setState(585);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(586);
			match(T__3);
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
		enterRule(_localctx, 72, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(588);
			match(WHEN);
			setState(589);
			((WhenClauseContext)_localctx).condition = expression();
			setState(590);
			match(THEN);
			setState(591);
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
		enterRule(_localctx, 74, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			identifier();
			setState(598);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(594);
					match(T__1);
					setState(595);
					identifier();
					}
					} 
				}
				setState(600);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,74,_ctx);
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
		enterRule(_localctx, 76, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(601);
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
		enterRule(_localctx, 78, RULE_identifier);
		try {
			setState(607);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(603);
				match(T__6);
				setState(604);
				match(IDENTIFIER);
				setState(605);
				match(T__6);
				}
				break;
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(606);
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
		enterRule(_localctx, 80, RULE_string);
		try {
			_localctx = new BasicStringLiteralContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
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
		enterRule(_localctx, 82, RULE_number);
		int _la;
		try {
			setState(623);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(611);
					match(MINUS);
					}
				}

				setState(614);
				match(DECIMAL_VALUE);
				}
				break;
			case 2:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(616);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(615);
					match(MINUS);
					}
				}

				setState(618);
				match(DOUBLE_VALUE);
				}
				break;
			case 3:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(620);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(619);
					match(MINUS);
					}
				}

				setState(622);
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
		case 14:
			return tableExpressionExpress_sempred((TableExpressionExpressContext)_localctx, predIndex);
		case 26:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 28:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 32:
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
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		case 5:
			return precpred(_ctx, 1);
		case 6:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 6);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3_\u0274\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\2\3\2\5\2\\\n\2\3\2\3\2\3\2\5\2a\n\2\3\2\3\2\3\2\3\2\5\2"+
		"g\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2p\n\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2"+
		"x\n\2\3\2\3\2\5\2|\n\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\6\2\u0086\n\2\r"+
		"\2\16\2\u0087\5\2\u008a\n\2\3\3\3\3\7\3\u008e\n\3\f\3\16\3\u0091\13\3"+
		"\3\4\3\4\5\4\u0095\n\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\5\7\u009f\n\7\3"+
		"\7\3\7\3\7\7\7\u00a4\n\7\f\7\16\7\u00a7\13\7\3\7\3\7\3\7\3\7\7\7\u00ad"+
		"\n\7\f\7\16\7\u00b0\13\7\5\7\u00b2\n\7\3\7\3\7\5\7\u00b6\n\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7\u00bd\n\7\f\7\16\7\u00c0\13\7\5\7\u00c2\n\7\3\7\5\7\u00c5"+
		"\n\7\3\7\3\7\5\7\u00c9\n\7\3\7\3\7\3\7\3\7\3\7\5\7\u00d0\n\7\3\7\3\7\3"+
		"\7\3\7\5\7\u00d6\n\7\5\7\u00d8\n\7\3\b\3\b\3\b\3\b\3\b\7\b\u00df\n\b\f"+
		"\b\16\b\u00e2\13\b\3\t\3\t\5\t\u00e6\n\t\3\t\3\t\3\t\5\t\u00eb\n\t\3\t"+
		"\3\t\3\t\3\n\3\n\5\n\u00f2\n\n\3\n\3\n\3\n\3\n\5\n\u00f8\n\n\3\n\3\n\3"+
		"\n\5\n\u00fd\n\n\3\n\3\n\3\n\3\n\5\n\u0103\n\n\3\13\3\13\3\13\5\13\u0108"+
		"\n\13\3\f\3\f\3\r\3\r\3\16\3\16\5\16\u0110\n\16\3\16\5\16\u0113\n\16\3"+
		"\16\3\16\3\16\3\16\3\16\5\16\u011a\n\16\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\7\20\u0127\n\20\f\20\16\20\u012a\13\20\3\21"+
		"\5\21\u012d\n\21\3\21\3\21\5\21\u0131\n\21\3\21\3\21\5\21\u0135\n\21\3"+
		"\21\3\21\5\21\u0139\n\21\5\21\u013b\n\21\3\22\3\22\3\22\3\23\3\23\3\24"+
		"\3\24\5\24\u0144\n\24\3\24\5\24\u0147\n\24\3\25\3\25\3\25\3\25\6\25\u014d"+
		"\n\25\r\25\16\25\u014e\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\5\25\u015b\n\25\3\26\3\26\5\26\u015f\n\26\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\5\34\u0170\n\34\3\34"+
		"\3\34\5\34\u0174\n\34\3\34\3\34\3\34\3\34\3\34\3\34\7\34\u017c\n\34\f"+
		"\34\16\34\u017f\13\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u018a\n\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u0192\n\35\3\35\3\35\3"+
		"\35\3\35\3\35\7\35\u0199\n\35\f\35\16\35\u019c\13\35\3\35\3\35\3\35\5"+
		"\35\u01a1\n\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u01a9\n\35\3\35\3\35"+
		"\3\35\3\35\5\35\u01af\n\35\3\35\3\35\5\35\u01b3\n\35\3\35\5\35\u01b6\n"+
		"\35\3\36\3\36\3\36\3\36\5\36\u01bc\n\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\7\36\u01ca\n\36\f\36\16\36\u01cd\13\36"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u01d5\n\37\3 \3 \5 \u01d9\n \3 \3"+
		" \3 \3 \5 \u01df\n \3!\3!\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\6\"\u01f9\n\"\r\"\16\"\u01fa"+
		"\3\"\3\"\5\"\u01ff\n\"\3\"\3\"\3\"\3\"\3\"\5\"\u0206\n\"\3\"\3\"\3\"\7"+
		"\"\u020b\n\"\f\"\16\"\u020e\13\"\5\"\u0210\n\"\3\"\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\5\"\u021d\n\"\3\"\3\"\3\"\3\"\3\"\5\"\u0224\n\"\3"+
		"\"\3\"\3\"\3\"\3\"\7\"\u022b\n\"\f\"\16\"\u022e\13\"\3#\3#\3#\3#\3#\3"+
		"#\3#\5#\u0237\n#\3$\3$\3$\3$\7$\u023d\n$\f$\16$\u0240\13$\3$\3$\3%\3%"+
		"\3%\3%\7%\u0248\n%\f%\16%\u024b\13%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\7"+
		"\'\u0257\n\'\f\'\16\'\u025a\13\'\3(\3(\3)\3)\3)\3)\5)\u0262\n)\3*\3*\3"+
		"+\5+\u0267\n+\3+\3+\5+\u026b\n+\3+\3+\5+\u026f\n+\3+\5+\u0272\n+\3+\2"+
		"\6\36\66:B,\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<>@BDFHJLNPRT\2\t\3\2:;\3\2<=\4\2\n\nBB\3\2RS\3\2TV\3\2HM\3\2\62\67"+
		"\2\u02b8\2\u0089\3\2\2\2\4\u008b\3\2\2\2\6\u0092\3\2\2\2\b\u0098\3\2\2"+
		"\2\n\u009a\3\2\2\2\f\u009c\3\2\2\2\16\u00d9\3\2\2\2\20\u00e3\3\2\2\2\22"+
		"\u0102\3\2\2\2\24\u0104\3\2\2\2\26\u0109\3\2\2\2\30\u010b\3\2\2\2\32\u0119"+
		"\3\2\2\2\34\u011b\3\2\2\2\36\u011d\3\2\2\2 \u013a\3\2\2\2\"\u013c\3\2"+
		"\2\2$\u013f\3\2\2\2&\u0141\3\2\2\2(\u015a\3\2\2\2*\u015c\3\2\2\2,\u0162"+
		"\3\2\2\2.\u0164\3\2\2\2\60\u0166\3\2\2\2\62\u0168\3\2\2\2\64\u016a\3\2"+
		"\2\2\66\u0173\3\2\2\28\u01b5\3\2\2\2:\u01bb\3\2\2\2<\u01d4\3\2\2\2>\u01d6"+
		"\3\2\2\2@\u01e0\3\2\2\2B\u021c\3\2\2\2D\u022f\3\2\2\2F\u0238\3\2\2\2H"+
		"\u0243\3\2\2\2J\u024e\3\2\2\2L\u0253\3\2\2\2N\u025b\3\2\2\2P\u0261\3\2"+
		"\2\2R\u0263\3\2\2\2T\u0271\3\2\2\2V\u008a\5\4\3\2WX\7-\2\2XY\7.\2\2Y["+
		"\5L\'\2Z\\\5F$\2[Z\3\2\2\2[\\\3\2\2\2\\]\3\2\2\2]^\7/\2\2^`\5H%\2_a\5"+
		"D#\2`_\3\2\2\2`a\3\2\2\2a\u008a\3\2\2\2bc\7-\2\2cd\7.\2\2df\5L\'\2eg\5"+
		"F$\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\5\4\3\2i\u008a\3\2\2\2jk\7\60\2\2"+
		"kl\7\f\2\2lo\5L\'\2mn\7\r\2\2np\5\66\34\2om\3\2\2\2op\3\2\2\2p\u008a\3"+
		"\2\2\2qr\7,\2\2rs\5L\'\2st\7\61\2\2tw\5\64\33\2uv\7\3\2\2vx\5\64\33\2"+
		"wu\3\2\2\2wx\3\2\2\2x{\3\2\2\2yz\7\r\2\2z|\5\66\34\2{y\3\2\2\2{|\3\2\2"+
		"\2|\u008a\3\2\2\2}~\7N\2\2~\177\7.\2\2\177\u0080\5\34\17\2\u0080\u0081"+
		"\7O\2\2\u0081\u0082\5\34\17\2\u0082\u0083\7(\2\2\u0083\u0085\5\66\34\2"+
		"\u0084\u0086\5\20\t\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085"+
		"\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u008a\3\2\2\2\u0089V\3\2\2\2\u0089"+
		"W\3\2\2\2\u0089b\3\2\2\2\u0089j\3\2\2\2\u0089q\3\2\2\2\u0089}\3\2\2\2"+
		"\u008a\3\3\2\2\2\u008b\u008f\5\b\5\2\u008c\u008e\5\6\4\2\u008d\u008c\3"+
		"\2\2\2\u008e\u0091\3\2\2\2\u008f\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\5\3\2\2\2\u0091\u008f\3\2\2\2\u0092\u0094\7A\2\2\u0093\u0095\5\30\r\2"+
		"\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u0097"+
		"\5\b\5\2\u0097\7\3\2\2\2\u0098\u0099\5\n\6\2\u0099\t\3\2\2\2\u009a\u009b"+
		"\5\f\7\2\u009b\13\3\2\2\2\u009c\u009e\7\13\2\2\u009d\u009f\5\30\r\2\u009e"+
		"\u009d\3\2\2\2\u009e\u009f\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a5\5\32"+
		"\16\2\u00a1\u00a2\7\3\2\2\u00a2\u00a4\5\32\16\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00b1\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00a9\7\f\2\2\u00a9\u00ae\5\34\17\2\u00aa"+
		"\u00ab\7\3\2\2\u00ab\u00ad\5\34\17\2\u00ac\u00aa\3\2\2\2\u00ad\u00b0\3"+
		"\2\2\2\u00ae\u00ac\3\2\2\2\u00ae\u00af\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0"+
		"\u00ae\3\2\2\2\u00b1\u00a8\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b5\3\2"+
		"\2\2\u00b3\u00b4\7\r\2\2\u00b4\u00b6\5.\30\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\u00c1\3\2\2\2\u00b7\u00b8\7\16\2\2\u00b8\u00b9\7"+
		"!\2\2\u00b9\u00be\5,\27\2\u00ba\u00bb\7\3\2\2\u00bb\u00bd\5,\27\2\u00bc"+
		"\u00ba\3\2\2\2\u00bd\u00c0\3\2\2\2\u00be\u00bc\3\2\2\2\u00be\u00bf\3\2"+
		"\2\2\u00bf\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c1\u00b7\3\2\2\2\u00c1"+
		"\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c5\5\16\b\2\u00c4\u00c3\3"+
		"\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c7\7\20\2\2\u00c7"+
		"\u00c9\5\62\32\2\u00c8\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00d7\3"+
		"\2\2\2\u00ca\u00cb\78\2\2\u00cb\u00d8\5\24\13\2\u00cc\u00cd\79\2\2\u00cd"+
		"\u00cf\t\2\2\2\u00ce\u00d0\5\26\f\2\u00cf\u00ce\3\2\2\2\u00cf\u00d0\3"+
		"\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00d5\t\3\2\2\u00d2\u00d6\7>\2\2\u00d3"+
		"\u00d4\7?\2\2\u00d4\u00d6\7@\2\2\u00d5\u00d2\3\2\2\2\u00d5\u00d3\3\2\2"+
		"\2\u00d6\u00d8\3\2\2\2\u00d7\u00ca\3\2\2\2\u00d7\u00cc\3\2\2\2\u00d7\u00d8"+
		"\3\2\2\2\u00d8\r\3\2\2\2\u00d9\u00da\7\17\2\2\u00da\u00db\7!\2\2\u00db"+
		"\u00e0\5\60\31\2\u00dc\u00dd\7\3\2\2\u00dd\u00df\5\60\31\2\u00de\u00dc"+
		"\3\2\2\2\u00df\u00e2\3\2\2\2\u00e0\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\17\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3\u00e5\7\22\2\2\u00e4\u00e6\7\27"+
		"\2\2\u00e5\u00e4\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7"+
		"\u00ea\7P\2\2\u00e8\u00e9\7!\2\2\u00e9\u00eb\7Q\2\2\u00ea\u00e8\3\2\2"+
		"\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ed\7\23\2\2\u00ed"+
		"\u00ee\5\22\n\2\u00ee\21\3\2\2\2\u00ef\u00f1\7,\2\2\u00f0\u00f2\7+\2\2"+
		"\u00f1\u00f0\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4"+
		"\7\61\2\2\u00f4\u00f7\5\64\33\2\u00f5\u00f6\7\3\2\2\u00f6\u00f8\5\64\33"+
		"\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u0103\3\2\2\2\u00f9\u0103"+
		"\7\60\2\2\u00fa\u00fc\7-\2\2\u00fb\u00fd\5L\'\2\u00fc\u00fb\3\2\2\2\u00fc"+
		"\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\5F$\2\u00ff\u0100\7/\2"+
		"\2\u0100\u0101\5H%\2\u0101\u0103\3\2\2\2\u0102\u00ef\3\2\2\2\u0102\u00f9"+
		"\3\2\2\2\u0102\u00fa\3\2\2\2\u0103\23\3\2\2\2\u0104\u0107\5\26\f\2\u0105"+
		"\u0106\7\3\2\2\u0106\u0108\5\26\f\2\u0107\u0105\3\2\2\2\u0107\u0108\3"+
		"\2\2\2\u0108\25\3\2\2\2\u0109\u010a\5:\36\2\u010a\27\3\2\2\2\u010b\u010c"+
		"\t\4\2\2\u010c\31\3\2\2\2\u010d\u0112\5\64\33\2\u010e\u0110\7 \2\2\u010f"+
		"\u010e\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u0111\3\2\2\2\u0111\u0113\5P"+
		")\2\u0112\u010f\3\2\2\2\u0112\u0113\3\2\2\2\u0113\u011a\3\2\2\2\u0114"+
		"\u0115\5B\"\2\u0115\u0116\7\4\2\2\u0116\u0117\7T\2\2\u0117\u011a\3\2\2"+
		"\2\u0118\u011a\7T\2\2\u0119\u010d\3\2\2\2\u0119\u0114\3\2\2\2\u0119\u0118"+
		"\3\2\2\2\u011a\33\3\2\2\2\u011b\u011c\5\36\20\2\u011c\35\3\2\2\2\u011d"+
		"\u011e\b\20\1\2\u011e\u011f\5$\23\2\u011f\u0128\3\2\2\2\u0120\u0121\f"+
		"\4\2\2\u0121\u0122\5 \21\2\u0122\u0123\7#\2\2\u0123\u0124\5$\23\2\u0124"+
		"\u0125\5\"\22\2\u0125\u0127\3\2\2\2\u0126\u0120\3\2\2\2\u0127\u012a\3"+
		"\2\2\2\u0128\u0126\3\2\2\2\u0128\u0129\3\2\2\2\u0129\37\3\2\2\2\u012a"+
		"\u0128\3\2\2\2\u012b\u012d\7$\2\2\u012c\u012b\3\2\2\2\u012c\u012d\3\2"+
		"\2\2\u012d\u013b\3\2\2\2\u012e\u0130\7%\2\2\u012f\u0131\7&\2\2\u0130\u012f"+
		"\3\2\2\2\u0130\u0131\3\2\2\2\u0131\u013b\3\2\2\2\u0132\u0134\7)\2\2\u0133"+
		"\u0135\7&\2\2\u0134\u0133\3\2\2\2\u0134\u0135\3\2\2\2\u0135\u013b\3\2"+
		"\2\2\u0136\u0138\7\'\2\2\u0137\u0139\7&\2\2\u0138\u0137\3\2\2\2\u0138"+
		"\u0139\3\2\2\2\u0139\u013b\3\2\2\2\u013a\u012c\3\2\2\2\u013a\u012e\3\2"+
		"\2\2\u013a\u0132\3\2\2\2\u013a\u0136\3\2\2\2\u013b!\3\2\2\2\u013c\u013d"+
		"\7(\2\2\u013d\u013e\5\66\34\2\u013e#\3\2\2\2\u013f\u0140\5&\24\2\u0140"+
		"%\3\2\2\2\u0141\u0146\5(\25\2\u0142\u0144\7 \2\2\u0143\u0142\3\2\2\2\u0143"+
		"\u0144\3\2\2\2\u0144\u0145\3\2\2\2\u0145\u0147\5P)\2\u0146\u0143\3\2\2"+
		"\2\u0146\u0147\3\2\2\2\u0147\'\3\2\2\2\u0148\u015b\5L\'\2\u0149\u014a"+
		"\7\5\2\2\u014a\u014c\5\34\17\2\u014b\u014d\5*\26\2\u014c\u014b\3\2\2\2"+
		"\u014d\u014e\3\2\2\2\u014e\u014c\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0150"+
		"\3\2\2\2\u0150\u0151\7\6\2\2\u0151\u015b\3\2\2\2\u0152\u0153\7\5\2\2\u0153"+
		"\u0154\5\4\3\2\u0154\u0155\7\6\2\2\u0155\u015b\3\2\2\2\u0156\u0157\7\5"+
		"\2\2\u0157\u0158\5\34\17\2\u0158\u0159\7\6\2\2\u0159\u015b\3\2\2\2\u015a"+
		"\u0148\3\2\2\2\u015a\u0149\3\2\2\2\u015a\u0152\3\2\2\2\u015a\u0156\3\2"+
		"\2\2\u015b)\3\2\2\2\u015c\u015e\7A\2\2\u015d\u015f\5\30\r\2\u015e\u015d"+
		"\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0161\5(\25\2\u0161"+
		"+\3\2\2\2\u0162\u0163\5\64\33\2\u0163-\3\2\2\2\u0164\u0165\5\66\34\2\u0165"+
		"/\3\2\2\2\u0166\u0167\5\64\33\2\u0167\61\3\2\2\2\u0168\u0169\5\66\34\2"+
		"\u0169\63\3\2\2\2\u016a\u016b\5\66\34\2\u016b\65\3\2\2\2\u016c\u016d\b"+
		"\34\1\2\u016d\u016f\5:\36\2\u016e\u0170\58\35\2\u016f\u016e\3\2\2\2\u016f"+
		"\u0170\3\2\2\2\u0170\u0174\3\2\2\2\u0171\u0172\7\27\2\2\u0172\u0174\5"+
		"\66\34\5\u0173\u016c\3\2\2\2\u0173\u0171\3\2\2\2\u0174\u017d\3\2\2\2\u0175"+
		"\u0176\f\4\2\2\u0176\u0177\7\26\2\2\u0177\u017c\5\66\34\5\u0178\u0179"+
		"\f\3\2\2\u0179\u017a\7\30\2\2\u017a\u017c\5\66\34\4\u017b\u0175\3\2\2"+
		"\2\u017b\u0178\3\2\2\2\u017c\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e"+
		"\3\2\2\2\u017e\67\3\2\2\2\u017f\u017d\3\2\2\2\u0180\u0181\5N(\2\u0181"+
		"\u0182\5:\36\2\u0182\u01b6\3\2\2\2\u0183\u0184\5N(\2\u0184\u0185\7\5\2"+
		"\2\u0185\u0186\5\4\3\2\u0186\u0187\7\6\2\2\u0187\u01b6\3\2\2\2\u0188\u018a"+
		"\7\27\2\2\u0189\u0188\3\2\2\2\u0189\u018a\3\2\2\2\u018a\u018b\3\2\2\2"+
		"\u018b\u018c\7\31\2\2\u018c\u018d\5:\36\2\u018d\u018e\7\26\2\2\u018e\u018f"+
		"\5:\36\2\u018f\u01b6\3\2\2\2\u0190\u0192\7\27\2\2\u0191\u0190\3\2\2\2"+
		"\u0191\u0192\3\2\2\2\u0192\u0193\3\2\2\2\u0193\u0194\7\32\2\2\u0194\u0195"+
		"\7\5\2\2\u0195\u019a\5\64\33\2\u0196\u0197\7\3\2\2\u0197\u0199\5\64\33"+
		"\2\u0198\u0196\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b"+
		"\3\2\2\2\u019b\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7\6\2\2\u019e"+
		"\u01b6\3\2\2\2\u019f\u01a1\7\27\2\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3"+
		"\2\2\2\u01a1\u01a2\3\2\2\2\u01a2\u01a3\7\32\2\2\u01a3\u01a4\7\5\2\2\u01a4"+
		"\u01a5\5\4\3\2\u01a5\u01a6\7\6\2\2\u01a6\u01b6\3\2\2\2\u01a7\u01a9\7\27"+
		"\2\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\3\2\2\2\u01aa"+
		"\u01ab\7\33\2\2\u01ab\u01ae\5:\36\2\u01ac\u01ad\7\34\2\2\u01ad\u01af\5"+
		":\36\2\u01ae\u01ac\3\2\2\2\u01ae\u01af\3\2\2\2\u01af\u01b6\3\2\2\2\u01b0"+
		"\u01b2\7\37\2\2\u01b1\u01b3\7\27\2\2\u01b2\u01b1\3\2\2\2\u01b2\u01b3\3"+
		"\2\2\2\u01b3\u01b4\3\2\2\2\u01b4\u01b6\7\"\2\2\u01b5\u0180\3\2\2\2\u01b5"+
		"\u0183\3\2\2\2\u01b5\u0189\3\2\2\2\u01b5\u0191\3\2\2\2\u01b5\u01a0\3\2"+
		"\2\2\u01b5\u01a8\3\2\2\2\u01b5\u01b0\3\2\2\2\u01b69\3\2\2\2\u01b7\u01b8"+
		"\b\36\1\2\u01b8\u01bc\5B\"\2\u01b9\u01ba\t\5\2\2\u01ba\u01bc\5:\36\6\u01bb"+
		"\u01b7\3\2\2\2\u01bb\u01b9\3\2\2\2\u01bc\u01cb\3\2\2\2\u01bd\u01be\f\5"+
		"\2\2\u01be\u01bf\t\6\2\2\u01bf\u01ca\5:\36\6\u01c0\u01c1\f\4\2\2\u01c1"+
		"\u01c2\t\5\2\2\u01c2\u01ca\5:\36\5\u01c3\u01c4\f\3\2\2\u01c4\u01c5\7W"+
		"\2\2\u01c5\u01ca\5:\36\4\u01c6\u01c7\f\7\2\2\u01c7\u01c8\7D\2\2\u01c8"+
		"\u01ca\5<\37\2\u01c9\u01bd\3\2\2\2\u01c9\u01c0\3\2\2\2\u01c9\u01c3\3\2"+
		"\2\2\u01c9\u01c6\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb"+
		"\u01cc\3\2\2\2\u01cc;\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01cf\7E\2\2\u01cf"+
		"\u01d0\7F\2\2\u01d0\u01d5\5> \2\u01d1\u01d2\7E\2\2\u01d2\u01d3\7F\2\2"+
		"\u01d3\u01d5\5R*\2\u01d4\u01ce\3\2\2\2\u01d4\u01d1\3\2\2\2\u01d5=\3\2"+
		"\2\2\u01d6\u01d8\7C\2\2\u01d7\u01d9\t\5\2\2\u01d8\u01d7\3\2\2\2\u01d8"+
		"\u01d9\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01db\5R*\2\u01db\u01de\5@!\2"+
		"\u01dc\u01dd\7G\2\2\u01dd\u01df\5@!\2\u01de\u01dc\3\2\2\2\u01de\u01df"+
		"\3\2\2\2\u01df?\3\2\2\2\u01e0\u01e1\t\7\2\2\u01e1A\3\2\2\2\u01e2\u01e3"+
		"\b\"\1\2\u01e3\u021d\7X\2\2\u01e4\u01e5\7Y\2\2\u01e5\u021d\5P)\2\u01e6"+
		"\u021d\7\"\2\2\u01e7\u01e8\5P)\2\u01e8\u01e9\5R*\2\u01e9\u021d\3\2\2\2"+
		"\u01ea\u021d\5T+\2\u01eb\u021d\5R*\2\u01ec\u01ed\7\5\2\2\u01ed\u01ee\5"+
		"\4\3\2\u01ee\u01ef\7\6\2\2\u01ef\u021d\3\2\2\2\u01f0\u021d\5\4\3\2\u01f1"+
		"\u01f2\7\35\2\2\u01f2\u01f3\7\5\2\2\u01f3\u01f4\5\4\3\2\u01f4\u01f5\7"+
		"\6\2\2\u01f5\u021d\3\2\2\2\u01f6\u01f8\7\21\2\2\u01f7\u01f9\5J&\2\u01f8"+
		"\u01f7\3\2\2\2\u01f9\u01fa\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2"+
		"\2\2\u01fb\u01fe\3\2\2\2\u01fc\u01fd\7\24\2\2\u01fd\u01ff\5\64\33\2\u01fe"+
		"\u01fc\3\2\2\2\u01fe\u01ff\3\2\2\2\u01ff\u0200\3\2\2\2\u0200\u0201\7\25"+
		"\2\2\u0201\u021d\3\2\2\2\u0202\u0203\5L\'\2\u0203\u020f\7\5\2\2\u0204"+
		"\u0206\5\30\r\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\3"+
		"\2\2\2\u0207\u020c\5\64\33\2\u0208\u0209\7\3\2\2\u0209\u020b\5\64\33\2"+
		"\u020a\u0208\3\2\2\2\u020b\u020e\3\2\2\2\u020c\u020a\3\2\2\2\u020c\u020d"+
		"\3\2\2\2\u020d\u0210\3\2\2\2\u020e\u020c\3\2\2\2\u020f\u0205\3\2\2\2\u020f"+
		"\u0210\3\2\2\2\u0210\u0211\3\2\2\2\u0211\u0212\7\6\2\2\u0212\u021d\3\2"+
		"\2\2\u0213\u0214\5L\'\2\u0214\u0215\7\5\2\2\u0215\u0216\7\6\2\2\u0216"+
		"\u021d\3\2\2\2\u0217\u021d\5P)\2\u0218\u0219\7\5\2\2\u0219\u021a\5\64"+
		"\33\2\u021a\u021b\7\6\2\2\u021b\u021d\3\2\2\2\u021c\u01e2\3\2\2\2\u021c"+
		"\u01e4\3\2\2\2\u021c\u01e6\3\2\2\2\u021c\u01e7\3\2\2\2\u021c\u01ea\3\2"+
		"\2\2\u021c\u01eb\3\2\2\2\u021c\u01ec\3\2\2\2\u021c\u01f0\3\2\2\2\u021c"+
		"\u01f1\3\2\2\2\u021c\u01f6\3\2\2\2\u021c\u0202\3\2\2\2\u021c\u0213\3\2"+
		"\2\2\u021c\u0217\3\2\2\2\u021c\u0218\3\2\2\2\u021d\u022c\3\2\2\2\u021e"+
		"\u021f\f\b\2\2\u021f\u0220\7\7\2\2\u0220\u0223\5:\36\2\u0221\u0222\7\3"+
		"\2\2\u0222\u0224\5:\36\2\u0223\u0221\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u0225\3\2\2\2\u0225\u0226\7\b\2\2\u0226\u022b\3\2\2\2\u0227\u0228\f\4"+
		"\2\2\u0228\u0229\7\4\2\2\u0229\u022b\5P)\2\u022a\u021e\3\2\2\2\u022a\u0227"+
		"\3\2\2\2\u022b\u022e\3\2\2\2\u022c\u022a\3\2\2\2\u022c\u022d\3\2\2\2\u022d"+
		"C\3\2\2\2\u022e\u022c\3\2\2\2\u022f\u0230\7(\2\2\u0230\u0231\7*\2\2\u0231"+
		"\u0232\7+\2\2\u0232\u0233\7,\2\2\u0233\u0236\5\64\33\2\u0234\u0235\7\3"+
		"\2\2\u0235\u0237\5\64\33\2\u0236\u0234\3\2\2\2\u0236\u0237\3\2\2\2\u0237"+
		"E\3\2\2\2\u0238\u0239\7\5\2\2\u0239\u023e\5P)\2\u023a\u023b\7\3\2\2\u023b"+
		"\u023d\5P)\2\u023c\u023a\3\2\2\2\u023d\u0240\3\2\2\2\u023e\u023c\3\2\2"+
		"\2\u023e\u023f\3\2\2\2\u023f\u0241\3\2\2\2\u0240\u023e\3\2\2\2\u0241\u0242"+
		"\7\6\2\2\u0242G\3\2\2\2\u0243\u0244\7\5\2\2\u0244\u0249\5\64\33\2\u0245"+
		"\u0246\7\3\2\2\u0246\u0248\5\64\33\2\u0247\u0245\3\2\2\2\u0248\u024b\3"+
		"\2\2\2\u0249\u0247\3\2\2\2\u0249\u024a\3\2\2\2\u024a\u024c\3\2\2\2\u024b"+
		"\u0249\3\2\2\2\u024c\u024d\7\6\2\2\u024dI\3\2\2\2\u024e\u024f\7\22\2\2"+
		"\u024f\u0250\5\64\33\2\u0250\u0251\7\23\2\2\u0251\u0252\5\64\33\2\u0252"+
		"K\3\2\2\2\u0253\u0258\5P)\2\u0254\u0255\7\4\2\2\u0255\u0257\5P)\2\u0256"+
		"\u0254\3\2\2\2\u0257\u025a\3\2\2\2\u0258\u0256\3\2\2\2\u0258\u0259\3\2"+
		"\2\2\u0259M\3\2\2\2\u025a\u0258\3\2\2\2\u025b\u025c\t\b\2\2\u025cO\3\2"+
		"\2\2\u025d\u025e\7\t\2\2\u025e\u025f\7^\2\2\u025f\u0262\7\t\2\2\u0260"+
		"\u0262\7^\2\2\u0261\u025d\3\2\2\2\u0261\u0260\3\2\2\2\u0262Q\3\2\2\2\u0263"+
		"\u0264\7Z\2\2\u0264S\3\2\2\2\u0265\u0267\7S\2\2\u0266\u0265\3\2\2\2\u0266"+
		"\u0267\3\2\2\2\u0267\u0268\3\2\2\2\u0268\u0272\7\\\2\2\u0269\u026b\7S"+
		"\2\2\u026a\u0269\3\2\2\2\u026a\u026b\3\2\2\2\u026b\u026c\3\2\2\2\u026c"+
		"\u0272\7]\2\2\u026d\u026f\7S\2\2\u026e\u026d\3\2\2\2\u026e\u026f\3\2\2"+
		"\2\u026f\u0270\3\2\2\2\u0270\u0272\7[\2\2\u0271\u0266\3\2\2\2\u0271\u026a"+
		"\3\2\2\2\u0271\u026e\3\2\2\2\u0272U\3\2\2\2R[`fow{\u0087\u0089\u008f\u0094"+
		"\u009e\u00a5\u00ae\u00b1\u00b5\u00be\u00c1\u00c4\u00c8\u00cf\u00d5\u00d7"+
		"\u00e0\u00e5\u00ea\u00f1\u00f7\u00fc\u0102\u0107\u010f\u0112\u0119\u0128"+
		"\u012c\u0130\u0134\u0138\u013a\u0143\u0146\u014e\u015a\u015e\u016f\u0173"+
		"\u017b\u017d\u0189\u0191\u019a\u01a0\u01a8\u01ae\u01b2\u01b5\u01bb\u01c9"+
		"\u01cb\u01d4\u01d8\u01de\u01fa\u01fe\u0205\u020c\u020f\u021c\u0223\u022a"+
		"\u022c\u0236\u023e\u0249\u0258\u0261\u0266\u026a\u026e\u0271";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}