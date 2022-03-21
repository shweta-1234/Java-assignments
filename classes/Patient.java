package com.kaizen.classes;

public class Patient {
	String name;
	int id;
	String disease;

	public Patient() {
		System.out.println("By default for patient");
	}

	public Patient(String name, int id, String disease) {
		this.name = name;
		this.id = id;
		this.disease = disease;
	}

	public void describe() {
		System.out.println("Patient [name=" + name + ", id=" + id + ", disease=" + disease + "]");

	}

	public static void main(String[] args) {
		Patient P1 = new Patient();
		P1.describe();
		Patient P2 = new Patient("XYZ", 2345, "Cough cold");
		P2.describe();
	}

}
