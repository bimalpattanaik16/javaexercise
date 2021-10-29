package com.pratice;

public class PowerOfANumber {

	public static void main(String[] args) {
        int number = 7; 
        int	power = 2;
        long result = 1;
        
        int i=power;
        while (i != 0)
        {
            result *= number;
            --i;
        }
        System.out.println(number+"^"+power+" = "+result);
    }

}
