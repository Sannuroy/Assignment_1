package com.primitive;

import java.util.Arrays;

public class CheckEqualityOfArray {
public static void main(String[] args) {
	int arr1[]= {1,2,3};
	int arr2[]= {1,2,3};
	boolean result=Arrays.equals(arr1,arr2);
	if(result==true) {
		System.out.println("two arrays are equal");
	}
	else {
		System.out.println("two arrays are not equal");
	}
}
}
