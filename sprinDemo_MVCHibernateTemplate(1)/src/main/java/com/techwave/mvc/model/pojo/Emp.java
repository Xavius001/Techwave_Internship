package com.techwave.mvc.model.pojo;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Emp {
	@NotNull(message="Empno required")
	@Id
	private int empno;
	@NotBlank(message="Required")
	private String ename;
	@NotBlank(message="Required")
	private String job;
	@NotNull(message="Mgr required")
	private Integer mgr;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate hiredate;
	@Min(value=10000,message = "Sal must minimum 10000")
	private double sal;
	private Double comm;
	@NotNull(message="deptno required")
	private int deptno;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public Integer getMgr() {
		return mgr;
	}
	public void setMgr(int mgr) {
		this.mgr = mgr;
	}
	public LocalDate getHiredate() {
		return hiredate;
	}
	public void setHiredate(LocalDate hiredate) {
		this.hiredate = hiredate;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public Double getComm() {
		return comm;
	}
	public void setComm(Double comm) {
		this.comm = comm;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public Emp(int empno, String ename, String job, int mgr, LocalDate hiredate, double sal, double comm, int deptno) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.mgr = mgr;
		this.hiredate = hiredate;
		this.sal = sal;
		this.comm = comm;
		this.deptno = deptno;
	}
	public Emp() {
		super();
	}
	
}
