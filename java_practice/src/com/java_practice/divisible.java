package com.java_practice;
import java.util.*;
public class divisible {
	public static void main(String[] args) {
		Scanner ds = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		int num = ds.nextInt();
		if(num % 3 == 0 && num % 5 == 0) {
			System.out.println(num+" is divisible by 3 and 5.");
		}
		else {
			System.out.println(num+" is divisible not by 3 and 5.");
		}
	}
}
