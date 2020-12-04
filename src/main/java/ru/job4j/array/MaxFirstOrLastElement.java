package ru.job4j.array;

public class MaxFirstOrLastElement {
    public static int getMaxValue(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[array.length - 1]) {
                max = array[array.length - 1];
            }
        }
        return max;
    }
}