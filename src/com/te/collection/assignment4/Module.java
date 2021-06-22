package com.te.collection.assignment4;

import java.util.ArrayList;
import java.util.Collections;

public class Module {

	public void idsort(ArrayList<Student> l) {
		System.out.println("Sorted by id");
		System.out.println("-----------------------------------");
		Collections.sort(l, new Student());
		for (Student s1 : l) {
			System.out.println(s1);
		}

	}
	public void namesort(ArrayList<Student> l) {
		System.out.println("Sorted by name");
		System.out.println("-------------------------------------");
		Collections.sort(l, new Student2());
		for (Student s1 : l) {
			System.out.println(s1);
		}
		
		
	}
	public void agesort(ArrayList<Student> l) {
		System.out.println("Sorted by age");
		System.out.println("-------------------------------------");
		Collections.sort(l, new Student3());
		for (Student s3 : l) {
			System.out.println(s3);
		}
	}


		public void Markssort(ArrayList<Student> l) {
			System.out.println("sorted by maarks");
			System.out.println("----------------------------------");
			Collections.sort(l, new Student4());
			for(Student s4:l) {
				System.out.println(s4);
			}
		}
		public void Standard(ArrayList<Student> l) {
			System.out.println("sorted by Standards");
			System.out.println("----------------------------------");
			Collections.sort(l, new Student5());
			for(Student s4:l) {
				System.out.println(s4);
			}
		}
		}
			
			
			
