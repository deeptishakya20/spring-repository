package com.capgemini.files.test;

import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

public class TestFileExistApplication {
	
	private File file;

	@Test
	public void testIsFileExists() {
		file =new File("C:\\Java_Workspace\\file-handling\\test.txt");
		assertTrue(file.exists());
		
		
	}

}
