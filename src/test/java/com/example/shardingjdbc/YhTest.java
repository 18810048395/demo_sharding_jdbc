package com.example.shardingjdbc;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.shardingjdbc.entity.Order;
import com.example.shardingjdbc.entity.Yh;
import com.example.shardingjdbc.mapper.YhMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
public class YhTest {


    @Autowired
    private YhMapper yhMapper;


    /**
     * 水平分片：分表插入数据测试
     */
    @Test
    public void testInsertOrderTableStrategy() {

        for (long i = 0; i < 4; i++) {
            Yh yh = new Yh();
            yh.setName("test" + i);
            yhMapper.insert(yh);
        }
    }


    /**
     * 水平分片：查询所有记录
     * 查询了两个数据源，每个数据源中使用UNION ALL连接两个表
     */
    @Test
    public void testShardingSelectAll() {

        List<Yh> yhList = yhMapper.selectList(null);
        yhList.forEach(System.out::println);
    }

    @Test
    public void testShardingSelectByName() {
        QueryWrapper<Yh> yhQueryWrapper = new QueryWrapper<>();
        yhQueryWrapper.eq("name", "test1");
        List<Yh> yhList = yhMapper.selectList(yhQueryWrapper);
        yhList.forEach(System.out::println);
    }

    public static void main(String[] args) {
        long l1 =  70;
        long l2 = 50;

        System.out.println(l1/l2);
    }

}
