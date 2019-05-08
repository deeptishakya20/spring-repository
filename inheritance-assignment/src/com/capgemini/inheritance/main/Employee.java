package com.capgemini.inheritance.main;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double medical;
	public Employee() {
		super();
		
	}
	public Employee(int employeeId, String employeeName, double basicSalary, double medical) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medical = medical;
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
	
	public double getBasicSalary() {
		return basicSalary;
	}
	
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public double getMedical() {
		return medical;
	}
	
	public void setMedical(double medical) {
		this.medical = medical;
	}
	
	public double employeeGrossSalary() {
		double hra=50*(getBasicSalary())/100;
		return (getBasicSalary()+hra+getMedical());
	}
	
	public double employeeNetSalary() {
		double pf=12*(getBasicSalary())/100;
		int pt=200;
		return (employeeGrossSalary()-(pf+pt));
	}
	
}
