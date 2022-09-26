package com.example.client.ClientRestApp.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.client.ClientRestApp.dao.ClientVendor;
import com.example.client.ClientRestApp.pojo.Vendordb;

@Controller
public class HomeController {
	
	@Autowired
	ClientVendor cVendor;
	
	@RequestMapping("/getall")
	public String getHome(Model M) {
		M.addAttribute("vlist", cVendor.getAllvendors());
		return "Extract";
	}
	
	@RequestMapping("/addVendor")
	public String addVendor(Model M) {
		M.addAttribute("vendor", new Vendordb());
		return "insert";
	}
	
	@RequestMapping("/getVendorDetails")
	//yes i did
	public String getVendorDetails(@Valid @ModelAttribute("vendor") Vendordb V, BindingResult BS, Model M) {
		if(BS.hasErrors()) {
			System.out.println("errors");
			return "insert";
		}
		else {
			String msg = cVendor.AddVendor(V);
			M.addAttribute("msg", msg);
			return "insert";
		}
	}
	
	@RequestMapping("/getbyId")
	public String getById(Model M) {
		M.addAttribute("vendor", new Vendordb());
		return "getbyId";
	}
	
	@RequestMapping("/getVendorId")
	public String getId(@RequestParam("vendorId") int vendorId, Model M) {
//		Vendordb V = cVendor.getVendorsById(vendorId);
//		M.addAttribute("vendor", V);
//		return "getbyId";
		try {
			Vendordb V = cVendor.getVendorsById(vendorId);
			if(V!=null) {
				M.addAttribute("vendor", V);
				return "getbyId";
			}
			else {
				throw new Exception();
			}
		} catch(Exception E) {
			M.addAttribute("vendor", new Vendordb());
			M.addAttribute("msg", "Vendor not found.");
			return "getbyId";
		}
	}
	
	@RequestMapping("/update")
	public String update(@ModelAttribute("vendor") Vendordb V, Model M) {
		String msg = cVendor.ModifyVendor(V);
		M.addAttribute("msg", msg);
		return "getbyId";
	}
	
	@RequestMapping("/delete")
	public String delete(@ModelAttribute("vendor") Vendordb V, Model M) {
		String msg = cVendor.DeleteVendor(V);
		M.addAttribute("msg", msg);
		return "getbyId";
	}
}
