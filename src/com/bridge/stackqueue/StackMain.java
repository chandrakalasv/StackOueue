package com.bridge.stackqueue;

public class StackMain {
    public static void main(String[] args) {
        System.out.println("stack and queue implementation");
        IStack<Integer> stack = new StackImplementation<>();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.pop();
        System.out.println(stack);
    }
}
