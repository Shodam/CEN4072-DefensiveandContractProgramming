package com.company;

import java.util.Stack;
import java.util.EmptyStackException;

public class DefensiveStack
{
    private final int CAPACITY = 5;
    private Stack<Integer> stack;

    public DefensiveStack() {
        stack = new Stack<Integer>();
    }

    /**
     * Precondition: Stack must not be at capacity
     * Postcondition: The integer x is added to the top of the stack
     * Postcondition: The size of the stack is increased by one
     */
    public void stack_push(int x)
    {
        if(stack.size() >= CAPACITY) {
            throw new IndexOutOfBoundsException("Capacity of Stack is " + CAPACITY);
        }

        stack.push(x);
    }

    /**
     * Precondition: Stack must not be empty
     * Postcondition: The element at the top the of stack is removed
     * Postcondition: The size of the stack is decreased by one
     */
    public void stack_pop()
    {
        if(stack.size() <= 0) {
            throw new EmptyStackException();
        }

        stack.pop();
    }

    /**
     * Precondition: Stack must not be empty
     * PostCondition: Stack remains unmodified
     */
    public int stack_peek()
    {
        if(stack.size() <= 0) {
            throw new EmptyStackException();
        }

        return stack.peek();
    }

    /**
     * Precondition: Stack must not be empty
     * PostCondition: Stack remains unmodified
     */
    public int stack_search(int element)
    {
        if(stack.size() <= 0) {
            throw new EmptyStackException();
        }

        return stack.search(element);
    }

}
