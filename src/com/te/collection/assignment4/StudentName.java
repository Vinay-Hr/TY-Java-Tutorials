package com.te.collection.assignment4;

import java.util.Comparator;

public class StudentName implements Comparator<StudentID> {
	int id;
	String name;
	int age;
	double marks;
	int standard;
	public StudentName() {
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + ", standard=" + standard
				+ "]";
	}

	public StudentName(int id, String name, int age, double marks, int standard) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.standard = standard;
	}

	@Override
	public int compare(StudentID o1, StudentID o2) {

		return o1.name.compareTo(o2.name);
	}

	@Override
	public int hashCode() {
		
		return this.hashCode();
	}
	
}

