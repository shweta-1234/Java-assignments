package com.day7;

public class Employee8 {

	int number;
	String name;

	public Employee8() {
		System.out.println("In employee");
	}

	public Employee8(int number) {
		this.number = number;
		System.out.println(number);
	}

	public void setname(String name) {
		this.name = name;
		
	}

	public String getname() {
		return name;
	}

	public static void main(String[] args) {
		Employee8 e = new Employee8(12345);
		e.setname("Shweta");
		System.out.println(e.getname());
	}

}
