package Practica.Universidad;

class Empleado extends Persona {
  private double sueldo;

  public Empleado(String nombre, String apellido, int DNI, double sueldo) {
    super(nombre, apellido, DNI);
    this.sueldo = sueldo;
  }

  public double getSueldo() {
    return sueldo;
  }

}
