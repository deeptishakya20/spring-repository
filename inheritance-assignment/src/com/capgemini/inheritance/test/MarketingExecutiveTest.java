package com.capgemini.inheritance.test;
import com.capgemini.inheritance.main. MarketingExecutive;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class MarketingExecutiveTest {
	 
	private  MarketingExecutive executive;
	
	@BeforeEach
	public void setUp() {
		executive=new MarketingExecutive(102,"Deepti",50000,2000,100);
	}
	
	@Test
	public void testEmployeeWithDefaultConstructor() {
		MarketingExecutive executive=new MarketingExecutive();
		assertNotNull(executive);
	}

	@Test
	public void testEmployeeWithParameterizedConstructor() {
		assertNotNull(executive);
	}
	
	@Test
	public void testEmployeeGrossSalary() {
		assertEquals(79000,executive.employeeGrossSalary(),0.01);
		
	}
	
	@Test
	public void testEmployeeNetSalary() {
		assertEquals(72800 ,executive.employeeNetSalary(),0.01);
	}


}