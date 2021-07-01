package com.te.collection.assignment4;

import java.util.Comparator;

public class StudentSTD implements Comparator<StudentID> {
	int id;
	String name;
	int age;
	double marks;
	int standard;

	public StudentSTD() {

	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + ", standard=" + standard
				+ "]";
	}

	public StudentSTD(int id, String name, int age, double marks, int standard) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.standard = standard;
	}

	@Override
	public int compare(StudentID o1, StudentID o2) {

		return o1.standard-o2.standard;
	}

		public int hashCode() {
		
		return this.hashCode();
	
}
}
