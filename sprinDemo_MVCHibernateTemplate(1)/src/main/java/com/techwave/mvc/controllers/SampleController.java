package com.techwave.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
	@RequestMapping("Child")
	public String Child() {
		return "Child";
	}
	@RequestMapping("Child2")
	public String Child2() {
		return "Child2";
	}
}
