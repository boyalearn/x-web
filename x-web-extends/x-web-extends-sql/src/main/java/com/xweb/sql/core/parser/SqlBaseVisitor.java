// Generated from com\xweb\sql\core\parser\SqlBase.g4 by ANTLR 4.9.1
package com.xweb.sql.core.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlBaseParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlBaseVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefault(SqlBaseParser.StatementDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertIntoDefault}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertIntoDefault(SqlBaseParser.InsertIntoDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertIntoAsQuery}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertIntoAsQuery(SqlBaseParser.InsertIntoAsQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deleteDefault}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteDefault(SqlBaseParser.DeleteDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code updateDefault}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateDefault(SqlBaseParser.UpdateDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mergeDefault}
	 * labeled alternative in {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeDefault(SqlBaseParser.MergeDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SqlBaseParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#unionExpress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionExpress(SqlBaseParser.UnionExpressContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#queryItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryItem(SqlBaseParser.QueryItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleSelect}
	 * labeled alternative in {@link SqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleSelect(SqlBaseParser.SingleSelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimary(SqlBaseParser.QueryPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code limitPageExpress}
	 * labeled alternative in {@link SqlBaseParser#pageExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitPageExpress(SqlBaseParser.LimitPageExpressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code offsetPageExpress}
	 * labeled alternative in {@link SqlBaseParser#pageExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffsetPageExpress(SqlBaseParser.OffsetPageExpressContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#orderByPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByPart(SqlBaseParser.OrderByPartContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#matchThenExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchThenExpression(SqlBaseParser.MatchThenExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mergeUpdateOperator}
	 * labeled alternative in {@link SqlBaseParser#mergeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeUpdateOperator(SqlBaseParser.MergeUpdateOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mergeDeleteOperator}
	 * labeled alternative in {@link SqlBaseParser#mergeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeDeleteOperator(SqlBaseParser.MergeDeleteOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mergeInsertOperator}
	 * labeled alternative in {@link SqlBaseParser#mergeOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeInsertOperator(SqlBaseParser.MergeInsertOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#limitRowCount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitRowCount(SqlBaseParser.LimitRowCountContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#rowCount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowCount(SqlBaseParser.RowCountContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuantifier(SqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectSingle}
	 * labeled alternative in {@link SqlBaseParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSingle(SqlBaseParser.SelectSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link SqlBaseParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectAll(SqlBaseParser.SelectAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#tableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExpression(SqlBaseParser.TableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinTableExpress}
	 * labeled alternative in {@link SqlBaseParser#tableExpressionExpress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinTableExpress(SqlBaseParser.JoinTableExpressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleTableExpress}
	 * labeled alternative in {@link SqlBaseParser#tableExpressionExpress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTableExpress(SqlBaseParser.SimpleTableExpressContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(SqlBaseParser.JoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#joinCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCondition(SqlBaseParser.JoinConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#simpleTableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTableExpression(SqlBaseParser.SimpleTableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#aliasedTableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedTableExpression(SqlBaseParser.AliasedTableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableNameExpress}
	 * labeled alternative in {@link SqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNameExpress(SqlBaseParser.TableNameExpressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unionSelectTableExpress}
	 * labeled alternative in {@link SqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionSelectTableExpress(SqlBaseParser.UnionSelectTableExpressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subQueryTableExpress}
	 * labeled alternative in {@link SqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubQueryTableExpress(SqlBaseParser.SubQueryTableExpressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subTableExpressionExpress}
	 * labeled alternative in {@link SqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubTableExpressionExpress(SqlBaseParser.SubTableExpressionExpressContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#unionTableExpress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionTableExpress(SqlBaseParser.UnionTableExpressContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#groupByExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByExpression(SqlBaseParser.GroupByExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#whereExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereExpression(SqlBaseParser.WhereExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#orderByExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByExpression(SqlBaseParser.OrderByExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#havingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingExpression(SqlBaseParser.HavingExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SqlBaseParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(SqlBaseParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicated(SqlBaseParser.PredicatedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinary(SqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(SqlBaseParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quantifiedComparison}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifiedComparison(SqlBaseParser.QuantifiedComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code between}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween(SqlBaseParser.BetweenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inList}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInList(SqlBaseParser.InListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inSubquery}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInSubquery(SqlBaseParser.InSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code like}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike(SqlBaseParser.LikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullPredicate}
	 * labeled alternative in {@link SqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullPredicate(SqlBaseParser.NullPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(SqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(SqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(SqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atTimeZone}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtTimeZone(SqlBaseParser.AtTimeZoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concatenationExpression}
	 * labeled alternative in {@link SqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatenationExpression(SqlBaseParser.ConcatenationExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timeZoneInterval}
	 * labeled alternative in {@link SqlBaseParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeZoneInterval(SqlBaseParser.TimeZoneIntervalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code timeZoneString}
	 * labeled alternative in {@link SqlBaseParser#timeZoneSpecifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeZoneString(SqlBaseParser.TimeZoneStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(SqlBaseParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#intervalField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalField(SqlBaseParser.IntervalFieldContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dynamicParameter}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDynamicParameter(SqlBaseParser.DynamicParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(SqlBaseParser.DereferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCase(SqlBaseParser.SimpleCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subPriorityQueryExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubPriorityQueryExpression(SqlBaseParser.SubPriorityQueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(SqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(SqlBaseParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstructor(SqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specialVariable}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialVariable(SqlBaseParser.SpecialVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(SqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SqlBaseParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SqlBaseParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(SqlBaseParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(SqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subQueryExpression}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubQueryExpression(SqlBaseParser.SubQueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subScript}
	 * labeled alternative in {@link SqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubScript(SqlBaseParser.SubScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#onDuplicateCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnDuplicateCondition(SqlBaseParser.OnDuplicateConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#columnAliases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnAliases(SqlBaseParser.ColumnAliasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#valueAliases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueAliases(SqlBaseParser.ValueAliasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(SqlBaseParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(SqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(SqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basicStringLiteral}
	 * labeled alternative in {@link SqlBaseParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicStringLiteral(SqlBaseParser.BasicStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(SqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(SqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(SqlBaseParser.IntegerLiteralContext ctx);
}