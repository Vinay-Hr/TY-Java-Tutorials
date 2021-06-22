package com.te.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Example {

	public static void main(String[] Args) {
		
		ArrayList arrayList = new ArrayList();
		
		arrayList.add("Sam");
		arrayList.add(true);
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(30);
		arrayList.add('a');
		arrayList.add("James");
		arrayList.add("Bond");
		arrayList.add(3,100);
		
		System.out.println(arrayList); //in-built toString method
		System.out.println("Using for Loop");
//		System.out.println(arrayList.size());
		
		for (int i=0; i<arrayList.size(); i++)
		{
			System.out.println(arrayList.get(i));
		}
		System.out.println("--------------");
		System.out.println("Using for each loop");
		
		 for(Object object : arrayList) {
			 System.out.println(object);
		 }
		 
		 System.out.println("--------------");
		 System.out.println("Using iterator");
		 Iterator iterator = arrayList.iterator();
		 
		 while(iterator.hasNext()) {
			 System.out.println(iterator.next());
		 }
		 
		 System.out.println("--------------");
		 System.out.println("Using List iterator");
		 ListIterator listIterator = arrayList.listIterator();
		 System.out.println("--------------");
		 System.out.println("Using listIterator Forward");
		 while(listIterator.hasNext()) {
			 System.out.println(listIterator.next());
		 }
		 
		 System.out.println("Using listIterator Backward");
		 while(listIterator.hasPrevious()) {
			 System.out.println(listIterator.previous());
		 }
	}
}