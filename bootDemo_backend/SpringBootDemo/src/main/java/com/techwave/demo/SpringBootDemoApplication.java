package com.techwave.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
//@EnableAutoConfiguration()//Tomcat and other required services are added automatically
//@ComponentScan// To search for controller class(in package where main fnction is present)
//@Configuration// If we want create any extra bean 

public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}
	


}
