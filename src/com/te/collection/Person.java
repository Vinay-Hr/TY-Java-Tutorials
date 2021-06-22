package com.te.collection;

public class Person implements Comparable<Person>{

	int id;
	int rollNo;
	String name;
	
	public Person(int id, int rollNo, String name) {
		super();
		this.id = id;
		this.rollNo = rollNo;
		this.name = name;
	}

	@Override
	public int compareTo(Person o) {
		
//		return this.id - o.id;
//		return this.rollNo - o.rollNo;
//		return this.name.compareTo(o.name);
		return this.hashCode() - o.hashCode(); //Loose coupling whatever we return in hashcode method it will act accordingly
	}

	
	
	@Override
	public String toString() {
		return "Person [id=" + id + ", rollNo=" + rollNo + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		
		return this.rollNo;
	}
	
	
	
}
