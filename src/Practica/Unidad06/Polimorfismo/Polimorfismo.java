package Practica.Unidad06.Polimorfismo;

import java.util.ArrayList;

class Animal {
  public void hacerSonido() {
    System.out.print("Sonido de animal ");
  }
}

class Perro extends Animal {
  @Override
  public void hacerSonido() {
    System.out.print("Guau ");
  }
}

class Gato extends Animal {
  @Override
  public void hacerSonido() {
    System.out.println("Miau ");
  }
}

class Polimorfismo {
  public static void main(String[] args) {
    ArrayList<Animal> animales = new ArrayList<>();
    animales.add(new Animal());
    Gato gato = new Gato();

    for (Animal animal : animales) {
      animal.hacerSonido();
    }
  }
}
