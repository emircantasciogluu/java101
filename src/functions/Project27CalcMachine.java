package functions;

import java.util.Scanner;

public class Project27CalcMachine {

    static int add(int a, int b) {
        int result = a + b;
        System.out.println("Sum: " + result);
        return result;
    }

    static int subtract(int a, int b) {
        int result = a - b;
        System.out.println("Subtraction: " + result);
        return result;
    }

    static int multiply(int a, int b) {
        int result = a * b;
        System.out.println("Multiplication: " + result);
        return result;
    }

    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        double result = a / b;
        System.out.println("Division: " + result);
        return result;
    }

    static int exponentiation(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        System.out.println("Exponentiation Result: " + result);
        return result;
    }

    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("Factorial: " + result);
        return result;
    }

    static int modulus(int a, int b) {
        int result = a % b;
        System.out.println("Modulus: " + result);
        return result;
    }

    static void rectangle(int a, int b) {
        int area = a * b;
        int perimeter = 2 * (a + b);
        System.out.println("Rectangle Area: " + area);
        System.out.println("Rectangle Perimeter: " + perimeter);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1- Addition");
        System.out.println("2- Subtraction");
        System.out.println("3- Multiplication");
        System.out.println("4- Division");
        System.out.println("5- Exponentiation");
        System.out.println("6- Factorial");
        System.out.println("7- Modulus");
        System.out.println("8- Rectangle Area and Perimeter");

        System.out.print("Choose an operation: ");
        int choice = input.nextInt();

        int a, b;

        switch (choice) {
            case 1:
                System.out.print("Enter first number: ");
                a = input.nextInt();
                System.out.print("Enter second number: ");
                b = input.nextInt();
                add(a, b);
                break;
            case 2:
                System.out.print("Enter first number: ");
                a = input.nextInt();
                System.out.print("Enter second number: ");
                b = input.nextInt();
                subtract(a, b);
                break;
            case 3:
                System.out.print("Enter first number: ");
                a = input.nextInt();
                System.out.print("Enter second number: ");
                b = input.nextInt();
                multiply(a, b);
                break;
            case 4:
                System.out.print("Enter first number: ");
                double x = input.nextDouble();
                System.out.print("Enter second number: ");
                double y = input.nextDouble();
                divide(x, y);
                break;
            case 5:
                System.out.print("Enter base: ");
                a = input.nextInt();
                System.out.print("Enter exponent: ");
                b = input.nextInt();
                exponentiation(a, b);
                break;
            case 6:
                System.out.print("Enter a number: ");
                a = input.nextInt();
                factorial(a);
                break;
            case 7:
                System.out.print("Enter first number: ");
                a = input.nextInt();
                System.out.print("Enter second number: ");
                b = input.nextInt();
                modulus(a, b);
                break;
            case 8:
                System.out.print("Enter the length: ");
                a = input.nextInt();
                System.out.print("Enter the width: ");
                b = input.nextInt();
                rectangle(a, b);
                break;
            default:
                System.out.println("Invalid choice!");
        }
    }
}
