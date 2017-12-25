package com.smile.contrallor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
public class TestApp {
	@RequestMapping("/hello1")
	public String hello1(){
		return "Hello--World";
	}

//	public static void main(String[] args) {
//		SpringApplication.run(TestApp.class, args);
//		
//	}
}
