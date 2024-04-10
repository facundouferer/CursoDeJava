package viejes.parteZ01Final_2022_02_16;

import java.util.LinkedList;

class Facultad {
    private String nombre;
    private LinkedList<Carrera> coleccionCarrera;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.coleccionCarrera = new LinkedList<Carrera>();
    }

    public void agregarCarrera(Carrera carreraNueva) {
        coleccionCarrera.add(carreraNueva);
    }

    public void mostrarCarreras() {
        System.out.println("CARRERAS DE " + this.nombre);
        for (Carrera carrera : coleccionCarrera) {
            System.out.println("-" + carrera.toString());
        }
    }

    public boolean eliminarCarrera(String nombreCarrera) {
        boolean encontro = false;
        for (Carrera carrera : coleccionCarrera) {
            if (carrera.getNombre().equals(nombreCarrera)) {
                coleccionCarrera.remove(carrera);
                encontro = true;
                break;
            }
        }
        return encontro;
    }

}
