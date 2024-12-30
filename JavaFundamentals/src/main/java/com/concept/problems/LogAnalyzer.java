package com.concept.problems;

import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LogAnalyzer {
    public static void main(String[] args) {
        // Sample log entries
        String[] logs = {
                "192.168.0.1 10:00:01",
                "192.168.0.2 10:00:02",
                "192.168.0.1 10:00:03",
                "192.168.0.3 10:00:04",
                "192.168.0.2 10:00:06",
                "192.168.0.2 10:00:07"
        };
        String b = Stream.of(logs).map(line -> line.split(" ")[0]).collect(Collectors.groupingBy(
                        Function.identity(), Collectors.counting())).entrySet().stream().
                max(Comparator.comparing(entry -> entry.getValue())).get().getKey();
        System.out.println(b);
    }
}

