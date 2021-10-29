package com.pratice;

public class ComplexNumber {
	private int real;
	private int image;
	public ComplexNumber(int real, int image) {
		super();
		this.real = real;
		this.image = image;
	}
	 public void showC() {
	        System.out.print(this.real + " +i" + this.image);
      }   
	 public static ComplexNumber add(ComplexNumber n1, ComplexNumber n2) {
		 ComplexNumber res = new ComplexNumber(0, 0);
		 res.real = n1.real + n2.real;
		 res.image = n1.image + n2.image;
		 return res;
		  
	 }
	 public static void main(String arg[]) {	  
	        ComplexNumber c1 = new ComplexNumber(2, 3);
	        ComplexNumber c2 = new ComplexNumber(7, 3);
	  
	          System.out.print("first Complex number: ");
	        c1.showC();
	          
	        System.out.print("\nSecond Complex number: ");
	        c2.showC();
	        
	        ComplexNumber res = add(c1, c2);
	        System.out.println("\nAddition is :");
	        res.showC();
	    }
}
