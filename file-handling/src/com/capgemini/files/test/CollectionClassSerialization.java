package com.capgemini.files.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import com.capgemini.files.client.CollectionClass;

public class CollectionClassSerialization {
	
	public boolean serialization(String fileName, ArrayList array) throws IOException {

		FileOutputStream fileout = new FileOutputStream("collection.txt");
		ObjectOutputStream objectOut = new ObjectOutputStream(fileout);
		objectOut.writeObject(array);
		objectOut.close();

		File file = new File(fileName);
		return file.exists();

	}

	public ArrayList<CollectionClass> deserialization(String fileName) throws FileNotFoundException, IOException, ClassNotFoundException {

		ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream("collection.txt"));
	
		ArrayList<CollectionClass> array = (ArrayList<CollectionClass>)objectIn.readObject(); 
		return array;

	}

}
