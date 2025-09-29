package arrays;

import java.util.Scanner;

public class Project32ClosestNumberInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int closestSmaller = 0;
        int closestGreater = 0;

        for (int value : list) {
            if (value < number) {
                if (closestSmaller == 0 || number - value < number - closestSmaller) {
                    closestSmaller = value;
                }
            }
            if (value > number) {
                if (closestGreater == 0 || value - number < closestGreater - number) {
                    closestGreater = value;
                }
            }
        }

        if (closestSmaller != 0) {
            System.out.println("Closest smaller number: " + closestSmaller);
        } else {
            System.out.println("No smaller number found.");
        }

        if (closestGreater != 0) {
            System.out.println("Closest greater number: " + closestGreater);
        } else {
            System.out.println("No greater number found.");
        }
    }
}
