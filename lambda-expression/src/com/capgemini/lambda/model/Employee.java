package com.capgemini.lambda.model;

import java.util.Objects;



public class Employee {
	
	private int employeeId;
	private String employeeName;
	private String employeeDepartment;
	private double salary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String employeeName, String employeeDepartment, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDepartment = employeeDepartment;
		this.salary = salary;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDepartment() {
		return employeeDepartment;
	}

	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(employeeId,employeeName);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if(obj instanceof Employee) {
			return false;
		}

		Employee employee = (Employee) obj;
		if(this.employeeId==employee.employeeId && this.employeeName==employee.employeeName) {
			return true;
		}
	
		return false;
	}
	
	@Override
	public String toString(){  
		  return employeeId+" "+employeeName;  
		 } 
	
	

}
