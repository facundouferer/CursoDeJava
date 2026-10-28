package CursoJava.Interfaces.Empresa;

// declara una interface ParaJefes
interface ParaJefes {
    // declara un metodo abstracto
    public abstract String tomarDecisiones(String decision);

    public static String tomarDecisiones() {
        return "Decisión postergada: falta información para resolver.";
    }

}
