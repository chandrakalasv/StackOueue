package com.bridge.stackqueue;

public class StackImplementation <T> implements IStack<T> {
    LinkedList<T> list = new LinkedList<>();

    @Override
    public void push(T data) {
        list.add(data);
    }

    @Override
    public void pop() {
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
        return "StackImplementation{" + list +
                '}';
    }
}
