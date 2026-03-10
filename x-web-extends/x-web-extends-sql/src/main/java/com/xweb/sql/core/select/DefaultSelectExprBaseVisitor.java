package com.xweb.sql.core.select;

import com.xweb.sql.core.*;
import com.xweb.sql.parser.SelectExprBaseVisitor;
import com.xweb.sql.parser.SelectExprParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DefaultSelectExprBaseVisitor extends SelectExprBaseVisitor {

    private List<SelectItem> selectItems = new ArrayList<>();

    private Table table;

    private List<Join> joins = new ArrayList<>();

    private List<Condition> conditions = new ArrayList<>();

    private Stack<Object> stack = new Stack<>();


    @Override
    public Object visitSqlExpr(SelectExprParser.SqlExprContext ctx) {
        return super.visitSqlExpr(ctx);
    }

    @Override
    public Object visitAllItem(SelectExprParser.AllItemContext ctx) {
        this.selectItems.add(new AllItem("*"));
        return super.visitAllItem(ctx);
    }

    @Override
    public Object visitSelectList(SelectExprParser.SelectListContext ctx) {
        return super.visitSelectList(ctx);
    }

    @Override
    public Object visitSubSelect(SelectExprParser.SubSelectContext ctx) {
        return super.visitSubSelect(ctx);
    }

    @Override
    public Object visitFuncExpr(SelectExprParser.FuncExprContext ctx) {
        return super.visitFuncExpr(ctx);
    }

    @Override
    public Object visitField(SelectExprParser.FieldContext ctx) {
        SelectItem selectItem;
        if (ctx.children.get(0) instanceof SelectExprParser.CommonFieldContext) {
            selectItem = new ColumnItem(ctx.children.get(0).getText());
        } else {
            int size = ((SelectExprParser.ArrayFieldContext) (ctx.children.get(0))).children.size();
            ColumnIndexItem columnIndexItem = new ColumnIndexItem();
            columnIndexItem.setName(((SelectExprParser.ArrayFieldContext) (ctx.children.get(0))).children.get(0).getText());
            columnIndexItem.setIndexArray(new int[size - 3]);
            for (int i = 2; i < size - 1; i++) {
                columnIndexItem.getIndexArray()[i - 2] = Integer.valueOf(((SelectExprParser.ArrayFieldContext) (ctx.children.get(0))).children.get(i).getText());
            }
            selectItem = columnIndexItem;
        }
        if (this.stack.size() > 0) {
            Object currentParent = this.stack.peek();
            SelectParserUtil.setParentChild(currentParent, selectItem);
        } else {
            this.selectItems.add(selectItem);
        }
        return null;
    }

    @Override
    public Object visitPrioritySubSelect(SelectExprParser.PrioritySubSelectContext ctx) {
        return super.visitPrioritySubSelect(ctx);
    }

    @Override
    public Object visitAlias(SelectExprParser.AliasContext ctx) {
        String alias = ctx.children.get(1).getText();
        AliasItem aliasItem = new AliasItem();
        aliasItem.setAlias(alias);
        this.stack.push(aliasItem);
        Object result = super.visitAlias(ctx);
        selectItems.add(aliasItem);
        this.stack.pop();
        return result;
    }

    @Override
    public Object visitAsAlias(SelectExprParser.AsAliasContext ctx) {
        return super.visitAsAlias(ctx);
    }

    @Override
    public Object visitFunc(SelectExprParser.FuncContext ctx) {
        return super.visitFunc(ctx);
    }

    @Override
    public Object visitTable(SelectExprParser.TableContext ctx) {
        this.table = new Table();
        table.setTableName(ctx.getText());
        return super.visitTable(ctx);
    }

    @Override
    public Object visitCommonField(SelectExprParser.CommonFieldContext ctx) {
        SelectItem selectItem = new ColumnItem(ctx.getText());
        return selectItem;
    }

    @Override
    public Object visitArrayField(SelectExprParser.ArrayFieldContext ctx) {
        int size = ctx.children.size();
        ColumnIndexItem columnIndexItem = new ColumnIndexItem();
        columnIndexItem.setName(ctx.children.get(0).getText());
        columnIndexItem.setIndexArray(new int[size - 3]);
        for (int i = 2; i < size - 1; i++) {
            columnIndexItem.getIndexArray()[i - 2] = Integer.valueOf(ctx.children.get(i).getText());
        }
        return columnIndexItem;
    }

    @Override
    public Object visitExpr(SelectExprParser.ExprContext ctx) {
        return super.visitExpr(ctx);
    }

    @Override
    public Object visitConditions(SelectExprParser.ConditionsContext ctx) {
        return super.visitConditions(ctx);
    }

    @Override
    public Object visitSimpleCondition(SelectExprParser.SimpleConditionContext ctx) {
        SimpleCondition simpleCondition = new SimpleCondition();
        if (ctx.children.get(0) instanceof SelectExprParser.CommonFieldContext) {
            simpleCondition.setItem((SelectItem) this.visitCommonField((SelectExprParser.CommonFieldContext) ctx.children.get(0)));
        } else {
            simpleCondition.setItem((SelectItem) this.visitArrayField((SelectExprParser.ArrayFieldContext) ctx.children.get(0)));
        }
        simpleCondition.setCondition(ctx.children.get(1).getText());
        simpleCondition.setValue(ctx.children.get(2).getText());
        this.conditions.add(simpleCondition);
        return null;
    }

    @Override
    public Object visitJoinCondition(SelectExprParser.JoinConditionContext ctx) {
        return super.visitJoinCondition(ctx);
    }

    public String toSql() {
        StringBuffer sql = new StringBuffer();
        sql.append("select ");
        for (int i = 0; i < this.selectItems.size(); i++) {
            sql.append(this.selectItems.get(i) + ",");
        }
        sql.setLength(sql.length() - 1);
        sql.append(" from ");
        sql.append(table.toString() + " ");
        for (Join join : joins) {
            sql.append(join);
        }
        if (conditions.size() > 0) {
            sql.append(" where ");

            for (int i = 0; i < conditions.size(); i++) {
                if (i > 0) {
                    sql.append(" and ");
                }
                sql.append(conditions.get(i));

            }
        }
        return sql.toString();
    }
}
