package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.back(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 3, 5, 7};
        int[] result = turner.back(input);
        int[] expect = new int[] {7, 5, 3, 1};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithDifferentAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {1, 4, 7, 10};
        int[] result = turner.back(input);
        int[] expect = new int[] {10, 7, 4, 1};
        assertThat(result, is(expect));
    }

}