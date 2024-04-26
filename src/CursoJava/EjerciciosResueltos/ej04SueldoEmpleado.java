/**
 * 4) Escriba un algoritmo que dado el número de horas trabajadas por un empleado 
 * y el sueldo por hora, calcule el sueldo total de ese empleado. 
 * Tenga en cuenta que las horas extras se pagan el doble. 
 */
package CursoJava.EjerciciosResueltos;

import java.util.Scanner;

public class ej04SueldoEmpleado {
    public static void main(String[] args) {
        // crear un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);
        // solicitar al usuario el número de horas trabajadas
        System.out.print("Ingrese el número de horas trabajadas: ");
        int horasTrabajadas = sc.nextInt();
        // solicitar al usuario el sueldo por hora
        System.out.print("Ingrese el sueldo por hora: ");
        double sueldoPorHora = sc.nextDouble();
        // calcular el sueldo total del empleado
        double sueldoTotal;

        if (horasTrabajadas <= 40) {
            sueldoTotal = horasTrabajadas * sueldoPorHora;
        } else {
            sueldoTotal = sueldoPorHora * horasTrabajadas * 2;
        }

        // mostrar el sueldo total del empleado
        System.out.println("El sueldo total del empleado es: $" + sueldoTotal);

        // cerrar el objeto Scanner
        sc.close();
    }
}
