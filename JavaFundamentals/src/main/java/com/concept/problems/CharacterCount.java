package com.concept.problems;

public class CharacterCount {
    public static void main(String[] args) {
        String input = "aaahhcccddaah";
        String output = "";
        int count = 1;

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                output += input.charAt(i) + "" + count;
                count = 1;
            }
        }
        output += input.charAt(input.length() - 1) + "" + count;
        System.out.println(output);
    }
}
