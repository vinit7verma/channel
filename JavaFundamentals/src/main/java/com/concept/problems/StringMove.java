package com.concept.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMove {
    public static List<Integer> KMP(StringBuilder s) {
        int n = s.length();
        Integer[] temp = new Integer[n];
        Arrays.fill(temp, 0);
        List<Integer> pi = Arrays.asList(temp);
        for (int i = 1; i < n; i++) {
            int j = pi.get(i - 1);
            if (s.charAt(i) == s.charAt(j)) {
                pi.set(i, j + 1);
            } else {
                while (j > 0 && s.charAt(i) != s.charAt(j)) {
                    j = pi.get(j - 1);
                }

                if (s.charAt(i) == s.charAt(j)) {
                    pi.set(i, j + 1);
                } else {
                    pi.set(i, 0);
                }
            }
        }
        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            if (i + 1 - pi.get(i) == pi.get(i)) {
                res.add(pi.get(i));
            }
        }
        return res;
    }

    public static int solve(int i, int n, int[] dp, List<List<Integer>> arr) {
        if (i >= n)
            return 0;
        if (arr.get(i).size() == 0)
            return 1;
        if (dp[i] != -1)
            return dp[i];
        int res = 0;
        for (int jump : arr.get(i)) {
            res = Math.max(res, 1 + solve(i + jump, n, dp, arr));
        }
        return dp[i] = res;
    }

    public static int solution(String s) {
        List<List<Integer>> arr = new ArrayList<>();
        int n = s.length();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        for (int i = 0; i < n; i++) {
            StringBuilder sub = new StringBuilder(s.substring(i));
            arr.add(KMP(sub));
        }
        return solve(0, n, dp, arr);
    }


    public static void main(String[] args) {

        System.out.println(solution("NAABXXAN"));
    }
}
