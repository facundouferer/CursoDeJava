package CursoJava.l21_acceso_a_bases_de_datos_jdbc.integrador_bd_hospital;

/** Doctor del hospital con su especialidad. */
public class Doctor extends Persona {

  private final String especialidad;

  public Doctor(String nombre, int edad, String especialidad) {
    super(nombre, edad);
    this.especialidad = especialidad;
  }

  public String getEspecialidad() {
    return especialidad;
  }
}
