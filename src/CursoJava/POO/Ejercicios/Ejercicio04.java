package Ejercicios;

/**Ejercicio 4:
 Crear una clase Vector, que en su constructor reciba una lista de elementos que ser�n sus
 coordenadas. En el m�todo toString() se imprime su contenido con el formato [x,y,z].
 1. Crear un m�todo que reciba un n�mero y devuelva un nuevo vector (objeto de la clase
 Vector), con los elementos multiplicados por ese n�mero.
 2. Crear un m�todo sumar que recibe otro vector, verifica si tienen la misma cantidad de
 elementos y devuelve un nuevo vector con la suma de ambos. Si no tienen la misma
 cantidad de elementos entonces imprimir un mensaje de error y la funci�n debe retornar
 el vector que se pas� como par�metro.*/

import java.util.ArrayList;
import java.util.List;

public class Ejercicio04 {

    public static void main(String[] args) {

        // Creamos dos objetos de la clase Vector
        List<Double> coordenadas1 = new ArrayList<Double>();
        coordenadas1.add(2.0);
        coordenadas1.add(3.0);
        coordenadas1.add(4.0);
        Vector vector1 = new Vector(coordenadas1);

        List<Double> coordenadas2 = new ArrayList<Double>();
        coordenadas2.add(1.0);
        coordenadas2.add(2.0);
        coordenadas2.add(3.0);
        Vector vector2 = new Vector(coordenadas2);

        // Imprimimos los vectores
        System.out.println("Vector 1: " + vector1.toString());
        System.out.println("Vector 2: " + vector2.toString());

        // Multiplicamos el vector 1 por un n�mero
        Vector resultadoMultiplicacion = vector1.multiplicar(2.0);
        System.out.println("Resultado de la multiplicaci�n: " + resultadoMultiplicacion.toString());

        // Sumamos los vectores
        Vector resultadoSuma = vector1.sumar(vector2);
        if (resultadoSuma == null) {
            System.out.println("No se pueden sumar los vectores porque tienen distinta cantidad de elementos.");
        } else {
            System.out.println("Resultado de la suma: " + resultadoSuma.toString());
        }
    }
}

class Vector {

    // Atributos
    private List<Double> coordenadas;

    // Constructor
    public Vector(List<Double> coordenadas) {
        this.coordenadas = coordenadas;
    }

    // M�todo toString
    public String toString() {
        return coordenadas.toString();
    }

    // M�todo para multiplicar el vector por un n�mero
    public Vector multiplicar(double numero) {
        List<Double> nuevasCoordenadas = new ArrayList<Double>();
        for (double coordenada : coordenadas) {
            nuevasCoordenadas.add(coordenada * numero);
        }
        return new Vector(nuevasCoordenadas);
    }

    // M�todo para sumar dos vectores
    public Vector sumar(Vector otroVector) {
        List<Double> otrasCoordenadas = otroVector.coordenadas;
        if (coordenadas.size() != otrasCoordenadas.size()) {
            return null;
        } else {
            List<Double> nuevasCoordenadas = new ArrayList<Double>();
            for (int i = 0; i < coordenadas.size(); i++) {
                double nuevaCoordenada = coordenadas.get(i) + otrasCoordenadas.get(i);
                nuevasCoordenadas.add(nuevaCoordenada);
            }
            return new Vector(nuevasCoordenadas);
        }
    }
}
