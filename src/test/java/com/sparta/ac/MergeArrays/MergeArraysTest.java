package com.sparta.ac.MergeArrays;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class MergeArraysTest {

    @Test
    @DisplayName("Test basic array is merged")
    void checkBasicArrayIsMerged() {
        int[] testArrayOne = {1, 3};
        int[] testArrayTwo = {2, 4};
        int[] expectedArray = {1, 2, 3, 4};
        Assertions.assertArrayEquals(expectedArray, MergeArrays.getMergedArray(testArrayOne, testArrayTwo));
    }

    @Test
    @DisplayName("Test arrays with 1 element in are merged")
    void checkOneElementArraysMerged() {
        int[] testArrayOne = {4};
        int[] testArrayTwo = {2};
        int[] expectedArray = {2, 4};
        Assertions.assertArrayEquals(expectedArray, MergeArrays.getMergedArray(testArrayOne, testArrayTwo));
    }

    @Test
    @DisplayName("Test larger array is merged")
    void checkLargerArrayIsMerged() {
        int[] testArrayOne = {1, 5, 17, 22, 39, 98};
        int[] testArrayTwo = {3, 11, 35, 40, 96};
        int[] expectedArray = {1, 3, 5, 11, 17, 22, 35, 39, 40, 96, 98};
        Assertions.assertArrayEquals(expectedArray, MergeArrays.getMergedArray(testArrayOne, testArrayTwo));
    }

    @Test
    @DisplayName("Test array with negative numbers")
    void checkNagativeArrayIsMerged() {
        int[] testArrayOne = {-5, -1, 17, 22, 39, 98};
        int[] testArrayTwo = {-3, 11, 35, 40, 96};
        int[] expectedArray = {-5, -3, -1, 11, 17, 22, 35, 39, 40, 96, 98};
        Assertions.assertArrayEquals(expectedArray, MergeArrays.getMergedArray(testArrayOne, testArrayTwo));
    }

    @Test
    @DisplayName("Test arrayone null returns arraytwo")
    void checkArrayOneNullReturnsArrayTwo() {
        int[] testArrayTwo = {-3, 11, 35, 40, 96};
        int[] expectedArray = {-3, 11, 35, 40, 96};
        Assertions.assertArrayEquals(expectedArray, MergeArrays.getMergedArray(null, testArrayTwo));
    }
    @Test
    @DisplayName("Test arraytwo null returns arrayone")
    void checkArrayTwoNullReturnsArrayOne() {
        int[] testArrayOne = {-3, 11, 35, 40, 96};
        int[] expectedArray = {-3, 11, 35, 40, 96};
        Assertions.assertArrayEquals(expectedArray, MergeArrays.getMergedArray(testArrayOne, null));
    }

    @Test
    @DisplayName("Test both null returns empty array")
    void checkBothNullReturnsEmptyArray() {

        int[] expectedArray = {};
        Assertions.assertArrayEquals(expectedArray, MergeArrays.getMergedArray(null, null));
    }

}
