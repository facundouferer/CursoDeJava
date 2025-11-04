package CursoJava.TAD;

public class SinglyLinkedList<T> {
  private static class Node<T> {
    T value;
    Node<T> next;

    Node(T val) {
      value = val;
      next = null;
    }
  }

  private Node<T> head;
  private Node<T> tail; // opcional, acelera addLast
  private int size;

  public SinglyLinkedList() {
    head = tail = null;
    size = 0;
  }

  public void addFirst(T val) {
    Node<T> node = new Node<>(val);
    node.next = head;
    head = node;
    if (tail == null)
      tail = node;
    size++;
  }

  public void addLast(T val) {
    Node<T> node = new Node<>(val);
    if (tail == null) {
      head = tail = node;
    } else {
      tail.next = node;
      tail = node;
    }
    size++;
  }

  public boolean remove(T val) {
    if (head == null)
      return false;
    if (head.value.equals(val)) {
      head = head.next;
      if (head == null)
        tail = null;
      size--;
      return true;
    }
    Node<T> cur = head;
    while (cur.next != null && !cur.next.value.equals(val))
      cur = cur.next;
    if (cur.next == null)
      return false;
    cur.next = cur.next.next;
    if (cur.next == null)
      tail = cur; // si borramos el último
    size--;
    return true;
  }

  public boolean contains(T val) {
    Node<T> cur = head;
    while (cur != null) {
      if (cur.value.equals(val))
        return true;
      cur = cur.next;
    }
    return false;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void printAll() {
    Node<T> cur = head;
    while (cur != null) {
      System.out.print(cur.value + " ");
      cur = cur.next;
    }
    System.out.println();
  }

  public int size() {
    return size;
  }
}
