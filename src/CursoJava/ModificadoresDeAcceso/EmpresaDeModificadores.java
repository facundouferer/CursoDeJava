package CursoJava.ModificadoresDeAcceso;

public class EmpresaDeModificadores {
    public static void main(String[] args) {

        Empleado empleado = new Empleado(500000);
        empleado.setSueldo(500000);

    }
}

class Empleado{
     private double sueldo;

        public Empleado(double sueldo){
            this.sueldo = sueldo;
        }

        public double getSueldo(){
            return this.sueldo;
        }

     public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
