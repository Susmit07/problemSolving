package com.sapient.logicals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayRotateLeft {


	@SuppressWarnings("resource")
	public  static void main(String args[]){
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no of integers: ");
		int n=scn.nextInt();
		System.out.println("Enter no of left rotations: ");
		int d=scn.nextInt();
		List <Integer> a=new ArrayList<Integer>();
		System.out.println("Enter the elements to be added to the array: ");
		for (int i=0;i<n;i++){
			a.add(i, scn.nextInt());
		}
		System.out.println("The Array is: "+a);
		int c = 0;
		for(int i = 0; i<d; i++){
			int shiftElement = a.get(c);
			a.remove(c);
			a.add(n-1, shiftElement);
		}
		System.out.println("The left rotated Array by "+ d +" position is: "+a);
	}
}
