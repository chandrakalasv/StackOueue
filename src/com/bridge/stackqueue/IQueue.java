package com.bridge.stackqueue;

public interface IQueue<T> {
    void enqueue(T data);
    int dequeue();
}
