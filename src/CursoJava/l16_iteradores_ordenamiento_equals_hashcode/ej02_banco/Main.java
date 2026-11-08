package CursoJava.l16_iteradores_ordenamiento_equals_hashcode.ej02_banco;

/**
 * Lección 16 – Iteradores, Ordenamiento y Contrato equals/hashCode
 * Objetivo: Recorrer, eliminar y detectar clientes repetidos en un banco, en tres etapas.
 * Concepto: 1. Iteradores, 5. El contrato equals y 6. hashCode.
 */
public class Main {
  public static void main(String[] args) {
    Banco banco = new Banco();
    Cliente ana = new Cliente("Ana Juana", "357159", 1000000, 35147852);
    Cliente ricardo = new Cliente("Ricardo Ricardo", "987456", 3000, 36987456);
    Cliente anita = new Cliente("Anita Verón", "12312", 3000, 36258741);

    banco.agregar(ana);
    banco.agregar(ricardo);
    banco.agregar(anita);

    System.out.println("--- Recorrido con Iterator ---");
    banco.mostrarNombres();

    banco.eliminarPorNombre("Ricardo Ricardo");
    System.out.println("\n--- Después de eliminar a Ricardo Ricardo ---");
    banco.listar();

    System.out.println("\n--- equals: identidad por DNI ---");
    Cliente ricardoOtraVez = new Cliente("Ricardo García", "987456", 3000, 36987456);
    System.out.println("¿Ricardo es igual a Ricardo García (mismo DNI)? " + ricardo.equals(ricardoOtraVez));
    System.out.println("¿Ana es igual a Anita? " + ana.equals(anita));

    System.out.println("\n--- hashCode: el conjunto rechaza repetidos ---");
    System.out.println("hashCode de Ricardo:        " + ricardo.hashCode());
    System.out.println("hashCode de Ricardo García: " + ricardoOtraVez.hashCode());
    System.out.println("¿Se agregó a Ricardo? " + banco.agregar(ricardo));
    System.out.println("¿Se agregó a Ricardo García (mismo DNI)? " + banco.agregar(ricardoOtraVez));
    System.out.println("\nListado de clientes:");
    banco.listar();
  }
}
