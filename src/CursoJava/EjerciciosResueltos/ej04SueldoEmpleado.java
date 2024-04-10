package CursoJava.EjerciciosResueltos;

import java.util.Scanner;

public class ej04SueldoEmpleado {
    public static void main(String[] args) {
        /**
         * Escriba un algoritmo que dado el número de horas trabajadas por un empleado y
         * el sueldo
         * por hora, calcule el sueldo total de ese empleado. Tenga en cuenta que las
         * horas extras se
         * pagan el doble.
         */

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

        if (horasTrabajadas <= 40) { // si las horas trabajadas son menores o iguales a 40

            sueldoTotal = horasTrabajadas * sueldoPorHora; // calcular el sueldo sin horas extras

        } else { // si las horas trabajadas son mayores a 40

            // calcular el sueldo con horas extras (las primeras 40 horas se pagan a tarifa
            // normal y las demás al doble)
            sueldoTotal = 40 * sueldoPorHora + (horasTrabajadas - 40) * (sueldoPorHora * 2);

        }

        // mostrar el sueldo total del empleado
        System.out.println("El sueldo total del empleado es: $" + sueldoTotal);

        // cerrar el objeto Scanner
        sc.close();
    }
}
