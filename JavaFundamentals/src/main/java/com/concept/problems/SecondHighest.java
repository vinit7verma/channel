package com.concept.problems;

public class SecondHighest {
    public static int second(int[] arr) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 3, 7, 6, 8, 9, 7, 6, 5, 11, 10};
        int result = second(arr);
        System.out.println(result);
    }
}
