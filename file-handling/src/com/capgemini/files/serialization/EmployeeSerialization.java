package com.capgemini.files.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import com.capgemini.files.client.Employee;

public class EmployeeSerialization implements Serializable {

	public boolean serialization(String fileName, Employee employee) throws IOException {

		FileOutputStream fileout = new FileOutputStream("persist.txt");
		ObjectOutputStream objectOut = new ObjectOutputStream(fileout);
		objectOut.writeObject(employee);
		objectOut.close();

		File file = new File(fileName);
		return file.exists();

	}

	public Employee deserialization(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream("persist.txt"));
		Employee employee = (Employee) objectIn.readObject();
		return employee;

	}

}
