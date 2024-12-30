package com.concept.java;

import java.util.ArrayList;
import java.util.List;

public final class ImmutablePerson {
    private final String name;
    private final int age;
    private final List<String> hobbies;

    public ImmutablePerson(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = new ArrayList<>(hobbies); // Create a defensive copy
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<String> getHobbies() {
        return new ArrayList<>(hobbies); // Return a defensive copy
    }
}

class TestImmutable {
    public static void main(String[] args) {
        ImmutablePerson obj = new ImmutablePerson("vinit", 33, new ArrayList<>());
        System.out.println(obj.getName());
        obj = new ImmutablePerson("ashu", 33, new ArrayList<>());
        System.out.println(obj.getName());
    }

}
