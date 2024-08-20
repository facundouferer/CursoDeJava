package CursoJava.ClasesAbstractas;

class Veterinaria {
    // declare hola mundo
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.tipoDeAnimal();
        gato.emitirSonido();
    }
}

abstract class Mascota {
    private String nombre;

    public Mascota(String nombre) {
        this.nombre = nombre;
    }

    public abstract void tipoDeAnimal();

    public abstract void emitirSonido();

    public String getNombre() {
        return nombre;
    }
}

class Gato extends Mascota {

    public Gato() {
        super("Gato");
    }

    @Override
    public void tipoDeAnimal() {
        System.out.println("Soy un gato");
    }

    @Override
    public void emitirSonido() {
        System.out.println("miau, miau, miau");
    }
}
