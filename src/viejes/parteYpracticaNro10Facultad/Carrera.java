package viejes.parteYpracticaNro10Facultad;

import java.util.LinkedList;

class Carrera {
    private String nombre;
    private LinkedList<Materia> coleccionMaterias;

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.coleccionMaterias = new LinkedList<Materia>();
    }

    public void agregarMateria(Materia materia) {
        coleccionMaterias.add(materia);
    }

    public String getNombre() {
        return nombre;
    }

    public boolean eliminarMateria(String nombreMateria) {
        return false;
    }

    public boolean encontrarMateria(String nombreMateria) {
        return false;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
