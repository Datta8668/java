package com.java_practice;
import java.util.*;
public class swap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first digit: ");
		int a = sc.nextInt();
		System.out.println("Enter the second digit: ");
		int b = sc.nextInt();
		System.out.println("before swapping: a = "+a+" and b = "+b);
		int c = a;
		a = b;
		b = c;
		System.out.println("swap it..!");
		System.out.println("after swapping: a = "+a+" and b = "+b);
	}
}
