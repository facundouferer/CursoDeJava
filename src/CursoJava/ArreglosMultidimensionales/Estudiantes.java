package CursoJava.ArreglosMultidimensionales;

public class Estudiantes {
  public static void main(String[] args) {
    // arreglo de estudiantes connombre y dentro un arreglo con sus calificaciones
    String[][] estudiantes = {
        { "Juan", "10", "9", "8", "7", "10" },
        { "Maria", "9", "8", "7", "6", "9" },
        { "Pedro", "8", "7", "6", "5", "8" },
        { "Jose", "7", "6", "5", "4", "7" },
        { "Luis", "6", "5", "4", "3", "6" }
    };
    // recorrido de los estudiantes y mostrar con un foreach
    for (String[] estudiante : estudiantes) {
      System.out.println("Estudiante: " + estudiante[0]);
      System.out.print("Calificaciones: ");
      double promedio = 0;
      for (int i = 1; i < estudiante.length; i++) {
        promedio += Double.parseDouble(estudiante[i]);
        System.out.print(estudiante[i] + ", ");
      }
      promedio /= (estudiante.length - 1);
      System.out.println("\nPromedio: " + promedio);
      System.out.println("");
    }
  }
}
