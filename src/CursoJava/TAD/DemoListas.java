package CursoJava.TAD;

class DemoListas {
  public static void main(String[] args) {
    // Lista estática
    ListaEstatica le = new ListaEstatica(5);
    le.add(10);
    le.add(20);
    le.add(30);
    System.out.print("Estática: ");
    le.printAll();

    // Linked list simple
    SinglyLinkedList<Integer> sll = new SinglyLinkedList<>();
    sll.addLast(10);
    sll.addLast(20);
    sll.addLast(30);
    sll.addFirst(5);
    sll.remove(20);
    if (sll.contains(30)) {
      System.out.println("Singly Linked List contiene 30");
    } else {
      System.out.println("Singly Linked List no contiene 30");
    }
    System.out.print("Singly Linked: ");
    sll.printAll();

    // Circular
    CircularList<Integer> cl = new CircularList<>();
    cl.addLast(10);
    cl.addLast(20);
    cl.addLast(30);
    cl.addFirst(5);
    System.out.print("Circular: ");
    cl.printAll();

    // Doble enlazada
    DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
    dll.addLast(10);
    dll.addLast(20);
    dll.addLast(30);
    System.out.print("Doble forward: ");
    dll.printForward();
    System.out.print("Doble backward: ");
    dll.printBackward();
  }
}
