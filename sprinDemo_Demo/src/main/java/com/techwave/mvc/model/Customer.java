package com.techwave.mvc.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

public class Customer {
	private int customerId;
	private String customerName;
	private String dor;
	private String type;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getDor() {
		return dor;
	}
	public void setDor(String dor) {
		this.dor = dor;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Customer() {}
	public Customer(int customerId, String customerName, String dor, String type) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.dor = dor;
		this.type = type;
	}
}
