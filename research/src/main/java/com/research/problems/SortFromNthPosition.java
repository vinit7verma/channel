package com.research.problems;

import java.util.Arrays;

public class SortFromNthPosition {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 7, 1, 6, 4};
        int n = 3;

        int[] firstPart = Arrays.copyOfRange(arr, 0, n);
        int[] secondPart = Arrays.copyOfRange(arr, n, arr.length);

        Arrays.sort(secondPart);

        int[] result = new int[arr.length];
        System.arraycopy(firstPart, 0, result, 0, firstPart.length);
        System.arraycopy(secondPart, 0, result, n, secondPart.length);

        System.out.println(Arrays.toString(result));
    }
}
