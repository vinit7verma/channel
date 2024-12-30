package com.concept.problems;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1 && arr[i] + 1 != arr[i + 1]) {
                System.out.println(arr[i] + 1);
            }
        }
    }
}
