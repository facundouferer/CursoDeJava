package parteZ01Final_2022_02_23;

abstract class Persona {
    private String nombre, apellido;
    private int dni;
    private double sueldoBasico;

    Persona(String nombre, String apellido, int dni, double sueldo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.sueldoBasico = sueldo;
        System.out.println("Se ha creado una persona: " + nombre + " " + apellido + " " + dni + " " + sueldo);
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public String modificarDatos(String nombre, String apellido, int dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        return "Se ha modificado los datos de la persona: " + this.nombre + " " + this.apellido + " " + this.dni;
    }

    abstract void subirSueldo(double incremento);
    abstract double verSueldo();


    public String getNombre() {
        return this.nombre;
    }

    public String toString(){
        return "Nombre: " + this.nombre + " Apellido: " + this.apellido + " DNI: " + this.dni + " Sueldo: " + this.sueldoBasico;
    }

    public int getDni() {
        return this.dni;
    }
}
