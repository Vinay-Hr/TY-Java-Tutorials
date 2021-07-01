package com.te.assignment4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import com.te.collection.assignment4.StudentID;

public class Main {

	public static void main(String[] args) {
		int exit = 0;
		Scanner sc = new Scanner (System.in);
		
		List<Student> list=new LinkedList<Student>();
		list.add(new Student(01,"Gauri", 15, 75, 8));
		list.add(new Student(06,"Vinay", 16, 85, 9));
		list.add(new Student(03,"Sandeep", 18, 69, 10));
		list.add(new Student(07,"Yashpal", 14, 95, 7));
		list.add(new Student(12,"Veenal", 13, 84, 6));
		
		System.out.println("Enter your choice of Sort :");
		System.out.println(" 1.ID \n 2.Name \n 3.Age \n 4.Marks \n 5.Standard \n 6.Exit ");
		int ch = sc.nextInt();
		
		switch (ch) {
		case 1:
			new Module().Identity(list);
			break;
		case 2:
			Name name = new Name();
			name.compare(null, null);
			
		case 3:
			Age age = new Age();
			age.compare(null, null);
			
		case 4:
			Marks marks = new Marks();
			marks.compare(null, null);
			
		case 5:
			Standard standard = new Standard();
			standard.compare(null, null);
			
		case 6:
			exit++;
			System.out.println(" Thank you :)");
		}
	}

}
