/**
 * 18) Determinar la cantidad de dinero que recibirá un trabajador por concepto de las horas extras trabajadas en una empresa, 
 * sabiendo que cuando las horas de trabajo exceden de 40, el resto se consideran horas extras y que estas 
 * se pagan al doble de una hora normal cuando no exceden de 8; si las horas extras exceden de 8 se pagan las 
 * primeras 8 al doble de lo que se pagan las horas normales y el resto al triple. 
 */
package CursoJava.EjerciciosResueltos;

public class ej18HorasExtras {

  public static void main(String[] args) {
    int horasTrabajadas = 50;
    int horasNormales = 40;
    int horasExtras = horasTrabajadas - horasNormales;
    int valorHora = 10;
    int valorHoraExtra = 0;
    int valorHoraExtraDoble = 0;
    int valorHoraExtraTriple = 0;
    int totalHorasExtras = 0;
    int totalHorasExtrasDoble = 0;
    int totalHorasExtrasTriple = 0;
    int totalHorasNormales = 0;
    int totalHoras = 0;
    int totalPagar = 0;

    if (horasExtras > 0) {
      if (horasExtras <= 8) {
        valorHoraExtra = valorHora * 2;
        totalHorasExtras = horasExtras;
        totalHorasExtrasDoble = totalHorasExtras;
        totalHorasExtrasTriple = 0;
      } else {
        valorHoraExtra = valorHora * 2;
        valorHoraExtraDoble = valorHora * 2;
        valorHoraExtraTriple = valorHora * 3;
        totalHorasExtras = horasExtras;
        totalHorasExtrasDoble = 8;
        totalHorasExtrasTriple = totalHorasExtras - 8;
      }
    }

    totalHorasNormales = horasNormales;
    totalHoras = totalHorasNormales + totalHorasExtras;
    totalPagar = (totalHorasNormales * valorHora) + (totalHorasExtrasDoble * valorHoraExtraDoble)
        + (totalHorasExtrasTriple * valorHoraExtraTriple);

    System.out.println("Total horas trabajadas: " + totalHoras);
    System.out.println("Total horas normales: " + totalHorasNormales);
    System.out.println("Total horas extras: " + totalHorasExtras);
    System.out.println("Total horas extras doble: " + totalHorasExtrasDoble);
    System.out.println("Total horas extras triple: " + totalHorasExtrasTriple);
    System.out.println("Total a pagar: " + totalPagar);
  }

}
