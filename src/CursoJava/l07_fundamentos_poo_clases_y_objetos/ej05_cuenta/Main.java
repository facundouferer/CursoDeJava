package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej05_cuenta;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Crear cuentas con distintos constructores y operar con ellas.
 * Concepto: 6. Ejercicio práctico guiado: sistema de gestión de cuentas bancarias.
 */
public class Main {

    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Juan Pérez", 1500);
        Cuenta cuenta2 = new Cuenta("María González"); // saldo inicial en cero
        Cuenta cuenta3 = new Cuenta("Carlos", 1231243123);

        cuenta1.ingresar(500);
        cuenta2.retirar(200);
        cuenta3.ingresar(1000000);

        System.out.println("Cuenta 1: " + cuenta1.getTitular() + " - Saldo: " + cuenta1.getCantidad());
        System.out.println("Cuenta 2: " + cuenta2.getTitular() + " - Saldo: " + cuenta2.getCantidad());
        System.out.println("Cuenta 3: " + cuenta3.getTitular() + " - Saldo: " + cuenta3.getCantidad());
        System.out.println(cuenta3);
    }
}
