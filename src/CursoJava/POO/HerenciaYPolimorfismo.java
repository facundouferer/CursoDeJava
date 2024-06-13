class Animal {
  public void hacerSonido() {
    System.out.println("Sonido de animal");
  }
}

class Perro extends Animal {
  @Override
  public void hacerSonido() {
    System.out.println("Ladrido");
  }
}

class Gato extends Animal {
  @Override
  public void hacerSonido() {
    System.out.println("Maullido");
  }
}

class Tortuga extends Animal {
  @Override
  public void hacerSonido() {
    System.out.println("Silencio");
  }

  public void nadar() {
    System.out.println("Nadando");
  }
}

public class HerenciaYPolimorfismo {
  public static void main(String[] args) {
    Animal miPerro = new Perro();
    Animal miGato = new Gato();
    Tortuga miTortuga = new Tortuga();

    miPerro.hacerSonido(); // Ladrido
    miGato.hacerSonido(); // Maullido
    // miGato.nadar(); esto da Error porque no está en la clase. Solo en Tortuga
    miTortuga.hacerSonido(); // Silencio
    miTortuga.nadar(); // Nadando
  }
}
