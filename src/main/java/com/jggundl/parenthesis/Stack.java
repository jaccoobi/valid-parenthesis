package com.jggundl.parenthesis;

public class Stack {
    private Node top;
    private int size;

    public Stack() {
        this.top = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    public void push() {
        if (this.top != null) {
            Node newNode = new Node();
            newNode.setNode(this.top);
            this.top = newNode;
        } else {
            this.top = new Node();
        }
        this.size++;
    }

    public Node pop() {
        if (this.top != null && this.top.getNextNode() != null) { // Multiple nodes
            Node temp = this.top;
            this.top.setNode(this.top.getNextNode());
            this.size--;
            return temp;
        } else if (this.top != null && this.top.getNextNode() == null) { // One node
            Node temp = this.top;
            this.top = null;
            this.size--;
            return temp;
        } else { // No nodes
            return null;
        }
    }

    public Node peek() {
        if (this.top != null) {
            return this.top;
        } else {
            return null;
        }
    }
}
