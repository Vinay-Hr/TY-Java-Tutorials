package com.te.collection.assignment4;

import java.util.Comparator;

public class Student2 implements Comparator<Student> {
	int id;
	String name;
	int age;
	double marks;
	int standard;
	public Student2() {
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + ", standard=" + standard
				+ "]";
	}

	public Student2(int id, String name, int age, double marks, int standard) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.standard = standard;
	}

	@Override
	public int compare(Student o1, Student o2) {

		return o1.name.compareTo(o2.name);
	}

	@Override
	public int hashCode() {
		
		return this.hashCode();
	}
	
}
