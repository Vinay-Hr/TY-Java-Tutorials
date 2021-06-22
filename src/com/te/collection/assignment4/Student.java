package com.te.collection.assignment4;

import java.util.Comparator;

public class Student implements Comparator<Student> {
	int id;
	String name;
	int age;
	double marks;
	int standard;
	public Student() {
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + ", standard=" + standard
				+ "]";
	}

	public Student(int id, String name, int age, double marks, int standard) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.standard = standard;
	}

	@Override
	public int compare(Student o1, Student o2) {

		return o1.id - o2.id;
	}

	@Override
	public int hashCode() {
		return this.id;
	}
	
	}


