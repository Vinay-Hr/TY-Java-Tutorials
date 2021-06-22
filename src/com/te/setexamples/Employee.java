package com.te.setexamples;

public class Employee implements Comparable<Employee> {

	int id;
	String name;
	double salary;
	
	public Employee(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {
		
		return this.name.compareTo(o.name);
//		retun this.id-o.id;
//		return (int) (this.salary- o.salary);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}
//ctrl+shift+T
