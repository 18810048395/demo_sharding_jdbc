package com.example.shardingjdbc;

import com.example.shardingjdbc.entity.User;
import com.example.shardingjdbc.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
class ReadWriteTests {

    @Autowired
    private UserMapper userMapper;



    /**
     * 写入数据的测试
     */
    @Test
    public void testInsert(){

        User user = new User();
        user.setUname("张三丰");
        userMapper.insert(user);
    }

    /**
     * 事务测试
     */
    @Transactional//开启事务
    @Test
    public void testTrans(){
        // 不添加@Transactional：insert对主库操作，select对从库操作
        // 添加@Transactional：则insert和select均对主库操作
        // **注意：**在JUnit环境下的@Transactional注解，默认情况下就会对事务进行回滚（即使在没加注解@Rollback，也会对事务回滚）
        User user = new User();
        user.setUname("铁锤");
        userMapper.insert(user);

        List<User> users = userMapper.selectList(null);
    }

    @Test
    void contextLoads() {

    }

}
