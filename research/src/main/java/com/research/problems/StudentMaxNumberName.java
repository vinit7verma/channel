package com.research.problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


class Student {
    String name;
    Integer marks;

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

public class StudentMaxNumberName {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Student student = new Student();
        student.setName("Vinit");
        student.setMarks(90);
        Student student1 = new Student();
        student1.setName("John");
        student1.setMarks(80);
        students.add(student);
        students.add(student1);
        String name = students.stream().max(Comparator.comparingInt(Student::getMarks)).get().getName();
        System.out.println(name);
    }
}
