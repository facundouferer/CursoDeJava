package viejes.parteZ01Final_2022_02_16;

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

    @Override
    public String toString() {
        return nombre;
    }
}
