package com.jggundl.parenthesis;

public class Node {
  private Node node;

  public Node() {
  }

  public Node getNextNode() {
    return this.node;
  }

  public void setNode(Node newNode) {
    this.node = newNode;
  }
}
