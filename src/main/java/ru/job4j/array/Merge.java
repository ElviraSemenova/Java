package ru.job4j.array;

public class Merge {
    public static int[] merge(int[] left, int[] right) {
        int l = 0;
        int r = 0;
        int o = 0;
        int[] rsl = new int[left.length + right.length];
        while (o < rsl.length) {
            if (l < left.length && left[l] < right[r]) {
                rsl[o++] = left[l++];
            } else {
                rsl[o++] = right[r++];
            }
        }
        return rsl;
    }
}