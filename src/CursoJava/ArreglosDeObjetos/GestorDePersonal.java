package CursoJava.ArreglosDeObjetos;

 class GestorDePersonal {

    public static void main(String[] args) {
        // Crear un arreglo de objetos de tipo Persona

        Agenda listaDePersonas = new Agenda();

        listaDePersonas.agregarPersona(new Persona("Carlitos", 12345678));
        listaDePersonas.agregarPersona(new Persona("Maria", 23456721));
        listaDePersonas.agregarPersona(new Persona("Juana", 23456789));

        listaDePersonas.listarPersonas();
        listaDePersonas.eliminarPersona("Carlitos");
        listaDePersonas.listarPersonas();
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

