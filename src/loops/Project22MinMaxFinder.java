package loops;

import java.util.Scanner;

public class Project22MinMaxFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter? ");
        int count = input.nextInt();

        int number;
        int max = 0, min = 0;

        for (int i = 1; i <= count; i++){
            System.out.print("Enter number " + i + ": ");
            number = input.nextInt();
            if (i == 1){
                min = number;
                max = number;
            } else {
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            }
        }

        System.out.println("Maximum number : " + max);
        System.out.print("Minimum number : " + min);
    }
}
