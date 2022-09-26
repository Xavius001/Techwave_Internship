package com.techwave.demo.repositories;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.techwave.demo.Model.Vendordb;

@Repository
public interface VendorRepository extends JpaRepository<Vendordb, Integer> {
	List<Vendordb> findByName(String name);
	List<Vendordb> findByDateofRegitrationGreaterThan(LocalDate dor);
}

//FindAll
//FindById
//Insert - save
//update - save
//delete