package com.smile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
public class TestJsp {
	@RequestMapping("/index")
	public String turnjsp(){
		
		return "index";
	}
	public static void main(String[] args) {
		SpringApplication.run(TestJsp.class, args);
	}
}
