package loops;

import java.util.Scanner;

public class Project25Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        int first = 0, second = 1;

        System.out.print(first);
        System.out.print(" ");
        System.out.print(second);
        System.out.print(" ");

        for (int i = 2; i <= n-1; i++){
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
    }
}