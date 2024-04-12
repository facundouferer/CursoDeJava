/**
 * 20) Se desea escribir un algoritmo que pida la altura de una persona, 
 * si la altura es menor o igual a 150 cm envíe el mensaje: “Persona de altura baja”; 
 * si la altura está entre 151 y 170 escriba el mensaje: “Persona de altura media” 
 * y si la altura es mayor al 171 escriba el mensaje: “Persona alta”. 
 */
package CursoJava.EjerciciosResueltos;

public class ej20PersonaDeALturaBaja {

  public static void main(String[] args) {
    double altura = 160;

    if (altura <= 150) {
      System.out.println("Persona de altura baja");
    } else if (altura > 150 && altura <= 170) {
      System.out.println("Persona de altura media");
    } else {
      System.out.println("Persona alta");
    }
  }

}
