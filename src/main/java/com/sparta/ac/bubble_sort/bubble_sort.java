package com.sparta.ac.bubble_sort;


import java.util.Arrays;

public class bubble_sort {
    public static void main( String[] args ) {
        int[] numArray = {22, 88, 64, 42, 2, 35, 73};
        System.out.println(Arrays.toString(numArray));

        for (int number: numArray) {
            for (int y = 0; y < numArray.length - 1; y++) {
                if (numArray[y] > numArray[y+1]) {
                    numArray[y] = (numArray[y] + numArray[y+1]) - (numArray[y+1] = numArray[y]);
                }
            }
        }

        System.out.println(Arrays.toString(numArray));

    }
}
