package com.concept.problems;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        List<IntStream> res = Stream.of(x).map(s -> s.toString().chars()).collect(Collectors.toList());
        if (int.class == Integer.class) {
            return true;
        }
        System.out.println(res);
        return false;
    }

    public static void main(String[] args) {
        isPalindrome(10201);
    }
}
