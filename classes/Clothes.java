package com.kaizen.classes;

public class Clothes {
	String color;
	int size;
	String brand;
	String design;

	public Clothes() {
		System.out.println("By default i am clothes");
	}

	public Clothes(String color, int size, String brand, String design) {
		this.color = color;
		this.size = size;
		this.brand = brand;
		this.design = design;
	}

	public void describe() {
		System.out.println("Clothes [color=" + color + ", size=" + size + ", brand=" + brand + ", design=" + design + "]");

	}

	public static void main(String[] args) {
		Clothes C1 = new Clothes();
		C1.describe();
		Clothes C2 = new Clothes("Black", 32, "Denim", "Simple");
		C2.describe();
	}

}
