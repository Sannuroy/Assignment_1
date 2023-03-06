package com.constructor;

public class inhert2 extends inhert1 {
public int roll = 23;
public static void main(String[] args) {
	inhert1 obj1 = new inhert1();
	System.out.println(obj1.name);
	System.out.println(obj1.batch);
	
	inhert2 obj2 = new inhert2();
	System.out.println(obj2.roll);
	System.out.println(obj2.name);
	System.out.println(obj2.batch);
	obj2.course();
}
}
