package com.techwave.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techwave.mvc.model.dao.Empdao;
import com.techwave.mvc.model.pojo.Deptdata;
import com.techwave.mvc.model.pojo.Emp;

@Controller
public class ValidationController {
	@Autowired
	Empdao empdao;
	static List<Deptdata> dlist;
	@RequestMapping("Validate")
	public String ValidateEmp(Model M)
	{
		dlist=empdao.extractDept();
		M.addAttribute("dlist",dlist);
		M.addAttribute("emp",new Emp());
		return "validateEmp";
		
	}
	@RequestMapping("getvalidEmp")
	public String getValidEmp(@Valid @ModelAttribute("emp") Emp emp,BindingResult bs,Model M)
	{
		M.addAttribute("dlist",dlist);
		
		if(bs.hasErrors())
			return "validateEmp";
		else
			return "home";
		
	}
	
	
}
