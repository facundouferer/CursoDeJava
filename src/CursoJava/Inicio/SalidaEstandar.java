package CursoJava.Inicio;

public class SalidaEstandar {
  public static void main(String[] args) {

    String textoUno = "Hola";
    String textoDos = "Mundo";

    System.out.println("-------------------");
    System.out.println(textoUno + " " + textoDos + ". ");

    System.out.println("-------------------");
    System.out.print(textoUno);
    System.out.print(" ");
    System.out.print(textoDos);
    System.out.println(".");

    System.out.println("-------------------");

    System.out.println("-------------------");
    System.out.printf(" %s %s.%n", textoUno, textoDos);

    System.out.println("-------------------");
    System.out.print(textoUno + "\n\t" + textoDos + "\n");
    System.out.print(textoUno + "\f" + textoDos + "\f" + textoDos + "\n");
    System.out.println("-------------------");
  }

}
