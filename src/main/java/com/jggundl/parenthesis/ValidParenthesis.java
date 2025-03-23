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
}
