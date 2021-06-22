package com.te.collection;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class StudentMain {

	public static void main(String[] args) {
		
		List<Student> list=new LinkedList<Student>();
		list.add(new Student(30,"Gauri"));
		list.add(new Student(10,"Vinay"));
		list.add(new Student(50,"Sandeep"));
		list.add(new Student(20,"YashRaj"));
		list.add(new Student(90,"Veenal"));
		
		System.out.println("=======Before Sorting==========");
		System.out.println(list);
		
		for (Student student : list) {
			System.out.println(student);
		}
		
		System.out.println("=======After Sorting==========");
		Collections.sort(list, new Student(0, null));
		for (Student student : list) {
			System.out.println(student);
		}

	}

}
