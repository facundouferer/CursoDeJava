package CursoJava.ArreglosEstaticos;

public class BuscarUnElementoYEliminar {

  public static void main(String[] args) {
    int[] arreglo = { 10, 3, 98, 12, 5 };

    // Buscar el elemento 98 y eliminarlo
    int posicion = -1;
    for (int i = 0; i < arreglo.length; i++) {
      if (arreglo[i] == 98) {
        posicion = i;
        break;
      }
    }

    // Eliminar el elemento en la posición encontrada
    if (posicion != -1) {
      for (int i = posicion; i < arreglo.length - 1; i++) {
        arreglo[i] = arreglo[i + 1];
      }

      // Crear un nuevo arreglo con un tamaño menor
      int[] nuevoArreglo = new int[arreglo.length - 1];

      // Copiar los elementos del arreglo original al nuevo arreglo
      for (int i = 0; i < nuevoArreglo.length; i++) {
        nuevoArreglo[i] = arreglo[i];
      }

      // Asignar el nuevo arreglo al arreglo original
      arreglo = nuevoArreglo;
    }

    // impresión del arreglo
    for (int elemento : arreglo) {
      System.out.println(elemento);
    }
  }

}
