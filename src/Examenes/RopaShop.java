/*
EXAMEN PARCIAL PROGRAMACIÓN I - RODRIGUEZ ALEJANDRO NAHUEL - LEGAJO: 28253
FECHA: 09/06/2023

*   Implemente un arreglo llamado "inventario" que contenga los nombres
    de cada prenda disponible en el negocio. Se espera que el programa
    tenga por lo menos unas 5 prendas ya cargadas al iniciar el programa. (1 punto)

*   Implemente un método llamado "agregarPrenda" que reciba como parámetro
    el nombre de la prenda, la agregue al inventario y luego muestre
    el inventario resultante de ésta acción. (2 puntos)

*   Implemente un método llamado "buscarPrenda" que reciba como
    parámetro el nombre de la prenda y muestre el mensaje
    “prenda existente” si la encuentra en el inventario, o
    “no existe” en caso contrario. (2 puntos)

*   Implemente un método llamado "venderPrenda" que reciba como
    parámetro el nombre de la prenda y si la encuentra la borre del
    inventario, muestre el mensaje “prenda vendida” y luego muestre
    el inventario resultante luego de la venta. En caso de no
    encontrar la prenda en el inventario debe mostrar
    “no existe la prenda”.  (3 puntos)

*   Implemente un método llamado "mostrarInventario" que liste todo
    el inventario y al final de la lista me muestra la cantidad de
    prendas que existen. (2 puntos)
*/
package Examenes;

public class RopaShop {

    //Declaracion del arreglo de tipo String llamado "inventario"
    static String [] inventario = new String[100];

    public static void main(String[] args) {

        //Cargado de cinco prendas
        inventario[0] = "Remera";
        inventario[1] = "Pantalón";
        inventario[2] = "Camisa";
        inventario[3] = "Playera";
        inventario[4] = "Jogging";

        //Agregar una prenda al inventario
        System.out.println("Mostrando el array original");
        mostrarInventario(inventario);
        System.out.println("Agregando una prenda al inventario");
        agregarPrenda("Campera");

        //Buscando una prenda existente en el inventario
        System.out.println("Buscando una prenda existente en el inventario (Campera): ");
        buscarPrenda("Campera");

        //Buscando una prenda NO existente en el inventario
        System.out.println("Buscando una prenda NO existente en el inventario(Zapatilla): ");
        buscarPrenda("Zapatilla");

        //Vendiendo una prenda
        System.out.println("Vendiendo una prenda existente(Remera): ");
        venderPrenda("Remera");

        //Vendiendo una prenda no existente
        System.out.println("Vendiendo una prenda no existente en el inventario (Zapatilla)");
        venderPrenda("Zapatilla");

        //Mostrando el inventario
        System.out.println("Mostrando el inventario");
        mostrarInventario(inventario);

    }

    public static void agregarPrenda(String nombrePrenda){

        //Declaro una variable de tipo entero donde almaceno un índice
        int index = 200;
        //Inicio una búsqueda para encontrar el índice delprimer valor NULL del arreglo
        //y colocar en esa posición la prenda que se pasa como parámetro
        for(int i = 0; i< inventario.length; i++){
            if(inventario[i] == null){
                index = i;
                break;
            }
        }

        if(index != 200) inventario[index] = nombrePrenda;

        mostrarInventario(inventario);

    }

    public static void buscarPrenda(String nombrePrenda){

        //Declaro un boolean que cambiará a true si la prenda es encontrada
        boolean flag = false;

        //Iniciamos la busqueda dentro del arreglo
        for(String prenda : inventario){
            if(nombrePrenda.equals(prenda)){
                flag = true;

                //Si la prenda es encontrada, rompemos el bucle
                break;
            }
        }

        if(flag) System.out.println("prenda existente");
        else System.out.println("no existe");
    }

    public static void venderPrenda(String nombrePrenda){

        boolean flag = false;
        int index = 200;

        for(int i = 0; i<inventario.length; i++){
            if(nombrePrenda.equals(inventario[i])){
                index = i;
                inventario[i] = null;
                flag = true;
                break;
            }
        }

        //Si la prenda fue encontrada y vendida, ordenamos el arreglo
        if(flag){

            System.out.println("prenda vendida");
            ordenarArreglo(inventario);

            mostrarInventario(inventario);
        }
        else System.out.println("No existe la prenda");

    }

    public static void ordenarArreglo(String[] arreglo){

        int indexNull = 200;
        int indexLastItem = 200;
        String lastItem = null;

        int twoNullsInARow = 0;

        for(int i = 0; i<arreglo.length; i++){
            if(arreglo[i] == null){
                indexNull = i;
                break;
            }
        }

        for(int i = 0; i<arreglo.length; i++){
            if(arreglo[i] != null){
                lastItem = arreglo[i];
                indexLastItem = i;
            }
            else{
                twoNullsInARow++;
            }

            if(twoNullsInARow == 2) break;
        }

        if(indexNull != 200)arreglo[indexNull] = lastItem;
        if(indexLastItem != 200) arreglo[indexLastItem] = null;

    }

    public static void mostrarInventario(String[] arreglo){

        int contadorPrendas = 0;
        boolean flagNull = false;

        System.out.println("El inventario queda como sigue:");
        System.out.print("[");
        for(int i = 0; i< arreglo.length; i++){

            if(inventario[i] == null){
                System.out.println("]");
                flagNull = true;
                break;
            }

            if(i != arreglo.length -1){
                System.out.print(arreglo[i] + ", ");
            }
            else{
                System.out.print(arreglo[i]);
            }
            if(arreglo[i] != null) contadorPrendas++;
        }
        if(!flagNull) System.out.println("]");

        System.out.println("Cantidad de prendas en el inventario: " + contadorPrendas);

    }

}
