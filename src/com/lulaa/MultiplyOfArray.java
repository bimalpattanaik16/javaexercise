package com.lulaa;

public class MultiplyOfArray {
	public static void main(String[] args) {
		int[] array = {1, 2, 30, 4, 50, 7};
	      int multiply = 1;
	      for( int i : array) {
	    	  multiply  = multiply*i;
	      }
	      System.out.println("Sum of array elements is:"+multiply);
	}

}
