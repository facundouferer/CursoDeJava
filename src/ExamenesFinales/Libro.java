package ExamenesFinales;

import java.util.ArrayList;
import java.util.Scanner;

class Libro {
    private String titulo;
    private String autor;
    private int publicacion;

    public Libro(String titulo, String autor, int publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Año de publicación: " + publicacion;
    }
}

class LibroFisico extends Libro {
    private int paginas;
    private String ubicacion;
    private int copias;

    public LibroFisico(String titulo, String autor, int publicacion, int paginas, String ubicacion, int copias) {
        super(titulo, autor, publicacion);
        this.paginas = paginas;
        this.ubicacion = ubicacion;
        this.copias = copias;
    }

    public void prestarLibro() {
        if (copias > 0) {
            copias--;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Páginas: " + paginas + ", Ubicación: " + ubicacion + ", Copias: " + copias;
    }
}

class LibroDigital extends Libro {
    private String formato;
    private int tamanoArchivo;

    public LibroDigital(String titulo, String autor, int publicacion, String formato, int tamanoArchivo) {
        super(titulo, autor, publicacion);
        this.formato = formato;
        this.tamanoArchivo = tamanoArchivo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Formato: " + formato + ", Tamaño del archivo: " + tamanoArchivo + "KB";
    }
}

class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<>();

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
            if (libro.toString().contains(titulo)) {
                System.out.println(libro);
                return;
            }
        }
        System.out.println("Libro no encontrado.");
    }

    public void nuevoLibroFisico() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el autor del libro");
        String autor = sc.nextLine();
        System.out.println("Ingrese el año de publicación del libro");
        int publicacion = sc.nextInt();
        System.out.println("Ingrese el numero de paginas del libro");
        int paginas = sc.nextInt();
        System.out.println("Ingrese la ubicacion del libro");
        String ubicacion = sc.nextLine();
        System.out.println("Ingrese el numero de copias del libro");
        int copias = sc.nextInt();
        LibroFisico libroFisico = new LibroFisico(titulo, autor, publicacion, paginas, ubicacion, copias);
        agregarLibro(libroFisico);
        sc.close();
    }

    public void nuevoLibroDigital() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro");
        String titulo = sc.nextLine();
        System.out.println("Ingrese el autor del libro");
        String autor = sc.nextLine();
        System.out.println("Ingrese el año de publicación del libro");
        int publicacion = sc.nextInt();
        System.out.println("Ingrese el formato del libro");
        String formato = sc.nextLine();
        System.out.println("Ingrese el tamaño del archivo del libro");
        int tamanoArchivo = sc.nextInt();
        LibroDigital libroDigital = new LibroDigital(titulo, autor, publicacion, formato, tamanoArchivo);
        agregarLibro(libroDigital);
        sc.close();
    }
}

class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        LibroFisico libroFisico = new LibroFisico("El principito", "Antoine de Saint-Exupéry", 1943, 96, "Estantería 1",
                5);
        LibroDigital libroDigital = new LibroDigital("1984", "George Orwell", 1949, "PDF", 5000);

        biblioteca.agregarLibro(libroFisico);
        biblioteca.agregarLibro(libroDigital);
        biblioteca.mostrarLibros();

        libroFisico.prestarLibro();
        biblioteca.mostrarLibros();

        biblioteca.buscarLibroPorTitulo("1984");

    }
}
