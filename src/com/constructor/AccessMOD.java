package com.constructor;

public class AccessMOD {
public String name = "shweta";
protected String title ="kumari";
 int roll = 8;
 private int year = 2020;
public static void main(String[] args) {
	AccessMOD ac = new AccessMOD();
	System.out.println(ac.name);
	System.out.println(ac.title);
	System.out.println(ac.roll);
	System.out.println(ac.year);
	
}

}
