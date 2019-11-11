package com.example.MvcMysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.thymeleaf.dialect.springdata.SpringDataDialect;

@SpringBootApplication
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(MainClass.class, args);
	}

	  @Bean
	    public SpringDataDialect springDataDialect() {
	        return new SpringDataDialect();
	    }
}