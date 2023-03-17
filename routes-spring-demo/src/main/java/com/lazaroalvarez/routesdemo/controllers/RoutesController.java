package com.lazaroalvarez.routesdemo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoutesController {
	// query parameter : ......search?keyword=whatever&count=5 9after form submission)
	//localhost:8080/search?=keyword=whatever
	@RequestMapping("/search")
	public String searchKeyword(@RequestParam("keyword") String keyword) {
		return "You are seacrhing for: "+keyword;
	}
	
	// localhost:8080/pet?name=pepper&age=14
	@RequestMapping("/pet")
	public String getPet(@RequestParam("name") String petName, @RequestParam("age") Integer age) {
		return "Your pet "+petName+ " is "+age+ " years old";
	}
	
	// localhost:8080/pet?name=pepper&age=14
	@RequestMapping("/optionalPet")
	public String getOptionalPet(@RequestParam(value="name",required=false) String petName, @RequestParam(value="age",required=false) Integer age) {
		if(age == null) {
			return "Age is not avaiable";
		}
		return "Your pet's name and are are not required: "+petName+ " is "+age+ " years old";
	}
	// path variable: codingdojo.com/m/130/20
	
}
