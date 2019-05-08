package com.capgemini.inheritance.main;

public class EmployeeManager extends Employee {
	
		private double petrolAllowance;
		private double foodAllowance;
		private double otherAllowance;
		
		public EmployeeManager() {
			super();
			
		}
		
		public EmployeeManager(int employeeId, String employeeName, double basicSalary, double medical) {
			super(employeeId, employeeName, basicSalary, medical);
	
		}

		public double getPetrolAllowance() {
			petrolAllowance=8*getBasicSalary()/100;
			return petrolAllowance;
		}


		public double getFoodAllowance() {
			foodAllowance=13*getBasicSalary()/100;
			return foodAllowance;
		}



		public double getOtherAllowance() {
			otherAllowance=3*getBasicSalary()/100;
			return otherAllowance;
		}
		
		public double employeeGrossSalary() {
			
			return (super.employeeGrossSalary()+getPetrolAllowance()+getPetrolAllowance()+getPetrolAllowance());
		}

		
		public double employeeNetSalary() {
			double pf=12*(getBasicSalary())/100;
			int pt=200;
		
			return (employeeGrossSalary()-(pf+pt));
		}
		
		                        
		
		
}
