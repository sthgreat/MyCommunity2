package com.dzkjdx.jsb.mycommunity.controller;

import com.dzkjdx.jsb.mycommunity.form.UserLoginForm;
import com.dzkjdx.jsb.mycommunity.form.UserRegisterForm;
import com.dzkjdx.jsb.mycommunity.pojo.User;
import com.dzkjdx.jsb.mycommunity.service.UserService;
import com.dzkjdx.jsb.mycommunity.vo.ResponseVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseVo<User> register(@RequestBody @Valid UserRegisterForm userRegisterForm){
        User user = new User();
        BeanUtils.copyProperties(userRegisterForm, user);
        return userService.register(user);
    }

    @PostMapping("login")
    public ResponseVo<User> login(@RequestBody @Valid UserLoginForm userLoginForm){
        return userService.login(userLoginForm);
    }
}
