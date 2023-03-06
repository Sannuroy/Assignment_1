package com.constructor;

public class PolyInherit {
	public int a = 10;
	public int b = 20;
	public void addition() {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		PolyInherit pi = new PolyInherit();
		System.out.println(pi.a);
		System.out.println(pi.b);
		pi.addition();
	}

}
