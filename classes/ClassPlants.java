package com.kaizen.classes;

public class ClassPlants {
	String fruit;
	String flower;
	String color;

	public ClassPlants() {
		System.out.println("By defaults");
	}

	public ClassPlants(String fruit, String flower, String color) {
		this.fruit = fruit;
		this.flower = flower;
		this.color = color;
	}

	public void describe() {
		System.out.println("ClassPlants [fruit=" + fruit + ", flower=" + flower + ", color=" + color + "]");

	}

	public static void main(String[] args) {
		ClassPlants p1=new ClassPlants();
		p1.describe();
		ClassPlants p2= new ClassPlants("mango","Rose","Red");
        p2.describe();
	}

}
