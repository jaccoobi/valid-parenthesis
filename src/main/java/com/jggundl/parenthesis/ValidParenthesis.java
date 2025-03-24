package com.jggundl.parenthesis;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ValidParenthesis {
    private static ValidParenthesis instance;
    private final Stack stack;

    private ValidParenthesis() {
        this.stack = new Stack();
    }

    public static ValidParenthesis getInstance() {
        if (instance == null) {
            instance = new ValidParenthesis();
        }
        return instance;
    }

    public boolean checkString(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                this.stack.push();
            } else if (str.charAt(i) == ')') {
                this.stack.pop();
            }
        }

        return this.stack.getSize() == 0;
    }

    public boolean checkFile(Path filePath) {
        try {
            byte[] bytes = Files.readAllBytes(filePath);
        } catch (IOException e) {
            System.err.println("Cannot read bytes from file '" + filePath + "'\nError: " + e.toString());
            return false;
        }
        this.checkString(filePath.toString());
        return this.stack.getSize() == 0;
    }
}
