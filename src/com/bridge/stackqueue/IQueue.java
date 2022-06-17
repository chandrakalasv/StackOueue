package com.bridge.stackqueue;

public interface IQueue<T> {
    void enqueue(T data);
    void dequeue();
}
