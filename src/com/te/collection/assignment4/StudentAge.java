package com.te.collection.assignment4;

import java.util.Comparator;

public class StudentAge implements Comparator<StudentID> {
	int id;
	String name;
	int age;
	double marks;
	int standard;
	public StudentAge() {
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + ", standard=" + standard
				+ "]";
	}

	public StudentAge(int id, String name, int age, double marks, int standard) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.standard = standard;
	}

	@Override
	public int compare(StudentID o1, StudentID o2) {

		return o1.age-o2.age;
	}

	@Override
	public int hashCode() {
		return this.hashCode();
	}
}
