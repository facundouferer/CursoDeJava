package CursoJava.Herencia;

public class Fabrica {
    public static void main(String[] args) {
       Empleado empleada = new Empleado("Ana", "Lopez");
       Jefe jefa = new Jefe("Maria", "Lopez", "Sistemas");
       System.out.println(jefa.getNombre());
    }
}

class Empleado{
    private String nombre;
    private String apellido;
    public Empleado(String nombre, String apellido){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

}

class Jefe extends Empleado{
    private String departamento;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String getNombre() {
        return "Jefe: " + super.getNombre();
    }

    public Jefe(String nombre, String apellido, String departamento){
        super(nombre, apellido);
        this.departamento = departamento;
    }
}

class Secretarie extends Jefe{
    private String despacho;

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }

    public Secretarie(String nombre, String apellido, String despacho, String fax){
        super(nombre, apellido, despacho);
        this.despacho = despacho;
    }

    public String toString(){
        return super.getApellido();
    }
}
