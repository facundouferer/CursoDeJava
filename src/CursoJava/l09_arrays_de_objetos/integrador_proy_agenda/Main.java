package CursoJava.l09_arrays_de_objetos.integrador_proy_agenda;

import java.util.Scanner;

/**
 * Integrador – Proyecto: Agenda de personas (Lección 09 – Arrays de objetos)
 * Enunciado: Agenda de contactos por consola: listar, agregar (sin repetir DNI), eliminar por
 * nombre, editar nombre y DNI, y buscar por texto, sobre un array de objetos Persona.
 * Concepto: 4. Recorrer y mostrar, 5. Buscar dentro de un array de objetos, 11. Ejercicio 4 – Agenda.
 */
public class Main {

  public static void main(String[] args) {
    Agenda agenda = new Agenda();
    Scanner scanner = new Scanner(System.in);
    int opcion;
    do {
      UtilidadesPersona.mostrarMenu();
      opcion = UtilidadesPersona.leerEntero(scanner, "Elija una opción: ");
      switch (opcion) {
        case 1 -> agenda.listarPersonas();
        case 2 -> UtilidadesPersona.agregarPersona(agenda, scanner);
        case 3 -> UtilidadesPersona.eliminarPersona(agenda, scanner);
        case 4 -> UtilidadesPersona.editarPersona(agenda, scanner);
        case 5 -> UtilidadesPersona.buscarPersona(agenda, scanner);
        case 6 -> System.out.println("Saliendo del programa...");
        default -> System.out.println("Opción incorrecta.");
      }
    } while (opcion != 6);
    scanner.close();
  }
}
