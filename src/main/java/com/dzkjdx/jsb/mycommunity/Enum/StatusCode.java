package com.dzkjdx.jsb.mycommunity.Enum;

import lombok.Getter;

@Getter
public enum StatusCode {

    //1000为用户有关
    REGISTER_SUCCESS(1001,"用户注册成功"),

    USERNAME_EXIST(1002, "用户名已存在"),

    EMAIL_EXIST(1003,"邮箱已存在"),

    //5000为服务器本身有关
    ERROR(5001,"服务出错");


    Integer code;

    String desc;

    StatusCode(Integer statusCode, String description){
        this.code = statusCode;
        this.desc = description;
    }
}
