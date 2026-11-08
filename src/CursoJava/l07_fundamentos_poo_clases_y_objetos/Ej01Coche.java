package CursoJava.l07_fundamentos_poo_clases_y_objetos;

/*
 * Lección 07 – Fundamentos de POO: clases y objetos
 * Objetivo: Definir una clase Coche con sus atributos y crear un objeto con el operador new.
 * Concepto: 1. Clase vs. objeto y 2. El operador new.
 */
public class Ej01Coche {

    private final String marca;
    private final String modelo;
    private final int anio;

    public Ej01Coche(String marca, String modelo, int anio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    public void verAtributos() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo + ", Año: " + anio);
    }

    public static void main(String[] args) {
        Ej01Coche coche = new Ej01Coche("Toyota", "Corolla", 2020);
        coche.verAtributos();
    }
}
