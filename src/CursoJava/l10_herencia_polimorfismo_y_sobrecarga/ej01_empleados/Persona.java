package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.ej01_empleados;

/*
 * Lección 10 – Herencia, polimorfismo y sobrecarga
 * Objetivo: representar a una persona con nombre y edad, base de la jerarquía de empleados.
 * Concepto: 1. Herencia: extends y la prueba del "es un".
 */
class Persona {

    private final String nombre;
    private final int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String descripcion() {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}
