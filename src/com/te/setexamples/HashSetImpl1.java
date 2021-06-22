package com.te.setexamples;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class HashSetImpl1 {

	public static void main(String[] args) {
		
		Set<Employee> set = new HashSet<Employee>();
		
		set.add(new Employee(10,"sam", 5000));
		set.add(new Employee(11,"abc", 20000));
		set.add(new Employee(9,"xyz", 10000));
		set.add(new Employee(53,"nmo", 65000));
		set.add(new Employee(67,"jkl", 70000));
		
		System.out.println("Before Sort");
		for (Employee employee : set) {
			System.out.println(employee);
		}
		System.out.println("After Sort");
		LinkedList<Employee> linkedList = new LinkedList<Employee>(set);
		
		Collections.sort(linkedList);
		
		for (Employee employee : linkedList) {
			System.out.println(employee);
		}
	}

}
