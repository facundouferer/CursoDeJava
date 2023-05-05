package CursoJava.POO;
/**Ejercicio 2:
 Crear una clase Libro que contenga los siguientes atributos:
 1. ISBN, Título, Autor, Número de páginas
 Crear sus respectivos métodos get y set correspondientes para cada atributo. Crear el método
 toString() para mostrar la información relativa al libro con el siguiente formato:
 “El libro con ISBN creado por el autor tiene páginas”
 Crear una aplicación que permita crear 2 objetos Libro (los valores que se quieran) y mostrarlos
 por pantalla. Por último, indicar cuál de los 2 tiene más páginas.*/
public class Ejercicio02 {

    public static void main(String[] args) {

        // Creamos dos objetos de la clase Libro
        Libro libro1 = new Libro("978-842-330-375-8", "El Quijote", "Miguel de Cervantes", 864);
        Libro libro2 = new Libro("978-080-214-830-6", "1984", "George Orwell", 336);

        // Imprimimos la información de los libros
        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        // Comparamos los libros por número de páginas
        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
            System.out.println("El libro " + libro1.getTitulo() + " tiene más páginas.");
        } else if (libro1.getNumPaginas() < libro2.getNumPaginas()) {
            System.out.println("El libro " + libro2.getTitulo() + " tiene más páginas.");
        } else {
            System.out.println("Ambos libros tienen el mismo número de páginas.");
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

    // Métodos Get y Set
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

    // Método toString
    public String toString() {
        return "El libro con ISBN " + isbn + " creado por " + autor + " tiene " + numPaginas + " páginas.";
    }
}

