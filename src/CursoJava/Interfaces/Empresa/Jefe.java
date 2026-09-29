package CursoJava.Interfaces.Empresa;

class Jefe extends Empleado implements ParaJefes {
    
     public String tomarDecisiones(String decision){
        return "tomar decisiones jefe: " + decision;
     }

    public static String tomarDecisiones() {
        String decision = "tomar decisiones jefe: ";
        return decision;
    }

}
