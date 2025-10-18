package com.hello;


public class Main { 
	
	public static void main(String[] args) { 
	
	Car myCar = new Car(); 
	myCar.brand = "Toyota"; 
	myCar.year = 2022;
	myCar.drive(); 
	myCar.setColor("blue");
	
	Car myNewCar =new Car("BMW",4,"black", 2025);
	
	System.out.println("Brand  " + myNewCar.getBrand());
	
//	System.out.println(myCar.brand);
//	
//	System.out.println("Number of wheels   " + myCar.getNumberOfWheels() );
//	System.out.println("Car color is " + myCar.getColor());
	
	}

}
