package com.te.collection;

import java.util.Iterator;

public class MyArrayImpl {

	public static void main(String[] args) {
		
		MyArray myArray = new MyArray(5);
		
		myArray.add("sam");
		myArray.add(true);
		myArray.add(10);
		myArray.add(20);
		myArray.add("suzie");
		myArray.add("suzie");
		myArray.add("suzie");
		
		for (int i = 0; i<myArray.size(); i++) {
			System.out.println(myArray.get(i));
		}
		System.out.println("----------------");
		System.out.println(myArray);
//		System.out.println(myArray.get(2));
		System.out.println("-------Using Iterator---------");
		
		Iterator iterator = myArray.iterator();
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		myArray.remove(3);
		System.out.println(myArray);
	}

}
