package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej07_clases_adaptadoras;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/** Clase adaptadora: WindowAdapter ya implementa WindowListener con métodos vacíos. */
public class EventosDeVentana extends WindowAdapter {
  @Override
  public void windowActivated(WindowEvent e) {
    System.out.println("VENTANA ACTIVA");
  }
}
