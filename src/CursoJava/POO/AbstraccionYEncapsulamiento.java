class PersonaObjeto {
  private String nombre;
  private int edad;

  public PersonaObjeto(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void cumplirAnioos() {
    this.edad++;
  }

}

public class AbstraccionYEncapsulamiento {
  public static void main(String[] args) {
    PersonaObjeto p1 = new PersonaObjeto("Juan", 30);
    System.out.println("Nombre: " + p1.getNombre());
    System.out.println("Edad: " + p1.getEdad());
    p1.cumplirAnioos();
    System.out.println("Edad: " + p1.getEdad());
  }
}
