package com.jggundl.parenthesis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for valid-parenthesis.
 */
public class StackTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testStackPushWithMultipleNodes() {
        Stack stack = new Stack();
        stack.push(new Node());
        stack.push(new Node());
        assertEquals(2, stack.getSize());
    }

    @Test
    public void testStackPushWithSingleNode() {
        Stack stack = new Stack();
        stack.push(new Node());
        assertEquals(1, stack.getSize());
    }

    @Test
    public void testStackPopWithMultipleNodes() {
        Stack stack = new Stack();
        stack.push(new Node());
        stack.push(new Node());
        assertNotNull(stack.pop());
        assertEquals(1, stack.getSize());
    }

    @Test
    public void testStackPopWithSingleNode() {
        Stack stack = new Stack();
        stack.push(new Node());
        assertNotNull(stack.pop());
        assertEquals(0, stack.getSize());
    }

    @Test
    public void testStackPopWithNoNodes() {
        Stack stack = new Stack();
        assertNull(stack.pop());
    }

    @Test
    public void testStackPeek() {
        Stack stack = new Stack();
        stack.push(new Node());
        assertNotNull(stack.peek());
    }
}
