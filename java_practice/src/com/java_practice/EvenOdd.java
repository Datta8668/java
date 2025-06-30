package com.java_practice;
import java.util.*;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner sd = new Scanner(System.in);
		System.out.print("Enter the number you want to check: ");
		int num = sd.nextInt();
		if(num % 2 == 0) {
			System.out.println(num+ " is even.");
		}
		else {
			System.out.println(num+ " is odd.");
		}
	}
}
