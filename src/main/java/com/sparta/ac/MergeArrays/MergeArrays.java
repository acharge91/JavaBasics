package com.sparta.ac.MergeArrays;

import java.util.Arrays;

public class MergeArrays {
    public static void main(String[] args){
        int[] arrayOne = {1, 5, 17, 22, 39, 98};
        int[] arrayTwo = {3, 11, 35, 40, 96};

        System.out.println(Arrays.toString(getMergedArray(arrayOne, arrayTwo)));
    }
    public static int[] getMergedArray(int[] arrayOne, int[] arrayTwo) {
        int[] mergedArray = new int[arrayOne.length + arrayTwo.length];
        int array1Counter = 0;
        int array2Counter = 0;
        int indexCount = 0;

        while (array1Counter < arrayOne.length - 1 || array2Counter < arrayTwo.length - 1) {
            System.out.println(array1Counter);
            System.out.println(array2Counter);
            if (array1Counter < arrayOne.length && arrayOne[array1Counter] < arrayTwo[array2Counter]) {
                mergedArray[indexCount] = arrayOne[array1Counter];
                array1Counter += 1;

            } else {
                mergedArray[indexCount] = arrayTwo[array2Counter];
                array2Counter += 1;
            }
            indexCount += 1;
        }

        if (array1Counter < array2Counter) {
            addFinalArray(arrayOne, mergedArray, array1Counter, indexCount);
        } else if (array2Counter != arrayTwo.length - 1){
            addFinalArray(arrayTwo, mergedArray, array2Counter, indexCount);
        }

        return mergedArray;
    }

    private static void addFinalArray(int[] array, int[] mergedArray, int arrayCounter, int indexCount) {
        for (int i = arrayCounter; i < array.length; i++) {
            mergedArray[indexCount] = array[arrayCounter];
            arrayCounter += 1;
            indexCount += 1;
        }
    }
}
