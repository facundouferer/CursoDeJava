package CursoJava.Interfaces.Empresa;

// clase Empleado
class Empleado extends Persona {
    // implementa el metodo abstracto de la clase Persona
    @Override
    public void hablar(){
      System.out.println("Hola, soy empleado de la empresa.");
    }
}
