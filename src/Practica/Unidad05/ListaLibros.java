package Practica.Unidad05;

import java.util.ArrayList;

public class ListaLibros {
  public static void main(String[] args) {
    ArrayList<String> libros = new ArrayList<>();
    libros.add("1984");
    libros.add("Cien Años de Soledad");
    libros.add("El Hobbit");
    listar(libros);
  }

  public static void listar(ArrayList<String> libros) {
    for (String libro : libros) {
      System.out.println(libro);
    }
  }
}
