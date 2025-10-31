package CursoJava.TAD;

class DoublyLinkedList<T> {
  private static class Node<T> {
    T value;
    Node<T> prev, next;

    Node(T v) {
      value = v;
    }
  }

  private Node<T> head, tail;
  private int size;

  public DoublyLinkedList() {
    head = tail = null;
    size = 0;
  }

  public void addLast(T val) {
    Node<T> node = new Node<>(val);
    if (tail == null) {
      head = tail = node;
    } else {
      tail.next = node;
      node.prev = tail;
      tail = node;
    }
    size++;
  }

  public boolean remove(T val) {
    Node<T> cur = head;
    while (cur != null && !cur.value.equals(val))
      cur = cur.next;
    if (cur == null)
      return false;
    if (cur.prev != null)
      cur.prev.next = cur.next;
    else
      head = cur.next;
    if (cur.next != null)
      cur.next.prev = cur.prev;
    else
      tail = cur.prev;
    size--;
    return true;
  }

  public void printForward() {
    Node<T> cur = head;
    while (cur != null) {
      System.out.print(cur.value + " ");
      cur = cur.next;
    }
    System.out.println();
  }

  public void printBackward() {
    Node<T> cur = tail;
    while (cur != null) {
      System.out.print(cur.value + " ");
      cur = cur.prev;
    }
    System.out.println();
  }

  public int size() {
    return size;
  }
}
