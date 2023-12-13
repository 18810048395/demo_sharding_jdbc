package com.example.shardingjdbc.controller;

import com.example.shardingjdbc.entity.User;
import com.example.shardingjdbc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    /**
     * 测试负载均衡策略
     */
    @GetMapping("/selectAll")
    @ResponseBody
    public String selectAll() {
        List<User> users = userMapper.selectList(null);
        return users.toString();
    }
}
