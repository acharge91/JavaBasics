package com.sparta.ac.MergeArrays;

import java.util.Arrays;

public class MergeArrays {
    public static int[] getMergedArray(int[] arrayOne, int[] arrayTwo) {

        if (arrayOne != null && arrayTwo != null) {
            int[] mergedArray = new int[arrayOne.length + arrayTwo.length];
            int array1Counter = 0;
            int array2Counter = 0;
            int indexCount = 0;
            while (array1Counter < arrayOne.length && array2Counter < arrayTwo.length) {

                if (array1Counter < arrayOne.length && arrayOne[array1Counter] < arrayTwo[array2Counter]) {
                    mergedArray[indexCount++] = arrayOne[array1Counter++];
                } else {
                    mergedArray[indexCount++] = arrayTwo[array2Counter++];
                }
            }

            while (array1Counter < arrayOne.length) {
                mergedArray[indexCount++] = arrayOne[array1Counter++];
            }

            while (array2Counter < arrayTwo.length) {
                mergedArray[indexCount++] = arrayTwo[array2Counter++];
            }
            return mergedArray;
        } else {
            if (arrayOne == null && arrayTwo == null) {
                int[] emptyArray = {};
                return emptyArray;
            } else if (arrayOne == null) {
                return arrayTwo;
            } else {
                return arrayOne;
            }
        }

    }

    public static void main(String[] args){
        int[] arrayOne;
        int[] arrayTwo;

        System.out.println(Arrays.toString(getMergedArray(null, null)));
    }
}
