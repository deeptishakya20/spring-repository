package com.capgemini.files.test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.client.Employee;
import com.capgemini.files.serialization.EmployeeSerialization;

public class TestEmployeeSerialization {

	Employee employee;
	EmployeeSerialization employeeSerialization;

	@Test
	public void testSerialization() throws IOException {
		employee = new Employee(101, "Bikram", 50000);
		employeeSerialization = new EmployeeSerialization();
		assertTrue(employeeSerialization.serialization("persist.txt", employee));

	}

	@Test
	public void testDeserialization() throws FileNotFoundException, ClassNotFoundException, IOException {
		employee = new Employee(101, "Bikram", 50000);
		employeeSerialization = new EmployeeSerialization();
		assertEquals(employee, employeeSerialization.deserialization("persist.txt"));

	}

}
