package Ejercicios;

/**
 * Ejercicio 2:
 * Crear una clase Libro que contenga los siguientes atributos:
 * 1. ISBN, T�tulo, Autor, N�mero de p�ginas
 * Crear sus respectivos m�todos get y set correspondientes para cada atributo.
 * Crear el m�todo
 * toString() para mostrar la informaci�n relativa al libro con el siguiente
 * formato:
 * �El libro con ISBN creado por el autor tiene p�ginas�
 * Crear una aplicaci�n que permita crear 2 objetos Libro (los valores que se
 * quieran) y mostrarlos
 * por pantalla. Por �ltimo, indicar cu�l de los 2 tiene m�s p�ginas.
 */
public class Ejercicio02 {

    public static void main(String[] args) {

        // Creamos dos objetos de la clase Libro
        Libro libro1 = new Libro("978-842-330-375-8", "El Quijote", "Miguel de Cervantes", 864);
        Libro libro2 = new Libro("978-080-214-830-6", "1984", "George Orwell", 336);

        // Imprimimos la informaci�n de los libros
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        // Comparamos los libros por n�mero de p�ginas
        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
            System.out.println("El libro " + libro1.getTitulo() + " tiene m�s p�ginas.");
        } else if (libro1.getNumPaginas() < libro2.getNumPaginas()) {
            System.out.println("El libro " + libro2.getTitulo() + " tiene m�s p�ginas.");
        } else {
            System.out.println("Ambos libros tienen el mismo n�mero de p�ginas.");
        }
    }
}

class Libro {

    // Atributos
    private String isbn;
    private String titulo;
    private String autor;
    private int numPaginas;

    // Constructores
    public Libro(String isbn, String titulo, String autor, int numPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    // M�todos Get y Set
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    // M�todo toString
    public String toString() {
        return "El libro con ISBN " + isbn + " creado por " + autor + " tiene " + numPaginas + " p�ginas.";
    }
}
