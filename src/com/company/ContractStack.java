package com.company;

import java.io.*;
import java.util.*;

public class ContractStack
{
  private int size;
  
  static void stack_push(Stack <Integer> stack)
  {
    stack.push();
    size++;
  }
  
  static void stack_pop(Stack <Integer> stack)
  {
    stack.pop();
    size--;
  }
  
  static void stack_peek(Stack <Integer> stack)
  {
    stack.peek();
  }
  
  static void stack_search(Stack <Integer> stack, int element)
  {
    Integer pos = (Integer) stack.search(element);
    
  }

}
