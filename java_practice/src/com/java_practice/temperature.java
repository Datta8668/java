package com.java_practice;
import java.util.Scanner;
public class temperature {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		        System.out.println("Welcome to the Temperature Converter!");
		        System.out.println("Choose an option:");
		        System.out.println("1. Celsius to Fahrenheit");
		        System.out.println("2. Fahrenheit to Celsius");

		        int choice = scanner.nextInt();

		        switch (choice) {
		            case 1:
		                System.out.print("Enter temperature in Celsius: ");
		                double celsius = scanner.nextDouble();
		                double fahrenheit = (celsius * 9 / 5) + 32;
		                System.out.printf("Temperature in Fahrenheit: %.2f°F%n", fahrenheit);
		                break;

		            case 2:
		                System.out.print("Enter temperature in Fahrenheit: ");
		                fahrenheit = scanner.nextDouble();
		                celsius = (fahrenheit - 32) * 5 / 9;
		                System.out.printf("Temperature in Celsius: %.2f°C%n", celsius);
		                break;

		            default:
		                System.out.println("Invalid choice. Please restart the program and choose 1 or 2.");
		        }

		        scanner.close();
		    }
		

	}


