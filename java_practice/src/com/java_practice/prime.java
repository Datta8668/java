package com.java_practice;
import java.util.*;
public class prime {

	public static void main(String[] args) {
		
		Scanner sd = new Scanner(System.in);
		System.out.println("Please Enter the number do want to check: ");
		int num = sd.nextInt();
		int count = 0;
		
		for(int i=1; i<=num; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		
		if(count == 2) {
			System.out.println(num+ " is Prime number.");
		}
		else {
			System.out.println(num+" is not a Prime number.");
		}
		
	}

}
