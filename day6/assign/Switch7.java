package com.day6.assign;

import java.util.Scanner;

public class Switch7 {

	public static void main(String[] args) {
      Scanner in= new Scanner(System.in);
      int i;
      for(i=1;;i++) {
    	  if(i==0)
    		  break;
      
      System.out.println("Enter value of day:");
      int day = in.nextInt();
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;
	   
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thrusday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		default :
	       System.out.println("Sunday");
	}

}
}
}