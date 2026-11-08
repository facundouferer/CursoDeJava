package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.integrador_fin_biblioteca;

public class Libro {
    private final String titulo;
    private final String autor;
    private final int publicacion;

    public Libro(String titulo, String autor, int publicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Año de publicación: " + publicacion;
    }
}
