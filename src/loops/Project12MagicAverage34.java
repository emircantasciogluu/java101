package loops;

import java.util.Scanner;

public class Project12MagicAverage34 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int sum = 0, count = 0, number;

        System.out.print("Enter a number: ");
        number = inp.nextInt();

        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                sum += i;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average: " + average);
        } else {
            System.out.println("No divisible numbers found.");
        }
    }
}
