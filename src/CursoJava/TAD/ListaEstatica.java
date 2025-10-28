package CursoJava.TAD;

class DatosEstaticos {
  private int[] datos;
  private int size;

  public DatosEstaticos(int capacity) {
    this.datos = new int[capacity];
    this.size = 0;
  }

  public boolean add(int value) {
    if (size <= datos.length) {
      datos[size] = value;
      size++;
      return true;
    } else {
      return false;
    }
  }

  public boolean removeIndex(int index) {
    if (index < 0 || index >= size)
      return false;
    for (int i = index; i < size - 1; i++) {
      datos[i] = datos[i + 1];
    }
    size--;
    return true;
  }

  public boolean removeValue(int value) {
    for (int i = 0; i < size; i++) {
      if (datos[i] == value) {
        return removeIndex(i);
      }
    }
    return false;
  }

  public int get(int index) {
    if (index < 0 || index >= size)
      return -1;
    return datos[index];
  }

  public int size() {
    return size;
  }

  public void printAll() {
    for (int i = 0; i < size; i++) {
      System.out.print(datos[i] + ",");
    }
    System.out.println();
  }
}

public class ListaEstatica {

  public static void main(String[] args) {
    DatosEstaticos lista = new DatosEstaticos(10);
    lista.add(0);
    lista.add(1);
    lista.add(3);
    lista.add(9);
    lista.add(9);
    lista.printAll();
    System.out.println("Eliminar 3: " + lista.removeValue(3));
    lista.printAll();
    if (lista.get(20) == -1)
      System.out.println("Indice 20 no valido");
  }

}
