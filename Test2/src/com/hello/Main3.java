package com.hello;

class LivingThing { 
	
	void breathe() { 
		
		System.out.println("Breathing..."); 
		
	} 
	
}

class Animal1 extends LivingThing { 
	
	void eat() { 
		System.out.println("Eating...");
		} 
	
} 

class Dog1 extends Animal1 { 
	void bark() {
        System.out.println("Barking..."); 

	} 
	
} 

public class Main3 { 
	
	public static void main(String[] args) {
		
		Dog1 d =new Dog1();
		
		d.breathe();
		d.eat();
		d.bark();
		
	}
}