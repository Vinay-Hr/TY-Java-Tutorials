package com.te.fileHand;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInFile {

	public static void main(String[] args) {
		File file = new File("E:\\JavaSession\\Exception2.txt");
		
		try {
			file.createNewFile();
			FileWriter fileWriter = new FileWriter("E:\\JavaSession\\Exception2.txt");
			fileWriter.write("We are expert in Exception Handling.\n");
			fileWriter.write("Exception handling is fun");
			fileWriter.close();
			System.out.println("File Write Completed");
		} catch (IOException e) {
			System.out.println("Unable to Locate File");
			e.printStackTrace();
		}

	}

}
