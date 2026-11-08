package CursoJava.l07_fundamentos_poo_clases_y_objetos.ej08_vector;

import java.util.ArrayList;
import java.util.List;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Representar un vector de coordenadas con operaciones de producto por un escalar y suma.
 * Concepto: 3. Ejemplo práctico: modelando una clase (métodos que devuelven nuevos objetos).
 */
public class Vector {

    private final List<Double> coordenadas;

    public Vector(List<Double> coordenadas) {
        this.coordenadas = coordenadas;
    }

    public Vector multiplicar(double numero) {
        List<Double> nuevasCoordenadas = new ArrayList<>();
        for (double coordenada : coordenadas) {
            nuevasCoordenadas.add(coordenada * numero);
        }
        return new Vector(nuevasCoordenadas);
    }

    // Si los vectores tienen distinta cantidad de elementos, informa el error y devuelve el vector recibido.
    public Vector sumar(Vector otro) {
        if (coordenadas.size() != otro.coordenadas.size()) {
            System.out.println("No se pueden sumar los vectores porque tienen distinta cantidad de elementos.");
            return otro;
        }
        List<Double> nuevasCoordenadas = new ArrayList<>();
        for (int i = 0; i < coordenadas.size(); i++) {
            nuevasCoordenadas.add(coordenadas.get(i) + otro.coordenadas.get(i));
        }
        return new Vector(nuevasCoordenadas);
    }

    @Override
    public String toString() {
        return coordenadas.toString();
    }
}
