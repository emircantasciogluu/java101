package decisionmaking;

import java.util.Scanner;

public class Project7SimpleCalc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n1,n2,select;

        System.out.print("Select number 1: ");
        n1 = inp.nextInt();

        System.out.print("Select number 2: ");
        n2 = inp.nextInt();

        System.out.println("Choose an operation:\n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        select = inp.nextInt();

        switch (select) {
            case 1:
                System.out.println("Result of addition: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Result of subtraction: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Result of multiplication: " + (n1 * n2));
                break;
            case 4:
                if (n2 != 0) {
                    System.out.println("Result of division: " + ((double) n1 / n2));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid choice. Please select a valid option (1-4).");
        }

    }
}
