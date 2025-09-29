package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Project35ArraySorter {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = inp.nextInt();

        int[] list = new int[n];

        for (int i = 0; i < list.length; i++) {
            System.out.print("Enter Value of Array: ");
            list[i] = inp.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}
