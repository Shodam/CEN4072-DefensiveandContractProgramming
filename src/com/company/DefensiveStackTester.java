package com.company;

import java.util.Scanner;

public class DefensiveStackTester {

    public static void main(String[] args) {
        DefensiveStack stack = new DefensiveStack();
        Scanner input = new Scanner(System.in);
        String userInput;
        int stackNumber;
        int userPeek;
        boolean userActive = true;
        String exitCommand = "exit";
        String removeCommand = "remove";
        String peekCommand = "peek";
        String searchCommand = "search";
        
        while(userActive)
        {
                //System.out.println("Type exit to leave the program, type remove to delete the top of the stack");
                System.out.println("Type: ");
                System.out.println("Exit:\t To stop the program");
                System.out.println("Remove:\t To delete the top of the stack");
                System.out.println("Peek:\t To get int at the top of the stack");
                System.out.println("Search:\t To search for a number in  the stack");
                                   
                System.out.println("\nEnter a number to insert to the stack");
                userInput = input.nextLine();
                Scanner intChecker = new Scanner(userInput.trim());
                if (userInput.equalsIgnoreCase(exitCommand) || userInput.equalsIgnoreCase(removeCommand) || userInput.equalsIgnoreCase(peekCommand)) 
                {
                    if (userInput.equalsIgnoreCase(exitCommand))
                    {//exits user input
                        System.out.println("Thanks! :)");
                        System.out.println("\n");
                        userActive = false;
                    }else if (userInput.equalsIgnoreCase(removeCommand))
                    {//pops from the top of stack
                    	stackNumber = stack.stack_peek();
                        stack.stack_pop();
                        System.out.println("\n");
                    }
                    else if (userInput.equalsIgnoreCase(peekCommand))
                    {//peek on the top of the stack
                    	System.out.println(stack.stack_peek() + " is at the top of the stack");
                    }
                } else if (userInput.equalsIgnoreCase(searchCommand))
                {//searches for an int in the stack
                    System.out.println("What number are you looking for in the stack?");
                    userInput = input.nextLine();
                    stackNumber = Integer.parseInt(userInput);
                    userPeek = stack.stack_search(stackNumber);
                    if (userPeek > 0)
                    {
                        System.out.println(stackNumber + " is in the stack");
                    }
                }
                else if (intChecker.hasNextInt())
                {//Pushes user input to stack
                    stackNumber = Integer.parseInt(userInput);
                    stack.stack_push(stackNumber);
                    System.out.println(stackNumber + " is now in the stack");
                    

                } else
                {
                    System.out.println(userInput + " is an unknown command!");
                    System.out.println("\n");
                }
        }
    }
}
