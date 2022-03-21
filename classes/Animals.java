package com.kaizen.classes;

public class Animals {
	int age;
	String name;
	String food;

	public Animals() {
		System.out.println("By default i am here");
	}

	public Animals(int age, String name, String food) {
		this.age = age;
		this.name = name;
		this.food = food;

	}

	public void describe() {
		System.out.println("Animals [age=" + age + ", name=" + name + ", food=" + food + "]");

	}

	public static void main(String[] args) {
		Animals A = new Animals();
		A.describe();
		Animals A2 = new Animals(21, "Tiger", "Meat");
		A2.describe();
	}

}
