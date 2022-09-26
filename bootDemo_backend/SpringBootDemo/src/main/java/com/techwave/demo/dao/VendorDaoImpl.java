package com.techwave.demo.dao;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techwave.demo.Model.Vendordb;
import com.techwave.demo.repositories.VendorRepository;

@Service
public class VendorDaoImpl implements IVendorDao {
	
	@Autowired
	VendorRepository vendorRepository;

	@Override
	public List<Vendordb> getallVendors() {
		List<Vendordb> list = vendorRepository.findAll();// 
		for(Vendordb V: list)
		{
			System.out.println(V.getVendorId()+" "+V.getName());
		}
		return list;
	}

	@Override
	public Vendordb getByVenderId(int vendorId) {
		Vendordb V = vendorRepository.findById(vendorId).get();
		//select * from vendordb where vendorid=10
		return V;
	}

	@Override
	public String DeleteVendor(Vendordb vdb) {
		// TODO Auto-generated method stub
		Vendordb V = vendorRepository.findById(vdb.getVendorId()).get();
		if(V==null) {
			return "No Vendor found with this Id";
		}
		else {
			vendorRepository.delete(V);
			return "1 Vendor deleted";
		}
	}

	@Override
	public String UpdateVendor(Vendordb modified, int vendorId) {
		Vendordb old = vendorRepository.findById(vendorId).get();
		if(old==null) {
			return "No Vendor found with this Id";
		}
		else {
			old.setName(modified.getName());
			old.setDateofRegitration(modified.getDateofRegitration());
			old.setDurationinDays(modified.getDurationinDays());
			vendorRepository.save(old); //save will update the row if 
			//vendorId already exists.
			return "Vendor details updated successfully";
		}
	}

	@Override
	public String InsertVendor(Vendordb V) {
		vendorRepository.save(V);
		return "Vendor details added successfully";
	}
	
	@Override
	public List<Vendordb> getbyVendorName(String name) {
		return vendorRepository.findByName(name);
	}
	
	@Override
	public List<Vendordb> getByDate(LocalDate dor) {
		return vendorRepository.findByDateofRegitrationGreaterThan(dor);
	}

}
