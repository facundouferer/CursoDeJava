package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej08_veterinaria;

public class Gato extends Animal implements Mascota, Domestico {
  public Gato(String nombre) {
    super(nombre);
  }

  @Override
  public void tipoDeAnimal() {
    System.out.println("Soy un gato");
  }

  @Override
  public void emitirSonido() {
    System.out.println("miau, miau, miau");
  }

  @Override
  public void jugar() {
    System.out.println("El gato " + getNombre() + " juega con un ovillo de lana.");
  }

  @Override
  public void alimentar() {
    System.out.println("El gato " + getNombre() + " está siendo alimentado.");
  }
}
