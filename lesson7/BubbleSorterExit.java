package lesson7;

import java.util.Arrays;

public class BubbleSorterExit {
    public static void main(String[] args) {
        int[] array = new int[]{8, 17, 5, 3, 6};
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array) {
        // i - номер прохода
        for (int i = 0; i < array.length; i++) {
            boolean flag = false;
            // внутренний цикл прохода
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }
}

