package com.techwave.mvc.model.dao;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.techwave.mvc.model.pojo.Login;

public class Logindao {
HibernateTemplate template;

public HibernateTemplate getTemplate() {
	return template;
}

public void setTemplate(HibernateTemplate template) {
	this.template = template;
}
public String validateLogin(Login L)
{
	Login login=null;
	login=template.get(Login.class, L.getUsername());   //abcd   2) abc aaa 3)abc xyz
//login abc xyz admin
	if(login==null)
	{
		return "Invalid";
	}
	else
	{
		if(login.getPassword().equals(L.getPassword()))
		{
			return login.getType();
		}
		else
		{
			return  "Invalid";
		}
		
		
	}
		
	
	
}

}
