package com.hello;

import java.util.Scanner;

public class OddEvencheck {

	public static void main(String[] args) {
		
		
		Scanner input =new Scanner(System.in);
		
		System.out.println("Enter the number to check odd or even");
		int number =input.nextInt();
		if (number % 2 == 0) {
		 System.out.println("Even Number");
		} else {
		 System.out.println("Odd Number");
		}
		input.close();
	}

}
