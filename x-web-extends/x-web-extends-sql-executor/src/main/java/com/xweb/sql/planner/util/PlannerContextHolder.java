package com.xweb.sql.planner.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PlannerContextHolder {
    private static ThreadLocal<Map<String, String>> tableAliasMap = new ThreadLocal<>();


    public static String getTableNameByAlias(String alias) {
        if (!Optional.ofNullable(tableAliasMap.get()).isPresent()) {
            tableAliasMap.set(new HashMap<>());
            return null;
        }
        return tableAliasMap.get().get(alias);
    }

    public static void setTableNameAlias(String alias, String tableName) {
        if (!Optional.ofNullable(tableAliasMap.get()).isPresent()) {
            tableAliasMap.set(new HashMap<>());
        }
        tableAliasMap.get().put(alias, tableName);
    }
}
