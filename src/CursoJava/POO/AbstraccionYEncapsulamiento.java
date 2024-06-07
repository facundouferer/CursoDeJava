class Persona {
  private String nombre;
  private int edad;

  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void cumplirAños() {
    this.edad++;
  }
}

public class AbstraccionYEncapsulamiento {
  public static void main(String[] args) {
    Persona p1 = new Persona("Juan", 30);
    System.out.println("Nombre: " + p1.getNombre());
    System.out.println("Edad: " + p1.getEdad());
    p1.cumplirAños();
    System.out.println("Edad: " + p1.getEdad());
  }
}
