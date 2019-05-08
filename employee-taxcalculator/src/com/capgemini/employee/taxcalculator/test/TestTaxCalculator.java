package com.capgemini.employee.taxcalculator.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.capgemini.employee.taxcalculator.exception.CountryNotValidException;
import com.capgemini.employee.taxcalculator.exception.EmployeeNameInvalidException;
import com.capgemini.employee.taxcalculator.exception.TaxNotEligibleException;
import com.capgemini.employee.taxcalculator.main.TaxCalculator;


public class TestTaxCalculator {
	
	
	
	
	@Test(expected=EmployeeNameInvalidException.class)
	public void testEmployeeNameIsNull() throws EmployeeNameInvalidException, CountryNotValidException {
		TaxCalculator calculator=new TaxCalculator(" ",true, 30000);
		
	}	
		
	
	
	@Test(expected=CountryNotValidException.class)
	public void testEmployeeIsNotIndian() throws CountryNotValidException,TaxNotEligibleException, EmployeeNameInvalidException{
		
		TaxCalculator calculator=new TaxCalculator("Raj",false, 35000);
		
	}


	@Test(expected=TaxNotEligibleException.class)
	public void testEmployeeIsNotEligibleForTax() throws TaxNotEligibleException,CountryNotValidException, EmployeeNameInvalidException{
		
		TaxCalculator calculator=new TaxCalculator("Tim",true, 1000);
		calculator.calculateTax();
	}
	
	@Test
	public void testEmployeeIsEligibleForTax() throws TaxNotEligibleException,CountryNotValidException, EmployeeNameInvalidException {
		TaxCalculator calculator=new TaxCalculator("Jack",true, 55000);
		assertEquals(3300, calculator.calculateTax(),0.01);
	}

}
