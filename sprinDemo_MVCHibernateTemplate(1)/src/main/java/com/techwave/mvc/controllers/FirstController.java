package com.techwave.mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("msg")
public class FirstController {

	@RequestMapping("first")
	public String first(Model M)
	{
		M.addAttribute("msg","Message set in FirstController in FirstMEthod");
		return "first";
	}
	@RequestMapping("second")
	public String Second()
	{
		return "second";
	}
	
}
