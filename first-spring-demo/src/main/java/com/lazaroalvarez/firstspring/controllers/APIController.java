package com.lazaroalvarez.firstspring.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {
	
	@RequestMapping("/api")
	public String apiTest() {
		return "Hello World!!";
	}
	
	@RequestMapping("/api/secretNumber")
	public int secretNumber() {
		return 6;
	}
	
}
