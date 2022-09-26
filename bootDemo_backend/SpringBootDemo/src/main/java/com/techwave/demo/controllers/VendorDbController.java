package com.techwave.demo.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techwave.demo.Model.Vendordb;
import com.techwave.demo.dao.VendorDaoImpl;
import com.techwave.demo.repositories.VendorRepository;

@RestController
public class VendorDbController {
	
	@Autowired
	VendorDaoImpl vendorDaoImpl;
	
	@GetMapping("getVendors")
	public List<Vendordb> getAllVendors() {
		List<Vendordb> list = vendorDaoImpl.getallVendors();
		for(Vendordb V: list)
		{
			System.out.println(V.getVendorId()+" "+V.getName());
		}
		return list;
	}
	
	@GetMapping("getById/{vendorId}")
	public Vendordb getByVenderId(@PathVariable("vendorId") int vendorId) {
		return vendorDaoImpl.getByVenderId(vendorId);
	}
	
	@GetMapping("getByname/{name}")
	public List<Vendordb> getByVendorName(@PathVariable("name") String name) {
		return vendorDaoImpl.getbyVendorName(name);
	}
	
	@GetMapping("getByDate/{dor}")
	public List<Vendordb> getVendorByDate(@PathVariable("dor") String dor) {
		return vendorDaoImpl.getByDate(LocalDate.parse(dor));
	}
	
	@PostMapping("addVendor")
	public String addVendor(@RequestBody Vendordb V) {
		return vendorDaoImpl.InsertVendor(V);
	}
	
	@PutMapping("modifyVendor/{vendorId}") 
	public String modifyVendor(@RequestBody Vendordb V, @PathVariable("vendorId") int vendorId) {
		return vendorDaoImpl.UpdateVendor(V, vendorId);
	}
	
	@DeleteMapping("removeVendor/{vendorId}")
	public String removeVendor(@PathVariable("vendorId") int vendorId) {
		return vendorDaoImpl.DeleteVendor(vendorDaoImpl.getByVenderId(vendorId));
	}
}
