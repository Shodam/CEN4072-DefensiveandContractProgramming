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
     * Precondition: Int cannot be negative
     * Postcondition: The integer x is added to the top of the stack
     * Postcondition: The size of the stack is increased by one
     */
    public int stack_push(int x)
    {
        if(stack.size() >= CAPACITY || x < 0) {
            return -1;
        }

        return stack.push(x);
    }

    /**
     * Precondition: Stack must not be empty
     * Postcondition: The element at the top the of stack is removed
     * Postcondition: The size of the stack is decreased by one
     */
    public int stack_pop()
    {
        if(stack.size() <= 0) {
            return -1;
        }

        return stack.pop();

    }

    /**
     * Precondition: Stack must not be empty
     * PostCondition: Stack remains unmodified
     */
    public int stack_peek()
    {
        if(stack.size() <= 0) {
            return -1;
        }

        return stack.peek();
    }

    /**
     * Precondition: Stack must not be empty
     * PostCondition: Stack remains unmodified
     */
    public int stack_search(int element)
    {
        return stack.search(element);
    }

}
