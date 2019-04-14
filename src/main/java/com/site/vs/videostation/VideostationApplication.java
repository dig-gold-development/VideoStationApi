package com.site.vs.videostation;

import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.hibernate.proxy.ProxyConfiguration;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.Properties;


@MapperScan("com.site.vs.videostation.mapper")
@SpringBootApplication
public class VideostationApplication {


    public static void main(String[] args) {
        SpringApplication.run(VideostationApplication.class, args);
    }



}
