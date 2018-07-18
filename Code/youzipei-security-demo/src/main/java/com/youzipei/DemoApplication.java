package com.youzipei;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author fixyou
 *
 */
@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(DemoApplication.class, args);
		
	}
	@GetMapping("/hello")
	public String hello(){
		return "hello,spring security";
	}
}
