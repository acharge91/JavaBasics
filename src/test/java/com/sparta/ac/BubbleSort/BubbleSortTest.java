package com.sparta.ac.BubbleSort;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class BubbleSortTest {

    @Test
    @DisplayName("Test returns numbers in sequence")
    void checkNumbersReturnedInOrder() {
        int[] numArrayToCheck = {2,1};
        int[] numArrayExpected = {1,2};
        Assertions.assertArrayEquals(numArrayExpected, BubbleSort.getBubbleSortOfArray(numArrayToCheck));
    }

    @Test
    @DisplayName("Test returns multiple numbers in sequence")
    void checkMultipleNumbersReturnedInOrder() {
        int[] numArrayToCheck = {2,99,1,17,26,45};
        int[] numArrayExpected = {1,2,17,26,45,99};
        Assertions.assertArrayEquals(numArrayExpected, BubbleSort.getBubbleSortOfArray(numArrayToCheck));
    }

    @Test
    @DisplayName("Test returns negative numbers in sequence")
    void checkNegativeNumbersReturnedInOrder() {
        int[] numArrayToCheck = {2,99,1,-17,-26,-45};
        int[] numArrayExpected = {-45,-26,-17,1,2,99};
        Assertions.assertArrayEquals(numArrayExpected, BubbleSort.getBubbleSortOfArray(numArrayToCheck));
    }

}
