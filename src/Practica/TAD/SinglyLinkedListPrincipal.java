package Practica.TAD;

class SinglyLinkedList {

  private static class Node {
    int value;
    Node next;

    Node(int value) {
      this.value = value;
      this.next = null;
    }
  }

  private Node head;
  private Node tail;
  private int size;

  public SinglyLinkedList() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  public void addLast(int value) {
    Node newNode = new Node(value);
    if (size == 0) {
      head = newNode;
      tail = newNode;
    } else {
      tail.next = newNode;
      tail = newNode;
    }
    size++;
  }

}

public class SinglyLinkedListPrincipal {
  public static void main(String[] args) {
    SinglyLinkedList list = new SinglyLinkedList();
    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
  }
}
