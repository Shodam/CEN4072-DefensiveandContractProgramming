package com.company;

import java.io.*;
import java.util.*;
import java.util.Stack;

public class ContractStack<I extends Number> {
  
  private static Stack <Integer> stack;
  
  
  public ContractStack()
  {
    
    stack = new Stack <Integer>();
    
  }
  
  
  
  static void stack_push(int element)
  {
    //stack.push();
    //need to check preconditions are met
    if (stack.size() >= 5)
    {
      //Can not push into stack, stack at max capacity
      System.exit(0);
      
    }
    /**
    if (element == null)
    {
      System.out.println("This element does not meet the precondition");
      System.exit(0);
    }
     */
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
    stack.push(element);
    
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
  
  
  
  static void stack_search(int element)
  {
    
    stack.search(element);
    
  }

}
