package com.dzkjdx.jsb.mycommunity.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Notification {
    int id;
    int notifierId;
    int targetId;
    int articleId;
    int commentId;
    Timestamp createTime;
    Timestamp updateTime;
}
