package com.java_practice;
import java.util.*;
public class reverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number do you want to reverse: ");
		int num = sc.nextInt();
		int rev = 0;
		int rem = 0;
		
		while(num != 0) {
			rem= num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		System.out.println("The reversed number is: "+rev);
	}
}
