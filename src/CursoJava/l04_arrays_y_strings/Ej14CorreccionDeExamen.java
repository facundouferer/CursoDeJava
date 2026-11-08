package CursoJava.l04_arrays_y_strings;

import java.util.Scanner;

/*
 * Lección 04 – Arrays y Strings
 * Objetivo: Calificar un examen de opción múltiple comparando las respuestas del estudiante con las correctas (A a E).
 * Concepto: 3. Recorrer un array (dos arreglos paralelos) y 8. Strings: comparar contenido con equals.
 */
public class Ej14CorreccionDeExamen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de preguntas del examen: ");
        int totalPreguntas = scanner.nextInt();
        scanner.nextLine(); // consume el salto de línea pendiente
        if (totalPreguntas <= 0) {
            System.out.println("El número de preguntas debe ser mayor que cero.");
            return;
        }

        String[] respuestasEstudiante = leerRespuestas(scanner, "del estudiante", totalPreguntas);
        String[] respuestasCorrectas = leerRespuestas(scanner, "correctas", totalPreguntas);

        int aciertos = 0;
        for (int i = 0; i < totalPreguntas; i++) {
            // Se compara el contenido con equals, nunca con ==.
            if (respuestasEstudiante[i].equals(respuestasCorrectas[i])) {
                aciertos++;
            }
        }

        // Cada respuesta correcta vale un punto.
        System.out.println("La nota obtenida es: " + aciertos + " de " + totalPreguntas);
    }

    private static String[] leerRespuestas(Scanner scanner, String descripcion, int total) {
        String[] respuestas = new String[total];
        System.out.println("Ingrese las respuestas " + descripcion + " (A, B, C, D, E):");
        for (int i = 0; i < total; i++) {
            String respuesta = scanner.nextLine().strip().toUpperCase();
            while (!esOpcionValida(respuesta)) {
                System.out.print("Respuesta inválida. Ingrese una letra entre A y E: ");
                respuesta = scanner.nextLine().strip().toUpperCase();
            }
            respuestas[i] = respuesta;
        }
        return respuestas;
    }

    private static boolean esOpcionValida(String respuesta) {
        return respuesta.length() == 1 && respuesta.charAt(0) >= 'A' && respuesta.charAt(0) <= 'E';
    }
}
