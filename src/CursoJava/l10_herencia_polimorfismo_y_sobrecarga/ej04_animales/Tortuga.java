package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.ej04_animales;

/*
 * Lección 10 – Herencia, polimorfismo y sobrecarga
 * Objetivo: representar a una tortuga, que además de su sonido sabe nadar.
 * Concepto: 5. Casteo e instanceof.
 */
class Tortuga extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("Silencio");
    }

    public void nadar() {
        System.out.println("Nadando");
    }
}
