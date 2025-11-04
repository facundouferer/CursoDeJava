package CursoJava.TAD;

// Lista estática de enteros (capacidad fija)
public class ListaEstatica {
  private int[] datos;
  private int size;

  public ListaEstatica(int capacidad) {
    datos = new int[capacidad];
    size = 0;
  }

  public boolean add(int v) {
    if (size >= datos.length)
      return false; // lleno
    datos[size++] = v;
    return true;
  }

  public boolean removeAt(int index) {
    if (index < 0 || index >= size)
      return false;
    // desplazar a la izquierda
    for (int i = index; i < size - 1; i++) {
      datos[i] = datos[i + 1];
    }
    size--;
    return true;
  }

  public int get(int index) {
    if (index < 0 || index >= size)
      throw new IndexOutOfBoundsException();
    return datos[index];
  }

  public int size() {
    return size;
  }

  public void printAll() {
    for (int i = 0; i < size; i++)
      System.out.print(datos[i] + " ");
    System.out.println();
  }

  public static void main(String[] args) {
    ListaEstatica le = new ListaEstatica(5);
    le.add(10);
    le.add(20);
    le.add(30);
    System.out.print("Estática: ");
    le.printAll();
  }

}
