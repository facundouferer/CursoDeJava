package CursoJava.l19_archivos_persistencia_y_empaquetado_jar.integrador_fin_hospital;

import java.util.Scanner;

/**
 * Integrador – Examen final: Sistema de hospital (Lección 19 – Archivos, persistencia y empaquetado JAR)
 *
 * Enunciado: Sistema para un hospital con doctores y pacientes. Desde un menú se listan los doctores,
 * se registran y actualizan pacientes, se consulta y carga su historial médico, y la lista de pacientes
 * se guarda y se carga desde un archivo (pacientes.txt). Al iniciar se muestra el contenido de archivo.txt.
 *
 * Concepto: herencia (Persona, Doctor, Paciente), interfaz (Informacion), serialización de objetos y
 * lectura de archivos con try-with-resources.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new SistemaHospital(scanner).iniciar();
    }
}
