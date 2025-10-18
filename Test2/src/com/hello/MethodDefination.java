package com.hello;

import java.util.Scanner;

public class MethodDefination {
	
//	public static int add(int a, int b, int c) {
//		return a+b+c;
//		
//	}
//if your method is static then don't required any object creation (class name . )	
//if your method is not static method then you have to create a object to  call the method 	()
	public static void main(String[] args) {
		
//		MethodDefination obj= new MethodDefination();
//		int sum1 =obj.add(5, 7, 10);
//		
//		int sum2 =obj.add(15, 71, 11);
		
		int sum1 =Adition.add(5, 7, 10);	
	    int sum2 =Adition.add(15, 71, 11);
		
		System.out.println("sum of 5 and 7: "+ sum1);
		
		System.out.println("sum of 15 and 71: "+ sum2);
		
	}

}
