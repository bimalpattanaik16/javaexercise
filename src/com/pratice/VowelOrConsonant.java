package com.pratice;
import java.util.Scanner;

public class VowelOrConsonant {
	public static void main(String[] args) {
		System.out.println("entered an alphabet");
		Scanner s1 = new Scanner(System.in);
		char ch= s1.next().charAt(0);
		switch (ch) {
		
		case 'a':
			System.out.println("entered is vowel"+ch);
			break;
			
		case 'e':
			System.out.println("entered is vowel "+ch);
			break;
			
		case 'i':
			System.out.println("entered is vowel"+ch);
			break;
			
		case 'o':
			System.out.println("entered is vowel"+ch);
			break;
			
		case 'u':
			System.out.println("entered is vowel"+ch);
			break;
			
		default:
			System.out.println("entered alphabet is consonant" + ch);
			
		}
	}

}
