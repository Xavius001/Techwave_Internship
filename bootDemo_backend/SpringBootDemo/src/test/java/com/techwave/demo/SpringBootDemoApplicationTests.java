package com.techwave.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.techwave.demo.Model.Vendordb;
import com.techwave.demo.dao.VendorDaoImpl;
import com.techwave.demo.repositories.VendorRepository;

@SpringBootTest
class SpringBootDemoApplicationTests {

	@Autowired
	VendorDaoImpl vendorDaoImpl;
	
	@MockBean
	VendorRepository vendorRepository;
	
	//Test case for getallVendors() of VendorDaoImpl class
	@Test
	public void testgetallVendors() {
		when(vendorRepository.findAll()).thenReturn
		(Stream.of(new Vendordb(1,"Abc",LocalDate.parse("2000-09-01"),20), 
				new Vendordb(2,"Xyz",LocalDate.parse("2000-09-01"),40)).collect(Collectors.toList()));
		assertEquals(2,vendorDaoImpl.getallVendors().size());
	}
	
	@Test
	public void testInsertVendor() {
		Vendordb V = new Vendordb(2,"Xyz",LocalDate.parse("2000-09-01"),40);
		when(vendorRepository.save(V)).thenReturn(V);
		assertEquals("Vendor details added successfully", vendorDaoImpl.InsertVendor(V));
		verify(vendorRepository, times(1)).save(V); //indicates whether save is called
		 
	}
	
	@Test
	public void testDeleteVendor() {
		Vendordb V = new Vendordb(1,"Xyz",LocalDate.parse("2000-09-01"),40);
		when(vendorRepository.findById(1).get()).thenReturn
		(Stream.of(V).collect(Collectors.toList()).get(0));
		assertEquals("1 Vendor deleted", vendorDaoImpl.DeleteVendor(V));
	}

}
