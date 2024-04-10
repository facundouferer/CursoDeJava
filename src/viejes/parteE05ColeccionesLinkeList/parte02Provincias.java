package viejes.parteE05ColeccionesLinkeList;

import java.util.LinkedList;
import java.util.ListIterator;

class parte02Provincias {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        /*
         * Mezclar dos listas de forma intercalada
         */

        LinkedList<String> provincias = new LinkedList<>();

        provincias.add("Chaco");
        provincias.add("Chubut");
        provincias.add("Corriente");
        provincias.add("Formosa");

        LinkedList<String> capitales = new LinkedList<>();

        capitales.add("Resistencia");
        capitales.add("Rawson");
        capitales.add("Corrientes Cpital");
        capitales.add("Formosa Capital");

        System.out.println("LAS DOS LISTAS");

        System.out.println(provincias);
        System.out.println(capitales);

        /*
         * Es necesario un iterador por lista
         */

        ListIterator<String> iteradorProvincias = provincias.listIterator();
        ListIterator<String> iteradorCapitales = capitales.listIterator();

        /*
         * Recorrer con un While que recorra y para si esta vac�a la lista con
         * hashNext() definimos que mientras existan elementos en el iterador de
         * Capitales, seguir� recorriendo
         */

        while (iteradorCapitales.hasNext()) {

            if (iteradorProvincias.hasNext())
                iteradorProvincias.next();// para que salte una posici�n
            iteradorProvincias.add(iteradorCapitales.next());
        }

        /*
         * ahora la lista provincia stiene tambi�n las capitales.
         */

        System.out.println("\nLA LISTA PROVINCIAS INTERCALADA CON LA LISTA CAPITALES");

        System.out.println(provincias);

        /*
         * BORRAR LOS LUGARES PARES DE LA LISTA PROVINCIAS para usar el mismo iterador
         * debemos reiniciarlos con una asignaci�n
         */

        iteradorProvincias = provincias.listIterator();

        while (iteradorProvincias.hasNext()) {

            iteradorProvincias.next();
            if (iteradorProvincias.hasNext()) {// preguntamos si hay mas elementos adelante, seguimos
                iteradorProvincias.next(); // pasamos uno m�s porque queremos elimianr las posiciones pares
                iteradorProvincias.remove();
            }
        }

        /*
         * Si volvemos a imprimir la lista podremos ver que s�lo
         * est�n las provnicas porque las capitales
         * estaban en las posiciones pares.
         */

        System.out.println("\nLE SACAMOS LAS CAPITALES");

        System.out.println(provincias);

    }

}
