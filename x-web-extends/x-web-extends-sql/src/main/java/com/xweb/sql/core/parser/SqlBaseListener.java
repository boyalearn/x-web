// Generated from com\xweb\sql\core\parser\SqlBase.g4 by ANTLR 4.9.1
package com.xweb.sql.core.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SqlBaseParser}.
 */
public interface SqlBaseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefault(SqlBaseParser.StatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefault(SqlBaseParser.StatementDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertIntoDefault}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInsertIntoDefault(SqlBaseParser.InsertIntoDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertIntoDefault}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInsertIntoDefault(SqlBaseParser.InsertIntoDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertIntoAsQuery}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterInsertIntoAsQuery(SqlBaseParser.InsertIntoAsQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertIntoAsQuery}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitInsertIntoAsQuery(SqlBaseParser.InsertIntoAsQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deleteDefault}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteDefault(SqlBaseParser.DeleteDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deleteDefault}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteDefault(SqlBaseParser.DeleteDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code updateDefault}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdateDefault(SqlBaseParser.UpdateDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code updateDefault}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdateDefault(SqlBaseParser.UpdateDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mergeDefault}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMergeDefault(SqlBaseParser.MergeDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mergeDefault}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMergeDefault(SqlBaseParser.MergeDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SqlBaseParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SqlBaseParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#unionExpress}.
	 * @param ctx the parse tree
	 */
	void enterUnionExpress(SqlBaseParser.UnionExpressContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#unionExpress}.
	 * @param ctx the parse tree
	 */
	void exitUnionExpress(SqlBaseParser.UnionExpressContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#queryItem}.
	 * @param ctx the parse tree
	 */
	void enterQueryItem(SqlBaseParser.QueryItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#queryItem}.
	 * @param ctx the parse tree
	 */
	void exitQueryItem(SqlBaseParser.QueryItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleSelect}
	 * labeled alternative in {@link SqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterSingleSelect(SqlBaseParser.SingleSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleSelect}
	 * labeled alternative in {@link SqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitSingleSelect(SqlBaseParser.SingleSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimary(SqlBaseParser.QueryPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimary(SqlBaseParser.QueryPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code limitPageExpress}
	 * labeled alternative in {@link SqlBaseParser#pageExpression}.
	 * @param ctx the parse tree
	 */
	void enterLimitPageExpress(SqlBaseParser.LimitPageExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code limitPageExpress}
	 * labeled alternative in {@link SqlBaseParser#pageExpression}.
	 * @param ctx the parse tree
	 */
	void exitLimitPageExpress(SqlBaseParser.LimitPageExpressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code offsetPageExpress}
	 * labeled alternative in {@link SqlBaseParser#pageExpression}.
	 * @param ctx the parse tree
	 */
	void enterOffsetPageExpress(SqlBaseParser.OffsetPageExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code offsetPageExpress}
	 * labeled alternative in {@link SqlBaseParser#pageExpression}.
	 * @param ctx the parse tree
	 */
	void exitOffsetPageExpress(SqlBaseParser.OffsetPageExpressContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#orderByPart}.
	 * @param ctx the parse tree
	 */
	void enterOrderByPart(SqlBaseParser.OrderByPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#orderByPart}.
	 * @param ctx the parse tree
	 */
	void exitOrderByPart(SqlBaseParser.OrderByPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#matchThenExpression}.
	 * @param ctx the parse tree
	 */
	void enterMatchThenExpression(SqlBaseParser.MatchThenExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#matchThenExpression}.
	 * @param ctx the parse tree
	 */
	void exitMatchThenExpression(SqlBaseParser.MatchThenExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mergeUpdateOperator}
	 * labeled alternative in {@link SqlBaseParser#mergeOperator}.
	 * @param ctx the parse tree
	 */
	void enterMergeUpdateOperator(SqlBaseParser.MergeUpdateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mergeUpdateOperator}
	 * labeled alternative in {@link SqlBaseParser#mergeOperator}.
	 * @param ctx the parse tree
	 */
	void exitMergeUpdateOperator(SqlBaseParser.MergeUpdateOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mergeDeleteOperator}
	 * labeled alternative in {@link SqlBaseParser#mergeOperator}.
	 * @param ctx the parse tree
	 */
	void enterMergeDeleteOperator(SqlBaseParser.MergeDeleteOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mergeDeleteOperator}
	 * labeled alternative in {@link SqlBaseParser#mergeOperator}.
	 * @param ctx the parse tree
	 */
	void exitMergeDeleteOperator(SqlBaseParser.MergeDeleteOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mergeInsertOperator}
	 * labeled alternative in {@link SqlBaseParser#mergeOperator}.
	 * @param ctx the parse tree
	 */
	void enterMergeInsertOperator(SqlBaseParser.MergeInsertOperatorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mergeInsertOperator}
	 * labeled alternative in {@link SqlBaseParser#mergeOperator}.
	 * @param ctx the parse tree
	 */
	void exitMergeInsertOperator(SqlBaseParser.MergeInsertOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void enterLimitRowCount(SqlBaseParser.LimitRowCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void exitLimitRowCount(SqlBaseParser.LimitRowCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#rowCount}.
	 * @param ctx the parse tree
	 */
	void enterRowCount(SqlBaseParser.RowCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#rowCount}.
	 * @param ctx the parse tree
	 */
	void exitRowCount(SqlBaseParser.RowCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(SqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(SqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectSingle}
	 * labeled alternative in {@link SqlBaseParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectSingle(SqlBaseParser.SelectSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectSingle}
	 * labeled alternative in {@link SqlBaseParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectSingle(SqlBaseParser.SelectSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link SqlBaseParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void enterSelectAll(SqlBaseParser.SelectAllContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link SqlBaseParser#selectItem}.
	 * @param ctx the parse tree
	 */
	void exitSelectAll(SqlBaseParser.SelectAllContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#tableExpression}.
	 * @param ctx the parse tree
	 */
	void enterTableExpression(SqlBaseParser.TableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#tableExpression}.
	 * @param ctx the parse tree
	 */
	void exitTableExpression(SqlBaseParser.TableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code joinTableExpress}
	 * labeled alternative in {@link SqlBaseParser#tableExpressionExpress}.
	 * @param ctx the parse tree
	 */
	void enterJoinTableExpress(SqlBaseParser.JoinTableExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code joinTableExpress}
	 * labeled alternative in {@link SqlBaseParser#tableExpressionExpress}.
	 * @param ctx the parse tree
	 */
	void exitJoinTableExpress(SqlBaseParser.JoinTableExpressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleTableExpress}
	 * labeled alternative in {@link SqlBaseParser#tableExpressionExpress}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTableExpress(SqlBaseParser.SimpleTableExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleTableExpress}
	 * labeled alternative in {@link SqlBaseParser#tableExpressionExpress}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTableExpress(SqlBaseParser.SimpleTableExpressContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(SqlBaseParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(SqlBaseParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#joinCondition}.
	 * @param ctx the parse tree
	 */
	void enterJoinCondition(SqlBaseParser.JoinConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#joinCondition}.
	 * @param ctx the parse tree
	 */
	void exitJoinCondition(SqlBaseParser.JoinConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#simpleTableExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleTableExpression(SqlBaseParser.SimpleTableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#simpleTableExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleTableExpression(SqlBaseParser.SimpleTableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#aliasedTableExpression}.
	 * @param ctx the parse tree
	 */
	void enterAliasedTableExpression(SqlBaseParser.AliasedTableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#aliasedTableExpression}.
	 * @param ctx the parse tree
	 */
	void exitAliasedTableExpression(SqlBaseParser.AliasedTableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableNameExpress}
	 * labeled alternative in {@link SqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableNameExpress(SqlBaseParser.TableNameExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableNameExpress}
	 * labeled alternative in {@link SqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableNameExpress(SqlBaseParser.TableNameExpressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionSelectTableExpress}
	 * labeled alternative in {@link SqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 */
	void enterUnionSelectTableExpress(SqlBaseParser.UnionSelectTableExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionSelectTableExpress}
	 * labeled alternative in {@link SqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 */
	void exitUnionSelectTableExpress(SqlBaseParser.UnionSelectTableExpressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subQueryTableExpress}
	 * labeled alternative in {@link SqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubQueryTableExpress(SqlBaseParser.SubQueryTableExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subQueryTableExpress}
	 * labeled alternative in {@link SqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubQueryTableExpress(SqlBaseParser.SubQueryTableExpressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subTableExpressionExpress}
	 * labeled alternative in {@link SqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubTableExpressionExpress(SqlBaseParser.SubTableExpressionExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subTableExpressionExpress}
	 * labeled alternative in {@link SqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubTableExpressionExpress(SqlBaseParser.SubTableExpressionExpressContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#unionTableExpress}.
	 * @param ctx the parse tree
	 */
	void enterUnionTableExpress(SqlBaseParser.UnionTableExpressContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#unionTableExpress}.
	 * @param ctx the parse tree
	 */
	void exitUnionTableExpress(SqlBaseParser.UnionTableExpressContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#groupByExpression}.
	 * @param ctx the parse tree
	 */
	void enterGroupByExpression(SqlBaseParser.GroupByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#groupByExpression}.
	 * @param ctx the parse tree
	 */
	void exitGroupByExpression(SqlBaseParser.GroupByExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhereExpression(SqlBaseParser.WhereExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhereExpression(SqlBaseParser.WhereExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderByExpression(SqlBaseParser.OrderByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderByExpression(SqlBaseParser.OrderByExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#havingExpression}.
	 * @param ctx the parse tree
	 */
	void enterHavingExpression(SqlBaseParser.HavingExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#havingExpression}.
	 * @param ctx the parse tree
	 */
	void exitHavingExpression(SqlBaseParser.HavingExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SqlBaseParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SqlBaseParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(SqlBaseParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(SqlBaseParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(SqlBaseParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(SqlBaseParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(SqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(SqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterComparison(SqlBaseParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitComparison(SqlBaseParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quantifiedComparison}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterQuantifiedComparison(SqlBaseParser.QuantifiedComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quantifiedComparison}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitQuantifiedComparison(SqlBaseParser.QuantifiedComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code between}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBetween(SqlBaseParser.BetweenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code between}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBetween(SqlBaseParser.BetweenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inList}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterInList(SqlBaseParser.InListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inList}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitInList(SqlBaseParser.InListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inSubquery}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterInSubquery(SqlBaseParser.InSubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inSubquery}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitInSubquery(SqlBaseParser.InSubqueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code like}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLike(SqlBaseParser.LikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code like}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLike(SqlBaseParser.LikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullPredicate}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterNullPredicate(SqlBaseParser.NullPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullPredicate}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitNullPredicate(SqlBaseParser.NullPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticInterval}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticInterval(SqlBaseParser.ArithmeticIntervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticInterval}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticInterval(SqlBaseParser.ArithmeticIntervalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(SqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(SqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(SqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(SqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(SqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(SqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atTimeZone}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterAtTimeZone(SqlBaseParser.AtTimeZoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atTimeZone}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitAtTimeZone(SqlBaseParser.AtTimeZoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatenationExpression}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterConcatenationExpression(SqlBaseParser.ConcatenationExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatenationExpression}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitConcatenationExpression(SqlBaseParser.ConcatenationExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timeZoneInterval}
	 * labeled alternative in {@link SqlBaseParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTimeZoneInterval(SqlBaseParser.TimeZoneIntervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timeZoneInterval}
	 * labeled alternative in {@link SqlBaseParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTimeZoneInterval(SqlBaseParser.TimeZoneIntervalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code timeZoneString}
	 * labeled alternative in {@link SqlBaseParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 */
	void enterTimeZoneString(SqlBaseParser.TimeZoneStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code timeZoneString}
	 * labeled alternative in {@link SqlBaseParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 */
	void exitTimeZoneString(SqlBaseParser.TimeZoneStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void enterIntervalField(SqlBaseParser.IntervalFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#intervalField}.
	 * @param ctx the parse tree
	 */
	void exitIntervalField(SqlBaseParser.IntervalFieldContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dynamicParameter}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDynamicParameter(SqlBaseParser.DynamicParameterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dynamicParameter}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDynamicParameter(SqlBaseParser.DynamicParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(SqlBaseParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(SqlBaseParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(SqlBaseParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(SqlBaseParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subPriorityQueryExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubPriorityQueryExpression(SqlBaseParser.SubPriorityQueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subPriorityQueryExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubPriorityQueryExpression(SqlBaseParser.SubPriorityQueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(SqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(SqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(SqlBaseParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(SqlBaseParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(SqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(SqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specialVariable}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSpecialVariable(SqlBaseParser.SpecialVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specialVariable}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSpecialVariable(SqlBaseParser.SpecialVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(SqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(SqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SqlBaseParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SqlBaseParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SqlBaseParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SqlBaseParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(SqlBaseParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(SqlBaseParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(SqlBaseParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(SqlBaseParser.IntervalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(SqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(SqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subQueryExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubQueryExpression(SqlBaseParser.SubQueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subQueryExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubQueryExpression(SqlBaseParser.SubQueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subScript}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubScript(SqlBaseParser.SubScriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subScript}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubScript(SqlBaseParser.SubScriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberInterval}
	 * labeled alternative in {@link SqlBaseParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterNumberInterval(SqlBaseParser.NumberIntervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberInterval}
	 * labeled alternative in {@link SqlBaseParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitNumberInterval(SqlBaseParser.NumberIntervalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringInterval}
	 * labeled alternative in {@link SqlBaseParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterStringInterval(SqlBaseParser.StringIntervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringInterval}
	 * labeled alternative in {@link SqlBaseParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitStringInterval(SqlBaseParser.StringIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#onDuplicateCondition}.
	 * @param ctx the parse tree
	 */
	void enterOnDuplicateCondition(SqlBaseParser.OnDuplicateConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#onDuplicateCondition}.
	 * @param ctx the parse tree
	 */
	void exitOnDuplicateCondition(SqlBaseParser.OnDuplicateConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#columnAliases}.
	 * @param ctx the parse tree
	 */
	void enterColumnAliases(SqlBaseParser.ColumnAliasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#columnAliases}.
	 * @param ctx the parse tree
	 */
	void exitColumnAliases(SqlBaseParser.ColumnAliasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#valueAliases}.
	 * @param ctx the parse tree
	 */
	void enterValueAliases(SqlBaseParser.ValueAliasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#valueAliases}.
	 * @param ctx the parse tree
	 */
	void exitValueAliases(SqlBaseParser.ValueAliasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(SqlBaseParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(SqlBaseParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(SqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(SqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(SqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(SqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code basicStringLiteral}
	 * labeled alternative in {@link SqlBaseParser#string}.
	 * @param ctx the parse tree
	 */
	void enterBasicStringLiteral(SqlBaseParser.BasicStringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code basicStringLiteral}
	 * labeled alternative in {@link SqlBaseParser#string}.
	 * @param ctx the parse tree
	 */
	void exitBasicStringLiteral(SqlBaseParser.BasicStringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(SqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(SqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(SqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(SqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(SqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(SqlBaseParser.IntegerLiteralContext ctx);
}