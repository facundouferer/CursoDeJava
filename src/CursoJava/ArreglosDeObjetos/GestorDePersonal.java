import java.util.Scanner;

package CursoJava.ArreglosDeObjetos;

class GestorDePersonal {

    public static void main(String[] args) {
        // Crear un arreglo de objetos de tipo Persona

        Agenda listaDePersonas = new Agenda();

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n===== MENÚ =====");
            System.out.println("1) Agregar Persona");
            System.out.println("2) Listar Personas");
            System.out.println("3) Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Ingrese el nombre: ");
                    String nombre = scanner.next();

                    System.out.print("Ingrese el DNI: ");
                    int dni = scanner.nextInt();

                    listaDePersonas.agregarPersona(new Persona(nombre, dni));

                    System.out.println("Persona agregada correctamente.");
                    break;

                case 2:
                    listaDePersonas.listarPersonas();
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción incorrecta. Solo se pueden usar las opciones 1 y 2.");
            }

        } while (opcion != 3);

        scanner.close();
    }
}

class PenelDeControl{

    public void mostrarMenu(){
        System.out.println("1) Listar Personas");
        System.out.println("2) Agregar Persona");
        System.out.println("3) Eliminar Persona");
        System.out.println("4) Editar Persona");
        System.out.println("5) Buscar Persona");
        System.out.println("6) Salir");
    }

}

class Agenda{

    Persona [] personas;

    public Agenda(){
        this.personas = new Persona[0];
    }

    public void listarPersonas() {
        System.out.println("Listado de Personas");
        int indice = 1;
        for (Persona persona : personas) {
            System.out.println(indice + ") " + persona);
            indice++;
        }
    }

    public void agregarPersona(Persona persona) {

        Persona[] nuevaLista = new Persona[personas.length + 1];

        nuevaLista[nuevaLista.length - 1] = persona;
        System.arraycopy(personas, 0, nuevaLista, 0, personas.length);

        personas = nuevaLista;

    }

    public void eliminarPersona(int indice){
        Persona [] nuevaLista = new Persona[personas.length - 1];
        System.arraycopy(personas, 0, nuevaLista, 0, indice);
        System.arraycopy(personas, indice + 1, nuevaLista, indice, nuevaLista.length - indice);

        personas = nuevaLista;
    }

    public void editarPersona(int indice, String nuevaPersona, int nuevoDni) {
        personas[indice] = new Persona(nuevaPersona, nuevoDni);
    }

    public int verIndice(Persona nombreBuscado) {
        int indice = 0;
        for (Persona persona : personas) {
            if(persona.equals(nombreBuscado)) {
                return indice;
            }
            indice++;
        }
        return -1;
    }

    public boolean eliminarPersona(String nombreBuscado) {
        for(Persona persona : personas) {
            if(persona.nombre.equals(nombreBuscado)) {
                eliminarPersona(verIndice(persona));
                return true;
            }
        }
        return false;
    }

}

class Persona {
    String nombre;
    int dni;

    public Persona(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return this.nombre + " (" + dni + ")";
    }
}