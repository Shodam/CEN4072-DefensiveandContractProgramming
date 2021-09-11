package com.company;

import java.util.Stack;

public class DefensiveStack
{
    private final int CAPACITY = 5;
    private Stack<Integer> stack;

    public DefensiveStack() {
        stack = new Stack<Integer>();
    }

    /**
     * Adds an int to the top of the stack
     * @param x The integer to be pushed
     * @return -1 if failed, the passed arguments otherwise
     * Precondition: an integer must be passed as an argument
     * Postcondition: The stack is not at capacity
     * Postcondition: x cannot be negative
     * Postcondition: returns an int
     */
    public int stack_push(int x)
    {
    	//Checks for nonegative integer
    	//Checks stack is not at capacity
        if(stack.size() >= CAPACITY || x < 0) {
            return -1;
        }

        return stack.push(x);
    }

    /**
     * Removes integer at the top of 
     * @return -1 if failed, the popped value otherwise
     * Postcondition: returns an int
     * Postcondition: Will not attempt to pop an empty stack
     */
    public int stack_pop()
    {
        if(stack.size() <= 0) {
            return -1;
        }

        return stack.pop();

    }

    /**
     * Gets the value at the top of the stack
     * @return -1 if failed, the top of the stack otherwise
     * Postcondition returns an int
     * Postcondition will not peek an empty stack
     */
    public int stack_peek()
    {
        if(stack.size() <= 0) {
            return -1;
        }

        return stack.peek();
    }

    /**
     * Gets the index of a an element
     * @param element the int to search for
     * @return -1 if failed, the index of the element otherwise
     */
    public int stack_search(int element)
    {
        return stack.search(element);
    }
    
    public boolean isFull()
    {
    	return (stack.size() >= CAPACITY);
    }

}
