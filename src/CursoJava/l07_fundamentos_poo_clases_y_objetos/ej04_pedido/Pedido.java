package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej04_pedido;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Asociar un pedido con el cliente que lo realizó y mostrar sus detalles.
 * Concepto: 5. Referencias vs. copia de objetos (un objeto que referencia a otro).
 */
public class Pedido {

    private final int numero;
    private final Cliente cliente;

    public Pedido(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
    }

    public void verDetalles() {
        System.out.println("Pedido N°: " + numero);
        System.out.println("Cliente: " + cliente.verAtributos());
    }
}
