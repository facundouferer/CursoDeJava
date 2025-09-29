package Practica.Universidad;

class Persona implements Informe {
  private String nombre;
  private String apellido;
  private int DNI;

  public Persona(String nombre, String apellido, int DNI) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.DNI = DNI;
  }

  @Override
  public String generarInforme(String titulo) {
    String informe = "\n" + titulo + "\n" +
        "Nombre: " + nombre + " " + apellido + "\n" +
        "DNI: " + DNI;
    return informe;
  }

}
