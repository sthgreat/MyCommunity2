package com.dzkjdx.jsb.mycommunity.dao;

import com.dzkjdx.jsb.mycommunity.MyseckillApplicationTests;
import com.dzkjdx.jsb.mycommunity.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.ParameterResolutionDelegate;

import static org.junit.jupiter.api.Assertions.*;

class UserMapperTest extends MyseckillApplicationTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    void insertNewUser() {
        User user = new User();
        user.setUserSex("男");
        user.setUserPassword("123456");
        user.setUserName("jsb");
        user.setEmail("284387885@qq.com");
        userMapper.insertNewUser(user);
    }

    @Test
    void countByUserName() {
        int jsb = userMapper.countByUserName("jsb");
        System.out.println(jsb);
    }

    @Test
    void countByUserEmail() {
    }
}