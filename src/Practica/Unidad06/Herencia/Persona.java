package Practica.Unidad06.Herencia;

class Persona {
  String nombre;
  int edad;

  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public void verAtributos() {
    System.out.print("Nombre: " + nombre + ", Edad: " + edad);
  }
}

class Empleado extends Persona {
  double sueldo;

  public Empleado(String nombre, int edad, double sueldo) {
    super(nombre, edad);
    this.sueldo = sueldo;
  }

  @Override
  public void verAtributos() {
    super.verAtributos();
    System.out.println(" Sueldo: " + sueldo);
  }

  public static void main(String[] args) {
    Empleado empleado = new Empleado("Juan", 30, 3000);
    empleado.verAtributos();
  }
}
