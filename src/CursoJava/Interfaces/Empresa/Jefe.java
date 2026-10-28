package CursoJava.Interfaces.Empresa;

class Jefe extends Empleado implements ParaJefes {
    
     public String tomarDecisiones(String decision){
        return "Decisión aprobada por el jefe: " + decision;
     }

    public static String tomarDecisiones() {
        String decision = "Decisión postergada hasta la próxima reunión de equipo.";
        return decision;
    }

}
