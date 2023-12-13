package com.example.shardingjdbc.config;


import org.apache.shardingsphere.sharding.api.sharding.standard.PreciseShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.RangeShardingValue;
import org.apache.shardingsphere.sharding.api.sharding.standard.StandardShardingAlgorithm;
import org.springframework.stereotype.Component;
 
import java.util.*;
 

//@Component
public class MyShardingAlgorithm implements StandardShardingAlgorithm<String> {
 

    @Override
    public String doSharding(Collection<String> collection, PreciseShardingValue<String> preciseShardingValue) {
        for (String targetName : collection) {
            if (targetName.endsWith(preciseShardingValue.getValue().hashCode() % 2 + "")) {
                return targetName;
            }
        }
        throw new IllegalArgumentException();
    }


    @Override
    public Collection<String> doSharding(Collection<String> collection, RangeShardingValue<String> rangeShardingValue) {
        System.out.println(collection);
        return collection;
    }
 


 
    @Override
    public void init() {

    }

    @Override
    public String getType() {
        //　自定义 这里需要spi支持
        return null;
    }
 
}