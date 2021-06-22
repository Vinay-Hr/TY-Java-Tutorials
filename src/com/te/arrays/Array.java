package com.te.arrays;

public class Array {

	public static void main(String[] args) {
		int arr[] = {10,20,30,40};
		
		int arr1[] = {};
		int [] arr2 = new int [5];
				
		for (int i=0; i<arr.length; i++)
		{
			arr2[i] = arr[i];
			System.out.println(arr2[i]);
		}
		
	}
}
