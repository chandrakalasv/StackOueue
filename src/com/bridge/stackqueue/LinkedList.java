package com.bridge.stackqueue;

public class LinkedList<T> {
    Node top;

    public void add(T data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
            return;
        }
        while (newNode.next != null) {
            newNode = newNode.next;
        }
        newNode.next = top;
        top = newNode;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "top=" + top +
                '}';
    }
}
