package com.company;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DefensiveStackUnitTests {
	
	//Test Case #001
	//testing isEmpty method (stack_peek)
	@Test
	public void testEmpty()
	{
		DefensiveStack DS = new DefensiveStack();
		assertEquals(true, DS.stack_peek() == null);
		assertEquals(false, DS.isFull());
	}
	
	//Test Case #002
	//Testing isFull method
	@Test
	public void testFull()
	{
		DefensiveStack DS = new DefensiveStack();
		DS.stack_push(1);
		assertEquals(false,DS.isFull());
		DS.stack_push(1);
		assertEquals(false,DS.isFull());
		DS.stack_push(1);
		assertEquals(false,DS.isFull());
		DS.stack_push(1);
		assertEquals(false, DS.isFull());
		DS.stack_push(1);
		
		//Stack should be full
		assertEquals(true, DS.isFull());
	}

	//Test Case #003
    @Test
    public void  testPeek()
    {
        DefensiveStack DS = new DefensiveStack();
        assertEquals(DS.stack_peek(), null);

        int x;

        //could replace assign with random number
        x = 2;
        DS.stack_push(x);
        assertEquals(0, DS.stack_peek().compareTo(x));

        x = 3;
        DS.stack_push(x);
        assertEquals(0, DS.stack_peek().compareTo(x));

        x = 4;
        DS.stack_push(x);
        assertEquals(0, DS.stack_peek().compareTo(x));

        x = 5;
        DS.stack_push(x);
        assertEquals(0, DS.stack_peek().compareTo(x));

        x = 6;
        DS.stack_push(x);
        assertEquals(0, DS.stack_peek().compareTo(x));

    }

	//Test Case #004
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
	//Test Case #005
	@Test
	public void testPop()
	{
		DefensiveStack DS = new DefensiveStack();
		DS.stack_push(1);
		DS.stack_push(2);
		DS.stack_push(3);
		DS.stack_push(4);
		DS.stack_push(5);
		
		assertEquals(0, DS.stack_pop().compareTo(5));
		assertEquals(0, DS.stack_pop().compareTo(4));
		assertEquals(0, DS.stack_pop().compareTo(3));
		assertEquals(0, DS.stack_pop().compareTo(2));
		assertEquals(0, DS.stack_pop().compareTo(1));
		
		assertEquals(null, DS.stack_pop());
	}
}
