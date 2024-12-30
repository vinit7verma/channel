package com.concept.problems;

public class SubstringCount {
    public static void main(String[] args) {
        String input = "abcd";
        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                System.out.println(input.substring(i, j));
                count++;
            }
        }

        System.out.println("Total Substrings: " + count);
    }
}
