package loops;

import java.util.Scanner;

public class Project16PowerCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, exponent;
        int result = 1;

        System.out.print("Enter the base: ");
        base = input.nextInt();

        System.out.print("Enter the exponent: ");
        exponent = input.nextInt();

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Result: " + result);
    }
}
