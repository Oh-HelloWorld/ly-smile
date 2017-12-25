package com.smile.contrallor;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@EnableAutoConfiguration
public class TestContrallor {
	@RequestMapping("/hello")
	public String hello(){
		return "Hello World";
	}

//	public static void main(String[] args) {
//		SpringApplication.run(TestContrallor.class, args);
//		
//	}
}
