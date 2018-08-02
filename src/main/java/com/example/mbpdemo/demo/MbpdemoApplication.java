package com.example.mbpdemo.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mbpdemo.demo.*")
public class MbpdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MbpdemoApplication.class, args);
	}
}
