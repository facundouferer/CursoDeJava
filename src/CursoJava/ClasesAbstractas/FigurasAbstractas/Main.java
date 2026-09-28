package CursoJava.ClasesAbstractas.FigurasAbstractas;

public class Main {
  public static void main(String[] args) {
    Figura circulo = new Circulo("Rojo", 5);
    Figura rectangulo = new Rectangulo("Azul", 4, 6);

    System.out.println(circulo.mostrarInformacion());
    System.out.println(rectangulo.mostrarInformacion());
  }
}
