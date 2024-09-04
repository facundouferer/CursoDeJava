package CursoJava.Interfaces;

public class Empresa {
    public static void main(String[] args) {
        Jefe empleado = new Jefe();
        System.out.println(empleado.tomarDecisiones());
    }
}

abstract class Persona {
    // declara un metodo abstracto
    public abstract void hablar();
}

// declara una interface ParaJefes
interface ParaJefes {
    // declara un metodo abstracto
    public abstract String tomarDecisiones(String decision);

    public static String tomarDecisiones() {
        return "tomar decisiones interface: ";
    }
}

// clase Empleado
class Empleado extends Persona {
    // implementa el metodo abstracto de la interface ParaJefes

    @Override
    public void hablar() {
        // TODO Auto-generated method stub
        System.out.println("hablar'");
    }
}

// clase Jefe que implemente la interface ParaJefes y hereda de la clase
// Empleado
class Jefe extends Empleado implements ParaJefes {
    // declara un metodo
    public String tomarDecisiones(String decision) {
        return "Un miembro de la direccion ha tomado la decision de: " + decision;
    }

    public static String tomarDecisiones() {
        String decision = "tomar decisiones jefe: ";
        return decision;
    }

}
