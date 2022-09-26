package com.techwave.demo.controllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techwave.demo.Model.Vendor;

@RestController
public class VendorController {
	List<Vendor> Vlist=new ArrayList<Vendor>();
	public VendorController()
	{
		Vlist.add(new Vendor(100, "XYZ", LocalDate.parse("2022-09-06"), 365));
		Vlist.add(new Vendor(200, "ABC", LocalDate.parse("2022-09-05"), 730));
	}
	@GetMapping("/getAllVendors")
	public List<Vendor> getAllVendors()
	{
		return Vlist;
	}
	@GetMapping("/getAllVendors/{Vendorid}")
	public Vendor getAllVendors(@PathVariable("Vendorid") int Vendorid)
	{
		return Vlist.stream().filter(i->i.getVendorId()==Vendorid).collect(Collectors.toList()).get(0);
	}
	
	@PostMapping("/InsertVendor")
	public void getAllVendors(@RequestBody Vendor  V)
	{
		Vlist.add(V);
	}
	@PutMapping("/UpdateVendor/{VendorId}")
	public void getAllVendors(@RequestBody Vendor  newVendor,@PathVariable("VendorId") int VendorId)
	{
		Vendor oldVendor=Vlist.stream().filter(i->i.getVendorId()==VendorId).collect(Collectors.toList()).get(0);
		oldVendor.setName(newVendor.getName());
		oldVendor.setDateofRegitration(newVendor.getDateofRegitration());
		oldVendor.setDurationinDays(newVendor.getDurationinDays());
	}
	
	@DeleteMapping("/DeleteVendor/{VendorId}")
	public void DeleteVendors(@PathVariable("VendorId") int VendorId)
	{
		Vendor vendor=Vlist.stream().filter(i->i.getVendorId()==VendorId).collect(Collectors.toList()).get(0);
		
		Vlist.remove(vendor);	
		
		
	
	}
	
	
	
	
	
	
}
