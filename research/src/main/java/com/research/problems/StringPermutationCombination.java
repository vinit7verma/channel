package com.research.problems;

public class StringPermutationCombination {
    public static void main(String[] args) {
        String str = "abcd";
        int n = str.length();
        System.out.println("Permutations:");
        permute(str, 0, n - 1);
        System.out.println("\nCombinations:");
        combine(str, 0, "");
    }

    private static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    private static void combine(String str, int index, String current) {
        if (index == str.length()) {
            System.out.println(current);
        } else {
            combine(str, index + 1, current + str.charAt(index));
            combine(str, index + 1, current);
        }
    }

    private static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
