package com.tutorial.mywebapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MywebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MywebappApplication.class, args);
	}
	
	@GetMapping("api/greeting")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return "Hello "+ name;
    }

}
