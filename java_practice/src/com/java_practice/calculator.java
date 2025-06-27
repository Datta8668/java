package com.java_practice;
import java.util.*;
public class calculator {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the first number: ");
		int num1 = sc.nextInt();
		
		System.out.println("Please Enter the second number: ");
		int num2 = sc.nextInt();
		
		System.out.println("Please choose the operation you want to perform (+, -, *, /): ");
		char ope = sc.next().charAt(0);
		double result;
		
		if (ope == '+') {
			result = num1 + num2;
			System.out.println("Result: "+result);
		}
		else if(ope == '-') {
			result = num1 - num2;
			System.out.println("Result: "+result);
		}
		else if(ope == '*') {
			result = num1 * num2;
			System.out.println("Result: "+result);
		}
		else if(ope == '/') {
			result = num1 / num2;
			System.out.println("Result: "+result);
		}
		else {
			System.out.println("You choose the wrong operation..!");
		}
	}
}
