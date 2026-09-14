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
