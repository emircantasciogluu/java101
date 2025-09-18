package loops;

import java.util.Scanner;

public class Project15CombinationCalc {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int fact = 1, fact1 = 1, fact2 = 1;

        System.out.print("Enter n: ");
        int n = inp.nextInt();

        System.out.print("Enter r: ");
        int r = inp.nextInt();

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        for (int j = 1; j <= r; j++) {
            fact1 *= j;
        }

        for (int k = 1; k <= (n - r); k++) {
            fact2 *= k;
        }

        if (n > r){
            int comb = fact / (fact1 * fact2);
            System.out.println("Combination: " + comb);
        }else {
            System.out.println("Warning!! n < r");
        }
    }
}
