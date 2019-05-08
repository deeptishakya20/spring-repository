package com.capgemini.inheritance.test;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.capgemini.inheritance.main.EmployeeManager;




class ManagerTest {
	 
	private EmployeeManager manager;
	
	@BeforeEach
	public void setUp() {
		manager=new EmployeeManager(102,"Deepti",50000,2000);
	}
	
	@Test
	public void testEmployeeWithDefaultConstructor() {
		EmployeeManager manager=new EmployeeManager();
		assertNotNull(manager);
	}

	@Test
	public void testEmployeeWithParameterizedConstructor() {
		assertNotNull(manager);
	}
	
	@Test
	public void testEmployeeGrossSalary() {
		assertEquals(89000,manager.employeeGrossSalary(),0.01);
		
	}
	
	@Test
	public void testEmployeeNetSalary() {
		assertEquals(82800 ,manager.employeeNetSalary(),0.01);
	}


}
