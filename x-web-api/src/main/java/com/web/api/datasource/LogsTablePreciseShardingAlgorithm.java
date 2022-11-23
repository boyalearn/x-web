package com.web.api.datasource;

import lombok.Getter;
import org.apache.shardingsphere.sharding.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.RangeShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.StandardShardingAlgorithm;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Properties;

@Getter
public class LogsTablePreciseShardingAlgorithm implements StandardShardingAlgorithm<Date> {

    private Properties properties;

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<Date> preciseShardingValue) {
        Date date = preciseShardingValue.getValue();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyyMMdd");
        String day = simpleDateFormat.format(date);
        System.out.println(collection.toArray());
        String tableName = "t_logs_" + day;
        collection.add(tableName);
        return tableName;
    }

    @Override
    public Collection<String> doSharding(Collection<String> collection, RangeShardingValue<Date> rangeShardingValue) {
        return collection;
    }

    @Override
    public Properties getProps() {
        return this.properties;
    }

    @Override
    public void init(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String getType() {
        return "USER_CUSTOM";
    }
}
