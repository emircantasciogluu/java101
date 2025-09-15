package com.emircan.java101;
import java.util.Scanner;
public class Project1GradeAverage {
    public static void main(String[] args) {
        int math,geo,phy,che,bio;
        double gradeMean;
        Scanner inp = new Scanner(System.in);

        System.out.print("Math Grade: ");
        math = inp.nextInt();

        System.out.print("Geography Grade: ");
        geo = inp.nextInt();

        System.out.print("Physics Grade: ");
        phy = inp.nextInt();

        System.out.print("Chemistry Grade: ");
        che = inp.nextInt();

        System.out.print("Biology Grade: ");
        bio = inp.nextInt();

        gradeMean = (math + geo + phy + che + bio) / 5.0;

        System.out.print("GPA : ");
        System.out.println(gradeMean);
        String result = (gradeMean < 50) ? "You failed the course" : "You passed the course.";
        System.out.println(result);
    }
}
