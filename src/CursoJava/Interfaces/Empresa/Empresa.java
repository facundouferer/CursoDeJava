package CursoJava.Interfaces.Empresa;

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
    public void hablar(){
      System.out.println("Empleado");
    }
}

// clase Jefe que implemente la interface ParaJefes y hereda de la clase
// Empleado
class Jefe extends Empleado implements ParaJefes {
    
     public String tomarDecisiones(String decision){
        return "tomar decisiones jefe: " + decision;
     }

    public static String tomarDecisiones() {
        String decision = "tomar decisiones jefe: ";
        return decision;
    }

}
