package viejes.parteA01Introduccion;

public class Ej05TratamientoDeStrings {
    public static void main(String[] args) {
        String nombre = "Facundo";
        String otroNombre = "facundo";
        System.out.println(nombre.length()); // cantidad de letras
        System.out.println(nombre.charAt(0)); // nos devuelve el caracter del �ndice que indiquemos
        System.out.println(nombre.substring(1, 4)); // devuelve un sub string indicando el indice y la cant de
                                                    // caracteres
        System.out.println(nombre.equals(otroNombre)); // Compara 2 cadenas
        System.out.println(nombre.equalsIgnoreCase(otroNombre)); // Compara 2 cadenas pero ignora las mayusculas o
                                                                 // minusculas

    }
}
