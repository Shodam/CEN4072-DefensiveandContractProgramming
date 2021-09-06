package com.company;

import java.io.*;
import java.util.*;

public class ContractStack
{
  
  static void stack_push(Stack <Integer> stack)
  {
    stack.push();
  }
  
  static void stack_pop(Stack <Integer> stack)
  {
    stack.pop();
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
