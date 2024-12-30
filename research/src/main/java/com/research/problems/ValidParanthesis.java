package com.research.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String input = "{}([])";
        Map<String, String> paraMap = new HashMap<>();
        paraMap.put("(", ")");
        paraMap.put("{", "}");
        paraMap.put("[", "]");
        Stack<String> parantStack = new Stack<>();
        String[] strs = input.split("");
        boolean isValidPara = false;
        for (String str : strs) {
            if (parantStack.isEmpty() && !paraMap.containsKey(str)) {
                isValidPara = false;
                break;
            }
            if (paraMap.containsKey(str)) {
                parantStack.push(str);
            } else {
                String lastItem = parantStack.pop();
                if (paraMap.get(lastItem).equals(str)) {
                    isValidPara = true;
                }
            }
        }
        if (!parantStack.isEmpty()) {
            isValidPara = false;
        }
        System.out.println(isValidPara);
    }
}
