// Generated from com\xweb\sql\parser\QuerySqlBase.g4 by ANTLR 4.9.1
package com.xweb.sql.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link QuerySqlBaseParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface QuerySqlBaseVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code select}
	 * labeled alternative in {@link QuerySqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(QuerySqlBaseParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuerySqlBaseParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(QuerySqlBaseParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuerySqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryNoWith(QuerySqlBaseParser.QueryNoWithContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuerySqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuantifier(QuerySqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectSingle}
	 * labeled alternative in {@link QuerySqlBaseParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSingle(QuerySqlBaseParser.SelectSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectAll}
	 * labeled alternative in {@link QuerySqlBaseParser#selectItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectAll(QuerySqlBaseParser.SelectAllContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuerySqlBaseParser#tableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExpression(QuerySqlBaseParser.TableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code joinTableExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#tableExpressionExpress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinTableExpress(QuerySqlBaseParser.JoinTableExpressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleTableExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#tableExpressionExpress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTableExpress(QuerySqlBaseParser.SimpleTableExpressContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuerySqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(QuerySqlBaseParser.JoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuerySqlBaseParser#joinCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCondition(QuerySqlBaseParser.JoinConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuerySqlBaseParser#simpleTableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleTableExpression(QuerySqlBaseParser.SimpleTableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuerySqlBaseParser#aliasedTableExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedTableExpression(QuerySqlBaseParser.AliasedTableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableNameExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableNameExpress(QuerySqlBaseParser.TableNameExpressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subQueryTableExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubQueryTableExpress(QuerySqlBaseParser.SubQueryTableExpressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subTableExpressionExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#tableExpressPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubTableExpressionExpress(QuerySqlBaseParser.SubTableExpressionExpressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code groupByExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#groupByExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByExpress(QuerySqlBaseParser.GroupByExpressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whereExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#whereExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereExpress(QuerySqlBaseParser.WhereExpressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orderByExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#orderByExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByExpress(QuerySqlBaseParser.OrderByExpressContext ctx);
	/**
	 * Visit a parse tree produced by the {@code havingExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#havingExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingExpress(QuerySqlBaseParser.HavingExpressContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuerySqlBaseParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(QuerySqlBaseParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link QuerySqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(QuerySqlBaseParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link QuerySqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicated(QuerySqlBaseParser.PredicatedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link QuerySqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinary(QuerySqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link QuerySqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(QuerySqlBaseParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quantifiedComparison}
	 * labeled alternative in {@link QuerySqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuantifiedComparison(QuerySqlBaseParser.QuantifiedComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code between}
	 * labeled alternative in {@link QuerySqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetween(QuerySqlBaseParser.BetweenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inList}
	 * labeled alternative in {@link QuerySqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInList(QuerySqlBaseParser.InListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inSubquery}
	 * labeled alternative in {@link QuerySqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInSubquery(QuerySqlBaseParser.InSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code like}
	 * labeled alternative in {@link QuerySqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike(QuerySqlBaseParser.LikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullPredicate}
	 * labeled alternative in {@link QuerySqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullPredicate(QuerySqlBaseParser.NullPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link QuerySqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(QuerySqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(QuerySqlBaseParser.DereferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCase(QuerySqlBaseParser.SimpleCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(QuerySqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(QuerySqlBaseParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(QuerySqlBaseParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstructor(QuerySqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subSupQueryExpression}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubSupQueryExpression(QuerySqlBaseParser.SubSupQueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(QuerySqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(QuerySqlBaseParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(QuerySqlBaseParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(QuerySqlBaseParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(QuerySqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subQueryExpression}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubQueryExpression(QuerySqlBaseParser.SubQueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuerySqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(QuerySqlBaseParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuerySqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(QuerySqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link QuerySqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(QuerySqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link QuerySqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(QuerySqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basicStringLiteral}
	 * labeled alternative in {@link QuerySqlBaseParser#string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasicStringLiteral(QuerySqlBaseParser.BasicStringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link QuerySqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(QuerySqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link QuerySqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(QuerySqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link QuerySqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(QuerySqlBaseParser.IntegerLiteralContext ctx);
}