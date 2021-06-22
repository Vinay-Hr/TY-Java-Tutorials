package com.te.collection;

import java.util.Comparator;

public class Student implements Comparator<Student> {
	
	int id;
	String name;
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compare(Student o1, Student o2) {
		return o1.hashCode()-o2.hashCode();
//		return o1.name.compareTo(o2.name);
	}

	@Override
	public int hashCode() {
		return this.id;
	}

}
