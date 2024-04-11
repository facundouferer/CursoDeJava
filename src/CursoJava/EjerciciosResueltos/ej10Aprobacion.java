/**
 * 10) Determinar si un alumno aprueba o desaprueba un curso, 
 * sabiendo que aprueba si su promedio de tres calificaciones 
 * es mayor o igual a 60; desaprueba en caso contrario.
 */
package CursoJava.EjerciciosResueltos;

public class ej10Aprobacion {
    public static void main(String[] args) {
        int calificacion1 = 50;
        int calificacion2 = 50;
        int calificacion3 = 50;
        int promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
        if (promedio >= 60) {
            System.out.println("El alumno aprueba el curso");
        } else {
            System.out.println("El alumno desaprueba el curso");
        }
    }
}
