package CursoJava.ClasesAbstractas;

public class Veterinaria {
    //declare hola mundo
    public static void main(String[] args) {
        //declare perro

        //declare
    }
}

abstract class Mascota {
    private String nombre;
    public Mascota(String nombre) {
        this.nombre = nombre;
    }
    public abstract void tipoDeAnimal();

    public String getNombre() {
        return nombre;
    }
}

class Gato extends Mascota{

    @Override
    public void tipoDeAnimal() {

    }
}
