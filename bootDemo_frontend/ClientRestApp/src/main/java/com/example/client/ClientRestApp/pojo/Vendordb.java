package com.example.client.ClientRestApp.pojo;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

public class Vendordb{
	@NotNull(message="Required")
	private Integer vendorId;
	@NotBlank(message="Required")
	private String name;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message="Required")
	private LocalDate dateofRegitration;
	@NotNull(message="Required")
	private Integer durationinDays;
	
	public Integer getVendorId() {
		return vendorId;
	}
	public void setVendorId(Integer vendorId) {
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
	public Integer getDurationinDays() {
		return durationinDays;
	}
	public void setDurationinDays(Integer durationinDays) {
		this.durationinDays = durationinDays;
	}
	public Vendordb(Integer vendorId, String name, LocalDate dateofRegitration, Integer durationinDays) {
		this.vendorId = vendorId;
		this.name = name;
		this.dateofRegitration = dateofRegitration;
		this.durationinDays = durationinDays;
	}
	public Vendordb() {
		
	}
}

