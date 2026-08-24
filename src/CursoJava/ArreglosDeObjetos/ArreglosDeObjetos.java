package CursoJava.ArreglosDeObjetos;

 class ArreglosDeObjetos {

    public static void main(String[] args) {
        // Crear un arreglo de objetos de tipo Persona

        String [] personas = new String[5];

        personas[0] = "Carlos";
        personas[1] = "Ana";
        personas[2] = "Luis";
        personas[3] = "María";
        personas[4] = "Pedro";

        System.out.println("\nLista de personas:");
        Agenda listaDePersonas = new Agenda(personas);
        listaDePersonas.listarPersonas();

        System.out.println("\nDespués de agregar a Lucía:");
        listaDePersonas.agregarPersona("Lucía");
        listaDePersonas.listarPersonas();

        System.out.println("\nDespués de eliminar:");
        listaDePersonas.eliminarPersona(2);
        listaDePersonas.listarPersonas();

        System.out.println("\nBuscar Elemento:");

        if(listaDePersonas.verIndice("San Sebastian") != -1) {
            System.out.println("Indice: " + listaDePersonas.verIndice("San Sebastian"));
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

class Agenda{

    String [] personas;
    
    public Agenda(String[] personas){
        this.personas = personas;
    }

    public void listarPersonas() {
        int indice = 0;
        for (String persona : personas) {
            System.out.println(indice + ") " + persona);
            indice++;
        }
    }

    public void agregarPersona(String persona) {

        String[] nuevaLista = new String[personas.length + 1];

        nuevaLista[nuevaLista.length - 1] = persona;
        System.arraycopy(personas, 0, nuevaLista, 0, personas.length);

        personas = nuevaLista;

    }

 public void eliminarPersona(int indice){
    String [] nuevaLista = new String[personas.length - 1];

    // se copia los elementos antes del índice
    System.arraycopy(personas, 0, nuevaLista, 0, indice); 
    // se copia los elementos después del índice a la nueva lista
    System.arraycopy(personas, indice + 1, nuevaLista, indice, nuevaLista.length - indice);

    personas = nuevaLista;
 }

 public void editarPersona(int indice, String nuevaPersona){
    personas[indice] = nuevaPersona;
 }

  public int verIndice(String nombreBuscado) {
        int indice = 0;
        for (String persona : personas) {
            if(persona.equals(nombreBuscado)) {
                return indice;
            }
            indice++;
        }
        return -1;
    }

    public boolean eliminarPersona(String nombreBuscado) {
        int indice = verIndice(nombreBuscado);
        if(indice != -1) {
            eliminarPersona(indice);
            return true;
        }
        return false;
    }

}


