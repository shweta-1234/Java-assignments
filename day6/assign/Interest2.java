package com.day6.assign;

import java.util.Locale;
import java.util.Scanner;

public class Interest2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int i;
		for (i = 0; i < 2; i++) {
			System.out.println("Enter amount of loan:");
			double amount = in.nextDouble();

			System.out.println("Enter rate:");
			double interest = in.nextDouble();

			System.out.println("Enter time:");
			int duration = in.nextInt();

			double SI = (amount * interest * duration) / 100;
			System.out.println("Your value of SI is:" + SI);

			Locale us = Locale.US;

			System.out.println(us);
		}

	}

}
