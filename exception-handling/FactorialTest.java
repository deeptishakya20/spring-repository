package com.capgemini.test;

import org.junit.Test;

import com.capgemini.exceptions.FactorialException;
import com.capgemini.exceptions.InvalidInputException;
import com.capgemini.main.Factorial;

public class FactorialTest {

	private Factorial factorial=new Factorial();
	
	@Test(expected=InvalidInputException.class)
	public void  testFactorialofNumber()throws InvalidInputException, FactorialException{
		Factorial factorial=new Factorial(1);
		 factorial.getFactorial(1);
		 //assertNotNull(factorial);
	}
	

	@Test(expected=FactorialException.class)
	public void  testFactorialofNumberMaxvalue()throws FactorialException, InvalidInputException{
		Factorial factorial1=new Factorial(143267);
		factorial1.getFactorial(143267);
		// assertNotNull(factorial);
	}
}
	

