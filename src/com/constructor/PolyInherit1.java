package com.constructor;

public class PolyInherit1 extends PolyInherit {
public String place = "delhi";
public static void main(String[] args) {
	PolyInherit1 pi1 = new PolyInherit1();
	System.out.println(pi1.place);
	System.out.println(pi1.a);
	System.out.println(pi1.b);
	pi1.addition();
}
}
