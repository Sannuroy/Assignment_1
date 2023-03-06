package com.constructor;

public class constructor {
	public constructor() {
 this(0);
		System.out.println("default constructor");
	}
	public constructor(int num) {
	//	this();
		System.out.println("parameterized constructor");
		System.out.println("number value is:"+num);
	}
	public static void main(String[] args) {
		constructor c1 = new constructor();
		//constructor c1 = new constructor(12);
		System.out.println("main method");
	}
	}


