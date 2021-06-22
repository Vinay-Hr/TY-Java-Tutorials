package com.te.collection;

import java.util.ArrayList;
import java.util.Collections;

public class PersonTest {

	public static void main(String[] args) {

		ArrayList<Person> list = new ArrayList<Person>();

		list.add(new Person(10, 21, "abc"));
		list.add(new Person(9, 100, "ghi"));
		list.add(new Person(11, 11, "efg"));
		list.add(new Person(30, 13, "ijk"));
		list.add(new Person(40, 102, "xyz"));

		System.out.println("Before Sorting");
		System.out.println(list);

		for (Person person : list) {
			System.out.println(person);
		}

		System.out.println("After Sorting");
		Collections.sort(list);
		System.out.println(list);

		for (Person person1 : list) {
			System.out.println(person1);
		}
	}

}
