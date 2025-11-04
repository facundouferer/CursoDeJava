package CursoJava.TAD;

class CircularList<T> {
  private static class Node<T> {
    T value;
    Node<T> next;

    Node(T v) {
      value = v;
    }
  }

  private Node<T> tail; // si tail == null lista vacía
  private int size;

  public CircularList() {
    tail = null;
    size = 0;
  }

  public void addLast(T val) {
    Node<T> node = new Node<>(val);
    if (tail == null) {
      tail = node;
      tail.next = tail; // apunta a sí mismo
    } else {
      node.next = tail.next; // head
      tail.next = node;
      tail = node;
    }
    size++;
  }

  public void addFirst(T val) {
    Node<T> node = new Node<>(val);
    if (tail == null) {
      tail = node;
      tail.next = tail; // apunta a sí mismo
    } else {
      node.next = tail.next; // head
      tail.next = node;
    }
    size++;
  }

  public void printAll() {
    if (tail == null) {
      System.out.println("vacío");
      return;
    }
    Node<T> cur = tail.next; // head
    do {
      System.out.print(cur.value + " ");
      cur = cur.next;
    } while (cur != tail.next);
    System.out.println();
  }

  public int size() {
    return size;
  }
}
