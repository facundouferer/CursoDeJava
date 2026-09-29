package CursoJava.Interfaces.Empresa;

// clase Empleado
class Empleado extends Persona {
    // implementa el metodo abstracto de la interface ParaJefes
    @Override
    public void hablar(){
      System.out.println("Empleado");
    }
}
