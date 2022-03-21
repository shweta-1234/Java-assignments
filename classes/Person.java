package com.kaizen.classes;

public class Person {
	String name;
	int age;
	String location;

	public Person() {
		System.out.println("By default iam person ");
	}

	public Person(String name, int age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
	}

	public void describe() {
		System.out.println("Person [name=" + name + ", age=" + age + ", location=" + location + "]");

	}

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.describe();
		Person p2 = new Person("Shweta", 21, "Indore");
		p2.describe();
	}

}
