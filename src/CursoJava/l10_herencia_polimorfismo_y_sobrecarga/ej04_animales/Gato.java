package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.ej04_animales;

/*
 * Lección 10 – Herencia, polimorfismo y sobrecarga
 * Objetivo: representar a un gato que maúlla.
 */
class Gato extends Animal {

    @Override
    public void hacerSonido() {
        System.out.println("Maullido");
    }
}
