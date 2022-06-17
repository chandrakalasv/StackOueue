package com.bridge.stackqueue;

public class QueueImplementation<T> implements IQueue<T> {
    Node front, rear;

    @Override
    public void enqueue(T data) {
        Node newQueue = new Node(data);
        if (rear == null) {
            front = rear = newQueue;
            return;
        }
        rear.next = newQueue;
        rear = newQueue;
    }

    @Override
    public int dequeue() {
        Node temp = front;
        front = temp.next;
        return (int) temp.data;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", rear=" + rear +
                '}';
    }
}
