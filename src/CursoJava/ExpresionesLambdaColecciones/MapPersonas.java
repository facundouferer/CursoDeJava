package CursoJava.ExpresionesLambdaColecciones;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class MapPersonas {

    public static void main(String[] args){

        List<Persona> personas = new ArrayList<>();

        personas.add(new Persona("Jose", "Perez"));
        personas.add(new Persona("Maria", "Gonzalez"));
        personas.add(new Persona("Carlos", "Sanchez"));

        List<String> personasString = personas.stream().map((persona) ->
                persona.getNombre()).collect(Collectors.toList());

        personasString.forEach((persona) -> System.out.println(persona));
    }
}

class Persona{
    private String nombre;
    private String apellido;
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }
}
