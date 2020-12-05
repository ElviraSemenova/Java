package ru.job4j.Exercises.Arrays;

public class OddPrint {
    public static void print(int[] array) {
        int min = array[0];
        for ( int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (array[i] % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}