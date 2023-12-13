package com.example.shardingjdbc;

import com.example.shardingjdbc.entity.Order;
import com.example.shardingjdbc.entity.User;
import com.example.shardingjdbc.entity.Yh;
import com.example.shardingjdbc.mapper.OrderMapper;
import com.example.shardingjdbc.mapper.UserMapper;
import com.example.shardingjdbc.mapper.YhMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.List;

@SpringBootTest
public class VerticalShardingTest {


    @Autowired
    private UserMapper userMapper;

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private YhMapper yhMapper;

    /**
     * 垂直分片：插入数据测试
     */
    @Test
    public void testInsertOrderAndUser() {

        User user = new User();
        user.setUname("强哥");
        userMapper.insert(user);

        Order order = new Order();
        order.setOrderNo("ATGUIGU001");
        order.setUserId(user.getId());
        order.setAmount(new BigDecimal(100));
        orderMapper.insert(order);

    }

    /**
     * 垂直分片：查询数据测试
     */
    @Test
    public void testSelectFromOrderAndUser() {
        User user = userMapper.selectById(1L);
        Order order = orderMapper.selectById(1L);
    }

    @Test
    public void testOtherTable() {
        Yh yh = yhMapper.selectById(1L);
        System.out.println(yh);
    }
}
