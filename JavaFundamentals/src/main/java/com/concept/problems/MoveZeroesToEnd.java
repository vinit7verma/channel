package com.concept.problems;

import java.util.Arrays;

public class MoveZeroesToEnd {

    public static void main(String[] args) {
        int input[] = {1, 0, 3, 4, 0, 6};
        int output[] = new int[input.length];
        int counter = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] != 0) {
                output[counter] = input[i];
                counter++;
            }
        }
        System.out.println(Arrays.toString(output));
    }
}
