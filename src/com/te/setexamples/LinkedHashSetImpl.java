package com.te.setexamples;

import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class LinkedHashSetImpl {

	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();

		set.add(100);
		set.add(90);
		set.add(10);
		set.add(70);
		set.add(50);
		
		System.out.println(set);
		System.out.println(" ----------------- ");
		System.out.println("TreeSet ");
		
		TreeSet set2 = new TreeSet(set);
		System.out.println(set2);
		System.out.println(" ----------------- ");
		System.out.println("Smallest Element: "+ set2.first());
		System.out.println("Largest Element: "+ set2.last());
		System.out.println(" ----------------- ");
		SortedSet set3 = set2.headSet(70); //Prior to number
		for (Object object : set3) {
			System.out.println(object);
		}
		System.out.println(" ----------------- ");
		SortedSet set4 = set2.tailSet(20); //After the number including the no.
		for (Object object : set4) {
			System.out.println(object);
		}
		System.out.println(" ----------------- ");
		SortedSet set5 = set2.subSet(20, 90); //excluding 90, including 20 inbetween
		for (Object object: set5) {
			System.out.println(object);
		}
	}

}
