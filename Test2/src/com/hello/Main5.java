package com.hello;

class Vehicle1 { 
	
	void start() { 
		System.out.println("Vehicle starts"); 
	} 
	
} 



class Car2 extends Vehicle1 { 
	
	void drive() { 
		
		System.out.println("Driving car"); 
	
	} }



class Bike1 extends Vehicle {
	
	void ride() {
System.out.println("Riding bike"); 

	} } 



public class Main5 {
	
	public static void main(String[] args) { 
		
		Car2 c= new Car2(); 
		Bike1 b= new Bike1();
		c.start(); 
		c.drive(); 
		
		b.start();

	} }
