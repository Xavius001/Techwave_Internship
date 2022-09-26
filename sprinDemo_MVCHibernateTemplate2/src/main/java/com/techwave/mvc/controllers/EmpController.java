package com.techwave.mvc.controllers;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.techwave.mvc.model.dao.Empdao;
import com.techwave.mvc.model.pojo.Book;
import com.techwave.mvc.model.pojo.Deptdata;
import com.techwave.mvc.model.pojo.Emp;

@Controller
public class EmpController {
	@Autowired
	Empdao empdao;
	static List<Deptdata> list=null;
	@RequestMapping("/")
	public String Extract(Model M) {
		M.addAttribute("lemp", empdao.Extract());
		return "Displayemp";
	}

	@RequestMapping("getemps")
	public String getEmps(Model M) {
		list=empdao.extractDept();
		M.addAttribute("dlist",list);
		return "getEmp";
	}
	@RequestMapping("getEmpbyDept")
	public String getEmpbyDept(@RequestParam("dno") int dno,Model M)
	{
	 
		List<Emp> Elist=empdao.Extract()
	    		.stream().filter(i->i.getDeptno()==dno)
	    		.collect(Collectors.toList());
		M.addAttribute("Elist",Elist);
		M.addAttribute("dlist",list);
		M.addAttribute("dno",dno);
		return "getEmp";
	}
	
	@RequestMapping("insert")
	public String insertBook(Model M)
	{
		M.addAttribute("book",new Book());
		return "insert";
		
	}
	@RequestMapping("getBook")
	@Transactional
	public String getBook(@ModelAttribute("book") Book B,Model M)
	{
		System.out.println(B.getBookid()+ " "+B.getBookname()+ " "+B.getDop());
		String S=empdao.insertBook(B);
		M.addAttribute("msg", S);
		return "insert";
		
	}
	
	
	

}
