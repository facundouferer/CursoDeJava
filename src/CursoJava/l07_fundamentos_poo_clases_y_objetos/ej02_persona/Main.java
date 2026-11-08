package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej02_persona;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Crear dos personas independientes y observar qué ocurre al copiar una referencia.
 * Concepto: 3. Ejemplo práctico: modelando una clase Persona y 5. Referencias vs. copia de objetos.
 */
public class Main {

    public static void main(String[] args) {
        Persona carlos = new Persona("Carlos", 30);
        Persona ana = new Persona("Ana", 25);

        carlos.saludar();
        ana.mostrarEdad();

        // Se copia la referencia, no el objeto: ambas variables apuntan ahora a Ana.
        carlos = ana;
        carlos.mostrarEdad();
        carlos.saludar();
    }
}
