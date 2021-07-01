package com.te.assignment4;

import java.util.Comparator;

public class Standard implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.std - o2.std;
	}

	
}
