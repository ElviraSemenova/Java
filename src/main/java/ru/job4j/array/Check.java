package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (boolean i : data) {
            if (data[0] != i) {
                return false;
            }
        }
        return result;
    }
}