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
                System.out.println("Type exit to leave the program, type delete to remove the top of the stack, type ");
                System.out.println("Enter a number to insert to the stack");
                userInput = input.nextLine();
                Scanner intChecker = new Scanner(userInput.trim());
                if (userInput.equalsIgnoreCase(exitCommand) || userInput.equalsIgnoreCase(removeCommand) || userInput.equalsIgnoreCase(peekCommand)) {
                    if (userInput.equalsIgnoreCase(exitCommand))
                    {
                        System.out.println("Thanks! :)");
                        System.out.println("\n");
                        userActive = false;
                    }else if (userInput.equalsIgnoreCase(removeCommand))
                    {
                        try {
                            stackNumber = stack.stack_peek();
                            stack.stack_pop();
                            System.out.println(stackNumber + " has been removed");
                            System.out.println("\n");

                        } catch (Exception e) {
                            System.out.println("Stack is already empty!");
                            System.out.println("\n");
                        }
                    }
                    else if (userInput.equalsIgnoreCase(peekCommand))
                    {
                        try {
                            stack.stack_peek();
                        }
                        catch (Exception e)
                        {
                            System.out.println("Stack is currently empty!");
                            System.out.println("\n");
                        }
                    }
                } else if (userInput.equalsIgnoreCase(searchCommand))
                {
                    try {
                        System.out.println("What number are you looking for in the stack?");
                        userInput = input.nextLine();
                        stackNumber = Integer.parseInt(userInput);
                        userPeek = stack.stack_search(stackNumber);
                        if (userPeek > 0)
                        {
                            System.out.println(stackNumber + " is in the stack");
                        }
                    }
                    catch (Exception e)
                    {
                        System.out.println("Your number is not in the stack :(");
                    }
                }
                else if (intChecker.hasNextInt())
                {
                    stackNumber = Integer.parseInt(userInput);
                    if (stackNumber > 0)
                    {
                        stack.stack_push(stackNumber);
                        System.out.println(stackNumber + " is now in the stack");
                    }
                    else {
                        System.out.println("Number cannot be negative");
                        System.out.println("\n");
                    }

                } else
                {
                    System.out.println(userInput + " is an unknown command!");
                    System.out.println("\n");
                }
        }
    }
}
