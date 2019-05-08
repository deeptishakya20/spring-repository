package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import com.capgemini.files.client.StringNotFoundException;

public class GrepApplication {

	private String path;
	private File file;
	private String content;
	private int lineCount;
	private BufferedReader bReader;
	private HashMap<Integer, String> actualHashMap = new HashMap<Integer, String>();

	public GrepApplication() {

	}

	public GrepApplication(String path) throws FileNotFoundException {
		super();
		this.path = path;

		bReader = new BufferedReader(new FileReader(path));
		file = new File(path);

	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPath() {
		return path;
	}

	public HashMap<Integer, String> findString(String str) throws StringNotFoundException, IOException {

		while ((content = bReader.readLine()) != null) {
			lineCount++;
			String[] line = content.trim().split(" ");
			for (int i = 0; i < line.length; i++) {
				if (line[i].equals(str)) {
					actualHashMap.put(lineCount, content);
				}
			}
		}
		if (actualHashMap.isEmpty())
			throw new StringNotFoundException("String was not found");
		return actualHashMap;

	}

	public boolean CheckFileIsFoundOrNot() {
		return file.exists();
	}

}
