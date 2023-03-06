package com.constructor;

public class ThisClass4 {
	
	public void method1(ThisClass4 num) {
		System.out.println("First Method.");
	}
	
	public void method2() {
		method1(this);
	}
	
	public static void main(String[] args) {
		ThisClass4 tc = new ThisClass4();
		tc.method2();
	}
	
	

}