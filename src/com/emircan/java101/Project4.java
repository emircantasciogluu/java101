package com.emircan.java101;

import java.util.Scanner;

public class Project4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int km;

        System.out.print("KM: ");
        km = inp.nextInt();

        double perKm = 2.20;
        double openedPrice = 10.0;
        double amount = (km * perKm) + openedPrice;
        amount = (amount < 20.0) ? 20 : amount;

        System.out.println("Your taxi price is : " + amount + " $");

    }
}
