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
      else {
        System.out.println("Invalid Choice");
      }
      
    }
    
    
    
    
    
    //ContractStack <Integer> stack = new ContractStack <Integer>();
    
  }
  
}
