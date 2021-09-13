package com.company;

import java.util.Scanner;
import java.io.IOException;

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
      /*
      
        Prints are ONLY for Testing Purposes
      
      */
      System.out.println("Would you like to");
      System.out.println("\t(1) Exit");
      System.out.println("\t(2) Enter Value to Stack");
      System.out.println("\t(3) Pop top of Stack");
      System.out.println("\t(4) Peek top of Stack");
      System.out.println("\t(5) Search for element in stack");
      System.out.println("\t(6) Print Stack");
      System.out.println("\t(7) Is Full");
      System.out.println("\t(8) Is Empty");
      
      
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
          //Need to check if preconditions are met
          //Element to push is even
          if (userInput % 2 != 0)
          }
              throw new IOException();
          }
          //Less than equal to 8000
          if (userInput > 8000)
          {
              throw new IOException();
          }

	  //Greater than 0
	  if (userInput <= 0)
          {
              throw new IOException();
          }
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
          if (stack.stack_search(userInput) > 0)
          {
            System.out.println(userInput + " is in the stack, in position " + stack.stack_search(userInput));
          }
      		break;
          
    
    
    
      	case 6:
      		stack.stack_print();
      		break;
          
    
    
    
        case 7:
          stack.isFull();
    
    
        case 8:
          stack.isEmpty();
    
    
    
      	default:
      		System.out.println("Invalid Choice");
    		  break;
      
      }      
    }
    stack.stack_print();    
    scnr.close();
  }
  
}
