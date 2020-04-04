package com.dzkjdx.jsb.mycommunity.controller;

import com.dzkjdx.jsb.mycommunity.form.UserLoginForm;
import com.dzkjdx.jsb.mycommunity.form.UserRegisterForm;
import com.dzkjdx.jsb.mycommunity.pojo.User;
import com.dzkjdx.jsb.mycommunity.service.UserService;
import com.dzkjdx.jsb.mycommunity.vo.ResponseVo;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private RedisTemplate<String,String> redisTemplate;

    @PostMapping("/register")
    public ResponseVo<User> register(@RequestBody @Valid UserRegisterForm userRegisterForm){
        User user = new User();
        BeanUtils.copyProperties(userRegisterForm, user);
        return userService.register(user);
    }

    @PostMapping("/login")
    public ResponseVo<User> login(@RequestBody @Valid UserLoginForm userLoginForm,
                                  HttpServletResponse response, HttpServletRequest request){
        return userService.login(userLoginForm, response, request.getSession());
    }

    @GetMapping("/logout")
    public ResponseVo<User> logout(HttpServletRequest request, HttpServletResponse response){
        return userService.logout(request, response);
    }
}