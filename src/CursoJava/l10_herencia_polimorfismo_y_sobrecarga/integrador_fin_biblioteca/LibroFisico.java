package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.integrador_fin_biblioteca;

public class LibroFisico extends Libro {
    private final int paginas;
    private final String ubicacion;
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
