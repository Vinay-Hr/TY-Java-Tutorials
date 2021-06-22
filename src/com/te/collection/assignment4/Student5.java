package com.te.collection.assignment4;

import java.util.Comparator;

public class Student5 implements Comparator<Student> {
	int id;
	String name;
	int age;
	double marks;
	int standard;

	public Student5() {

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + ", standard=" + standard
				+ "]";
	}

	public Student5(int id, String name, int age, double marks, int standard) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.standard = standard;
	}

	@Override
	public int compare(Student o1, Student o2) {

		return o1.standard-o2.standard;
	}

		public int hashCode() {
		
		return this.hashCode();
	
}
}
