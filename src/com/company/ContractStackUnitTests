package com.company;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ContractStackUnitTests {
	
	//testing isEmpty method (stack_peek)
	@Test
	public void testEmpty()
	{
		ContractStack CS = new ContractStack();
		assertEquals(CS.isEmpty(), true);
		assertEquals(CS.isFull(), false);
	}
	
	//Testing isFull method
	@Test
	public void testFull()
	{
		ContractStack CS = new ContractStack();
		CS.stack_push(1);
		assertEquals(CS.isFull(), false);
		CS.stack_push(1);
		assertEquals(CS.isFull(), false);
		CS.stack_push(1);
		assertEquals(CS.isFull(), false);
		CS.stack_push(1);
		assertEquals(CS.isFull(), false);
		CS.stack_push(1);
		
		//Stack should be full
		assertEquals(CS.isFull(), true);
	}
	
	@Test
	public void  testPeek()
	{
		ContractStack CS = new ContractStack();
		
		int x;
		
		//could replace assign with random number
		x = 2;
		CS.stack_push(x);
		assertEquals(CS.stack_peek(), x);
		
		x = 3;
		CS.stack_push(x);
		assertEquals(CS.stack_peek(), x);
		
		x = 4;
		CS.stack_push(x);
		assertEquals(CS.stack_peek(), x);
		
		x = 5;
		CS.stack_push(x);
		assertEquals(CS.stack_peek(), x);
		
		x = 6;
		CS.stack_push(x);
		assertEquals(CS.stack_peek(), x);
	}
}
