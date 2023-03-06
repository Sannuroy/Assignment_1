package com.constructor;

public class ConstructorOverloading {
	
	int number;
	String name;
	
	public ConstructorOverloading(int number) {
		// TODO Auto-generated constructor stub
		this.number = number;
		System.out.println("Parameterized constructor.");
		System.out.println("number value is: "+number);
	}
	
	public ConstructorOverloading(int number, String name) {
		// TODO Auto-generated constructor stub
		this.number = number;
		this.name = name;
		System.out.println("Parameterized constructor.");
		System.out.println("number value is: "+number+":"+name);
	}
	
	public ConstructorOverloading() {
		// TODO Auto-generated constructor stub
//		this(23);
		System.out.println("default constructor");
		
	}
	
	public static void main(String[] args) {
		ConstructorOverloading cl = new ConstructorOverloading();
		ConstructorOverloading cl1 = new ConstructorOverloading(15);
		ConstructorOverloading cl2 = new ConstructorOverloading(24, "Java");
		System.out.println("main method");
	}
}
	