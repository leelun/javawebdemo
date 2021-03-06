package com.newland.usercenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:spring.xml")
public class SpringUserApplication {
    public static void main(String[] args){
        SpringApplication.run(SpringUserApplication.class,args);
    }
}
