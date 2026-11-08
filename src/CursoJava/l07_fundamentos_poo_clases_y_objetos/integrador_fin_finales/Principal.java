package CursoJava.l07_fundamentos_poo_clases_y_objetos.integrador_fin_finales;

/**
 * Integrador – Examen final: Persona (Lección 7 – Fundamentos de POO: clases y objetos)
 *
 * Enunciado: Definir la clase Persona con nombre, apellido y DNI, un constructor y los métodos
 * getDatos y setDatos. La clase Principal crea una persona, muestra sus datos, los modifica y los muestra de nuevo.
 *
 * Concepto: clase, atributos privados, constructor, objetos y métodos de acceso.
 */
public class Principal {
    public static void main(String[] args) {
        Persona persona = new Persona("Ana", "Gómez", 30123456);
        System.out.println(persona.getDatos());

        persona.setDatos("Ana María", "Gómez", 30123456);
        System.out.println(persona.getDatos());
    }
}
