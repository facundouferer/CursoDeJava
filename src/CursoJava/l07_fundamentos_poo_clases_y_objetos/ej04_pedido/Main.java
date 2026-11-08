package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej04_pedido;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Crear un cliente, asociarlo a un pedido y mostrar los detalles del pedido.
 * Concepto: 5. Referencias vs. copia de objetos (un objeto que referencia a otro).
 */
public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana", 25);
        Pedido pedido = new Pedido(123, cliente);
        pedido.verDetalles();
    }
}
