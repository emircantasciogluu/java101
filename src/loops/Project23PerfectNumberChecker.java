package loops;

import java.util.Scanner;

public class Project23PerfectNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        int sum = 0;

        for (int i = 1; i <= number / 2; i++){
            if (number % i == 0){
                sum += i;
            }
        }

        if (sum == number && number != 0) {
            System.out.println(number + " is a Perfect Number");
        } else {
            System.out.println(number + " is NOT a Perfect Number");
        }
    }
}
