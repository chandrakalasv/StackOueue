package com.bridge.stackqueue;

public class QueueMain {
    public static void main(String[] args) {
        IQueue<Integer> list = new QueueImplementation<>();
        list.enqueue(56);
        list.enqueue(30);
        list.enqueue(70);
        System.out.println(list);
    }
}
