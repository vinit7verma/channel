package com.concept.problems;

import java.util.*;
import java.util.stream.IntStream;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        //System.out.println(Arrays.toString(twoSum(nums, 7)));
        System.out.println(Arrays.toString(findTwoSum(nums, 7)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] res = IntStream.range(0, nums.length).mapToObj(i -> {
            List<Integer> res1 = new ArrayList<>();
            IntStream.range(i + 1, nums.length).filter(j -> nums[i] + nums[j] == target).forEach(k -> {
                res1.add(i);
                res1.add(k);
            });
            return res1;
        }).filter(list -> !list.isEmpty()).flatMap(List::stream).mapToInt(m -> m).toArray();
        return res;
    }

    private static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            } else {
                numMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
