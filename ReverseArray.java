package com.sapient.logicals;

public class ReverseArray {


	public static int [] reverseArray(int []arr){

		int start = 0;
		int end = arr.length-1;
		int temp;
		while(start<end){
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start ++;
			end --;
		}
		return arr;
	}


	public static void main(String[]args){

		int [] originalArray = {1, 2, 3, 4};
		System.out.print("The original array is:");
		for(int o : originalArray){
			System.out.print(" "+o);
		}
		System.out.println();
		int [] reverseArray = reverseArray(originalArray);
		System.out.print("The reversed array is:");
		for(int r : reverseArray){
			System.out.print(" "+r);
		}
	}
}
