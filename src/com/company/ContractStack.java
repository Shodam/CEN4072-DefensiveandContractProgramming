package com.company;

import java.io.*;
import java.util.*;
import java.util.Stack;

public class ContractStack<I extends Number> {
  
  private static int size;
  private static Stack <Integer> stack;
  
  static void stack_push(Stack <Integer> stack)
  {
    //stack.push();
    //need to check preconditions are met
    if (size >= 5)
    {
      //Can not push into stack
      exit(0);
    }
    for (int i = 0; i < size; i++)
    {
      if (stack.get(i) = NULL)
      {
        System.out.println("An element in the does not meet the precondition");
        exit(0);
      }
    }
    stack.push();
    size++;
  }
  
  static void stack_pop(Stack <Integer> stack)
  {
    if (size <= 0){
      
      exit(0);
      
    }
    size--;
    stack.pop();
    
  }
  
  static void stack_peek(Stack <Integer> stack)
  {
    if (size <= 0) {
      
      exit(0);
      
    }
    stack.peek();
  }
  
  static void stack_search(int element)
  {
    
    stack.search(element);
    
  }

}
