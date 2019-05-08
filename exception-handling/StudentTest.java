package com.capgemini.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.exceptions.AgeNotWithinRangeException;
import com.capgemini.exceptions.NameNotValidException;
import com.capgemini.main.Student;

public class StudentTest {

	private Student student = new Student();

	@Test(expected = AgeNotWithinRangeException.class)
	public void testStudentAge() throws AgeNotWithinRangeException, NameNotValidException {
		Student student = new Student(11, "Payal", 22, "Java");
		assertNotNull(student);
	}

	
	  @Test(expected=NameNotValidException.class) 
	  public void testStudentName()throws NameNotValidException, AgeNotWithinRangeException {
	   Student student= new Student(11, "P5ya*", 16, "Java");
	  assertNotNull(student); }
	 
}
