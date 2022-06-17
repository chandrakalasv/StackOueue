package com.bridge.stackqueue;

public class QueueImplementation<T> implements IQueue<T> {

    LinkedList<T> list = new LinkedList<>();

    @Override
    public void enqueue(T data) {
        list.append(data);
    }

    @Override
    public void dequeue() {
        while(list.size() > 0) {
            peak();
            list.pop();
        }
    }
    void peak(){
        System.out.println(list.top.data);
    }

    @Override
    public String toString() {
        return "QueueImplementation{" + list +
                '}';
    }
}
