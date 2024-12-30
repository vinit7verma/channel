package com.research.java;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.*;
import java.util.stream.Collectors;

public class GroupMap {

    public static void main(String[] args) {
        List<Employee> l1 = new ArrayList<>();
        l1.add(new Employee("1", "vinit", new Department("IT", "SOFTWARE")));
        l1.add(new Employee("2", "astha", new Department("IT", "SOFTWARE")));
        l1.add(new Employee("3", "saanvi", new Department("CHILD", "SOFTWARE")));
        //Set<String> unique = new HashSet<>();
        //l1.removeIf(obj -> !unique.add(obj.getDept().getDeptName()));
        Map<String, List<String>> l2 = l1.stream().collect(Collectors.groupingBy(emp -> emp.getDept()
                .getDeptName(), Collectors.collectingAndThen(Collectors.toList(), list -> list.stream()
                .map(em -> em.getEmpName()).collect(Collectors.toList()))));
        System.out.println(l2);
        Optional<Integer> a = l1.parallelStream().map(obj -> Integer.parseInt(obj.getEmpId())).max(Comparator.naturalOrder());
        System.out.println(a);
        TreeSet<Employee> emps = new TreeSet<>();
        try {
            emps.add(new Employee("1", "vinit", new Department("IT", "SOFTWARE")));
            emps.add(new Employee("2", "vinit", new Department("IT", "SOFTWARE")));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println(emps);
    }
}

@NoArgsConstructor
@AllArgsConstructor
@Getter
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(doNotUseGetters = true)
@ToString
@JsonInclude(JsonInclude.Include.NON_EMPTY)
class Employee {
    private String empId;
    private String empName;
    private Department dept;
}


@NoArgsConstructor
@AllArgsConstructor
@Getter
@SuperBuilder(toBuilder = true)
@EqualsAndHashCode(doNotUseGetters = true)
@ToString
@JsonInclude(JsonInclude.Include.NON_EMPTY)
class Department {
    private String deptName;
    private String deptGrp;
}