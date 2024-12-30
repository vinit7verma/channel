package com.research.problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringSortByDesc {

    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("Vinit");
        input.add("Sandeep");
        input.add("Verma");
        input.add("yoyo");
        Collections.sort(input, new DescComparataor());
        System.out.println(input);
    }

}

class DescComparataor implements Comparator<String> {
    public int compare(String s1, String s2) {
        if (s1.compareTo(s2) > 0) {
            return -1;
        } else if (s1.compareTo(s2) < 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
