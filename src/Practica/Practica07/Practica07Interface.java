package Practica.Practica07;

class Animal {
  private String nombre;

  Animal(String nombre) {
    this.nombre = nombre;
  }

  public void hacerSonido() {
    System.out.println("El animal hace un sonido");
  }

  public String getNombre() {
    return nombre;
  }
}

class Perro extends Animal implements Mascota {

  Perro(String nombre) {
    super(nombre);
  }

  @Override
  public void jugar() {
    System.out.println("El perro " + super.getNombre() + " juega con una pelota.");
  }

  @Override
  public void hacerSonido() {
    System.out.println("El perro ladra");
  }
}

class Gato extends Animal implements Mascota, Domestico {

  Gato(String nombre) {
    super(nombre);
  }

  @Override
  public void alimentar() {
    System.out.println("El gato " + super.getNombre() + " está siendo alimentado.");
  }

  @Override
  public void jugar() {
    System.out.println("El gato " + super.getNombre() + " juega con un ovillo de lana.");
  }

  @Override
  public void hacerSonido() {
    System.out.println("El gato maulla");
  }
}

interface Mascota {
  public void jugar();

  default void saludar() {
    System.out.println("Hola, soy tu mascota!");
  }

  default void despedirse() {
    System.out.println("Adiós, hasta luego!");
  }
}

interface Domestico {
  public void alimentar();
}

public class Practica07Interface {
  public static void main(String[] args) {
    Gato nina = new Gato("Nina");
    nina.hacerSonido();
    nina.jugar();
    nina.alimentar();
    nina.saludar();
  }
}
