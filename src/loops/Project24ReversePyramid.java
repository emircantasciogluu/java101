package loops;

import java.util.Scanner;

public class Project24ReversePyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter * number: ");
        int starNumber = input.nextInt();

        for (int i = starNumber; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
