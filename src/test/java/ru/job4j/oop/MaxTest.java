package ru.job4j.oop;

import org.junit.Test;
import ru.job4j.oop.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MaxTest {
    @Test
    public void whenTwo() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenThree() {
        int result = Max.max(3, 2, 0);
        assertThat(result, is(3));
    }

    @Test
    public void whenFour() {
        int result = Max.max(5, 5, 8, 10);
        assertThat(result, is(10));
    }
}