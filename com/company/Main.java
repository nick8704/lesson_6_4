package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter any positive number: ");
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();
        System.out.println("Square root of the number " + number + " is " + computation(number) + ".");
    }

    private static double computation(double value) {
        double firstValue = 0;
        double secondValue = value;
        double tmp;
        tmp = value;
        while (Math.abs(tmp * tmp - value) > 0.0001) {
            if ((tmp * tmp) > value) {
                secondValue = tmp;
            } else {
                firstValue = tmp;
            }
            tmp = (firstValue + secondValue) / 2;
        }
        return tmp;
    }
}
