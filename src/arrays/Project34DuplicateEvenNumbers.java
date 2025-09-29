package arrays;

import java.util.Arrays;

public class Project34DuplicateEvenNumbers {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {1, 2, 12, 12, 2, 4, 6, 11, 13, 4, 8, 4, 1, 3, 3};
        int[] duplicateEven = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    if (!isFind(duplicateEven, list[i])) {
                        duplicateEven[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(Arrays.copyOf(duplicateEven, startIndex)));
    }
}
