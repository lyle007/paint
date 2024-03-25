package com.pac.paint;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.sql.DataSource;

@SpringBootApplication
@MapperScan(basePackages = "com.pac.paint.mapper")
public class PaintApplication {
    public static void main(String[] args) {
        SpringApplication.run(PaintApplication.class, args);
    }

}
