package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MatrixTest {
    @Test
    public void when2on2() {
        int[][] table = Matrix.multiple(2);
        int[][] expect = {
                {1, 2},
                {2, 4}
        };
        assertThat(table, is(expect));
    }

    @Test
    public void when7on7() {
        int[][] table = Matrix.multiple(7);
        int[][] expect = {
                {1, 2, 3, 4, 5, 6, 7},
                {2, 4, 6, 8, 10, 12, 14},
                {3, 6, 9, 12, 15, 18, 21},
                {4, 8, 12, 16, 20, 24, 28},
                {5, 10, 15, 20, 25, 30, 35},
                {6, 12, 18, 24, 30, 36, 42},
                {7, 14, 21, 28, 35, 42, 49}

        };
        assertThat(table, is(expect));
    }
}
