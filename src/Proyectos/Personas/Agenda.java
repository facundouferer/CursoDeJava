package Proyectos.Personas;

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
    public boolean editarPersona(String nombreBuscado, String nuevoNombre, int nuevoDni) {
        for (int indice = 0; indice < personas.length; indice++) {
            if (personas[indice].nombre.equals(nombreBuscado)) {
                String telefono = personas[indice].getTelefono();
                personas[indice] = new Persona(nuevoNombre, nuevoDni, telefono);
                return true;
            }
        }
        return false;
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

    public void buscarPersona(String nombre) {
    boolean encontrada = false;

    for (Persona persona : lista) { // Reemplaza 'lista' por el nombre de tu ArrayList
        if (persona.getNombre().equalsIgnoreCase(nombre)) {
            System.out.println("\n--- Persona Encontrada ---");
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("DNI: " + persona.getDni());
            System.out.println("Teléfono: " + persona.getTelefono());
            encontrada = true;
            break; // Salir si solo buscas la primera coincidencia
        }
    }

    if (!encontrada) {
        System.out.println("No se encontró ninguna persona con el nombre: " + nombre);
    }
}

}
