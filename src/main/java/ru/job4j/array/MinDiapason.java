package ru.job4j.array;

public class MinDiapason {
    public static int minimum(int[] array, int start, int finish) {
        int min = array[start];
        for (int i = start; i <= finish; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}