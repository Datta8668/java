package com.java_practice;
import java.util.*;
public class grade {

	public static void main(String[] args) {
		Scanner sd = new Scanner(System.in);
		System.out.println("Please Enter the Marks: ");
		float marks = sd.nextFloat();
		
		if(marks < 35) {
			System.out.println("You are fail.");
		}
		else if(marks > 35 && marks <= 50) {
			System.out.println("Your grade is C.");
		}
		else if (marks >= 51 && marks <= 70) {
			System.out.println("Your grade is B.");
		}
		else if (marks >= 71 && marks <= 90) {
			System.out.println("Your grade is A.");
		}
		else if (marks >= 91 && marks <= 100) {
			System.out.println("Your grade is A+.");
		}
		else {
			System.out.println("Enter the marks between 0 to 100.");
		}
	}

}
