package com.emircan.java101;

import java.util.Scanner;

public class Project5AreaOfCircle {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double pi = 3.14;

        System.out.print("Radius: ");
        double r = inp.nextDouble();

        System.out.print("Angle: ");
        double angle = inp.nextDouble();

        double area = (pi * (Math.pow(r,2) * angle) / 360.0);

        System.out.print("Sector Area : " + area);
    }
}
