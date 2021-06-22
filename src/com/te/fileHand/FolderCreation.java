package com.te.fileHand;

import java.io.File;
import java.io.IOException;

public class FolderCreation {

	public static void main(String[] args) {
		File file = new File("E:\\JavaSession");
		
		if(!file.exists()) {
			file.mkdir();
			System.out.println("A New Folder is Created");
		}else {
			System.out.println("The Folder is already present");
		}
		
//		Create a file inside the folder
		
		File file2 = new File("E:\\JavaSession\\Exception.txt");
		try {
		if(!file2.exists()) {
			file2.createNewFile();
			System.out.println("A New File is Created");
		}else {
			System.out.println("The File already exists");
		}
		}catch(IOException e) {
			System.out.println("Unable to Locate File.");
		}
	}

}
