package com.company;

import java.util.Stack;

public class ContractStack{
  
  private static Stack <Integer> stack;
  
  
  public ContractStack()
  {
    
    stack = new Stack <Integer>();
    
  }
  
  
  
  static void stack_push(int element)
  {
    //Need to check preconditions are met
     
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
    
    if (element >= 8000)
    {
      System.out.println("This does not meet the precondition");
      System.exit(0);
    }
    
    stack.push(element);
    
    if (stack.size() >= 5)
    {
      //Can not push into stack, stack at max capacity
      System.out.println("Stack at Max Capacity");
      System.exit(0);
    }
    
    
    
  }
  
  
  
  static void stack_pop()
  {
    if (stack.size() <= 0)
    {
      
      System.out.println("The stack is empty");
      System.exit(0);
      
    }
    
    stack.pop();
    
  }
  
  
  
  static void stack_peek()
  {
    if (stack.size() <= 0) {
      
      System.exit(0);
      
    }
    stack.peek();
  }
  
  
  
  static int stack_search(int element)
  {
    
    return stack.search(element);
    
  }

}
