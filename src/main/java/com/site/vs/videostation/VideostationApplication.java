package com.site.vs.videostation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication
public class VideostationApplication {


    public static void main(String[] args) {
        SpringApplication.run(VideostationApplication.class, args);
    }

}
