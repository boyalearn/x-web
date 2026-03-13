
## 特性
1.支持子查询、"case when"语句、函数、"between"语句、数组下标的解析。






总结：
1.词法不要定义重复的，不然根据优先级只能匹配到一种模式。
2.只有单个分支的规则可以生成对应的方法统一处理
SELECT SUM(found) FROM ((SELECT 1 as found FROM information_schema.tables WHERE table_schema=?) UNION ALL (SELECT 1 as found FROM information_schema.views WHERE table_schema=? LIMIT 1) UNION ALL (SELECT 1 as found FROM information_schema.table_constraints WHERE table_schema=? LIMIT 1) UNION ALL (SELECT 1 as found FROM information_schema.triggers WHERE trigger_schema=? LIMIT 1) UNION ALL (SELECT 1 as found FROM information_schema.routines WHERE routine_schema=? LIMIT 1) UNION ALL (SELECT 1 as found FROM information_schema.events WHERE event_schema=? LIMIT 1)) as all_found
