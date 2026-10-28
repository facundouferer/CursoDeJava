package CursoJava.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

class MenorDeEdadException extends Exception {

  public MenorDeEdadException() {
    super("La persona debe tener al menos 18 años.");
  }

  public MenorDeEdadException(String mensaje) {
    super(mensaje);
  }
}

public class RegistroUsuario {

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    boolean datosValidos = false;

    System.out.println("REGISTRO DE USUARIO");

    while (!datosValidos) {
      try {
        // 1. Ingreso y validación del DNI
        System.out.print("Ingrese el DNI (números enteros): ");
        if (!leer.hasNext()) {
          break; // Fin de entrada (EOF)
        }
        int dni = leer.nextInt();
        leer.nextLine(); // Limpiar el salto de línea pendiente
        validarDni(dni);

        // 2. Ingreso y validación del Nombre
        System.out.print("Ingrese el nombre: ");
        if (!leer.hasNextLine()) {
          break;
        }
        String nombre = leer.nextLine().trim();
        validarNombre(nombre);

        // 3. Ingreso y validación de la Edad
        System.out.print("Ingrese la edad: ");
        if (!leer.hasNext()) {
          break;
        }
        int edad = leer.nextInt();
        leer.nextLine(); // Limpiar el salto de línea pendiente
        validarEdad(edad);

        // Si todos los datos son válidos
        System.out.println("\n-----------------------------------------");
        System.out.println("¡Usuario registrado exitosamente!");
        System.out.println("DNI:    " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad:   " + edad + " años");
        System.out.println("-----------------------------------------");
        datosValidos = true;

      } catch (InputMismatchException e) {
        System.out.println("\n[ERROR DE FORMATO] El valor ingresado no es válido. Debe ingresar un número entero.");
        leer.nextLine(); // Descartar la entrada incorrecta del buffer
      } catch (MenorDeEdadException e) {
        System.out.println("\n[ERROR DE REGLA DE NEGOCIO] " + e.getMessage());
      } catch (IllegalArgumentException e) {
        System.out.println("\n[ERROR EN LOS DATOS] " + e.getMessage());
      } catch (Exception e) {
        System.out.println("\n[ERROR INESPERADO] " + e.getMessage());
      }

      if (!datosValidos) {
        System.out.println("Por favor, intente ingresar los datos nuevamente.\n");
      }
    }

    System.out.println("\nFin del programa.");
    leer.close();
  }

  //verifica que el número de dni sea un positivo.
  static void validarDni(int dni) {
    if (dni <= 0) {
      throw new IllegalArgumentException("El DNI debe ser un número positivo.");
    }
  }

  // verifica que el nombre no esté vacío.
  static void validarNombre(String nombre) {
    if (nombre.isEmpty()) {
      throw new IllegalArgumentException("El nombre no puede estar vacío.");
    }
  }
//error que valida la edad.
  static void validarEdad(int edad) throws MenorDeEdadException {
    if (edad < 0) {
      throw new IllegalArgumentException("La edad no puede ser un número negativo.");
    }
    if (edad < 18) {
      throw new MenorDeEdadException("Error: La edad ingresada (" + edad + ") es menor a 18 años. El usuario debe ser mayor de edad.");
    }
    if (edad > 130) {
      throw new IllegalArgumentException("La edad ingresada no es válida (superior a 130).");
    }
  }
}
