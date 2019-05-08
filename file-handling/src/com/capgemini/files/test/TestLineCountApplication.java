package com.capgemini.files.test;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Test;

import  com.capgemini.files.client.LineCountApplication;

public class TestLineCountApplication {

	private LineCountApplication countLine;
	
	@Test
	public void TestLineCount() throws IOException{
		countLine = new LineCountApplication();
		assertEquals(8, countLine.lineCount("C:\\Java_Workspace\\file-handling\\test.txt"));
		
	}
	@Test
	public void TestLineCountWithZeroLine() throws IOException{
		countLine = new LineCountApplication();
		assertEquals(0, countLine.lineCount("C:\\Java_Workspace\\file-handling\\empty.txt"));
		
	}
	
}