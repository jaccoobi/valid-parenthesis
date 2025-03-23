package com.jggundl.parenthesis;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for valid-parenthesis.
 */
public class ValidParenthesisTest {

    /**
     * Test the ValidParenthesis singleton.
     */
    @Test
    public void ValidParenthesisSingletonTest() {
        ValidParenthesis v = ValidParenthesis.getInstance();
        assertNotNull(v);
    }
}
