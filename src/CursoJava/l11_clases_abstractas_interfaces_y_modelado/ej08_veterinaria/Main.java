/*
 * Lección 11 – Clases abstractas, interfaces y modelado
 * Objetivo: Atender a los animales de una veterinaria según lo que cada uno sabe hacer.
 * Concepto: Una clase extiende una sola clase abstracta pero implementa varias interfaces.
 */
package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej08_veterinaria;

public class Main {
  public static void main(String[] args) {
    Gato nina = new Gato("Nina");
    Perro firulais = new Perro("Firulais");

    Animal[] pacientes = { nina, firulais };
    for (Animal animal : pacientes) {
      animal.tipoDeAnimal();
      animal.emitirSonido();
    }

    // Mismo objeto, visto por cada contrato que cumple.
    Mascota[] mascotas = { nina, firulais };
    for (Mascota mascota : mascotas) {
      mascota.saludar();
      mascota.jugar();
      mascota.despedirse();
    }

    Domestico domestico = nina;
    domestico.alimentar();
  }
}
