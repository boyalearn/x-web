package com.xweb.sql.planner;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class LogicPlannerContext {
    private static ThreadLocal<Map<String, String>> tableAliasMapping = new ThreadLocal<>();


    public static String getTableNameByAlias(String alias) {
        if (!Optional.ofNullable(tableAliasMapping.get()).isPresent()) {
            tableAliasMapping.set(new HashMap<>());
            return null;
        }
        return tableAliasMapping.get().get(alias);
    }

    public static void setTableNameAlias(String alias, String tableName) {
        if (!Optional.ofNullable(tableAliasMapping.get()).isPresent()) {
            tableAliasMapping.set(new HashMap<>());
        }
        tableAliasMapping.get().put(alias, tableName);
    }
}
