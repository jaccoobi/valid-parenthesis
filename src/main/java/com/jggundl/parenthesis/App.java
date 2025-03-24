package com.jggundl.parenthesis;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ValidParenthesis v = ValidParenthesis.getInstance();
        if (args[0] != null) {
            Path p = Paths.get(args[0]);
            System.out.println(v.checkFile(p));
        }
    }
}
