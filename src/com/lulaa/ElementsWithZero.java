package com.lulaa;

public class ElementsWithZero {
	public static void main(String[] args) {
		int a[] = { 3,4,6,4,5,7 };
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==4 && a[i+1]==5) {
				a[i+1]=0;
			}
		}
		for(int i : a) {
			System.out.println(i);
		}
	}

}
