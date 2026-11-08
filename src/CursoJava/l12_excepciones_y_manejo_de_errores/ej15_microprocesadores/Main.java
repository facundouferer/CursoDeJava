package CursoJava.l12_excepciones_y_manejo_de_errores.ej15_microprocesadores;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * Lección 12 – Excepciones y manejo de errores
 * Objetivo: cargar dos microprocesadores por teclado y mostrar el listado.
 * Concepto: §10 Ejercicio práctico guiado.
 */
public class Main {

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    ArrayList<Micro> listaMicros = new ArrayList<>();
    AdminMicro admin = new AdminMicro();

    admin.agregarMicro(listaMicros, leer);
    admin.agregarMicro(listaMicros, leer);
    admin.listarMicros(listaMicros);

    leer.close();
  }
}
