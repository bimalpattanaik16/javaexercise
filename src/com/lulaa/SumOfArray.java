package com.lulaa;

public class SumOfArray {
	public static void main(String args[]){
	      int[] array = {1, 2, 30, 4, 50, 7};
	      int sum = 0;
	      for( int i : array) {
	          sum = sum+i;
	      }
	      System.out.println("Sum of array elements is:"+sum);
	   }
}
