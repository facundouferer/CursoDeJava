package Parciales.Unidad06.Sobrescritura;

class Animal {
  public void hacerSonido() {
    System.out.println("El animal hace un sonido");
  }
}

class Perro extends Animal {
  @Override
  public void hacerSonido() {
    System.out.println("El perro ladra");
  }
}

class Main {
  public static void main(String[] args) {
    Animal miAnimal = new Perro();
    miAnimal.hacerSonido();
  }
}
