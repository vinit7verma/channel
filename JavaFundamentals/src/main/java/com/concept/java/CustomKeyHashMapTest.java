package com.concept.java;

import lombok.Getter;

import java.util.*;

public class CustomKeyHashMapTest {

    public static void main(String[] args) {
        Map<Employeee, Employeee> testMap = new TreeMap<>();
        final Employeee e1 = new Employeee(1, "vinit");
        Employeee e2 = new Employeee(2, "vinit");
        Comparator<Employeee> empIdComp = (e3, e4) -> Integer.compare(e1.getId(), e2.getId());
        List<Employeee> l1 = new ArrayList<>();
        l1.sort(empIdComp);
        System.out.println(l1);
        e1.hello();
        Common.staticHello();
        System.out.println(e2.hashCode());
        try {
            Set<Employeee> set = new TreeSet<>();
            set.add(e1);
            testMap.put(e1, e1);
            testMap.put(e2, e1);
        } catch (Exception exp) {
            System.out.println(exp.getMessage());
        }
        System.out.println(testMap);
    }
}

interface Common {
    default void hello() {
        System.out.println("hello common");
    }

    static void staticHello() {
        System.out.println("static hello common");
    }
}

interface Common1 {
    default void hello() {
        System.out.println("hello common1");
    }
}

@Getter
class Employeee implements Common, Comparable<Employeee> {
    private Integer id;
    private String name;

    Employeee(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override equals() method to compare CustomKey objects
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || this.getClass() != o.getClass())
            return false;
        Employeee customKey = (Employeee) o;
        return id == customKey.id && name.equals(customKey.name);
    }

    // Override hashCode() method to generate hash code for CustomKey objects
    @Override
    public int hashCode() {
        int result = id;
        int hash = 7;
        for (int i = 0; i < name.length(); i++) {
            hash += name.charAt(0);
        }
        result = 31 * result + hash;
        return result;
    }

    @Override
    public int compareTo(Employeee o) {
        return this.id - o.id;
    }
}