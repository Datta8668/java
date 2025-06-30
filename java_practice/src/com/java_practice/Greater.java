package com.java_practice;
import java.util.*;
public class Greater {
	public static void main(String[] args) {
		Scanner fd = new Scanner(System.in);
		System.out.print("Please Enter the first number: ");
		double num1 = fd.nextDouble();
		System.out.print("Please Enter the second number: ");
		double num2 = fd.nextDouble();
		System.out.print("Please Enter the third number");
		double num3 = fd.nextDouble();
		if(num1 >= num2) {
			if(num1 >= num3) {
			System.out.println(num1+" is greater.");
			}
			else {
				System.out.println(num3+ " is greater.");
			}
		}
		else {
			System.out.println(num2+" is greater.");
		}
	}
}
