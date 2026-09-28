package CursoJava.ArraydeObjetos.PlantelDeportivo;

class Jugador {
private final String nombre;
private final int dorsal;
private int goles;

public Jugador(String nombre, int dorsal, int goles){

    if(nombre == null || nombre.equals("")){
        this.nombre = "Sin nombre";
        System.out.println("El jugador quedó sin nombre");
    } else {
        this.nombre = nombre;
    }
    if(dorsal <= 0){
        this.dorsal = 99;
        System.out.println("El dorsal es 99");
    } else {
        this.dorsal = dorsal;
    }
    this.goles = goles;
}

public String getNombre(){
    return this.nombre;
}

public int getDorsal(){
    return this.dorsal;
}

public int getGoles(){
    return this.goles;
}

}
