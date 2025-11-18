package Practica.Unidad06.ClasesyObjetos;

class Persona {
  private String nombre;
  private int edad;

  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public void saludar() {
    System.out.println("Hola, mi nombre es " + nombre);
  }

  public void mostrarEdad() {
    System.out.println("Tengo " + edad + " años");
  }
}

class Main {
  public static void main(String[] args) {
    Persona persona1 = new Persona("Carlos", 30);
    Persona persona2 = new Persona("Ana", 25);

    persona1.saludar();
    persona2.mostrarEdad();
    persona1 = persona2;
    persona1.mostrarEdad();
    persona1.saludar();
  }
}
