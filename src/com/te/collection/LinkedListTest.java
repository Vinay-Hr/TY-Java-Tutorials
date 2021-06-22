package com.te.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest{
	
	public static void main(String[] args) {
		
		List<Integer> linkedList= new LinkedList<Integer>();
		
		linkedList.add(100);
		linkedList.add(200);
		linkedList.add(300);
		linkedList.add(400);
		linkedList.add(500);
		linkedList.add(600);
		linkedList.add(700);
		
		System.out.println(linkedList);
		
		System.out.println();
		System.out.println("Using for loop:");
		for (int i=0;i<linkedList.size();i++) {
			System.out.println(linkedList.get(i));
		}
		
		System.out.println();
		System.out.println("Using For each loop:");
		for (Object object : linkedList) {
			System.out.println(object);
		}
		
		System.out.println();
		System.out.println("Using iterator:");
		
		Iterator iterator=linkedList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println();
		System.out.println("Using List Iterator:");
		ListIterator iterator2=linkedList.listIterator();
		while (iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		System.out.println();
		System.out.println("List Iterator Backword:");
		while (iterator2.hasPrevious()) {
			System.out.println(iterator2.previous());
		}
	}
}