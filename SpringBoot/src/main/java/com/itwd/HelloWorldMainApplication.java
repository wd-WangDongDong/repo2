package com.itwd;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *@SpringBootApplication用来标记一个主程序 说明这是一个springboot应用
 */
@SpringBootApplication
public class HelloWorldMainApplication {

    public static void main(String[] args) {
        //spring应用启动
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
