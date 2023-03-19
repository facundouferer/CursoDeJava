package claseHerencia;

public class Animal {
    private String nombre;
    private int edad;


    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void comer() {
        System.out.println("El animal está comiendo");
    }

    public void dormir() {
        System.out.println("El animal está durmiendo");
    }

    public void hacerRuido() {
        System.out.println("El animal está haciendo ruido");
    }
}
