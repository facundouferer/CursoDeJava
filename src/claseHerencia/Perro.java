package claseHerencia;

public class Perro extends Animal implements ParaPerro {
    String raza;
    Perro(String nombre, int edad, String raza) {
        super(nombre, edad);
        this.raza = raza;
    }

    @Override
    public void ladrar() {
        System.out.println("El perro está ladrando");
    }
}
