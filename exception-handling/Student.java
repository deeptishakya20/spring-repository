package com.capgemini.main;

import com.capgemini.exceptions.AgeNotWithinRangeException;
import com.capgemini.exceptions.NameNotValidException;



public class Student {
	private double rollno;
	private String name;
	private double age;
	private String course;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(double rollno, String name, double age, String course) throws AgeNotWithinRangeException, NameNotValidException {
		this.rollno = rollno;
		this.name = name;
		
		int temp = 0;
		for(int i=0; i<name.length();i++)
		{
		char ch;
		ch=name.charAt(i);
		 if((ch<65 || ch>90)&& (ch<97 ||ch>122))
	     temp=1;
		 if(temp==1)
			 throw new NameNotValidException(name);
		 else
			 this.name=name;
		}
		
		this.age = age;
		if (age > 15 && age < 21)
			this.age = age;
		else
			throw new AgeNotWithinRangeException();
		
		this.course = course;
	}
	

	
	
}
