package com.capgemini.files.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.files.client.CollectionClass;

public class TestCollectionClassSerialization {

	private static CollectionClass one;
	private static CollectionClass two;
	private static CollectionClass three;

	CollectionClass collectionClass;
	CollectionClassSerialization classSerialization;

	@BeforeClass
	public static void setUp() {

		one = new CollectionClass(1, 50, "CoreJava", 5000);
		two = new CollectionClass(2, 25, "Dot Net", 4500);
		three = new CollectionClass(3, 20, "Perl", 6000);
	}

	@Test
	public void testClassSerilaizationForSerialization() throws IOException {
		ArrayList<CollectionClass> array = new ArrayList<CollectionClass>();
		array.add(one);
		array.add(two);
		array.add(three);

		classSerialization = new CollectionClassSerialization();
		assertTrue(classSerialization.serialization("collection.txt", array));

	}

	@Test
	public void testClassSerilaizationForDeserialization()
			throws FileNotFoundException, ClassNotFoundException, IOException {
		ArrayList<CollectionClass> array = new ArrayList<CollectionClass>();
		array.add(one);
		array.add(two);
		array.add(three);

		classSerialization = new CollectionClassSerialization();
		assertEquals(array, classSerialization.deserialization("collection.txt"));
	}
}
