package com.techwave.mvc.model.pojo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;
@Entity
public class Book {
@Id 
	private int bookid;
private String bookname;
@DateTimeFormat(pattern = "yyyy-MM-dd")
private LocalDate dop;
public int getBookid() {
	return bookid;
}
public void setBookid(int bookid) {
	this.bookid = bookid;
}
public String getBookname() {
	return bookname;
}
public void setBookname(String bookname) {
	this.bookname = bookname;
}
public LocalDate getDop() {
	return dop;
}
public void setDop(LocalDate dop) {
	this.dop = dop;
}
public Book() {}
public Book(int bookid, String bookname, LocalDate dop) {
	super();
	this.bookid = bookid;
	this.bookname = bookname;
	this.dop = dop;
}
	
}
