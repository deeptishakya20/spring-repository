package com.capgemini.main;

import com.capgemini.exceptions.FactorialException;
import com.capgemini.exceptions.InvalidInputException;

public class Factorial {
	private int number1;

	public Factorial() {
		super();

	}

	public Factorial(int number1) {
		super();
		this.number1 = number1;
	}
    public int getFactorial(int number1) throws InvalidInputException, FactorialException {
    	if(this.number1<2) {
    		throw new InvalidInputException("number is less than 2");
    	}
    	else {
    	    double fact=1;
    	    for(int i = 1;i<this.number1;i++)
    	    {
    	    	fact=fact*i;
    	    	if(fact>Integer.MAX_VALUE)
    	    	{
    	    		throw new FactorialException();
    	    	}
    	    }
    	    return number1;
    	}
		
    	
    }
}
