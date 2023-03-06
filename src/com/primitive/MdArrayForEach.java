package com.primitive;

public class MdArrayForEach {
	public static void main(String[] args) {
		int[][]array = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[i].length;j++) {
				System.out.print(array[i][j]+" ");
				System.out.println(array.length);
				System.out.println(array[1].length);
			}
			System.out.println();
		}
		//using for each print the values of array
		int[][]array1= {{1,2,3},{4,5,6},{7,8,9}};
		for(int[]innerArray:array1) {
			for(int value:innerArray) {
				System.out.println(value+" ");
			}
			System.out.println();
		}
	}

}
