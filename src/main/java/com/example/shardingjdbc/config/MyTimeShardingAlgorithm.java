package com.example.shardingjdbc.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.shardingsphere.sharding.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.RangeShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.StandardShardingAlgorithm;

import java.util.Collection;
import java.util.Date;

@Slf4j
public class MyTimeShardingAlgorithm implements StandardShardingAlgorithm<Date> {
    @Override
    public String doSharding(Collection<String> availableTargetNames, PreciseShardingValue<Date> shardingValue) {

        /**
         * 适配分表为server-user.t_yh2023_$->{1..5}
         * t_yh2023_1,t_yh2023_2,t_yh2023_3....
         */
        System.out.println("table PreciseShardingAlgorithm ");
        // 真实节点
        availableTargetNames.stream().forEach((item) -> {
            log.info("actual node table:{}", item);
        });

        log.info("logic table name:{},rout column:{}", shardingValue.getLogicTableName(), shardingValue.getColumnName());

        //精确分片
        log.info("column value:{}", shardingValue.getValue());


        String tb_name = shardingValue.getLogicTableName();


        // 根据当前日期 来 分库分表
        Date date = shardingValue.getValue();
        String year = String.format("%tY", date);
        String mon =String.valueOf(Integer.parseInt(String.format("%tm", date))); // 去掉前缀0
        String dat = String.format("%td", date);


        // 选择表
        tb_name = tb_name + year + "_" + mon;
        System.out.println("tb_name:" + tb_name);

        for (String each : availableTargetNames) {
            System.out.println("t_yh:" + each);
            if (each.equals(tb_name)) {
                return each;
            }
        }

        throw new IllegalArgumentException();
    }

    @Override
    public Collection<String> doSharding(Collection<String> collection, RangeShardingValue<Date> rangeShardingValue) {
        return collection;
    }

    @Override
    public void init() {

    }

    @Override
    public String getType() {
        return null;
    }
}
