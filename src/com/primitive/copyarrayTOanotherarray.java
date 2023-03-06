package com.primitive;

public class copyarrayTOanotherarray {
	public static void main(String[] args) {
		String name[]= {"rony","priyo","arnab","golu"};
		System.out.println(name[2]);
		String name2[]= name;
		System.out.println(name2[1]);
		for(String values: name2) {
			System.out.println("values of name2 array is:"+values);
		}
		
	}

}
