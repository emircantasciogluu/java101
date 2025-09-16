package com.emircan.java101;

import java.util.Scanner;

public class Project3TriangleAreaCalc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        double side1, side2, side3;

        System.out.print("Side 1: ");
        side1 = inp.nextDouble();

        System.out.print("Side 2: ");
        side2 = inp.nextDouble();

        System.out.print("Side 3: ");
        side3 = inp.nextDouble();

        double u = (side1 + side2 + side3) / 2;
        double perimeter = 2 * u;
        double area = Math.sqrt(u * (u - side1) * (u - side2) * (u - side3));

        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
    }
}
