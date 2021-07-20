package com.pjb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot启动类
 * @author pan_junbiao
 **/
@MapperScan("com.pjb.mapper")
@SpringBootApplication
public class SpringbootMybatisDemoApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(SpringbootMybatisDemoApplication.class, args);
    }
}
