package com.te.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyMap {

	public static void main(String[] args) {
		Map map = new HashMap<String, Integer>();
		
		map.put("Sandeep", 100);
		map.put("Yashpal", 200);
		map.put("Vinay", 300);
		map.put("Gauri", 400);
		
		System.out.println(map);
		System.out.println(map.get("Sandeep"));
		System.out.println("--------After Removal---------");
		System.out.println(map.remove("Yashpal"));
		System.out.println(map);
		
		System.out.println("-------keySet Method------");
		Set set = map.keySet();
		System.out.println(set);
		
		System.out.println("-------values Method------");
		Collection collection = map.values();
		System.out.println(collection);
		
		System.out.println("-------entrySet Method------");
		Set set2 = map.entrySet();
		System.out.println(set2);
		
		Iterator iterator = set2.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
