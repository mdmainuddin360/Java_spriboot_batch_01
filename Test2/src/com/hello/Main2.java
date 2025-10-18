package com.hello;

class Animal {
	
	void eat() { 
		System.out.println("Animal eats food"); 
	
	
	}
	
} 

class Dog extends Animal {
    void bark() {
	
	System.out.println("Dog barks"); 
	
} 
    
} 

class Main2 {
	public static void main(String[]args) { 
		
		Dog d = new Dog(); 
		Animal animal= new Animal();
		animal.eat();
		d.eat(); 
		d.bark(); 

	} }