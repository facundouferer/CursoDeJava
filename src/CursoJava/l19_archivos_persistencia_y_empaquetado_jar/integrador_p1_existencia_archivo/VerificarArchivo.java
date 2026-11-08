/*
 * Integrador – Parcial 2 Programación II (Lección 19 – Archivos, persistencia y empaquetado JAR)
 * Enunciado: Comprobar si el archivo "test.txt" existe en el directorio de trabajo.
 * Concepto: Clase File y verificación de existencia de un archivo.
 */
package CursoJava.l19_archivos_persistencia_y_empaquetado_jar.integrador_p1_existencia_archivo;

import java.io.File;

public class VerificarArchivo {
  public static void main(String[] args) {
    File archivo = new File("test.txt");
    System.out.println("¿Existe " + archivo.getName() + "? " + archivo.exists());
  }
}
