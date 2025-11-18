package Practica.Unidad06.MetodosEstaticos;

class Tools {
  private static int contador = 0;

  public static void incrementar() {
    contador++;
  }

  public static int getContador() {
    return contador;
  }

  public static void mensaje(String mensaje) {
    System.out.println(mensaje);
  }
}

class Principal {
  public static void main(String[] args) {
    Tools.mensaje("inicial: " + Tools.getContador());
    Tools.incrementar();
    Tools.incrementar();
    Tools.mensaje("después de incrementar: " + Tools.getContador());
  }
}
