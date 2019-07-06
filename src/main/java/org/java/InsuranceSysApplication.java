package org.java;

import org.activiti.spring.boot.SecurityAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan(value = "org.java.dao")
@EnableTransactionManagement
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class InsuranceSysApplication {

    public static void main(String[] args) {
        SpringApplication.run(InsuranceSysApplication.class, args);
    }

}
