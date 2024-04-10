package viejes.parteB01POO;

import java.util.Arrays;

public class ej01Vehiculo {
    public static void main(String[] args) {

        // INSTANCIAR UN OBJETO
        Vehiculo auto = new Vehiculo("rojo", 4, 9, 2, 70);
        System.out.println(auto.getColor());

        // CLASE CON HERENCIA
        Moto zanella = new Moto("negro", 9, 2, 70);
        System.out.println(zanella.toString());

        // COLECCI�N DE OBJETOS
        Vehiculo estacionamiento[] = {
                new Vehiculo("rojo", 4, 9, 2, 70),
                new Vehiculo("verde", 4, 9, 1, 12),
                new Vehiculo("negro", 4, 9, 3, 15)
        };

        // RECORRIDO DE UNA COLECCI�N DE OBJETOS Y LISTARLOS

        for (Vehiculo vehiculo : estacionamiento) {
            System.out.println(vehiculo.toString());
        }

        // UNA CLASE QUE CONTIENE CLASES

        Concesionaria concesionaria = new Concesionaria(estacionamiento);

        System.out.println("LISTA DE AUTOS");
        System.out.println(concesionaria.toString());

    }
}

class Vehiculo {

    /**
     * El modificador private evita el acceso al atributo (variable)
     * desde fuera de la clase por lo que se dice que est�
     * ENCAPSULADA.
     */
    private String color;
    private int cantRuedas;
    private double ancho, largo, peso;

    public Vehiculo() {
        /**
         * this.etc se refiere al atributo
         * de la clase
         */
        this.color = "sin color";
        this.cantRuedas = 4;
        this.ancho = 1.5;
        this.largo = 2;
        this.peso = 500;
    }

    public Vehiculo(String color, int cantRuedas, double ancho, double largo, double peso) {
        this.color = color;
        this.cantRuedas = cantRuedas;
        this.ancho = ancho;
        this.largo = largo;
        this.peso = peso;
    }

    /**
     * reotornan un valor
     * 
     * @return
     */
    public String getColor() {
        return color;
    }

    public void setColor(String colorEntrada) {
        this.color = colorEntrada;
    }

    @Override
    /**
     * Todas las clases tienen el m�todo toString() porque lo heredan
     * de la clase Objetc, por lo que al hacer esto lo estamos
     * SOBRESCRIBIENDO, que significa que el objeto base de esta clase
     * tambi�n tiene definido �ste m�todo.
     */
    public String toString() {
        return "Vehiculo{" +
                "color='" + color + '\'' +
                ", cantRuedas=" + cantRuedas +
                ", ancho=" + ancho +
                ", largo=" + largo +
                ", peso=" + peso +
                '}';
    }

}

/**
 * extends indica la HERENCIA
 */
class Moto extends Vehiculo {

    public Moto(String color, double ancho, double largo, double peso) {
        super(color, 2, ancho, largo, peso);
    }
}

class Concesionaria {
    private Vehiculo coleccionDeVehiculos[];

    public Concesionaria(Vehiculo estacionamiento[]) {
        this.coleccionDeVehiculos = estacionamiento;
    }

    @Override
    public String toString() {
        return "Concesionaria{" +
                "coleccionDeVehiculos=" + Arrays.toString(coleccionDeVehiculos) +
                '}';
    }
}
