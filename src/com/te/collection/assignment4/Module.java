package com.te.collection.assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class Module {

	public void idsort(ArrayList<StudentID> l) {
		System.out.println("Sorted by id");
		System.out.println("-----------------------------------");
		Collections.sort(l, new StudentID());
		for (StudentID s1 : l) {
			System.out.println(s1);
		}

	}
	public void namesort(ArrayList<StudentID> l) {
		System.out.println("Sorted by name");
		System.out.println("-------------------------------------");
		Collections.sort(l, new StudentName());
		for (StudentID s1 : l) {
			System.out.println(s1);
		}
		
		
	}
	public void agesort(ArrayList<StudentID> l) {
		System.out.println("Sorted by age");
		System.out.println("-------------------------------------");
		Collections.sort(l, new StudentAge());
		for (StudentID s3 : l) {
			System.out.println(s3);
		}
	}


		public void Markssort(ArrayList<StudentID> l) {
			System.out.println("sorted by maarks");
			System.out.println("----------------------------------");
			Collections.sort(l, new StudentMarks());
			for(StudentID s4:l) {
				System.out.println(s4);
			}
		}
		public void Standard(ArrayList<StudentID> l) {
			System.out.println("sorted by Standards");
			System.out.println("----------------------------------");
			Collections.sort(l, new StudentSTD());
			for(StudentID s4:l) {
				System.out.println(s4);
			}
		}
		}
			
			
			
