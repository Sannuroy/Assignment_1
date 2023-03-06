package com.constructor;

public class inhert3 extends inhert2{
public String place = "Banglore";
public static void main(String[] args) {
	inhert3 obj3 = new inhert3();
	System.out.println(obj3.place);
	obj3.course();
	inhert2 obj2 = new inhert2();
	System.out.println(obj2.batch);
}
}
