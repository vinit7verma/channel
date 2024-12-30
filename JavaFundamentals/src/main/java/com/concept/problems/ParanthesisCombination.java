package com.concept.problems;

public class ParanthesisCombination {
    public static void main(String[] args) {
        int input = 10;
        StringBuilder combination1;
        StringBuilder combination2;
        for (int i = 0; i < input; i++) {
            combination1 = new StringBuilder();
            combination1.append(getInitialCombinations(i));
            combination1.append(getCombinations(input - i));

            combination2 = new StringBuilder();
            combination2.append(getCombinations(input - i));
            combination2.append(getInitialCombinations(i));
            System.out.println(combination1);
            System.out.println(combination2);
        }
    }

    static StringBuilder getCombinations(int n) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder1.append("{");
            stringBuilder2.append("}");
        }
        return new StringBuilder().append(stringBuilder1).append(stringBuilder2);
    }

    static StringBuilder getInitialCombinations(int n) {
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stringBuilder1.append("{").append("}");
        }
        return stringBuilder1;
    }

}
