package com.capgemini.files.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.junit.Test;

import com.capgemini.files.client.GrepApplication;
import com.capgemini.files.client.StringNotFoundException;

public class TestGrepApplication {

	GrepApplication grepApplication;

	@Test
	public void testStringIsFound() throws StringNotFoundException, IOException {

		grepApplication = new GrepApplication("C:\\Myjava\\Assignments\\Day-8-FileIO\\assignments_io.txt");
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(16, "Create a class with main() write a code to persist the object in the file.");

		assertEquals(map, grepApplication.findString("persist"));

	}

	@Test(expected = StringNotFoundException.class)
	public void testStringIsNotFound() throws StringNotFoundException, IOException {
		grepApplication = new GrepApplication("C:\\Myjava\\Assignments\\Day-8-FileIO\\assignments_io.txt");
		grepApplication.findString("HelloMy");
	}

	@Test
	public void testFileisNotPresent() throws FileNotFoundException {
		grepApplication = new GrepApplication("C:\\Myjava\\Assignments\\Day-8-FileIO\\assignments_io.txt");
		assertTrue(grepApplication.CheckFileIsFoundOrNot());
	}

}