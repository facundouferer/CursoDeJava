package CursoJava.Interfaces.FigurasAbstractas;

public class Main {
  public static void main(String[] args) {
    Circulo circulo = new Circulo("Rojo", 5);
    Rectangulo rectangulo = new Rectangulo("Azul", 4, 6);

    System.out.println(circulo.mostrarInformacion());
    System.out.println(rectangulo.mostrarInformacion());
  }
}
