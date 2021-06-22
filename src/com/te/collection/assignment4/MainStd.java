package com.te.collection.assignment4;

import java.util.ArrayList;
import java.util.Scanner;

public class MainStd {

	public static void main(String[] args) {
		ArrayList<Student> l = new ArrayList<Student>();
		l.add(new Student(2, "yash", 24, 58.9, 12));
		l.add(new Student(4, "suresh", 23, 54.9, 10));
		l.add(new Student(3, "naresh", 26, 52.9, 9));
		l.add(new Student(1, "akhil", 25, 56.9, 8));
		l.add(new Student(5, "jashwanth", 27, 58.9, 11));
		
		for (;;) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter ur choice");
			System.out.println(
					"1.sort by id\n2.sort by name\n3.sort by age\n4.sort by marks\n5.sort by standard\n6.exit");
			int a = sc.nextInt();
			switch (a) {
			case 1:
				new Module().idsort(l);

				break;
			case 2: new Module().namesort(l);
				break;
			case 3:new Module().agesort(l);
				break;
			case 4:new Module().Markssort(l);	
				break;
			case 5:new Module().Standard(l);
				break;
			case 6:System.exit(0);	
			}

		}
		
	}
}
