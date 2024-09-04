package CursoJava.ArreglosEstaticos;

import java.util.Scanner;

public class Arreglos12 {
    /**
     * Ejercicio 12:
     * Suponga que se quiere construir un algoritmo que califique un examen de
     * selecci�n m�ltiple
     * presentado por un estudiante de Programaci�n de Computadores.
     * En cada una de las preguntas del examen, el estudiante debió elegir una de
     * cinco opciones,
     * identificadas con las letras A,B,C,D y E?.
     * Las entradas (datos conocidos) para el algoritmo son:
     * a) El número de preguntas que tendrá el examen.
     * b) Cada una de las respuestas dadas por el estudiante.
     * c) Las respuestas correctas.
     * d) La salida esperada (dato desconocido) es: la nota obtenida. Esta nota
     * corresponde al
     * número de aciertos que tuvo el estudiante basado en un sistema de puntuaci�n
     * diseñado para el examen. Por ejemplo, que cada pregunta salga un punto o
     * medio
     * punto y se sume por el total de preguntas.
     * Aclaraciones:
     * En este problema, los arreglos son útiles para guardar las respuestas
     * correctas y las opciones
     * elegidas por el estudiante. El número de preguntas del examen se puede
     * guardar en una
     * variable entera, al igual que la nota. Enseguida se muestra la especificaci�n
     * de este problema:
     * Diseñe un programa para implementar este algoritmo de examen basado en las
     * siguientes
     * especificaciones:
     * a) El número de preguntas del examen debe ser mayor que cero. (totalPreguntas
     * > 0?).
     * b) Cada una de las respuestas del estudiante debe ser una letra mayúscula que
     * esté entre
     * A ?y E?.
     * c) Cada una de las respuestas correctas debe ser una letra mayúscula que est�
     * entre A ?y
     * E?.
     * d) La nota dada por el algoritmo corresponde al total de respuestas acertadas
     * del
     * estudiante
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario el n�mero de preguntas del examen
        System.out.println("Ingrese el número de preguntas del examen:");
        int totalPreguntas = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de l�nea restante

        // Crear arreglos para almacenar las respuestas del estudiante y las respuestas
        // correctas
        String[] respuestasEstudiante = new String[totalPreguntas];
        String[] respuestasCorrectas = new String[totalPreguntas];

        // Leer las respuestas dadas por el estudiante
        System.out.println("Ingrese las respuestas del estudiante (A, B, C, D, E):");
        for (int i = 0; i < totalPreguntas; i++) {
            respuestasEstudiante[i] = scanner.nextLine().toUpperCase();
        }

        // Leer las respuestas correctas
        System.out.println("Ingrese las respuestas correctas (A, B, C, D, E):");
        for (int i = 0; i < totalPreguntas; i++) {
            respuestasCorrectas[i] = scanner.nextLine().toUpperCase();
        }

        // Calcular la nota
        int aciertos = 0;
        for (int i = 0; i < totalPreguntas; i++) {
            if (respuestasEstudiante[i].equals(respuestasCorrectas[i])) {
                aciertos++;
            }
        }
        double nota = aciertos; // Nota basada en un punto por pregunta correcta

        // Imprimir la nota
        System.out.println("La nota obtenida es: " + nota);
    }
}
