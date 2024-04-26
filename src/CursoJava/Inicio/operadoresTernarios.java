package CursoJava.Inicio;

public class operadoresTernarios {
  public static void main(String[] args) {
    int uno = 1;
    int dos = 2;
    int tres = 3;
    int cuatro = 4;
    String mensaje = ((uno != dos) || (tres == cuatro)) ? "VERDADERO" : "FALSO";
    System.out.println(mensaje);
  }
}
