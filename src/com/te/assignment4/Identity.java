package com.te.assignment4;

import java.util.Comparator;

public class Identity implements Comparator<Student> {


	public Identity() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compare(Student o1, Student o2) {
		return o1.id - o2.id;
	}


}
