package com.capgemini.files.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.files.client.WordCountApplication;

public class TestwordCountApplication {

	private WordCountApplication countWord;

	
	
	@Test
	public void testWordCount() throws IOException {
		countWord= new WordCountApplication();
		assertEquals(18,countWord.wordCount("C:\\Java_Workspace\\file-handling\\test.txt"));
	}
	
	
	@Test
	public void testWordCountWithEmptyFile() throws IOException {
		countWord= new WordCountApplication();
		assertEquals(0,countWord.wordCount("C:\\Java_Workspace\\file-handling\\empty.txt"));
	}
	
	
}
