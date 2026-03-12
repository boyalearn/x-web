// Generated from com\xweb\sql\parser\QuerySqlBase.g4 by ANTLR 4.9.1
package com.xweb.sql.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QuerySqlBaseParser}.
 */
public interface QuerySqlBaseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by the {@code select}
	 * labeled alternative in {@link QuerySqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect(QuerySqlBaseParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code select}
	 * labeled alternative in {@link QuerySqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect(QuerySqlBaseParser.SelectContext ctx);
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
	 * Enter a parse tree produced by {@link QuerySqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void enterQueryNoWith(QuerySqlBaseParser.QueryNoWithContext ctx);
	/**
	 * Exit a parse tree produced by {@link QuerySqlBaseParser#queryNoWith}.
	 * @param ctx the parse tree
	 */
	void exitQueryNoWith(QuerySqlBaseParser.QueryNoWithContext ctx);
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
	 * Enter a parse tree produced by the {@code groupByExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#groupByExpression}.
	 * @param ctx the parse tree
	 */
	void enterGroupByExpress(QuerySqlBaseParser.GroupByExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code groupByExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#groupByExpression}.
	 * @param ctx the parse tree
	 */
	void exitGroupByExpress(QuerySqlBaseParser.GroupByExpressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whereExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void enterWhereExpress(QuerySqlBaseParser.WhereExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whereExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#whereExpression}.
	 * @param ctx the parse tree
	 */
	void exitWhereExpress(QuerySqlBaseParser.WhereExpressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orderByExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderByExpress(QuerySqlBaseParser.OrderByExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orderByExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderByExpress(QuerySqlBaseParser.OrderByExpressContext ctx);
	/**
	 * Enter a parse tree produced by the {@code havingExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#havingExpression}.
	 * @param ctx the parse tree
	 */
	void enterHavingExpress(QuerySqlBaseParser.HavingExpressContext ctx);
	/**
	 * Exit a parse tree produced by the {@code havingExpress}
	 * labeled alternative in {@link QuerySqlBaseParser#havingExpression}.
	 * @param ctx the parse tree
	 */
	void exitHavingExpress(QuerySqlBaseParser.HavingExpressContext ctx);
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
	 * Enter a parse tree produced by the {@code subSupQueryExpression}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubSupQueryExpression(QuerySqlBaseParser.SubSupQueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subSupQueryExpression}
	 * labeled alternative in {@link QuerySqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubSupQueryExpression(QuerySqlBaseParser.SubSupQueryExpressionContext ctx);
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