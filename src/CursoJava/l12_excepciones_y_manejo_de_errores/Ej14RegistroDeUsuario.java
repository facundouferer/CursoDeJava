package CursoJava.l12_excepciones_y_manejo_de_errores;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Lección 12 – Excepciones y manejo de errores
 * Objetivo: registrar un usuario (DNI, nombre y edad) repitiendo la carga hasta que los datos sean válidos.
 * Concepto: §10 Ejercicio práctico guiado (validación de edad): excepción propia
 *           para la regla de negocio, IllegalArgumentException para datos inválidos
 *           y reintento con descarte del buffer.
 */
public class Ej14RegistroDeUsuario {

  static class MenorDeEdadException extends Exception {
    MenorDeEdadException(String mensaje) {
      super(mensaje);
    }
  }

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    boolean datosValidos = false;

    System.out.println("REGISTRO DE USUARIO");

    while (!datosValidos) {
      try {
        System.out.print("Ingrese el DNI (números enteros): ");
        if (!leer.hasNext()) {
          break; // fin de la entrada
        }
        int dni = leer.nextInt();
        leer.nextLine(); // descarta el salto de línea pendiente
        validarDni(dni);

        System.out.print("Ingrese el nombre: ");
        if (!leer.hasNextLine()) {
          break;
        }
        String nombre = leer.nextLine().trim();
        validarNombre(nombre);

        System.out.print("Ingrese la edad: ");
        if (!leer.hasNext()) {
          break;
        }
        int edad = leer.nextInt();
        leer.nextLine();
        validarEdad(edad);

        System.out.println("\n-----------------------------------------");
        System.out.println("¡Usuario registrado correctamente!");
        System.out.println("DNI:    " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad:   " + edad + " años");
        System.out.println("-----------------------------------------");
        datosValidos = true;

      } catch (InputMismatchException e) {
        System.out.println("\n[ERROR DE FORMATO] El valor ingresado no es válido. Debe ingresar un número entero.");
        leer.nextLine(); // descarta la entrada incorrecta del buffer
      } catch (MenorDeEdadException e) {
        System.out.println("\n[REGLA DE NEGOCIO] " + e.getMessage());
      } catch (IllegalArgumentException e) {
        System.out.println("\n[DATOS INVÁLIDOS] " + e.getMessage());
      }

      if (!datosValidos) {
        System.out.println("Por favor, intente ingresar los datos nuevamente.\n");
      }
    }

    System.out.println("\nFin del programa.");
    leer.close();
  }

  static void validarDni(int dni) {
    if (dni <= 0) {
      throw new IllegalArgumentException("El DNI debe ser un número positivo.");
    }
  }

  static void validarNombre(String nombre) {
    if (nombre.isEmpty()) {
      throw new IllegalArgumentException("El nombre no puede estar vacío.");
    }
  }

  static void validarEdad(int edad) throws MenorDeEdadException {
    if (edad < 0) {
      throw new IllegalArgumentException("La edad no puede ser un número negativo.");
    }
    if (edad < 18) {
      throw new MenorDeEdadException(
          "La edad ingresada (" + edad + ") es menor a 18 años. El usuario debe ser mayor de edad.");
    }
    if (edad > 130) {
      throw new IllegalArgumentException("La edad ingresada no es válida (superior a 130).");
    }
  }
}
