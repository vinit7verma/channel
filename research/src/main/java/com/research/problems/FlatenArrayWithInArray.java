package com.research.problems;

import java.util.ArrayList;
import java.util.List;

public class FlatenArrayWithInArray {

    public static void main(String[] args) {
        List<Object> objs = new ArrayList<>();
        objs.add(1);
        objs.add("q");
        objs.add('s');
        List<Object> objs1 = new ArrayList<>();
        objs1.add(2);
        objs1.add("t");
        objs1.add('u');
        List<Object> objs2 = new ArrayList<>();
        objs2.add(3);
        objs2.add("u");
        objs2.add('v');
        objs1.add(objs2);
        objs.add(objs1);
        objs.add(4);
        objs.add("a");
        objs.add('b');
        System.out.println(objs);
        List<Object> flatList = new ArrayList<>();
        flatTheArray(flatList, objs);
        System.out.println(flatList);
    }

    private static void flatTheArray(List<Object> flatList, List<Object> innerList) {
        for (Object obj : innerList) {
            if (obj instanceof List) {
                List<Object> list = (List<Object>) obj;
                flatTheArray(flatList, list);
            } else {
                flatList.add(obj);
            }
        }
    }
}
