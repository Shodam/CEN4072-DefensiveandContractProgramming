package com.company;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DefensiveStackUnitTests {
	
	//testing isEmpty method (stack_peek)
	@Test
	public void testEmpty()
	{
		DefensiveStack DS = new DefensiveStack();
		assertEquals(DS.stack_peek() == null, true);
		assertEquals(DS.isFull(), false);
	}
	
	//Testing isFull method
	@Test
	public void testFull()
	{
		DefensiveStack DS = new DefensiveStack();
		DS.stack_push(1);
		assertEquals(DS.isFull(), false);
		DS.stack_push(1);
		assertEquals(DS.isFull(), false);
		DS.stack_push(1);
		assertEquals(DS.isFull(), false);
		DS.stack_push(1);
		assertEquals(DS.isFull(), false);
		DS.stack_push(1);
		
		//Stack should be full
		assertEquals(DS.isFull(), true);
	}
	
	@Test
	public void  testPeek()
	{
		DefensiveStack DS = new DefensiveStack();
		assertEquals(DS.stack_peek(), null);
		
		int x;
		
		//could replace assign with random number
		x = 2;
		DS.stack_push(x);
		assertEquals(DS.stack_peek().compareTo(x), 0);
		
		x = 3;
		DS.stack_push(x);
		assertEquals(DS.stack_peek().compareTo(x), 0);
		
		x = 4;
		DS.stack_push(x);
		assertEquals(DS.stack_peek().compareTo(x), 0);
		
		x = 5;
		DS.stack_push(x);
		assertEquals(DS.stack_peek().compareTo(x), 0);
		
		x = 6;
		DS.stack_push(x);
		assertEquals(DS.stack_peek().compareTo(x), 0);
		
	}
}