package com.dzkjdx.jsb.myseckill.pojo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ArticleComment {
    int id;
    String description;
    int authorId;
    int type;
    int parentId;
    int likeCount;
    Timestamp createTime;
    Timestamp updateTime;
}
