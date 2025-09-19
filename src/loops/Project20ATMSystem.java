package loops;

import java.util.Scanner;

public class Project20ATMSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Enter Username: ");
            userName = input.nextLine();

            System.out.print("Enter Password: ");
            password = input.nextLine();

            if (userName.equals("emircan") && password.equals("415514")) {
                System.out.println("Hello, welcome to X Bank!");
                do {
                    System.out.println("1-Deposit Money\n" +
                            "2-Withdraw Money\n" +
                            "3-Check Balance\n" +
                            "4-Exit");
                    System.out.print("Please select the operation you want to perform: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Enter deposit amount: ");
                            int deposit = input.nextInt();
                            balance += deposit;
                            break;
                        case 2:
                            System.out.print("Enter withdrawal amount: ");
                            int withdraw = input.nextInt();
                            if (withdraw > balance) {
                                System.out.println("Insufficient funds.");
                            } else {
                                balance -= withdraw;
                            }
                            break;
                        case 3:
                            System.out.println("Balance: " + balance);
                            break;
                        case 4:
                            System.out.println("Logging out...");
                            break;
                        default:
                            System.out.println("Invalid choice, please try again.");
                            break;
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                System.out.println("Incorrect username or password. Please try again.");
                if (right == 0) {
                    System.out.println("Your account has been blocked, please contact the bank.");
                } else {
                    System.out.println("Remaining attempts: " + right);
                }
            }
        }
    }
}
