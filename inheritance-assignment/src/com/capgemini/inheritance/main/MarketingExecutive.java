package com.capgemini.inheritance.main;

public class MarketingExecutive extends Employee {
	private double kilometerTravelled;
	private double tourAllowance;
	private double telephoneAllowance;
	
	public MarketingExecutive() {
		super();
		
	}
	public MarketingExecutive(int employeeId, String employeeName, double basicSalary, double medical,double kilometerTravelled) {
		
		super(employeeId, employeeName, basicSalary, medical);
		
		this.kilometerTravelled=kilometerTravelled;
	}
	
	public double getKilometerTravelled() {
		return kilometerTravelled;
	}
	
	public void setKilometerTravelled(double kilometerTravelled) {
		this.kilometerTravelled = kilometerTravelled;
	}
	
	public double getTourAllowance() {
		tourAllowance=5*getKilometerTravelled();
		return tourAllowance;
		
	}
	
	public double getTelephoneAllowance() {
		telephoneAllowance=1500;
		return telephoneAllowance;
	}
	
	public double employeeGrossSalary() {
		
		return (employeeGrossSalary()+getTourAllowance()+getTelephoneAllowance());
	}
	
	public double employeeNetSalary() {
		
		double pf=12*(getBasicSalary())/100;
		int pt=200;
	
		return (employeeGrossSalary()-(pf+pt));
	}
	
	
		

}
