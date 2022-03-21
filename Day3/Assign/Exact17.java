package com.Day3.Assign;

public class Exact17 {

	public static void main(String[] args) {
           int x = 1000000000;
           System.out.println(x*4);
           //It shows error because it is an approximate number out of their range 
           System.out.println(Math.multiplyExact(x, 4));
	}

}
