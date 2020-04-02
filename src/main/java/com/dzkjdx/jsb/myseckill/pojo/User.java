package com.dzkjdx.jsb.myseckill.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class User {
    int id;
    String sex;
    String userPhoneNumber;
    String userName;
    String userPassword;
    BigDecimal userMoney;
    int userTotalArticle;
    int userTotalPraise;
    Timestamp createTime;
    Timestamp updateTime;
}
