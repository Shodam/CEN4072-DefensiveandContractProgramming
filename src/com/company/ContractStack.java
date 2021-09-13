package com.company;

import java.util.Stack;
import java.util.EmptyStackException;
import java.io.IOException;



public class ContractStack{
  
  private final int CAPACITY = 5;
  private Stack<Integer> stack;
  
  
  public ContractStack()
  {
    
    stack = new Stack <Integer>();
    
  }
  
  
  public void stack_push(int element)
  {
    
    stack.push(element);
    
    if (stack.size() > CAPACITY)
    {
      stack.pop();
      throw new IOException();
    }
    
    
  }
  
  
  //Option to pop top of stack
  public void stack_pop()
  {
    //If the stack is empty impossible to pop
    if (stack.size() <= 0)
    {
     	throw new EmptyStackException(); 
    }
    
    stack.pop();
    
  }
  
  
  //Peek top of the stack
  public int stack_peek()
  {
    //stack is empty cant peek
    if (stack.size() <= 0) 
    {
      throw new EmptyStackException();
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
  
  
  public boolean isFull()
  {
  	if(stack.size() >= CAPACITY)
	{
		return true;
	}
	return false;
  }
  
  
  
  public boolean isEmpty()
  {
	  if(stack.size() == 0)
	  {
		  return true;
	  }
	  return false;
  }

}
