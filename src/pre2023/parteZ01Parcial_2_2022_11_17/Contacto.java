package pre2023.parteZ01Parcial_2_2022_11_17;

public class Contacto extends Persona {


    public Contacto(String nombre, String apellido, int dni, String telefono, String email) {
        super(nombre, apellido, dni, telefono, email);
    }

    public String getNombre() {
        return super.getNombre();
    }

    public String getApellido() {
        return super.getApellido();
    }

    public int getDni() {
        return super.getDni();
    }

    public String toString() {
        return "Nombre: " + super.getNombre() + ", Apellido: " + super.getApellido() + " DNI: " + super.getDni() + ", Telefono: " + super.getTelefono() + ", Email: " + super.getEmail();
    }
}
