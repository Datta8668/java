package com.java_practice;
import java.util.Scanner;
	public class temperature{
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Welcome to the Temperature converter!");
			System.out.println("choose an option:");
			System.out.println("1.Celsius to Fahrenheit");
			System.out.println("2.Fahrenheit to Celsius");
			int choose = sc.nextInt();
			
			switch (choose) {
			case 1: 
				System.out.print("Enter temperature in Celsius: ");
				double cel = sc.nextDouble();
				double far = (cel*9/5) + 32;
				System.out.print("Temperature in Fahrenheit: "+far);
				break;
			
			case 2: 
				System.out.print("Enter temperature in Fahrenheit: ");
				far = sc.nextDouble();
				cel = (far - 32) * 5 / 9;
				System.out.print("Temperature in Celsius: "+cel);
				break;
				
			default:
				System.out.println("Please choose the correct option from 1 and 2.");
			}
			sc.close();
		}
	}
	