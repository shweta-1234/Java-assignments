package com.day6.assign;

import java.util.Scanner;

public class Input1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter your first name:");
		String name = in.next();
		System.out.printf("Your first name is:");
		System.out.println(name);

		System.out.println("Enter your last name:");
		String last = in.next();
		System.out.printf("Your last name is:");
		System.out.println(last);

		System.out.println("Enter your age:");
		int age = in.nextInt();
		System.out.printf("Your age is");
		System.out.println(age);

		System.out.println("Enter your address:");
		String address = in.next();
		System.out.printf("Your address is:");
		System.out.println(address);

	}

}
