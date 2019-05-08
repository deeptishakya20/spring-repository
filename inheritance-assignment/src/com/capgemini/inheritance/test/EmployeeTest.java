package com.capgemini.inheritance.test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.inheritance.main.Employee;

public class EmployeeTest {
	private Employee employee;
	
	@BeforeEach
	public void setUp() {
		employee=new Employee(102,"Deepti",50000,2000);
	}
	
	@Test
	public void testEmployeeWithDefaultConstructor() {
		Employee employee=new Employee();
		assertNotNull(employee);
	}

	@Test
	public void testEmployeeWithParameterizedConstructor() {
		Employee employee=new Employee(101,"Bikram Bhushan",50000,2000);
		assertNotNull(employee);
	}
	
	
	public void testEmployeeGrossSalary() {
		assertEquals(77000,employee.employeeGrossSalary(), 0.01);
		
	}
	
	public void testEmployeeNetSalary() {
		assertEquals(70800 ,employee.employeeNetSalary(), 0.01);
	}

	
}
