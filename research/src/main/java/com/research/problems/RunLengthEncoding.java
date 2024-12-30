package com.research.problems;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RunLengthEncoding {
    public static void main(String[] args) {
        String input = "wwwwaaadexxxxxx";
        StringBuilder output = new StringBuilder();
        Map<String, Long> a = Arrays.stream(input.split("")).
                collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        a.entrySet().stream().forEach(entry -> output.append(entry.getKey()).
                append(entry.getValue()).toString());
        System.out.println(output);
    }
}
