package com.t3h.demo;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
/*		int arr[] = new int[]{2,5,78,3,23,25,213,34};
		
		//Arrays.sort(arr);
		
		Arrays.fill(arr, 100);
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ". " + arr[i]);
		}*/
		
		int [][] array = new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		
		
		 for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
				System.out.print(" - ");
			}
			System.out.println();
		}
		 
		System.out.println(array[1][2]);
		
		
		
	}

}
