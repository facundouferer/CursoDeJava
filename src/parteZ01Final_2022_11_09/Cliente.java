package parteZ01Final_2022_11_09;

import java.io.Serializable;
import java.util.ArrayList;

public class Cliente extends Persona implements Informe, Serializable {

    /**
     * 1) El cliente debe tener los siguientes campos:
     * Activos (Lista de activos del cliente)
     * **/
    //colections of Activos
    private ArrayList<Activo> activos;

    public Cliente(String nombre, String apellido, String direccion, int dni) {
        super(nombre, apellido, direccion, dni);
        this.activos = new ArrayList<>();
    }

    //add Activo to the colection
    public void addActivo(Activo activo){
        this.activos.add(activo);
    }

    //search activos by name
    public Activo getActivo(String nombre){
        for (Activo activo : activos) {
            if(activo.getNombre().equals(nombre)){
                return activo;
            }
        }
        return null;
    }

    @Override
    public String imprimirInformacion() {
        return "Cliente{" +
                "Nombre: " + super.getNombre() +
                ", Apellido: " + super.getApellido() +
                ", Direccion: " + super.getDireccion() +
                ", DNI: " + super.getDni() +
                ", Activos: " + this.activos +
                '}';
    }
}
