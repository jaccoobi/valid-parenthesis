package com.jggundl.parenthesis;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit test for valid-parenthesis.
 */
public class ValidParenthesisTest {

    /**
     * Test the ValidParenthesis singleton.
     */
    @Test
    public void validParenthesisSingletonTest() {
        ValidParenthesis v = ValidParenthesis.getInstance();
        assertNotNull(v);
    }

    @Test
    public void checkValidParenthesis() {
        ValidParenthesis v = ValidParenthesis.getInstance();
        String str = "public static void main(String[] args)";
        assertTrue(v.checkString(str));
    }

    @Test
    public void checkValidParenthesisInFile() {
        ValidParenthesis v = ValidParenthesis.getInstance();
        Path path = Paths.get("src/test/java/com/jggundl/parenthesis/FileTest.txt");
        assertTrue(v.checkFile(path));
    }
}
