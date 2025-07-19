package com.java_practice;

import java.util.Scanner;

public class SumofNatural {

	public static void main(String[] args) {
		
		Scanner d = new Scanner(System.in);
		
		System.out.print("Enter the number: ");
		
		int n = d.nextInt();
		
		int sum = n * (n+1) / 2;
		
		System.out.println("The Sum of first "+n+" number is: "+sum);
	}
}
