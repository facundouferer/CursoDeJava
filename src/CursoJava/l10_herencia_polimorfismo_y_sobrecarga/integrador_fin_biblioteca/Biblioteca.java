package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.integrador_fin_biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Biblioteca {
    private final List<Libro> libros = new ArrayList<>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void eliminarLibro(Libro libro) {
        libros.remove(libro);
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void buscarLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().contains(titulo)) {
                System.out.println(libro);
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public void nuevoLibroFisico(Scanner sc) {
        String titulo = leerTexto(sc, "Ingrese el título del libro: ");
        String autor = leerTexto(sc, "Ingrese el autor del libro: ");
        int publicacion = Integer.parseInt(leerTexto(sc, "Ingrese el año de publicación del libro: "));
        int paginas = Integer.parseInt(leerTexto(sc, "Ingrese el número de páginas del libro: "));
        String ubicacion = leerTexto(sc, "Ingrese la ubicación del libro: ");
        int copias = Integer.parseInt(leerTexto(sc, "Ingrese el número de copias del libro: "));
        agregarLibro(new LibroFisico(titulo, autor, publicacion, paginas, ubicacion, copias));
    }

    public void nuevoLibroDigital(Scanner sc) {
        String titulo = leerTexto(sc, "Ingrese el título del libro: ");
        String autor = leerTexto(sc, "Ingrese el autor del libro: ");
        int publicacion = Integer.parseInt(leerTexto(sc, "Ingrese el año de publicación del libro: "));
        String formato = leerTexto(sc, "Ingrese el formato del libro: ");
        int tamanoArchivo = Integer.parseInt(leerTexto(sc, "Ingrese el tamaño del archivo del libro (KB): "));
        agregarLibro(new LibroDigital(titulo, autor, publicacion, formato, tamanoArchivo));
    }

    private static String leerTexto(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine().trim();
    }
}
