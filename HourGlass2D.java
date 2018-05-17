package com.sapient.logicals;

public class HourGlass2D {

	private static int findMaxSum(int[][] arr) {

		int row = 6;
		int column = 6;

		int maximumSum = Integer.MIN_VALUE;
	
		/*Considering 3X3 matrix
		a b c
		  d
		e f g */
		for(int i = 0; i < row-2; i++){
			for(int j = 0; j < column -2; j++){

				int sum = (arr[i][j]+arr[i][j+1]+arr[i][j+2])+
							(arr[i+1][j+1])+
							(arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
				maximumSum = Math.max(sum, maximumSum);
			}
		}
		return maximumSum;
	}

	public static void main(String[]args){

		int [][]mat = {{1, 1, 1, 0, 0, 0},
				{0, 1, 0, 0, 0, 0},
				{1, 1, 1, 0, 0, 0},
				{0, 0, 2, 4, 4, 0},
				{0, 0, 0, 2, 0, 0},
				{0, 0, 1, 2, 4, 0}};

		int res = findMaxSum(mat);
		System.out.println("Maximum Sum: "+res);
	}
}
