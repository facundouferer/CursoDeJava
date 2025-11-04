package CursoJava.TAD;

class Persona {
  String nombre;
  int edad;
  int dni;

  Persona(String nombre, int edad, int dni) {
    this.nombre = nombre;
    this.edad = edad;
    this.dni = dni;
  }

  @Override
  public String toString() {
    return nombre + " (" + edad + " años)";
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null || getClass() != obj.getClass())
      return false;
    Persona otra = (Persona) obj;
    return this.dni == otra.dni;
  }
}

class AdministradorDePersonas {

  public static void main(String[] args) {
    SinglyLinkedList<Persona> listaPersonas = new SinglyLinkedList<>();

    listaPersonas.addLast(new Persona("Ana", 28, 12345678));
    Persona luis1 = new Persona("Luis", 34, 87654321);
    listaPersonas.addLast(luis1);
    listaPersonas.addLast(new Persona("Marta", 22, 11223344));

    System.out.println("Lista de personas:");
    listaPersonas.printAll();

    System.out.println("Eliminando a Luis...");
    Persona luis2 = new Persona("Carlos 2", 99, 87654328);

    if (listaPersonas.contains(luis2)) {
      System.out.println("Luis está en la lista.");
    } else {
      System.out.println("Luis no está en la lista.");
    }

    listaPersonas.remove(luis2);
    System.out.println("Lista actualizada de personas:");
    listaPersonas.printAll();

  }

}
