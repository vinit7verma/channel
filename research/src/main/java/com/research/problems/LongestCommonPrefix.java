package com.research.problems;

import java.util.List;
import java.util.stream.Stream;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        List<String> list = List.of("flower", "flow", "flight");
        longestCommonPrefix(list.toArray(new String[0]));
    }

    public static String longestCommonPrefix(String[] strs) {
        Stream.of(strs).forEach(str -> {

        });
        return "";
    }
}
