package com.research.problems;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] input = {3, 4, 1, 2, 6};
        int[] output = new int[input.length];
        int index = 2;
        int[] list1 = new int[index];
        int[] list2 = new int[input.length - index];
        System.arraycopy(input, 0, list1, 0, index);
        System.arraycopy(input, index, list2, 0, input.length - index);
        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[i] < input[j]) {
                    int max = input[i];
                    input[i] = input[j];
                    input[j] = max;
                }
            }
        }
        for (int a : input) {
            System.out.println(a);
        }
    }
}
