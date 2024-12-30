package com.research.database;

import com.google.common.primitives.Chars;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        String contents = "gfdskjlgfsajklvsdjkl34432";
        String approved = "abcde";
        String results = process(contents, approved);
        System.out.println("results --> " + results);
    }

    private static String process(String contents, String approved) {
        char[] input = contents.toCharArray();
        StringBuilder output = new StringBuilder();
        List<Character> approvedList = Chars.asList(approved.toCharArray());
        for (char ch : input) {
            if (approvedList.contains(ch)) {
                output.append(ch);
            }
        }
        return output.toString();
    }
}
