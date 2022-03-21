package com.kaizen.classes;

public class Nonliving {
	String table;
	String chair;
	String bottle;

	public Nonliving() {
		System.out.println("By default");
	}

	public Nonliving(String table, String chair, String bottle) {
		this.table = table;
		this.chair = chair;
		this.bottle = bottle;
	}

	public void describe() {
		System.out.println("Nonliving [table=" + table + ", chair=" + chair + ", bottle=" + bottle + "]");

	}

	public static void main(String[] args) {
		Nonliving n1 = new Nonliving();
		n1.describe();
		Nonliving n2 = new Nonliving("wood", "Plastic", "Steel");
		n2.describe();
	}

}
