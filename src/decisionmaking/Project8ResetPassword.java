package decisionmaking;

import java.util.Scanner;

public class Project8ResetPassword {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String correctUsername = "emir1905";
        String correctPassword = "415514gs";

        System.out.print("Username: ");
        String userName = inp.nextLine();

        System.out.print("Password: ");
        String password = inp.nextLine();

        if (userName.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful!");
        } else if (userName.equals(correctUsername) && !password.equals(correctPassword)) {
            System.out.println("Incorrect password!");
            System.out.print("Would you like to reset your password? (yes/no): ");
            String choice = inp.nextLine();

            if (choice.equalsIgnoreCase("yes")) {
                System.out.print("Enter your new password: ");
                String newPassword = inp.nextLine();

                if (newPassword.equals(correctPassword)) {
                    System.out.println("Password creation failed, please enter a different password.");
                } else {
                    System.out.println("Password created successfully.");
                }
            } else if (choice.equalsIgnoreCase("no")) {
                System.out.println("Password reset canceled.");
            } else {
                System.out.println("Invalid choice.");
            }
        } else {
            System.out.println("Login failed! Invalid username or password.");
        }
    }
}
