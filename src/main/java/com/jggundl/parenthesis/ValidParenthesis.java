package com.jggundl.parenthesis;

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
}
