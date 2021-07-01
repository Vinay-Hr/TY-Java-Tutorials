package com.te.java8;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("C", "PHP", "Python", "Java");
		
		for(int i =0; i<list.size(); i++) {
			System.out.println("Values:" +list.get(i));
		}
		
		System.out.println("-----------------------");
		
		for (String string : list) {
			System.out.println("Values:" +string);
		}
		System.out.println("-----------------------");

		list.forEach(val -> System.out.println("Values:" +val));
	}

}
