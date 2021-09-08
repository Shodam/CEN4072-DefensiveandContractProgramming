package com.company;

import java.util.Stack;

public class ContractStack{
  
  private Stack<Integer> stack;
  
  
  public ContractStack()
  {
    
    stack = new Stack <Integer>();
    
  }
  
  
  
  public void stack_push(int element)
  {
    //Need to check if preconditions are met  
    if (element % 2 != 0)
    {
      System.out.println("This does not meet the precondition");
      System.exit(0);
    }
    
    if (element <= 0)
    {
      System.out.println("This does not meet the precondition");
      System.exit(0);
    }
    
    if (element > 8000)
    {
      System.out.println("This does not meet the precondition");
      System.exit(0);
    }
    
    stack.push(element);
    
    //Post Condition
    if (stack.size() >= 5)
    {
      //Can not push into stack, stack at max capacity
      System.out.println("Stack at Max Capacity");
      System.exit(0);
    }
    
    
    
  }
  
  
  
  public void stack_pop()
  {
    if (stack.size() <= 0)
    {
      
      System.out.println("The stack is empty");
      System.exit(0);
      
    }
    
    stack.pop();
    
  }
  
  
  
  public int stack_peek()
  {
    if (stack.size() <= 0) {
      
      System.out.println("The stack is empty");
      System.exit(0);
      
    }
    
    return stack.peek();
    
  }
  
  
  
  public int stack_search(int element)
  {
    
    return stack.search(element);
    
  }
  
  public void stack_print()
  {
    
    System.out.println(stack);
    
  }

}
