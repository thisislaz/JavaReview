package com.lazaroalvarez.routesdemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {
	
	//option 1: requestmapping by default is GET
	@RequestMapping("/option1")
	public String option1() {
		return "option requestmapping";
	}
	
	//HTTP VERB: GET/ POST/ PUT/ DELETE
	// optioun 2: reequestmapping (longway)
	@RequestMapping(value="/option2", method=RequestMethod.GET)
	public String option2() {
		return "option2 request mapping";
	}
	
	//option 3 : getmapping / postmapping/ putmapping, deletemapping
	@GetMapping("/option3")
	public String option3() {
		return " This is the Getmapping option bruh";
	}
	
}
