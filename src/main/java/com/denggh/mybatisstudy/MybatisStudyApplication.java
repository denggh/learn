package com.denggh.mybatisstudy;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.denggh.mybatisstudy.dao")
public class MybatisStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisStudyApplication.class, args);
    }

}
