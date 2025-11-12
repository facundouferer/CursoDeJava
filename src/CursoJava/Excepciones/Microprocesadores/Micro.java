package CursoJava.Excepciones.Microprocesadores;

class Micro {
  int nroProducto, nucleos;
  double frecuencia, memoria;
  String modelo;

  public Micro(int nroProducto, int nucleos, double frecuencia, double memoria, String modelo) {
    super();
    this.nroProducto = nroProducto;
    this.nucleos = nucleos;
    this.frecuencia = frecuencia;
    this.memoria = memoria;
    this.modelo = modelo;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) // si el objeto es el mismo, es obvio que son iguales
      return true;
    if (obj == null) // si el objeto es nulo, no hay nada, por lo tanto no es el mismo
      return false;
    if (getClass() != obj.getClass()) // Si son de clases distintas, no son iguales (obviamente)
      return false;
    Micro other = (Micro) obj; // Parseo, para intanciar el objeto recibido como parametro
    if (this.nroProducto != other.nroProducto) // si no coinciden los numeros de producto, no son iguales
      return false;
    return true; // si paso todas las pruebas, son iguales -> los nroProducto coinciden
  }

  @Override
  public int hashCode() {
    return Integer.hashCode(nroProducto);
  }

  @Override
  public String toString() {
    return nroProducto + "\t" + modelo + "\t" + nucleos + "Nucleos \t" + frecuencia + "GHz\t " + memoria + "MB";
  }

}
