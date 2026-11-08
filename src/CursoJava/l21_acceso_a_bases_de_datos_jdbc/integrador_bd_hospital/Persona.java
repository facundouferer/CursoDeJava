package CursoJava.l21_acceso_a_bases_de_datos_jdbc.integrador_bd_hospital;

/** Datos comunes de pacientes y doctores. */
public abstract class Persona {

  protected final String nombre;
  protected final int edad;

  protected Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }

  public String getNombre() {
    return nombre;
  }

  public int getEdad() {
    return edad;
  }
}
