
class Cliente {
  private String nombre, apellido;

  public Cliente(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getApellido() {
    return apellido;
  }

}

class Caja {

  private int nroCaja;
  private Cliente cliente;

  public Caja(int nroCaja, Cliente cliente) {
    this.nroCaja = nroCaja;
    this.cliente = cliente;
  }

  public void setNroCaja(int nroCaja) {
    this.nroCaja = nroCaja;
  }

  public int getNroCaja() {
    return nroCaja;
  }

  public String toString() {
    String datosDeLaCaja = "Caja: " + nroCaja + " - " + this.cliente.getNombre() + " " + this.cliente.getApellido();
    return datosDeLaCaja;
  }

}

public class ConceptosFundamentales {
  public static void main(String[] args) {

    Cliente clienteDePedro = new Cliente("Juan", "Perez");
    Caja cajaDePedro = new Caja(345, clienteDePedro);
    cajaDePedro.setNroCaja(12345);
    System.out.println(cajaDePedro.toString());
  }

}
