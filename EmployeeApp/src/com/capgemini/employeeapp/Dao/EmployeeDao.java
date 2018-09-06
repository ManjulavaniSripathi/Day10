package com.capgemini.employeeapp.Dao;

import java.util.List;

import com.capgemini.employeeapp.model.Employee;

public interface EmployeeDao {
	public List<Employee> findAllEmployees();
	public Employee findEmployeeById(int employeeid);
	public boolean deleteEmployee(int employeeId);
	public boolean addEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);


	
}
