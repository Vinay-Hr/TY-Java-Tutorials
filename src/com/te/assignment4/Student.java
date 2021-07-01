package com.te.assignment4;

import java.util.Comparator;

public class Student {

	int id;
	String name;
	int age;
	int marks;
	int std;
	
	public Student(int id, String name, int age, int marks, int std) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.std = std;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + ", std=" + std + "]";
	}
	
	
}
