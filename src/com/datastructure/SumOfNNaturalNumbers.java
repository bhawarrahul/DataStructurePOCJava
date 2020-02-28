package com.datastructure;

public class SumOfNNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(sumOfNNumberUsingFor(20));
        System.out.println(sumOfNNumberUsingMathFormula(20));
    }

    public static int sumOfNNumberUsingFor(int number) {
        int sum = 0;
        for (int count = 1; count <= number; count++) {
            sum += count;
        }
        return sum;
    }

    public static int sumOfNNumberUsingMathFormula(int number) {
        int sum = (number * (number + 1)) / 2;
        return sum;
    }
}
