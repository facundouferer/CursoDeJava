package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej04_pedido;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Representar a un cliente que luego se asocia a un pedido.
 * Concepto: 5. Referencias vs. copia de objetos (un objeto que referencia a otro).
 */
public class Cliente {

    private final String nombre;
    private final int edad;

    public Cliente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String verAtributos() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}
