package com.techwave.mvc.controllers;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techwave.mvc.model.dao.Empdao;
import com.techwave.mvc.model.pojo.Book;
import com.techwave.mvc.model.pojo.Deptdata;
import com.techwave.mvc.model.pojo.Emp;

@Controller
//@SessionAttributes("message")
public class EmpController {
	@Autowired
	Empdao empdao;
	static List<Book> blist=null;
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
	 
		List<Object> Elist=empdao.Extract()
	    		.stream().filter(i->i.getDeptno()==dno)
	    		.collect(Collectors.toList());
		M.addAttribute("Elist",Elist);
		M.addAttribute("dlist",list);
		M.addAttribute("dno",dno);
		return "getEmp";
	}
	
	@RequestMapping("insertbook")
	public String insertBook(Model M)
	{
		M.addAttribute("book",new Book());
		M.addAttribute("message","This is sample for requestscope");
		return "insert";
		
	}
	@RequestMapping("getBook")
	@Transactional
	public String getBook(@ModelAttribute("book") Book B,Model M)
	{
		System.out.println("First");
		String S=empdao.insertBook(B);
		M.addAttribute("msg", S);
		return "insert";
	}
	
	@RequestMapping("updateBook")
	public String updateBook(Model M)
	{
		blist=empdao.extractBook();
		M.addAttribute("blist",blist);
		M.addAttribute("book",new Book());
		return "Update";
	}
	@RequestMapping("fetchBook/{bid}")
	public String FetchBook(@PathVariable("bid") int bid,  Model M)
	{
	
		//Book B= empdao.extractBook().stream().filter(i->i.getBookid()==bid).collect(Collectors.toList()).get(0);
		Book B=empdao.getById(bid);
		M.addAttribute("book",B);
		M.addAttribute("blist",blist);
			
		return "Update";
	}
	
	@RequestMapping("updateNewBook")
	@Transactional
	public String updateNewBook(@ModelAttribute("book") Book newBook,Model M)
	{
		String msg=empdao.Update(newBook);
		M.addAttribute("msg",msg);
		M.addAttribute("blist",blist);
		return "Update";
	}
	
	
	
	
	}
