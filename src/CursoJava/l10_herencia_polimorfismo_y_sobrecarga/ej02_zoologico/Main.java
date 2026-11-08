package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.ej02_zoologico;

/*
 * Lección 10 – Herencia, polimorfismo y sobrecarga
 * Objetivo: mostrar los animales de un zoológico mediante la sobrescritura de toString.
 * Concepto: 3. Sobrescritura y 5. Polimorfismo.
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido al Zoológico");

        Animal[] animales = {
            new Terrestre("León", 4, "Terrestre", 1),
            new Terrestre("Elefante", 4, "Terrestre", 1),
            new Aereo("Águila", 2, "Aéreo", true),
            new Terrestre("Tortuga", 4, "Terrestre", 2),
            new Terrestre("Serpiente", 0, "Terrestre", 2)
        };

        for (Animal animal : animales) {
            System.out.println(animal);
        }
    }
}
