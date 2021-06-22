package com.te.excp;

import java.io.File;
import java.io.IOException;

public class FileExcp {

	public static void main(String[] args) {
		File file = new File("E:\\New File.txt");
//		file.exists()  file.mkdir()
		try {
			file.createNewFile();
			System.out.println("File is Created");	
		}
		
		catch (IOException e){
			System.out.println("Unable to create the file, as path is incorrect.");
		}
		
	}

}
