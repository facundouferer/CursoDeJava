package CursoJava.l10_herencia_polimorfismo_y_sobrecarga.ej01_empleados;

/*
 * Lección 10 – Herencia, polimorfismo y sobrecarga
 * Objetivo: mostrar la descripción y el sueldo de una nómina de empleados tratados de forma uniforme.
 * Concepto: 5. Polimorfismo y despacho dinámico.
 */
public class Main {

    public static void main(String[] args) {
        Empleado[] nomina = {
            new Empleado("Juan", 30, 50000),
            new Jefe("María", 45, 50000, "Sistemas"),
            new Secretaria("Ana", 28, 40000, "Despacho 3")
        };

        for (Empleado empleado : nomina) {
            System.out.println(empleado.getNombre() + " - " + empleado.descripcion());
        }
    }
}
