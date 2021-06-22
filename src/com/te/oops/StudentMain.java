package com.te.oops;

public class StudentMain {

	public static void main(String[] args) {
		
		Student student = new Student ();
		student.setName("Susan");
		student.setAge(18);
		student.setMarks(95);
		
		
		System.out.println("Name: "+student.getName());
		System.out.println("Age: "+student.getAge());
		System.out.println("Marks: "+student.getMarks());
	}

}
