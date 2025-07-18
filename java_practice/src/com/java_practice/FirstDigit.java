package com.java_practice;

public class FirstDigit {
    public static int firstDigit(int n) {
        String numberStr = Integer.toString(Math.abs(n));
        char firstChar = numberStr.charAt(0);
        return Character.getNumericValue(firstChar);
    }

    public static void main(String[] args) {
        System.out.println(firstDigit(123));  // Output: 1
        System.out.println(firstDigit(976));  // Output: 9
        System.out.println(firstDigit(-4567)); // Output: 4
    }
}
