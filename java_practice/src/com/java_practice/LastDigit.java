package com.java_practice;

import java.util.Scanner;

public class LastDigit {

	public static void main(String[] args) {

		Scanner sd = new Scanner (System.in);
		
		System.out.println("Enter the number: ");
		
		int n = sd.nextInt();
		
		int d = Math.abs(n % 10);
		
		System.out.println("The last digit of number is: "+d);
		

	}

}
