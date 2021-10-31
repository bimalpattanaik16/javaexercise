package com.lulaa;

public class AverageOfNumbers {
	public static void main(String[] args) {
       double[] arr = {19, 12.5, 16, 200, 13.6};
       double total = 0;

        for(int i=0; i<arr.length; i++){
        	total = total + arr[i];
        }
        double average = total/ arr.length;
        
        System.out.format("The average is: %.3f", average);
	}
}
