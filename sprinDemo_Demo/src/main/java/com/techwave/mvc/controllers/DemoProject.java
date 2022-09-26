package com.techwave.mvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.techwave.mvc.model.project;

@Controller
public class DemoProject {
	@RequestMapping("sendMsg")
	public String sendMsg(Model M) {
		String S = "1 row inserted";
		M.addAttribute("msg", S); /*msg is attribute variable 
		which can be used in View(jsp)
		S is a java variable*/
		return "SendMsg"; //jsp page name
	}
	
	@RequestMapping("sendMessage")
	public ModelAndView sendMessage() {
		String S = "1 row inserted";
		ModelAndView M = new ModelAndView("sendMessage"); //sendMessage is jsp file
		M.addObject("msg", S);
		return M;
	}
	
	@RequestMapping("sendObject")
	public String sendObject(Model M) {
		project p = new project(1, "BANKING SYSTEM", 90);
		M.addAttribute("project", p);
		return "getObject";
	}
	
	//we will send multiple objects to View
	@RequestMapping("sendObjects")
	public String sendObjects(Model M) {
		List<project> list = new ArrayList<project>();
		list.add(new project(1,"BMS",90));
		list.add(new project(2,"HMS",100));
		list.add(new project(3,"MMS",120));
		list.add(new project(4,"HHMS",100));
		M.addAttribute("projectlist", list);
		return "getObjects";
	}
	
	/*@RequestMapping("sendObjects")
	public ModelAndView sendObjects() {
		List<project> list = new ArrayList<project>();
		list.add(new project(1,"BMS",90));
		list.add(new project(2,"HMS",100));
		list.add(new project(3,"MMS",120));
		list.add(new project(4,"HHMS",100));
		ModelAndView M = new ModelAndView("getObjects");
		M.addObject("projectlist", list);
		return M;
	}*/
	
}
