package loops;

import java.util.Scanner;

public class Project14PowerPrinter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int number;
        System.out.print("Enter a number: ");
        number = inp.nextInt();

        System.out.println("Power of 4: ");
        for (int i = 1; i <= number; i *= 4){
            System.out.println(i);
        }

        System.out.println("Power of 5");
        for (int j = 1; j <= number; j *= 5){
            System.out.println(j);
        }
    }
}
