package com.jggundl.parenthesis;

public class ValidParenthesis {
    private static ValidParenthesis instance;
    private Stack stack;

    private ValidParenthesis() {
        this.stack = new Stack();
    }

    public static ValidParenthesis getInstance() {
        if (instance == null) {
            instance = new ValidParenthesis();
        }
        return instance;
    }

    public void checkString(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                this.stack.push();
            }
        }
    }
}
