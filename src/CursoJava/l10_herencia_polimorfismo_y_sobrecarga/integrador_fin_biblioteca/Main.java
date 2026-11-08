package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.integrador_fin_biblioteca;

/**
 * Integrador – Examen final: Biblioteca de libros físicos y digitales (Lección 10 – Herencia, polimorfismo y sobrecarga)
 *
 * Enunciado: Modelar una biblioteca que administra libros físicos (páginas, ubicación, copias) y libros
 * digitales (formato, tamaño de archivo). Se pueden agregar y eliminar libros, mostrarlos, prestar un libro
 * físico y buscar un libro por título.
 *
 * Concepto: herencia con extends y super, sobrescritura de toString con @Override, polimorfismo
 * (una lista de Libro con subclases distintas) y búsqueda sobre una colección.
 */
public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        LibroFisico libroFisico = new LibroFisico("El principito", "Antoine de Saint-Exupéry", 1943, 96,
                "Estantería 1", 5);
        LibroDigital libroDigital = new LibroDigital("1984", "George Orwell", 1949, "PDF", 5000);

        biblioteca.agregarLibro(libroFisico);
        biblioteca.agregarLibro(libroDigital);
        biblioteca.mostrarLibros();

        libroFisico.prestarLibro();
        biblioteca.mostrarLibros();

        biblioteca.buscarLibroPorTitulo("1984");
    }
}
