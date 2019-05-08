package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountApplication {

	
	   public int wordCount(String message) throws IOException {
		   int count=0;
		   BufferedReader reader;
		   reader= new BufferedReader(new FileReader(message));
		   String Line;
		   while((Line=reader.readLine())!=null) {
			   if(!(Line.equals(""))) {
				   String[] Wcount=Line.split("\\s+");//count word and spaces
				   count+= Wcount.length;
				    
			   }
		   }
		   reader.close();
		   return count;
	   }
}
