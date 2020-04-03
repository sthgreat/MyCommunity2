package com.dzkjdx.jsb.mycommunity;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.dzkjdx.jsb.mycommunity.dao")
public class MyseckillApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyseckillApplication.class, args);
    }

}
