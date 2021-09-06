package com.company;

public class ContractStack
{
    private final int CAPACITY = 5;
    private int size;
    private int[] stack;

    public ContractStack() {
        stack = new int[CAPACITY];
        size = 0;
    }

    public void push(int x) {
        stack[size] = x;
        ++size;
    }

    public void pop() {
        --size;
    }

    public int peek() {
        return stack[size - 1];
    }
}
