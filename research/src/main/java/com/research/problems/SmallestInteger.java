package com.research.problems;

import java.util.HashSet;
import java.util.Set;

public class SmallestInteger {
    public static void main(String[] args) {
        int[] A = {-1, -3};
        System.out.println(solution(A));
        System.out.println();
    }

    public static int solution(int[] A) {
        int N = A.length;
        Set<Integer> set = new HashSet<>();
        for (int a : A) {
            if (a > 0) {
                set.add(a);
            }
        }
        for (int i = 1; i <= N + 1; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }
        return 1;
    }
}
