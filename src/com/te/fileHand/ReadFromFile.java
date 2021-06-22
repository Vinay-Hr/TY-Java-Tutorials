package com.te.fileHand;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) {
		try {
			FileReader fileReader = new FileReader("E:\\JavaSession\\Exception2.txt");
			
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			System.out.println(bufferedReader.readLine());
			String str;
//			str = bufferedReader.readLine(); // read a single line
			while ((str=bufferedReader.readLine())!=null) { //read all lines
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("The File is not Found");
			
		} catch (IOException e) {
			System.out.println("No Content in the the file");
			e.printStackTrace();
		}
		
	}

}
