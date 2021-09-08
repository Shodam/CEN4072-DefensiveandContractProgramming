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
    //Element to push is even
    if (element % 2 != 0)
    {
      System.out.println("This does not meet the precondition");
      System.exit(0);
    }
    //Greater than 0
    if (element <= 0)
    {
      System.out.println("This does not meet the precondition");
      System.exit(0);
    }
    //Less than equal to 8000
    if (element > 8000)
    {
      System.out.println("This does not meet the precondition");
      System.exit(0);
    }
    
    stack.push(element);
    
    //Post Condition
    //The stack doesnt go over size
    if (stack.size() >= 5)
    {
      //Can not push into stack, stack at max capacity
      System.out.println("Stack at Max Capacity");
      System.exit(0);
    }
    
    
    
  }
  
  
  //Option to pop top of stack
  public void stack_pop()
  {
    //If the stack is empty kill program
    if (stack.size() <= 0)
    {
      
      System.out.println("The stack is empty");
      System.exit(0);
      
    }
    
    stack.pop();
    
  }
  
  
  //Peek top of the stack
  public int stack_peek()
  {
    if (stack.size() <= 0) {
      
      System.out.println("The stack is empty");
      System.exit(0);
      
    }
    
    return stack.peek();
    
  }
  
  
  //Search for the location of the element, and check if in the stack
  public int stack_search(int element)
  {
    
    return stack.search(element);
    
  }
  
  //Print the stack
  public void stack_print()
  {
    
    System.out.println(stack);
    
  }

}
