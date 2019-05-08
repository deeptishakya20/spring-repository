package com.capgemini.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.capgemini.exceptions.CountryNotValidException;
import com.capgemini.exceptions.EmployeeNameInvalidException;
import com.capgemini.exceptions.TaxNotEligibleException;
import com.capgemini.main.TaxCalculator;

public class TaxCalculatorTest {

	private TaxCalculator calculator = new TaxCalculator();
   
	@Test(expected=CountryNotValidException.class)
	public void testCountryException()throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException{
		TaxCalculator calculator = new TaxCalculator("Ron", false, 34000);
		
	}
	@Test(expected=EmployeeNameInvalidException.class)
	public void testNameInvalidException()throws EmployeeNameInvalidException, CountryNotValidException, TaxNotEligibleException{
		TaxCalculator calculator = new TaxCalculator("", true, 30000);
		
	}
	@Test(expected=TaxNotEligibleException.class)
	public void testTaxEligibleException() throws TaxNotEligibleException, CountryNotValidException, EmployeeNameInvalidException{
		TaxCalculator calculator = new TaxCalculator("Payal", true, 20000);
		assertEquals(800,calculator.calculateTax(),0.01);
	}
}
