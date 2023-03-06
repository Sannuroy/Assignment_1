package com.constructor;

public class PolyInherit2 extends PolyInherit1{
public void addition() {
	System.out.println("addition of a and b is :"+(a+b));
}
	public static void main(String[] args) {
		PolyInherit1 pi2 = new PolyInherit2();
		System.out.println(pi2.a);
		System.out.println(pi2.b);
		System.out.println(pi2.place);
		pi2.addition();
		
	}
}

