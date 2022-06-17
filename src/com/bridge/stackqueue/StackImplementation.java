package com.bridge.stackqueue;

public class StackImplementation <T> implements IStack<T> {
    LinkedList<T> list = new LinkedList<>();

    @Override
    public void push(T data) {
        list.add(data);
    }

    @Override
    public int pop() {
       return  list.pop();
    }

    @Override
    public int peak() {
        return (int) list.top.data;
    }

    @Override
    public String toString() {
        return "StackImplementation{" + list +
                '}';
    }
}
