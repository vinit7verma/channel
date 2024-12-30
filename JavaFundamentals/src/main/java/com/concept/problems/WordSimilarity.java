package com.concept.problems;

import java.util.ArrayList;
import java.util.List;

public class WordSimilarity {

    public static List<String> findSimilarWords(String word, List<String> wordList) {
        List<String> similarWords = new ArrayList<>();
        int minDistance = Integer.MAX_VALUE;

        for (String w : wordList) {
            int distance = calculateLevenshteinDistance(word, w);

            if (distance < minDistance) {
                minDistance = distance;
                similarWords.clear();
                similarWords.add(w);
            } else if (distance == minDistance) {
                similarWords.add(w);
            }
        }

        return similarWords;
    }

    public static int calculateLevenshteinDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            dp[i][0] = i;
        }

        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    int substitutionCost = dp[i - 1][j - 1] + 1;
                    int deletionCost = dp[i - 1][j] + 1;
                    int insertionCost = dp[i][j - 1] + 1;
                    dp[i][j] = Math.min(substitutionCost, Math.min(deletionCost, insertionCost));
                }
            }
        }

        return dp[m][n];
    }

    public static void main(String[] args) {
        String givenWord = "apple";
        List<String> dictionary = List.of("ape", "apples", "orange", "application", "banana");

        List<String> similarWords = findSimilarWords(givenWord, dictionary);

        System.out.println(similarWords);
    }
}

