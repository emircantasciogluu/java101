package loops;

import java.util.Scanner;

public class Project17DigitSumCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int basValue;
        int tempNumber = number;
        int result = 0;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            result += basValue;
            tempNumber /= 10;
        }

        System.out.println("Digit sum: " + result);
    }
}
