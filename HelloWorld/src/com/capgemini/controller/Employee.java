package com.capgemini.controller;

public class Employee {
	int empnumber;
	String empname;
	String empdept;
	double Salary;


		
	public Employee() {
		super();
	
	}
	
	public Employee(int empnumber, String empname, String empdept, double salary) {
		super();
		this.empnumber = empnumber;
		this.empname = empname;
		this.empdept = empdept;
		Salary = salary;
	}

	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getSalary() {
		return Salary;
	}
	public void setSalary(double salary) {
		Salary = salary;
	}
	public String getEmpdept() {
		return empdept;
	}
	public void setEmpdept(String empdept) {
		this.empdept = empdept;
	}
	
	}


