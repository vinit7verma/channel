package com.research.problems;

public class SumOfM {
    public static void main(String[] args) {
        int a[] = {1, 3, 2, 7, 9};
        int sum = 5;
        for (int i = 0; i < a.length; i++) {
            if (i + 1 != a.length) {
                int res = a[i] + a[i + 1];
                if (res == sum) {
                    System.out.println(i + " and " + (i + 1));
                }
            }
        }
    }
}
