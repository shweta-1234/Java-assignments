package com.kaizen.classes;

public class Training {
	String language;
	int hour;
	String name;

	public Training() {
		System.out.println("Default for training");
	}

	public Training(String language, int hour, String name) {
		this.language = language;
		this.hour = hour;
		this.name = name;
	}

	public void describe() {
		System.out.println("Training [language=" + language + ", hour=" + hour + ", name=" + name + "]");

	}

	public static void main(String[] args) {
		Training T1 = new Training();
		T1.describe();
		Training T2 = new Training("Java", 5, "Kaizen coding bootcamp");
		T2.describe();

	}

}
