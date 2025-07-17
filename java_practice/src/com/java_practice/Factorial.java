package com.java_practice;

public class Factorial {

    public static void main(String[] args) {
    	
//    	Using for loop
//        int num = 10;
//        long factorial = 1;
//        for(int i = 1; i <= num; ++i)
//        {
//            // factorial = factorial * i;
//            factorial *= i;
//        }
//        System.out.printf("Factorial of %d = %d", num, factorial);

    	
//    Using while loop
        int num = 5, i = 1;
        long factorial = 1;
        while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}