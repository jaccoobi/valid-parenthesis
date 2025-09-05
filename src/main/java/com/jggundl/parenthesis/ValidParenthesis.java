package com.jggundl.parenthesis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

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
        if (this.stack.pop() == null) {
          return false; // too many closing brackets
        }
      } else if (str.charAt(i) == '{') {
        this.stack.push();
      } else if (str.charAt(i) == '}') {
        if (this.stack.pop() == null) {
          return false; // too many closing brackets
        }
      } else if (str.charAt(i) == '[') {
        this.stack.push();
      } else if (str.charAt(i) == ']') {
        if (this.stack.pop() == null) {
          return false;
        }
      }
    }

    return this.stack.getSize() == 0;
  }

  public boolean checkFile(Path filePath) {
    byte[] bytes;
    try {
      bytes = Files.readAllBytes(filePath);
    } catch (IOException e) {
      System.err.println("Cannot read bytes from file '" + filePath + "'\nError: " + e);
      return false;
    }
    return this.checkString(Arrays.toString(bytes));
  }
}
