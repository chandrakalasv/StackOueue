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

    public int pop() {
        Node temp = top;
        top = temp.next;
        return (int) temp.data;
    }

    public int size() {
      Node temp=top;
        int count = 0;
        while(temp!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }
    public void append(T data) {
        Node newNode = new Node(data);
        if (top == null) {
            top = newNode;
            return;
        }
        Node temp = top;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    @Override
    public String toString() {
        return "top=" + top +
                '}';
    }
}
