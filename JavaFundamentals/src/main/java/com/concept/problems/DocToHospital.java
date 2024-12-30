package com.concept.problems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DocToHospital {
    public static int solve(int[][] A) {
        int op = 0;
        Map<Integer, Set> docToHosp = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                int key = A[i][j];
                Set set = docToHosp.get(key);
                if (set == null) {
                    Set newSet = new HashSet<>();
                    newSet.add(i);
                    docToHosp.put(key, newSet);
                } else {
                    set.add(i);
                    docToHosp.put(key, set);
                }
            }
        }
        for (Map.Entry<Integer, Set> entry : docToHosp.entrySet()) {
            if (entry.getValue().size() > 1) {
                op++;
            }
        }
        return op;
    }

    public static void main(String[] args) {
        int[][] A = {{4, 3}, {5, 5}, {6, 2}};
        System.out.println(solve(A));
    }
}
