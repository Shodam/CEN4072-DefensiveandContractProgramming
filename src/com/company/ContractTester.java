package com.company;

import java.util.Scanner;

public class ContractTester
{
  
  public static void main (String[] args)
  {
    ContractStack stack = new ContractStack();
    Scanner scnr = new Scanner(System.in);
    int userInput;
    boolean exit = false;
    
    while (!exit)
    {
      System.out.println("Would you like to");
      System.out.println("\t(1) Exit");
      System.out.println("\t(2) Enter Value to Stack");
      System.out.println("\t(3) Pop top of Stack");
      System.out.println("\t(4) Peek top of Stack");
      System.out.println("\t(5) Search for element in stack");
      System.out.println("\t(6) Print Stack");
      
      
      System.out.print(": ");
      userInput = scnr.nextInt();
      System.out.println();
      
      if (userInput == 1)
      {
        exit = true;
      }
      
      else if (userInput == 2)
      {
        System.out.print("Enter a value: ");
        userInput = scnr.nextInt();
        stack.stack_push(userInput);
      }
      
      else if (userInput == 3)
      {
        stack.stack_pop();
      }
      
      else if (userInput == 4)
      {
        System.out.println(stack.stack_peek());
      }
      
      else if (userInput == 5)
      {
        System.out.print("Enter a value: ");
        userInput = scnr.nextInt();
        stack.stack_search(userInput);
      }
      
      else if (userInput == 6)
      {
        stack.stack_print();
      }
      
      else {
        System.out.println("Invalid Choice");
      }
      
    }
    stack.stack_print();
    
    
    
    
    //ContractStack <Integer> stack = new ContractStack <Integer>();
    
  }
  
}
