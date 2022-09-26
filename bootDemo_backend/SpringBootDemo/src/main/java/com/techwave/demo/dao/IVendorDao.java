package com.techwave.demo.dao;

import java.time.LocalDate;
import java.util.List;

import com.techwave.demo.Model.Vendordb;

public interface IVendorDao {
	
	List<Vendordb> getallVendors();
	
	Vendordb getByVenderId(int vendorId);
	
	String DeleteVendor(Vendordb V);
	
	String UpdateVendor(Vendordb V, int vendorId);
	
	String InsertVendor(Vendordb V);
	
	List<Vendordb> getbyVendorName(String name);
	
	List<Vendordb> getByDate(LocalDate dor);
}
