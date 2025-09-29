package Practica.Universidad;

public class Principal {
  public static void main(String[] args) {
    Docente docente = new Docente("Juan", "Perez", 12345678, 50000, "Matematicas");
    System.out.println(docente.generarInforme("Informe del Docente"));
  }
}
