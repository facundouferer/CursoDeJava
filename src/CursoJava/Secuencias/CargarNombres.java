package CursoJava.Secuencias;
import java.util.Scanner;

public class CargarNombres {
    public static void main(String[] args) {
        String[] nombres = new String[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los 50 nombres (máximo 30 caracteres):");

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre " + (i + 1) + ": ");
            String nombre = scanner.nextLine();
            if (nombre.length() > 30) {
                System.out.println("El nombre supera los 30 caracteres. Se truncará a 30 caracteres.");
                nombre = nombre.substring(0, 30);
            }
            nombres[i] = nombre;
        }

        System.out.println("\nNombres ingresados:");

        for (int i = 0; i < nombres.length; i++) {
            System.out.println((i + 1) + ". " + nombres[i]);
        }
    }
}
