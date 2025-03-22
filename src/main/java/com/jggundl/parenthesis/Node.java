package com.jggundl.parenthesis;

public class Node {
  private char value;
  private Node node;

  public Node() {
  }

  public Node(char value, Node node) {
    this.value = value;
    this.node = node;
  }

  public char getValue() {
    return this.value;
  }

  public Node getNode() {
    return this.node;
  }

  public void setNode(Node newNode) {
    this.node = newNode;
  }
}
