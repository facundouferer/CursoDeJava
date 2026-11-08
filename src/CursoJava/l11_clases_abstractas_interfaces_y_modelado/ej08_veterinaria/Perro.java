package CursoJava.l11_clases_abstractas_interfaces_y_modelado.ej08_veterinaria;

public class Perro extends Animal implements Mascota {
  public Perro(String nombre) {
    super(nombre);
  }

  @Override
  public void tipoDeAnimal() {
    System.out.println("Soy un perro");
  }

  @Override
  public void emitirSonido() {
    System.out.println("guau, guau, guau");
  }

  @Override
  public void jugar() {
    System.out.println("El perro " + getNombre() + " juega con una pelota.");
  }
}
