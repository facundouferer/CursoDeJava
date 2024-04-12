/**
 * 36) En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500, 
 * realizar un Algoritmo que lea los sueldos que cobra cada empleado e informe cuántos 
 * empleados cobran entre $100 y $300 y cuántos cobran más de $300. Además el programa 
 * deberá informar el importe que gasta la empresa en sueldos al personal.
 */
package CursoJava.EjerciciosResueltos;

public class ej36SueldosDeEmpleados {

  public static void main(String[] args) {
    int n = 5;
    int sueldo;
    int sueldosMenores = 0;
    int sueldosMayores = 0;
    int gastoTotal = 0;

    for (int i = 0; i < n; i++) {
      System.out.println("Introduce el sueldo del empleado " + (i + 1) + ":");
      sueldo = Integer.parseInt(System.console().readLine());
      gastoTotal += sueldo;

      if (sueldo >= 100 && sueldo <= 300) {
        sueldosMenores++;
      } else {
        sueldosMayores++;
      }
    }

    System.out.println("Empleados que cobran entre $100 y $300: " + sueldosMenores);
    System.out.println("Empleados que cobran más de $300: " + sueldosMayores);
    System.out.println("Gasto total en sueldos: $" + gastoTotal);
  }

}
