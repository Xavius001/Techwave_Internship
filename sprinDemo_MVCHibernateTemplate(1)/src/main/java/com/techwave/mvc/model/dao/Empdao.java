package com.techwave.mvc.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.techwave.mvc.model.pojo.Book;
import com.techwave.mvc.model.pojo.Deptdata;
import com.techwave.mvc.model.pojo.Emp;

public class Empdao {

	HibernateTemplate template;

	public List<Emp> Extract() {
		return template.loadAll(Emp.class);
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	public List<Deptdata> extractDept() {
		List<Deptdata> d=template.loadAll(Deptdata.class);
		
		return d;
	}
	public List<Book> extractBook() {
		return template.loadAll(Book.class);
	
	}
	public String insertBook(Book B) {
		template.save(B);
		return "Book data stored";
	}
	public Book getById(int id)
	{
		return template.get(Book.class, id);
	}
	
	public String Update(Book newBook)
	{
			template.update(newBook);
			return "Book updated";
		
	}
}