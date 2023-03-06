package com.constructor;

public class Encapsulation1 {
public static void main(String[] args) {
	Encapsulation ec = new Encapsulation();
	System.out.println(ec.getEmail());
	System.out.println(ec.getName());
	System.out.println(ec.getNumber());
	ec.setName("annu");
	System.out.println(ec.getName());
	System.out.println(ec.getName()+" "+ec.getEmail()+" "+ec.getNumber());
}
}
