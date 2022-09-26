package com.techwave.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techwave.mvc.model.project;

@Controller 
public class SampleController {
	
	@RequestMapping("/home")
	public String home() {
		return "homepage";
	}
	
	@RequestMapping("/test")
	public String test() {
		return "test";
	}
	
	@RequestMapping("/")
	public String projectdetails() {
		return "getProject";
	}
	
	@RequestMapping("FetchProject")
	public String getProjectDetails(@ModelAttribute project P) {
		System.out.println(P);
		return "getProject";
	}
}
