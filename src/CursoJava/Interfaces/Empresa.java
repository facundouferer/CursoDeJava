package CursoJava.Interfaces;

public class Empresa {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
    }
}

// declara una interface ParaJefes
interface ParaJefes {
    // declara un metodo abstracto
    public abstract String tomarDecisiones(String decision);
}

//clase Empleado
class Empleado implements ParaJefes {
    // implementa el metodo abstracto de la interface ParaJefes
    @Override
    public String tomarDecisiones(String decision) {
        return "Un miembro de la direccion ha tomado la decision de: " + decision;
    }
}

//clase Jefe que implemente la interface ParaJefes y hereda de la clase Empleado
class Jefe extends Empleado implements ParaJefes {
    // declara un metodo
    public String tomarDecisiones(String decision) {
        return "Un miembro de la direccion ha tomado la decision de: " + decision;
    }
}


