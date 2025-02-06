package com.koyeb.example_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KissankoyebCalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(KissankoyebCalculatorApplication.class, args);
	}
//	@GetMapping("/")
//	public String hello()
//	{
//		return String.format("Hello world")	;
//	}

}
