/*Given a string s, find the length of the longest substring without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.*/
package com.concept.problems;

import java.util.ArrayList;
import java.util.List;

public class LongestSubstring {

  public static void main(String[] args) {
    lengthOfLongestSubstring("abcdabdefghij");
  }

  public static int lengthOfLongestSubstring(String s) {
    String nonRepeatStr = "";
    while (s.length() > 0) {
      for (int i = 1; i <= s.length(); i++) {
        String input = s.substring(0, i);
        nonRepeatStr = getNonRepeatingString(input, nonRepeatStr, i);
      }
      s = s.substring(1);
    }
    System.out.println("non repeating string - " + nonRepeatStr);
    return nonRepeatStr.length();
  }

  public static String getNonRepeatingString(String input, String nonRepeatStr, int j) {
    boolean isNonRepeatStr = false;
    List<Character> list = new ArrayList<>();
    char[] chars = input.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (list.contains(chars[i])) {
        isNonRepeatStr = true;
        break;
      } else {
        list.add(chars[i]);
      }
    }
    if (!isNonRepeatStr && input.length() > nonRepeatStr.length()) {
      nonRepeatStr = input;
    }
    return nonRepeatStr;
  }
}
