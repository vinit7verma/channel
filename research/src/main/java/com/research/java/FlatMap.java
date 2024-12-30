package com.research.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String args[]) {
        List<String> l1 = new ArrayList<>();
        l1.add("Rama");
        l1.add("Shyam");
        List<String> l2 = new ArrayList<>();
        l1.add("Sita");
        l1.add("Geeta");
        Set<Character> a = Stream.of(l1, l2).flatMap(list -> list.stream()).map(str -> str.chars().distinct())
                .flatMap(stream -> stream.mapToObj(c -> (char) c)).collect(Collectors.toSet());
        System.out.println(a);

        System.out.println("hello");
    }
}
