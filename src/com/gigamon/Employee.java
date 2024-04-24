package com.gigamon;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Employee implements Comparable<Employee>{
	final private int id;
	final private String name;
	private Address address;
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	public Address getAddress() {
		return address;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		return true;
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Vj", new Address(44,"helo St"));
		Employee e2 = new Employee(5, "Vj", new Address(44,"helo St"));
		Employee e3 = new Employee(1, "Vj", new Address(44,"helo St"));
		Employee e4 = new Employee(3, "Vj", new Address(44,"helo St"));
		
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		
		System.out.println(employees.size());
		
		Set<Employee> emps = new TreeSet<Employee>();
		emps.addAll(employees);
		
		for(Employee e: emps) {
			System.out.println(e);
		}
	}

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
