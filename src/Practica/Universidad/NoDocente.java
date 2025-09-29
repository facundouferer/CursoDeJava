package Practica.Universidad;

class NoDocente extends Empleado {
  private String area;

  public NoDocente(String nombre, String apellido, int DNI, double sueldo, String area) {
    super(nombre, apellido, DNI, sueldo);
    this.area = area;
  }
}
