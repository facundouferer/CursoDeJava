package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.ej04_animales;

/*
 * Lección 10 – Herencia, polimorfismo y sobrecarga
 * Objetivo: hacer sonar una colección de animales y usar un comportamiento propio de una subclase.
 * Concepto: 5. Polimorfismo y despacho dinámico, casteo e instanceof.
 */
public class Main {

    public static void main(String[] args) {
        Animal[] animales = { new Animal(), new Perro(), new Gato(), new Tortuga() };

        for (Animal animal : animales) {
            animal.hacerSonido();
            if (animal instanceof Tortuga tortuga) {
                tortuga.nadar();
            }
        }
    }
}
