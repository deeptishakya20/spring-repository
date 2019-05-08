package com.capgemini.files.client;

import java.io.File;

public class FileExistApplication {
	
	//1) A Java FileExist Application
	//accept the complete path of a file from the user 
	//and display whether the file exist or not.

	
	public boolean isExists(String string) {
		
		File file = new File(string);
		return file.exists();

	
	}



	
}
