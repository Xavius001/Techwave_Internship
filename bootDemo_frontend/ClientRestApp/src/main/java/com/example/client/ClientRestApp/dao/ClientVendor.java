package com.example.client.ClientRestApp.dao;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.client.ClientRestApp.pojo.Vendordb;

@Service
public class ClientVendor implements IClientVendor {

	@Autowired
	RestTemplate restTemplate;
	public String url="http://localhost:9090/"; //server
	
	@Override
	public List<Vendordb> getAllvendors() {
		Vendordb vlist[] = restTemplate.getForObject(url+"getVendors", Vendordb[].class);
		return Arrays.asList(vlist);
	}

	@Override
	public String AddVendor(Vendordb V) {
		// TODO Auto-generated method stub
		return restTemplate.postForObject(url+"addVendor", V, String.class);
	}

	@Override
	public Vendordb getVendorsById(int vendorId) {
		return restTemplate.getForObject(url+"getById/"+vendorId, Vendordb.class);
	}

	@Override
	public String ModifyVendor(Vendordb V) {
		restTemplate.put(url+"modifyVendor/"+V.getVendorId(), V);
		return "Vendor details are updated";
	}

	@Override
	public String DeleteVendor(Vendordb V) {
		restTemplate.delete(url+"removeVendor/"+V.getVendorId());
		return "Vendor deleted";
	}


}
