package com.research.problems;

public class MergeTwoSortedList {
    public static void main(String... args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2, node1);
        ListNode node3 = new ListNode(3, node2);
        ListNode temp = null;
        while (node1.next != null) {
            temp = node1.next;
            System.out.println(temp.val);
        }
        int i = 010;
        System.out.println(i);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5, node4);
        ListNode node6 = new ListNode(6, node5);

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}