package com.capgemini.files.client;

import java.io.Serializable;
import java.util.Objects;

public class CollectionClass implements Serializable {

	private int classNumber;
	private long numberOfStudent;
	private String courseName;
	private double courseFees;

	public CollectionClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CollectionClass(int classNumber, long numberOfStudent, String courseName, double courseFees) {
		super();
		this.classNumber = classNumber;
		this.numberOfStudent = numberOfStudent;
		this.courseName = courseName;
		this.courseFees = courseFees;
	}

	public int getClassNumber() {
		return classNumber;
	}

	public void setClassNumber(int classNumber) {
		this.classNumber = classNumber;
	}

	public long getNumberOfStudent() {
		return numberOfStudent;
	}

	public void setNumberOfStudent(long numberOfStudent) {
		this.numberOfStudent = numberOfStudent;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public double getCourseFees() {
		return courseFees;
	}

	public void setCourseFees(double courseFees) {
		this.courseFees = courseFees;
	}

	@Override
	public String toString() {

		return classNumber + " " + numberOfStudent + " " + courseName + " " + courseFees;

	}

	@Override
	public int hashCode() {

		return Objects.hashCode(classNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof CollectionClass))
			return false;

		CollectionClass classSerialization = (CollectionClass) obj;
		if (this.classNumber == classSerialization.classNumber)
			return true;
		else
			return false;
	}

}
