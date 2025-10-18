package com.hello;

import java.util.Scanner;

public class SwitchCase {
	
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the day number");
		int day =input.nextInt();
		
		
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
		 default:
		 System.out.println("Other day");
		}
		
	input.close();
	}

}
