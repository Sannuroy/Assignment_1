package com.constructor;

public class ThisClass6 {
	int value = 25;
	
	public ThisClass6() {
		// TODO Auto-generated constructor stub
		ThisClass5 tc5 = new ThisClass5(this);
		tc5.print();
	}
	
	
	public static void main(String[] args) {
		ThisClass6 tc6 = new ThisClass6();
		
	}

}
