package com.datastructure;

public class ReverseNumber {
    public static void main(String[] args) {
        // Call reverse number function
        new ReverseNumber().printReverseNumber(123456789);
    }

    public void printReverseNumber(int number) {
        int reverse = 0;
        while (number > 0) {
            int reminder = number % 10;
            number = number / 10;
            reverse = (reverse * 10) + reminder;
        }
        System.out.println("Reverse Number: " + reverse);
    }
}
