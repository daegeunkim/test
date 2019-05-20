package com.example.demo.main;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class main {
	@RequestMapping("/")
	public String main() {
		
		String test = "hello world";
		
		return test;
		
	}
}
