package com.kaizen.classes;

public class Livings {
	String human;
	String plants;
	String Animal;

	public Livings() {
		System.out.println("By defaults");
	}

	public Livings(String human, String plants, String Animal) {
		this.human = human;
		this.plants = plants;
		this.Animal = Animal;
	}

	public void describe() {
		System.out.println("Livings [human=" + human + ", plants=" + plants + ", Animal=" + Animal + "]");

	}

	public static void main(String[] args) {
        Livings L =new Livings();
        L.describe();
        Livings L2 = new Livings("shweta","tulsi","Lion");
        L2.describe();
	}

}
