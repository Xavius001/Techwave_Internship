package com.techwave.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {
	List<String> list = new ArrayList<String>();

	public SampleRestController() {
		list.add("Anh");
		list.add("Xavier");
		list.add("Thu");
		list.add("Allaman");
	}

	@GetMapping("/getAll")
	public List<String> getAll() {
		return list;
	}
	@GetMapping("/getAll/{index}")
	public String getbyId(@PathVariable("index") int id)
	{
		return list.get(id);
	}
	@PostMapping("/insert")
	public void insert(@RequestBody String Str)
	{
		list.add(Str);
	}
	@PutMapping("/update/{id}")
	public String update(@PathVariable("id")int id, @RequestBody String newstr)
	{
		list.set(id, newstr);
		return "Value Changed";
	}
	@DeleteMapping("/delete/{id}")
	public void Delete(@PathVariable("id") int id)
	{
		list.remove(id);
	}
	
	
	
	
	
	
	
	
	
}







