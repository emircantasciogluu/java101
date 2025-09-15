package com.emircan.java101;

import java.util.Scanner;

public class Project2TaxCalculator {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the price without tax: ");
        double mainPrice = inp.nextDouble();

        if (mainPrice <= 0) {
            System.out.println("Invalid input. Price must be greater than 0.");
            return;
        }

        double taxRate = (mainPrice <= 1000) ? 0.18 : 0.08;
        double taxPrice = mainPrice * taxRate;
        double withTax = mainPrice + taxPrice;

        System.out.println("Price without tax: " + mainPrice);
        System.out.println("Price with tax: " + withTax);
        System.out.println("Tax amount: " + taxPrice);
    }
}
