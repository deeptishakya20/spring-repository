package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandlingDemo {
	public static void main(String args[]) throws IOException {
		
		/*	//File file=new File("C:\\File\\Docs");
		//System.out.println(file.exists());
		
	//	File folder=new File("C:\\File");
		//System.out.println(folder.exists());
		File file=new File("test.txt");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("File is created successfully");
		}

		//FileWriter writer= new FileWriter(file);
		//BufferedWriter writer=new BufferedWriter(new FileWriter(file));
		//writer.newLine();
			PrintWriter writer=new PrintWriter(new FileWriter(file, true));
			writer.println("Hello...");
			writer.println("How are you.???");
			writer.println("Hope you are fine...");
			writer.println("bye...");
			
			writer.close();
			System.out.println("Content has been written");
		*/
		
		/*	FileReader reader = new FileReader("C:\\Java_Workspace\\bankapp\\src\\com\\capgemini\\bankapp\\main\\BankAccount.java");
		BufferedReader bReader=new BufferedReader(reader);
		
		PrintWriter writer=new PrintWriter("BankAccount.java");

		
		String content;
		
		while((content = bReader.readLine()) != null) {
			//System.out.println(content);
		}
			
		System.out.println("------success-------");
		writer.close();
		bReader.close();
		reader.close();
		
			
			
		File windowsDirectory = new File("c:\\windows");
		System.out.println(windowsDirectory.isDirectory());
		String content[] = windowsDirectory.list();
		
		for(String s : content) {
			System.out.println(s);
		}*/
			
		File newDir = new File("myDir");
		if(!newDir.exists()) {
			newDir.mkdir();
			System.out.println("Folder is successfully created...");
		}
		
		File file = new File(newDir, "myfile.txt");
		if(!file.exists()){
			file.createNewFile();
			System.out.println("File is successfully created");
		
		}
		
		
		
		
		
		
		
		
		
		
	}

}
