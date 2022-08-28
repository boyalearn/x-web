# 使用指南

## MVC
1.使用驼峰转下划线

2.枚举转数字

3.统一参数验证

4.定制输出参数值

## 数据库

1.数据库枚举转换配置

```yaml
mybatis-plus:
  configuration:
    default-enum-type-handler: com.xweb.common.mybatis.NumEnumTypeHandler
```
