// Generated from com\xweb\sql\core\parser\QuerySqlBase.g4 by ANTLR 4.9.1
package com.xweb.sql.core.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QuerySqlBaseParser}.
 */
public interface QuerySqlBaseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link QuerySqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefault(QuerySqlBaseParser.StatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link QuerySqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefault(QuerySqlBaseParser.StatementDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertIntoDefault}
	 * labeled alternative in {@link QuerySqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInsertIntoDefault(QuerySqlBaseParser.InsertIntoDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertIntoDefault}
	 * labeled alternative in {@link QuerySqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInsertIntoDefault(QuerySqlBaseParser.InsertIntoDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertIntoAsQuery}
	 * labeled alternative in {@link QuerySqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInsertIntoAsQuery(QuerySqlBaseParser.InsertIntoAsQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertIntoAsQuery}
	 * labeled alternative in {@link QuerySqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInsertIntoAsQuery(QuerySqlBaseParser.InsertIntoAsQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(QuerySqlBaseParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(QuerySqlBaseParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#unionExpress}.
	 * @param ctx the parse tree
	 */
	void enterUnionExpress(QuerySqlBaseParser.UnionExpressContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#unionExpress}.
	 * @param ctx the parse tree
	 */
	void exitUnionExpress(QuerySqlBaseParser.UnionExpressContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#queryItem}.
	 * @param ctx the parse tree
	 */
	void enterQueryItem(QuerySqlBaseParser.QueryItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#queryItem}.
	 * @param ctx the parse tree
	 */
	void exitQueryItem(QuerySqlBaseParser.QueryItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleSelect}
	 * labeled alternative in {@link QuerySqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterSingleSelect(QuerySqlBaseParser.SingleSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleSelect}
	 * labeled alternative in {@link QuerySqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitSingleSelect(QuerySqlBaseParser.SingleSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimary(QuerySqlBaseParser.QueryPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimary(QuerySqlBaseParser.QueryPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#orderByPart}.
	 * @param ctx the parse tree
	 */
	void enterOrderByPart(QuerySqlBaseParser.OrderByPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#orderByPart}.
	 * @param ctx the parse tree
	 */
	void exitOrderByPart(QuerySqlBaseParser.OrderByPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void enterLimitRowCount(QuerySqlBaseParser.LimitRowCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void exitLimitRowCount(QuerySqlBaseParser.LimitRowCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#rowCount}.
	 * @param ctx the parse tree
	 */
	void enterRowCount(QuerySqlBaseParser.RowCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#rowCount}.
	 * @param ctx the parse tree
	 */
	void exitRowCount(QuerySqlBaseParser.RowCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(QuerySqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(QuerySqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectSingle}
	 * labeled alternative in {@link QuerySqlBaseParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectSingle(QuerySqlBaseParser.SelectSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectSingle}
	 * labeled alternative in {@link QuerySqlBaseParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectSingle(QuerySqlBaseParser.SelectSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link QuerySqlBaseParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectAll(QuerySqlBaseParser.SelectAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link QuerySqlBaseParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectAll(QuerySqlBaseParser.SelectAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#tableExpression}.
	 * @param ctx the parse tree
	 */
	void enterTableExpression(QuerySqlBaseParser.TableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#tableExpression}.
	 * @param ctx the parse tree
	 */
	void exitTableExpression(QuerySqlBaseParser.TableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinTableExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#tableExpressionExpress}.
	 * @param ctx the parse tree
	 */
	void enterJoinTableExpress(QuerySqlBaseParser.JoinTableExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinTableExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#tableExpressionExpress}.
	 * @param ctx the parse tree
	 */
	void exitJoinTableExpress(QuerySqlBaseParser.JoinTableExpressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleTableExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#tableExpressionExpress}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTableExpress(QuerySqlBaseParser.SimpleTableExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleTableExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#tableExpressionExpress}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTableExpress(QuerySqlBaseParser.SimpleTableExpressContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(QuerySqlBaseParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(QuerySqlBaseParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#joinCondition}.
	 * @param ctx the parse tree
	 */
	void enterJoinCondition(QuerySqlBaseParser.JoinConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#joinCondition}.
	 * @param ctx the parse tree
	 */
	void exitJoinCondition(QuerySqlBaseParser.JoinConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#simpleTableExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTableExpression(QuerySqlBaseParser.SimpleTableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#simpleTableExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTableExpression(QuerySqlBaseParser.SimpleTableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#aliasedTableExpression}.
	 * @param ctx the parse tree
	 */
	void enterAliasedTableExpression(QuerySqlBaseParser.AliasedTableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#aliasedTableExpression}.
	 * @param ctx the parse tree
	 */
	void exitAliasedTableExpression(QuerySqlBaseParser.AliasedTableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableNameExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableNameExpress(QuerySqlBaseParser.TableNameExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableNameExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableNameExpress(QuerySqlBaseParser.TableNameExpressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionSelectTableExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 */
	void enterUnionSelectTableExpress(QuerySqlBaseParser.UnionSelectTableExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionSelectTableExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 */
	void exitUnionSelectTableExpress(QuerySqlBaseParser.UnionSelectTableExpressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subQueryTableExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubQueryTableExpress(QuerySqlBaseParser.SubQueryTableExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subQueryTableExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubQueryTableExpress(QuerySqlBaseParser.SubQueryTableExpressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subTableExpressionExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubTableExpressionExpress(QuerySqlBaseParser.SubTableExpressionExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subTableExpressionExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubTableExpressionExpress(QuerySqlBaseParser.SubTableExpressionExpressContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#unionTableExpress}.
	 * @param ctx the parse tree
	 */
	void enterUnionTableExpress(QuerySqlBaseParser.UnionTableExpressContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#unionTableExpress}.
	 * @param ctx the parse tree
	 */
	void exitUnionTableExpress(QuerySqlBaseParser.UnionTableExpressContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#groupByExpression}.
	 * @param ctx the parse tree
	 */
	void enterGroupByExpression(QuerySqlBaseParser.GroupByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#groupByExpression}.
	 * @param ctx the parse tree
	 */
	void exitGroupByExpression(QuerySqlBaseParser.GroupByExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhereExpression(QuerySqlBaseParser.WhereExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhereExpression(QuerySqlBaseParser.WhereExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderByExpression(QuerySqlBaseParser.OrderByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderByExpression(QuerySqlBaseParser.OrderByExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#havingExpression}.
	 * @param ctx the parse tree
	 */
	void enterHavingExpression(QuerySqlBaseParser.HavingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#havingExpression}.
	 * @param ctx the parse tree
	 */
	void exitHavingExpression(QuerySqlBaseParser.HavingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(QuerySqlBaseParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(QuerySqlBaseParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link QuerySqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(QuerySqlBaseParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link QuerySqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(QuerySqlBaseParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link QuerySqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(QuerySqlBaseParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link QuerySqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(QuerySqlBaseParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link QuerySqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(QuerySqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link QuerySqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(QuerySqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link QuerySqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterComparison(QuerySqlBaseParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link QuerySqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitComparison(QuerySqlBaseParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quantifiedComparison}
	 * labeled alternative in {@link QuerySqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterQuantifiedComparison(QuerySqlBaseParser.QuantifiedComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quantifiedComparison}
	 * labeled alternative in {@link QuerySqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitQuantifiedComparison(QuerySqlBaseParser.QuantifiedComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code between}
	 * labeled alternative in {@link QuerySqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBetween(QuerySqlBaseParser.BetweenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code between}
	 * labeled alternative in {@link QuerySqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBetween(QuerySqlBaseParser.BetweenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inList}
	 * labeled alternative in {@link QuerySqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterInList(QuerySqlBaseParser.InListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inList}
	 * labeled alternative in {@link QuerySqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitInList(QuerySqlBaseParser.InListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inSubquery}
	 * labeled alternative in {@link QuerySqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterInSubquery(QuerySqlBaseParser.InSubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inSubquery}
	 * labeled alternative in {@link QuerySqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitInSubquery(QuerySqlBaseParser.InSubqueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code like}
	 * labeled alternative in {@link QuerySqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLike(QuerySqlBaseParser.LikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code like}
	 * labeled alternative in {@link QuerySqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLike(QuerySqlBaseParser.LikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullPredicate}
	 * labeled alternative in {@link QuerySqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterNullPredicate(QuerySqlBaseParser.NullPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullPredicate}
	 * labeled alternative in {@link QuerySqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitNullPredicate(QuerySqlBaseParser.NullPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link QuerySqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(QuerySqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link QuerySqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(QuerySqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link QuerySqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(QuerySqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link QuerySqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(QuerySqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link QuerySqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(QuerySqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link QuerySqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(QuerySqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atTimeZone}
	 * labeled alternative in {@link QuerySqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtTimeZone(QuerySqlBaseParser.AtTimeZoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atTimeZone}
	 * labeled alternative in {@link QuerySqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtTimeZone(QuerySqlBaseParser.AtTimeZoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatenationExpression}
	 * labeled alternative in {@link QuerySqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterConcatenationExpression(QuerySqlBaseParser.ConcatenationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatenationExpression}
	 * labeled alternative in {@link QuerySqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitConcatenationExpression(QuerySqlBaseParser.ConcatenationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timeZoneInterval}
	 * labeled alternative in {@link QuerySqlBaseParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTimeZoneInterval(QuerySqlBaseParser.TimeZoneIntervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timeZoneInterval}
	 * labeled alternative in {@link QuerySqlBaseParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTimeZoneInterval(QuerySqlBaseParser.TimeZoneIntervalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timeZoneString}
	 * labeled alternative in {@link QuerySqlBaseParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTimeZoneString(QuerySqlBaseParser.TimeZoneStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timeZoneString}
	 * labeled alternative in {@link QuerySqlBaseParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTimeZoneString(QuerySqlBaseParser.TimeZoneStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(QuerySqlBaseParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(QuerySqlBaseParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void enterIntervalField(QuerySqlBaseParser.IntervalFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void exitIntervalField(QuerySqlBaseParser.IntervalFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dynamicParameter}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDynamicParameter(QuerySqlBaseParser.DynamicParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dynamicParameter}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDynamicParameter(QuerySqlBaseParser.DynamicParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(QuerySqlBaseParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(QuerySqlBaseParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(QuerySqlBaseParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(QuerySqlBaseParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subPriorityQueryExpression}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubPriorityQueryExpression(QuerySqlBaseParser.SubPriorityQueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subPriorityQueryExpression}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubPriorityQueryExpression(QuerySqlBaseParser.SubPriorityQueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(QuerySqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(QuerySqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(QuerySqlBaseParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(QuerySqlBaseParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(QuerySqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(QuerySqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specialVariable}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSpecialVariable(QuerySqlBaseParser.SpecialVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specialVariable}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSpecialVariable(QuerySqlBaseParser.SpecialVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(QuerySqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(QuerySqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(QuerySqlBaseParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(QuerySqlBaseParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(QuerySqlBaseParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(QuerySqlBaseParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(QuerySqlBaseParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(QuerySqlBaseParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(QuerySqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(QuerySqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subQueryExpression}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubQueryExpression(QuerySqlBaseParser.SubQueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subQueryExpression}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubQueryExpression(QuerySqlBaseParser.SubQueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subScript}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubScript(QuerySqlBaseParser.SubScriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subScript}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubScript(QuerySqlBaseParser.SubScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#onDuplicateCondition}.
	 * @param ctx the parse tree
	 */
	void enterOnDuplicateCondition(QuerySqlBaseParser.OnDuplicateConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#onDuplicateCondition}.
	 * @param ctx the parse tree
	 */
	void exitOnDuplicateCondition(QuerySqlBaseParser.OnDuplicateConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#columnAliases}.
	 * @param ctx the parse tree
	 */
	void enterColumnAliases(QuerySqlBaseParser.ColumnAliasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#columnAliases}.
	 * @param ctx the parse tree
	 */
	void exitColumnAliases(QuerySqlBaseParser.ColumnAliasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#valueAliases}.
	 * @param ctx the parse tree
	 */
	void enterValueAliases(QuerySqlBaseParser.ValueAliasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#valueAliases}.
	 * @param ctx the parse tree
	 */
	void exitValueAliases(QuerySqlBaseParser.ValueAliasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(QuerySqlBaseParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(QuerySqlBaseParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(QuerySqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(QuerySqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(QuerySqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(QuerySqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link QuerySqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(QuerySqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link QuerySqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(QuerySqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code basicStringLiteral}
	 * labeled alternative in {@link QuerySqlBaseParser#string}.
	 * @param ctx the parse tree
	 */
	void enterBasicStringLiteral(QuerySqlBaseParser.BasicStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code basicStringLiteral}
	 * labeled alternative in {@link QuerySqlBaseParser#string}.
	 * @param ctx the parse tree
	 */
	void exitBasicStringLiteral(QuerySqlBaseParser.BasicStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link QuerySqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(QuerySqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link QuerySqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(QuerySqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link QuerySqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(QuerySqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link QuerySqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(QuerySqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link QuerySqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(QuerySqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link QuerySqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(QuerySqlBaseParser.IntegerLiteralContext ctx);
}