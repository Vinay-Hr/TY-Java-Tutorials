package com.te.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryInterfaceExample {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String,Integer>();
		
		map.put("Sandeep", 100);
		map.put("Yashpal", 200);
		map.put("Vinay", 300);
		map.put("Gauri", 400);
		System.out.println(map);
		System.out.println("---------------");
		
		Collection collection = map.entrySet();
		for (Object object : collection) {
			System.out.println(object);
		}
		System.out.println("-----------------");
		
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		
		for (Map.Entry<String, Integer> entry2 : entry) {
			System.out.println(entry2.getKey() +" ---->" + entry2.getValue());
			entry2.setValue(1000);
		}
		System.out.println(map);
	}
}
