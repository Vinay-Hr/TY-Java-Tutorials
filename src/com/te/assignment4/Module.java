package com.te.assignment4;

import java.util.Collections;
import java.util.List;

public class Module {

	public void Identity(List<Student> l) {
		Collections.sort(l, new Identity());
		for (Student student : l) {
			System.out.println(student);
		}
	}
}
