import java.util.ArrayList;

class Mascota {
  private String nombre;

  public Mascota(String nombre) {
    this.nombre = nombre;
  }

  public void sonido() {
    System.out.println("Sonido de una mascota");
  }
}

class Tortuga extends Mascota {

  public Tortuga(String nombre) {
    super(nombre);
  }

  @Override
  public void sonido() {
    System.out.println("Sonido de una tortuga: ¡Silencio!");
  }
}

class Perro extends Mascota {

  public Perro(String nombre) {
    super(nombre);
  }

  @Override
  public void sonido() {
    System.out.println("Sonido de un perro: ¡Guau!");
  }
}

class Gato extends Mascota {

  public Gato(String nombre) {
    super(nombre);
  }

  @Override
  public void sonido() {
    System.out.println("Sonido de un gato: ¡Miau!");
  }
}

public class ArrayDeObjetos {
  public static void main(String[] args) {

    // ArrayList de Mascotas
    ArrayList<Mascota> mascotas = new ArrayList<>();

    // Agregar 5 mascotas al ArrayList
    mascotas.add(new Tortuga("Manuelita"));
    mascotas.add(new Perro("Firulais"));
    mascotas.add(new Gato("Nina"));
    mascotas.add(new Perro("Pelusa"));
    mascotas.add(new Gato("Michi"));

    Mascota mascota1 = new Mascota("carlitos");
    mascotas.add(mascota1);

    // Imprimir el sonido de cada mascota
    for (Mascota mascota : mascotas) {
      mascota.sonido();
    }

  }
}
