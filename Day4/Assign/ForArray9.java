package com.Day4.Assign;

public class ForArray9 {

	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13 };
		for (int x : array) {
			System.out.println("The values of array :" + x);

			if (x >=9) {
				System.out.println("Sorry!!! the value is greater than range");
				break;
		}

	}

	}
}

