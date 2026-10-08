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
    if(goles < 0){
        this.goles = 0;
    }else{
        this.goles = goles;
    }
}

public String getNombre(){
    return "Nombre: " +this.nombre;
}

public int getDorsal(){
    return this.dorsal;
}

public String getDorsalString(){
    return "Dorsal: " +this.dorsal;
}

public int getGoles(){
    return this.goles;
}

public String getGolesString(){
    return "Goles: " + this.goles;
}

}
