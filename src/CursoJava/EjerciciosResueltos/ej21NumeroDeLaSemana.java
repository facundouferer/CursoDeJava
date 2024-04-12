/**
 * 21) Dado un numero entre 1 y 7 escriba su correspondiente día de la semana así: 
 * 1- Lunes 2- Martes 3- Miércoles 4- Jueves 5- Viernes 6- Sábado 7- Domingo
 */
package CursoJava.EjerciciosResueltos;

public class ej21NumeroDeLaSemana {

  public static void main(String[] args) {
    int dia = 3;

    switch (dia) {
      case 1:
        System.out.println("Lunes");
        break;
      case 2:
        System.out.println("Martes");
        break;
      case 3:
        System.out.println("Miércoles");
        break;
      case 4:
        System.out.println("Jueves");
        break;
      case 5:
        System.out.println("Viernes");
        break;
      case 6:
        System.out.println("Sábado");
        break;
      case 7:
        System.out.println("Domingo");
        break;
      default:
        System.out.println("Número de día no válido");
        break;
    }
  }

}
