package com.java_practice;
import java.util.*;
public class NumberCheck {

	public static void main(String[] args) {
		Scanner sd = new Scanner(System.in);
		System.out.println("Please Enter the number.");
		int num = sd.nextInt();
		
		if(num < 0) {
			System.out.println(num+ " is negative.");
		}
		else if(num == 0) {
			System.out.println(num+ " is zero.");
		}
		else {
			System.out.println(num+ " is positive.");
		}
	}

}
