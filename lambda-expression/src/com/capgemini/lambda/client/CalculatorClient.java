package com.capgemini.lambda.client;
import com.capgemini.lambda.model.Calculator;

public class CalculatorClient {
	
	public static void main(String args[]) {
		
		//Calculator addition=new Calculator() {
		//	@Override
			//public int calculate(int x, int y) {
		//	return (x+y);
		//	}
		//};
		
		Calculator addition=(x,y)->(x+y);
		System.out.println(addition.calculate(5, 10));
		
		Calculator subtraction=(x,y)->(x-y);
		System.out.println(addition.calculate(15, 10));
	}

}

