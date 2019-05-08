package com.capgemini.main;

import com.capgemini.exceptions.CountryNotValidException;
import com.capgemini.exceptions.EmployeeNameInvalidException;
import com.capgemini.exceptions.TaxNotEligibleException;

public class TaxCalculator {

	private String empName;
	private boolean isIndian;
	private double empSal;

	public TaxCalculator() {
		super();

	}

	public TaxCalculator(String empName, boolean isIndian, double empSal) throws EmployeeNameInvalidException, CountryNotValidException {
		super();
		
		if (empName == null && empName=="") {
			throw new EmployeeNameInvalidException("Helo");
		} else
		{
			this.empName = empName;
		}
		
		if (this.isIndian) {
			this.isIndian = isIndian;
		} else {
			throw new CountryNotValidException();

		}
		
		this.empSal = empSal;
	}



	public double calculateTax()
			throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		
		

		if(this.empSal>100000&& isIndian) {
		    return (this.empSal*8)/100;
		}
		else if(this.empSal>50000 && this.empSal<100000 && isIndian) {
			return (this.empSal)*6/100;
		}
		else if(this.empSal>30000 && this.empSal<50000 && isIndian) {
			 return (this.empSal*5)/100; 
		}
		else if(this.empSal>10000 && this.empSal<30000 && isIndian) {
			 return (this.empSal*4)/100; 
		}
		else
			throw new TaxNotEligibleException("he");
		
		


	}

}
