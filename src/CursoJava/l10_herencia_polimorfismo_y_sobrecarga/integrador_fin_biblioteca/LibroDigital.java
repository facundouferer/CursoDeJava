package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.integrador_fin_biblioteca;

public class LibroDigital extends Libro {
    private final String formato;
    private final int tamanoArchivo;

    public LibroDigital(String titulo, String autor, int publicacion, String formato, int tamanoArchivo) {
        super(titulo, autor, publicacion);
        this.formato = formato;
        this.tamanoArchivo = tamanoArchivo;
    }

    @Override
    public String toString() {
        return super.toString() + ", Formato: " + formato + ", Tamaño del archivo: " + tamanoArchivo + " KB";
    }
}
