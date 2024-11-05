package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo2Application {
	
	@GetMapping("/hello")
	public String helloWord(){
		return "hello ";
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(Demo2Application.class, args);
	}

}
