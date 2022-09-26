package com.techwave.mvc.controllers;

import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.techwave.mvc.model.Customer;

@Controller 
public class CustomerController {

	//step 1
	@RequestMapping("getCust")
	public String getCustomer() {
		return "Customer";
	}

	//step 3
	@RequestMapping("fetch")
	public String getdetails(@ModelAttribute("C") Customer cust, Model M) {
		M.addAttribute("customer", cust);
		return "DisplayCustomer";
	}
	
	/*step 3 alternate
	@RequestMapping("fetch")
	public String getdetails(@RequestParam("cId") int cid, 
		@RequestParam("cName") String cname,
		@RequestParam("dor") String dor,
		@RequestParam("type") String type, Model M) {
		Customer cust = new Customer(cid, cname, dor, type);
		M.addAttribute("customer", cust);
		return "DisplayCustomer";
	}
	 */
}
