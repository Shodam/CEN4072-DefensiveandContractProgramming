package com.company;

public class DefensiveStackTester 
{	
	public static void main(String[] args)
	{
	    DefensiveStack stack = new DefensiveStack();
	    
	    //Checking peek
	    stack.stack_push(1);
	    System.out.println(stack.stack_peek());
	    stack.stack_pop();
	    stack.stack_push(55);
	    System.out.println(stack.stack_peek());
	    stack.stack_pop();
	    
	    //Pushed to capacity
	    stack.stack_push(11);
	    stack.stack_push(22);
	    stack.stack_push(33);
	    stack.stack_push(44);
	    stack.stack_push(55);
	    
	    
	    //Popped to empty
	    stack.stack_pop();
	    stack.stack_pop();
	    stack.stack_pop();
	    stack.stack_pop();
	    stack.stack_pop();
	}
}
