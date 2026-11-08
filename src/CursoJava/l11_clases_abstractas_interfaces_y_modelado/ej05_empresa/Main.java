/*
 * Lección 11 – Clases abstractas, interfaces y modelado
 * Objetivo: Registrar las decisiones de un jefe de la empresa, que además es un empleado.
 * Concepto: Interfaz con método estático (no heredable) combinada con herencia de una clase abstracta.
 */
package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej05_empresa;

public class Main {
  public static void main(String[] args) {
    Jefe jefe = new Jefe();
    jefe.hablar();
    System.out.println(jefe.tomarDecisiones("Aprobar el presupuesto anual"));
    System.out.println(Jefe.tomarDecisiones());
    System.out.println(ParaJefes.tomarDecisiones());
  }
}
