package com.techwave.demo.Model;

import java.time.LocalDate;

public class Vendor{
	
	private int vendorId;
	private String name;
	private LocalDate dateofRegitration;
	private int durationinDays;
	
	
	
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateofRegitration() {
		return dateofRegitration;
	}
	public void setDateofRegitration(LocalDate dateofRegitration) {
		this.dateofRegitration = dateofRegitration;
	}
	public int getDurationinDays() {
		return durationinDays;
	}
	public void setDurationinDays(int durationinDays) {
		this.durationinDays = durationinDays;
	}
	public Vendor(int vendorId, String name, LocalDate dateofRegitration, int durationinDays) {
		this.vendorId = vendorId;
		this.name = name;
		this.dateofRegitration = dateofRegitration;
		this.durationinDays = durationinDays;
	}
	public Vendor() {
		
	}
	

}
