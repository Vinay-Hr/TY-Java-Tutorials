package com.te.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapImpl {

	public static void main(String[] args) {
		TreeMap<String, Integer> map = new TreeMap<String, Integer>();
		
		map.put("Sandeep", 100);
		map.put("Yashpal", 200);
		map.put("Vinay", 300);
		map.put("Gauri", 400);
		System.out.println(map);
		System.out.println("---------------");
		
		Set<Map.Entry<String, Integer>> entry = map.entrySet();
		
			for (Entry<String, Integer> entry2 : entry) {
				System.out.println(entry2.getValue());
			}
			System.out.println("-------Get The Values-----------");
			
			Collection collection = map.values();
			System.out.println(collection);
			System.out.println("-------Sort acc. to Values-----------");
			TreeSet set = new TreeSet(collection);
			System.out.println(set);
//			System.out.println("-----------Get the keys-------------");
//			Set set2 = map.keySet();
//			System.out.println(set2);
//			System.out.println("---------------Sort acc. to keys--------------");
//			ArrayList arraylist = new ArrayList(set2);
//			Collections.sort(arraylist);
//			for (Object object : arraylist) {
//				System.out.println(object);
//			}	

	}

}
