package CursoJava.interfazFuncional;

public class Principal {
    public static void main(String []args){
        MiInterfazFuncional miLambda = () -> System.out.println("Hola desde la expresión lambda");
        miLambda.miMetodoAbstracto();
    }
}

@FunctionalInterface
interface MiInterfazFuncional {
    void miMetodoAbstracto();
   //Intentar agregar otro método abstracto y ver que pasa
}
