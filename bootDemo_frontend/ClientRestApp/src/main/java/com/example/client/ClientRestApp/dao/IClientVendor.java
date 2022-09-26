package com.example.client.ClientRestApp.dao;

import java.util.List;

import com.example.client.ClientRestApp.pojo.Vendordb;

public interface IClientVendor {
	
	List<Vendordb> getAllvendors(); //get
	
	Vendordb getVendorsById(int vendorId);
	
	String AddVendor(Vendordb V);
	
	String ModifyVendor(Vendordb V);
	
	String DeleteVendor(Vendordb V);
}
