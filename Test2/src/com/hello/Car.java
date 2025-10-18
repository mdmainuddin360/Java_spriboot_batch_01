package com.hello;

class Car {
	
String brand;
private int numberOfWheels=4;
private String color;
int year; 

public Car() {};

public Car(String brand, int numberOfWheels, String color, int year) {
	this.brand = brand;
	this.numberOfWheels = numberOfWheels;
	this.color = color;
	this.year = year;
}

@Override
public String toString() {
	return "Car [brand=" + brand + ", numberOfWheels=" + numberOfWheels + ", color=" + color + ", year=" + year + "]";
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public int getNumberOfWheels() {
	return numberOfWheels;
}

public void setNumberOfWheels(int numberOfWheels) {
	this.numberOfWheels = numberOfWheels;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public int getYear() {
	return year;
}

public void setYear(int year) {
	this.year = year;
}

//public void setColor(String cooolloer) {
//	this.color= cooolloer;
//}
//
//public String getColor() {
//	return this.color;
//}
//public int getNumberOfWheels() {
//	return this.numberOfWheels;
//}
public void drive() { 
	System.out.println("Car is driving..."); 	
} 

}

