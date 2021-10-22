package com.bimal;

public class PrimeNumber {
public static void main(String[] args) {
	        int number = 12;
	        int maxDivisor = number/2;

	        int divisor = 2;
	        for( ; divisor <= maxDivisor; divisor++) {
	            if (number % divisor == 0) {
	                break;
	            }
	        }
	        
	        if(divisor > maxDivisor ){
	            System.out.println("Prime");
	        }else{
	            System.out.println("Not Prime");
	        }
	    }
	}
