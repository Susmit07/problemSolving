package com.sapient.logicals;

public class GenericPrinter {

	public <T> void printArray(T[] inputAarray){

		for(int i =0; i<inputAarray.length;i++){
			System.out.println(inputAarray[i]);
		}
	}
}
