package CursoJava.ClasesAbstractas;

public class Veterinaria {
    //declare hola mundo
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.tipoDeAnimal();
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

    public Gato() {
        super("Gato");
    }

    @Override
    public void tipoDeAnimal() {
        System.out.println("Soy un gato");
    }
}
