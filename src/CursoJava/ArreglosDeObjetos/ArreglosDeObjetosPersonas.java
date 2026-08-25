package CursoJava.ArreglosDeObjetos;

 class ArreglosDeObjetosPersonas {

    public static void main(String[] args) {
        // Crear un arreglo de objetos de tipo Persona

        Persona [] personas = new Persona[5];

        personas[0] = new Persona("Carlos", 12345678);
        personas[1] = new Persona("Ana", 87654321);
        personas[2] = new Persona("Luis", 11223344);
        personas[3] = new Persona("María", 44332211);
        personas[4] = new Persona("Pedro", 55667788);

        System.out.println("\nLista de personas:");
        Agenda listaDePersonas = new Agenda(personas);
        listaDePersonas.listarPersonas();

        listaDePersonas.editarPersona(4,"Carilos Kapo", 123455);

        System.out.println("\nDespués de agregar a Lucía:");
        listaDePersonas.agregarPersona(new Persona("Lucía", 99887766));
        listaDePersonas.listarPersonas();

        System.out.println("\nDespués de eliminar:");
        listaDePersonas.eliminarPersona(2);
        listaDePersonas.listarPersonas();

        System.out.println("\nBuscar Elemento:");

        if(listaDePersonas.verIndice(new Persona("San Sebastian", 0)) != -1) {
            System.out.println("Indice: " + listaDePersonas.verIndice(new Persona("San Sebastian", 0)));
        } else {
            System.out.println("El elemento no se encuentra en la lista.");
        }

        System.out.println("\nEliminar una Persona por nombre:");
        if(listaDePersonas.eliminarPersona("Ana")) {
            listaDePersonas.listarPersonas();
        } else {
            System.out.println("La persona no se encuentra en la lista.");  
        }

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

class Agenda{

    Persona [] personas;
    
    public Agenda(Persona[] personas){
        this.personas = personas;
    }

    public void listarPersonas() {
        int indice = 0;
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


