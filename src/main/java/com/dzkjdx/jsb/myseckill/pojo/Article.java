package com.dzkjdx.jsb.myseckill.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Article {
    int id;
    int authorId;
    String title;
    String description;
    int likeCount;
    int readCount;
    int commentCount;
    String tag;
    Timestamp createTime;
    Timestamp updateTime;
}
