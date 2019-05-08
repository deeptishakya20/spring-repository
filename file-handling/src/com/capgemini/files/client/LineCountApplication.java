package com.capgemini.files.client;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LineCountApplication {
	
	public int lineCount(String s) throws IOException {
		int count=0;
		BufferedReader reader = new BufferedReader(new FileReader(s));
		String line = reader.readLine();
		while(line!=null) {
			reader.readLine();
			count++;
		}
		return count;
	}


}