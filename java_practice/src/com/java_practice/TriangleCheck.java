package com.java_practice;
import java.util.*;
public class TriangleCheck {

	public static void main(String[] args) {
		
		Scanner sd = new Scanner (System.in);
		System.out.println("Please Enter the first side of triangle: ");
		int a = sd.nextInt();
		System.out.println("Please Enter the second side of triangle: ");
		int b = sd.nextInt();
		System.out.println("Please Enter the third side of triangle: ");
		int c = sd.nextInt();
		
		if(a+b > c && b+c > a && a+c > b) {
			System.out.println("Triangle is valid.");
		}
		else {
			System.out.println("Triangle is not valid.");
		}
	}

}
