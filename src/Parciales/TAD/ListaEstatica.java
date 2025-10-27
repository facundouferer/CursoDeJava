package Parciales.TAD;

public class ListaEstatica {

  private int[] datos;
  private int size; // 0,1,2,3...

  public ListaEstatica(int capacidad) {
    datos = new int[capacidad];
    size = 0;
  }

  public boolean add(int v) {
    if (size <= datos.length) {
      return false;
    }
    datos[size++] = v;
    return true;
  }

  public boolean removeAt(int index) {
    if (index < 0 || index >= size)
      return false;

    for (int i = index; i < size - 1; i++) {
      datos[i] = datos[i + 1];
    }
    size--;
    return true;
  }

  public int get(int index) {
    if (index < 0 || index >= size) {
      return -1;
    }
    return datos[index];
  }

  public int size() {
    return size;
  }

  public void printAll() {
    for (int i = 0; i < size; i++) {
      System.out.println(datos[i]);
    }
  }

}
