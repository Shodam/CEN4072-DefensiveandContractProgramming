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
      
      switch(userInput)
      {
      	case 1:
      		exit = true;
      		break;
      	case 2:
      		System.out.print("Enter a value: ");
      		userInput = scnr.nextInt();
        	stack.stack_push(userInput);
      		break;
      	case 3:
      		stack.stack_pop();
      		break;
      	case 4:
      		System.out.println(stack.stack_peek());
      		break;
      	case 5:
      		System.out.print("Enter a value: ");
            userInput = scnr.nextInt();
            System.out.println(stack.stack_search(userInput));
      		break;
      	case 6:
      		stack.stack_print();
      		break;
      	default:
      		System.out.println("Invalid Choice");
    		break;
      
      }      
    }
    stack.stack_print();    
  }
  
}
