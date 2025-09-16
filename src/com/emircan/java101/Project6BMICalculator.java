package com.emircan.java101;

import java.util.Scanner;

public class Project6BMICalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Please enter your height (in meters): ");
        double height = inp.nextDouble();

        System.out.print("Please enter your weight (in kilograms): ");
        double weight = inp.nextDouble();

        double bmi = weight / (height * height);

        System.out.println("Your Body Mass Index (BMI) is: " + bmi);
    }
}
