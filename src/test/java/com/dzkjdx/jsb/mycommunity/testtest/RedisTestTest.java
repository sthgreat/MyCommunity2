package com.dzkjdx.jsb.mycommunity.testtest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import static org.junit.jupiter.api.Assertions.*;

class RedisTestTest {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    @Test
    void connectToRedis() {
        redisTemplate.opsForValue().set("key","value");
        System.out.println(redisTemplate.opsForValue().get("key"));
    }
}