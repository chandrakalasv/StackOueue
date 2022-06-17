package com.bridge.stackqueue;

public class QueueImplementation<T> implements IQueue<T> {

    LinkedList<T> list = new LinkedList<>();

    @Override
    public void enqueue(T data) {
        list.append(data);
    }

    @Override
    public String toString() {
        return "QueueImplementation{" + list +
                '}';
    }
}
