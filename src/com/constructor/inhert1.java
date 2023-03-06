package com.constructor;

public class inhert1 {

	public String name = "jennet";
	public int batch = 2023;
	public void course()
	{
		System.out.println("DATA SCIENCE COURSE");
	}
	public static void main(String[] args) {
		inhert1 obj= new inhert1();
		System.out.println(obj.name);
		System.out.println(obj.batch);
		obj.course();
	}
}
