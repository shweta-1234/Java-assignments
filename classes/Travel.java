package com.kaizen.classes;

public class Travel {
	String mode;
	String destination;
	int distance;

	public Travel() {
		System.out.println("By default for travelling");
	}

	public Travel(String mode, String destination, int distance) {
		this.mode = mode;
		this.destination = destination;
		this.distance = distance;
	}

	public void describe() {
		System.out.println("Travel [mode=" + mode + ", destination=" + destination + ", distance=" + distance + "]");

	}

	public static void main(String[] args) {
		Travel T1 = new Travel();
		T1.describe();
		Travel T2 = new Travel("Bus", "Mandav", 115);
		T2.describe();
	}

}
