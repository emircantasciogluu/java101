package arrays;

public class Project36ArrayFrequency {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] checked = new int[list.length];
        int startIndex = 0;

        for (int i = 0; i < list.length; i++) {
            int count = 0;
            if (!isFind(checked, list[i])) {
                for (int j = 0; j < list.length; j++) {
                    if (list[i] == list[j]) {
                        count++;
                    }
                }
                checked[startIndex++] = list[i];
                System.out.println(list[i] + " is repeated " + count + " times.");
            }
        }
    }
}
