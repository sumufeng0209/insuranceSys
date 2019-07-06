package org.java;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value = "org.java.dao")
@SpringBootApplication
public class InsuranceSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(InsuranceSysApplication.class, args);
    }

}
