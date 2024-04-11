package CursoJava.EstructurasIterativas;

public class ej06ForEach {
    public static void main(String[] args) {

        String listaDePersonas[] = { "Rita", "Facundo", "Carlos", "Belén", "Analía" };

        for (String persona : listaDePersonas) {
            System.out.println(persona);
        }
    }
}
