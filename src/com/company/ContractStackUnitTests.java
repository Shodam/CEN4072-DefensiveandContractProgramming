package com.company;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import java.util.EmptyStackException;
import java.io.IOException;

public class ContractStackUnitTests {
	
	//Test Case #010
	//testing isEmpty method (stack_peek)
	@Test
	public void testEmpty()
	{
		ContractStack CS = new ContractStack();
		assertEquals(CS.isEmpty(), true);
		assertEquals(CS.isFull(), false);
	}
	
	//Test Case #020
	//Testing isFull method
	@Test
	public void testFull() throws IOException
	{
		ContractStack CS = new ContractStack();
		CS.stack_push(1);
		assertEquals(false, CS.isFull());
		CS.stack_push(1);
		assertEquals(false, CS.isFull());
		CS.stack_push(1);
		assertEquals(false, CS.isFull());
		CS.stack_push(1);
		assertEquals(false, CS.isFull());
		CS.stack_push(1);
		
		//Stack should be full
		assertTrue(CS.isFull());
	}
	
	//Test Case #030
	//Testing Peek() & Push()
	@Test
	public void  testPeekAndPush() throws IOException
	{
		ContractStack CS = new ContractStack();
		
		int x;
		
		//could replace assign with random number
		x = 2;
		CS.stack_push(x);
		assertEquals(x, CS.stack_peek());
		
		x = 3;
		CS.stack_push(x);
		assertEquals(x, CS.stack_peek());
		
		x = 4;
		CS.stack_push(x);
		assertEquals(x, CS.stack_peek());
		
		x = 5;
		CS.stack_push(x);
		assertEquals(x, CS.stack_peek());
		
		x = 6;
		CS.stack_push(x);
		assertEquals(x, CS.stack_peek());
	}
	
	//Test Case #040
	//Testing Pop()
	@Test
	public void testPop() throws IOException
	{
		ContractStack CS = new ContractStack();
		
		CS.stack_push(1);
		CS.stack_push(2);
		CS.stack_push(3);
		CS.stack_push(4);
		CS.stack_push(5);
		
		CS.stack_pop();
		CS.stack_pop();
		CS.stack_pop();
		CS.stack_pop();
		CS.stack_pop();
		
		assertEquals(true, CS.isEmpty());
	}
	
	//Test Case #050
	//Testing Exceptions
	@Test
	public void TestExceptions() throws IOException
	{
		ContractStack CS = new ContractStack();
		Assert.assertThrows(EmptyStackException.class, () -> {
			CS.stack_pop();
		});
		
		Assert.assertThrows(EmptyStackException.class, () -> {
			CS.stack_peek();
		});
		
		CS.stack_push(1);
		CS.stack_push(2);
		CS.stack_push(3);
		CS.stack_push(4);
		CS.stack_push(5);
		Assert.assertThrows(IOException.class, () -> { 
			CS.stack_push(6); 
		});
		 
	}
	//Test Case #060
	//Testing Search()
	@Test
    public void testSearch() {
        DefensiveStack DS = new DefensiveStack();
        int position;

        DS.stack_push(1);

        // newly inserted value 1 should be at first position
        position = DS.stack_search(1);
        assertEquals(1, position);

        DS.stack_push(2);

        // value 1 should now be in second position
        position = DS.stack_search(1);
        assertEquals(2, position);

        // newly inserted value 2 should be at first position
        position = DS.stack_search(2);
        assertEquals(1, position);

        DS.stack_push(3);

        // value 1 should now be in third position
        position = DS.stack_search(1);
        assertEquals(3, position);

        // value 2 should now be in second position
        position = DS.stack_search(2);
        assertEquals(2, position);

        // newly inserted value 3 should be at first position
        position = DS.stack_search(3);
        assertEquals(1, position);

    }
}
