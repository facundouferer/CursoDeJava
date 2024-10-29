
class Humane {

  private String nombre;
  private String apellido;
  private int dni;

  public Humane(String nombre, String apellido, int dni) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.dni = dni;
  }

  public String toString() {
    return "Nombre: " + this.nombre + "\nApellido: " + this.apellido + "\nDNI: " + this.dni;
  }

}

class Empleado extends Humane {

  private double sueldo;

  public Empleado(String nombre, String apellido, int dni, double sueldo) {
    super(nombre, apellido, dni);
    this.sueldo = sueldo;
  }

  public String toString() {
    return "\n" + super.toString() + "\nSueldo: " + this.sueldo;
  }
}

class Caja {
  private Empleado empleado;
  private int nroCaja;

    public Caja(Empleado empleado, int nroCaja) {
      this.empleado = empleado;
      this.nroCaja = nroCaja;
  }


  public String toString() {
    return this.empleado.toString() + "\nNro de caja: " + this.nroCaja;
  }

}

class Cliente extends Humane {

  private boolean mayorista;

  public Cliente(String nombre, String apellido, int dni, boolean mayorista) {
    super(nombre, apellido, dni);
    this.mayorista = mayorista;
  }

  public String toString() {
    return "\n" + super.toString() + "\nMayorista: " + this.mayorista;
  }

}

class ConceptosFundamentales {
  public static void main(String[] args) {

    Cliente cliente = new Cliente("Juan", "Perez", 12345678, true);
    System.out.println(cliente);
  }

}
