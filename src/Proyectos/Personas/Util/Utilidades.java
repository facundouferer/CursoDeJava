package Proyectos.Personas.Util;

 public final class Utilidades {

    public static String caracteristica(String telefono) {
        String prefijo = "+549";
        return prefijo + telefono;
    }

    public static void mostrarMenu(){
        System.out.println("1) Listar Personas");
        System.out.println("2) Agregar Persona");
        System.out.println("3) Eliminar Persona");
        System.out.println("4) Editar Persona");
        System.out.println("5) Buscar Persona");
        System.out.println("6) Salir");
    }
    public void editarPersona(int indice, String nuevaPersona, int nuevoDni, string nuevotelefono) {
        personas[indice] = new Persona(nuevaPersona, nuevoDni, nuevotelefono);
    }
}

