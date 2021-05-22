package com.pankaj.learning.jenkinstest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class controller {

	@GetMapping(value="hello")
	public String helloMap(){
		return "Hello Jenkins Wolrd!!";
	}
	
}
