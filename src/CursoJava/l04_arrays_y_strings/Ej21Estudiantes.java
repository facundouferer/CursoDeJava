package CursoJava.l04_arrays_y_strings;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Mostrar las calificaciones y el promedio de cada estudiante.
 * Concepto: 6. Matrices y arrays irregulares (cada fila de notas es un array independiente).
 */
public class Ej21Estudiantes {

    public static void main(String[] args) {
        String[] nombres = { "Juan", "María", "Pedro", "José", "Luis" };

        // Una fila de calificaciones por estudiante; cada fila podría tener otra longitud.
        int[][] calificaciones = {
                { 10, 9, 8, 7, 10 },
                { 9, 8, 7, 6, 9 },
                { 8, 7, 6, 5, 8 },
                { 7, 6, 5, 4, 7 },
                { 6, 5, 4, 3, 6 }
        };

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Estudiante: " + nombres[i]);
            System.out.print("Calificaciones: ");
            int suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
                System.out.print(calificaciones[i][j]);
                if (j < calificaciones[i].length - 1) {
                    System.out.print(", ");
                }
            }
            double promedio = (double) suma / calificaciones[i].length;
            System.out.println();
            System.out.println("Promedio: " + promedio);
            System.out.println();
        }
    }
}
