package com.company;

import java.util.*;

public class DefensiveStack
{
    private Stack<Integer> stack;
    
    public DefensiveStack() {
        stack = new Stack<Integer>();
    }
    
    public void stack_push(int x)
    {
        stack.push(x);
    }

    public void stack_pop()
    {
        stack.pop();
    }

    public int stack_peek()
    {
        return stack.peek();
    }

    public int stack_search(int element)
    {
        return stack.search(element);
    }

}
