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
    System.out.print("Singly Linked: ");
    sll.printAll();

    // Circular
    CircularList<Integer> cl = new CircularList<>();
    cl.add(10);
    cl.add(20);
    cl.add(30);
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
