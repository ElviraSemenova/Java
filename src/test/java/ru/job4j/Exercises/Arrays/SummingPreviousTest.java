package ru.job4j.Exercises.Arrays;

import org.junit.Test;
import ru.job4j.Exercises.Arrays.SummingPrevious;

import static org.junit.Assert.*;

public class SummingPreviousTest {

    @Test
    public void test() {
        assertArrayEquals(new int[] {1, 2, 3}, SummingPrevious.calculate(1, 2, 3));
        assertArrayEquals(new int[] {1, 2, 3, 6}, SummingPrevious.calculate(1, 2, 4));
        assertArrayEquals(new int[] {1, 2, 3, 6, 12}, SummingPrevious.calculate(1, 2, 5));
    }

}