package com.kaizen.classes;

public class University {
	String name;
	int no;
	String address;

	public University() {
		System.out.println("Default");
	}

	public University(String name, int no, String address) {
		this.name = name;
		this.no = no;
		this.address = address;
	}

	public void describe() {
		System.out.println("University [name=" + name + ", no=" + no + ", address=" + address + "]");

	}

	public static void main(String[] args) {
		University U = new University();
		U.describe();
		University U1 = new University("SVVV", 1234, "Ujjain Road");
		U1.describe();
	}

}
