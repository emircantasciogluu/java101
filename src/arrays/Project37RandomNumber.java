package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Project37RandomNumber {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(101); // 0-100 arası
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;

        while (right < 5) {
            System.out.print("Please insert your guess (0-100): ");
            selected = inp.nextInt();

            if (selected < 0 || selected > 100) {
                System.out.println("Please enter a number between 0 and 100!");
                continue;
            }

            if (selected == number) {
                System.out.println("🎉 Congratulations! You guessed correctly!");
                isWin = true;
                break;
            } else {
                System.out.println("❌ Wrong Guess!");
                if (selected < number) {
                    System.out.println("Your guess is smaller than the number.");
                } else {
                    System.out.println("Your guess is greater than the number.");
                }

                wrong[right++] = selected;
                System.out.println("Remaining Attempts: " + (5 - right));
            }
        }

        if (!isWin) {
            System.out.println("You lose! The number was: " + number);
            System.out.println("Your Guesses: " + Arrays.toString(wrong));
        }
    }
}
