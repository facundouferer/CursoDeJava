/*
 * Lección 11 – Clases abstractas, interfaces y modelado
 * Objetivo: Abrir una ventana y avisar por consola cada vez que queda activa.
 * Concepto: Clases adaptadoras (WindowAdapter) para reaccionar a un solo método de una interfaz larga.
 */
package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej07_clases_adaptadoras;

import javax.swing.JFrame;

public class Main {
  public static void main(String[] args) {
    MarcoEventoVentana marco = new MarcoEventoVentana();

    // DISPOSE_ON_CLOSE deja tiempo a que se emitan los eventos de cierre antes de terminar.
    marco.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    // Un WindowAdapter es también un WindowListener, por eso puede registrarse como oyente.
    marco.addWindowListener(new EventosDeVentana());
  }
}
