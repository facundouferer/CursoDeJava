import java.util.ArrayList;

class Mascota {
  public void sonido() {
    System.out.println("Sonido de una mascota");
  }
}

class Tortuga extends Mascota {
  @Override
  public void sonido() {
    System.out.println("Sonido de una tortuga: ¡Silencio!");
  }
}

class Perro extends Mascota {
  @Override
  public void sonido() {
    System.out.println("Sonido de un perro: ¡Guau!");
  }
}

class Gato extends Mascota {
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
    mascotas.add(new Tortuga());
    mascotas.add(new Perro());
    mascotas.add(new Gato());
    mascotas.add(new Perro());
    mascotas.add(new Gato());

    // Imprimir el sonido de cada mascota
    for (Mascota mascota : mascotas) {
      mascota.sonido();
    }

  }
}
