package parteYpracticaNro10Facultad;

import java.util.LinkedList;

class Facultad {
    private String nombre;
    private LinkedList<Carrera>coleccionCarrera;

    public void agregarCarrera(Carrera carreraNueva){
        coleccionCarrera.add(carreraNueva);
    }

    public boolean eliminarCarrera(String nombreCarrera){
        boolean encontro = false;
        for(Carrera carrera: coleccionCarrera){
            if(carrera.getNombre().equals(nombreCarrera)){
                coleccionCarrera.remove(carrera);
                encontro = true;
            }
        }
        return encontro;
    }

}
