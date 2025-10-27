package Parciales.TAD;

import org.w3c.dom.Node;

public class SinglyLinkedList<T> {

  private static class Node<T> {
    T value;
    Node<T> next;

    Node(T value) {
      this.value = value;
      this.next = null;
    }
  }

  private Node<T> head;
  private int size;

  public SinglyLinkedList() {
    head = null;
    size = 0;
  }

  public void add(T val) {
    Node<T> node = new Node<>(val);
    if (head == null) {
      head = node;
    } else {
      Node<T> current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = node;
    }
    size++;
  }

  // eliminar elemento en la primera concurrencia
  public boolean remove(T val) {
    if (head == null)
      return false;
    if (head.value.equals(val)) {
      head = head.next;
      size--;
      return true;
    }
    Node<T> cur = head; // nodo actual

    while (cur.next != null && !cur.next.value.equals(val)) {
      cur = cur.next;
    }

    if (cur.next == null)
      return false;
    cur.next = cur.next.next;
    size--;
    return true;

  }

  public void printAll() {
    Node<T> current = head;
    while (current != null) {
      System.out.println(current.value);
      current = current.next;
    }
  }

  public static void main(String[] args) {
    SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.printAll();
    System.out.println("Removing 20: " + list.remove(20));
    list.printAll();
  }

}
