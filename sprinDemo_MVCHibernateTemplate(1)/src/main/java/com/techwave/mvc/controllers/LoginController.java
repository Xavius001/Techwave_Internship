package com.techwave.mvc.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techwave.mvc.model.dao.Logindao;
import com.techwave.mvc.model.pojo.*;

@Controller
@SessionAttributes("user")
public class LoginController {
	@Autowired
	Logindao logindao;

	@RequestMapping("login")
	public String Login(Model M) {

		M.addAttribute("login", new Login());
		return "Login";
	}

	@RequestMapping("Validatelogin")
	public String ValidateLogin(@Valid @ModelAttribute("login") Login login, BindingResult bs, Model M) {
		if (bs.hasErrors()) {
			return "Login";
		} else {
			String type = logindao.validateLogin(login);
			if(!type.equals("Invalid"))
				M.addAttribute("user",login.getUsername());
				
			
			if (type.equals("admin")) {
			
				return "redirect:/insertbook";// jsp Page
			} else if (type.equals("associate")) {
				return "redirect:/updateBook";
			} else {
				M.addAttribute("msg", "Invalid Credentials");
				return "Login";
			}
		}
	}

	@RequestMapping("Contactus")
	public String Contactus() {
		return "Contactus";
	}

	@RequestMapping("Services")
	public String Services() {
		return "Services";
	}

}
