package com.day6.assign;

import java.util.Scanner;

public class Infi8 {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter value to print:");

		while(true) {
		int month = in.nextInt();
		switch (month) {
		case 1:
			System.out.println("January");

		case 2:
			System.out.println("February");

		case 3:
			System.out.println("March");

		case 4:
			System.out.println("April");

		case 5:
			System.out.println("May");

		case 6:
			System.out.println("June");

		case 7:
			System.out.println("July");
			
		case 8:
			System.out.println("August");
			
		case 9:
			System.out.println("September");
			
		case 10:
			break;
			
		case 11:
			System.out.println("November");
			
		case 12:
			System.out.println("Decenber");
		}

	}

}
}