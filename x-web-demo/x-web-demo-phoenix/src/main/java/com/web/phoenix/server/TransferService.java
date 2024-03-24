package com.web.phoenix.server;

import com.web.phoenix.mapper.CommonMapper;
import com.web.phoenix.utils.PhoenixUtil;
import com.xweb.common.utils.StringUtils;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author zouhuixing
 * @date 2024/3/22
 */
@Service
@AllArgsConstructor
@Slf4j
public class TransferService {

    private CommonMapper commonMapper;


    @PostConstruct
    public void transfer() {
        long startTime = System.currentTimeMillis();
        System.out.println(String.format("start time is %d", startTime));
        transferInSameTable("TEST_TABLE", "TEST_TABLE_COPY");
        System.out.println(String.format("spend time is %d", System.currentTimeMillis() - startTime));
    }

    public boolean existTable(String tableName) {
        List<Map> desc = commonMapper.list(String.format("SELECT COLUMN_NAME,DATA_TYPE,KEY_SEQ FROM system.catalog WHERE table_name = '%s'", tableName));
        if (desc.isEmpty()) {
            return false;
        }
        return true;
    }

    public void transferInSameTable(String sourceTable, String targetTable) {
        //创建目标表
        if (!existTable(targetTable)) {
            String createTableSql = buildCreateTableSql(sourceTable, targetTable);
            commonMapper.update(createTableSql);
        }
        //获取表字段
        List<Map> tableFields = getTableFields(targetTable);
        String rowKeyName = "";
        for (Map tableField : tableFields) {
            if (null != tableField.get("KEY_SEQ") && "1".equals(tableField.get("KEY_SEQ").toString())) {
                rowKeyName = String.valueOf(tableField.get("COLUMN_NAME"));
            }
        }
        if (StringUtils.isEmpty(rowKeyName)) {
            log.error("this table is not rowKey");
            return;
        }

        boolean isContinue = true;
        while (isContinue) {
            List<Map> dataList = listTableData(sourceTable, "50");
            if (dataList.isEmpty()) {
                isContinue = false;
            }
            for (Map data : dataList) {
                String insertTableSql = buildInsertTableSql(targetTable, tableFields, data);
                commonMapper.update(insertTableSql);
                commonMapper.delete(String.format("delete from %s where %s='%s'", sourceTable, rowKeyName, data.get(rowKeyName)));
            }

        }

    }

    public List<Map> listTableData(String tableName, String limit) {
        return commonMapper.list(String.format("select * from %s limit %s", tableName, limit));
    }

    public String buildCreateTableSql(String sourceTable, String targetTable) {
        List<Map> createTableMapList = commonMapper.list(String.format("show create table %s", sourceTable));
        if (createTableMapList.isEmpty()) {
            throw new RuntimeException("source table is not exist");
        }
        return createTableMapList.get(0).get("CREATE STATEMENT").toString().replace(sourceTable.toUpperCase(), targetTable.toUpperCase());
    }

    public String buildInsertTableSql(String tableName, List<Map> fields, Map<String, Object> data) {
        StringBuffer sqlBuffer = new StringBuffer("UPSERT INTO " + tableName + "(");
        for (Map field : fields) {
            sqlBuffer.append(field.get("COLUMN_NAME") + ",");
        }
        sqlBuffer.replace(sqlBuffer.length() - 1, sqlBuffer.length(), ")");
        sqlBuffer.append("values (");
        for (Map field : fields) {
            String dataType = PhoenixUtil.indexOfDataType(Integer.valueOf(field.get("DATA_TYPE").toString()));
            if ("VARCHAR".equals(dataType)) {
                sqlBuffer.append("'" + data.get(field.get("COLUMN_NAME")) + "',");
            } else {
                sqlBuffer.append(data.get(field.get("COLUMN_NAME")) + ",");
            }
        }
        sqlBuffer.replace(sqlBuffer.length() - 1, sqlBuffer.length(), ")");
        return sqlBuffer.toString();
    }


    public List<Map> getTableFields(String tableName) {
        List<Map> desc = commonMapper.list(String.format("SELECT COLUMN_NAME,DATA_TYPE,KEY_SEQ FROM system.catalog WHERE table_name = '%s'", tableName));
        if (desc.isEmpty()) {
            log.error("sourceTable is not exist.");
            throw new RuntimeException("source table is not exist");
        }
        List<Map> result = new ArrayList<>();
        for (Map info : desc) {
            if (null == info) {
                continue;
            }
            result.add(info);
        }
        return result;
    }

    public String manualCreateTable(String sourceTable, String targetTable) {
        List<Map> desc = commonMapper.list(String.format("SELECT * FROM system.catalog WHERE table_name = '%s'", sourceTable));
        if (desc.isEmpty()) {
            log.error("sourceTable is not exist.");
            throw new RuntimeException("source table is not exist");
        }
        StringBuffer sqlBuffer = new StringBuffer("CREATE TABLE " + targetTable);
        for (int i = 0; i < desc.size(); i++) {
            Map info = desc.get(i);
            if (info == null) {
                continue;
            }
            if (sqlBuffer.indexOf("(") < 0) {
                sqlBuffer.append("(\r\n" + info.get("COLUMN_NAME") + " ");
            } else {
                sqlBuffer.append(",\r\n" + info.get("COLUMN_NAME") + " ");
            }
            sqlBuffer.append(PhoenixUtil.indexOfDataType(Integer.valueOf(String.valueOf(info.get("DATA_TYPE")))));
        }
        sqlBuffer.append(")");
        return sqlBuffer.toString();
    }
}
