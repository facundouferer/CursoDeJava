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

public class HerenciaYPolimorfismo {
  public static void main(String[] args) {
    Animal miPerro = new Perro();
    Animal miGato = new Gato();

    miPerro.hacerSonido(); // Ladrido
    miGato.hacerSonido(); // Maullido
  }
}
