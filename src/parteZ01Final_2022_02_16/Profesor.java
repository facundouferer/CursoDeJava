package parteZ01Final_2022_02_16;

class Profesor extends Persona {

    public Profesor(String nombre, String Apellido, int legajo) {
        super.setNombre(nombre);
        super.setApellido(Apellido);
        super.setLegajo(legajo);
    }

    @Override
    public String toString() {
        return "Profesor: "+super.toString();
    }

    @Override
    public void modificarDatos(String nombre, String Apellido, String legajo) {
        super.setNombre(nombre);
        super.setApellido(Apellido);
        try{
            super.setLegajo(Integer.parseInt(legajo));
        }catch (Exception e){
            System.out.println("ERROR: Eso no parece ser un número de legajo.");
        }

    }


}

