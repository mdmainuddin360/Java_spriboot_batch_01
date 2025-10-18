package com.hello;

class Add{
	
	int add(int a, int b) {
		return a+b;
	}
}

class Sub extends Add{
	
	int sub(int a, int b) {
		return a-b;
	}
}

class Multiplication extends Sub{
	
	int mul(int a, int b) {
		return a*b;
	}
}


class Division extends Multiplication{
	
	int div(int a, int b) {
		return a/b;
	}
}

class ArithmeticOperations extends Division {
	
}

public class Main4 {
	
	public static void main(String[] args) {
		
		ArithmeticOperations op= new ArithmeticOperations();
		
		System.out.println("Adition of 5 and 7 = " +  op.add(5,7));
		System.out.println("Adition of 5 and 7 = " +  op.sub(9,7));
		System.out.println("Adition of 5 and 7 = " +  op.mul(5,7));	
		System.out.println("Adition of 5 and 7 = " +  op.div(14,7));
		
	}

}
