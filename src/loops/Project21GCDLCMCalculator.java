package loops;

import java.util.Scanner;

public class Project21GCDLCMCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n1, n2;
        System.out.print("Enter n1: ");
        n1 = input.nextInt();

        System.out.print("Enter n2: ");
        n2 = input.nextInt();

        int gcd = 1;
        if (n1 < n2) {
            for (int i = 1; i <= n1; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    gcd = i;
                }
            }
        } else {
            for (int i = 1; i <= n2; i++) {
                if (n1 % i == 0 && n2 % i == 0) {
                    gcd = i;
                }
            }
        }

        int lcm = (n1 * n2) / gcd;

        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
    }
}
