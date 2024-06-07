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

public class PolimorfismoConMascota {
  public static void main(String[] args) {
    Mascota miMascota;

    miMascota = new Tortuga();
    miMascota.sonido(); // Imprime: Sonido de una tortuga: ¡Silencio!

    miMascota = new Perro();
    miMascota.sonido(); // Imprime: Sonido de un perro: ¡Guau!

    miMascota = new Gato();
    miMascota.sonido(); // Imprime: Sonido de un gato: ¡Miau!
  }
}
