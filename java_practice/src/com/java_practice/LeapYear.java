package com.java_practice;
import java.util.*;
public class LeapYear {
	public static void main(String[] args) {
		Scanner sd = new Scanner (System.in);
		System.out.println("Please Enter the year.");
		int year = sd.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println(year+" is leaf year.");
		}
		else {
			System.out.println(year+ " is not leaf year.");
		}
	}
}
