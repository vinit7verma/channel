package com.research.java;

public class LinkedListTest<T> {
    private Node<T> head;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void add(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        size++;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Additional methods like remove, get, insertAtIndex, etc. can be implemented here
}

class MainTest {
    public static void main(String[] args) {
        LinkedListTest<Integer> myList = new LinkedListTest<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);

        System.out.println("Size of the list: " + myList.size());
        System.out.println("Is the list empty? " + myList.isEmpty());
        myList.display();
    }
}
