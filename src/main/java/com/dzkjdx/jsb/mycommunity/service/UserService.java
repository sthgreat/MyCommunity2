package com.dzkjdx.jsb.mycommunity.service;

import com.dzkjdx.jsb.mycommunity.Enum.StatusCode;
import com.dzkjdx.jsb.mycommunity.dao.UserMapper;
import com.dzkjdx.jsb.mycommunity.form.UserLoginForm;
import com.dzkjdx.jsb.mycommunity.pojo.User;
import com.dzkjdx.jsb.mycommunity.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import java.nio.charset.StandardCharsets;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private StringRedisTemplate redisTemplate;

    public ResponseVo<User> register(User user) {
        //TODO 注册时频繁查找数据库会带来压力。
        //校验 用户名，邮箱不能重复
        int countByUsername = userMapper.countByUserName(user.getUserName());
        if (countByUsername > 0) {
            return ResponseVo.error(StatusCode.USERNAME_EXIST);
        }
        int countByEmail = userMapper.countByUserEmail(user.getEmail());
        if (countByEmail > 0) {
            return ResponseVo.error(StatusCode.EMAIL_EXIST);
        }
        //md5加密（Spring自带）
        user.setUserPassword(DigestUtils.md5DigestAsHex(
                user.getUserPassword().getBytes(StandardCharsets.UTF_8)));

        //写入数据库
        int resultConut = userMapper.insertNewUser(user);
        if (resultConut == 0) {
            return ResponseVo.error(StatusCode.ERROR);
        }

        return ResponseVo.success(StatusCode.REGISTER_SUCCESS.getCode(),
                StatusCode.REGISTER_SUCCESS.getDesc());
    }

    public ResponseVo<User> login(UserLoginForm userLoginForm) {
        //使用redis作分布式session

        return null;
    }
}
