package com.constructor;

public class ThisClass5 {
	ThisClass6 tc6;
	
	public ThisClass5(ThisClass6 tc6) {
		// TODO Auto-generated constructor stub
		this.tc6 = tc6;
	}
	
	public void print() {
		System.out.println("data of this class is:"+tc6.value);
	}

}
